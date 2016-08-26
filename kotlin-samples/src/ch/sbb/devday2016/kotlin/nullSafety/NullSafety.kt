package ch.sbb.devday2016.kotlin.nullSafety

import ch.sbb.devday2016.kotlin.Gender
import ch.sbb.devday2016.kotlin.Gender.MALE
import ch.sbb.devday2016.kotlin.Superpower
import ch.sbb.devday2016.kotlin.Superpower.FLIGHT


data class Superhero(val gender: Gender, val name: String, val superpower: Superpower, val nickName: String)


fun main(args: Array<String>) {

//    val (g, n, s, nickName) = Superhero(MALE, "Spiderman", FLIGHT)
//    val nickNameLength1: Int? = nickName?.length;
//
//    val nickNameLength2: Int = nickName?.length ?: -1;

}


