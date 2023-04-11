package com.example.test

private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        i += 1
    }
    fun access(){
        privateFunc()
        println("1")
    }
}
class OtherClass{
 private val opc = PrivateClass()
    fun test() {
            val pc = PrivateClass()
        println("2")

    }
}
private fun main(){
    val opc =PrivateClass()


}
fun Topfunction() {
    val tpc = PrivateClass()
}
