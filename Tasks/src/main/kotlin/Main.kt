package org.example

import org.example.tasks1.Tasks1

fun main() {
    // Task 1
    tasks1()
}

fun tasks1(){
    val tasks1 = Tasks1()
    tasks1.fizzBuzz()
    println("The reverse of string 'hello' is: '${tasks1.reverseString("hello")}'")
    println("The word 'radar' is palindrome: ${tasks1.isPalindrome("radar")}")
    println("The 6th fib number is: ${tasks1.nthFib(6)}")
}