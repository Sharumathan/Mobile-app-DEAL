package com.example.deal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Settings_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sendData3: ImageView = findViewById(R.id.imageView15);
        sendData3.setOnClickListener {
            val intent3 = Intent(this,HomePage::class.java)
            startActivity(intent3)
        }

        val sendData5:TextView = findViewById(R.id.textVssiwew23);
        sendData5.setOnClickListener {
            val intent3 = Intent(this,LoginPage::class.java)
            startActivity(intent3)
        }

        val sendData4: ImageView = findViewById(R.id.imsagedViedww24);
        sendData4.setOnClickListener {
            val intent3 = Intent(this,LoginPage::class.java)
            startActivity(intent3)
        }

        val sendData6: ImageView = findViewById(R.id.imasgeVeisew25);
        sendData6.setOnClickListener {
            val intent3 = Intent(this,LoginPage::class.java)
            startActivity(intent3)
        }

        val sendData8:TextView = findViewById(R.id.textView21);
        sendData8.setOnClickListener {
            val intent3 = Intent(this,HomePage::class.java)
            startActivity(intent3)
        }
    }
}