package com.example.myapplication


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val intent1=Intent(this,second0::class.java)
            startActivity(intent1)
        }
        btn2.setOnClickListener {
            val intent2=Intent(this,third::class.java)
            startActivity(intent2)
        }


    }



}