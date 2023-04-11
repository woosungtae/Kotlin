package com.example.test

data class Customer2(var name:String, var email:String){
    var job:String = "Unknown"
    constructor(name:String,email: String,_job:String):this(name,email){
        job = _job
    }
    init {
        println("init")
    }
}

fun main(){
    val cus1 = Customer2("Sean","sean@mail.com")
    val cus3= cus1.copy(name="Alice")
    println(cus1.toString())
    println(cus3.toString())

}