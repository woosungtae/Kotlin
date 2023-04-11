package com.example.testandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if(System.currentTimeMillis() - 100 > 1000){
                Toast.makeText(this, "원하시는 위치를 누르세요 !! ",
                    Toast.LENGTH_SHORT).show()
                return true
            }

        }
        return super.onKeyDown(keyCode, event)
    }

}