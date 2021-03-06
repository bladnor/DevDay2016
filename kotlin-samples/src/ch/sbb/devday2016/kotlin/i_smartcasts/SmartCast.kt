package ch.sbb.devday2016.kotlin.i_smartcasts

interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return radius * radius * Math.PI
    }
}

class Square(val edge: Double) : Shape {
    override fun area(): Double {
        return edge * edge
    }
}

//***
fun main(args: Array<String>) {
    val shape :Shape = Circle(2.0)

    if (shape is Circle) {
        println(shape.radius)
    } else if (shape is Square) {
        println(shape.edge)
    } else {
        print(shape.area())
    }

    when (shape) {
        is Circle -> println(shape.radius)
        is Square -> println(shape.edge)
        else -> println(shape.area())
    }
}
