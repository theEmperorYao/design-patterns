package com.tang.designpatterns.chap1.java;


/**
 * @Title: Main
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 10:36
 * @Version: 1.0
 */

public class Main {

    /**
     * 迭代器模式： 引入 Iterator 后 可将遍历与实现分离开
     * * 这里的while循环 并不依赖于BookSelf的实现
     *
     * @param args
     */
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        for (int i = 0; i < 10; i++) {
            bookShelf.appendBook(new Book("Around the World int 80 Days"));
            bookShelf.appendBook(new Book("Bible"));
            bookShelf.appendBook(new Book("Cinderella"));
            bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        }

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}