package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.R

object popularnews {
    fun getAllPopularNews():ArrayList<PopularNews>{
        val items = ArrayList<PopularNews>()
        items.apply {
            add(PopularNews(R.drawable.ex_popularnews, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?"))
            add(PopularNews(R.drawable.ex_popularnews, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?"))
            add(PopularNews(R.drawable.ex_popularnews, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?"))
        }
        return items
    }
}