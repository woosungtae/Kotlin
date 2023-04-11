package com.example.test

interface Pet2{
    var category:String
    val msgTags: String
    get() = "I'm your lovely pet!"
    fun feeding()
    fun patting(){
        println("Keep Patting!")
    }
}
open class Animal(val name:String)

class Dog1(name: String,override var category: String):Animal(name),Pet2{
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat1(name:String,override var category: String):Animal(name),Pet2{
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
class Master{
    fun playWithPet(dog:Dog1){
        println("Enjoy with my ${dog.name}")
    }
    fun playWithPet(cat:Cat1){
        println("Enjog with my ${cat.name}")
    }
}

fun main(){
    val master = Master()
    val dog = Dog1("Dubu","Small")
    val cat = Cat1("Coco","BigFat")
    master.playWithPet(dog)
    println("dog name:${dog.name}")
    master.playWithPet(cat)
    println("cat name:${cat.name}")

}
