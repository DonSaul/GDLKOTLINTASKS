fun main() {
    println("How old are you?")
    val input = readLine()
    val age = input?.toIntOrNull() ?: 25

    println("You are age old: $age")
}
