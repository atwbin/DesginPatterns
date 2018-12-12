package com.wangcaigu.observer_demo.simple2.pull.observable;

import com.wangcaigu.observer_demo.simple2.pull.observer.IPullWXUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：多个人去订阅我们的公众号
 */
public class PullWXPublicObservable {

    public List<IPullWXUser> mWXUser;

    public PullWXPublicObservable() {
        mWXUser = new ArrayList<>();
    }


    /**
     * 注册
     */
    public void register(IPullWXUser user) {
        mWXUser.add(user);
    }

    /**
     * 取消注册
     */
    public void unreigster(IPullWXUser user) {
        mWXUser.remove(user);
    }


    /**
     * 更新文字
     */
    public void update(String article) {
        for (IPullWXUser pullWXUser : mWXUser) {
            pullWXUser.pull(this);
        }
    }

}
