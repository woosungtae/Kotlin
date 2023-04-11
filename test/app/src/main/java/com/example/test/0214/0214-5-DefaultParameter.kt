package com.example.test.`0214`

fun main(){
    val name= "우성태"
    val email= " wst@example.kr"

    add(name)
    add(name,email)
    add("둘리","dooly@example.co.kr")
    defaultArgs()
    defaultArgs(200)
}
fun add(name: String , email:String ="abc"){
    val output = "${name}의 이메일은 ${email}"
    println(output)
}
fun defaultArgs(x:Int=100,y:Int=200){
    println(x+y)
}
