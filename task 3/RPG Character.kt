class Knight(val name: String, var healthPoints: Int, val attackPoints: Int) {

    fun takeDamage(damage: Int) {
        healthPoints -= damage
        if (healthPoints < 0) {
            healthPoints = 0
        }
        println("$name has taken $damage damage. Current HP: $healthPoints")
    }

    fun attack(target: Knight) {
        val damageDealt = attackPoints
        target.takeDamage(damageDealt)
        println("$name attacks ${target.name} for $damageDealt damage.")
    }
}

fun main() {
    val player1 = Knight("caballero", 100, 20)
    val player2 = Knight("Barbaro", 120, 15)

    println("----- incia el duelo -----")
    player1.attack(player2)
    player2.attack(player1)
    println("----- fin del combate -----")
}
