package com.example.hackathon_hore.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackathon_hore.BeritaActivity
import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.R
import com.example.hackathon_hore.databinding.ItemKategoriBinding
import com.example.hackathon_hore.databinding.ItemPopularnewsBinding

class PopularNewsAdapter(var popularNewsItems:ArrayList<PopularNews>):RecyclerView.Adapter<PopularNewsAdapter.PopularNewsViewHolder>() {
    inner class PopularNewsViewHolder(val binding:ItemPopularnewsBinding):RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularNewsViewHolder {
        val binding = ItemPopularnewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularNewsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return popularNewsItems.size
    }

    override fun onBindViewHolder(holder: PopularNewsViewHolder, position: Int) {
        val currentItem = popularNewsItems[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(currentItem.imageId)
                .into(ivPopularNews)
            tvTitlePopularNews.text = currentItem.title
        }
        holder.itemView.setOnClickListener {
            (holder.itemView.context as BeritaActivity).itemClicked(currentItem)
        }
    }
}