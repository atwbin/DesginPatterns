package com.wangcaigu.decoration_demo.simple2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Author：Created by Wbin on 2018/11/12
 *
 * Description:采用装饰设计模式  用来支持添加头部和底部
 */
public class WrapRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final RecyclerView.Adapter mRealAdapter;

    private ArrayList<View> mHeaderViews;
    private ArrayList<View> mFooterViews;

    public WrapRecyclerAdapter(RecyclerView.Adapter realAdapter) {
        this.mRealAdapter = realAdapter;

        mRealAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                notifyDataSetChanged();
            }
        });

        mHeaderViews = new ArrayList<>();
        mFooterViews = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {

        //头部的ViewHolder
        int numHeaders = getHeadersCount();
        if (position < numHeaders) {
            return createHeaderFooterViewHolder(mHeaderViews.get(position));
        }

        //real ViewHolder
        final int abjPosition = position - numHeaders;
        int adapterCount = 0;
        if (mRealAdapter != null) {
            adapterCount = mRealAdapter.getItemCount();
            if (abjPosition < adapterCount) {
                return mRealAdapter.onCreateViewHolder(parent, mRealAdapter.getItemViewType(abjPosition));
            }
        }
        return createHeaderFooterViewHolder(mFooterViews.get(abjPosition - adapterCount));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int numHeaders = getHeadersCount();
        if (position < numHeaders) {
            return;
        }

        final int abjPosition = position - numHeaders;
        int adaterCount = 0;
        if (mRealAdapter != null) {
            adaterCount = mRealAdapter.getItemCount();
            if (abjPosition < adaterCount) {
                mRealAdapter.onBindViewHolder(holder, position);
            }
        }

    }

    @Override
    public int getItemCount() {
        // 总共返回多少条 = 底部条数+头部条数+真实的Adapter条数
        return mFooterViews.size() + mHeaderViews.size() + mRealAdapter.getItemCount();
    }

    @Override
    public int getItemViewType(int position) {
        //把位置作为viewType
        return position;
    }


    private RecyclerView.ViewHolder createHeaderFooterViewHolder(View view) {
        return new RecyclerView.ViewHolder(view) {
        };
    }


    public int getHeadersCount() {
        return mHeaderViews.size();
    }

    public int getFooterCount() {
        return mFooterViews.size();
    }

    /**
     * 添加头部
     *
     * @param view view
     */
    public void addHeadView(View view) {
        if (!mHeaderViews.contains(view)) {
            mHeaderViews.add(view);
            notifyDataSetChanged();
        }
    }

    /**
     * 添加底部FootView
     *
     * @param view view
     */
    public void addFootView(View view) {
        if (!mFooterViews.contains(view)) {
            mFooterViews.add(view);
            notifyDataSetChanged();
        }
    }

    /**
     * 移除头部View
     *
     * @param view view
     */
    public void removeHeadView(View view) {
        if (mHeaderViews.contains(view)) {
            mHeaderViews.remove(view);
            notifyDataSetChanged();
        }
    }

    /**
     * 移除底部View
     *
     * @param view view
     */
    public void removeFootView(View view) {
        if (mFooterViews.contains(view)) {
            mFooterViews.remove(view);
            notifyDataSetChanged();
        }
    }

}
