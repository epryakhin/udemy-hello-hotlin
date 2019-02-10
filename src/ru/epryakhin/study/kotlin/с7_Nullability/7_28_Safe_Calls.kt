package ru.epryakhin.study.kotlin.с7_Nullability

fun main (args : Array<String>) {

    val x : String? = "Vasya"
//    val x : String? = null

    if (x != null) {
        println(x.length)
    }

    println(x?.length)

    x?.let {
        val l = it.length
        println(it)
    }

}