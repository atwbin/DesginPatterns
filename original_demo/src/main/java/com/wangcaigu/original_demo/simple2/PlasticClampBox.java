package com.wangcaigu.original_demo.simple2;

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

    @Override
    public IBox copy() {
        PlasticClampBox box = new PlasticClampBox();
        box.setName(name);
        box.setNumber(number);
        return box;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
