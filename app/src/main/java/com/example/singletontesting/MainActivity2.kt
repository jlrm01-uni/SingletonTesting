package com.example.singletontesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.singletontesting.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button2.setOnClickListener {
            finish()
        }

        MySingleton.addNote("From Activity2: more blah blah")

        Log.i("MainActivity2", MySingleton.toString())
        Toast.makeText(applicationContext, MySingleton.toString(), Toast.LENGTH_LONG).show()
    }
}