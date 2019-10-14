package com.example.listdynamic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = mutableListOf(
            "JavaScript", "Python", "Java", "C/CPP", "PHP",
            "Swift", "Kotlin", "C#", "Ruby", "Haskell", "Objective-C", "Go", "Rust", "Elm"
        )
        val arrayAdapter =
            ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, data)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = arrayAdapter
    }
}
