package com.wangcaigu.iterator_demo.simple1.iterator;

import com.wangcaigu.iterator_demo.simple1.UserInfo;

import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class QQIterator implements Iterator {

    private List<UserInfo> mUserInfos;
    int index = 0;

    public QQIterator(List<UserInfo> userInfos) {
        this.mUserInfos = userInfos;
    }

    @Override
    public Object next() {
        return mUserInfos.get(index);
    }

    @Override
    public boolean hasNext() {
        return index < mUserInfos.size();
    }
}
