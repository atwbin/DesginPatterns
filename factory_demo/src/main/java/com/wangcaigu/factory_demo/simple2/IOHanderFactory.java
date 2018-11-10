package com.wangcaigu.factory_demo.simple2;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：工厂设计模式
 */
public class IOHanderFactory {


    public enum IOType {
        MEMORY, PREFERENCE, DISK
    }

    //问题： 我要新增一个新的存储方式？   怎么实现   -->需要新增类型  
    public static IOHandler createIOHandle(IOType ioType) {
        switch (ioType) {
            case MEMORY:
                return new MemoryIOHandler();
            case PREFERENCE:
                return new PreferencesIOHandler();
            case DISK:
                return null;  //返回具体的类
            default:
                return null;
        }
    }


}
