package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn(){
        println("Learning a great $topic course.")
    }
}

interface Learnable{
    fun learn(){
        println("Learning...")
    }
}

open class KotlinCourse():Course("Kotlin", 999.99), Learnable{
    override final fun learn() {
        super<Course>.learn()
        println("I am one of the first people to learn Kotlin")
    }
}



fun main(){
    val course = KotlinCourse()
    course.learn()
}