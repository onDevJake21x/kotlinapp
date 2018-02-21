package dev.northteam.com.salestrackerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class LogsActivity : AppCompatActivity() {

    var title:String = "Logs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logs)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()!!.setTitle(title)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() === android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
