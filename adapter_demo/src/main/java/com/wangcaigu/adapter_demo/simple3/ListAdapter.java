package com.wangcaigu.adapter_demo.simple3;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wangcaigu.adapter_demo.R;

import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/12
 *
 * Description：
 */
public class ListAdapter implements AdapterTarget {

    private List<String> mItemData;
    private Context mContext;

    public ListAdapter(Context context, List<String> itemData) {
        this.mContext = context;
        mItemData = itemData;
    }

    @Override
    public int getCount() {
        return mItemData.size();
    }

    @Override
    public View getView(int position, ViewGroup parent) {
        TextView textview = (TextView) LayoutInflater.from(mContext).inflate(R.layout.view_item, parent, false);
        textview.setText(mItemData.get(position));
        return textview;
    }
}
