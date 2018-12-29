package com.wangcaigu.iterator_demo.simple1;

import com.wangcaigu.iterator_demo.simple1.iterator.Iterator;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：容器的接口
 */
public interface Aggregate<T> {


    Iterator<T> iterator();

}
