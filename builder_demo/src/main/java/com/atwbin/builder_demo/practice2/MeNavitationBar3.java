package com.atwbin.builder_demo.practice2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.atwbin.builder_demo.R;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class MeNavitationBar3 extends AbsNavitationBar3<MeNavitationBar3.Builder>{


    protected MeNavitationBar3(Builder builder) {
        super(builder);
    }


    public static class Builder extends AbsNavitationBar3.Builder<MeNavitationBar3.Builder> {
        public Builder(Context context, ViewGroup parent) {
            super(context, R.layout.ui_navigation_bar, parent);
        }

        @Override
        public MeNavitationBar3 create() {
            return new MeNavitationBar3(this);
        }

        public Builder setText(String text) {
            setText(R.id.back_tv, text);
            return this;
        }

        public Builder setOnClickLitener(View.OnClickListener litener) {
            setOnClickLitener(R.id.back_tv, litener);
            return this;
        }

    }
}
