package com.example.hackathon_hore

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon_hore.Adapter.PopularNewsAdapter
import com.example.hackathon_hore.Constant.popularnews
import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.databinding.ActivityBeritaBinding

class BeritaActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBackPopularNews.setOnClickListener {
            finish()
        }
        val adapter = PopularNewsAdapter(popularnews.getAllPopularNews())
        binding.rvPopularNews.adapter = adapter
        binding.apply {
            rvPopularNews.layoutManager = LinearLayoutManager(this@BeritaActivity, LinearLayoutManager.HORIZONTAL, false)
            rvPopularNews.setHasFixedSize(true)
        }
        binding.rvRecentlyUpdate.adapter = adapter
        binding.apply {
            rvRecentlyUpdate.layoutManager = LinearLayoutManager(this@BeritaActivity, LinearLayoutManager.HORIZONTAL, false)
            rvRecentlyUpdate.setHasFixedSize(true)
        }

    }
    fun itemClicked(berita:PopularNews){
        val intent = Intent(this, DetailBerita::class.java)
        intent.putExtra(DetailBerita.EXTRA_BERITA, berita)
        startActivity(intent)
    }
}