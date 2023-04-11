package com.example.test

class LazyTest{
    init{
        println("init block")
    }
    val subject by lazy {
        println("lazy 초기화")
        "Kotlin Programming"
        "Java"
    }
    fun flow() {
        println("초기화 안됨")
        println("subject one:$subject")
        println("subject two:$subject")
    }
}
fun main(){
    val test = LazyTest()
    test.flow()
}