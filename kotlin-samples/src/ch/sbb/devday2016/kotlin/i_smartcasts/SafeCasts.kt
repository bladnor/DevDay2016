package ch.sbb.devday2016.kotlin.i_smartcasts

import ch.sbb.devday2016.kotlin.Superpower
import ch.sbb.devday2016.kotlin.Superpower.*

interface Super

data class Superhero(val name: String, val superpower: Superpower) : Super
data class Superheroine(val name: String, val superpower: Superpower) : Super{
    fun myFriends() {}
}


//***
fun main(args: Array<String>) {

    val loki: Super = Superhero("Loki", SHAPE_SHIFTING)
    val elektra = loki as Superheroine

    println(elektra.myFriends())

    println(elektra)
}

