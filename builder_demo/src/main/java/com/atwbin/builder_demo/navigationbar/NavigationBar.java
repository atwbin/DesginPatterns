package com.atwbin.builder_demo.navigationbar;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/11/4
 *
 * Description： 直接可以使用的类
 */
public class NavigationBar extends AbsNavigationBar {

    protected NavigationBar(Builder builder) {
        super(builder);
    }


    /**
     * 导航栏的  Builder
     */
    public static class Builder extends AbsNavigationBar.Builder<NavigationBar.Builder> {

        public Builder(Context context, int layoutId, ViewGroup parent) {
            super(context, layoutId, parent);
        }

        @Override
        public NavigationBar create() {
            return new NavigationBar(this);
        }

    }
}
