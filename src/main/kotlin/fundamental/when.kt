package fundamental

fun main() {
    val nota = 7

    when(nota){
        10,9->  print("Great")
        in 6..8-> print("Good")
        else-> print("Bad")
    }
}