class InvalidInputException(message: String) : Exception(message)

fun getUserInput(): String {
    val input = readLine() ?: ""
    if (input.isEmpty() || input.any { !it.isLetterOrDigit() }) {
        throw InvalidInputException("Entrada inválida. Solo se permiten letras y números.")
    }
    return input
}

fun main() {
    try {
        val userInput = getUserInput()
        println("Entrada válida: $userInput")
    } catch (e: InvalidInputException) {
        println("Error: ${e.message}")
    }
}
