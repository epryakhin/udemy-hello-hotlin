package ru.epryakhin.study.kotlin.c4_BasicControlFlow

fun main (args : Array<String>) {

    val beer = 3
    val person = "Vasya"

    if (beer > 3 && person == "Vasya") {
        println("Vasya drink too mach")
    } else if (beer < 2) {
        println("Not too mach")
    } else {
        println("Not beer. ЗОЖ")
    }

}