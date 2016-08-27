package ch.sbb.devday2016.kotlin.exceptions

/**
 * - Es gibt keine Checked Exceptions in Kotlin und somit auch keine `throws` clause
 * - `throw` und `try` können in Expressions verwendet werden.
 */
fun main(args: Array<String>) {

    try {
//        println("percentage: ${standardThrow(101)}")
        println("percentage: ${throwAsPartOfExpression(5)}")
    } catch(e: IllegalArgumentException) {
        e.printStackTrace()
    } finally {
        // do something
    }

//    println("percentage: ${tryAsPartOfExpression(101)}")
//    println("percentage: ${tryAsPartOfExpression(10)}")
}

fun standardThrow(percentage: Int): Int {
    if (percentage !in 1..100) {
        throw IllegalArgumentException("Wert muss zwischen 1 und 100 liegen. Ist aber '$percentage'")
    }
    return percentage
}

fun throwAsPartOfExpression(value: Int): Int {
    val percentage = if (value in 1..100) {
        value
    } else {
        throw IllegalArgumentException("Wert muss zwischen 1 und 100 liegen. Ist aber '$value'")
    }
    return percentage
}

/**
 * Im Gutfall  wird der letzte Wert im `try` Block verwendet
 * Im Fehlerfall wird der letzte Wert im `catch` Block verwendet
 */
fun tryAsPartOfExpression(value: Int): Int {
    val percentage = try {
        throwAsPartOfExpression(value)
    } catch (e: IllegalArgumentException) {
        0
    }

    return percentage
}
