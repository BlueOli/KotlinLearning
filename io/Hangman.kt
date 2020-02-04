package io

fun main() {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given, game .")
        return
    }

    for (i in 1..100) {
        println()
    }

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

   while (letters != correctGuesses) {
       printExploreWord(word, correctGuesses)
       println("Wrong guesses: $fails\n")
       print("Guess a letter: ")
       val input = readLine()
       if (input == null){
           continue
       } else if (input.length != 1) {
           println("Please input one letter")
           continue
       }

       if (word.toLowerCase().contains(input.toLowerCase())){
           correctGuesses.add(input[0].toLowerCase())
       } else {
           fails++
       }

   }
    printExploreWord(word, correctGuesses)
    println("Wrong guesses: $fails\n\n")
    println("Well done")
}

fun printExploreWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)){
            print("$character ")
        } else {
            print("_ ")
        }
    }
    println()
}