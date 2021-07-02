package `class`

class Movie {
    val name: String
    val release: Int
    val category: String

    constructor(name: String, release: Int, category: String) {
        this.name = name
        this.release = release
        this.category = category
    }
}
class Movie2(val name: String, val release: Int, val category: String)

class Movie3(name: String, release: Int, category: String) {
    val name: String
    val release: Int
    val category: String

    init {
        this.name = name
        this.release = release
        this.category = category
    }
}

class Product(var name: String, var price: Double, var discount: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val priceDiscount: Double get() = price * (1 - discount)
}

fun main(args: Array<String>) {
    val p1 = Product("iPad", 2349.90, 0.20, ativo = true)
    println(p1.priceDiscount)

    val p2 = Product("Galaxy Note 7", 2699.49, 0.50, ativo = false)
    println("${p2.name}\n\tDe: R$ ${p2.price} \n\tPor: R$ ${p2.priceDiscount}")

    if(p2.inativo) {
        p2.price = 0.0
        println("Depois de inativo: R$ ${p2.priceDiscount}")
    }
}