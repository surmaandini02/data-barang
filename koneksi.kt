package com.informatika.databarang.network

import androidx.appcompat.resources.Compatibility
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        val BaseUrl = "https://jsonplaceholder.typicode.com/"
        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: ApiService = retrofit.create(ApiService::class.java)
    }
}
