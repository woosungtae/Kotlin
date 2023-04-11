package com.example.test

class Wst

fun main(){
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(Wst())
}
fun cases(obj:Any){
    when(obj){
        1 -> println("Int: $obj")
        "Hello"-> println("String:$obj")
        is Long -> println("Long:$obj")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

