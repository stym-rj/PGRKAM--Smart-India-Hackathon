package com.example.pgrkam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.pgrkam.databinding.ActivityMainBinding
import com.example.pgrkam.mainActivityFragments.FragmentCamera
import com.example.pgrkam.mainActivityFragments.FragmentHome
import com.example.pgrkam.mainActivityFragments.FragmentNotification
import com.example.pgrkam.mainActivityFragments.FragmentProfile

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottomNavHome -> setFragment(FragmentHome())
                R.id.bottomNavCamera -> setFragment(FragmentCamera())
                R.id.bottomNavNotifications -> setFragment(FragmentNotification())
                R.id.bottomNavProfile -> setFragment(FragmentProfile())
                else -> setFragment(FragmentHome())
            }
            true
        }

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, fragment)
            .commit()
    }
}