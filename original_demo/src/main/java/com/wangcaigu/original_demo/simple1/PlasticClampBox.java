package com.wangcaigu.original_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description： 具体的出货的物品    塑料夹子
 */
public class PlasticClampBox implements IBox {

    private String name;
    private int number;

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
