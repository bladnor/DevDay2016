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
// TODO rbe: show default values / types after the variable/value
class Superhero(val name: String, val realName: String = "", var status: String)

/**
 * Basic Top-Level Function
 *
 * Funktionen (Methoden) müssen nicht innerhalb Klassen definiert werden.
 */
// TODO rbe: show expression body / block body / remove type
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    // TODO rbe: show construction without new
    val superhero = Superhero("The Flash", "Barry Allen","top fit")

    println(superhero)
    // TODO rbe: show property access
    println(superhero.name)

    println(sum(2,3))
}




