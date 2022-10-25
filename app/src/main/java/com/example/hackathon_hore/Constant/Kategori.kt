package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.Kategori
import com.example.hackathon_hore.R

object kategori{
    fun getCategories():ArrayList<Kategori>{
        val categories = arrayListOf<Kategori>(
            Kategori(R.drawable.minyak_goreng, "Minyak Goreng"),
            Kategori(R.drawable.tahu, "Tahu"),
            Kategori(R.drawable.tempe, "Tempe"),
            Kategori(R.drawable.teri, "Teri"),
            Kategori(R.drawable.beras, "Beras"),
            Kategori(R.drawable.cabe, "Cabe"),
            Kategori(R.drawable.gulapencarian, "Gula"),
            Kategori(R.drawable.garam, "Garam"),
            Kategori(R.drawable.gula_merah, "Gula Merah"),
            Kategori(R.drawable.susu, "Susu")
        )
        return categories
    }
}