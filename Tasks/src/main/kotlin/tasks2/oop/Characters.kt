package org.example.tasks2.oop

/**
*   This class represents an RPG character, and models some of its behavior from real videogames
*
 *  @property name the name of this character
 *  @property healthPoints the number of health points of this character
 *  @property attackPoints the number of attack points of this character
* */
open class Character(
    protected val name: String,
    protected var healthPoints: Int,
    open protected val attackPoints: Int
) {

    /**
    *   Reduces [damage] healh points from this character
     *
     *  @param[damage] an Integer
     *  @return Unit
    * */
    fun takeDamage(damage: Int) {
        if (healthPoints - damage >= 0) {
            healthPoints -= damage
        }
    }

    /**
    *   Dealts damage to a [target] character. [specialAttack] was added to be used in subclasses, to extend this method behavior by calling
     *  a given [specialAttack] passed as argument
     *
     *   @param[target] an instance of Character class
     *   @param[specialAttack] a function
     *   @return Unit
    * */
    open fun attack(target: Character, specialAttack: (() -> Unit)? = null) {
        target.takeDamage(attackPoints)
    }

    override fun toString(): String {
        return "Character Stats:\nName -> $name\nHealth Points -> $healthPoints\nAttack Points -> $attackPoints\n"
    }
}

/**
*   This class extends Character, and represents a Wizard.
 *
 *   @property manaPoints the number of points of mana of this wizard.
* */
class Wizard(name: String, healthPoints: Int, attackPoints: Int, private var manaPoints: Int) :
    Character(name, healthPoints, attackPoints) {

    /**
    *   Overrides superclass method: if function [specialAttack] is passed as argument, calls castSpell() function, else,
     *  calls super class implementation.
     *
     *  @return Unit
    * */
    override fun attack(target: Character, specialAttack: (() -> Unit)?) =
        specialAttack?.let { castSpell(target) } ?: super.attack(target, specialAttack)


    /**
    *   Does an attack over a [target] Character and spends [manaCost] points of mana.
     *
     *   @param[target] an instance of Character class.
     *   @param[manaCost] an integer.
     *   @return Unit
    * */
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

/**
*   This class models a Warrior, an RPG Character, and some of its behavior in video games.
 *
 *   @property health the Warrior health points.
 *   @property attack the Warrior attack points.
 *   @property isAlive the Warrior status for being alive or not.
* */
open class Warrior(protected var health: Int = 50, protected open val attack: Int = 5) {
    protected var isAlive: Boolean = true

    /**
    *   Gets the Warrior's attack points.
     *  @return Int
    * */
    fun getCombatientAttack(): Int {
        return attack
    }

    /**
     *  Gets the Warrior's health points.
     *  @return Int
    * */
    fun getCombatientHealth(): Int {
        return health
    }

    /**
     *  Gets the Warrior's status of alive or not alive.
     *  @return Boolean
    * */
    fun getIsAlive(): Boolean {
        return isAlive
    }

    /**
     *   Dealts damage to a [target] character and returns the damage taken by it.
     *
     *   @param[target] an instance of Warrior class.
     *   @return Integer
     * */
    open fun attack(target: Warrior): Int {
        return target.takeDamage(attack)
    }

    /**
     *  Reduces [damage] healh points from this Warrior and returns the damage taken.
     *
     *  @param[damage] an Integer.
     *  @return Unit
     * */
    open fun takeDamage(damage: Int): Int {
        health -= damage
        if (health <= 0) {
            isAlive = false
        }
        return damage
    }

}
/**
*   This class extends Warrior class, changing the way it takes damage, adding a defense property, and
 *  increasing health points but decreasing attack points.
 *
 *  @property defense the defense points to reduce damage taken.
* */
class Defender(private val defense: Int = 2) : Warrior(health = 60, attack = 3) {
    /**
    *   Overrides takeDamage() function from super class. if [damage] is greater than the defense points, damage is reduce
     *  by them, else, no damage is taken.
     *  @param[damage] an Integer
     *  @return Int
    * */
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

/**
 *   This class extends Warrior class, increasing the default attack points value.
 *
 * */
class Knight() : Warrior(attack = 7) {
}

/**
 *   This class extends Warrior class, decreasing its attack points by overriding the property.
 *
 *  @property defense the defense points to reduce damage taken.
 * */
class Rookie : Warrior() {
    override val attack: Int
        get() = 1
}

/**
 *   This class extends Warrior class, changing its attack and health values, and adding a healing percentage property.
 *
 *  @property vampirism the healing percentage when dealing damage.
 * */
class Vampire(val vampirism: Int = 50) : Warrior(health = 40, attack = 4) {

    /**
     *  Overrides attack() super class method. It heals this Vampire by 50% of the damage dealt and returns it
     *
     *  @param[target] an instance of class Warrior
     *  @return Int
     * */
    override fun attack(target: Warrior): Int {
        val damageDealt = super.attack(target)
        val healValue = (damageDealt * (vampirism.toDouble() / 100)).toInt()
        health = if (health + healValue > 40) 40 else (health + healValue)
        return damageDealt
    }
}

/**
 *   This class extends Warrior class, changing its attack and health values
 * */
class Lancer(): Warrior(health = 50, attack = 6)


/**
 *   This class models an Army, a list of Warrior instances.
 *   @property units the list of the Warrior of this army.
 * */
class Army {
    private val units = mutableListOf<Warrior>()

    /**
    *   Adds [unitsToAdd] instances of [warrior] class to this army.
     *
     *  @param[unitsToAdd] an Integer.
     *  @param[warrior] an instance of class Warrior.
     *  @return Unit
    * */
    fun addUnits(unitsToAdd: Int, warrior: () -> Warrior) {
        for (i in 1..unitsToAdd) {
            units.add(warrior())
        }
    }

    /**
    *   Gets the list of warriors of this army.
     *
     *  @return MutableList<Warrior>
    * */
    fun getUnits(): MutableList<Warrior> {
        return units
    }

    /**
     *  Gets the size of this army.
     *
     *  @return Int
     * */
    fun getUnitsSize(): Int {
        return units.size
    }
}