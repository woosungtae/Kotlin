package com.example.test

class Bird2{
    var name:String
    var wing: Int
    var beak:String
    var color:String

    constructor(name1:String,wing1:Int,beak1:String,color1:String){
        name = name1
        wing = wing1
        beak = beak1
        color = color1
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
fun main(){
    val coco= Bird2("mybird",2,"short","blue")
    println("coco.color:${coco.color}")
    coco.fly()
    coco.sing(4)
}

