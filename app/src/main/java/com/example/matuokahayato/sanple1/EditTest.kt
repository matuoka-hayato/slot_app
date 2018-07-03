package com.example.matuokahayato.sanple1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTest:AppCompatActivity(){


    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_test_layout)

        textView =findViewById(R.id.textView)
        editText =findViewById(R.id.editText)
        button =findViewById(R.id.button2)


        button.setOnClickListener {
                textView.text = editText.text
        }
    }
}