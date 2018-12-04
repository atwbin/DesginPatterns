package com.atwbin.desgin.pie;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Created by Wbin on 2018/12/4
 *
 * Description：
 */
public class PieView extends View {

    /** 颜色表(注意: 此处定义颜色使用的是ARGB，带Alpha通道的) */
    private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080,
            0xFFE6B800, 0xFF7CFC00};

    /** 画笔 */
    private Paint mPaint = new Paint();

    /** 宽高 */
    private int mWidth, mHeight;

    /** 数据 */
    private List<PieData> mData = new ArrayList<>();

    /** 圆饼起始角度 */
    private float mStartAngle = 0;

    public PieView(Context context) {
        super(context);
    }

    public PieView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

    }

    public PieView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mData == null) {
            return;
        }

        float currentAngle = mStartAngle;
        //将画布移植中心位置
        canvas.translate(mWidth / 2, mHeight / 2);
        //圆饼图半径
        float r = (float) (Math.min(mWidth, mHeight) / 2 * 0.8);
        //绘制区域
        RectF rectF = new RectF(-r, -r, r, r);
        for (int i = 0; i < mData.size(); i++) {
            PieData pieData = mData.get(i);
            mPaint.setColor(pieData.getColor());
            canvas.drawArc(rectF, currentAngle, pieData.getAngle(), true, mPaint);
            currentAngle += pieData.getAngle();
        }
    }


    /**
     * 设置起始角度
     */
    public void setStartAngle(int startAngle) {
        this.mStartAngle = startAngle;
        invalidate(); //重绘
    }

    public void setData(ArrayList<PieData> data) {
        this.mData = data;
        initData(data);
        invalidate();
    }

    private void initData(ArrayList<PieData> data) {
        if (mData == null || mData.size() == 0) {
            return;
        }

        float sumValue = 0;
        for (int i = 0; i < mData.size(); i++) {
            PieData pieData = mData.get(i);
            sumValue += pieData.getValue();
            //设置颜色
            int j = i % mColors.length;
            pieData.setColor(mColors[j]);
        }

        float sumAngle = 0;
        for (int i = 0; i < mData.size(); i++) {
            PieData pie = mData.get(i);

            float percentage = pie.getValue() / sumValue;   // 百分比
            float angle = percentage * 360;                 // 对应的角度

            pie.setPercentage(percentage);                  // 记录百分比
            pie.setAngle(angle);                            // 记录角度大小
            sumAngle += angle;

            Log.i("angle", "" + pie.getAngle());
        }


    }


}
