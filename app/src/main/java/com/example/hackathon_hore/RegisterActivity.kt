package com.example.hackathon_hore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User
import android.app.Activity

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val etemail = findViewById<TextView>(R.id.etEmailReg)
        val etnama_toko = findViewById<TextView>(R.id.etNamaTokoReg)
        val etno_hp = findViewById<TextView>(R.id.etNoHpReg)
        val etpassword1 = findViewById<TextView>(R.id.etPassword1Reg)
        val etpassword2 = findViewById<TextView>(R.id.etPassword2Reg)

        btnRegister.setOnClickListener {
            val email = etemail.text.toString().trim()
            val nama_toko = etnama_toko.text.toString().trim()
            val no_hp = etno_hp.text.toString().trim()
            val pass1 = etpassword1.text.toString().trim()
            val pass2 = etpassword2.text.toString().trim()

            if (email.isEmpty()){
                etemail.error = "Mohon masukkan email"
                etemail.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
                etemail.error = "Email tidak ada"
                etemail.requestFocus()
                return@setOnClickListener

            if (nama_toko.isEmpty()){
                etnama_toko.error = "Mohon masukkan nama toko"
                etnama_toko.requestFocus()
                return@setOnClickListener
            }

            if (no_hp.isEmpty()){
                etno_hp.error = "Mohon masukkan no. hp"
                etno_hp.requestFocus()
                return@setOnClickListener
            }

            if (pass1.isEmpty() || pass1.length < 8){
                etpassword1.error = "Mohon masukkan password min 8 karakter"
                etpassword1.requestFocus()
                return@setOnClickListener
            }

            if (pass2.isEmpty()){
                etpassword2.error = "Mohon masukkan password konfirmasi"
                etpassword2.requestFocus()
                return@setOnClickListener
            }

            if(!pass1.equals(pass2))
                etpassword2.error = "Password tidak sama"
                etpassword2.requestFocus()
                return@setOnClickListener

            RegisterUser(email, pass1)
        }
    }

    private fun RegisterUser(email: String, pass1: String) {
        auth.createUserWithEmailAndPassword(email, pass1)
            .addOnCompleteListener(this){
                if (it.isSuccessful) {
                    Intent(this@RegisterActivity, ProfilActivity::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }
                }else{
                    Toast.makeText(this, it.exception?.message, Toast.LENGTH_SHORT).show()
                }
            }
    }
}
