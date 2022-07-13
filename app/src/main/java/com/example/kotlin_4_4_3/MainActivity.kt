package com.example.kotlin_4_4_3


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kotlin_4_4_3.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


    fun initViews(){
        var button=findViewById<Button>(R.id.main_b)

        button.setOnClickListener{

            var user= User(20,"Shaxzod")
            nextPageActivity(user)

        }
    }
    fun nextPageActivity(user: User){
        var intent = Intent(this,MainActivity2::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }
}