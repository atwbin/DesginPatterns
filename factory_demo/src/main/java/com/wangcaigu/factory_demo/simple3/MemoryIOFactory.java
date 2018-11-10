package com.wangcaigu.factory_demo.simple3;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description： 运行内存存储的Factory
 */
public class MemoryIOFactory implements IOFactory {


    @Override
    public IOHandler createIOHandler() {
        return new MemoryIOHandler();
    }


}
