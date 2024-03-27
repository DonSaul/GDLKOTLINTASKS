package org.example.tasks2.oop

class BankAccount(private val accountNumber:String,  val accountHolder:String, private var balance: Double) {

    fun withdraw(amount: Double){
        if(balance - amount >= 0){
            balance -= amount
        }
    }

    fun deposit(amount: Double){
        balance += amount
    }

    fun getBalance(): Double{
        return balance
    }

}