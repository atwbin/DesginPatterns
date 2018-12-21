package com.wangcaigu.original_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：出货箱子的接口
 */
public interface IBox {

    void setNumber(int number);

    int getNumber();

    IBox copy();
}
