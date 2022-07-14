package com.example.callapiexample3

import retrofit2.Call
import retrofit2.http.GET

interface ApiMovies {

    @GET("marvel")
    fun getData(): Call<List<MyDataItem>>
}