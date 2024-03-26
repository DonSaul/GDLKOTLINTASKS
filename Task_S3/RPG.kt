package org.example

class RPG {
    open class Character(val name: String, var healthPoints: Int, var attackPoints: Int){

        open fun takeDamage(damage: Int){
            healthPoints -= damage
        }

        open fun attack(target: Character, damage: Int){
            target.takeDamage(damage)
        }

    }

    class Wizard(name: String, healthPoints: Int, attackPoints: Int, var manaPoints: Int): Character(name,healthPoints,attackPoints){
        override fun attack(target: Character, damage: Int) {
            target.takeDamage(damage)
            manaPoints -= attackPoints
        }
    }
}