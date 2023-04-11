package com.example.test

open class First{
    open val x:Int=0
    get(){
        println("First x")
        return field
    }
    val y:Int = 0
}
class Second:First(){
    override val x:Int = 0
    get(){
        println("Second x")
        return field + 3
    }
    //override val y:Int= 0  // 오버라이딩 불가 final
}
fun main(){
    val second = Second()
    println(second.x)
    println(second.y)
}

