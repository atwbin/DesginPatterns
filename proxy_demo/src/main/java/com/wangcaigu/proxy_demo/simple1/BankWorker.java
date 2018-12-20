package com.wangcaigu.proxy_demo.simple1;

/**
 * Author：Created by Wbin on 2018/12/18
 *
 * Description： 代理对象
 */
public class BankWorker implements IBank {

    private IBank mIbank;

    /**
     * 持有被代理对象
     */
    public BankWorker(IBank iBank) {
        this.mIbank = iBank;
    }

    @Override
    public void applyBank() {
        System.out.println("开始受理");
        mIbank.applyBank();
        System.out.println("结束受理");
    }
}
