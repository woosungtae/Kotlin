package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
           KeyEvent.KEYCODE_BACK -> Log.d("woo", "BACK Button 을 눌렀네요")
           KeyEvent.KEYCODE_VOLUME_UP -> Log.d("woo", "VOLUME UP Button 키를 눌렀네요")
           KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("woo", "VOLUME DOWN Button 키를 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)

    }

}