package `class`

class Person4 {
    constructor(name: String) {
        this.name = name
    }

    var name: String
        get() = "My name is ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonymous"
        }
}

fun main(args: Array<String>) {
    val c1 = Person4("")
    println(c1.name)

    val c2 = Person4("Pedro")
    println(c2.name)
    c2.name = "Ana"
    println(c2.name)
}