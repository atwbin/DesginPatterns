package com.atwbin.builder_demo.navigationbar;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atwbin.builder_demo.R;

/**
 * Author：Created by Wbin on 2018/11/9
 *
 * Description：
 */
public class DefaultNavitationBar extends AbsNavigationBar<DefaultNavitationBar.Builder> {


    protected DefaultNavitationBar(Builder builder) {
        super(builder);
    }

    @Override
    public void attachNavigationParams() {
        super.attachNavigationParams();

        //处理特有的
        TextView leftView = findViewById(R.id.back_tv);
        leftView.setVisibility(getBuilder().mLeftVisible);
    }

    /**
     * 导航栏的Builder
     */
    public static class Builder extends AbsNavigationBar.Builder<DefaultNavitationBar.Builder> {

        private int mLeftVisible = View.VISIBLE;

        public Builder(Context context, ViewGroup parent) {
            super(context, R.layout.ui_navigation_bar, parent);
        }

        @Override
        public DefaultNavitationBar create() {
            return new DefaultNavitationBar(this);
        }

        public Builder setLeftText(String text) {
            setText(R.id.back_tv, text);
            return this;
        }

        public Builder setLeftOnClickListener(View.OnClickListener leftOnClickListener) {
            setOnClickListener(R.id.back_tv, leftOnClickListener);
            return this;

        }

        public Builder setHideLeftText() {
            mLeftVisible = View.GONE;
            return this;
        }
    }


}
