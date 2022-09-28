package com.tang.designpatterns.chap1.scala

import java.util


class BookShelf(maxSize: Int) extends Aggregate {

  val books: Array[Book] = new Array[Book](maxSize)
  var last: Int = 0

  def getBookAt(index: Int): Book = books(index)

  def appendBook(book: Book) =
    books(last) = book
    last += 1

  def getLength: Int = last

  override def iterator(): MyIterator = new BookShelfIterator(this)

  def reverseIterator() = new BookShelfReverseIterator()

  class BookShelfReverseIterator extends MyIterator :

    var index = {
      val i = books.indexOf(null) - 1
      println(i)
      i
    }

    override def hasNext(): Boolean = index >= 0

    override def next(): Any =
      val book = getBookAt(index)
      index -= 1
      book

}
