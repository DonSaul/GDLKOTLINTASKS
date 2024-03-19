fun main() {
    val n = 9 // Cambia el valor de 'n' según sea necesario
    val resultado = fibonacci(n)
    println("El $n-ésimo número de Fibonacci es $resultado")
}

fun fibonacci(n: Int): Int {
    if (n == 0 || n == 1) {
        return n
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

