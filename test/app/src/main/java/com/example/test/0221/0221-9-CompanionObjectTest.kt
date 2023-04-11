package com.example.test

class Person21{
    var id: Int = 0
    var name:String = "sungtae"
    companion object{
        var language:String = "Korean"
                fun work(){
                    println("working")
                }
    }
}
fun main(){
    println(Person21.language)
    Person21.language = "English"
    println(Person21.language)
    Person21.work()
}

