package ru.epryakhin.study.kotlin.c4_BasicControlFlow

fun main(args: Array<String>) {

    val num = 16

    var result = 1
    var current = num
    while (current > 0) {
        result *= current
        current--
    }

    println("Factorial of [$num] is [$result]")

}