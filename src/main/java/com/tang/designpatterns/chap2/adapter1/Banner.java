package com.tang.designpatterns.chap2.adapter1;


/**
 * @Title: Banner
 * @Description:
 * @author: tangyao
 * @date: 2022/9/28 14:45
 * @Version: 1.0
 */

public class Banner {
    private String string;

    public Banner(String s) {
        this.string = s;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAstar() {
        System.out.println("*" + string + "*");
    }
}