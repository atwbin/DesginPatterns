package com.wangcaigu.observer_demo.simple3;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {

        WXAdvanceObservable wxAdvanceObservable = new WXAdvanceObservable();

        WXUser user1 = new WXUser("user1");
        WXUser user2 = new WXUser("user2");

        wxAdvanceObservable.addObserver(user1);
        wxAdvanceObservable.addObserver(user2);


        wxAdvanceObservable.setArticle("王斌新闻资讯");

        wxAdvanceObservable.deleteObserver(user1);

        System.out.println("---------------------");

        wxAdvanceObservable.setArticle("王斌新闻资讯2");
    }
}
