package challenges

interface Lendable {
    fun borrow() {
    }
}

abstract class InventoryItem(
    open val title: String,
    open val genre: String,
    open val publicationYear: Int,
    var borrowed: Boolean
) : Lendable {
    override fun borrow() {
        if (!borrowed) {
            println("This item has been borrowed")
            borrowed = true
        } else {
            println("Sorry, the item is already borrowed")
        }


    }

    fun returnItem() {
        if (borrowed) {
            println("The item has been returned")
            borrowed = false
        } else {
            println("Sorry, the item was not borrowed so it cannot be returned")
        }

    }

}

data class LibraryBook(
    override val title: String,
    override val genre: String,
    override val publicationYear: Int,
    val author: String
) : InventoryItem(title, genre, publicationYear, false) {
    fun read() {
        println("Reading a book by $author...")
    }
}

data class LibraryDVD(
    override val title: String,
    override val genre: String,
    override val publicationYear: Int,
    val length: Double
) : InventoryItem(title, genre, publicationYear, false) {
}

fun main() {
    val book = LibraryBook("IT", "Horror", 1986, "Stephen King")
    val dvd = LibraryDVD("American Idiot", "Rock Punk", 2004, 57.14)

    println(book)
    println(dvd)
}