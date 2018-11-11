package com.wangcaigu.factory_demo.simple5;


import com.wangcaigu.factory_demo.simple4.DiskIOHandler;
import com.wangcaigu.factory_demo.simple4.IOHandler;
import com.wangcaigu.factory_demo.simple4.MemoryIOHandler;
import com.wangcaigu.factory_demo.simple4.PreferencesIOHandler;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：抽象工厂设计模式
 */
public class IOHandlerFactory {

    private static volatile IOHandlerFactory mInstance;
    private IOHandler mMemoryIOHandler, mPreferencesIOHandler;


    private IOHandlerFactory() {

    }

    public static IOHandlerFactory getInstance() {
        if (mInstance == null) {
            synchronized (IOHandlerFactory.class) {
                if (mInstance == null) {
                    mInstance = new IOHandlerFactory();
                }
            }
        }
        return mInstance;
    }

    //问题： 我要新增一个新的存储方式？   怎么实现   -->需要新增类型
    public static IOHandler createIOHandle(Class<? extends IOHandler> ioHandlerClass) {
        try {
            return ioHandlerClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PreferencesIOHandler();  //根据需求返回
    }

    /**
     * 获取运行内存存储
     *
     * @return
     */
    public IOHandler getMemIOHandler() {
        if (mMemoryIOHandler == null) {
            mMemoryIOHandler = createIOHandle(MemoryIOHandler.class);
        }
        return mMemoryIOHandler;
    }

    /**
     * 获取磁盘存储
     *
     * @return
     */
    public static IOHandler getDiskIOHandler() {
        return createIOHandle(DiskIOHandler.class);
    }

    /**
     * 获取sp内存存储
     *
     * @return
     */
    public IOHandler getPreferencesIOHandler() {
        if (mPreferencesIOHandler == null) {
            mPreferencesIOHandler = createIOHandle(PreferencesIOHandler.class);
        }
        return mPreferencesIOHandler;
    }

    /**
     * 获取默认存储
     *
     * @return
     */
    public IOHandler getDefaultIOHandler() {
        return mPreferencesIOHandler;
    }
}
