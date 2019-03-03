package ru.epryakhin.study.kotlin.c11_Classes

fun main(args: Array<String>) {

    val walmart = ShoppingList("wallmart")
//    walmart.groceryItems.add(GroceryItem("Milk", 1))
//    walmart.groceryItems.add(GroceryItem("Milk", 2))

    walmart.addGroceryItem(GroceryItem("Salt", 1))
    walmart.addGroceryItem(GroceryItem("Salt", 2))
    println(walmart.getGroceryItems().size)

//    walmart.getGroceryItems().add(GroceryItem("Fish", 1))

}

class ShoppingList(val name: String) {

    private val groceryItems = mutableListOf<GroceryItem>()

    fun getGroceryItems(): List<GroceryItem> {
        return this.groceryItems
    }

    fun addGroceryItem(item: GroceryItem) {
        val find = groceryItems.find { it -> it.name == item.name }
        if (find == null) {
            groceryItems.add(item)
        } else {
            find.count += item.count
        }
    }

}

class GroceryItem(val name: String, var count: Int) {

}