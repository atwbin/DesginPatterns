package com.wangcaigu.observer_demo.simple2.pull;

import com.wangcaigu.observer_demo.simple2.pull.observable.PullWXAdvanceObservable;
import com.wangcaigu.observer_demo.simple2.pull.observer.PullWXUser;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public class ObserverClient {

    public static void main(String[] args) {

        //具体的被观察者
        PullWXAdvanceObservable wxAdvanceObservable = new PullWXAdvanceObservable();

        // 具体的观察者
        PullWXUser user1 = new PullWXUser("wbin3");
        PullWXUser user2 = new PullWXUser("wbin4");

        wxAdvanceObservable.register(user1);
        wxAdvanceObservable.register(user2);

        wxAdvanceObservable.setArticle("Android 进阶之旅");
        //取消订阅
//        wxAdvanceObservable.unregister(user1);

//        wxAdvanceObservable.setArticle("Android 进阶之旅2");


    }
}
