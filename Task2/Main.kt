package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Null Safety Exercises:
    //Exersise 1

    print("Please enter your age: ")
    var age: Int? = readln().toIntOrNull()
    if(age == null){
        age = 25
    }
    println("The entered age is: $age")


    //Exersice 2
    paramStringORInt(22)



    ///Exception Handling Exercises:
    //Exercise 1
    do{
        try{
            print("Please enter a number: ")
            val n: Int = readln().toInt()
            break
        }catch (e: NumberFormatException){
            println("Please re-enter a valid number!")
        }
    }while(true)


    //Excercise 2

    println("Please input something: ")
    try {
        val str: String = readln().toString()
        errorException(str)
    }catch(e:InvalidInputException){
        println(e)
    }


    //Data Classes Exercises:
    //task 1

    val newBook= Book()
    println("Author: " + newBook.author + " title:"+newBook.title)


    //task 2
    personFun()
}


fun paramStringORInt(param: Any?){
    if(param is Int){
        println("Integer: $param")
    } else{
        if(param is String) println("String: $param")
        else if (param == null) {
            println("Value is null")
        }
    }

}

data class Book (var author: String ="Unknown"){
    var title: String? = null

}

data class Person(var name: String, var age :Int){
}

fun personFun(){
    val p1 = Person("Josue",15)
    val pCopy = p1.copy(age = 21)
    if(p1 == pCopy){
        println("Persons are equal")
    } else{
        println("Persons are not equal")
    }

}

fun errorException(str: String){
    if(!str.all {it.isLetter()} || str == ""){
        throw InvalidInputException("Is not a valid input")
    }else{
        println("Thanks!")
    }
}