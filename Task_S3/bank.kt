package org.example

class Bank {

    open class BankAccount(val accountNumber: String, val accountHolder: String, private var balance: Double){

        fun withdraw(amount: Double){
            if(amount > balance){
                throw InvalidWitdrawException("Insufficent funds!, current balance: $balance")
            }
            balance -= amount

        }
        fun deposit(amount: Double){
            if(amount < 0){
                throw  InvalidDepositException("Error in amount: $amount")
            }
            balance += amount
        }
        fun getBalance() :Double{
            return balance
        }

    }
}

class InvalidWitdrawException(message: String): Exception(message) {
}
class InvalidDepositException(message: String): Exception(message) {
}