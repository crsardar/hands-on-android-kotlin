package com.crsardar.myconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)

        var no = 0

        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener {

            no +=1;

            myTextView.text = no.toString()
        }
    }
}