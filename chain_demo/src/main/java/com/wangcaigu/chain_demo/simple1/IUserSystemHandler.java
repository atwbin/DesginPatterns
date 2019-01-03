package com.wangcaigu.chain_demo.simple1;

/**
 * Author：Created by Wbin on 2019/1/2
 *
 * Description：责任链设计模式---抽象处理接口
 */
public interface IUserSystemHandler<T extends IUserSystemHandler> {

    public void nextHandler(T systemHandler);
}
