package ch.sbb.devday2016.kotlin.sealedClasses

sealed class Shapes {
    class Circle(val radius: Double) : Shapes() {
        fun area(): Double {
            return radius * radius * Math.PI
        }
    }

    class Square(val edge: Double) : Shapes() {
        fun area(): Double {
            return edge * edge
        }
    }
}


// ******************************************************************
fun main(args: Array<String>) {
    val shape: Shapes = Shapes.Circle(1.0)

    when (shape) {
        is Shapes.Circle -> println(shape.radius)
        is Shapes.Square -> println(shape.edge)
    }
}

