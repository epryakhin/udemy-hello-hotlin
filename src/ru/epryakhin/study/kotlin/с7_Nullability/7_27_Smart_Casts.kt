package ru.epryakhin.study.kotlin.с7_Nullability

fun main(args: Array<String>) {

    var x : Int? = null
//    var x : Int? = 2

    if (x != null) {
        x = x +1
        print(x)
    } else {
        print("x is null")
    }

}