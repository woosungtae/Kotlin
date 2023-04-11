package com.example.test.`0214`

fun main() {
    var map = mapOf<String,String>(Pair("one","hello"), "two" to "world")
    println("map size: ${map.size}")
    println("map data: ${map.get("one")}, ${map.get("two")}")

}