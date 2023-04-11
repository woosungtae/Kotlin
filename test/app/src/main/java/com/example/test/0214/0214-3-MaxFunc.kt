package com.example.test.`0214`


import kotlin.math.max
import kotlin.math.min

fun main(){
    val num1 = 10
    val num2 = 3
    val result: Int
    val result1: Int


    result = max(num1,num2) //최댓값
    result1 = min(num1,num2) //최솟값


    println(result)
    println(result1)


}

fun max(a:Int, b :Int) = if (a>b) a else b

