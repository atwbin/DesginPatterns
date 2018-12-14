package com.wangcaigu.observer_demo.simple3;

import java.util.Observable;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class WXAdvanceObservable extends Observable {


    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;

        //有更新的时候 设置改变
        setChanged();
        notifyObservers(article);
    }
}
