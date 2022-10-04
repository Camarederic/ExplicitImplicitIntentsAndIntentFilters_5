package com.example.explicitimplicitintentsandintentfilters_5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.explicitimplicitintentsandintentfilters_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonExplicitIntent.setOnClickListener { startToSecondActivity() }
        binding.buttonService.setOnClickListener { startTestService() }

        binding.buttonImplicitOpenGoogleMaps.setOnClickListener { openGoogleMaps() }
        binding.buttonImplicitOpenMailWebsite.setOnClickListener { openMailWebsite() }

    }

    private fun openGoogleMaps() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:56.333,60.333"))
        startActivity(intent)
    }

    private fun openMailWebsite() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.ru/"))
        startActivity(intent)
    }

    private fun startToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("id", 10)
        intent.putExtra("message", "Hello from MainActivity")
        startActivity(intent)
    }

    private fun startTestService() {
        startService(Intent(this, TestService::class.java))

    }
}