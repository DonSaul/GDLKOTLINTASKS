package kotlin_basics_1

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun reverseString(str: String): String {
    var reversed = ""
    for (i in str.length - 1 downTo 0) {
        reversed += str[i]
    }
    return reversed
}

fun fizzBuzz() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

fun cleanString(str: String): String {
    return str.toLowerCase().replace(" ", "")
}

fun isPalindrome(str: String): Boolean {
    val cleaned = cleanString(str)
    var startIndex = 0
    var endIndex = cleaned.length - 1

    while (startIndex < endIndex) {
        if (cleaned[startIndex] != cleaned[endIndex]) {
            return false
        }
        startIndex++
        endIndex--
    }
    return true
}

fun findNthFibonacci(n: Int): Long {
    if (n <= 1) return n.toLong()

    var a = 0L
    var b = 1L
    var result = 0L

    for (i in 2..n) {
        result = a + b
        a = b
        b = result
    }

    return result
}


fun main() {
     println(App().greeting)
    println(reverseString("Hello"))
    println(reverseString("Hello, world!"))
    fizzBuzz()
    println(cleanString("Hello World"))
    println(cleanString("   HeLlO   "))
    println(isPalindrome("radar"))
    println(isPalindrome("A man a plan a canal Panama"))
    println(isPalindrome("hello"))
    println(findNthFibonacci(0))
    println(findNthFibonacci(1))
    println(findNthFibonacci(2))
    println(findNthFibonacci(3))
    println(findNthFibonacci(4))
    println(findNthFibonacci(5))

}
