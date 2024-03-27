package org.example.tasks1

class Tasks1 {

    /**
    *    Write a Kotlin program that prints the numbers from 1 to 100. But for multiples of three,
    *    print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers
    *    that are multiples of both three and five, print "FizzBuzz".
    *
    *   Prints, in the range of 1 to 100.-
    *   "Fizz", if the number is divisible by 3
    *   "Buzz", if the number is divisible by 5
    *   "FizzBuzz", if number is divisible by 3 and 5
    *   the number itself, if none of the above
    *
    *   @return Unit
    * */
    fun fizzBuzz(){
        for(i in 1..100){
            if(i % 3 == 0 && i % 5 == 0){
                println("FizzBuzz")

            }else if(i % 3 == 0 ){
                println("Fizz")

            }else if(i % 5 == 0){
                println("Buzz")
            }else{
                println(i)
            }
        }
    }

    /**
    *   Implement a Kotlin function called reverseString that takes a string as input and returns the
    *   reverse of that string. For example, if the input is "hello", the function should return "olleh".
    *
    *   Reverses a string
    *   @param[s] a string
    *   @return the [s] string reversed
    * */
    fun reverseString(s:String):String{
        return s.reversed()
    }

    /**
    *   Write a Kotlin function called isPalindrome that takes a string as input and returns true if
    *   the string is a palindrome, false otherwise. A palindrome is a word that reads the same
    *   backward as forward. For example, "radar" is a palindrome
    *
    *   Deters if [s] string is palindrome
    *   @param[s] a string
    *   @return if [s] is a palindrome
    * */
    fun isPalindrome(s:String):Boolean{
        var left: Int = 0
        var right: Int = s.length -1
        while(left<right){

            if(s[left] != s[right]){
                return false
            }
            left++
            right--
        }
        return true
    }

    /**
    *   Implement a Kotlin function called fibonacci that takes an integer n as input and returns
    *   the nth Fibonacci number. The Fibonacci sequence is a series of numbers where each
    *   number is the sum of the two preceding ones. The sequence starts with 0 and 1. For
    *   example, the 6th Fibonacci number is 8 (0, 1, 1, 2, 3, 5, 8).
    *
    *   Calculates the [n]th fibonacci number
    *   @param[n] the nth fibonacci number to be calculated
    *   @return the nth fibonacci number
    * */
    fun nthFib(n:Int):Int{
        var a: Int = 1
        var b: Int = 1
        var c: Int = 0
        if(n <= 2){
            return a
        }
        for(i in 3..n){
            c = a + b
            a = b
            b = c
        }
        return c
    }
}