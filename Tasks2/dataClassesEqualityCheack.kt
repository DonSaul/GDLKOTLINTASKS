data class Person(val name:String, val age:Int)

fun main() {
	val person1 = Person("Link", 20)
    val person2 = person1.copy(age=21)
    
    if(person1 == person2){
        println("Person 1 and person 2 are equal")
    }else{
        println("Person 1 and person 2 aren't equal")
    }
}