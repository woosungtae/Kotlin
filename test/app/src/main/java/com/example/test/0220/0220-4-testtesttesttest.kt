package com.example.test

open class Base2{
    private val a = 1
    protected open val b = 2
    internal  val c = 3
    val d =4
    protected class Nested {

        public val e :Int = 5
        private val f :Int= 6
    }
}
class Dervied:Base2(){
    override val b= 5
}
class Other1(base:Base2){
   public val a = base.c
}
fun main(){

}


