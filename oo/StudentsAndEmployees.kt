package oo

open class Person(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age

}

class Student(override val name: String, override var age: Int, val studentID: Long) : Person(name, age) {
    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {
    fun receivePayment(){
        println("Received payment")
    }
}

fun main() {
    val student = Student("John", 25, 2489632)
    student.speak()
    println(student.isIntelligent())

    val employee = Employee("Harry", 32)
    println(employee.getYearOfBirth())
    employee.receivePayment()

}