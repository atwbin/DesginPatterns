package com.wangcaigu.observer_demo.simple2.push;

import com.wangcaigu.observer_demo.simple2.push.observable.PushWXAdvanceObservable;
import com.wangcaigu.observer_demo.simple2.push.observer.PushWXUser;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public class ObserverClient {

    public static void main(String[] args) {

        //具体的被观察者
        PushWXAdvanceObservable wxAdvanceObservable = new PushWXAdvanceObservable();

        // 具体的观察者
        PushWXUser user1 = new PushWXUser("wbin5");
        PushWXUser user2 = new PushWXUser("wbin6");

        wxAdvanceObservable.register(user1);
        wxAdvanceObservable.register(user2);

        wxAdvanceObservable.setArticle("Android 进阶之旅");

        //user1 取消订阅
        wxAdvanceObservable.unregister(user1);

        wxAdvanceObservable.setArticle("Android 进阶之旅2");


    }
}
