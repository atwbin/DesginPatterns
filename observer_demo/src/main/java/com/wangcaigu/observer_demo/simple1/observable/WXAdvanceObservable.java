package com.wangcaigu.observer_demo.simple1.observable;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：具体的微信公众号
 */
public class WXAdvanceObservable extends WXPublicObservable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        update(article);
    }
}
