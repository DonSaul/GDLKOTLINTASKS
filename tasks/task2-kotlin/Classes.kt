data class Book(val title: String, val author: String = "unknown")
data class Person(val name: String, val age: Int)
fun bookTask() {
    val myBook = Book("Book")
    println("Title: ${myBook.title}, Author: ${myBook.author}")
}
fun personTask {
    val originalPerson = Person("Damian",23)
    val personCopy = originalPerson.copy(age = 30)
    println("They are the same person ${if(originalPerson == personCopy)  "equal" else "not equal"}")
}