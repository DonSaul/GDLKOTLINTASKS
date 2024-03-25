data class Person(val name: String, val age: Int)

fun checkEquality() {
    val originalPerson = Person("John Doe", 30)
    val copiedPerson = originalPerson.copy(age = 35)
    
    println("Original and copied persons are equal: ${originalPerson == copiedPerson}")
}

fun main() {
    checkEquality()
}
