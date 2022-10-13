package com.example.avila

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        Toast.makeText(this, "MainActivity Created", Toast.LENGTH_SHORT).show()
        val button: TextView = findViewById(R.id.tv_kontak)
        button.setOnClickListener {
            val intent = Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/yourprofile/"));
            startActivity(intent);
        }
    }
}