package ru.epryakhin.study.kotlin.с7_Nullability

fun main(args: Array<String>) {

    println(divide(10,5))
    println(divide(10,3))

}

fun divide(a: Int, b: Int): Int? {
    val quotient = a/b
    val remainder = a % b
    return if (remainder == 0) quotient else null
}