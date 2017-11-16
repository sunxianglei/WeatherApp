package com.xianglei.weatherapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.xianglei.weatherapp.R;
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

    private int mTextSize;
    private int mTextColor;
    private int mTextFinishColor;
    private int mCircleRadius;
    private int mCircleColor;
    private int mLineColor;
    private int mLineFinishColor;

    private Paint mLinePaint;
    private Paint mCirclePaint;
    private Paint mTextPaint;
    private Rect mRect;

    public PeriodProgress(Context context) {
        this(context,null);
    }

    public PeriodProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    private void init(AttributeSet attrs){
        mLinePaint = new Paint();
        mLinePaint.setAntiAlias(true);
        mCirclePaint = new Paint();
        mCirclePaint.setAntiAlias(true);
        mTextPaint = new Paint();
        mTextPaint.setAntiAlias(true);
        mRect = new Rect();

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.PeriodProgress);
        mTextSize = ta.getDimensionPixelSize(R.styleable.PeriodProgress_progress_text_size,
                DisplayUtil.sp2px(getContext(),13));
        mTextColor = ta.getColor(R.styleable.PeriodProgress_progress_text_color, Color.GRAY);
        mTextFinishColor = ta.getColor(R.styleable.PeriodProgress_progress_text_finish_color, Color.DKGRAY);
        mCircleRadius = ta.getDimensionPixelSize(R.styleable.PeriodProgress_progress_circle_radius,
                DisplayUtil.dip2px(getContext(),8));
        mCircleColor = ta.getColor(R.styleable.PeriodProgress_progress_circle_color, Color.LTGRAY);
        mLineColor = ta.getColor(R.styleable.PeriodProgress_progress_line_color, Color.LTGRAY);
        mLineFinishColor = ta.getColor(R.styleable.PeriodProgress_progress_line_finish_color, Color.GRAY);
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
        mTextPaint.setTextSize(mTextSize);
        mCirclePaint.setColor(mCircleColor);
        mLinePaint.setStrokeWidth(DisplayUtil.dip2px(getContext(), 3));
        int length = name.length;
        for(int i=0;i<length;i++){
            if(isFinish[i]){
                mTextPaint.setColor(mTextFinishColor);
                mCirclePaint.setStyle(Paint.Style.FILL);
                mLinePaint.setColor(mLineFinishColor);
            }else{
                mTextPaint.setColor(mTextColor);
                mCirclePaint.setStyle(Paint.Style.STROKE);
                mLinePaint.setColor(mLineColor);
            }
            mTextPaint.getTextBounds(name[i], 0, name[i].length(), mRect);
            canvas.drawText(name[i], mWidth * i / (length - 1) - (mRect.right-mRect.left)/2,
                    mTextPaint.getFontSpacing(), mTextPaint);
            mTextPaint.getTextBounds(time[i], 0, time[i].length(), mRect);
            canvas.drawText(time[i], mWidth * i / (length - 1) - (mRect.right-mRect.left)/2,
                    mTextPaint.getFontSpacing() * 2, mTextPaint);
            mCirclePaint.setColor(Color.BLACK);
            canvas.drawCircle(mWidth * i / (length - 1),
                    mTextPaint.getFontSpacing() * 3, mCircleRadius, mCirclePaint);

            if(i != length - 1){
                canvas.drawLine(mWidth * i / (length - 1) + 2 * mCircleRadius, mTextPaint.getFontSpacing() * 3,
                        mWidth * (i + 1) / (length - 1) - 2 * mCircleRadius, mTextPaint.getFontSpacing() * 3, mLinePaint);
            }
        }
    }


//    public static class DataModel{
//        public String name;
//        public String time;
//        public boolean isfinish;
//    }

}
