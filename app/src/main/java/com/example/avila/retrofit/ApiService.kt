package com.example.avila.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiService {
    val BASE_URL: String = "https://reqres.in/api/"
    val endpoint: APIendpoint
    get() {
        val retrofit = Retrofit.Builder()
            .baseUrl( BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(APIendpoint::class.java)
    }
}