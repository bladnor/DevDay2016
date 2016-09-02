package ch.sbb.devday2016.kotlin.c_stringTemplates

fun main(args: Array<String>) {
    simpleName()
    expressionInCurlyBraces()
}

fun simpleName() {
    val i = 10
    println("der index ist: $i")
}

fun expressionInCurlyBraces() {
    val s = "abc"
    println("die länge von $s beträgt ${s.length}")
}
