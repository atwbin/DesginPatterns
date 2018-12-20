package com.wangcaigu.proxy_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description： 静态代理
 */
public class Client {

    public static void main(String[] args) {
        Man man = new Man("wbin");
        BankWorker bankWorker = new BankWorker(man);
        bankWorker.applyBank();
    }
}
