package com.example.test

data class Customer1(var name: String, var email:String){
    var job: String = "Unknown"
    constructor(name: String,email: String,_job:String):this(name, email){
        job = _job
    }
    init {
      println("Init")
    }
}
fun main(){
    val cus1 = Customer1("Sean","sean@mail.com")
    val cus2 = Customer1("Sean","sean@mail.com")
    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()},${cus2.hashCode()}")
}

