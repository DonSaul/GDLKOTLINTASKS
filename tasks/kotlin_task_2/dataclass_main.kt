import kotlin.random.Random

fun main() {
    println("""
        Data Classes Exercises:

        1.- Data Classes with Default Arguments
        2.- Data Classes with Copy and Equality Check

    """.trimIndent())

    println("Select an option:")

    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val key = input[0]
        println("You pressed: $key \n")

        when (key) {
            '1' -> DefaultArgumentsExercise()
            '2' -> PersonExercise()

            else -> println("Enter a valid key")
        }
    }
}

fun DefaultArgumentsExercise() {
    val book = Book(title = "El Percebe Feo")
    println(book.toString())
}

data class Book(val title: String, val author: String = "Unknown") {
    override fun toString(): String {
        return """
            Title: '$title'
            Author: '$author'
        """.trimIndent()
    }
}

fun PersonExercise() {
    val (personOriginal, personCopy) = copyPerson(personOriginal = Person(name = "Luis Oroz Espinoza", age = 25))

    val resultMessage = """
                Name Original: ${personOriginal.name} | Name Copy: ${personCopy.name}
                Age Original: ${personOriginal.age} | Age Copy: ${personCopy.age}
        """.trimIndent()

    if (personOriginal == personCopy) {
        println("Both classes are the equal")
        println(resultMessage)
    }

    println(resultMessage)
}

fun copyPerson(personOriginal : Person) : Pair<Person, Person> {
    val personCopy = personOriginal.copy(age = Random.nextInt(from = 1, until = 100))
    return Pair(personOriginal, personCopy)
}

data class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return """
            Name: '$name'
            Age: '$age'
        """.trimIndent()
    }
}
