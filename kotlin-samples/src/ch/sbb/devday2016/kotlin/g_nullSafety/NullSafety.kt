package ch.sbb.devday2016.kotlin.g_nullSafety

var nameNullable: String? = null
var nameNonNullable: String = "abc" //null


//***
fun main(args: Array<String>) {

    val lengthA = nameNullable?.length
    println("Länge: $lengthA")


    val lengthB = nameNullable?.length ?: -1
    println("Länge: $lengthB")


    val lengthC: Int = nameNonNullable?.length
    println("Länge zum zweiten $lengthC")

}


