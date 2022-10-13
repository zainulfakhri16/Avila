package com.example.avila

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "MainActivity Created", Toast.LENGTH_SHORT).show()
        val button: Button = findViewById(R.id.bt_login)
        button.setOnClickListener { login() }
    }
        fun login(){
            val user = findViewById(R.id.et_user) as EditText
            val pass = findViewById(R.id.et_pass) as EditText
            if (isValid(user.text.toString(),pass.text.toString())){
                Toast.makeText(this,"Please fill the required fields",Toast.LENGTH_SHORT).show()
                val intent = Intent (this,MenuActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "${user.text} is logged in", Toast.LENGTH_SHORT).show()
            }
        }
    fun isValid(user: String, pass: String):Boolean{

        return (user == "zain" && pass == "16")
    }
}