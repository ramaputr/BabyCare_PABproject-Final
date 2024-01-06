package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Panduan2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan2)

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton5)

        imageButton.setOnClickListener {
            Intent(this, Panduan3Activity::class.java).also {
                startActivity(it)
            }
        }

        imageButton2.setOnClickListener {
            Intent(this, Panduan3Activity::class.java).also {
                startActivity(it)
            }
        }

        imageButton5.setOnClickListener {
            Intent(this, Kalender3::class.java).also {
                startActivity(it)
            }
        }

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, Panduan1Activity::class.java).also {
                startActivity(it)
            }
        }

    }
}