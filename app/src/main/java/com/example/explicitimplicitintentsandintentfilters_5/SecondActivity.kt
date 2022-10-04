package com.example.explicitimplicitintentsandintentfilters_5

import android.content.Intent
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

        binding.buttonTakePhoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == 0){
            val uri = data?.data
            binding.imageViewPhoto.setImageURI(uri)
        }
    }

}