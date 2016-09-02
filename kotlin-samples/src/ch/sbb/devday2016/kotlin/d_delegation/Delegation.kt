package ch.sbb.devday2016.kotlin.d_delegation

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



