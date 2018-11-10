package com.wangcaigu.factory_demo.simple3;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class PreferenceIOFactory implements IOFactory {
    @Override
    public IOHandler createIOHandler() {
        return new PreferenceIOHandler();
    }
}
