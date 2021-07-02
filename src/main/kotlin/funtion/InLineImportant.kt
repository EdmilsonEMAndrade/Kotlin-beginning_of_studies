package funtion



inline fun <E> executeLog(command: String, function: () -> E) : E{
    println("Open $command")
    try{
        return function()
    }finally {
        println("Finishing $command")
    }
}

fun sum(numberA: Int, numberB: Int):Int{
    return numberA + numberB
}

fun main() {
 val result1= executeLog("sum"){
     sum(4,8)
 }
    println(result1)
    val result2= executeLog("sumNoFunction"){
        sum(4,8)
        1+2
    }
    println(result2)
    val result3= executeLog("text"){
        sum(4,8)
        "Retorno"
    }
    println(result3)
}