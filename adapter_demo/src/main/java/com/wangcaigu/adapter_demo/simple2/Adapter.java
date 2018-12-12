package com.wangcaigu.adapter_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/7
 *
 * Description：适配器对象  将人民币适配成美元
 */
public class Adapter implements UsdTarget {

    private RMBAdapter rmbAdapter;

    public Adapter(RMBAdapter rmbAdapter) {
        this.rmbAdapter = rmbAdapter;
    }

    @Override
    public float getUsd() {
        return rmbAdapter.getRmb() / 5.6f;
    }
}
