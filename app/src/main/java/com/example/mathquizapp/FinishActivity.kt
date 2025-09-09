package com.example.mathquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mathquizapp.Adapter.QuestionAdapter
import com.example.mathquizapp.databinding.ActivityFinishBinding
import com.example.mathquizapp.model.Question

class FinishActivity : AppCompatActivity() {
    lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)
        val data: ArrayList<Question> =
            intent.getSerializableExtra("dataSet") as ArrayList<Question>

        binding.tvScore.text = "Your Score \n$score/10"
        setAdapterRecyclerView(data)

        binding.btnHome.setOnClickListener {
            finish()
        }
    }

    private fun setAdapterRecyclerView(data: ArrayList<Question>) {

        binding.rvQuestionList.layoutManager = LinearLayoutManager(this)
        val adapter = QuestionAdapter(data)
        binding.rvQuestionList.adapter = adapter
    }
}