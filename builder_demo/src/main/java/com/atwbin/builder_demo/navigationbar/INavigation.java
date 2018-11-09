package com.atwbin.builder_demo.navigationbar;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/11/4
 *
 * Description：
 */
public interface INavigation {


    /**
     * 创建
     */
    void createNavigationBar();

    /**
     * 绑定参数
     */
    void attachNavigationParams();

    /**
     *
     * @param absNavigationBar
     * @param parent
     */
    void attachParent(View absNavigationBar, ViewGroup parent);
}
