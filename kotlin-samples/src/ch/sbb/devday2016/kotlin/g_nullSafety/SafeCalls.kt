package ch.sbb.devday2016.kotlin.g_nullSafety

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


    val nameOfC = a?.b?.c?.name            // ?: ""
    println(nameOfC)
}

//******************************************************************
fun main(args: Array<String>) {
    safeCalls()
}