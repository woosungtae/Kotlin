package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import com.example.myapplication.databinding.ActivityMain3Binding
import com.example.myapplication.databinding.ActivityMain6Binding
import com.example.myapplication.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkk.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener
        {override fun onCheckedChanged(buttonView:CompoundButton?,isChecked:Boolean){
            Log.d("woo", "체크박스클릭")
        }
        })

        }

    }



