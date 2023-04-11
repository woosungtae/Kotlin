package com.example.test

interface Switcher{
    fun on():String
}
class Smartphone(val model:String){
    private val cpu ="Exynos"
    inner class ExternalStorage(val size:Int){
        fun getInfo() = "${model}:Installed on $cpu with ${size}Gb"
    }
    fun powerOn():String{
        class Led(val color: String,val size: Int){
            fun blink():String = "Blinking $color on $model with ${size}Gb"
        }
        val powerStatus = Led("Red",333)
        val powerSwitch = object :Switcher{
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}
fun main(){
    val dd =Smartphone("s20+").ExternalStorage(64)
    println(dd.getInfo())
    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
    val output = Smartphone("x7")
    val sol =output.powerOn()
    println("$sol")
}

