package dev.northteam.com.salestrackerapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.alert

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }

    fun btn_login(view: View){
        val intent =  Intent(this,MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }


    override fun onBackPressed() {
        close()
    }

    fun close(){
        alert(title = "Exit Application.",message = "Are you sure you want to Exit?") {
            positiveButton("Yes") {
                finish();
            }
            negativeButton("No") {  }
        }.show();
    }

}
