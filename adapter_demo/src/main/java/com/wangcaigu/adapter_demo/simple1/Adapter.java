package com.wangcaigu.adapter_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/7
 *
 * Description：适配器对象  将人民币适配成美元
 */
public class Adapter extends RMBAdapter implements UsdTarget {


    public Adapter(float rmb) {
        super(rmb);
    }

    @Override
    public float getUsd() {
        return getRmb() / 5.6f;
    }
}
