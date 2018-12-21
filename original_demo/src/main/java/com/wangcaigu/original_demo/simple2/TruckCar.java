package com.wangcaigu.original_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description： 装载的卡车
 */
public class TruckCar {

    public IBox iBox;

    /**
     * 装载箱子
     */
    public void addBox(IBox iBox) {
        this.iBox = iBox;
    }

    /**
     * 移除
     */
    public IBox remove() {
        return iBox;
    }
}
