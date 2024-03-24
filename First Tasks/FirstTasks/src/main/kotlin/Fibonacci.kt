package org.example

fun getFibonacci(n: Int): Int {
    if (n <= 1) return n

    var n1 = 0; var n2 = 1; var result = 0

    for (i in 2..n) {
        result = n1 + n2
        n1 = n2
        n2 = result
    }
    return result
}

fun main() {
    val n = 11
    val fiboNumber = getFibonacci(n)
    println("The $n-th Fibonacci number is: $fiboNumber")
}