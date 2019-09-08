package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener{validateAnswers()}
    }

    private fun validateAnswers() {
        if(txtCase1.text.toString() == "T" &&
            txtCase2.text.toString() == "F" &&
            txtCase3.text.toString() == "F" &&
            txtCase4.text.toString() == "F") {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
        }
    }
}
