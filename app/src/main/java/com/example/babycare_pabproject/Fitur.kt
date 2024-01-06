package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Fitur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur)

        val imageButton21 = findViewById<ImageButton>(R.id.imageButton21)
        imageButton21.setOnClickListener {
            Intent(this, KonsulBooking::class.java).also {
                startActivity(it)
            }
        }

        val imageButton22 = findViewById<ImageButton>(R.id.imageButton22)
        imageButton22.setOnClickListener {
            Intent(this, Panduan1Activity::class.java).also {
                startActivity(it)
            }
        }

        val imageButton24 = findViewById<ImageButton>(R.id.imageButton24)
        imageButton24.setOnClickListener {
            Intent(this, Kalender::class.java).also {
                startActivity(it)
            }
        }

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val imageButton25 = findViewById<ImageButton>(R.id.imageButton25)
        imageButton25.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val imageButton23 = findViewById<ImageButton>(R.id.imageButton23)
        imageButton23.setOnClickListener {
            Intent(this, News::class.java).also {
                startActivity(it)
            }
        }

        val imageButton27 = findViewById<ImageButton>(R.id.imageButton27)
        imageButton27.setOnClickListener {
            Intent(this, News::class.java).also {
                startActivity(it)
            }
        }
    }
}