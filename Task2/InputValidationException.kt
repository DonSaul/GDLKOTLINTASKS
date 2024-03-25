class InvalidInputException(message: String) : Exception(message)

fun validateInput(input: String?) {
    if (input.isNullOrEmpty() || input.any { !it.isLetterOrDigit() }) {
        throw InvalidInputException("Invalid input: Input is empty or contains special characters.")
    }
}

fun main() {
    try {
        print("Enter input: ")
        val userInput = readLine()
        validateInput(userInput)
        println("Valid input: $userInput")
    } catch (e: InvalidInputException) {
        println(e.message)
    }
}
