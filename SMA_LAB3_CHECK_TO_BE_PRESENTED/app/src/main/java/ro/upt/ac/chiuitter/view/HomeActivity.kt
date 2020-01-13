package ro.upt.ac.chiuitter.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_home.*
import ro.upt.ac.chiuitter.R
import ro.upt.ac.chiuitter.data.database.ChiuitDbStore
import ro.upt.ac.chiuitter.data.database.RoomDatabase
import ro.upt.ac.chiuitter.domain.Chiuit
import ro.upt.ac.chiuitter.viewmodel.HomeViewModel
import ro.upt.ac.chiuitter.viewmodel.HomeViewModelFactory


class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel
    private lateinit var recyclerView : RecyclerView
    private lateinit var viewAdapter  : ChiuitRecyclerViewAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_home)

        fab_add.setOnClickListener { composeChiuit() }

        viewManager = LinearLayoutManager(this)

        val factory = HomeViewModelFactory(ChiuitDbStore(RoomDatabase.getDb(this)))
        viewModel = ViewModelProviders.of(this, factory).get(HomeViewModel::class.java)

        initList()
    }

    private fun initList() {
        rv_chiuit_list.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
        }
        //TODO("Instantiate an adapter with the received list and assign it to recycler view")
        viewModel.chiuitsLiveData.observe(this, Observer { chiuts ->
            viewAdapter = ChiuitRecyclerViewAdapter(chiuts,
                   { chiuit: Chiuit -> shareChiuit(chiuit.description)}) {
               viewModel.removeChiuit(it)
           }

            recyclerView = findViewById<RecyclerView>(R.id.rv_chiuit_list).apply {
                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                setHasFixedSize(true)

                // use a linear layout manager
                layoutManager = viewManager

                // specify an viewAdapter (see also next example)
                adapter = viewAdapter

            }
        })

        viewModel.retrieveChiuits()
    }

    /*
    Defines text sharing/sending *implicit* intent, opens the application chooser menu
    and then starts a new activity which supports sharing/sending text.
     */
    private fun shareChiuit(text: String) {
        //TODO("Customize an implicit intent which triggers text sharing")
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
        val intent = Intent(this, ComposeActivity::class.java)
        startActivityForResult(intent, COMPOSE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            COMPOSE_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) extractText(data)
            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun extractText(data: Intent?) {
        data?.let {
            val text = data.getStringExtra(ComposeActivity.EXTRA_TEXT)
            if (!text.isNullOrBlank()) {
                viewModel.addChiuit(text)
            }
        }
    }

    companion object {
        const val COMPOSE_REQUEST_CODE = 1213
    }

}
