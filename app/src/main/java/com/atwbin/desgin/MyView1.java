package com.atwbin.desgin;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author：Created by Wbin on 2018/12/3
 *
 * Description：
 */
public class MyView1 extends View {


    public MyView1(Context context) {
        super(context);
    }

    public MyView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMySize(100, widthMeasureSpec);
        int height = getMySize(100, heightMeasureSpec);

        //正方形
        if (width < height) {
            height = width;
        } else {
            width = height;
        }
        setMeasuredDimension(width, height);
    }

    private int getMySize(int defaultSize, int measureSpec) {
        int mySize = defaultSize;

        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);

        switch (mode) {
            case MeasureSpec.UNSPECIFIED://没有指定，就取默认大小
                mySize = defaultSize;
                break;
            case MeasureSpec.AT_MOST:// 如果测量模式是最大 取值为size
                mySize = size;
                break;
            case MeasureSpec.EXACTLY: //测量模式有了固定的大小，就不要改变
                mySize = size;
                break;
        }
        return mySize;
    }

}
