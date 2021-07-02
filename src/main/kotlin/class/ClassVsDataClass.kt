package `class`

class Refrigerator(val brand: String, val liters: Int)
data class Television(val brand: String, val inch: Int)

fun main(args: Array<String>) {
    val r1 = Refrigerator("Brastemp", 320)
    val r2 = Refrigerator("Brastemp", 320)
    //Class
    // não implementa o equals
    println(r1 == r2)
    // não implementa o toString
    println(r1.toString())
    //não implementa .copy()

    val tv1 = Television("Sansung", 32)
    val tv2 = Television("Sansung", 32)

    // Data Class
    // implementa o equals
    println(tv1 == tv2)
    //implementa toString
    println(tv1.toString())
    //implementa copy, onde poderá ser criado um novo objeto, mudando algum atributo
    println(tv1.copy(inch = 42))
    // Destructuring em data class
    val (brand, inch) = tv1
    println("$brand $inch'")
}