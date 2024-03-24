package task2_kotlin
import kotlin.io.readLine

class NullSafetyExercises {
    fun ejercicio1() {
        print("Ingrese su edad: ")
        val edad = readLine()?.toIntOrNull()
        val edadReal = edad ?: 25
        println("Tu edad es $edadReal")
    }

    fun ejercicio2() {
        verificarValor("Hola")
        verificarValor(42)
        verificarValor(null)
    }

    private fun verificarValor(valor: Any?) {
        when (valor) {
            is String -> println("Cadena: $valor")
            is Int -> println("Entero: $valor")
            else -> println("Valor es nulo")
        }
    }
}