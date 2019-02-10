package ru.epryakhin.study.kotlin.c5_AdvancedControllFlow

fun main(args : Array<String>) {

    for (i in 0..5) {
        print(i)
        print(" ")
    }
    println()

    for (i in 0..10 step 2) {
        print(i)
        print(" ")
    }
    println()

    for (i in 10 downTo 5 step 2) {
        print(i)
        print(" ")
    }
    println()

}