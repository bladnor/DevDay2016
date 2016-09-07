package ch.sbb.devday2016.kotlin.f_nullSafety


var nonNullableType: String = "abc" //null

var nullableType: String? = null


//***
fun main(args: Array<String>) {

    val lengthA = nullableType?.length
    println("Länge: $lengthA")

    val lengthB = nonNullableType.length
    println("Länge: $lengthB")

}


