package funtion

fun <E> toFilter (list: List<E>, filter :(E)->Boolean): List<E>{
    val filterList = ArrayList<E>()
    for(e in list){
        if(filter(e)){
            filterList.add(e)
        }
    }
    return  filterList
}

fun isEven(number:Int):Boolean{
    return number%2==0
}

fun main() {
    val numberList = listOf(1,2,3,4,5,6,7,8,9)
    println(toFilter(numberList, ::isEven))
}