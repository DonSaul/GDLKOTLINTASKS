package org.example
import com.sun.jdi.InvalidTypeException


class InvalidInputException(message: String) : Exception(message)

fun validateInput(input: String) {
    if (input.isBlank() || !input.matches(Regex("[a-zA-Z0-9]+"))) {
        throw InvalidInputException("Dato inválido. " +
                "El dato no puede estar vacío.")
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //HANDLING NUMBER FORMAT EXCEPTION

    var validInput = false
    var number: Int = 0

    while (!validInput) {
        print("Ingresa un número: ")
        val input = readLine()

        try {
            if (input != null)
            {
                number = input.toInt()
                validInput = true
            }
        } catch (e: NumberFormatException) {
            println("Dato inválido. Por favor, ingresa un número correcto")
        }
    }

    println("Tu dato ingresado fue: $number")

    //CUSTOM EXCEPTION WITH ERROR HANDLING

    print("Ingresa algún dato: ")
    val userInput = readLine()

    try {
        if (userInput != null) {
            validateInput(userInput)
            println("El dato es válido: $userInput")
        }
    } catch (e: InvalidTypeException) {
        println("Error: ${e.message}")
    }
}