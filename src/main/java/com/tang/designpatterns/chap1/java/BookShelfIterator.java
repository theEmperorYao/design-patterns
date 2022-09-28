package com.tang.designpatterns.chap1.java;


/**
 * @Title: BookShelfIterator
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 10:29
 * @Version: 1.0
 */

public class BookShelfIterator implements Iterator {

    private BookShelf bookSelf;
    private int index;

    BookShelfIterator(BookShelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookSelf.getLength();
    }

    @Override
    public Object next() {
        
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}