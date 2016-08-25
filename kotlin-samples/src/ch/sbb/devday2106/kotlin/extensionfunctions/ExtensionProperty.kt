package ch.sbb.devday2106.kotlin.extensionfunctions

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Extension Property (braucht einen Getter)
 */
val Date.DATA_FORMAT_LONG: String get() = "dd.MM.yyyy"

/**
 * Extension Function
 */
fun Date.formatDate(): String {
    val sdf = SimpleDateFormat(this.DATA_FORMAT_LONG)
    return sdf.format(this)
}



//  ******************************************************************
fun main(args: Array<String>) {
    val date = Date()
    println(date.formatDate())
    print(date.DATA_FORMAT_LONG)
}
