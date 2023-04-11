package com.example.test

class Pond(_name:String , _members:MutableList<Duck>){
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}
class Duck(val name:String){
    val duck3 = Duck("duck3")
}


fun main(){
    val pond = Pond("myfavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")


    pond.members.add(duck1)
    pond.members.add(duck2)

    println()
        println(duck1.name)

}

