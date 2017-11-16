package com.xianglei.weatherapp.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.xianglei.weatherapp.utils.DisplayUtil;

/**
 * 阶段性进度条
 * Created by sunxianglei on 2017/11/16.
 */

public class PeriodProgress extends View {

    private String[] name;
    private String[] time;
    private Boolean[] isFinish;

    private int mWidth;
    private int mHeight;
    private int mCircleRadius;      //圆的半径

    private Paint mLinePaint;
    private Paint mCirclePaint;
    private Paint mTextPaint;
    private Rect mRect;

    public PeriodProgress(Context context) {
        this(context,null);
    }

    public PeriodProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        mLinePaint = new Paint();
        mLinePaint.setAntiAlias(true);
        mCirclePaint = new Paint();
        mCirclePaint.setAntiAlias(true);
        mTextPaint = new Paint();
        mTextPaint.setAntiAlias(true);
        mRect = new Rect();
    }

    public void setData(String[] name, String[] time, Boolean[] isFinish){
        this.name = name;
        this.time = time;
        this.isFinish = isFinish;
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
        int length = name.length;
        for(int i=0;i<length;i++){
            mTextPaint.getTextBounds(name[i], 0, name[i].length(), mRect);
            canvas.drawText(name[i], mWidth * i / (length - 1) - (mRect.right-mRect.left)/2,
                    mTextPaint.getFontSpacing(), mTextPaint);
            mTextPaint.getTextBounds(time[i], 0, time[i].length(), mRect);
            canvas.drawText(time[i], mWidth * i / (length - 1) - (mRect.right-mRect.left)/2,
                    mTextPaint.getFontSpacing() * 2, mTextPaint);
            mCirclePaint.setColor(Color.BLACK);
            canvas.drawCircle(mWidth * i / (length - 1),
                    mTextPaint.getFontSpacing() * 3 + mCircleRadius, mCircleRadius, mCirclePaint);

            if(i != length - 1){
                mLinePaint.setStrokeWidth(DisplayUtil.dip2px(getContext(), 5));
                canvas.drawLine(mWidth * i / (length - 1) + 2 * mCircleRadius, mTextPaint.getFontSpacing() * 3 + mCircleRadius,
                        mWidth * (i + 1) / (length - 1), mTextPaint.getFontSpacing() * 3 + mCircleRadius, mLinePaint);
            }
        }
    }


//    public static class DataModel{
//        public String name;
//        public String time;
//        public boolean isfinish;
//    }

}
