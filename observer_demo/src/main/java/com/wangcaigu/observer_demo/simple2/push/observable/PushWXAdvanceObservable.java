package com.wangcaigu.observer_demo.simple2.push.observable;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description： 具体推送的公众号   也就是具体的被观察者
 */
public class PushWXAdvanceObservable extends PushWXPublicObservable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        update(article);
    }
}
