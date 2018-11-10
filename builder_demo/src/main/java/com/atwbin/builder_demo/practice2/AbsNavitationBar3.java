package com.atwbin.builder_demo.practice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.HashMap;
import java.util.Map;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class AbsNavitationBar3<T extends AbsNavitationBar3.Builder> implements INavigation3 {

    private Builder mBuilder;
    private View mAbsNavitationBar3;

    public Builder getBuilder() {
        return mBuilder;
    }

    public AbsNavitationBar3(Builder builder) {
        this.mBuilder = builder;
        createINavigationBar();
    }

    @Override
    public void attachParent(View view, ViewGroup parent) {
        parent.addView(view, 0);
    }

    @Override
    public void createINavigationBar() {
        mAbsNavitationBar3 = LayoutInflater.from(mBuilder.mContext).inflate(mBuilder.mLayoutId, mBuilder.mParent, false);

        //添加
        attachParent(mAbsNavitationBar3, mBuilder.mParent);

        //绑定参数
        attachINavigationBarParams();
    }

    @Override
    public void attachINavigationBarParams() {
        //文本参数
        Map<Integer, String> textMaps = mBuilder.mTextMaps;
        for (Map.Entry<Integer, String> entry : textMaps.entrySet()) {
            TextView textView = findViewById(entry.getKey());
            textView.setText(entry.getValue());
        }

        //事件点击
        Map<Integer, View.OnClickListener> onClickMaps = mBuilder.mOnClickListenerMaps;
        for (Map.Entry<Integer, View.OnClickListener> entry : onClickMaps.entrySet()) {
            View view = findViewById(entry.getKey());
            view.setOnClickListener(entry.getValue());
        }
    }


    private <T extends View> T findViewById(Integer viewId) {
        return (T) mAbsNavitationBar3.findViewById(viewId);

    }

    public static abstract class Builder<T extends Builder> {

        public Context mContext;
        public int mLayoutId;
        public ViewGroup mParent;
        public Map<Integer, String> mTextMaps;
        public Map<Integer, View.OnClickListener> mOnClickListenerMaps;

        public Builder(Context context, int layoutId, ViewGroup parent) {
            this.mContext = context;
            this.mLayoutId = layoutId;
            this.mParent = parent;

            mTextMaps = new HashMap<>();
            mOnClickListenerMaps = new HashMap<>();
        }


        /**
         * 创建AbsNavitationBar3
         *
         * @return
         */
        public abstract AbsNavitationBar3 create();

        /**
         * 设置文本
         *
         * @param layoutId
         * @param text
         * @return
         */
        public T setText(int layoutId, String text) {
            mTextMaps.put(layoutId, text);
            return (T) this;
        }

        /**
         * 设置事件监听
         *
         * @param layoutId
         * @param listener
         * @return
         */
        public T setOnClickLitener(int layoutId, View.OnClickListener listener) {
            mOnClickListenerMaps.put(layoutId, listener);
            return (T) this;
        }

    }
}
