package com.wangcaigu.observer_demo.simple4;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class Observable<M, T extends Observer<M>> {

    private List<T> observables;

    public Observable() {
        observables = new ArrayList<>();
    }

    /**
     * 注册
     */
    public void register(T observer) {
        observables.add(observer);
    }


    /**
     * 取消注册
     */
    public void unregister(T observer) {
        observables.remove(observer);
    }

    /**
     * 推送更新
     */
    public void addUpdate(M m) {
        for (T observable : observables) {
            observable.update(m);
        }
    }

}
