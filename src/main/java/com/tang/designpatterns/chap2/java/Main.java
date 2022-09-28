package com.tang.designpatterns.chap2.java;


/**
 * @Title: Main
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 14:49
 * @Version: 1.0
 */

public class Main {
    public static void main(String[] args) {

        PrintBanner hello = new PrintBanner("Hello");
        hello.printWeak();
        hello.printStrong();
    }
}