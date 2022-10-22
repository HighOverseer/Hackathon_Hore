package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.ListToko
import com.example.hackathon_hore.R

object listToko {
    fun getListToko():ArrayList<ListToko>{
        val categories = arrayListOf<ListToko>(
            ListToko(R.drawable.fototoko, "Toko Pasar Baru"),
            ListToko(R.drawable.fototoko, "Toko Padang"),
            ListToko(R.drawable.fototoko, "Toko Suka Maju"),
            ListToko(R.drawable.fototoko, "Toko Hore"),
            ListToko(R.drawable.fototoko, "Toko Limau Manis"),
            ListToko(R.drawable.fototoko, "Toko Terbaik"),

            )
        return categories
    }
}