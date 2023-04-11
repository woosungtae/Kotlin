package com.example.test.`0213`

fun main(){
    val a: Int = 128
    val b= a
    println(a === b)
    val c: Int? = b
    val d: Int? = a


    println(a===d)
    println(a===b)
    println(a===c)
    println(d===c)
}