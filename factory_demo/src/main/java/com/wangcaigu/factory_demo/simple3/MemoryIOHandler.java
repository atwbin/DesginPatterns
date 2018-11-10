package com.wangcaigu.factory_demo.simple3;

import android.util.LruCache;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class MemoryIOHandler implements IOHandler {

    // LruCache   存储在运行内存
    //存在运行内存中 原理是什么？  其实就是一个Map集合
    private static LruCache<String, Object> mCache = new LruCache<>(10 * 1024 * 1024);

    @Override
    public void save(String key, String value) {
        mCache.put(key, value);
    }

    @Override
    public void save(String key, double value) {

    }

    @Override
    public void save(String key, int value) {

    }

    @Override
    public void save(String key, long value) {

    }

    @Override
    public void save(String key, boolean value) {

    }

    @Override
    public void save(String key, Object value) {

    }

    @Override
    public String getString(String key) {
        return (String) mCache.get(key);
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return 0;
    }

    @Override
    public int getInt(String key, double defaultValue) {
        return 0;
    }

    @Override
    public double getDouble(String key, int defaultValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return false;
    }

    @Override
    public Object getObject(String key, Object defaultValue) {
        return null;
    }
}
