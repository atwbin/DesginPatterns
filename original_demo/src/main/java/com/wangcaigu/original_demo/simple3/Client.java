package com.wangcaigu.original_demo.simple3;

import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {
        CartPartBox box = new CartPartBox();
        box.setName("尾灯灯罩");
        box.setCarBrand("奥迪");
        box.setNumber(500);

        List<TruckCar> truckCarList = SplitService.splitBox(box);

        for (TruckCar truckCar : truckCarList) {
            System.out.println("数量："+truckCar.remove().getNumber());
        }

    }
}
