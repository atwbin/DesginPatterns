package com.wangcaigu.factory_demo.simple2;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：工厂设计模式
 */
public class IOHanderFactory {


    public enum IOType {
        MEMORY, PREFERENCE
    }

    public static IOHandler createIOHandle(IOType ioType) {
        switch (ioType) {
            case MEMORY:
                return new MemoryIOHandler();
            case PREFERENCE:
                return new PreferencesIOHandler();
            default:
                return null;
        }
    }


}
