package ru.epryakhin.study.kotlin.с7_Nullability

fun main(args:Array<String>) {

    checkAndPrint("test")
    checkAndPrint(null)

}

fun checkAndPrint(s : String?) {

    val result = s ?: "<empty>"
    println(result)

}
