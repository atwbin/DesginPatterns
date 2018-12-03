package com.atwbin.desgin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author：Created by Wbin on 2018/12/3
 *
 * Description：
 */
public class MyView3 extends View {

    private int defaultSize;
    private Paint mPaint;

    public MyView3(Context context) {
        super(context);
        init();
    }

    public MyView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MyView3);
        defaultSize = array.getDimensionPixelSize(R.styleable.MyView3_default_size, 100);

        array.recycle();

    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.GREEN);
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
                mySize = mySize;
                break;
        }
        return mySize;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int r = getMeasuredWidth() / 2;
        int centerX = getLeft() + r;
        int centerY = getTop() + r;

        canvas.drawCircle(centerX, centerY, r, mPaint);
    }
}
