package fundamental

fun main() {
    val numberA = 7
    val numberB = 8

    val maxValue = if(numberA>numberB){
        println( "Loading... if")
        numberA
    }else{
        println("Loading... else")
        numberB
    }

    println(maxValue)

    // a última expressão (numberA,numberB) será retornada para o atributo
    /*
    *val maxValue = if(numberA>numberB){
        numberA
        println( "Loading... if")    //////ERROR
    }else{
        println("Loading... else")
        numberB
    }
    * */

    val value:Double = 8.5
    if(value in 9.0..10.0){
        println("Great")
    }else if (value in 6.0..8.99){
        println("Good")
    }else{
        println("Bad")
    }

    println(5 in 7..4) // sempre deve ser do menor para o maior
    println(5 in 4..7)


}