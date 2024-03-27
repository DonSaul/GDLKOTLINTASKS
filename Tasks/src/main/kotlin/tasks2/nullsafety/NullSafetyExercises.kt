package org.example.tasks2.nullsafety



class NullSafetyExercises{

    /**
    *   1. Safe Call and Elvis Operator: Write a program that prompts the user to enter their
    *      age. If the input is null, display a default age of 25; otherwise, print the entered age.
    *
    *   Prompts the user to enter its age,
    *   if input is null, prints default age of 25, else outputs the entered age to the console.
    *   @return Unit
    * */
    fun subtask1(){
        println("Enter your age:")
        val age: Int? = readln().toIntOrNull()
        println("Your age is: ${age?: "25"}")
    }

    /**
    *   2. Smart Casts and Type Checks: Implement a function that accepts a parameter and
    *      checks if it's a string or an integer. Print "String: <value>" or "Integer: <value>"
    *      accordingly. If the parameter is null, print "Value is null."
    *
    *   Evaluates a variable[n] and prints if it is a String, an Int or null
    *
    *   @param[n] a variable of type Int, String or null, to evaluate
    *   @return "String<value>" if it's a String, "Integer<value>" if it's an integer,
    *           and "Value is null", if it is null.
    * */

    fun subtask2(n: Any?): String{
        val result = n?: return "Value is null"
        return if(n is String){
            "String<$result>"
        }else{
            "Integer<$result>"
        }
    }
}