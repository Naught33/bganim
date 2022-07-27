package com.example.sqllite_db

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var bganim: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val screenanim=findViewById<LinearLayout>(R.id.background1).apply {
            setBackgroundResource(R.drawable.bg_main)
            bganim =background as AnimationDrawable

            bganim.start()
        }

    }

}