package ru.epryakhin.study.kotlin.с7_Nullability

fun main(args: Array<String>) {
    convertAndPrint("10")
    convertAndPrint("asd")
}

fun convertAndPrint(arg: String) {
    val integer: Int? = arg.toIntOrNull()
    println(integer)
}