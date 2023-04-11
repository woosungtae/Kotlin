package com.example.test.`0213`

fun main(){
    val a: Any="lllllll"

    if(a is Int){
        print(a)
    }else if(a !is Int){
        print("Not a Int")
    }
}