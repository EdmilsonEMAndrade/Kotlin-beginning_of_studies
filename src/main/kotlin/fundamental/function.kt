package fundamental
//return
fun sum(a:Int, b : Int = 1): Int {
     return a + b
}
//void
fun printInt(a:Int){
    println(a)
}

fun main() {
    printInt(sum(5))
    printInt(sum(5, 10))
}