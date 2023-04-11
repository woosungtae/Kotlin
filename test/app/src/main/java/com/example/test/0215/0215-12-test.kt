package com.example.test



fun main(){
    print("직급: ")
    var grade = readLine()!!.toString()
    var score:Int = 100

    when(grade) {
        "부장" -> score = 600
        "차장" -> score = 500
        "과장" -> score = 400
        "대리" -> score = 300
        "사원" -> score = 200
    }
    println("${grade} ${score}")
}