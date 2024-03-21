package org.example.tasks2.dataclasses



data class Book(val title: String, val author: String = "Unknown")

data class Person(val name: String, val age: Int)


class DataClassesExercises{

    /*
    *   1. Data Classes with Default Arguments: Define a data class Book with properties
           title and author, with a default author value of "Unknown". Create an instance of
           this class without specifying the author, and print its details.
    *
    *   Creates a Book of instance, leaving a default property value, and prints them
    *
    *   @return Unit
    * */
    fun subtask1(){
        val book = Book(title = "Django 4 by example")
        println("The book title is: ${book.title}, and the author is ${book.author}")
    }

    /*
    *   2. Data Classes with Copy and Equality Check: Create a data class Person with
           properties name and age. Write a function that creates a person instance and then
           creates a copy of it with a modified age. Check if the original and copied persons are
           equal and print the result.
    *
    *   Creates 2 instances of Person (person1 and person2), copying person1 properties into
    *   person2, changing its age, and verifies if both objects are equal
    *
    *   @return Unit
    * */
    fun subtask2(){
        val person1 = Person("Ulrich",14)
        val person2 = person1.copy(age = 15)
        println("Person 1 and Person 2 are: ${if(person1 == person2)  "equal" else "not equal"}")
    }
}