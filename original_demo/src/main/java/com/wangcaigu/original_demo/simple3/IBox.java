package com.wangcaigu.original_demo.simple3;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：出货箱子的接口
 */
public abstract class IBox implements Cloneable {

    abstract void setNumber(int number);

    abstract int getNumber();

    @Override
    protected IBox clone() throws CloneNotSupportedException {
        return (IBox) super.clone();
    }
}
