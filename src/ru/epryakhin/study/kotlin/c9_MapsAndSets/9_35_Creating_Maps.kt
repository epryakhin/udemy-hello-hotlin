package ru.epryakhin.study.kotlin.c9_MapsAndSets

fun main(args: Array<String>) {

    val airports = mapOf("SVO" to "Шереметьево", "DME" to "Домодедово")
    println(airports["SVO"])
    println(airports["VKO"])

    // doesn't compile
//    airports["VKO"] = "Внуково"

    val mutableAirports =airports.toMutableMap()
    mutableAirports["VKO"] = "Внуково"
    println(mutableAirports["VKO"])

    println()
    println("Map metadata")
    println("Size: ${mutableAirports.size}")
    println("Is empty: ${mutableAirports.isEmpty()}")

    println()
    val removeKey = "VKO"
    println("Before removal: $mutableAirports")
    println(" removing \"$removeKey\"...")
    mutableAirports.remove(removeKey)
    println("After removal: $mutableAirports")

    println()
    println("Iterate using tuples")
    for ((shortName, name) in mutableAirports) {
        println("$shortName - $name")
    }

    println()
    println("Iterate through keys")
    for (key in mutableAirports.keys) {
        println(key)
    }
}