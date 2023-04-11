package com.example.test


class Outer{
    val ov =5
    class Nested{
        val nv = 10
        fun greeting() = "[Nested]Hello! $nv"
    }
    fun outside(){
        val msg= Nested().greeting()
        println("[Outer]:$msg,${Nested().nv}")
    }
}
fun main(){
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    outer.outside()

    val op = outer.ov
    val o = Outer.Nested().nv
    println("$op"+"$o")
}