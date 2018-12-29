package com.wangcaigu.iterator_demo.simple1.iterator;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public interface Iterator<T> {

    /**
     * 获取一下个
     *
     * @return
     */
    T next();

    /**
     * 是否有下一个
     */
    boolean hasNext();
}
