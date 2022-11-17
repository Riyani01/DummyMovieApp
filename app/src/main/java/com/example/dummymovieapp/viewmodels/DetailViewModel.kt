package com.example.dummymovieapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository

import com.example.dummymovieapp.di.Injection
import com.example.dummymovieapp.utils.DataDummy

class DetailViewModel(private val movieRepository: MovieRepository): ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(id: String){
        this.movieId = id
    }

    fun getMovie(): LiveData<MovieEntity>{
        val movie = movieRepository.getMovie(movieId)
        return movie
    }

}
