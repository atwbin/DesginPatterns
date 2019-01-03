package com.wangcaigu.chain_demo.simple2;

import com.wangcaigu.chain_demo.simple1.UserInfo;

/**
 * Author：Created by Wbin on 2019/1/3
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {

        //门面设计模式
        UserSystemFacade userSystemFacade = new UserSystemFacade();
        UserInfo userInfo = userSystemFacade.queryUserInfo("wbin1", "123");
        System.out.println(userInfo);

    }
}
