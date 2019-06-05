package com.pedroroig.example.kotlinimmutabilitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // We want an immutable property for the TextView
    private val textView: TextView by lazy {
        // Will be called once the property is accessed
        findViewById<TextView>(R.id.tvHello)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = getString(R.string.act_created)
    }
}
