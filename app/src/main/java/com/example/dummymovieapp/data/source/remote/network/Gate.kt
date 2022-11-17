package com.example.dummymovieapp.data.source.remote.network

import com.example.dummymovieapp.data.source.remote.network.services.MovieServices


class Gate : ApiConfig() {
    fun movie(): MovieServices = provideRetrofit().create(MovieServices::class.java)
   
}
