package com.example.babycare_pabproject

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class KonsulBooking : AppCompatActivity() {

    private lateinit var calendarResult: TextView
    private var selectedDate: Calendar? = null
    private var selectedTimeSlot: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsul_booking)

        val calendarButton = findViewById<ImageButton>(R.id.calendarButton)
        calendarResult = findViewById(R.id.calendarResult)

        calendarButton.setOnClickListener {
            showDatePicker()
        }

        val simpanButton = findViewById<ImageButton>(R.id.simpanButton)
        val batalButton = findViewById<ImageButton>(R.id.batalButton)

        simpanButton.setOnClickListener {
            if (selectedDate != null && selectedTimeSlot != null) {
                val dateFormat = SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.getDefault())
                val formattedDate = dateFormat.format(selectedDate!!.time)

                val selectedDateTime = "$formattedDate - $selectedTimeSlot"
                Toast.makeText(this, "Data disimpan! $selectedDateTime", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Pilih tanggal dan waktu terlebih dahulu.", Toast.LENGTH_SHORT).show()
            }
        }

        batalButton.setOnClickListener {
            Toast.makeText(this, "Aksi dibatalkan.", Toast.LENGTH_SHORT).show()
        }

        val imageView11 = findViewById<ImageButton>(R.id.imageView11)
        imageView11.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }

        val imageView12 = findViewById<ImageButton>(R.id.imageView12)
        imageView12.setOnClickListener {
            Intent(this, Fitur::class.java).also {
                startActivity(it)
            }
        }

        val imageView13 = findViewById<ImageButton>(R.id.imageView13)
        imageView13.setOnClickListener {
            Intent(this, News::class.java).also {
                startActivity(it)
            }
        }

        val backbutton = findViewById<ImageButton>(R.id.backbutton)
        backbutton.setOnClickListener {
            Intent(this, MainHome::class.java).also {
                startActivity(it)
            }
        }
    }

    fun onTimeButtonClick(view: View) {
        if (view is ImageButton) {
            val clickedButton = view as ImageButton
            // You can use the image resource ID or another identifier as the time slot
            selectedTimeSlot = getCorrespondingTimeSlot(clickedButton.id)
            updateCalendarResult()
        }
    }

    private fun getCorrespondingTimeSlot(buttonId: Int): String {
        // Implement logic to map button IDs to time slots
        return when (buttonId) {
            R.id.timeButton1 -> "09:00 AM - 09:30 AM"
            R.id.timeButton2 -> "10:00 AM - 10:30 AM"
            R.id.timeButton3 -> "11:00 AM - 11:30 AM"
            R.id.timeButton4 -> "01:00 AM - 01:30 AM"
            else -> "Unknown Time Slot"
        }
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDay ->
                selectedDate = Calendar.getInstance()
                selectedDate!!.set(selectedYear, selectedMonth, selectedDay)

                updateCalendarResult()
            },
            year, month, day
        )

        datePickerDialog.show()
    }

    private fun updateCalendarResult() {
        if (selectedDate != null && selectedTimeSlot != null) {
            val dateFormat = SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.getDefault())
            val formattedDate = dateFormat.format(selectedDate!!.time)

            val formattedDateTime = "$formattedDate - $selectedTimeSlot"
            calendarResult.text = formattedDateTime
        }
    }
}