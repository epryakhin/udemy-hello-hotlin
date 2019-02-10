package ru.epryakhin.study.kotlin.с6_Functions

fun main(args: Array<String>) {

    greeting()
    nameGreeting("Evgeny")
    nameAgeGreeting("Evgeny", age = 30)
    val nameAgeGreetingReSult = nameAgeGreetingReturning("Evgeny", 30)
    println(nameAgeGreetingReSult)

}

fun greeting() {
    println("Hello, functions")
}

fun nameGreeting(name: String) {
    println("Hello, $name")
}

fun nameAgeGreeting(name: String, age: Int) {
    println("Hello, $name. Your age is $age")
}

fun nameAgeGreetingReturning(name: String, age: Int): String {
    return "Hello, $name. Your age is $age"
}