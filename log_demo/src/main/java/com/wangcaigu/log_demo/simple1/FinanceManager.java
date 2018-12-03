package com.wangcaigu.log_demo.simple1;

/**
 * Author：Created by Wbin on 2018/11/30
 *
 * Description：
 */
public class FinanceManager {

    public enum Finance {
        ZHI_FU_BAO, REN_ZHONG;
    }

    private float zhifuBaoFinance(int month, int money) {
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

    private float renZhongJfFinance(int month, int money) {
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

    public float finance(int month, int money, Finance finance) {
        switch (finance) {
            case ZHI_FU_BAO:
                zhifuBaoFinance(month, money);
                break;
            case REN_ZHONG:
                renZhongJfFinance(month, money);
                break;
            default:
                break;
        }
        return 0f;
    }
}
