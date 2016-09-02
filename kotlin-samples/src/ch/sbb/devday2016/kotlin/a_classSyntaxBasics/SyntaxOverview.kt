package ch.sbb.devday2016.kotlin.a_classSyntaxBasics

/**
 * Syntax einer Klasse
 *
 * - Direkt nach dem Klassen Namen folgt der Primär Konstruktor.
 * - Per default ist eine Klasse `final` und `public`
 * - Für Values (val) wird ein Property und ein Getter generiert
 * - Für Variables (var) wird ein Property und ein Getter und Setter generiert
 *
 * @param name Ist ein Value der nicht verändert werden kann
 * @param realName Ist ein Value der nicht verändert werden kann mit einem default Wert
 * @param status Ist eine Variable die verändert werden kann
 */
class Superhero(val name: String, val realName: String = "", var status: String)

/**
 * Basic Top-Level Function
 *
 * Funktionen (Methoden) müssen nicht innerhalb Klassen definiert werden.
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val superhero = Superhero("The Flash", "Barry Allen","top fit")

    println(superhero)
    println(superhero.name)
    println(sum(2,3))
}




