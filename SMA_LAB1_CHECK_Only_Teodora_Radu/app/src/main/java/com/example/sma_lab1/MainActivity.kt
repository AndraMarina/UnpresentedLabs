package com.example.sma_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class TextHolder(val txt: String)


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val myTxt = TextHolder("Bunaa!")

        btn.setOnClickListener{
            btn.text = myTxt.txt.toString()
        }

    }
}
