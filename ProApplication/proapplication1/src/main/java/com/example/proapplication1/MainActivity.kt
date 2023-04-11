package com.example.proapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.proapplication1.databinding.ActivityDBinding

class MainActivity : AppCompatActivity() {
   // private  var mBinding: ActivityDBinding? = null
    //private  val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s)
      //  mBinding = ActivityDBinding.inflate(layoutInflater)
      //  setContentView(binding.root)
      //  binding.tvMessage.setText("안녕하세요 우성태입니다")
    }

    //override fun onDestroy() {
       // mBinding = null
       // super.onDestroy()
   // }
}