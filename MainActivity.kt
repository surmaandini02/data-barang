package com.informatika.databarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    koneksi.service.getUser().enqueue(object : Callback<List<ResponseUserItem?>>{
        override fun onFailure(call: Call<List<ResponseUserItem?>>, t : Throwable) {
            Log.d("pesan", t.localizedMessage)
        }

        override fun onResponse(
            call: retrofit2.Call<List<ResponseUserItem?>>,
            response: Response<List<ResponseUserItem?>>
        ) {
            if(response.isSuccessful){
                Log.d("Pesan", response.body().toString());
            }
        }

    }

}

