package com.wangcaigu.decoration_demo.simple1;

import android.util.Log;

/**
 * Author：Created by Wbin on 2018/11/12
 *
 * Description：
 */
public class StudentEat implements Eat {

    private Eat eat;

    public StudentEat(PersionalEat eat) {
        this.eat = eat;
    }

    @Override
    public void eat() {
        eat();
        Log.d("TAG", "StudentEat");
    }
}
