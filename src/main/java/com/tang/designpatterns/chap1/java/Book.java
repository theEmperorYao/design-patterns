package com.tang.designpatterns.chap1.java;


import lombok.Getter;

/**
 * @Title: Book
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 10:25
 * @Version: 1.0
 */

public class Book {
    @Getter
    private String name;

    public Book(String name) {
        this.name = name;
    }

}