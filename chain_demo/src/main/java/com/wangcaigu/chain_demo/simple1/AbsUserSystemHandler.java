package com.wangcaigu.chain_demo.simple1;

/**
 * Author：Created by Wbin on 2019/1/2
 *
 * Description：
 */
public abstract class AbsUserSystemHandler implements IUserSystemHandler<AbsUserSystemHandler>, IUserSystem {

    private AbsUserSystemHandler nextHandler;

    public void nextHandler(AbsUserSystemHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public AbsUserSystemHandler getNextHandler() {
        return nextHandler;
    }


}
