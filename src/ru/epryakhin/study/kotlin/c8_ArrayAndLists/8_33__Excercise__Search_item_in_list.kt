package ru.epryakhin.study.kotlin.c8_ArrayAndLists

fun main(args: Array<String>) {

    var names = listOf<String>("Mary", "John")
    println("Simple contains")
    printAndCallContains("Mary", names, ::contains)
    printAndCallContains("Vasya", names, ::contains)
    println()
    println("Optimized contains")
    printAndCallContains("Mary", names, ::containsOptimized)
    printAndCallContains("Vasya", names, ::contains)

}

fun printAndCallContains(candidate: String, src: List<String>, function: (String, List<String>) -> Boolean) {
    println("Search $candidate in $src: " + function(candidate, src))
}

fun containsOptimized(candidate: String, src: List<String>): Boolean {
    return candidate in src;
}

fun contains(candidate: String, src: List<String>): Boolean {
    var found = false
    for (i in 0 until src.size) {
        if (src[i].equals(candidate)) {
            found = true
            break
        }
    }
    return found
}