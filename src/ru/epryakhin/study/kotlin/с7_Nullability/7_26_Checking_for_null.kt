package ru.epryakhin.study.kotlin.с7_Nullability

fun main(args: Array<String>) {

    var age: Int? = 32

    println(age)
    age = age!! + 1
    println(age)
    age = null
    age = age!! + 1
    println(age)

}