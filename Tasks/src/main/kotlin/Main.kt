package org.example

import org.example.tasks1.Tasks1
import org.example.tasks2.dataclasses.DataClassesExercises
import org.example.tasks2.exceptionhandling.ExceptionHandlingExercises
import org.example.tasks2.nullsafety.NullSafetyExercises

fun main() {
    // Task 1
    // tasks1()

    // Tasks 2
    tasks2()


}


fun tasks1(){
    val tasks1 = Tasks1()
    tasks1.fizzBuzz()
    println("The reverse of string 'hello' is: '${tasks1.reverseString("hello")}'")
    println("The word 'radar' is palindrome: ${tasks1.isPalindrome("radar")}")
    println("The 6th fib number is: ${tasks1.nthFib(6)}")
}

fun tasks2(){
    //NullSafety Exercises(exercise No.1 and No.2)
    //val nullSafetyExercises = NullSafetyExercises()
    //nullSafetyExercises.subtask1()
    //println("The value introduced is: ${nullSafetyExercises.subtask2("heh")}")

    //Data classes Exercises(exercise No.1 and No.2)
    //val dataClassesExercises = DataClassesExercises()
    //dataClassesExercises.subtask1()
    //dataClassesExercises.subtask2()

    ////Exception Handling Exercises(exercise No.1 and No.2)
    val exceptionHandlingExercises = ExceptionHandlingExercises()
    exceptionHandlingExercises.subtask1()
    exceptionHandlingExercises.subtask2()


}