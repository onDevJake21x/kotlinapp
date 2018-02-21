package dev.northteam.com.salestrackerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import org.jetbrains.anko.alert

class ItineraryItemActivity : AppCompatActivity() {


    var title:String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itinerary_item)

        title = "Create Itinerary";
        getSupportActionBar()!!.setHomeAsUpIndicator(R.drawable.ic_close)
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()!!.setTitle(title)
        //setupToolBar();

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() === android.R.id.home) {
            close()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        close()
    }

    fun close(){
        alert(title = "Go Back",message = "Are you sure you want to go back without saving ?") {
            positiveButton("Yes") {
                finish();
            }
            negativeButton("No") {  }
        }.show();
    }
}
