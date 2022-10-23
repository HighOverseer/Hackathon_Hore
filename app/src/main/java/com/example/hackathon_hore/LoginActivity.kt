package com.example.hackathon_hore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.hackathon_hore.ui.home.HomeFragment
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val etEmailLog = findViewById<TextView>(R.id.etEmaillog)
        val etPasswordLog = findViewById<TextView>(R.id.etPasswordLog)
        val textDaftar = findViewById<TextView>(R.id.textDaftar)
        val tv_lupaPassword = findViewById<TextView>(R.id.tv_lupaPassword)

        btnLogin.setOnClickListener {
            val email = etEmailLog.text.toString().trim()
            val pass1 = etPasswordLog.text.toString().trim()

            if (email.isEmpty()){
                etEmailLog.error = "Mohon masukkan email"
                etEmailLog.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
                etEmailLog.error = "Email tidak ada"
                etEmailLog.requestFocus()
                return@setOnClickListener

            if (pass1.isEmpty() || pass1.length < 8){
                etPasswordLog.error = "Mohon masukkan password min 8 karakter"
                etPasswordLog.requestFocus()
                return@setOnClickListener
            }
            
            LoginUser(email,pass1)
        }

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

    private fun LoginUser(email: String, pass1: String) {
        auth.signInWithEmailAndPassword(email,pass1)
            .addOnCompleteListener(this){
                if(it.isSuccessful) {
                    Intent(this@LoginActivity, HomeFragment::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }
                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onStart() {
        super.onStart()
        if(auth.currentUser != null){
            Intent(this@LoginActivity, HomeFragment::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
            }
        }
    }
}