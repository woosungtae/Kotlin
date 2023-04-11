package com.example.test

import java.lang.Integer.parseInt

fun main() {
    when (5) {
        in 1..10 -> print("x는 1이상 10 이하입니다")
        !in 10..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않습니다")
        else -> print("x는 어떤범위에도 없습니다.")
    }
    println("-------------------------------------")
    var str ="안녕하세요"
    val result = when(str){
        is String ->print("문자열입니다.")
        else -> print("false")

    }
}
