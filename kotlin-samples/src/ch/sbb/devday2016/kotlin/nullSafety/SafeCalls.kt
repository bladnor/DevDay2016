package ch.sbb.devday2016.kotlin.nullSafety

class A {
    val b: B? = null
}

class B {
    val c: C? =null
}

class C {
    var name: String? = null
}

fun safeCalls() {
    val a: A? = null



    val cName = a?.b?.c?.name            // ?: ""
    println(cName)
}

//******************************************************************
fun main(args: Array<String>) {
    safeCalls()
}