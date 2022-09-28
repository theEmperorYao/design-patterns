package com.tang.designpatterns.chap1.java;


import java.util.ArrayList;
import java.util.List;

/**
 * @Title: BookSelf
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 10:26
 * @Version: 1.0
 */

public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}