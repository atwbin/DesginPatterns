package com.wangcaigu.adapter_demo.simple3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Author：Created by Wbin on 2018/12/7
 *
 * Description：简单的listVIew    不考虑复用
 */
public class WbinListView extends ScrollView {

    private LinearLayout mContainer;
    private AdapterTarget mAdapter;

    public WbinListView(Context context) {
        super(context );
        init(context);
    }


    public WbinListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        mContainer = new LinearLayout(context);
        mContainer.setOrientation(LinearLayout.VERTICAL);
        addView(mContainer, 0);
    }


    @Override
    public void addView(View child) {
        mContainer.addView(child);
    }

    public void setAdapter(ListAdapter adapter) {
        this.mAdapter = adapter;
        int count = mAdapter.getCount();

        for (int i = 0; i < count; i++) {
            View childView = mAdapter.getView(i, mContainer);
            addView(childView);
        }

    }
}
