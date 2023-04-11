package com.example.test

fun main(){

    for(i in 1..9 step 2){
        println(i)
    }
    println("------")
    for(x in 2..10 step 2){
        println(x)
    }
    println("------")
    var sum: Int= 0
    for (a in 1..10 step 2){
        sum += a
    }
    println(sum)
    println("------")
    var sum1: Int= 0
    for (a in 2..10 step 2){
        sum1 += a
    }
    println(sum1)
    println("------")
    for(b in 9 downTo 1 step 2){
        println(b)
    }

}

