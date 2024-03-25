package org.example

data class Book(val title: String, val author: String = "Unknown")

data class Person(val name: String, val age: Int)

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //DATA CLASES WITH DEFAULT ARGUMENTS

    val book = Book("The Book Thief")
    println("Título: ${book.title}")
    println("Autor: ${book.author}")

    //DATA CLASSES WITH COPY AND EQUALITY CHECK

    val originalPerson = Person("Andrea", 22)

    //Copy function from Kotlin
    val copiedPerson = originalPerson.copy(age = 25)
    val isEqual = originalPerson == copiedPerson

    println("¿Son iguales la persona original y la modificada? $isEqual")
}