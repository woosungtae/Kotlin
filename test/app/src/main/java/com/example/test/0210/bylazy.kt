package com.example.test.`0210`

val data4: Int by lazy{
    println("in lazy")
    10
}
fun main() {
    println("in main")
    println(data4 + 10)
    println(data4 + 10)
}

