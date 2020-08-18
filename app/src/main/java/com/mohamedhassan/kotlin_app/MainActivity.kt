package com.mohamedhassan.kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mohamedhassan.kotlin_app.FireBase.LoginFirebaseActivity
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var btn_comit : Button
    lateinit var btn_PassDataIntent : Button
    lateinit var btn_PassObjectIntent : Button
    lateinit var btn_Firebase : Button
    lateinit var et_Et_LangAndroid : EditText
    lateinit var et_PassData : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById(R.id.text1)
        btn_comit = findViewById(R.id.btn_comit)
        btn_PassDataIntent = findViewById(R.id.btn_PassDataIntent)
        btn_PassObjectIntent = findViewById(R.id.btn_PassObjectIntent)
        btn_Firebase = findViewById(R.id.btn_Firebase)
        et_Et_LangAndroid = findViewById(R.id.et_Et_LangAndroid)
        et_PassData = findViewById(R.id.et_PassData)




       // text1.text = "this is amazing !!! "
        text1.text = intent.getStringExtra("NameListView")

        var TextViewName = intent.getStringExtra("NameListView")
        var TextViewLangAndroid =intent.getStringExtra("NameListView")



        btn_comit.setOnClickListener {
            var Et_LangAndroid = et_Et_LangAndroid.text

          //  text1.text = "this is amazing code  $Et_LangAndroid"

            startActivity(Intent(this,ListViewActivity::class.java))

        }

        btn_PassObjectIntent.setOnClickListener {

            var employes = Employes("mohamed","25","Nasr City","Cairo")
            startActivity(Intent(this,MainActivity2::class.java).putExtra("employes",employes))

        }

        btn_PassDataIntent.setOnClickListener {

            var Data = et_PassData.text.toString()
            var Data2 = et_Et_LangAndroid.text.toString()

            startActivity(Intent(this,MainActivity2::class.java)
                .putExtra("Data",Data)
                .putExtra("Data2",Data2))
        }

        btn_Firebase.setOnClickListener {

            startActivity(Intent(this,LoginFirebaseActivity::class.java))

        }
    }

}

class Employes (var name:String , var age:String , var address:String ,  var country:String):Serializable