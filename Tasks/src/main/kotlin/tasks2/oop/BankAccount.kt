package org.example.tasks2.oop

/**
*   This class represents a Bank Account and some of its common operations.
*
*   @property accountNumber the account number of this bank account.
*   @property accountHolder the name of this bank account owner.
*   @property balance the current balance of this bank account.
*   @constructor creates a bank account with and initializes its 3 properties.
* */
class BankAccount(private val accountNumber:String,  val accountHolder:String, private var balance: Double) {


    /**
    *   Substracts [amount] from this bank account balance.
    *   @param[amount] the amount to withdraw from balance.
    *   @return Unit
    * */
    fun withdraw(amount: Double){
        if(balance - amount >= 0){
            balance -= amount
        }
    }

    /**
    *   Adds [amount] to this bank account.
    *   @param[amount] the amount to add to this bank account.
    *   @return Unit
    * */
    fun deposit(amount: Double){
        balance += amount
    }

    /**
    *   Gets the balance from this bank account.
    *   @return the current balance of the bank account.
    * */
    fun getBalance(): Double{
        return balance
    }

}