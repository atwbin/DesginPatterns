package com.wangcaigu.original_demo.simple3;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/20
 *
 * Description： 把箱子进行一下拆分
 */
public class SplitService {

    public static List<TruckCar> splitBox(IBox box) {
        List<TruckCar> cartList = new ArrayList<>();
        while (box.getNumber() > 200) {
            IBox newBox = null;
            try {
                newBox = box.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            newBox.setNumber(200);

            TruckCar truckCar = new TruckCar();
            truckCar.addBox(newBox);
            cartList.add(truckCar);


            box.setNumber(box.getNumber() - 200);
        }

        TruckCar truckCar = new TruckCar();
        truckCar.addBox(box);
        cartList.add(truckCar);

        return cartList;

    }
}
