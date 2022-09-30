package com.tang.designpatterns.chap2.adapter2;


import com.tang.designpatterns.chap2.adapter1.Banner;

/**
 * @Title: PrintBanner
 * @Description:
 * @author: tangyao
 * @date: 2022/9/29 14:49
 * @Version: 1.0
 */

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String s) {
        this.banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAstar();
    }
}