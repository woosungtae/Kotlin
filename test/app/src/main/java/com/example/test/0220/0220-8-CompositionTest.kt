package com.example.test

class Car(val name:String, val power:String){

    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}
class Engine(power:String){
    fun start() = println("엔진 시작")
    fun stop() = println("엔진 멈춤")
}
fun main(){
    val car = Car("tico","100hp")
    println(car.name)
    println(car.power)
    car.startEngine()
    car.stopEngine()
}
