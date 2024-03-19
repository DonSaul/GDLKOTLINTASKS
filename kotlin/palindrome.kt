fun main() {
    print("Introduce una palabra o frase: ")
    val palabra = readLine() ?: ""

    val esPalindromo = isPalindromo(palabra)

    if (esPalindromo) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}

fun isPalindromo(texto: String): Boolean {
    val sinEspacios = texto.replace(" ", "")
    val invertida = sinEspacios.reversed()
    return sinEspacios == invertida
}
