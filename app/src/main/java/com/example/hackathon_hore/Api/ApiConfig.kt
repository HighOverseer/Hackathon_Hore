package com.example.hackathon_hore.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiConfig {
    fun getApiService():ApiService{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jibs.my.id/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiService::class.java)
    }
}