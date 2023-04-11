package com.example.test

class Calc4<T: Number>{
    fun plus(arg1: T, arg2: T):Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main(args: Array<String>){
    val calc = Calc4<Int>()
    println(calc.plus(10,20))

    val calc2 = Calc4<Double>()
    val calc3 = Calc4<Long>()
    //val calc4 = Calc4<String>()  number 형 이므로 오류 발생함


    println(calc2.plus(2.5,1.3))
    println(calc3.plus(5L,123L))

}

