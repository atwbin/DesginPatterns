package com.wangcaigu.iterator_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class UserInfo {

    public String userName;
    public String userPwd;
    public String userId;
    public String userSex;


    public UserInfo(String userName, String userPwd, String userId, String userSex) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userId = userId;
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userId='" + userId + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }

}
