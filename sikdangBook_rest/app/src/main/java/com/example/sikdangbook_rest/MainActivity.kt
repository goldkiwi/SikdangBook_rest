package com.example.sikdangbook_rest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sikdangbook_rest.ChoiceSikdangPage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var startButton = findViewById<Button>(R.id.button_start)
        startButton.setOnClickListener {
            val intent = Intent(this, ChoiceSikdangPage::class.java)
            startActivity(intent)
        }
    }
}