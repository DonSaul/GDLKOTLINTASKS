import java.lang.NumberFormatException

fun main() {
    var validInput = false

    println("""
        Exception Handling Exercises:

        1.- Handling Number Format Exception
        2.- Custom Exception with Error Handling

    """.trimIndent())

    println("Select an option:")

    while (!validInput) {
        val input = readlnOrNull()

        if (input.isNullOrEmpty()) continue

        val key = input[0]
        println("You pressed: $key \n")

        when (key) {
            '1' -> {
                numberExercise()
                validInput = true
            }
            '2' -> {
                customExceptionExercise()
                validInput = true
            }

            else -> println("Enter a valid key")
        }
    }
}

fun numberExercise() {
    var validInput = false
    var number = 0

    while (!validInput) {
        print("Please enter a number: ")
        val input = readlnOrNull()

        try {
            number = input?.toInt() ?: throw NumberFormatException()
            validInput = true
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.")
        }
    }

    println("You entered: $number")
}

class InvalidInputException(message: String) : Exception(message)

fun customExceptionExercise() {
    try {
        print("Enter input: ")
        val userInput = readlnOrNull() ?: ""
        validateInput(userInput)
        println("Input is valid: $userInput")
    } catch (e: InvalidInputException) {
        println("Error: ${e.message}")
    }
}

fun validateInput(input: String) {
    if (input.isEmpty()) {
        throw InvalidInputException("Invalid input: Is empty")
    } else if (!input.matches(Regex("[a-zA-Z0-9 ]+"))) {
        throw InvalidInputException("Invalid input: $input contains special characters")
    }
}
