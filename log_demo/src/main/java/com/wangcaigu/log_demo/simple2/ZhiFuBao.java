package com.wangcaigu.log_demo.simple2;


/**
 * Author：Created by Wbin on 2018/11/30
 *
 * Description：
 */
public class ZhiFuBao implements IFinance {

    @Override
    public float finance(int month, int money) {
        if (month == 3) {
            return money + money * 0.047f / 12 * month;
        }

        if (month == 6) {
            return money + money * 0.050f / 12 * month;
        }

        if (month == 12) {
            return money + money * 0.06f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");
    }
}
