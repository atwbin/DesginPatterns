package com.wangcaigu.original_demo.simple4;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：
 */
public class User implements Cloneable {

    public String userName;
    public int age;
    public Address userAddress;

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }


    public static class Address {
        public String addressName;
        public String city;

        public Address(String addressName, String city) {
            this.addressName = addressName;
            this.city = city;
        }
    }
}
