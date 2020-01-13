package ro.upt.ac.chiuitter.data.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.Delete


@Dao
interface ChiuitDao {

    @Query("SELECT * FROM chiuits")
    fun getAll(): List<ChiuitEntity>


    // TODO("Define insert")
    @Insert
    fun add(chiuit: ChiuitEntity): Unit


    // TODO("Define delete")
    @Delete
    fun delete(chiuit: ChiuitEntity): Unit



}