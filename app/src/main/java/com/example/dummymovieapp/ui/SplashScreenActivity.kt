package com.example.dummymovieapp.ui
//TODO 3: Saat aplikasi berhasil di install kemudian dijalankan maka akan menjalankan activity SplashSreenActivity.kt ini
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.dummymovieapp.R
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.network.Gate
import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.databinding.ActivitySplashScreenBinding
import com.example.dummymovieapp.ui.home.MainActivity
import java.util.*

class SplashScreenActivity : AppCompatActivity() {
    //membuat fungsi onCreate untuk activity ini.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Membuat variabel splashScreenBinding
        //Memanggil ActivitySplashScreen menggunakan Binding sebagai layoutnya
        val splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding.root)

        //membuat variabel remote untuk mengaktifkan RemoteDataSource mengambil data dari class Gate
        val remote = RemoteDataSource.getInstance(Gate())
        //melalui remote mengambil seluruh data movie untuk diubah menjadi object
        //Pada seluruh data movie yang diterima melalui class movieresponse ditampilkan dalam bentuk list.
        remote.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(courseResponses: List<MovieResponse>) {

            }

        })
       //Mengaktifkan activity MainActivity setelah 4000 milidetik.
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 4000)

    }
}