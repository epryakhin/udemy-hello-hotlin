package ru.epryakhin.study.kotlin.c11_Classes

fun main(args: Array<String>) {
    val customer1 = Customer("John", "Doe")
    println("Computed fullName: ${customer1.fullName}")
    println()

    var customer2 = customer1
    println("customer2 and customer1 pointing to the same object: ${customer2 === customer1}")
    println()

    val customer3 = Customer("Mary", "Doe")
    customer2 = customer3
    println("customer2 and customer1 pointing to the same object (after reassignment): ${customer2 === customer1}")

}

class Customer(var firstName: String, var lastName: String) {
    val fullName
        get() = "$firstName $lastName"
}