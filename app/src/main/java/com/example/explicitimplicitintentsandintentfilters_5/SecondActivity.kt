package com.example.explicitimplicitintentsandintentfilters_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.explicitimplicitintentsandintentfilters_5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("id", -1)

        val message = intent.getStringExtra("message")
        binding.textViewSecondActivity.text = message

        Log.d("TAG", "SecondActivity : onCreate $id")
    }
}