package fundamental

fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"

fun main(args: Array<String>) {
    val nota: Double = 7.2
    val resultado: String = if(nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)

    print(obterResultado(8.3))

}