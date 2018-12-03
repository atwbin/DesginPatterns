package com.wangcaigu.log_demo.simple1;

import com.wangcaigu.log_demo.simple2.FinanceContext;
import com.wangcaigu.log_demo.simple2.IFinance;
import com.wangcaigu.log_demo.simple2.RenZhong;

/**
 * Author：Created by Wbin on 2018/11/30
 *
 * Description：
 */
public class Client {

    public static void main(String[] args) {
//        FinanceManager manager = new FinanceManager();
//        float money = manager.finance(3, 10000, FinanceManager.Finance.ZHI_FU_BAO);
//        System.out.println("meney=" + money);

        //采用了策略设计模式
//        IFinance finance = new RenZhong();
//        float money = finance.finance(3, 10000);
//        System.out.println("money=" + money);

        IFinance finance = new RenZhong();
        FinanceContext context = new FinanceContext(finance);
        float money = context.finance(3, 12000);
        System.out.println("money=" + money);
    }
}
