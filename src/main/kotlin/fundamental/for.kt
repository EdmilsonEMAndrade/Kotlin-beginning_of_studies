package fundamental

fun main() {
    for(i in 1..5){
        println(i)
    }
    for(i in 5 downTo 1){
        println(i)
    }
    for(i in 5 downTo 1 step 2){
        println(i)
    }

    val alunos = arrayListOf("João","Joaquina","Jorge")

    for ((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }
}