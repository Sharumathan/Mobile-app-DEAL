package com.example.deal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sendData1:ImageView = findViewById(R.id.imageView12);
        sendData1.setOnClickListener {
            val intent1 = Intent(this,AddPost_page::class.java)
            startActivity(intent1)
        }

        val sendData2:ImageView = findViewById(R.id.imageView13);
        sendData2.setOnClickListener {
            val intent2 = Intent(this,Settings_page::class.java)
            startActivity(intent2)
        }

        val sendData3:ImageView = findViewById(R.id.imageView10);
        sendData3.setOnClickListener {
            val intent3 = Intent(this,HomePage::class.java)
            startActivity(intent3)
        }

        val sendData5:ImageView = findViewById(R.id.imageView2);
        sendData5.setOnClickListener {
            val intent3 = Intent(this,home_page::class.java)
            startActivity(intent3)
        }
    }
}