import java.lang.NumberFormatException

fun main() {
    println("Por favor, ingresa un número:")
    val input = readLine()

    try {
        val number = input?.toDouble() // Intenta convertir la entrada a un número
        if (number != null) {
            println("Número ingresado: $number")
        } else {
            println("No ingresaste un número válido.")
        }
    } catch (e: NumberFormatException) {
        println("Error: No ingresaste un número válido.")
    }
}
