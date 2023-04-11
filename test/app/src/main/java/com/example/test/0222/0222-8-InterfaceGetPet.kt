package com.example.test

interface Pet1{
    var category:String
    val msgTags:String
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}
class Dog(override var category: String):Pet1{
    override fun feeding() {
        println("Feed the dog a meat!")
    }
}
fun main(){
    val obj= Dog("small")
    println("Pet1 Message Tags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}
