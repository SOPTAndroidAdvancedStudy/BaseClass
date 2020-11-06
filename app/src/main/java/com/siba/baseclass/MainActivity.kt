package com.siba.baseclass

import android.os.Bundle
import com.siba.baseclass.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvHello.text = "Hello"
    }
}