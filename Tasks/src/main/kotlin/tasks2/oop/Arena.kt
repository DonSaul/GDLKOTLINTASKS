package org.example.tasks2.oop

/**
* This class only holds methods for simulating battles between instances of the class Warrior
* and Armies of them, represented by MutableLists
*
* */
class Arena {

    /**
    *   Simulates a fight between 2 Warriors
    *   @param[warrior1] an instance of class Warrior
    *   @param[warrior2] an instance of the class Warrior
    *   @return a Pair<Boolean,Pair<Int,Int>> containing a Boolean and a Pair of Integers( true or false whether [warrior1] won or not, and
    *           the damage dealt during battle from each Warrior
    * */
    fun fight(warrior1:Warrior, warrior2: Warrior):Pair<Boolean,Pair<Int,Int>>{
        var firstTurn = true
        var damageDealtByWarrior1 = 0
        var damageDealtByWarrior2 = 0
        while(warrior1.getIsAlive() && warrior2.getIsAlive()){
            if(firstTurn){
                damageDealtByWarrior1 += warrior1.attack(warrior2)

            }else{
                damageDealtByWarrior2 += warrior2.attack(warrior1)
            }
            firstTurn=!firstTurn
        }
        return Pair(warrior1.getIsAlive(),Pair(damageDealtByWarrior1,damageDealtByWarrior2))
    }

    /**
    *   Simulates a fight between 2 Armies
    *   @param[army1] an instance of class Army
    *   @param[army2] an instance of class Army
    *   @return a Boolean, indicating whether [army1] won or not
    * */
    fun fight(army1: Army, army2: Army): Boolean{

        val army1Units = army1.getUnits()
        val army2Units = army2.getUnits()
        while(army1Units.isNotEmpty() && army2Units.isNotEmpty()){

            val res = fight(army1Units[0],army2Units[0])
            if(army1Units[0] is Lancer && army2Units.size>1  ){
                army2Units[1].takeDamage((0.5 * res.second.first).toInt())
            }
            if(army2Units[0] is Lancer && army1Units.size>1){
                army1Units[1].takeDamage((0.5 * res.second.second).toInt())
            }
            if(res.first){
                army2Units.removeAt(0)
            }else{
                army1Units.removeAt(0)
            }
        }
        return army1Units.isNotEmpty()
    }

}