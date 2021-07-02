package lambdas

import `class`.Product

class Product(val name: String, val price: Double)

val materialEscolar = listOf(
    Product("Fichário escolar", 21.90),
    Product("Lápis de cor", 11.90),
    Product("Borracha", 0.70),
    Product("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    val student = arrayListOf("Pedro", "Tiago", "Jonas")
    student.map { it.toUpperCase() }.apply { println(this) }

    val count = { total: Double, atual: Double -> total + atual }
    val totalPrice = materialEscolar.map { it.price }.reduce(count)

    println("O preço médio é R$ ${totalPrice / materialEscolar.size}.")
}