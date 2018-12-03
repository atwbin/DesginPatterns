package com.wangcaigu.log_demo.simple2;

/**
 * Author：Created by Wbin on 2018/11/30
 *
 * Description： 策略设计模式的上下文  有点类似于Android中的上下文
 * 可以获取一些基本的信息
 */
public class FinanceContext {

    private IFinance finance;

    public FinanceContext(IFinance finance) {
        this.finance = finance;
    }

    public float finance(int month, int money) {
        return finance.finance(month, money);
    }

}

