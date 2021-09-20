package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val blackText: Button = findViewById(R.id.blacktext)
        val redText: Button = findViewById(R.id.redtext)
        val changeSize: Button = findViewById(R.id.spSize8)
        val changeSize1: Button = findViewById(R.id.spSize24)
        val changeColor: Button = findViewById(R.id.whitecolor)
        val changeColor1: Button = findViewById(R.id.yellowcolor)
        val edittext: EditText = findViewById(R.id.edittext)

        blackText.setOnClickListener {

        }
        changeSize.setOnClickListener {
            edittext.setTextSize(8f)
        }
        changeSize1.setOnClickListener {
            edittext.setTextSize(25f)
        }
        blackText.setOnClickListener {
            edittext.setTextColor(Color.BLACK)
        }
        redText.setOnClickListener {
            edittext.setTextColor(Color.RED)
        }
        changeColor.setOnClickListener {
            edittext.setBackgroundColor(Color.WHITE)
        }
        changeColor1.setOnClickListener {
            edittext.setBackgroundColor(Color.YELLOW)
        }
    }
}