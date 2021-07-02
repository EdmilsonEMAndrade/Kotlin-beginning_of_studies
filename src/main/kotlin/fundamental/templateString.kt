package fundamental

fun main() {
    val approved = listOf("João","Joaquim","Joana")
    println("First at the list ${approved[0]}")
    println("All approved $approved")
    //exemplo de função dentro do template String
    val humor = false
    println("Hoje estou ${if(humor) "bem humorado" else "irritado"}.")


}