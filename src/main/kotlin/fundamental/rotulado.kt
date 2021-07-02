package fundamental

fun main() {

    // @ rotulado
    external@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 9){
                break@external
            }
            println("i = $i - j= $j")
        }
    }
    println("End")
}