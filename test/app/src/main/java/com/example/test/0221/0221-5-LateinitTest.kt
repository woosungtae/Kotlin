package com.example.test

class Person5{
    lateinit var name:String

    fun test(){
        if(!::name.isInitialized){
            println("초기화 안됨")
        }else{
            println("초기화 완료")
        }
    }
}
fun main(){
    val kildong = Person5()
    kildong.test()
    kildong.name ="kildong"
    kildong.test()
    println("name=${kildong.name}")
}
