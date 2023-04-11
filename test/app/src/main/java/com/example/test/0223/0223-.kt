package com.example.test

class GenericNull<T> { // 기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}
fun main(args: Array<String>) {
    val obj = GenericNull<String>() // non-null로 선언됨
    obj.EqualityFunc("Hello", "Hello") // null이 허용되지 않음
    val obj2 = GenericNull<Int?>() // null이 가능한 형식으로 선언됨
    obj2.EqualityFunc(null, 10) // null 사용
}