package com.example.test

abstract class Vehicle(val name:String,val color:String, val weight:Double){
    abstract var maxSpeed:Double
    var year = "2018"
    abstract fun start()
    abstract fun stop()
    fun displaySpecs(){
        println("Name:$name,Color:$color,Weight:$weight,Year:$year,Max speed:$maxSpeed")
    }
}
class Matiz(name:String,color: String,weight: Double,override var maxSpeed: Double)
    :Vehicle(name,color,weight){
     override fun start(){
         println("Car Started")
     }

    override fun stop() {
        println("Car Stopped")
    }
    }
class Motercycle(name:String,color: String,weight: Double,override var maxSpeed: Double)
    :Vehicle(name,color,weight){
    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }
    }
fun main(){
    val maitz = Matiz("SuperMatiz" , "yellow" , 1111.0 , 270.0)
    val moter = Motercycle("DreamBike" , "red" , 173.0 , 100.0)

    maitz.year="2022"

    maitz.displaySpecs()
    maitz.start()
    moter.displaySpecs()
    moter.start()

}

