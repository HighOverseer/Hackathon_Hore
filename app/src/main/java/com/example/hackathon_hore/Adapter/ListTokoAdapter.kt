package com.example.hackathon_hore.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackathon_hore.ListTokoActivity
import com.example.hackathon_hore.Model.Kategori
import com.example.hackathon_hore.Model.ListToko
import com.example.hackathon_hore.databinding.ItemKategoriBinding
import com.example.hackathon_hore.databinding.ItemListTokoBinding

class ListTokoAdapter (var categories:ArrayList<ListToko>): RecyclerView.Adapter<ListTokoAdapter.ListTokoViewHolder>() {
    inner class ListTokoViewHolder(var binding: ItemListTokoBinding): RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTokoViewHolder {
        val binding = ItemListTokoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListTokoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListTokoViewHolder, position: Int) {
        val currentItem = categories[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(currentItem.imageId)
                .into(ivItemToko)
            tvNamaToko.text = currentItem.nama
        }
        holder.itemView.setOnClickListener {
            (holder.itemView.context as ListTokoActivity).onItemClicked(currentItem.nama)
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}