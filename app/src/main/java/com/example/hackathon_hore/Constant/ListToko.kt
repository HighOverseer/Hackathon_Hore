package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.ListToko
import com.example.hackathon_hore.R

object listToko {
    fun getListToko():ArrayList<ListToko>{
        val categories = arrayListOf<ListToko>(
            ListToko(R.drawable.fototoko, "Toko Pasar Lama"),
            ListToko(R.drawable.fototoko, "Toko Muda"),
            ListToko(R.drawable.fototoko, "Toko Suka Maju"),
            ListToko(R.drawable.fototoko, "Toko Hore"),
            ListToko(R.drawable.fototoko, "Toko Tiki"),
            ListToko(R.drawable.fototoko, "Toko Terbaik"),
            ListToko(R.drawable.fototoko, "Toko Pak Lumin"),
            ListToko(R.drawable.fototoko, "Toko By Pass"),
            ListToko(R.drawable.fototoko, "Toko Bisa bisa"),
            ListToko(R.drawable.fototoko, "Toko Bang Bagus")

            )
        return categories
    }
}