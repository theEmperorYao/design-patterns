package com.tang.designpatterns.chap1.scala


@main def main =
  val bookShelf = new BookShelf(4)
    bookShelf.appendBook(new Book("Around the World int 80 Days"))
    bookShelf.appendBook(new Book("Bible"))
    bookShelf.appendBook(new Book("Cinderella"))
    bookShelf.appendBook(new Book("Daddy-Long-Legs"))

//  (0 until 100).foreach(i =`> {
//    bookShelf.appendBook(new Book(String.valueOf(i)))
//  });

  val it = bookShelf.iterator()
  while (it.hasNext()) {
    val book: Book = it.next().asInstanceOf[Book]
    println(book.name)
  }

  val it2 = bookShelf.reverseIterator()
  while it2.hasNext() do
    val book = it2.next().asInstanceOf[Book]
    if book == null then
      println()

    println (book.name)

