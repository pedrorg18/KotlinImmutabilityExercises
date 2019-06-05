package com.pedroroig.example.kotlinimmutabilitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var person  = Person("François")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Modify person object François to be Pepe, without making name var nor using Person's constructor
        person = person.copy(name = "Pepe")

        // Should show initial value "François"
        tvHello.text = person.name
    }

}


data class Person (
    val name: String)