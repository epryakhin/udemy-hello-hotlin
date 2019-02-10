package ru.epryakhin.study.kotlin.c8_ArrayAndLists

fun main (args: Array<String>) {

    val numbers = mutableListOf<Int>(1,3,2)
    sort(numbers)
    println(numbers)

}

fun sort(list: MutableList<Int>) {
    for (i in 0 until list.size) {
        for (j in i+1 until list.size) {
            if (list[i] > list[j]) {
                val tmp = list[i]
                list[i] = list[j]
                list[j] = tmp
            }
        }
    }
}