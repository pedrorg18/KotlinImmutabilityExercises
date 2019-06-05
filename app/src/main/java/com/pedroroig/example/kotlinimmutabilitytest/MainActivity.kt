package com.pedroroig.example.kotlinimmutabilitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // TODO AVOID the crash
    // We want an immutable property for the TextView
    private val textView: TextView = findViewById(R.id.tvHello)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = getString(R.string.act_created)
    }
}
