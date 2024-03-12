package com.example.deal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddPost_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_post_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sendData8: ImageView = findViewById(R.id.imageView9);
        sendData8.setOnClickListener {
            val intent3 = Intent(this,HomePage::class.java)
            startActivity(intent3)
        }
        val sendData9: TextView = findViewById(R.id.textView14);
        sendData9.setOnClickListener {
            val intent3 = Intent(this,HomePage::class.java)
            startActivity(intent3)
        }
    }
}