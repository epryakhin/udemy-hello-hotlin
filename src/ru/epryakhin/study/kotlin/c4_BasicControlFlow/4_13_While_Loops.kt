package ru.epryakhin.study.kotlin.c4_BasicControlFlow

fun main(args: Array<String>) {

    var input : String = " "
    val quitMarker ="q"

    while (input != quitMarker) {
        print("Input some text or [$quitMarker] to quit: ")
        input = readLine().orEmpty()
        println("\n\tYour text:\n\t--\n\t$input\n\t--\n\n")
    }

    println("Exiting...")

}