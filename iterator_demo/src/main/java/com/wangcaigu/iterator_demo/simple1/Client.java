package com.wangcaigu.iterator_demo.simple1;

import com.wangcaigu.iterator_demo.simple1.iterator.Iterator;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        //整体思路：先从微信中查找信息
        // 如没有，再从QQ中查找
        WXUserSystem wxUserSystem = new WXUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();

        UserInfo loginUserInfo = queryUserInfo("wbin1", "240", wxUserSystem.iterator());

        if (loginUserInfo == null) {
            loginUserInfo = queryUserInfo("wbin1", "240", qqUserSystem.iterator());
        }

        if (loginUserInfo == null) {
//            Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
        }

    }


    public static UserInfo queryUserInfo(String name, String userPwd, Iterator<UserInfo> infoIterator) {

        while (infoIterator.hasNext()) {
            UserInfo userInfo = infoIterator.next();
            if (userInfo.userName.equals(name) && userInfo.userPwd.equals(userPwd)) {
                return userInfo;
            }
        }
        return null;
    }
}
