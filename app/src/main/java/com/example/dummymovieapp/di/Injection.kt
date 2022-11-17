package com.example.dummymovieapp.di

import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.network.Gate


object Injection {
    fun provideMovieRepository(): MovieRepository {
        val gate = Gate()
        val remoteDataSource = RemoteDataSource.getInstance(gate)
        val movieRepository = MovieRepository.getInstance(remoteDataSource)
        return movieRepository
    }
   
}