package com.example.test

class Outer1{
    class Nested{
        fun accesttOuter(){
            println(country)
            getSomething()
        }
    }
    companion object {
        const val country = "Korea"
        fun getSomething()= println("Get something...")
    }
}
fun main(){
   val oo = Outer1.Nested().accesttOuter()
    println(oo)
}
