package ru.epryakhin.study.kotlin.c9_MapsAndSets

fun main(args: Array<String>) {

    println("Removing duplicates from array using sets")
    println()

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 3, 4, 2, 1, 22)
    print("Source array: ")
    printArray(numbers)
    println()
    val set = setOf(*numbers)
    val duplicatesFreeArray = set.toIntArray()
    print("Array with removed duplicates: ")
    printArray(duplicatesFreeArray)
}

fun printArray(arr: IntArray) {
    for (i in 0 until arr.size) {
        print(arr[i])
        print(' ')
    }
}

fun printArray(arr: Array<Int>) {
    for (i in 0 until arr.size) {
        print(arr[i])
        print(' ')
    }
}

