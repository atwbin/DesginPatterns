package com.wangcaigu.iterator_demo.simple1;

import com.wangcaigu.iterator_demo.simple1.iterator.Iterator;
import com.wangcaigu.iterator_demo.simple1.iterator.WXIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class WXUserSystem implements Aggregate<UserInfo> {

    private List<UserInfo> mUserInfo;

    public WXUserSystem() {
        mUserInfo = new ArrayList<>();
        mUserInfo.add(new UserInfo("wbin1", "240336124", "001", "男"));
        mUserInfo.add(new UserInfo("wbin2", "240336125", "002", "女"));
        mUserInfo.add(new UserInfo("wbin3", "240336126", "003", "男"));
    }

    @Override
    public Iterator<UserInfo> iterator() {
        return new WXIterator(mUserInfo);
    }
}
