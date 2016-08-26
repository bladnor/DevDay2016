package ch.sbb.devday2016.kotlin.functions

/**
 * Created by hadihariri on 14/02/16.
 */


fun topLevel(parameter: String) {
    println("Functions can be top-level, not requiring any static class or be static methods")
    println("There is string interpolation in Kotlin: $parameter")
}







fun defaultAndOptionalParameters(param1: String, param2: String, param3: String = "Smith") {
    println("${param1.length} $param2 $param3")
}






fun parameterNaming(x: String, y: String) {
    defaultAndOptionalParameters(param2 = x, param1 = y)
}










fun singleExpressions(x: Int) = x * 2















fun multipleParams(vararg params: String) {}













