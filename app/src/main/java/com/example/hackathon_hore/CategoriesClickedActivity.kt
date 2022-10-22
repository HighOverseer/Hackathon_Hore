package com.example.hackathon_hore

import android.content.Intent
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
import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.databinding.ActivityCategoriesClickedBinding

class CategoriesClickedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriesClickedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesClickedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnBackCategoriesClicked.setOnClickListener {
            finish()
        }
        val adapter = KategoriClickedAdapter(hasilPencarian.getCategories())
        binding.rvKategoriGetClicked.adapter = adapter
        binding.rvKategoriGetClicked.layoutManager = GridLayoutManager(this@CategoriesClickedActivity, 2, GridLayoutManager.VERTICAL, false)
        binding.rvKategoriGetClicked.setHasFixedSize(true)
    }
    fun onItemGetClicked(item:HasilPencarian){
        intent = Intent(this, ListTokoActivity::class.java)
        intent.putExtra(ListTokoActivity.EXTRA_INFO, item)
        startActivity(intent)
    }


}