package com.example.test

open class Bird100(var name:String, var wing:Int,var beak:String,var color:String){
    fun fly() = println("Fly wing:$wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}
class Parrot100(name:String,wing:Int=2,beak:String,color:String,var language:String="natural"):Bird100(name,wing,beak,color){
    fun speak() = println("Speak! $language")
    override fun sing(vol:Int){
        super.sing(vol)
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}
fun main(){
    val parrot2=Parrot100("woosungtae",4,"long","multipul")
    parrot2.sing(4)
}

