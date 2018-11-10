package com.wangcaigu.factory_demo;

import android.app.Application;

import com.wangcaigu.factory_demo.simple1.SharedPreferencesUtils;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class BaseApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

     SharedPreferencesUtils.getInstance().init(this);
    }


}
