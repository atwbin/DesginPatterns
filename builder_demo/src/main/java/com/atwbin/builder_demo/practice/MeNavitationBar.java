package com.atwbin.builder_demo.practice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.atwbin.builder_demo.R;

/**
 * Author：Created by Wbin on 2018/11/9
 *
 * Description：
 */
public class MeNavitationBar extends AbsNavitationBar2<MeNavitationBar.Builder2> {


    protected MeNavitationBar(Builder2 builder) {
        super(builder);
    }

    @Override
    public void attachNavitionParams() {
        super.attachNavitionParams();
    }

    public static class Builder2 extends AbsNavitationBar2.Builder2<MeNavitationBar.Builder2> {

        private int mLeftVisiable = View.VISIBLE;

        public Builder2(Context context, ViewGroup parent) {
            super(context, R.layout.ui_navigation_bar, parent);
        }


        @Override
        public MeNavitationBar create2() {
            return new MeNavitationBar(this);
        }

        /**
         * 设置文本
         *
         * @param text
         * @return
         */
        public Builder2 setText(String text) {
            setText(R.id.back_tv, text);
            return this;
        }

        /**
         * 监听事件
         *
         * @param listener
         * @return
         */
        public Builder2 setOnClickListener(View.OnClickListener listener) {
            setOnClickListener(R.id.back_tv, listener);
            return this;
        }

        public Builder2 setLeftTextHide() {
            mLeftVisiable = View.GONE;
            return this;
        }
    }
}
