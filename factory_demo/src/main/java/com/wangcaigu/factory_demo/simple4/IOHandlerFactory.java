package com.wangcaigu.factory_demo.simple4;


/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：抽象工厂设计模式
 */
public class IOHandlerFactory {


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
    public static IOHandler getMemIOHandler() {
        return createIOHandle(MemoryIOHandler.class);
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
     * 获取sp存储
     *
     * @return
     */
    public static IOHandler getPreferencesIOHandler() {
        return createIOHandle(PreferencesIOHandler.class);
    }

    /**
     * 获取默认存储
     *
     * @return
     */
    public static IOHandler getDefaultIOHandler() {
        return getPreferencesIOHandler();
    }
}
