package com.example.test


class Bird5 (name1:String,wing1:Int,beak1:String,color1:String){

    var name:String =name1
    var wing:Int =wing1
    var beak:String =beak1
    var color:String =color1
    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}
fun main(){
    val coco = Bird5("Youngbird",2,"long","red")
    println("coco.name:${coco.name},coco.wing:${coco.wing}")
    println("coco.color:${coco.color},coco.beak:${coco.beak}")
}




