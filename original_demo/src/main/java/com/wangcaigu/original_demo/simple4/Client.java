package com.wangcaigu.original_demo.simple4;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        user.age = 18;
        user.userName = "wbin";
        user.userAddress = new User.Address("甘肃", "甘肃兰州");

        System.out.println(user.age);
        System.out.println(user.userName);
        System.out.println(user.userAddress);

        System.out.println("-----------");

        try {
            User userCopy = user.clone();
            userCopy.userAddress.addressName = "北京";
            userCopy.userName = "bin";

            System.out.println(userCopy.userAddress.addressName);
            System.out.println(userCopy.userName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
