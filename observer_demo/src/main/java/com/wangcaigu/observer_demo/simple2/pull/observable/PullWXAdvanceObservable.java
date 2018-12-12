package com.wangcaigu.observer_demo.simple2.pull.observable;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：具体的公众号 比如：android 进阶之旅
 */
public class PullWXAdvanceObservable extends PullWXPublicObservable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        update(article);
    }
}
