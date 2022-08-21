package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second0.*

class second0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second0)

        btnsave.setOnClickListener {
            val intent= Intent(this,fourth::class.java)
            startActivity(intent)
        }
    }
}