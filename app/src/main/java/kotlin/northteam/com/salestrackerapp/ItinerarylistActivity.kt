package dev.northteam.com.salestrackerapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.find

class ItinerarylistActivity : AppCompatActivity() {

    val title: String = "Itineraries"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itinerarylist)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()!!.setTitle(title)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() === android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }


    fun add(view:View){
        val intent =  Intent(this,ItineraryItemActivity::class.java)
        startActivity(intent);
    }
}
