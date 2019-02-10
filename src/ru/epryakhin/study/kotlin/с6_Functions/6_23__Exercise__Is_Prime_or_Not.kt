package ru.epryakhin.study.kotlin.с6_Functions

fun main(args: Array<String>) {
    println(isPrime(3))
    println(isPrime(12))
    println(isPrime(23))
}

fun isPrime(num: Int): Boolean {
    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}