package com.example.test

abstract class Printer{
    abstract fun print()
}
val myprinter = object :Printer() {
    override fun print() {
        println("출력합니다.")
    }

}
fun main(){
    myprinter.print()
}

