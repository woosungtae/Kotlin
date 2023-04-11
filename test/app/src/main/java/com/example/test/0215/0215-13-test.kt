package com.example.test

fun main(){
    print("Enter ther score:")
    var score = readLine()!!.toDouble()
    var grade: Char= 'F'

    when{
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score in 60.0..69.9 -> grade = 'D'
        score in 50.0..59.9 -> grade = 'E'
        score < 50.0 -> grade = 'F'
    }
    println("$score, $grade")
}