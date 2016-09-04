package ch.sbb.devday2016.kotlin.b_classSyntaxExtended

// TODO rbe: show interfaces can have implementation / hinweis auf java 6/8
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
 * @param firstApperance Für Parameter ohne `val` oder `var` wird kein Property und keine Getter
 * oder Setter erzeugt.
 */
// TODO rbe: show paramter without val/var
class Superhero(val name: String, val realName: String = "", var status: String, firstApperance: String) : Super {
    init {
        println(firstApperance)
    }

    // TODO rbe: show named parameter / secondary constructor
    constructor(name: String) : this(name, status = "topfit", firstApperance = "")

    // TODO rbe: show custom setter / getter with backing field
    var createdBy: String = ""
            // get() = "Creator: ".plus(field)
        get() = "Creater: " + createdBy
        set(nameOfCreator) {
            // Custom Setter code kann hier implementiert werden
            field = nameOfCreator
        }


    // TODO rbe: show override is keyword
    override fun calculatePower(): Int {
        throw UnsupportedOperationException("not implemented")
    }

    override fun currentMood(): String {
        return super.currentMood()
    }

}

fun main(args: Array<String>) {
    // Named Parameters
    val flash = Superhero("The Flash", status = "top fit", firstApperance = "1940")  // Calls Primär Konstruktor
    val flash1 = Superhero("The Flash") // Calls Sekundär Konstruktor

    // TODO rbe: show re-assignement to var/val does not work
    flash.status = "verletzt"
//    flash.realName = "Batmann"

    flash.createdBy = "Bill Finger"

    // TODO rbe: show wrong custom getter
    // println(flash.createdBy)

    println(flash)
}




