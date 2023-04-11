package com.example.test

import android.view.textclassifier.TextLanguage

open class Bird11(var name:String,var wing:Int,var beak:String,var color:String){
    fun fly() = println("Fly wing:$wing")
    open fun sing(vol:Int)= println("Sing vol:$vol")
}
class Parrot1(name:String,wing:Int=2,beak:String,color: String,var language: String="natural"):Bird11(name,wing,beak,color){
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}
fun main(){
    val parrot = Parrot1(name="myparrot",beak="short",color="multiple")
    parrot.language = "English"
    println("Parrot: ${parrot.name},${parrot.wing},${parrot.beak},${parrot.color},${parrot.language}")
    parrot.sing(5)
}

