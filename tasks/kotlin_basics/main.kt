fun main() {
    println("""
        Kotlin Basics Part 1
        
        1.- FizzBuzz
        2.- Reverse a String
        3.- Check for Palindrome
        4.- Find the Nth Fibonacci Number
        
    """.trimIndent())

    println("Select an option:")

    val input = readlnOrNull()
    if (!input.isNullOrEmpty()) {
        val key = input[0]
        println("You pressed: $key")

        when (key) {
            '1' -> Fizzbuzz()
            '2' -> ReverseExercise()
            '3' -> CheckPalindrome()
            '4' -> FibonacciExercise()

            else -> println("Enter a valid key")
        }
    }
}

fun Fizzbuzz() {
    for(i in 1.. 100) {

        val conditionFizz = i % 3 == 0
        val conditionBuzz = i % 5 == 0

        if (conditionFizz && conditionBuzz) {
            println("Number $i is FizzBuzz")
            continue
        }

        if (conditionFizz) {
            println("Number $i  is Fizz")
            continue
        }

        if (conditionBuzz) {
            println("Number $i  es Buzz")
            continue
        }
    }
}

fun ReverseExercise() {
    val stringResult = ReverseString()
    println(stringResult)
}

fun ReverseString() : String {
    println("Enter a word to reverse it:")
    val input = readlnOrNull() ?: ""
    return input.reversed()
}

fun CheckPalindrome() {
    println("Enter a word to check if it's a palindrome:")

    val input = readlnOrNull()

    if (input.isNullOrEmpty()) return

    if (input != input.reversed()) {
        println("Word '$input' is not a palindrome")
        return
    }

    println("Word '$input' is  a palindrome")
}

fun FibonacciExercise() {
    println("Enter the N value for the Fibonacci sequence:")

    var number = readlnOrNull()

    if (number.isNullOrEmpty()) return

    if (!isNumberValid(number)) return

    val convertedNumber = number.toIntOrNull()!!

    val fibonacciResult = NthFibonnaci(convertedNumber)

    println("The ${ordinalNumber(convertedNumber)} Fibonacci number is $fibonacciResult")
}


fun NthFibonnaci(n : Int): Int {

    var a = 0
    var b = 1
    var c: Int
    if (n == 0) return a
    var i = 2
    while (i <= n) {
        c = a + b
        a = b
        b = c
        i++
    }
    return b
}

fun isNumberValid(input : String) : Boolean {
    var isValid = false

    if (input.isNotBlank()) {
        val number = input.toIntOrNull()

        if (number != null) {
            isValid = true
        }
    }

    return isValid
}

fun ordinalNumber(n: Int): String {
    return "$n${when {
        n % 100 in 11..13 -> "th"
        n % 10 == 1 -> "st"
        n % 10 == 2 -> "nd"
        n % 10 == 3 -> "rd"
        else -> "th"
    }}"
}