package com.example.test

import java.lang.Exception


fun main(){
    val a = 6
    val b = 3
    val c : Int

    try {
        c = a/b
        println(c)
    }catch (e: Exception){
        println("Exception is handled")
    }finally {
        println("finally")
    }
}
