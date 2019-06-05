package com.pedroroig.example.kotlinimmutabilitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = listOf(Person("François"), Person("Pepe"))

        // TODO Add Julie to the List
//        personList.add(Person("Julie"))

        var chainedNames = ""
        personList.forEach { chainedNames += it.name + " " }

        // Should print three names
        tvHello.text = chainedNames
    }

}


data class Person (
    val name: String)