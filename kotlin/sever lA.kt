fun main() {
    val cadenaOriginal = "sever lA"
    val cadenaInvertida = invertirCadena(cadenaOriginal)
    println(cadenaInvertida)
}

fun invertirCadena(cadena: String): String {
    return cadena.reversed()
}
