package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.button.visibility = View.INVISIBLE
            binding.imageView.visibility = View.VISIBLE
        }
        binding.imageView.setOnClickListener {
            binding.button.visibility = View.VISIBLE
            binding.imageView.visibility = View.INVISIBLE
        }
    }
}