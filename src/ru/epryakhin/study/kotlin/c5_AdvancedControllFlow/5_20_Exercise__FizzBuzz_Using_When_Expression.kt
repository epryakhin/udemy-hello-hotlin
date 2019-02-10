package ru.epryakhin.study.kotlin.c5_AdvancedControllFlow

fun main(args: Array<String>) {

    val num = 13
    val result = when {
        num % 3 == 0 && num % 5 == 0 -> "Fizz Buzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> "Not Fizz Buzz"
    }
    print(result)

}