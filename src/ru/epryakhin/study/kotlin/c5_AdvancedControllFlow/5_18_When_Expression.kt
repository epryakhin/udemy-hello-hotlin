package ru.epryakhin.study.kotlin.c5_AdvancedControllFlow

fun main(args: Array<String>) {

    val num = 10
    when (num) {
        10 -> print("its a 10")
        else -> print("this is not a ten")
    }
    println()

    val pet = "Cat"
    when(pet) {
        "Dog" -> print("this is a dog")
        "Cat" -> print("this is a cat")
        else -> print("unknown pet")
    }
    println()

    val age = 60
    val s = when (age) {
        in 0..2 -> "infant"
        in 3..12 -> "Child"
        in 12..18 -> "Teenager"
        in 19..55 -> "Adult"
        else -> "Aged"
    }
    println(s)

}