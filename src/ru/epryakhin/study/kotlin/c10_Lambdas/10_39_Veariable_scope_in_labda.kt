package ru.epryakhin.study.kotlin.c10_Lambdas

fun main(args: Array<String>) {
    println("Increment using inplace capture")
    var counter = 0
    val incrementCounter = {
        counter += 1
    }
    incrementCounter()
    incrementCounter()
    println(counter)
    println()

    println("Increment using lamda instance, from function")
    val counter2 = countingLamda()
    println(counter2())
    println(counter2())
    println()

    println("Increment using another lamda instance, from function")
    val counter3 = countingLamda()
    println(counter3())
    println(counter3())
    println(counter3())
    println()
}

fun countingLamda() : () -> Int {
    var counter = 0
    val incrementCounter : () -> Int = {
        counter += 1
        counter
    }
    return incrementCounter
}