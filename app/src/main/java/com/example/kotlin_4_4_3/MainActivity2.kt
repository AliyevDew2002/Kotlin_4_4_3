package com.example.kotlin_4_4_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.kotlin_4_4_3.model.User

class MainActivity2 : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }
    fun initViews(){
        var text=findViewById<TextView>(R.id.main_t)

        var user: User? =intent.getParcelableExtra("user")

        Log.d(TAG,user.toString())

        text.setText(user.toString())

    }
}