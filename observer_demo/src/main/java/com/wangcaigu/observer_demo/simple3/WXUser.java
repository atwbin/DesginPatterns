package com.wangcaigu.observer_demo.simple3;

import java.util.Observable;
import java.util.Observer;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class WXUser implements Observer {

    private String name;

    public WXUser(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        WXAdvanceObservable wxAdvanceObservable = (WXAdvanceObservable) o;
        System.out.println(name + "主动拉取了一篇文章:" + wxAdvanceObservable.getArticle());
    }
}
