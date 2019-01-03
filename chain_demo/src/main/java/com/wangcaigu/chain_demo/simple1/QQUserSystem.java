package com.wangcaigu.chain_demo.simple1;

/**
 * Author：Created by Wbin on 2019/1/2
 *
 * Description：
 */
public class QQUserSystem extends AbsUserSystemHandler {

    UserInfo[] userInfos;

    public QQUserSystem() {
        userInfos = new UserInfo[4];
        userInfos[0] = new UserInfo("wbin1", "123", "001", "男");
        userInfos[1] = new UserInfo("wbin2", "143", "002", "男");
        userInfos[2] = new UserInfo("wbin3", "153", "003", "男");
        userInfos[3] = new UserInfo("wbin4", "163", "004", "男");
    }

    @Override
    public UserInfo queryUserInfo(String userName, String userPwd) {
        for (UserInfo userInfo : userInfos) {
            if (userInfo.userName.equals(userName) && userInfo.userPwd.equals(userPwd)) {
                return userInfo;
            }
        }

        AbsUserSystemHandler nextHandler = getNextHandler();
        if (nextHandler != null) {
            return nextHandler.queryUserInfo(userName, userPwd);
        }

        return null;
    }

}
