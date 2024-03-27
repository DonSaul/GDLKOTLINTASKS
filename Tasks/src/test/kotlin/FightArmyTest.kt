
import org.example.tasks2.oop.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FightArmyTest {

    private val testArmyFight : Arena = Arena()

    @Test
    @DisplayName("1. Battle")
    fun `Army with 1 warriors loses to Army with 2 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(1){ Warrior() }
        army2.addUnits(2){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("2. Battle")
    fun `Army with 2 warriors loses to Army with 3 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(2){Warrior()}
        army2.addUnits(3){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("3. Battle")
    fun `Army with 5 warriors loses to Army with 7 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(5){Warrior()}
        army2.addUnits(7){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("4. Battle")
    fun `Army with 20 warriors wins over Army with 21 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(20){Warrior()}
        army2.addUnits(21){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }

    @Test
    @DisplayName("5. Battle")
    fun `Army with 10 warriors wins over Army with 1 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(10){Warrior()}
        army2.addUnits(11){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }

    @Test
    @DisplayName("6. Battle")
    fun `Army with 11 warriors wins over Army with 7 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(11){Warrior()}
        army2.addUnits(7){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }
    @Test
    @DisplayName("7. Battle")
    fun `Army 1 (5 Warriors, 9 Defenders) wins against Army 2 (4 Warriors)`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(5){ Warrior() }
        army1.addUnits(4){ Defender() }
        army1.addUnits(5){ Defender() }
        army2.addUnits(4) { Warrior() }
        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("8. Battle")
    fun `Army 1 (20 Warriors, 9 Defenders) wins against Army 2 (21 Warriors)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(5){ Defender() }
        army1.addUnits(20){ Warrior() }
        army2.addUnits(21) { Warrior() }
        army1.addUnits(4){ Defender() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("9. Battle")
    fun `Army 1 (10 Warriors, 15 Defenders) wins against Army 2 (5 Warriors)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(10){ Warrior() }
        army1.addUnits(5){ Defender() }
        army2.addUnits(5) { Warrior() }
        army1.addUnits(10){ Defender() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("10. Battle")
    fun `Army 1 (1 Warriors, 3 Defenders) loses against Army 2 (5 Warriors)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(2){ Defender() }
        army1.addUnits(1){ Warrior() }
        army1.addUnits(1){ Defender() }
        army2.addUnits(5) { Warrior() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false, res)
    }

    @Test
    @DisplayName("11. Battle")
    fun `Army 1 (7 Warriors, 5 Defenders, 6 Vampires) loses against Army 2 (6 Warriors, 6 Defenders, 6 Vampires)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(5){ Defender() }
        army1.addUnits(6){ Vampire() }
        army1.addUnits(7){ Warrior() }
        army2.addUnits(6) { Warrior() }
        army2.addUnits(6) { Defender() }
        army2.addUnits(6) { Vampire() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false, res)
    }

    @Test
    @DisplayName("12. Battle")
    fun `Army 1 (4 Warriors, 2 Defenders, 3 Vampires) loses against Army 2 (4 Warriors, 4 Defenders, 3 Vampires)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(2){ Defender() }
        army1.addUnits(3){ Vampire() }
        army1.addUnits(4){ Warrior() }
        army2.addUnits(4) { Warrior() }
        army2.addUnits(4) { Defender() }
        army2.addUnits(3) { Vampire() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false, res)
    }

    @Test
    @DisplayName("13. Battle")
    fun `Army 1 (4 Warriors, 11 Defenders, 3 Vampires) wins against Army 2 (4 Warriors, 4 Defenders, 13 Vampires)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(11){ Defender() }
        army1.addUnits(3){ Vampire() }
        army1.addUnits(4){ Warrior() }
        army2.addUnits(4) { Warrior() }
        army2.addUnits(4) { Defender() }
        army2.addUnits(13) { Vampire() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("14. Battle")
    fun `Army 1 (8 Warriors, 9 Defenders, 3 Vampires) wins against Army 2 (4 Warriors, 4 Defenders, 13 Vampires)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(11){ Defender() }
        army1.addUnits(3){ Vampire() }
        army1.addUnits(4){ Warrior() }
        army2.addUnits(4) { Warrior() }
        army2.addUnits(4) { Defender() }
        army2.addUnits(13) { Vampire() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("15. Battle")
    fun `Army 1 (5 Lancers, 4 Warriors, 2 Defenders, 3 Vampires) loses against Army 2 (4 Warriors, 4 Defenders, 6 Vampires, 5 Lancers)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(5){ Lancer()}
        army1.addUnits(2){ Defender() }
        army1.addUnits(3){ Vampire() }
        army1.addUnits(4){ Warrior() }
        army2.addUnits(4) { Warrior() }
        army2.addUnits(4) { Defender() }
        army2.addUnits(6) { Vampire() }
        army2.addUnits(5){ Lancer() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false, res)
    }

    @Test
    @DisplayName("16. Battle")
    fun `Army 1 (7 Lancers, 4 Warriors, 2 Defenders, 3 Vampires) wins against Army 2 (4 Warriors, 4 Defenders, 6 Vampires, 4 Lancers)`(){

        //given
        val army1 = Army()
        val army2 = Army()

        army1.addUnits(7){ Lancer()}
        army1.addUnits(2){ Defender() }
        army1.addUnits(3){ Vampire() }
        army1.addUnits(4){ Warrior() }
        army2.addUnits(4) { Warrior() }
        army2.addUnits(4) { Defender() }
        army2.addUnits(6) { Vampire() }
        army2.addUnits(4){ Lancer() }

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true, res)
    }
    @Test
    @DisplayName("17. Battle")
    fun `Army Warrior (2 Warriors) loses against Army Lancer (1 Warriors, 1 Lancers)`(){

        //given
        val armyWarrior = Army()
        val armyLancer = Army()

        armyWarrior.addUnits(2){Warrior()}
        armyLancer.addUnits(1) { Lancer() }
        armyLancer.addUnits(1) {Warrior() }

        //when
        val res = testArmyFight.fight(armyWarrior,armyLancer)

        //then
        assertEquals(false, res)
    }

}