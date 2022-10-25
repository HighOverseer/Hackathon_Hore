package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Api.ApiConfig
import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.Model.Response
import com.example.hackathon_hore.R
import javax.security.auth.callback.Callback

object hasilPencarian{
    fun getCategories():ArrayList<HasilPencarian>{

        val hasilPencarian = arrayListOf<HasilPencarian>(
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Sumatera Barat", "Rp. 10.000 - 20.000", "Jalan Surga Pasar Raya, Padang, \n" +
                    "Sumatera Barat", "Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Sumatera Utara", "Rp. 20.000 - 30.000", "Jalan Camar, Langkat, Sumatera Utara","Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Aceh", "Rp. 10.000 - 20.000", "Jalan Surga Pasar Raya, Padang, \n" +
                    "Aceh", "Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Jawa Barat", "Rp. 20.000 - 30.000", "Jalan Camar, Langkat, Sumatera Utara","Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Jawa Tengah", "Rp. 10.000 - 20.000", "Jalan Surga Pasar Raya, Padang, \n" +
                    "Jawa Tengah", "Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
            HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Jakarta", "Rp. 20.000 - 30.000", "Jalan Camar, Langkat, Sumatera Utara","Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
                    HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Banten", "Rp. 10.000 - 20.000", "Jalan Surga Pasar Raya, Padang, \n" +
                    "Banten", "Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" ),
        HasilPencarian(R.drawable.example_categories_getclicked, "Gula","Jakarta", "Rp. 20.000 - 30.000", "Jalan Camar, Langkat, Sumatera Utara","Gula adalah nama generik untuk karbohidrat larut yang rasanya manis, banyak di antaranya digunakan dalam makanan" )
        )
        return hasilPencarian
    }
}