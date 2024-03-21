data class Libro(val titulo: String, val autor: String = "Desconocido")

fun main() {
    // Crea una instancia de Libro sin especificar el autor
    val libroSinAutor = Libro("El Señor de los Anillos")

    // Imprime los detalles del libro
    println("Título: ${libroSinAutor.titulo}")
    println("Autor: ${libroSinAutor.autor}") // Imprimirá "Desconocido"
}