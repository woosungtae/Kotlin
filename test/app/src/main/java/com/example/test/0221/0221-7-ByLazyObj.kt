package com.example.test

class Person20(val name:String, val age:Int)

fun main(){
    var isPersonInstantiated: Boolean = false

    val person : Person20 by lazy{
        isPersonInstantiated = true
        Person20("woo",26)
    }
    val personDelegate = lazy{Person20("Hong",40)}

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init:${personDelegate.isInitialized()}")

    println("person.name:${person.name}")
    println("personDelegate.value.name =${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init:${personDelegate.isInitialized()}")
}
