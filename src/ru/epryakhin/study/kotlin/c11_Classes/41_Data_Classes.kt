package ru.epryakhin.study.kotlin.c11_Classes

fun main (args: Array<String>) {

    val coordinates1 = Coordinates(12.23, 45.56)
    val coordinates2 = Coordinates(12.23, 45.56)
    println("Coordinates equals: ${coordinates1 == coordinates2}")

    val coordinatesData1 = CoordinatesData(12.23, 45.56)
    val coordinatesData2 = CoordinatesData(12.23, 45.56)
    println("Coordinates (as data class) equals: ${coordinatesData1 == coordinatesData2}")
}

class Coordinates(val latitude: Double, var longtitude: Double) {

}

data class CoordinatesData(val latitude: Double, var longtitude: Double) {

}