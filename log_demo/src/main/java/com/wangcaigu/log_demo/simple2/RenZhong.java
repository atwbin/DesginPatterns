package com.wangcaigu.log_demo.simple2;

/**
 * Author：Created by Wbin on 2018/11/30
 *
 * Description：
 */
public class RenZhong implements IFinance {
    @Override
    public float finance(int month, int money) {

        if (month == 3) {
            return money + money * 0.09f / 12 * month;
        }

        if (month == 6) {
            return money + money * 0.112f / 12 * month;
        }

        if (month == 12) {
            return money + money * 0.12f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");

    }
}
