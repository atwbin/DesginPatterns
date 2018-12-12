package com.wangcaigu.adapter_demo.simple3;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public interface AdapterTarget {

    /**
     * 获取总的个数
     */
    int getCount();

    /**
     * 获取View
     */
    View getView(int position, ViewGroup parent);
}
