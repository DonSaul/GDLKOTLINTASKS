fun main() {
    var flag = false

    while (!flag) {
        try {
            print("Ingresa un NUMERO: ")
            val input = readLine()

            if (input != null) {
                var number = input.toInt()
                flag = true
            } else {
                throw NumberFormatException("No puede ser nulo")
            }
        } catch (e: NumberFormatException) {
            println("Dato ingresado no valido, ingrese un numero valido")
        }
    }

    println("Correcto")
}
