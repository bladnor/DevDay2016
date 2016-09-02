package ch.sbb.devday2016.kotlin.b_classSyntaxExtended

/**
 * Functionen in Interfaces können eine Implementation haben
 */
interface Super {
    fun calculatePower(): Int
    fun currentMood(): String {
        return "happy"
    }
}

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
 * @param firstApperance Für Parameter ohne `val` oder `var` wird kein Property und keine Getter oder Setter erzeugt.
 */
class Superhero(val name: String, val realName: String = "", var status: String, firstApperance: String) : Super {
    init {
        println(firstApperance)
    }

    constructor(name: String) : this(name, status = "topfit", firstApperance = "")

    override fun calculatePower(): Int {
        throw UnsupportedOperationException("not implemented")
    }

    override fun currentMood(): String {
        return super.currentMood()
    }

    var createdBy: String = ""
        get() = "Creator: ".plus(field)
        set(nameOfCreator) {
            // Custom Setter code kann hier implementiert werden
            field = nameOfCreator
        }
}

fun main(args: Array<String>) {
    // Named Parameters
    val flash = Superhero("The Flash", status = "top fit", firstApperance = "1940")  // Calls Primär Konstruktor
    val flash1 = Superhero("The Flash") // Calls Sekundär Konstruktor

    flash.status = "verletzt"
//    flash.realName = "Batmann"

    flash.createdBy = "Bill Finger"

    println(flash)
}




