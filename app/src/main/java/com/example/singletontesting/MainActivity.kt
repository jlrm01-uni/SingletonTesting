package com.example.singletontesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.singletontesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

        MySingleton.addNote("From MainActivity: blah blah")

        Log.i("MainActivity", MySingleton.toString())
        Toast.makeText(applicationContext, MySingleton.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        MySingleton.addNote("From MainActivity (onResume): blah blah")
        Log.i("MainActivity", MySingleton.toString())
        Toast.makeText(applicationContext, MySingleton.toString(), Toast.LENGTH_LONG).show()

    }
}