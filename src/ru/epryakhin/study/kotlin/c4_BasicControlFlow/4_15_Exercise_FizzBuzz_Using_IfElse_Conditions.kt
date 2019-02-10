package ru.epryakhin.study.kotlin.c4_BasicControlFlow

fun main(args: Array<String>) {

    val num = 7

    if (num % 3 == 0) {
        print("Fizz")
    }
    if (num % 5 == 0) {
        print("Buzz")
    }
    if (!(num % 3 == 0 || num % 5 == 0)) {
        print("Unknown")
    }

}