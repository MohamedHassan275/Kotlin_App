package com.mohamedhassan.kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ListViewActivity : AppCompatActivity() {

    lateinit var ListView : ListView
    lateinit var ListViewPosion : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        ListView = findViewById(R.id.ListView)
        ListViewPosion = findViewById(R.id.ListViewPosion)


        var ListViewName = arrayOf("Mohamed","Ahmed","Islam","Mahmoud","Hossam","Fatma","Reham")
        ListView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ListViewName)

        ListView.setOnItemClickListener{
            parent: AdapterView<*>?, view: View?, position: Int, l: Long ->
            ListViewPosion.text = ListViewName[position]
            var NameListView = ListViewName[position]
            Toast.makeText(this,"this position is " + ListViewName[position],Toast.LENGTH_LONG).show()
            startActivity(Intent(this,MainActivity::class.java).putExtra("NameListView",NameListView))
        }


    }
}