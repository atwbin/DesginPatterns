package com.wangcaigu.iterator_demo.simple2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Author：Created by Wbin on 2018/12/29
 *
 * Description：
 */
public abstract class BottomTabItem {

    private View mTabItemView;
    private int mLayoutId;
    private Context mContext;

    public BottomTabItem(int layoutId, Context context) {
        this.mLayoutId = layoutId;
        this.mContext = context;
    }

    /**
     * 获取底部View布局
     */
    public View getTabView() {
        if (mTabItemView == null) {
            mTabItemView = LayoutInflater.from(mContext).inflate(mLayoutId, null);
            initLayout();
        }
        return mTabItemView;
    }

    /**
     * 初始化底部布局view
     */
    protected abstract void initLayout();


    protected <T> T findViewById(int id) {
        return (T) mTabItemView.findViewById(id);
    }

    /**
     * 是否选中
     */
    protected abstract void setSelected(boolean selected);
}
