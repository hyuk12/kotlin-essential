package chapter9

class Product(name: String, price: Double, quantity: Int) {
    var name: String = name
    var price: Double = price
    var quantity: Int = quantity
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                field = 0
            }
        }

    fun calculateTotalValue(): Double {
        return price * quantity
    }

    fun restock(quantity: Int) {
        if (quantity < 0) {
            return
        }
        this.quantity += quantity
    }
}

fun main() {
    val product = Product("코틀린", 999.99, 5)

    println(product.name)
    println(product.price)
    println(product.quantity)
    println(product.calculateTotalValue())

    product.restock(3)
    println(product.quantity)
    println(product.calculateTotalValue())

    product.quantity = -2

    println(product.quantity)
    println(product.calculateTotalValue())

    product.quantity = 10

    println(product.quantity)
    println(product.calculateTotalValue())

}