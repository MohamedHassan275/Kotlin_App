package com.mohamedhassan.kotlin_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapterList (context:Context , var resources: Int,var items : List<Person>)
    : ArrayAdapter<Person> (context,resources,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(resources,null)

        var imageView : ImageView = view.findViewById(R.id.imageView)
        var tv_Name : TextView = view.findViewById(R.id.tv_Name)
        var tv_Age : TextView = view.findViewById(R.id.tv_age)
        var tv_Address : TextView = view.findViewById(R.id.tv_address)

        var persons : Person = items[position]

        imageView.setImageDrawable(context.resources.getDrawable(persons.ImageView))
        tv_Name.text = persons.Name
        tv_Age.text = persons.Age
        tv_Address.text = persons.Address

        return view
    }
}