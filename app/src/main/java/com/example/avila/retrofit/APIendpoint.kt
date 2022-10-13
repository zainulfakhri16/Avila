package com.example.avila.retrofit

import com.example.avila.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface APIendpoint {
    @GET("users/2")
    fun getUser():Call<MainModel>
}