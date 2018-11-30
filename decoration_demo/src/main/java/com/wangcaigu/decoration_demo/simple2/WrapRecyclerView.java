package com.wangcaigu.decoration_demo.simple2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author：Created by Wbin on 2018/11/12
 *
 * Description：
 */
public class WrapRecyclerView extends RecyclerView {

    private WrapRecyclerAdapter mAdapter;

    public WrapRecyclerView(Context context) {
        super(context);
    }

    public WrapRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setAdapter(WrapRecyclerAdapter adapter) {
        this.mAdapter = adapter;
        super.setAdapter(mAdapter);
    }

    /**
     * 添加头部
     */
    public void addHeaderView(View view) {
        if (mAdapter != null) {
            mAdapter.addHeadView(view);
        }
    }

    /**
     * 添加底部
     */
    public void addFooterView(View view) {
        if (mAdapter != null) {
            mAdapter.addFootView(view);
        }
    }

    /**
     * 移除头部
     */
    public void removeHeaderView(View view) {
        if (mAdapter != null) {
            mAdapter.removeHeadView(view);
        }
    }


    /**
     * 移除底部
     */
    public void removeFooterView(View view) {
        if (mAdapter != null) {
            mAdapter.removeFootView(view);
        }
    }
}
