fun main() {
    println("Ingresa tu edad: ")
    var edad:String? = ""

    var edad2 = edad?.toIntOrNull() ?: 25
    println(edad2)
}