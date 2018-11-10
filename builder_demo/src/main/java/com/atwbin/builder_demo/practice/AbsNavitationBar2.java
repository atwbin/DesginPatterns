package com.atwbin.builder_demo.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atwbin.builder_demo.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：Created by Wbin on 2018/11/9
 *
 * Description：  导航栏的基类
 */
public class AbsNavitationBar2<T extends AbsNavitationBar2.Builder2> implements INavitation2 {

    public Builder2 mBuilder;
    private View mAbsNavitationBar2;

    public Builder2 getBuilder() {
        return mBuilder;
    }

    protected AbsNavitationBar2(Builder2 builder) {
        this.mBuilder = builder;
        createNavitationBar();
    }

    @Override
    public void createNavitationBar() {
        mAbsNavitationBar2 = LayoutInflater.from(mBuilder.mContext).inflate(R.layout.ui_navigation_bar, mBuilder.mParent, false);

        // 添加View
        attachParent(mAbsNavitationBar2, mBuilder.mParent);

        //绑定参数
        attachNavitionParams();
    }


    public <T extends View> T findViewById(Integer viewId) {

        return mAbsNavitationBar2.findViewById(viewId);
    }

    @Override
    public void attachNavitionParams() {

        //设置文本
        Map<Integer, String> textMaps = mBuilder.mTextMaps;
        for (Map.Entry<Integer, String> entry : textMaps.entrySet()) {
            TextView textView = findViewById(entry.getKey());
            textView.setText(entry.getValue());
        }

        //设置点击事件
        Map<Integer, View.OnClickListener> onClickListenerMap = mBuilder.mClickMaps;
        for (Map.Entry<Integer, View.OnClickListener> entry : onClickListenerMap.entrySet()) {
            View view = findViewById(entry.getKey());
            view.setOnClickListener(entry.getValue());
        }
    }

    @Override
    public void attachParent(View view, ViewGroup parent) {
        parent.addView(view, 0);
    }


    /**
     * 构建Builder
     */
    public static abstract class Builder2<T extends Builder2> {
        public Context mContext;
        public int mLayoutId;
        public ViewGroup mParent;
        public Map<Integer, String> mTextMaps;
        public Map<Integer, View.OnClickListener> mClickMaps;

        public Builder2(Context context, int layoutId, ViewGroup parent) {
            this.mContext = context;
            this.mLayoutId = layoutId;
            this.mParent = parent;

            mTextMaps = new HashMap<>();
            mClickMaps = new HashMap<>();
        }


        /**
         * 创建AbsNavitationBar2
         *
         * @return
         */
        public abstract AbsNavitationBar2 create2();


        /**
         * 设置文本
         *
         * @param viewId
         * @param text
         * @return
         */
        public T setText(int viewId, String text) {
            mTextMaps.put(viewId, text);
            return (T) this;
        }

        /**
         * 设置事件监听
         *
         * @param viewId
         * @param listener
         * @return
         */
        public T setOnClickListener(int viewId, View.OnClickListener listener) {
            mClickMaps.put(viewId, listener);
            return (T) this;
        }
    }
}
