package lambdas

fun main(args: Array<String>) {
    val names = arrayListOf("Jorge", "Joaquina", "Joceli", "Jamaica", "Jota")
    val ordenados = names.sortedBy {  it.reversed() }

    println(ordenados)
}