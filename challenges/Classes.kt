package challenges

class Book(val title: String, val author: String, val publicationYear: String, var borrowed: Boolean) {
    fun borrowed() {
        println("The book has been borrowed")
        borrowed = true
    }

    fun returned() {
        println("The book has been returned")
        borrowed = false
    }

    fun print(){
        println(title)
        println(author)
        println(publicationYear)
    }
}

fun main() {
    var book = Book("IT", "Stephen King", "1986", false )

    book.borrowed()
    book.print()
    book.returned()


}
