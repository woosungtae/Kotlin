package com.example.test

data class Pointt(val x:Int,val y:Int)

operator fun Pointt.unaryMinus() = Pointt(-x,-y)

fun main(){
    val pointt = Pointt(10,20)
    val pointt1 = Pointt(-10,-20)
    println(-pointt)
    println(-pointt1)
}

