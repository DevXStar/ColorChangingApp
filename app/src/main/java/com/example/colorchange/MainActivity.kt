package com.example.colorchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Greenbtn= findViewById<Button>(R.id.Green)
        val Bluebtn= findViewById<Button>(R.id.Blue)
        val Redbtn= findViewById<Button>(R.id.Red)
        val Yellowbtn= findViewById<Button>(R.id.Yellow)
        val Layout = findViewById<LinearLayout>(R.id.Layout)

        Greenbtn.setOnClickListener{
            Layout.setBackgroundResource(R.color.green)
        }
        Bluebtn.setOnClickListener{
            Layout.setBackgroundResource(R.color.blue)
        }
        Redbtn.setOnClickListener{
            Layout.setBackgroundResource(R.color.red)
        }
        Yellowbtn.setOnClickListener{
            Layout.setBackgroundResource(R.color.yellow)
        }
    }
}