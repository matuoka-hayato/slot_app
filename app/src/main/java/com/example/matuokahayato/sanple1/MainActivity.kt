package com.example.matuokahayato.sanple1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.edit_test_layout.*
import kotlinx.android.synthetic.main.kadai.*
import kotlinx.android.synthetic.main.kadai.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var textView2: TextView
    private var slotJudge1 = 0
    private var slotJudge2 = 0
    private var slotJudge3 = 0
    private val random = Random()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kadai)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        image1 = findViewById(R.id.image1)
        image2 = findViewById(R.id.image2)
        image3 = findViewById(R.id.image3)
        textView2 = findViewById(R.id.textView2)
        button1.setOnClickListener {
            slotJudge1 = random.nextInt(5) + 1
            when (slotJudge1) {
                1 -> image1.setImageResource(R.drawable.number_1)
                2 -> image1.setImageResource(R.drawable.number_2)
                3 -> image1.setImageResource(R.drawable.number_3)
                4 -> image1.setImageResource(R.drawable.number_4)
                5 -> image1.setImageResource(R.drawable.number_5)
            }
            slotJudge(slotJudge1, slotJudge2, slotJudge3)

        }
        button2.setOnClickListener {
            slotJudge2 = random.nextInt(5) + 1
            when (slotJudge2) {
                1 -> image2.setImageResource(R.drawable.number_1)
                2 -> image2.setImageResource(R.drawable.number_2)
                3 -> image2.setImageResource(R.drawable.number_3)
                4 -> image2.setImageResource(R.drawable.number_4)
                5 -> image2.setImageResource(R.drawable.number_5)
            }
            slotJudge(slotJudge1, slotJudge2, slotJudge3)

        }
        button3.setOnClickListener {
            slotJudge3 = random.nextInt(5) + 1
            when (slotJudge3) {
                1 -> image3.setImageResource(R.drawable.number_1)
                2 -> image3.setImageResource(R.drawable.number_2)
                3 -> image3.setImageResource(R.drawable.number_3)
                4 -> image3.setImageResource(R.drawable.number_4)
                5 -> image3.setImageResource(R.drawable.number_5)
            }
            slotJudge(slotJudge1, slotJudge2, slotJudge3)

        }

    }


    private fun slotJudge(slotJudge1: Int, slotJudge2: Int, slotJudge3: Int) {
        if (slotJudge1 != 0 && slotJudge1 == slotJudge2 && slotJudge2 == slotJudge3 && slotJudge3 == slotJudge1) {
            textView2.text = "おめでとう！"
        } else if (slotJudge1 == 0 && slotJudge2 == 0 && slotJudge3 == 0) {
            textView2.text = "がんば"
        }

    }
}



