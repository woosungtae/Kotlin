package com.example.test


object OCustomer{
    var name ="Kildong"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("soccer")
    init {
        println("Init")
    }
}

class Hobby(var name:String)
fun main(){
    OCustomer.greeting()
    OCustomer.name="Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}