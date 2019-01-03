package com.wangcaigu.chain_demo.simple1;

/**
 * Author：Created by Wbin on 2019/1/2
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {

        WXUserSystem wxUserSystem = new WXUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();

        wxUserSystem.nextHandler(wxUserSystem);
        qqUserSystem.nextHandler(qqUserSystem);

        UserInfo WXuserInfo = wxUserSystem.queryUserInfo("wbin1", "123");
        UserInfo QQuserInfo = qqUserSystem.queryUserInfo("wbin1", "123");

        System.out.println(WXuserInfo);
        System.out.println(QQuserInfo);
    }
}
