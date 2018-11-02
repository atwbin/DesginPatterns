package com.atwbin.singleton_demo.simple7;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：容器管理
 */
public class Singleton {

    private static Map<String, Object> mSingleMap = new HashMap<>();


    private Singleton() {
    }

    static {
        mSingleMap.put("activity manager", new Singleton());
    }

    public static Object getService(String serviceName) {
        return mSingleMap.get(serviceName);
    }
}
