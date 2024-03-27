import org.example.tasks2.oop.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FightTest {
    private val testFight: Arena = Arena()

    @Test
    @DisplayName("1. Fight")
    fun `Carl(Warrior) loses when fights against Jim(Knight)`() {
        // given
        val carl = Warrior()
        val jon = Knight()
        // when
        val res = testFight.fight(carl,jon)
        // then
        assertEquals(false, res.first)
    }

    @Test
    @DisplayName("2. Fight")
    fun `Ramon(Knight) defeats Slevin(Warrior)`() {
        // given
        val slevin = Warrior()
        val ramon = Knight()
        // when
        val res = testFight.fight(ramon,slevin)
        // then
        assertEquals(true, res.first)
    }

    @Test
    @DisplayName("3. Fight")
    fun `Bob(Warrior) is alive when fighting Mars(Warrior)`() {
        // given
        val bob = Warrior()
        val mars = Warrior()
        // when
        testFight.fight(bob,mars)
        // then
        assertEquals(true, bob.getIsAlive())
    }

    @Test
    @DisplayName("4. Fight")
    fun `Zeus(Knight) is alive when fighting Godkiller(Warrior)`() {
        // given
        val godkiller = Warrior()
        val zeus = Knight()
        // when
        testFight.fight(zeus,godkiller)
        // then
        assertEquals(true, zeus.getIsAlive())
    }

    @Test
    @DisplayName("5. Fight")
    fun `Wife(Warrior) is dead when fighting husband(Warrior)`() {
        // given
        val husband = Warrior()
        val wife = Warrior()
        // when
        testFight.fight(husband,wife)
        // then
        assertEquals(false, wife.getIsAlive())
    }

    @Test
    @DisplayName("6. Fight")
    fun `Knight is alive when fighting Dragon(Warrior)`() {
        // given
        val dragon = Warrior()
        val knight = Knight()
        // when
        testFight.fight(dragon,knight)
        // then
        assertEquals(true, knight.getIsAlive())
    }

    @Test
    @DisplayName("7. Fight")
    fun `Unit 2 is dead after fighting Unit 1 and Unit 3`() {
        // given
        val unit1 = Warrior()
        val unit2 = Knight()
        val unit3 = Warrior()
        // when
        val res1 = testFight.fight(unit1,unit2)
        val res2 = testFight.fight(unit2,unit3)
        // then
        assertEquals(false, res2.first)
    }

    @Test
    @DisplayName("8. Fight")
    fun `Unit 1 health(Defender) is 60 after fighting Unit 2(Rookie)`() {
        // given
        val unit1 = Defender()
        val unit2 = Rookie()

        // when
        testFight.fight(unit1,unit2)

        // then
        assertEquals(60, unit1.getCombatientHealth())
    }

    @Test
    @DisplayName("9. Fight")
    fun `Unit 1 (Defender) wins fight against Unit 3 (Warrior) after fighting Unit 2 (Rooki)`() {
        // given
        val unit1 = Defender()
        val unit2 = Rookie()
        val unit3 = Warrior()

        // when
        testFight.fight(unit1,unit2)
        val res = testFight.fight(unit1,unit3)
        // then
        assertEquals(true, res.first)
    }

}