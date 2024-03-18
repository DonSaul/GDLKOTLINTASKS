package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // /*Task 1
    println("**Task 1**")
    for (i in 1..100){
        if(i%3 == 0)
            println("Fizz")
        else
            if(i%5 == 0)
                println("FizzBuzz")
            else
                println(i)

    }
    // Task 1 */

    // Task 2 /*
    println("\n**Task 2**")
    val str = "hola"
    println(org.example.reverseString(str))
    // Task 2 */

    // Task 3 /*
    println("\n**Task 3**")
    println( isPalindrome("radar"))
    // Task 3 */

    // Task 4 /*
    println("\n**Task 4**")
    println(fibonacci(9))
    // Task 4 */

}

fun reverseString(str: String): String{
    var newStr = ""
    for (i in str.indices){
        newStr = str[i] + newStr
    }
    return newStr
}

fun isPalindrome(str: String): Boolean{
    var newStr = ""
    for (i in str.indices){
        newStr = str[i] + newStr
    }
    return str.equals(newStr)
}

fun fibonacci(num: Int): Int{
    var f1 = 0
    var f2 = 1
    var f3 = 0

    if(num == 0){
        return 0
    }

    for(i in 2..num){
        f3 = f1 + f2
        f1 = f2
        f2 = f3
    }
    return f2

}