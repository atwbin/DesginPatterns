package com.wangcaigu.factory_demo.simple4;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class DiskIOHandler implements IOHandler {
    @Override
    public void save(String key, String value) {

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
        return null;
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
