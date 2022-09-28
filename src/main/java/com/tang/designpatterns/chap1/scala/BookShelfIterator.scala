package com.tang.designpatterns.chap1.scala


class BookShelfIterator(bookShelf: BookShelf) extends MyIterator {

  var index: Int = 0

  override def hasNext(): Boolean =
    if index < bookShelf.getLength then
      true
    else
      false

  override def next(): Any =
    val book = bookShelf.getBookAt(index)
    index += 1
    book
  
}
