package com.example.dummymovieapp.ui.home
//TODO 5: Setelah splash screen selesai dijalankan maka akan mengakses activity MainActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dummymovieapp.R
import com.example.dummymovieapp.adapters.SectionViewPagerAdapter
import com.example.dummymovieapp.databinding.ActivityMainBinding
// Pada class mainactivity mengakses avtivity_main menggunakan data binding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val sectionPageAdapter = SectionViewPagerAdapter(this, supportFragmentManager)
        activityMainBinding.mainViewPager.adapter = sectionPageAdapter
        activityMainBinding.mainTabLayout.setupWithViewPager(activityMainBinding.mainViewPager)
        supportActionBar?.elevation = 0f
    }
}