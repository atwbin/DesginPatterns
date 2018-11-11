package com.wangcaigu.factory_demo.simple4;


/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：生成类的工厂接口
 */
public interface IOFactory {

    IOHandler createIOHandler(Class<? extends IOHandler> ioHandlerClass);
}
