open class Character(val name:String, var healthPoints:Int, val attackPoints:Int){
   fun takeDamage(damage:Int){
       healthPoints -= damage

       if(healthPoints < 0){
           println("{$name} is dead")
       }else{
           println(" ${name} Current Health points: ${healthPoints}")
       }
   }

    open fun attack(target:Character){
        println("Attack for ${target.name}, with ${attackPoints} damage")
        target.takeDamage(damage = attackPoints)
    }
}

class Wizard(name: String, healthPoints: Int, attackPoints: Int, var manaPoints: Int): Character(name, healthPoints, attackPoints) {

    override fun attack(target: Character){
        println("Attack for ${target.name}, with ${attackPoints} damage")
        target.takeDamage(attackPoints)
        manaPoints -= attackPoints

    }
}

fun main(){
    val character = Character("Knight", 100, 10 )
    val wizard = Wizard("Merlin", 90, 10, 70)

    character.attack(wizard)
    wizard.attack(character)
    wizard.attack(character)
    
}