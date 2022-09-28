package com.tang.designpatterns.chap2.java;


/**
 * @Title: PrintBanner
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 14:48
 * @Version: 1.0
 */

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String s) {
        super(s);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}