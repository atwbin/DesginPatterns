package com.wangcaigu.observer_demo.simple4;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class Member {

    private String name;
    private String age;

    public Member(String name,String age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
