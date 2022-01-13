package com.example.everycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.everycalc.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView=this.findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navController= findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)
    }
}