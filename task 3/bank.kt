class BankAccount(val accountNumber: String, val accountHolder: String, var balance: Double) {

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Fondos insuficientes")
        } else {
            balance -= amount
            println("Retiro realizado exitosamente. Saldo actual: $$balance")
        }
    }

    fun deposit(amount: Double) {
        balance += amount
        println("Depósito realizado exitosamente. Saldo actual: $$balance")
    }
}

fun main() {
    // Ejemplo de uso
    val account = BankAccount("123456789", "John Doe", 1000.0)

    println("Saldo inicial: ${account.balance}")

    account.withdraw(500.0)
    println("Saldo actual después de retiro: ${account.balance}")

    account.deposit(200.0)
    println("Saldo actual después de depósito: ${account.balance}")
}
