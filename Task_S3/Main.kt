package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val bank = Bank.BankAccount("1","John",1000.0)
    println(bank.getBalance())
    bank.withdraw(350.0)
    bank.deposit(100.0)
    println(bank.getBalance())

    val wizard1 = RPG.Wizard("Vivi",100,20,100)
    val char1 = RPG.Character("Zidane",150,25)
    char1.attack(wizard1,char1.attackPoints)
    println("Wizard HP: ${wizard1.healthPoints} ")
    wizard1.attack(char1,wizard1.attackPoints)
    println("Wizard MP: ${wizard1.manaPoints}")
    println("Character1 HP: ${char1.healthPoints}")

}