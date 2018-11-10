package com.atwbin.builder_demo.practice;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/11/9
 *
 * Description：
 */
public interface INavitation2 {

    /**
     * 创建
     */
    void createNavitationBar();


    /**
     * 绑定参数
     */
    void attachNavitionParams();

    /**
     * 绑定根视图
     */

    void attachParent(View view, ViewGroup parent);


}
