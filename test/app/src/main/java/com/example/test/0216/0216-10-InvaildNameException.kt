package com.example.test

import java.lang.Exception

class InvalidNameException(message: String) : Exception(message)

fun main(){
    var name ="Sungtae123"
    try{
        validateName(name)
    }catch(e: InvalidNameException){
        println(e.message)
    }catch (e: Exception){
        println(e.message)
    }
}
fun validateName(name:String){
    if(name.matches(Regex(".*\\d+.*"))){
        throw InvalidNameException("Your name : $name : 숫자가 포함되었습니다")
    }
}


