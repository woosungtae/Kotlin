package com.example.test

class Bird4 constructor(name1:String,wing1:Int,beak1:String,color1:String){

    var name:String =name1
    var wing:Int =wing1
    var beak:String =beak1
    var color:String =color1
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}




