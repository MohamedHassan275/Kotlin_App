package com.mohamedhassan.kotlin_app.FireBase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.mohamedhassan.kotlin_app.R

class LoginFirebaseActivity : AppCompatActivity() {

    lateinit var et_EmailFirebase : EditText
    lateinit var etPasswordFirebase : EditText
    lateinit var BtnLoginFirebase : Button
    lateinit var btnRegisterFirebase : Button
    var myAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_firebase)

        et_EmailFirebase = findViewById(R.id.et_EmailFirebase)
        etPasswordFirebase = findViewById(R.id.et_PasswordFirebase)
        BtnLoginFirebase = findViewById(R.id.btn_LoginFirebase)
        btnRegisterFirebase = findViewById(R.id.btn_RegisterFirebase)


        BtnLoginFirebase.setOnClickListener {

            var Email = et_EmailFirebase.text.toString().trim()
            var Password = etPasswordFirebase.text.toString().trim()

            if(!(Email.isEmpty()|| Password.isEmpty())){

              SignIn(Email,Password)

          } else{

              Toast.makeText(this,"please enter your email and password",Toast.LENGTH_LONG).show()
          }


        }

        btnRegisterFirebase.setOnClickListener {

           startActivity(Intent(this,RegisterFirebaseActivity::class.java))

        }

    }

    private fun SignIn (email:String,password:String){


        myAuth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener { task ->

                if(task.isSuccessful){

                    Toast.makeText(this,"OnSuccess",Toast.LENGTH_LONG).show()

                } else {

                    Toast.makeText(this,"OnError",Toast.LENGTH_LONG).show()
                }
            }
    }

}