package com.example.test

class Bird3 {
    var name:String
    var wing:Int
    var beak:String
    var color:String
    constructor(name:String,wing:Int,beak:String,color:String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    constructor(name2: String, beak2:String){
        name = name2
        wing = 2
        beak = beak2
        color = "gray"
    }
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}
fun main(){
    val bird1 = Bird3("mybird1", 2, "short", "blue")
    val bird2 = Bird3("mybird2","long")
    println("bird1.color: ${bird1.color}")
    println("bird2.color: ${bird2.color}")
    bird1.fly()
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)

}

