package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.plus_button)
        val text = findViewById<TextView>(R.id.text)
        val minus = findViewById<Button>(R.id.minus_button)
        var count = 0
        minus.setOnClickListener{

            text.setText(count --)
        }

        plus.setOnClickListener{
            text.setText(count ++)
        }


    }
}