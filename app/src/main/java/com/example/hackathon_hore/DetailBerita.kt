package com.example.hackathon_hore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.databinding.ActivityDetailBeritaBinding

class DetailBerita : AppCompatActivity() {
    companion object{
        const val EXTRA_BERITA = "berita"
    }
    private lateinit var binding:ActivityDetailBeritaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.ibBackBeritaClicked.setOnClickListener {
            finish()
        }
        getItemBerita()

    }


    private fun getItemBerita(){
        val berita = intent.getParcelableExtra<PopularNews>(EXTRA_BERITA)
        binding.apply {
            Glide.with(this@DetailBerita)
                .load(berita?.imageId)
                .into(ivGambarGula)
            tvJudulProdukToko.text = berita?.title
            tvLokasi.text = berita?.provinsi
            tvBeritaDesc.text = berita?.deskripsi
        }
    }
}