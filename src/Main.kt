fun main() {
    val hannibal = Book("The Silence of the Lambs", "Thomas Harris", 1988, "Thriller")
    hannibal.printBookInfo()
}

class Book(var title: String, var author: String, var yearPublished: Int, var genre: String) {
    fun printBookInfo() {
        println("$title By $author ($yearPublished)\nGenre: $genre")
    }
}