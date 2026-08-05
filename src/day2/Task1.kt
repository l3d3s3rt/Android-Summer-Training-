/*
Create a program that has a Picture class that contains 3 Shapes.
In addition, it contains a method sumAreas()
that returns the summation of any 3 shapes' areas.
*/


package day2
abstract class Shape {
    abstract fun calcArea(): Double
}

class Rectangle(var height: Double, var width: Double) : Shape() {
    override fun calcArea(): Double {
        return height * width
    }
}

class Circle(var radius: Double) : Shape() {
    override fun calcArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(var base: Double, var height: Double) : Shape() {
    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}

class Picture(var shape1: Shape, var shape2: Shape, var shape3: Shape) {
    fun sumAreas(): Double {
        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    val circle = Circle(4.0)
    val triangle = Triangle(6.0, 2.0)

    val picture = Picture(rectangle, circle, triangle)

    println("Total area: ${picture.sumAreas()}")
}