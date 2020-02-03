package oo

class Person(val name:String, var age:Int) {

    init {
        println("Object was created")
    }
    fun speak(){
        println("Hello!")
    }

    fun greet(name:String){
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age

}

fun main() {
    val person = Person("Jack", 17)
    println(person.name)
    println(person.age)
    println(person.getYearOfBirth())
    person.speak()
    person.greet("World")

}