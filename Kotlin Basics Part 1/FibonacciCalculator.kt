fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }
    var a = 0
    var b = 1
    var c = 1
    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }
    return c
}

// Uso de la función
fun main() {
    val result = fibonacci(6)
    println(result)  // Debería imprimir 8
}
