package org.example

import org.example.tasks1.Tasks1
import org.example.tasks2.dataclasses.DataClassesExercises
import org.example.tasks2.exceptionhandling.ExceptionHandlingExercises
import org.example.tasks2.nullsafety.NullSafetyExercises
import org.example.tasks2.oop.*

fun main() {
    // Task 1
    // tasks1()

    // Tasks 2
    tasks2()

    //Knights, Warriors and Arena
    //taskKnightsWarriorsAndArena()
    //taskWithDefenders()
    //taskWithVampires()
    //taskWithLancers()
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
    /*val nullSafetyExercises = NullSafetyExercises()
    nullSafetyExercises.subtask1()
    println("The value introduced is: ${nullSafetyExercises.subtask2("heh")}")*/

    //Data classes Exercises(exercise No.1 and No.2)
    /*val dataClassesExercises = DataClassesExercises()
    dataClassesExercises.subtask1()
    dataClassesExercises.subtask2()*/

    //Exception Handling Exercises(exercise No.1 and No.2)
    /*val exceptionHandlingExercises = ExceptionHandlingExercises()
    exceptionHandlingExercises.subtask1()
    exceptionHandlingExercises.subtask2()*/

    //OOP classes
    //BankAccount
    /*val account = BankAccount("9845-0343-5776","Jane Doe",5000.0)
    account.deposit(400.0) // Adds 400 to the current balance (5400.0)
    account.withdraw(3000.0) // Withdraws 3000 from the current balance (2400.0)
    account.withdraw(3000.0) // Tries to withdraw 3000.0, but it doesn't (balance 2400.0 is not sufficient)
    print("Current balance from ${account.accountHolder} is: ${account.getBalance()}") // Outputs: "Current balance from Jane Doe is: 2400.0"*/

    //Character and Wizard
    val wizard1 = Wizard("Gandalf",1200,200,600)
    val wizard2 = Wizard("Sauron",1500, 170,750)

    wizard2.castSpell(wizard1)  // Sauron casts spell onto Gandalf, spending 50pts (default cost) of mana and dealing 170pts of damage
    wizard1.attack(wizard2)     // Gandalf does a normal attack over Sauron and deals 200pts of damage
    wizard1.attack(wizard2){}   // Gandalf strikes a consecutive attack,  casting a spell,
                                // spending 50pts of mana, and causing a total of 200pts of damage

    println(wizard1)            // After 2 rounds of attacks, Gandalf remains with 550pts of mana and 1030pts of health
    println(wizard2)            // And Sauron ends up with 700pts of mana and 1100pts of health
}

fun taskKnightsWarriorsAndArena(){
    val arena = Arena()
    val chuck = Warrior()
    val bruce = Warrior()
    check(arena.fight(chuck, bruce).first) { "Warrior should win Warrior" }
    check(chuck.getIsAlive()) { "Warrior winner should be alive" }
    check(!bruce.getIsAlive()) { "Warrior defeated should not be alive" }
    val dave = Warrior()
    val carl = Knight()
    check(!arena.fight(dave, carl).first) { "Warrior should lose to Knight" }
    check(carl.getIsAlive()) { "Knight winner should be alive" }
    check(!dave.getIsAlive()) { "Warrior defeated should not be alive" }
    println("OK")

    val myArmy = Army()
    myArmy.addUnits(3) { Knight() }

    val enemyArmy = Army()
    enemyArmy.addUnits(3) { Warrior() }

    val army3 = Army()
    army3.addUnits(20) { Warrior() }
    army3.addUnits(5) { Knight() }

    val army4 = Army()
    army4.addUnits(30) { Warrior() }

    val res1 = arena.fight(myArmy, enemyArmy)
    val res2 = arena.fight(army3, army4)

    check(res1)
    check(!res2)
    println("OK")
}

fun taskWithDefenders(){
    val arena = Arena()
    val chuck = Warrior()
    val bruce = Warrior()
    val carl = Knight()
    val dave = Warrior()
    val mark = Warrior()
    val bob = Defender()
    val mike = Knight()
    val rog = Warrior()
    val lancelot = Defender()

    check(arena.fight(chuck, bruce).first)
    check(!arena.fight(dave, carl).first)
    check(chuck.getIsAlive())
    check(!bruce.getIsAlive())
    check(carl.getIsAlive())
    check(!dave.getIsAlive())
    check(!arena.fight(carl, mark).first)
    check(!carl.getIsAlive())
    check(!arena.fight(bob, mike).first)
    check(arena.fight(lancelot, rog).first)

    val myArmy = Army()
    myArmy.addUnits(1) { Defender() }

    val enemyArmy = Army()
    enemyArmy.addUnits(2) { Warrior() }

    val army3 = Army()
    army3.addUnits(1) { Warrior() }
    army3.addUnits(1) { Defender() }

    val army4 = Army()
    army4.addUnits(2) { Warrior() }

    check(!arena.fight(myArmy, enemyArmy))
    check(arena.fight(army3, army4))
    println("OK")
}

fun taskWithVampires(){
    val arena = Arena()
    val chuck = Warrior()
    val bruce = Warrior()
    val carl = Knight()
    val dave = Warrior()
    val mark = Warrior()
    val bob = Defender()
    val mike = Knight()
    val rog = Warrior()
    val lancelot = Defender()
    val eric = Vampire()
    val adam = Vampire()
    val richard = Defender()
    val ogre = Warrior()

    check(arena.fight(chuck, bruce).first)
    check(!arena.fight(dave, carl).first)
    check(chuck.getIsAlive())
    check(!bruce.getIsAlive())
    check(carl.getIsAlive())
    check(!dave.getIsAlive())
    check(!arena.fight(carl, mark).first)
    check(!carl.getIsAlive())
    check(!arena.fight(bob, mike).first)
    check(arena.fight(lancelot, rog).first)
    check(!arena.fight(eric, richard).first)
    check(arena.fight(ogre, adam).first)

    val myArmy = Army().apply {
        addUnits(2) { Defender() }
        addUnits(2) { Vampire() }
        addUnits(1) { Warrior() }
    }

    val enemyArmy = Army().apply {
        addUnits(2) { Warrior() }
        addUnits(2) { Defender() }
        addUnits(3) { Vampire() }
    }

    val army3 = Army().apply {
        addUnits(1) { Warrior() }
        addUnits(4) { Defender() }
    }

    val army4 = Army().apply {
        addUnits(3) { Vampire() }
        addUnits(2) { Warrior() }
    }

    check(!arena.fight(myArmy, enemyArmy))
    check(arena.fight(army3, army4))
    println("OK")
}

fun taskWithLancers(){
    val  arena = Arena()
    val chuck = Warrior();
    val bruce = Warrior();
    val carl = Knight();
    val dave = Warrior();
    val mark = Warrior();
    val bob = Defender();
    val mike = Knight();
    val rog = Warrior();
    val lancelot = Defender();
    val eric = Vampire();
    val adam = Vampire();
    val richard = Defender();
    val ogre = Warrior();
    val freelancer = Lancer();
    val vampire = Vampire();

    check(arena.fight(chuck, bruce).first);
    check(!arena.fight(dave, carl).first);
    check(chuck.getIsAlive());
    check(!bruce.getIsAlive());
    check(carl.getIsAlive());
    check(!dave.getIsAlive());
    check(!arena.fight(carl, mark).first);
    check(!carl.getIsAlive());
    check(!arena.fight(bob, mike).first);
    check(arena.fight(lancelot, rog).first);
    check(!arena.fight(eric, richard).first);
    check(arena.fight(ogre, adam).first);
    check(arena.fight(freelancer, vampire).first);
    check(freelancer.getIsAlive());

    val myArmy = Army();
    myArmy.addUnits(2) { Defender() };
    myArmy.addUnits(2) { Vampire() };
    myArmy.addUnits(4) { Lancer() };
    myArmy.addUnits(1) { Warrior() };

    val enemyArmy = Army();
    enemyArmy.addUnits(2) { Warrior() };
    enemyArmy.addUnits(2) { Lancer() };
    enemyArmy.addUnits(2) { Defender() };
    enemyArmy.addUnits(3) { Vampire() };

    val army3 = Army();
    army3.addUnits(1) { Warrior() };
    army3.addUnits(1) { Lancer() };
    army3.addUnits(2) { Defender() };

    val army4 = Army();
    army4.addUnits(3) { Vampire() };
    army4.addUnits(1) { Warrior() };
    army4.addUnits(2) { Lancer() };

    check(arena.fight(myArmy, enemyArmy));
    check(!arena.fight(army3, army4));

    println("OK")
}


