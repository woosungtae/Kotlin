package com.example.test.`0214`

fun main() {
    var x =4
    var y = 0b0000_1010
    var z = 0x0F

    println("x hl 2 -> ${x shl 2}")

    println("y shr 2 - > ${y/4} , ${y shr 2}")
    println("x shl 4 - > ${x*16}, ${x shl 4}")
    println("z shl 4 - > ${z*16}, ${z shl 4}")

    x= 64
    println("x shr 4 -> ${x/4} ${x shr 2}")

}