package com.informatika.databarang.network


import okhttp3.Call
import retrofit2.http.GET


interface ApiService {
   @GET (value = : "users")
    fun getUser(): Call <List<ResponseUsersItem?>>

    }
