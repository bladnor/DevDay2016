package ch.sbb.devday2016.kotlin.e_delegation

import kotlin.reflect.KProperty


val name: String by MyDelegate()

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {

        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

fun main(args: Array<String>) {
    println(name)
}

// TODO rbe:
// tell there is also property delegation, useful for observer, vetoable pattern
// there are standard property delegates in the kotlin standard library.


