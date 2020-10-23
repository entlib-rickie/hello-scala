package oop

case class Book(name: String) {
  def printBookName(): Unit = {
    println(name)
  }
}

object BookTest {
  def main(args: Array[String]): Unit = {
    val book = Book("Hello scala world")
    book.printBookName()
  }
}
