package com.example.deal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sendData1: Button = findViewById(R.id.button);
        sendData1.setOnClickListener {
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }

        val sendData2:TextView = findViewById(R.id.textView2);
        sendData2.setOnClickListener {
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }

    }
}