package com.wangcaigu.factory_demo.simple3;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：数据存储的规范
 */
public interface IOHandler {

    void save(String key, String value);

    void save(String key, double value);

    void save(String key, int value);

    void save(String key, long value);

    void save(String key, boolean value);

    void save(String key, Object value);


    String getString(String key);

    double getDouble(String key, double defaultValue);

    int getInt(String key, double defaultValue);

    double getDouble(String key, int defaultValue);

    long getLong(String key, long defaultValue);

    boolean getBoolean(String key, boolean defaultValue);

     Object getObject(String key, Object defaultValue);


}
