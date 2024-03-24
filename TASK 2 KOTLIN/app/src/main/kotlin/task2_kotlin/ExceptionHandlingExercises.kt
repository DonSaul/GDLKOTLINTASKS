package task2_kotlin


import kotlin.io.readLine

class ExcepcionEntradaInvalida(mensaje: String) : Exception(mensaje)

class ExceptionHandlingExercises {
    fun ejercicio1() {
        var entrada: String?
        var numero: Int? = null

       
            print("Ingrese un número: ")
            entrada = readLine()
            try {
                numero = entrada?.toInt()
            } catch (e: ExcepcionEntradaInvalida) {
                println("Entrada inválida. Por favor, ingrese un número válido.")
            }
        

        println("Ingresaste: $numero")
    }

    fun ejercicio2() {
        val entrada = readLine()
        try {
            validarEntrada(entrada)
        } catch (e: ExcepcionEntradaInvalida) {
            println(e.message)
        }
    }

    private fun validarEntrada(entrada: String?) {
        if (entrada.isNullOrEmpty() || entrada.any { !it.isLetterOrDigit() }) {
            throw ExcepcionEntradaInvalida("Entrada inválida. La entrada no debe estar vacía ni contener caracteres especiales.")
        }
        println("Entrada válida: $entrada")
    }
}