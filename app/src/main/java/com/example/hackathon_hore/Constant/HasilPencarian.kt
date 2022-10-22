package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.Model.Kategori
import com.example.hackathon_hore.R

object hasilPencarian{
    fun getCategories():ArrayList<HasilPencarian>{
        val hasilPencarian = arrayListOf<HasilPencarian>(
            HasilPencarian(R.drawable.fototoko, "Minyak Goreng","Sumatera Barat", "Rp. 10.000 - 20.000" ),

        )
        return hasilPencarian
    }
}