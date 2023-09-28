package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    объявление всех переменных.
        val edittext = findViewById<EditText>(R.id.edit_text)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)


        button1.setOnClickListener {
            edittext.setTextColor(Color.BLACK)
        }

        button2.setOnClickListener {
            edittext.setTextColor(Color.RED)
        }
        button3.setOnClickListener {
            edittext.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }
        button4.setOnClickListener {
            edittext.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
        button5.setOnClickListener {
            edittext.setBackgroundColor(Color.WHITE)
        }
        button6.setOnClickListener {
            edittext.setBackgroundColor(Color.YELLOW)
        }


    }
}

