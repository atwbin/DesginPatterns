package com.atwbin.builder_demo.practice2;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public interface INavigation3 {

    /**
     * 绑定视图
     */
    void attachParent(View view, ViewGroup parent);

    /**
     * 创建INavigationBar
     */
    void createINavigationBar();


    /**
     * 绑定参数
     */
    void attachINavigationBarParams();

}
