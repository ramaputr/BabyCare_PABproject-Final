package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Kalender2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalender2)

        val imageButton15 = findViewById<ImageButton>(R.id.imageButton15)
        imageButton15.setOnClickListener {
            Intent(this, Kalender::class.java).also {
                startActivity(it)
            }
        }

        val imageButton17 = findViewById<ImageButton>(R.id.imageButton17)
        imageButton17.setOnClickListener {
            Intent(this, Kalender3::class.java).also {
                startActivity(it)
            }
        }

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, Kalender::class.java).also {
                startActivity(it)
            }
        }

        val imageButton25 = findViewById<ImageButton>(R.id.imageButton25)
        imageButton25.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

    }
}