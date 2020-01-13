package ro.upt.ac.chiuitter.data.firebase

import android.util.Log
import com.google.firebase.database.*
import ro.upt.ac.chiuitter.data.ChiuitRepository
import ro.upt.ac.chiuitter.domain.Chiuit
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class FirebaseChiuitStore : ChiuitRepository {

    private val database = FirebaseDatabase.getInstance().reference.child("chiuits")

    override suspend fun getAll(): List<Chiuit> = suspendCoroutine { continuation ->
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                database.removeEventListener(this)
                continuation.resumeWithException(p0.toException())
            }

            override fun onDataChange(p0: DataSnapshot) {
                val values = mutableListOf<ChiuitNode>()

                val children = p0.children

                //TODO ("Iterate through the children and get the node value")
                children.forEach {
                    try {
                        val value = it.getValue<ChiuitNode>(ChiuitNode::class.java)
                        if(value != null) {
                            values.add(value)
                        }
                    } catch (e: DatabaseException) {
                        Log.e("FirebaseChiuit.getAll()", e.toString())
                    }

                }
                database.removeEventListener(this)

                continuation.resume(values.map { chiuitNode -> chiuitNode.toDomainModel() })
            }

        })
    }

    override suspend fun addChiuit(chiuit: Chiuit): Unit = suspendCoroutine { continuation ->
        //TODO ("Insert the object into database - don't forget to use the right model")
        database.push().setValue(chiuit.toFirebaseModel())

        //TODO ("Make sure the continuation is called")
        continuation.resume(Unit)
    }

    override suspend fun removeChiuit(chiuit: Chiuit) : Unit = suspendCoroutine { continuation ->
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                database.removeEventListener(this)
                continuation.resumeWithException(p0.toException())
            }

            override fun onDataChange(p0: DataSnapshot) {
                val children = p0.children


               // TODO ("Iterate through the children and find the matching node, then perform removal.")
                for (child in children) {
                    val value = child.getValue<ChiuitNode>(ChiuitNode::class.java)?.toDomainModel()
                    if(chiuit.equals(value)) {
                        child.ref.setValue(null)
                    }
                }

                database.removeEventListener(this)

               // TODO ("Make sure the continuation is called")
                continuation.resume(Unit)
            }

        })
    }

    fun Chiuit.toFirebaseModel(): ChiuitNode {
        return ChiuitNode(timestamp, description)
    }

    fun ChiuitNode.toDomainModel(): Chiuit {
        return Chiuit(timestamp, description)
    }

}