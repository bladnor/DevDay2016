package ch.sbb.devday2016.kotlin.e_delegation

interface Car {
    fun features(): List<String>
    fun brand(): String
}

class StandardCar : Car {
    override fun brand(): String {
        return "Audi"
    }

    override fun features(): List<String> {
        return listOf("4  wheeles", "roof", "radio")
    }

    override fun toString(): String {
        return brand() + features()
    }
}

// TODO rbe: show custom setter / getter with backing field
var createdBy: String = ""
        // get() = "Creator: ".plus(field)
    get() = "Creater: " + createdBy
    set(nameOfCreator) {
        // Custom Setter code kann hier implementiert werden
        field = nameOfCreator
    }

// TODO rbe: show remove by keyword
class SportCar(val car: Car) : Car by car {

    override fun features(): List<String> {
        return car.features().plus("air condition")
    }

    override fun toString(): String {
        return brand() + features()
    }
}


// ******************************************************************
fun main(args: Array<String>) {
    println(StandardCar())
    println(SportCar(StandardCar()))
}



