package com.wangcaigu.observer_demo.simple1.observable;

import com.wangcaigu.observer_demo.simple1.observer.IWXUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description： 微信公众号
 */
public class WXPublicObservable {

    //所有的订阅者
    private List<IWXUser> mWXuser;

    public WXPublicObservable() {
        mWXuser = new ArrayList<>();
    }

    /**
     * 订阅
     */
    public void register(IWXUser user) {
        mWXuser.add(user);
    }

    /**
     * 取消订阅
     */
    public void unregister(IWXUser user) {
        mWXuser.remove(user);
    }

    /**
     * 推送文章
     */
    public void update(String article) {
        for (IWXUser user : mWXuser) {
            user.push(article);
        }
    }
}
