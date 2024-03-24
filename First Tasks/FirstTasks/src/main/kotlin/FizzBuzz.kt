package org.example

fun main(){
    for (i in 1..100) {
        when {
            //If the number is mutiple of 3 and multiple of 5, go FizzBuzz
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            //When the number is mutiple of 3, go Fizz
            i % 3 == 0 -> println("Fizz")
            //When the number is mutiple of 5, go Buzz
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}