package com.example.test

fun main(){
    retFunc()
}
 inline fun inlineLambda1(a: Int, b: Int, out: (Int, Int) -> Unit){
     out(a,b)
 }
fun retFunc(){
    println("start of retFunc")
    inlineLambda1(13,3){ a,b->
        val result = a+b
        if(result > 10) return
        println("result: $result")
    }
    println("end of retFunc")
}

