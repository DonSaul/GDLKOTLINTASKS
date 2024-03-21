package org.example.tasks2.exceptionhandling


class InvalidInputException(message: String) : Exception(message)


class ExceptionHandlingExercises {


    /*
    *   1. Handling Number Format Exception: Write a program that prompts the user to
    *      enter a number. Use exception handling to handle NumberFormatException if the
    *      user enters a non-numeric value and prompt them to re-enter a valid number.
    *
    *   Prompts the user to enter a valid number, if the number is not valid, shows an error message and
    *   keeps prompting until it does,
    *   then prints the number
    *
    *   @return Unit
    * */
    fun subtask1() {
        var number: String?
        var realNumber: Double?
        while (true) try {
            println("Enter a valid number:")
            number = readlnOrNull()
            //(number?.toDouble() ?: continue).also { realNumber = it } //Other way of doing below statement
            realNumber = number?.toDouble() ?: continue
            break
        } catch (e: NumberFormatException) {
            println("Error: you entered something that is not a number")
        }
        println("$realNumber is a valid number")
    }

    /*
    *   2. Custom Exception with Error Handling: Define a custom exception class
    *      InvalidInputException. Write a function that takes user input and throws this
    *      exception if the input is not valid (e.g., empty or contains special characters). Handle
    *      this exception in the calling code and print an error message.
    *
    *   Prompts the user to enter a valid String (without special characters and not empty)
    *   if input is valid, it prints the input string,
    *   if not, throws the custom exception InvalidInputException, and prints the error message
    *   @return Unit
    * */
    fun subtask2() {
        try {
            val input = subtask2Helper()
            println("Input '$input' is valid.")
        } catch (e: InvalidInputException) {
            println(e.message)
        }
    }

    private fun subtask2Helper(): String {
        println("Enter a string(not empty and without special characters) as input:")
        val input: String = readln()
        return if (input.all { it.isLetterOrDigit() } && input.isNotBlank()) input
        else throw InvalidInputException("Error: Input must not contain special character neither be empty")
    }

}

