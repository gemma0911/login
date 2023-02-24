package com.example.app.login.app

import android.os.Bundle
import android.view.ViewGroup.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import com.example.app.login.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener(){
            val params = binding.textView.layoutParams as LayoutParams
            params.height = 20
            binding.textView.layoutParams = params
        }
    }
}