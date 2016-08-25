package ch.sbb.devday2106.kotlin.singletons

import java.util.*

object SuperpowerComparator : Comparator<Superhero> {
    override fun compare(o1: Superhero, o2: Superhero): Int {
        return o1.superpower.usefulnessRating.compareTo(o2.superpower.usefulnessRating)
    }
}

data class Superhero(var gender: Gender, var name: String, var superpower: Superpower)

enum class Superpower(val usefulnessRating: Int) {
    POWER_MANIPULATION(10),
    POWER_DETECTION(5),
    BODY_PART_SUBSTITUTION(6),
    REGENERATIVE_HEALING(7),
    FLIGHT(6)
}

enum class Gender {
    MALE,
    FEMALE,
    ANDROGYNY
}


//******************************************************************
fun main(args: Array<String>) {
    val superhero1 = Superhero(Gender.ANDROGYNY, "Loki", Superpower.BODY_PART_SUBSTITUTION)
    val superhero2 = Superhero(Gender.FEMALE, "She-Hulk", Superpower.REGENERATIVE_HEALING)
    val superhero3 = Superhero(Gender.MALE, "Silver Surfer", Superpower.POWER_MANIPULATION)
    listOf<Superhero>(superhero1, superhero2, superhero3).sortedWith(SuperpowerComparator).forEach { println(it) }
}