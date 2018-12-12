package com.wangcaigu.adapter_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/7
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {

        RMBAdapter usd = new RMBAdapter(560);
        Adapter adapter = new Adapter(usd);
        float usds = adapter.getUsd();
        System.out.print("美元:" + usds);
    }
}
