package com.mohamedhassan.kotlin_app.FireBase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.mohamedhassan.kotlin_app.R

class RegisterFirebaseActivity : AppCompatActivity() {

    lateinit var et_NameFirebase :EditText
    lateinit var et_EmailFirebase :EditText
    lateinit var et_PasswordFirebase :EditText
    lateinit var btn_RegisterFirebase :Button
    lateinit var btn_BackToLoginFirebase :Button
    lateinit var et_PasswordFirebase2 :EditText

    var myAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_firebase)

        et_NameFirebase = findViewById(R.id.et_NameFirebase)
        et_EmailFirebase = findViewById(R.id.et_EmailFirebase)
        et_PasswordFirebase = findViewById(R.id.et_PasswordFirebase)
        et_PasswordFirebase2 = findViewById(R.id.et_PasswordFirebase2)
        btn_RegisterFirebase = findViewById(R.id.btn_RegisterFirebase)
        btn_BackToLoginFirebase = findViewById(R.id.btn_BackToLoginFirebase)

        btn_RegisterFirebase.setOnClickListener {


        }

        btn_BackToLoginFirebase.setOnClickListener {

            startActivity(Intent(this,LoginFirebaseActivity::class.java))

        }
    }
}