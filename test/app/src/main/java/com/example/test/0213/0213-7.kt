package com.example.test.`0213`

fun main() {
    checkArg("Hello")
    checkArg(5)
    checkArg("wst")
}

fun checkArg(x:Any){
    if ( x is String) {
        println("x is String: $x")
    }
    if(x is Int){
        println("x is int: $x")
    }
}