package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonRead= findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener {
            //change to read mode
            layout.setBackgroundResource(R.color.pink)

        buttonDark.setOnClickListener {
            //change to dark mode
            layout.setBackgroundResource(R.color.black)
        }

        }
    }
}