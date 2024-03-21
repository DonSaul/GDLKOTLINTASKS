fun main() {
    // Solicita la edad del usuario
    print("Ingresa tu edad: ")
    val edadString: String? = "" // Modifica la entrada del usuario

    // Usa la llamada segura para evitar la excepción de puntero nulo y el operador Elvis para el valor predeterminado
    val edad = edadString?.toIntOrNull() ?: 25 // Intenta convertir a entero, o usa 25 si es nulo

    print("Tu edad es: $edad")
}