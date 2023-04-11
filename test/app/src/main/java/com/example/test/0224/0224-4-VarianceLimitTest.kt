package com.example.test

open class Animal1(val size:Int){
    fun feed() = println("Feeding")
}

class Catt(val jump:Int) :Animal1(50)

class Spider(val poison:Boolean) :Animal1(1)

class Boxx<out T:Animal1>(val element: T){
    fun getAnimal(): T = element
}

fun main(){
    val c1:Catt = Catt(10)
    val s1:Spider = Spider(true)

    var a1: Animal1 = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: Boxx<Animal1> = Boxx<Catt>(Catt(10))
    println("c2.element.size = ${c2.element.size}")
}
