package com.example.test

fun main(){

    val getMessage = fun(num:Int): String{
        if (num !in 1..100){
            return "Error"
        }
        return "Success"
    }
    val result = getMessage(105)
    println(result)
}


