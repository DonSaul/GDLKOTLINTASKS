fun main() {
    while (true) {
        try {
            print("Enter a number: ")
            val number = readLine()?.toInt()
            println("You entered: $number")
            break
        } catch (e: NumberFormatException) {
            println("Not a valid number. Please try again.")
        }
    }
}
