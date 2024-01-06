package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class Panduan3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan3)

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, Panduan2Activity::class.java).also {
                startActivity(it)
            }
        }

        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val imageView12 = findViewById<ImageView>(R.id.imageView12)
        imageView12.setOnClickListener {
            Intent(this, Fitur::class.java).also {
                startActivity(it)
            }
        }

        val imageView13 = findViewById<ImageView>(R.id.imageView13)
        imageView13.setOnClickListener {
            Intent(this, News::class.java).also {
                startActivity(it)
            }
        }

    }
}