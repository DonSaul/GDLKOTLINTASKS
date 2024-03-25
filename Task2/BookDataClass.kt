data class Book(val title: String, val author: String = "Unknown")

fun main() {
    val myBook = Book("The Kotlin Journey")
    println(myBook)
}
