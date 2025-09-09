package com.example.mathquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mathquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEasy.setOnClickListener {
            startGame("Easy")
        }
        binding.btnMedium.setOnClickListener {
            startGame("Medium")
        }
        binding.btnHard.setOnClickListener {
            startGame("Hard")
        }

    }

    private fun startGame(questionType: String) {

        val intent = Intent(this, PlayActivity::class.java)
        intent.putExtra("questionType", questionType)
        startActivity(intent)
    }

}