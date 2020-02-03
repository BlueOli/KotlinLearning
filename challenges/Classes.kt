package challenges

class Book(val title: String, val author: String, val publicationYear: String, var borrowed: Boolean) {

    fun borrow() {
        if(!borrowed) {
            println("The book has been borrowed")
            borrowed = true
        } else{
            println("Sorry, the book is already borrowed")
        }

    }

    fun returnBook() {
        if (borrowed) {
            println("The book has been returned")
            borrowed = false
        } else {
            println("Sorry, the book was not borrowed so it cannot be returned")
        }

    }

    fun print(){
        println(title)
        println(author)
        println(publicationYear)
    }
}

fun main() {
    var book = Book("IT", "Stephen King", "1986", false )
    book.returnBook()
    book.borrow()
    book.borrow()
    book.returnBook()
    book.print()


}
