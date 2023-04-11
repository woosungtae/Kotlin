package com.example.test.`0213`

fun main(){
    fun sum(no: Int): Int{
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return sum

    }
    val name:String ="wst"
    println("name : $name, sum:${sum(5)}, plus : ${10+20}")
}