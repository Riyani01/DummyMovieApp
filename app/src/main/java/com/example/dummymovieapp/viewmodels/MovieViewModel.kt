package com.example.dummymovieapp.viewmodels
//TODO VIEW MODEL: Saat dijalankan terdapat data terbaru movie berupa gambar,deskripsi,serta rating hal ini dikarenakan adanya class view model
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.di.Injection
import com.example.dummymovieapp.utils.DataDummy

//Class MovieViewModel ini me
class MovieViewModel(private val repo: MovieRepository): ViewModel() {
    fun getMovie() : LiveData<List<MovieEntity>> {
        return repo.getMovies()
    }
}