package com.wangcaigu.chain_demo.simple2;

import com.wangcaigu.chain_demo.simple1.AbsUserSystemHandler;
import com.wangcaigu.chain_demo.simple1.IUserSystem;
import com.wangcaigu.chain_demo.simple1.QQUserSystem;
import com.wangcaigu.chain_demo.simple1.UserInfo;
import com.wangcaigu.chain_demo.simple1.WXUserSystem;

/**
 * Author：Created by Wbin on 2019/1/3
 *
 * Description：
 */
public class UserSystemFacade implements IUserSystem {

    private AbsUserSystemHandler mFirstSystemHandler;

    /// qq ->  wx -->  依次往下查找
    public UserSystemFacade() {
        mFirstSystemHandler = new WXUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();
        WXUserSystem wxUserSystem = new WXUserSystem();

        mFirstSystemHandler.nextHandler(qqUserSystem);
        qqUserSystem.nextHandler(wxUserSystem);
    }

    @Override
    public UserInfo queryUserInfo(String userName, String userPwd) {

        return mFirstSystemHandler.queryUserInfo(userName, userPwd);
    }
}
