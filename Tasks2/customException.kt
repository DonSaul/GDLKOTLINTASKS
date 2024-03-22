class InvalidInputException(message: String) : Exception(message)

fun validateInput(input: String?) {
    if (input.isNullOrBlank()) {
        throw InvalidInputException("Input invalido")
    }
}

fun main() {
    try {
        print("Ingresar datos: ")
        val userInput = readLine()
        validateInput(userInput)
        println("Valido: $userInput")
    } catch (e: InvalidInputException) {
        println("Error: ${e.message}")
    }
}
