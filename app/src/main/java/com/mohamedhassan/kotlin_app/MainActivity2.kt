package com.mohamedhassan.kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var textName : TextView
    lateinit var textAge : TextView
    lateinit var textAddress : TextView
    lateinit var textCountry : TextView
    lateinit var btn_Return : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textName = findViewById(R.id.textName);
        textAge = findViewById(R.id.textAge);
        textAddress = findViewById(R.id.textAddress);
        textCountry = findViewById(R.id.textCountry);
        btn_Return = findViewById(R.id.btn_Return);

        var employes = intent.getSerializableExtra("employes") as Employes

        textName.text = "my name is " +employes.name + "  my old is " + employes.age +
                "  my address is " + employes.address +" my country is " + employes.country

        textAge.text = employes.age
        textAddress.text = employes.address
        textCountry.text = employes.country


//        var Data = intent.getStringExtra("Data")
//        var Data2 = intent.getStringExtra("Data2")
//
//        textName.text = Data
//        textAge.text = Data2

        btn_Return.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}