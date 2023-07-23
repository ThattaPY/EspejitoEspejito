package com.thatta.espejitoespejito.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thatta.espejitoespejito.R
import com.thatta.espejitoespejito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


    }
}