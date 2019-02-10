package ru.epryakhin.study.kotlin.c8_ArrayAndLists

fun main(args: Array<String>) {

    val names = listOf("Mary", "John", "Mark", "Vasya")
//    val members : List<String> = listOf()
//    val members = listOf<String>()

    val members = mutableListOf<String>()
    printListState(members)
    members.add("John")
    printListState(members)

    members.add("Steve")
    members.add("Mary")
    println("Whole list: " + members.toString())
    println("First: " + members.first())
    println("Last: " + members.last())
    println("Second: " + members[1])
    println("Sublist 0..1: " + members.slice(0..1).toString())
    println("List contains \"John\": " + members.contains("John"))
    println("List contains \"John\" #2: " + ("John" in members))
}

fun printListState(list: List<String>) {
    if (list.isEmpty()) {
        println("Members list is empty")
    } else {
        println("Members list is not empty")
    }
}