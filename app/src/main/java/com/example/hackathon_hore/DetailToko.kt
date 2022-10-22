package com.example.hackathon_hore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.databinding.ActivityToko1Binding

class DetailToko : AppCompatActivity() {
    private lateinit var binding:ActivityToko1Binding
    companion object{
        const val EXTRA_INFO = "info"
        const val EXTRA_NAMATOKO = "namatoko"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToko1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setLayout()
        binding.ibBackDetailToko.setOnClickListener {
            finish()
        }

    }
    private fun setLayout(){
        val infoToko = intent.getParcelableExtra<HasilPencarian>(EXTRA_INFO)
        binding.apply {
            Glide.with(this@DetailToko)
                .load(infoToko?.imageId)
                .into(ivGambarGula)
            tvLokasi.text = infoToko?.alamat
            tvNamaPangan.text = infoToko?.pangan
            tvHarga.text = infoToko?.rentangHarga
            tvDeskripsi.text = infoToko?.deskripsi
            tvNamaToko.text = intent.getStringExtra(EXTRA_NAMATOKO)

        }
    }
}