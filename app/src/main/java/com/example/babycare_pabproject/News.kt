package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class News : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val imageButton25 = findViewById<ImageButton>(R.id.imageButton25)
        imageButton25.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val imageButton26 = findViewById<ImageButton>(R.id.imageButton26)
        imageButton26.setOnClickListener {
            Intent(this, Fitur::class.java).also {
                startActivity(it)
            }
        }

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener {
            Intent(this, News2::class.java).also {
                startActivity(it)
            }
        }
    }
}