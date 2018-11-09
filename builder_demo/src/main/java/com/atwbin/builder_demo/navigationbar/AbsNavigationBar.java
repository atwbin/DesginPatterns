package com.atwbin.builder_demo.navigationbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：Created by Wbin on 2018/11/4
 *
 * Description：  导航栏的基类
 */
public class AbsNavigationBar<T extends AbsNavigationBar.Builder> implements INavigation {

    private Builder mBuilder;
    private View mAbsNavigationBar;

    /**
     * 返回 Builder
     *
     * @return
     */
    public Builder getBuilder() {
        return mBuilder;
    }

    protected AbsNavigationBar(Builder builder) {
        this.mBuilder = builder;
        createNavigationBar();
    }


    @Override
    public void createNavigationBar() {
        mAbsNavigationBar = LayoutInflater.from(mBuilder.mContext).inflate(mBuilder.mLayoutId, mBuilder.mParent, false);

        //添加
        attachParent(mAbsNavigationBar, mBuilder.mParent);
        //绑定参数
        attachNavigationParams();
    }


    @Override
    public void attachNavigationParams() {

        // 设置文本
        Map<Integer, String> textMaps = mBuilder.mTextMaps;
        for (Map.Entry<Integer, String> entry : textMaps.entrySet()) {
            TextView textView = findViewById(entry.getKey());
            textView.setText(entry.getValue());
        }

        // 设置点击事件
        Map<Integer, View.OnClickListener> onClickMaps = mBuilder.mOnClickListenerMaps;
        for (Map.Entry<Integer, View.OnClickListener> entry : onClickMaps.entrySet()) {
            View view = findViewById(entry.getKey());
            view.setOnClickListener(entry.getValue());
        }
    }

    public <T extends View> T findViewById(Integer viewId) {
        return (T) mAbsNavigationBar.findViewById(viewId);
    }

    @Override
    public void attachParent(View absNavigationBar, ViewGroup parent) {
        parent.addView(absNavigationBar, 0);
    }

    /**
     * Builder 构建类
     */
    public static abstract class Builder<T extends Builder> {

        public Context mContext;
        public int mLayoutId;
        public ViewGroup mParent;
        public Map<Integer, String> mTextMaps;
        public Map<Integer, View.OnClickListener> mOnClickListenerMaps;
        public int mLeftVisible;

        public Builder(Context context, int layoutId, ViewGroup parent) {
            this.mContext = context;
            this.mLayoutId = layoutId;
            this.mParent = parent;

            mTextMaps = new HashMap<>();
            mOnClickListenerMaps = new HashMap<>();

        }

        /**
         * 用来创建 AbsNavigationBar
         */
        public abstract AbsNavigationBar create();

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
         * 设置点击事件
         *
         * @param viewId
         * @param listener
         * @return
         */
        public T setOnClickListener(int viewId, View.OnClickListener listener) {
            mOnClickListenerMaps.put(viewId, listener);
            return (T) this;
        }
    }

}
