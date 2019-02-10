package ru.epryakhin.study.kotlin.с6_Functions

fun main(args: Array<String>) {
    println(checkEven(3))
    println(checkEven(4))
    println(checkEven(5))
}

fun checkEven(num:Int) : String {
    return when {
        num % 2 == 0 -> "Even"
        else -> "Odd"
    }
}