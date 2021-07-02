package `class`

class Person {
    var name:String =""
}
class Person1(var name:String)
class Person2(val name:String)
class Person3(initName:String){
    var name = initName
}

fun main() {
    val person = Person()
    val person1 = Person1("Joana")
    val person2 = Person2(name="Jorge")
    val person3 = Person3("Jota")

    person.name = "Edmilson"
    person1.name = "Jaquina"
    // name em person2 é uma constante, não poderá ser mudada
    // person3.initName não é uma variável inicializada, não pode ser chamada
    println("${person.name}")
    println("${person1.name}")
    println("${person2.name}")
    println("${person3.name}")
}