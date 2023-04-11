package com.example.test

import java.util.*

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5, 8)
    println("arr: ${Arrays.toString(arr)}") // Arrays.toString()은 배열의 내용을 문자열로 변환함
    println("size: ${arr.size}") // size 는 배열의 크기를 나타냄
    println("sum(): ${arr.sum()}") // sum()메서드는 배열의 합을 계산해 줌
// 게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])
// 세터에 의한 값의 설정
    arr.set(1, 5)
    arr[0] = 3
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")
// 루프를 통한 배열 요소의 접근
    for (i in 0..arr.size -1) {
        println("arr[$i] = ${arr[i]}")
    } }