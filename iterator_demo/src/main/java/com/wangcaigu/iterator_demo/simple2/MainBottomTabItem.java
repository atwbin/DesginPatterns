package com.wangcaigu.iterator_demo.simple2;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.wangcaigu.iterator_demo.R;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public class MainBottomTabItem extends BottomTabItem {

    private Builder builder;

    public MainBottomTabItem(Context context) {
        super(R.layout.item_tab_bottom, context);
    }


    public MainBottomTabItem(Builder builder) {
        this(builder.context);
        this.builder = builder;
    }


    @Override
    protected void initLayout() {
        ImageView ivTabIcon = findViewById(R.id.iv_tab_icon);
        TextView tvTabText = findViewById(R.id.tv_tab_text);

        if (!TextUtils.isEmpty(builder.text)) {
            tvTabText.setText(builder.text);
        }

        if (builder.resIconId != 0) {
            ivTabIcon.setImageResource(builder.resIconId);
        }
    }

    @Override
    protected void setSelected(boolean selected) {

        ImageView ivTabIcon = findViewById(R.id.iv_tab_icon);
        TextView tvTabText = findViewById(R.id.tv_tab_text);

        ivTabIcon.setSelected(selected);
        tvTabText.setSelected(selected);
    }

    public static class Builder {
        Context context;
        String text;
        int resIconId;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder resIconId(int resIconId) {
            this.resIconId = resIconId;
            return this;
        }

        public MainBottomTabItem create() {
            return new MainBottomTabItem(this);
        }
    }
}
