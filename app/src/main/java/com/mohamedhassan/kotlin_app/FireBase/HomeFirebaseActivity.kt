package com.mohamedhassan.kotlin_app.FireBase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.mohamedhassan.kotlin_app.R

class HomeFirebaseActivity : AppCompatActivity() {

    lateinit var LoginIn : TextView
    lateinit var btn_SingOut : Button

    var myAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_firebase)

        LoginIn = findViewById(R.id.LoginIn);
        btn_SingOut = findViewById(R.id.btn_SingOut)

        var emailLogin = intent.getStringExtra("email")
        LoginIn.text  =  " this is my email perfect $emailLogin"

        btn_SingOut.setOnClickListener {
            view ->
            myAuth.signOut()
        }
    }
}