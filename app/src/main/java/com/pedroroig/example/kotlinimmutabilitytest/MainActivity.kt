package com.pedroroig.example.kotlinimmutabilitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val person  = Person("François")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        storeInProperties(person)

        // Should show initial value "François"
        tvHello.text = person.name
    }

    private fun storeInProperties(person: Person) {
        // Do stuff to store in prefs
        // ...

        person.name = "Pepe"
    }
}


class Person (
    var name: String)