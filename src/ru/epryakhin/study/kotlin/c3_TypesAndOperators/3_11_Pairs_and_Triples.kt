package ru.epryakhin.study.kotlin.c3_TypesAndOperators

fun main(args: Array<String>) {

//    val coordinates: Pair<Int, Int> = Pair(3, 5)
    val coordinates = Pair(3, 5)
//    val coordinates = 3 to 5
    println(coordinates.first)
    println(coordinates.second)

    val (x, y) = coordinates
    println(x)
    println(y)

//    val coordinates3D: Triple<Int, Int, Int> = Triple(3, 4, 5)
    val coordinates3D = Triple(3, 4, 5)
//    val coordinates3D = 3 to 4 to 5
    println(coordinates3D.first)
    println(coordinates3D.second)
    println(coordinates3D.third)

    val (x1, y1, z1) = coordinates3D
    println(x1)
    println(y1)
    println(z1)

    val (x2, y2, _) = coordinates3D
    println(x2)
    println(y2)

}