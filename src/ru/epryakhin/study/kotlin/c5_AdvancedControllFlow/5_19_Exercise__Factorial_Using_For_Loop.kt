package ru.epryakhin.study.kotlin.c5_AdvancedControllFlow

fun main(args: Array<String>) {

    val num = 10
    var factorial = 1

    for (i in 1..num) {
        factorial *= num
    }
    print(factorial)

}