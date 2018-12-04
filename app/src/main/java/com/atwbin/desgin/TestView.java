package com.atwbin.desgin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author：Created by Wbin on 2018/12/4
 *
 * Description：
 */
public class TestView extends View {


    private Paint mPaint = new Paint();
    private Paint mPaint2 = new Paint();
    private Paint mPaint3 = new Paint();

    public TestView(Context context) {
        super(context);
        init();
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);

        mPaint2.setColor(Color.GREEN);
        mPaint2.setStyle(Paint.Style.FILL);

        mPaint3.setColor(Color.RED);
        mPaint3.setStyle(Paint.Style.FILL);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPoint(200, 200, mPaint);

        canvas.drawPoints(new float[]{500, 500,
                500, 600,
                500, 700}, mPaint);

        canvas.drawLine(300, 100, 500, 600, mPaint);

        RectF rectF = new RectF(100, 150, 500, 300);
        canvas.drawRect(rectF, mPaint2);

        //绘制圆形矩形
        RectF rectF1 = new RectF(100, 500, 500, 500);
        canvas.drawRoundRect(rectF1, 30, 30, mPaint3);

        RectF rectF2 = new RectF(100, 600, 500, 800);
        canvas.drawOval(rectF2,mPaint3);


    }
}
