package challenges

fun main() {
    val array = arrayListOf("Tree", "Book", "Yellow", "Car")
    for (array in array){
        if (array.contains('e')){
            for(character in array){
                println(character)
            }
            println()
        }
    }
}