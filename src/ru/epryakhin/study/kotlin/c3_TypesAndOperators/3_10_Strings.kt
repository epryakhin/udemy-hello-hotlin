package ru.epryakhin.study.kotlin.c3_TypesAndOperators

fun main(args :Array<String>) {

    var john : String = "John"
    val doe = "Doe"

    john += doe
    println(john)

    val name = "Evgeny"
    val greeting = "Hello ${name}"
    println(greeting)

    val x = 10
    val y = 5
    println("x + y = ${x + y}")

    val bigString = """

        This is line 1
        Это строка 2
        One more string
    """.trimIndent()
    println(bigString)

}