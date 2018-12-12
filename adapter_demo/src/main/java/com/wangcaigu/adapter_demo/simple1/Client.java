package com.wangcaigu.adapter_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/7
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        RMBAdapter rmbAdapter = new RMBAdapter(560);
        float rmb = rmbAdapter.getRmb();

        System.out.print("人民币" + rmb);


        Adapter usd = new Adapter(560);
        float usds = usd.getUsd();
        System.out.print("美元" + usds);
    }
}
