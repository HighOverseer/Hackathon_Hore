package com.example.hackathon_hore.Api

import com.example.hackathon_hore.Model.Response
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/harga_komoditas")
    fun getResponse(): Call<Response>
}