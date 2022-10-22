package com.example.hackathon_hore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val textDaftar = findViewById<TextView>(R.id.textDaftar)
        val tv_lupaPassword = findViewById<TextView>(R.id.tv_lupaPassword)

        textDaftar.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }

        tv_lupaPassword.setOnClickListener {
            Intent(this@LoginActivity, ResetPasswordActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}