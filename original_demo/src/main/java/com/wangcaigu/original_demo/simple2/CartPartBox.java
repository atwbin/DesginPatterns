package com.wangcaigu.original_demo.simple2;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：  汽车零件的箱子
 */
public class CartPartBox implements IBox {

    private int number;
    private String name;
    private String carBrand;

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
        CartPartBox box = new CartPartBox();
        box.setName(name);
        box.setCarBrand(carBrand);
        box.setNumber(number);
        return box;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
