package ch.sbb.devday2016.kotlin.g_delegation

import kotlin.properties.Delegates

class MyModel(myDatabase: MutableSet<String>) {
    var name: String by Delegates.observable("myInitialValue") { d, old, new ->
        println("$old --> $new")
        myDatabase.remove(old)
        myDatabase.add(new)
    }
}


//***
fun main(args: Array<String>) {
    val model= MyModel(mutableSetOf())
    println(model.name)
    model.name = "sbb dev day 2016"
    println(model.name)

}