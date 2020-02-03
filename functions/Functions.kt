package functions

import java.util.*

fun helloworld() {
    println("Hello World")
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}

fun main() {
    helloworld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(17, 42))
}