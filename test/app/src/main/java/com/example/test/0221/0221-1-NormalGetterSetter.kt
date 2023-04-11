package com.example.test

class user(_id:Int,_name:String,_age:Int){
    val id:Int= _id
    get() = field

    var name:String=_name
    get() = field
    set(value) {
        field = value
    }

    var age:Int=_age
    get() = field
    set(value) {
        field=value
    }
}
fun main(){
    var user1 = user(1,"kildong",30)
    println()
    // user1.id=2 val 변경불가
   // user1.age = 35
   // println("user1.age = ${user1.age}")
}

