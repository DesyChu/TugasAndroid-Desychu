package com.example.tugasandroiddesychu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class BelajarViewModel : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetContentView()


        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView.text = viewModel.angka.toString()

        button.setOnClickListener {
           viewModel.tambahAngka()
            textView.text = viewModel.angka.toString()
        }
    }

    private fun SetContentView() {

    }
}

private fun Any.get(modelClass: Class<MainViewModel>): MainViewModel {
    TODO("Not yet implemented")
}


