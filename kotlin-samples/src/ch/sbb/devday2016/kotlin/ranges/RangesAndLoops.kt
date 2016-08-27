package ch.sbb.devday2016.kotlin.ranges

/**
 * - Ranges sind per default closed. Der letzte Wert gehört dazu.
 * - Für half-closed Ranges kann `until` verwendet werden. Der letzt Wert gehört nicht mehr dazu.
 * - Um rückwarts zu zählen kann `donwTo` verwendet werden.
 */
fun main(args: Array<String>) {
//    loopForward()
    loopForwardHalfClosed()
//    loopBackward()
}


fun loopForward() {
    val oneTo10 = 1..10
    for (i in oneTo10) {
        println("i = $i")
    }

//    val aTOz = 'a'..'z'
//    for (i in oneTo10.plus(aTOz)) {
//        println("i = $i")
//    }

}


fun loopForwardHalfClosed() {
    for (i in 1 until 100 step 2) {
        println("i = $i")
    }
}


fun loopBackward() {
    for (i in 100 downTo 1 step 5) {
        println("i = $i")
    }
}
