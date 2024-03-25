fun main() {
    print("Enter your age, please: ")
    val age: String? = readLine()
    val displayedAge: Int = age?.toIntOrNull() ?: 25
    println("Age: $displayedAge")
}
    