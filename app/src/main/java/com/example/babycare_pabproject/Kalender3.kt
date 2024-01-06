package com.example.babycare_pabproject

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.ImageButton
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class Kalender3 : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    var jam = 0
    var menit = 0
    var tanggal = 0
    var bulan = 0
    var tahun = 0
    lateinit var teksTanggal: TextView
    lateinit var teksWaktu: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalender3)

        val BackButton = findViewById<ImageButton>(R.id.BackButton)
        BackButton.setOnClickListener {
            Intent(this, Kalender2::class.java).also {
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

    fun getSaatIni(){
        val kal: Calendar = Calendar.getInstance()
        tanggal = kal.get(Calendar.DAY_OF_MONTH)
        bulan = kal.get(Calendar.MONTH)
        tahun = kal.get(Calendar.YEAR)
        jam = kal.get(Calendar.HOUR_OF_DAY)
        menit = kal.get(Calendar.MINUTE)
    }

    fun fSetTanggal(view: View){
        getSaatIni()
        DatePickerDialog(this, this,  tahun, bulan, tanggal).show()
    }

    fun fSetWaktu(view: View){
        getSaatIni()
        TimePickerDialog(this, this, jam, menit, true).show()
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        tanggal = dayOfMonth
        bulan = month
        tahun = year

        teksTanggal = findViewById(R.id.textView17)
        teksTanggal.text = "${tanggal} - ${bulan} - ${tahun}"
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        jam = hourOfDay
        menit = minute

        teksWaktu = findViewById(R.id.textView18)
        teksWaktu.text = "${jam}:${menit}"
    }
}