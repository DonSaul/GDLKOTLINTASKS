package org.example.tasks2.oop

open class Character(
    protected val name: String,
    protected var healthPoints: Int,
    open protected val attackPoints: Int
) {

    fun takeDamage(damage: Int) {
        if (healthPoints - damage >= 0) {
            healthPoints -= damage
        }
    }

    open fun attack(target: Character, specialAttack: (() -> Unit)? = null) {
        target.takeDamage(attackPoints)
    }

    override fun toString(): String {
        return "Character Stats:\nName -> $name\nHealth Points -> $healthPoints\nAttack Points -> $attackPoints\n"
    }
}

class Wizard(name: String, healthPoints: Int, attackPoints: Int, private var manaPoints: Int) :
    Character(name, healthPoints, attackPoints) {

    override fun attack(target: Character, specialAttack: (() -> Unit)?) =
        specialAttack?.let { castSpell(target) } ?: super.attack(target, specialAttack)

    fun castSpell(target: Character, manaCost: Int = 50) {
        if (manaPoints - manaCost >= 0) {
            super.attack(target, specialAttack = {})
            manaPoints -= manaCost
        }
    }

    override fun toString(): String {
        return "Wizard Stats:\nName -> $name\nHealth Points -> $healthPoints\nAttack Points -> $attackPoints\nMana Points -> $manaPoints\n"
    }
}

open class Warrior(protected var health: Int = 50, protected open val attack: Int = 5) {
    protected var isAlive: Boolean = true

    fun getCombatientAttack(): Int {
        return attack
    }

    fun getCombatientHealth(): Int {
        return health
    }

    fun getIsAlive(): Boolean {
        return isAlive
    }

    open fun attack(target: Warrior): Int {
        return target.takeDamage(attack)
    }

    open fun takeDamage(damage: Int): Int {
        health -= damage
        if (health <= 0) {
            isAlive = false
        }
        return damage
    }

}

class Defender(private val defense: Int = 2) : Warrior(health = 60, attack = 3) {
    override fun takeDamage(damage: Int): Int {
        if (damage > defense) {
            health -= (damage - defense)
            if (health <= 0) {
                isAlive = false
            }
            return (damage - defense)
        }
        return 0
    }
}

class Knight() : Warrior(attack = 7) {
}

class Rookie : Warrior() {
    override val attack: Int
        get() = 1
}

class Vampire(val vampirism: Int = 50) : Warrior(health = 40, attack = 4) {
    override fun attack(target: Warrior): Int {
        val damageDealt = super.attack(target)
        val healValue = (damageDealt * (vampirism.toDouble() / 100)).toInt()
        health = if (health + healValue > 40) 40 else (health + healValue)
        return damageDealt
    }
}

class Lancer(): Warrior(health = 50, attack = 6)

class Army {
    private val units = mutableListOf<Warrior>()

    fun addUnits(unitsToAdd: Int, warrior: () -> Warrior) {
        for (i in 1..unitsToAdd) {
            units.add(warrior())
        }
    }

    fun getUnits(): MutableList<Warrior> {
        return units
    }

    fun getUnitsSize(): Int {
        return units.size
    }
}