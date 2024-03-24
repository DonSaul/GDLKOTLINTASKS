package org.example


//We'll be using a function that Kotlin already has, called "Reversed".
//According to the Kotlin documentation, 'Returns a string with characters in reversed order'
fun reverseString(input: String): String {
    return input.reversed()
}

fun main() {
    val originalString = "ich bin Alan"
    val reversedString = reverseString(originalString)
    println("Original string: $originalString")
    println("Reversed string: $reversedString")
}