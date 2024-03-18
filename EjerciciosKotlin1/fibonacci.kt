fun fibonacciN(n:Int): Int{
    if(n<=1){
        return n
    }
    var a = 0
    var b = 1
    for(i in 2..n){
        val suma = a+b
        a = b
        b = suma
    }
    return b
}

fun main() {
    println(fibonacciN(6))
}