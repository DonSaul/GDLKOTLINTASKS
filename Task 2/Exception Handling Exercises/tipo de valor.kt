fun checkValue(valor: Any?) {
    // Usa casteos inteligentes para verificar el tipo e imprimir en consecuencia
    if (valor is String) {
        println("String: $valor") // Imprime "String: " seguido del valor
    } else if (valor is Int) {
        println("Entero: $valor") // Imprime "Entero: " seguido del valor
    } else {
        println("El valor es nulo o de un tipo diferente.")
    }
}

fun main() {
    checkValue("Hola") // Salida: String: Hola
    checkValue(42)       // Salida: Entero: 42
    checkValue(null)     // Salida: El valor es nulo o de un tipo diferente.
}