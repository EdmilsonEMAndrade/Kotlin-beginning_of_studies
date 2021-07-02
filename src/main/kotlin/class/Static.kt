package `class`

var discount: Double = 0.0

class Product2(val name: String, val price: Double) {
    companion  object {
        fun create(name: String, price: Double) = Product2(name, price)
        // @JvmStatic var discount: Double = 0.0
    }

    fun priceDiscount(): Double {
        return price - price * discount
    }
}

fun main(args: Array<String>) {
    val item1 = Product2.create("TV 50 Polegadas", 2989.90)
    val item2 = Product2("Liquidificador", 200.0)
    discount = 0.10

    println(item1.priceDiscount())
    println(item2.priceDiscount())
}