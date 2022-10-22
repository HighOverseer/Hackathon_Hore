package com.example.hackathon_hore.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackathon_hore.MainActivity
import com.example.hackathon_hore.Model.Kategori
import com.example.hackathon_hore.databinding.ItemKategoriBinding


class KategoriAdapter(var categories:ArrayList<Kategori>):RecyclerView.Adapter<KategoriAdapter.KategoriViewHolder>() {
    inner class KategoriViewHolder(var binding:ItemKategoriBinding):RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriViewHolder {
        val binding = ItemKategoriBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KategoriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KategoriViewHolder, position: Int) {
        val currentItem = categories[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(currentItem.imageId)
                .into(ivItemKategori)
            tvItemKategori.text = currentItem.nama
        }
        holder.itemView.setOnClickListener {
            if(holder.itemView.context is MainActivity){
                (holder.itemView.context as MainActivity).onItemCategoriesGetClicked()
            }

        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}