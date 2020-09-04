package com.alex.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "secret: " + secretNumber.secret)
    }

    fun check(view: View) {
        val n = ed_Number.text.toString().toInt()
        println("numbern: $n")
        Log.d("MainActivity", "number:" + n)  //除錯專用
        val diff = secretNumber.validate(n)
        var message = "Yes, you got it"
        if (diff < 0) {
            message = "Bigger"
        }else if (diff > 0) {
            message = "Small"
        }
//        Toast 暫時性訊息顯示
//        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()

    }
}