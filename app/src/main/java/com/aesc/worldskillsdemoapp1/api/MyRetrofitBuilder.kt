package com.aesc.worldskillsdemoapp1.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRetrofitBuilder {
    const val BASE_URL: String = "https://pokeapi.co/api/v2/"

    private val retofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: ApiService by lazy {
        retofitBuilder
            .build()
            .create(ApiService::class.java)
    }
}