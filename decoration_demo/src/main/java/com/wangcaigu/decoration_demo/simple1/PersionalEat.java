package com.wangcaigu.decoration_demo.simple1;

import android.util.Log;

/**
 * Author：Created by Wbin on 2018/11/12
 *
 * Description：
 */
public class PersionalEat implements Eat {
    @Override
    public void eat() {
        Log.d("TAG", "PersionEat");
    }
}
