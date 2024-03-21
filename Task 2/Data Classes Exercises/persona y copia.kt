data class Persona(val nombre: String, val edad: Int)

fun crearPersonaYCopia(nombre: String, edad: Int): Pair<Persona, Persona> {
    val personaOriginal = Persona(nombre, edad)
    val personaCopia = personaOriginal.copy(edad = 30) // Modifica la edad en la copia

    return Pair(personaOriginal, personaCopia)
}

fun main() {
    val (persona1, persona2) = crearPersonaYCopia("Juan", 23)

    println("¿Son la persona original y la copia iguales? ${persona1 == persona2}") // Imprime "false"
}