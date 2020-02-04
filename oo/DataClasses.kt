package oo

class Book(val title: String, val author: String, val price: Double){
    override fun toString(): String {
        return "Book(title=$title, author=$author, price=$price"
    }
}

data class DataBook(val title: String, val author: String, val price: Double){

}

fun main(){
    val book = Book("Super Book", "John Doe", 99.99)
    val book2 = Book("Super Book", "John Doe", 99.99)
    val dataBook = DataBook("Super Book", "John Doe", 99.99)
    val dataBook2 = DataBook("Super Book", "John Doe", 99.99)
    val dataBook3 = dataBook.copy(price = 89.99)

    val(title, author, price) = dataBook
    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    val set2 = hashSetOf(book, book2)
    println(set)
    println(set2)
    
    println(book)
    println(dataBook)

    println(title)
    println(author)

    println(book.equals(book2))
    println(dataBook.equals(dataBook2))
    println(dataBook3)
}