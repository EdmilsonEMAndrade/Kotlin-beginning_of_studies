package fundamental

fun ImSmart(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun ImSmart2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida!")
    }
}

fun printGrade(nota: Any) {
    when(nota as? Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main(args: Array<String>) {
    ImSmart("Ola")
    ImSmart(9)

    ImSmart2("Opa")
    ImSmart2(7)
    ImSmart2(true)

    val grades = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for(grade in grades) {
        printGrade(grade.toInt())
    }
}