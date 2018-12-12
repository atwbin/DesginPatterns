package com.wangcaigu.observer_demo.simple1;

import com.wangcaigu.observer_demo.simple1.observable.WXAdvanceObservable;
import com.wangcaigu.observer_demo.simple1.observer.WXUser;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public class ObserverClient {

    public static void main(String[] args) {

        //具体的被观察者
        WXAdvanceObservable wxAdvanceObservable = new WXAdvanceObservable();

        // 具体的观察者
        WXUser user1 = new WXUser("wbin1");
        WXUser user2 = new WXUser("wbin2");

        wxAdvanceObservable.register(user1);
        wxAdvanceObservable.register(user2);

        wxAdvanceObservable.setArticle("Android 进阶之旅");

        wxAdvanceObservable.unregister(user1);

        wxAdvanceObservable.setArticle("Android 进阶之旅2");


    }
}
