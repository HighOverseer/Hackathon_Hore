package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.Kategori
import com.example.hackathon_hore.R

object kategori{
    fun getCategories():ArrayList<Kategori>{
        val categories = arrayListOf<Kategori>(
            Kategori(R.drawable.excatmodel1, "Minyak Goreng"),
            Kategori(R.drawable.excatmodel1, "Obat-Obatan"),
            Kategori(R.drawable.excatmodel1, "Cucian"),
            Kategori(R.drawable.excatmodel1, "Pembersih Rumah"),
            Kategori(R.drawable.excatmodel1, "Beras"),
            Kategori(R.drawable.excatmodel2, "Makanan Ringan"),
            Kategori(R.drawable.excatmodel2, "Gula"),
            Kategori(R.drawable.excatmodel2, "Garam"),
            Kategori(R.drawable.excatmodel2, "Minuman"),
            Kategori(R.drawable.excatmodel2, "Susu")
        )
        return categories
    }
}