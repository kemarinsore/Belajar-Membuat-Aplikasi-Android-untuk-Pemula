package com.dicoding.submissionakhiraplikasiandroidsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var Foto_detail : ImageView
    private lateinit var Nama_detail : TextView
    private lateinit var Deskripsi_detail : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        intent.getParcelableExtra<Mobil>("DATA")?.let { data ->
            Log.d("Detail Data", data.name.toString())

            val Foto_detail: ImageView = findViewById(R.id.Foto_detail)
            val Nama_detail: TextView = findViewById(R.id.nama_mobil_detail)
            val Deskripsi_detail: TextView = findViewById(R.id.deskripsi_detail)

            Nama_detail.text = data.name
            Deskripsi_detail.text = data.description
            Foto_detail.setImageResource(data.photo)
        }
    }
}