package ru.epryakhin.study.kotlin.c9_MapsAndSets

fun main(args: Array<String>) {

    println("Simple set")
    val names = setOf("Лёха", "Вася", "Маша")
    println("Set: $names")

    println()
    println("Creating set from array")
    val numbers  = arrayOf(1,2,3,41,232,1)
    println("Array: $numbers")
    val numbersSet = setOf(numbers)
    println("Set with array inside: $numbersSet")
    val numbersSetWithNumbers = setOf(*numbers)
    println("Set with numbers inside: $numbersSetWithNumbers")

    println()
    println("Contains")
    val element = 3
    val contains = numbersSetWithNumbers.contains(element)
    println("Set $numbersSetWithNumbers contains $element: $contains")
    println("With short notation: ${3 in numbersSetWithNumbers}")

    println()
    val mutableSet = mutableSetOf(*numbers)
    val valueToAdd = 10
    println("Before add: $mutableSet")
    mutableSet.add(valueToAdd)
    println("After add [$valueToAdd]: $mutableSet")

    println()
    val expectedRemove = 3;
    val unexpectedRemove = 111;
    println("Before removing: $mutableSet")
    var remove = mutableSet.remove(expectedRemove)
    println("After remove [$expectedRemove], result [$remove]: $mutableSet")
    remove = mutableSet.remove(unexpectedRemove)
    println("After remove [$unexpectedRemove], result [$remove]: $mutableSet")




}