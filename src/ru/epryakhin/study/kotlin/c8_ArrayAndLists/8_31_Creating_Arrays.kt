package ru.epryakhin.study.kotlin.c8_ArrayAndLists

fun main(args: Array<String>) {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, "Alex", "Mary")
    for (index in 0 until numbers.size) {
        println(numbers[index])
    }

    val names = Array(5, { "John Doe" })
    println(names)

    val evenNumbers = intArrayOf(2, 4, 6, 8, 10)
//    val evenNumbers = intArrayOf(2,4,6,8,10, "Test")

}