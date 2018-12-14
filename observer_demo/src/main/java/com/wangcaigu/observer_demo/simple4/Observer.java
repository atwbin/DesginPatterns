package com.wangcaigu.observer_demo.simple4;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public interface Observer<T> {

    void update(T t);
}
