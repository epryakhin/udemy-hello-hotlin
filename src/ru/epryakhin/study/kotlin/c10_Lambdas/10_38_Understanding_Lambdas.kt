package ru.epryakhin.study.kotlin.c10_Lambdas

fun main(args: Array<String>) {
    val add: (Int, Int) -> Int
    add = { a: Int, b: Int ->
        Int
        a + b
    }
    val result = add(2, 3)
    println("add $result")

    val square = { a: Int ->
        Int
        a * a
    }
    println("square(5) = ${square(5)}")

    val square2: (Int) -> Int = {
        it * it
    }
    println("square2(3) = ${square2(3)}")
    println()

//    doesn't compile because of lambda type mismatch
//    printResult(3,5, square)

    printResult(3, 5, add)
    println()

    println("Printing array using lamba: ")
    val numbers  = listOf<Int>(4,56, 34,12,1)
    numbers.forEach {
        println("\t${it}")
    }
    println()

    val largerThen5 = numbers.filter {
        it > 5
    }
    println("Array with larger than 5: ${largerThen5}")
    println()

//    var sum: Int = 0
    val sum = numbers.fold(0, add)
    println("Numbers fold with sum result: ${sum}")
    println()

    val squared = numbers.map(square)
    println("Numbers source ${numbers}, after map with square ${squared}")
    println()
}

fun printResult(a: Int, b: Int, op: (Int, Int) -> Int) {
    println("Print result of { $op($a, $b) }: ${op(a, b)}")
}