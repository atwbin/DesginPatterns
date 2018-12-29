package com.wangcaigu.iterator_demo.simple2;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class TabListIterator<T extends BottomTabItem> implements TabIterator {

    private List<T> mTabItems;
    private int index;

    public TabListIterator() {
        mTabItems = new ArrayList<>();
    }

    public void addItem(T item) {
        mTabItems.add(item);
    }

    @Override
    public BottomTabItem next() {
        return mTabItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index<mTabItems.size();
    }

}
