package com.herasymchuk.p0081_viewbuild

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myTextView = findViewById<TextView>(R.id.myText)
        myTextView.text = "This is a new text"
        val myButton: Button = findViewById(R.id.myButton)
        myButton.isEnabled = false
        val myCheckBox: CheckBox = findViewById(R.id.my_chbx)
    }
}