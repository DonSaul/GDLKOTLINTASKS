package org.example


fun printValue(value: Any?) {
    when (value) {
        is String -> println("String: $value")
        is Int -> println("Entero: $value")
        null -> println("El valor es nulo.")
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //SAFE CALLS AND ELVIS OPERATOR

    print("Ingresa tu edad: ")
    val inputAge: String? = readLine()
    val age = inputAge?.toIntOrNull() ?: 25

    println("Tu edad es: $age")

    //SMART CAST AND TYPE CHECKS

    printValue("Hallo Welt!")
    printValue(79)
    printValue(null)
}