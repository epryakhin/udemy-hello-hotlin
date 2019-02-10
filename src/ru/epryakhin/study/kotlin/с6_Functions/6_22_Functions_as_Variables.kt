package ru.epryakhin.study.kotlin.с6_Functions

fun main(args: Array<String>) {

    val addFun = ::add
    val addFunResult = addFun(1, 2)
    println(addFunResult)
    showResult(addFun, 3, 2)
//    с6_Functions.showResult(::с6_Functions.square, 3)

}

fun showResult(function: (Int, Int) -> Int, a: Int, b: Int) {
    val result = function(a, b)
    print(result)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun square(a: Int): Int {
    return a * a
}