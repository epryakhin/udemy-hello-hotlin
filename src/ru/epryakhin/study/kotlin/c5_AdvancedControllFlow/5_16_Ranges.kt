package ru.epryakhin.study.kotlin.c5_AdvancedControllFlow

fun main(args: Array<String>) {

    val range = 0..5
    for (i in range) {
        print(i)
        print(" ")
    }
    println()

    val range2 = 0 until 5
    for (i in range2) {
        print(i)
        print(" ")
    }
    println()

    val range3 = 5..0
    for (i in range3) {
        print(i)
        print(" ")
    }
    println()

    val range4 = 5 downTo 0
    for (i in range4) {
        print(i)
        print(" ")
    }
    println()

}