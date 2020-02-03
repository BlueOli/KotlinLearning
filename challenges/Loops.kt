package challenges

fun main() {
    var sum = 0L
    for (i in 100..100000L) {
        sum = sum + i
    }
    println(sum)
}