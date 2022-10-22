package com.example.hackathon_hore

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon_hore.Adapter.KategoriClickedAdapter
import com.example.hackathon_hore.Adapter.ListTokoAdapter
import com.example.hackathon_hore.Constant.hasilPencarian
import com.example.hackathon_hore.Constant.hasilPencarian.getCategories
import com.example.hackathon_hore.Constant.listToko
import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.databinding.ActivityCategoriesClickedBinding
import com.example.hackathon_hore.databinding.ActivityListTokoBinding

class ListTokoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListTokoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListTokoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val adapter = ListTokoAdapter(listToko.getListToko())
        binding.rvListToko.adapter = adapter
        binding.rvListToko.apply {
            layoutManager = LinearLayoutManager(this@ListTokoActivity)
            setHasFixedSize(true)
        }
    }



}