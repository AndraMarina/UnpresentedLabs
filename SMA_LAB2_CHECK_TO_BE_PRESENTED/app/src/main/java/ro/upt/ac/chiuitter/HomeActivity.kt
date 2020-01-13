package ro.upt.ac.chiuitter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_chiuit.*
import kotlinx.android.synthetic.main.view_home.*

class HomeActivity : AppCompatActivity() {

    private val dummyChiuitStore = DummyChiuitStore()

    private lateinit var listAdapter: ChiuitRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_home)

        initList()
    }

    private fun initList() {
        val chiuitList = dummyChiuitStore.getAllData()

        //TODO("7. Instantiate the adapter, then setup the recycler view list")
       val viewAdapter = ChiuitRecyclerViewAdapter(chiuitList.toMutableList()) {
            shareChiuit(it.description)
       }

        rv_chiuit_list.layoutManager = LinearLayoutManager(this)
        rv_chiuit_list.adapter = viewAdapter

    }

    /*
    Defines text sharing/sending *implicit* intent, opens the application chooser menu
    and then starts a new activity which supports sharing/sending text.
     */
    private fun shareChiuit(text: String) {
        // TODO 1: Configure to support text sending/sharing and then attach the text as intent's extra.

        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }

        val intentChooser = Intent.createChooser(sendIntent, "")

        startActivity(intentChooser)

    }


    /*
    Defines an *explicit* intent which will be used to start ComposeActivity.
     */
    private fun composeChiuit() {
        val Intnt = Intent(this, ComposeActivity::class.java)

        // Not only we are using the explicit approach, but we start a new activity
        // that we expect to return the text as result.
        startActivityForResult(Intnt, COMPOSE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            COMPOSE_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) extractText(data)
            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun extractText(data: Intent?) {
        data?.let {
            val Txt = data.getStringExtra(ComposeActivity.EXTRA_TEXT)

            if (Txt != null && Txt != ""){
                txv_content.text = Txt
            }

            //TODO("13. Instantiate a new chiuit object that add it to the adapter")
            val chiuit = Chiuit(Txt)
            listAdapter.addItem(chiuit)
        }
    }

    companion object {
        const val COMPOSE_REQUEST_CODE = 1213
    }

}
