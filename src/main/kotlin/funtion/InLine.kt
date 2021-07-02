package funtion

inline fun transaction(function:()->Unit){
     println("Open DB")
    try {
        function()
    }finally {
        print("Close DB")
    }
}


fun main() {
    transaction {
        println("Execute SQL...")
        println("Execute SQL...")
        println("Execute SQL...")
    }
}