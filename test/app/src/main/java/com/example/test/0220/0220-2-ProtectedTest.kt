package com.example.test

open class Base1{
    protected var i = 1
    protected fun protectedFunc(){
        i += 1
    }
    fun access(){
        protectedFunc()
        println(i)
    }

    protected class Nested

}
class Derived : Base1(){
    protected val base1 = protectedFunc()
    fun test(base: Base1):Int{
        println(base1)
        println(i)
        return i
    }
}
fun main(){
    println()
    val base = Base1()
    //base.i
    //base.protectedFunc()
    base.access()
}

