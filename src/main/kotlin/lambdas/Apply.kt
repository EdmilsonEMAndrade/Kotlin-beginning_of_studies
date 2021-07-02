package lambdas

class Calculator2 {
    var result = 0

    fun sum(value1: Int, value2: Int) {
        result+= value1 + value2
    }

    fun add(value: Int) {
        result+= value
    }
}

fun main(args: Array<String>) {
    val calculator = Calculator2()

    calculator.apply { sum(4, 5) }.apply { add(5) }.apply { println(result) }

    calculator.apply {
        sum(4, 5)
        add(5)
        println(result)
    }

    // inline function
    with(calculator) {
        sum(4, 5)
        add(5)
        println(result)
    }
}