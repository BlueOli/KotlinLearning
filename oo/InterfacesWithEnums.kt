package oo

interface Drivable{
    fun drive()
}

interface Buildable{
    val timeRequired: Int
    fun buildable()
}

class Car(val color: Color): Drivable, Buildable{
    override val timeRequired: Int = 120
    override fun drive() {
        println("Driving car...")
    }

    override fun buildable() {
        println("Built a shiny car.")
    }
}

class Motorcycle(val color: String): Drivable{
    override fun drive() {
        println("Driving motorcycle...")
    }
}

fun main(){
    val car = Car(Color.GREEN)
    car.drive()
    println(car.color)
    val motorcycle: Drivable = Motorcycle("red")
    motorcycle.drive()
}