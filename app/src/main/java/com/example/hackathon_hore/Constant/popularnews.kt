package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.R

object popularnews {
    fun getAllPopularNews():ArrayList<PopularNews>{
        val items = ArrayList<PopularNews>()
        items.apply {
            add(PopularNews(R.drawable.popularnews2, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?", "Dunia", "Jambu biji masih menduduki peringkat atas kategori buah kaya vitamin C. Buah berbau harum tersebut mengandung sekitar 200 mg vitamin C per 100 gram, jauh lebih tinggi dari jeruk yang hanya 53 mg. Termasuk dalam buah-buahan tropis, jambu biji bisa tumbuh sangat baik di Indonesia."))
            add(PopularNews(R.drawable.jagung, "Pemerintah Minta Produktivitas Jagung Ditingkatkan", "Jawa Barat", " Pemerintah terus mendorong peningkatan produktivitas komoditas jagung sebagai upaya untuk menjaga ketahanan pangan nasional.\n"))
            add(PopularNews(R.drawable.petani, "Dukung Ketahanan Pangan Nasional dengan Perkuat Sektor Pertanian", " DKI Jakarta", " Asosiasi Pedagang Pasar Seluruh Indonesia (APPSI) memberikan apresiasi kepada Presiden Joko Widodo (Jokowi) karena telah mau mendengar aspirasi dan masukan dari para pedagang pasar terkait ketahanan dan cadangan pangan nasional serta skema subsidi untuk rakyat berupa Bantuan Langsung Tunai (BLT).\n"))
        }
        return items
    }
}