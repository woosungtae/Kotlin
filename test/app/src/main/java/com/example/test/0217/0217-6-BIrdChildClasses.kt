package com.example.test

open class Bird10(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
class Lark(name:String,wing: Int,beak: String,color: String):Bird10(name,wing,beak,color){
    fun sigHitone() = println("Happy Song")
}
class Parrot : Bird10{
    val language: String

    constructor(name:String,wing: Int,beak: String,color: String,language:String):super(name,wing,beak,color){
        this.language = language
    }
    fun speak() = println("Speak! $language")
}
fun main(){
    val coco= Bird10("mybird",2,"short","blue")
    val lark= Lark("mylark",2,"long","brown")
    val parrot = Parrot("myparrot",2,"short","multiple","korean")

    println("Coco: ${coco.name},${coco.wing},${coco.beak},${coco.color}")
    println("Lark: ${lark.name},${lark.wing},${lark.beak},${lark.color}")
    println("Parrot: ${parrot.name},${parrot.wing},${parrot.beak},${parrot.color},${parrot.language}")

    lark.sigHitone()
    parrot.speak()
    lark.fly()
}

