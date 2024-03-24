package org.example

fun isPalindrome(input: String): Boolean
{
    // Remove any non-alphanumeric characters and convert to lowercase
    val cleanInput = input.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()

    // Check if the clean input is equal to its reverse
    return cleanInput == cleanInput.reversed()
}

fun main() {
    val testCases = listOf("radar", "level","Andrea","oso","anita lava la tina","Alan")

    for (testCase in testCases) {
        println("Is "+ testCase + " a palindrome? ${isPalindrome(testCase)}")
    }
}