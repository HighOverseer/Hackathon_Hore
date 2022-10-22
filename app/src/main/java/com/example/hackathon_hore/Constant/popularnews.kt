package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.R

object popularnews {
    fun getAllPopularNews():ArrayList<PopularNews>{
        val items = ArrayList<PopularNews>()
        items.apply {
            add(PopularNews(R.drawable.vitc2, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?", "Sumatera Barat", "Manfaat vitamin C untuk kesehatan sendiri sangat banyak, antara lain membantu memulihkan kondisi tubuh sehabis sakit, membantu pembentukan pembuluh darah, kartilage, otot, dan kolagen pada tulang, serta melindungi sel-sel tubuh dari radikal bebas.\n"))
            add(PopularNews(R.drawable.jagung, "Pemerintah Minta Produktivitas Jagung Ditingkatkan", "Jawa Barat", " Pemerintah terus mendorong peningkatan produktivitas komoditas jagung sebagai upaya untuk menjaga ketahanan pangan nasional.\n"))
            add(PopularNews(R.drawable.petani, "Dukung Ketahanan Pangan Nasional dengan Perkuat UMKM Pertanian", " DKI Jakarta", " Asosiasi Pedagang Pasar Seluruh Indonesia (APPSI) memberikan apresiasi kepada Presiden Joko Widodo (Jokowi) karena telah mau mendengar aspirasi dan masukan dari para pedagang pasar terkait ketahanan dan cadangan pangan nasional serta skema subsidi untuk rakyat berupa Bantuan Langsung Tunai (BLT).\n"))
        }
        return items
    }
}