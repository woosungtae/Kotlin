package com.example.test

class User1(_id:Int, _name:String, _age:Int){
    val id:Int=_id
    var name:String = _name
    set(value){
        println("The name was changed")
        field = value.toUpperCase()
    }

    var age:Int=_age
}
fun main(){
    val user2 = User1(1,"kildong",23)
    user2.name = "wst"
    println("user2.name=${user2.name}")
}

