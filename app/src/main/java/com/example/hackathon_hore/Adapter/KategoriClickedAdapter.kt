package com.example.hackathon_hore.Adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackathon_hore.CategoriesClickedActivity
import com.example.hackathon_hore.MainActivity
import com.example.hackathon_hore.Model.HasilPencarian
import com.example.hackathon_hore.databinding.ItemCategoriesClickedBinding
import com.example.hackathon_hore.databinding.ItemKategoriBinding
import kotlin.time.measureTimedValue

class KategoriClickedAdapter(val items:ArrayList<HasilPencarian>):RecyclerView.Adapter<KategoriClickedAdapter.KategoriClickedViewHolder>(){
    inner class KategoriClickedViewHolder(var binding:ItemCategoriesClickedBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriClickedViewHolder {
        val binding = ItemCategoriesClickedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KategoriClickedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KategoriClickedViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(currentItem.imageId)
                .into(ivCategoriesGetClicked)
            tvNamaCategoriesGetClicked.text = currentItem.pangan
            tvProvinsiCategoriesGetClicked.text = currentItem.provinsi
            tvHargaCategoriesGetClicked.text = currentItem.rentangHarga
        }
        holder.itemView.setOnClickListener {
            if(holder.itemView.context is CategoriesClickedActivity ){
                (holder.itemView.context as CategoriesClickedActivity).onItemGetClicked(currentItem)
            }else if(holder.itemView.context is MainActivity){
                (holder.itemView.context as MainActivity).onItemGetClicked(currentItem)
            }

        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
}