package com.example.babycare_pabproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class News2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news2)

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, News::class.java).also {
                startActivity(it)
            }
        }

        val imageButton25 = findViewById<ImageButton>(R.id.imageButton25)
        imageButton25.setOnClickListener {
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
    }
}