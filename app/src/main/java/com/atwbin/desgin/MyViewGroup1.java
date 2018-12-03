package com.atwbin.desgin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author：Created by Wbin on 2018/12/3
 *
 * Description：
 * 将子View按从上到下垂直顺序一个挨着一个摆放，即模仿实现LinearLayout的垂直布局
 */
public class MyViewGroup1 extends ViewGroup {


    public MyViewGroup1(Context context) {
        super(context);
    }

    public MyViewGroup1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        //将所有的子view进行测量，这会触发每个子View的onMeasure函数
        measureChildren(widthMeasureSpec, heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int childCount = getChildCount();

        if (childCount == 0) {  //如果没有子View  那么当前的ViewGroup没有存在的意义，不占用任何的空间
            setMeasuredDimension(0, 0);
        } else {
            //如果宽高都是包裹内容
            if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
                //我们将所有的高度相加，宽度取子View中最大值
                int height = getTotalHeight();
                int width = getMaxWidth();
                setMeasuredDimension(width, height);
            } else if (heightMode == MeasureSpec.AT_MOST) {  //如果只有高度是包裹内容
                setMeasuredDimension(widthSize, getTotalHeight());
            } else if (widthMode == MeasureSpec.AT_MOST) {  //如果只有宽度是包裹内容
                setMeasuredDimension(getMaxWidth(), heightSize);
            }
        }

    }

    //摆放
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int count = getChildCount();
        //记录当前的位置
        int curHeight = 0;
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            int width = child.getMeasuredWidth();
            int height = child.getMeasuredHeight();
            child.layout(l, curHeight, l + width, curHeight + height);
            curHeight += height;
        }
    }


    /**
     * 获取最大的宽度
     *
     * @return
     */
    private int getMaxWidth() {
        int childCount = getChildCount();
        int maxWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childView = getChildAt(i);
            if (childView.getMeasuredWidth() > maxWidth) {
                maxWidth = childView.getMeasuredWidth();
            }
        }
        return maxWidth;
    }

    /**
     * 获取子view相加后的高度
     *
     * @return
     */
    private int getTotalHeight() {
        int childCount = getChildCount();
        int height = 0;

        for (int i = 0; i < childCount; i++) {
            View childView = getChildAt(i);
            height += childView.getMeasuredHeight();
        }
        return height;
    }

}
