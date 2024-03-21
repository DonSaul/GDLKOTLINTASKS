fun main() {
    println("""
        Kotlin Safety Exercises:

        1.- Safe Call and Elvis Operator
        2.- Smart Casts and Type Checks

    """.trimIndent())

    println("Select an option:")

    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val key = input[0]
        println("You pressed: $key")

        when (key) {
            '1' -> AgeExercise()
            '2' -> isIntorString("Hola Mundo")

            else -> println("Enter a valid key")
        }
    }
}

fun AgeExercise() {
    println("Enter you age:")

    val input = readlnOrNull() ?: "25"

    println("Your age is: $input")
}

fun isIntorString(value : Any) {
    if(value is String) {
        println("Your value is a String")
    } else if(value is Int) {
        println("Your value is an Int")
    } else if(value == null) {
        println("Your value is null")
    }
}
