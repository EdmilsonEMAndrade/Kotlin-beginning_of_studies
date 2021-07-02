package Code

import java.lang.IllegalArgumentException

fun fatorial(num:Int):Int=when(num){
    in 0..1 -> 1
    in 2..Int.MAX_VALUE-> num * fatorial(num-1)
    else-> throw  IllegalArgumentException("Número negativo")
}

fun fatorial2 (num:Int, base: Int =1):Int = when(num) {
        in 0..1-> base
        in 2..Int.MAX_VALUE-> fatorial2(num-1, base*num)
        else-> throw  IllegalArgumentException("Número negativo")
}

fun main() {
    println(fatorial(5))
    println(fatorial2(6))
}