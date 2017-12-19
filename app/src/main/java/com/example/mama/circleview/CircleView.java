package com.example.mama.circleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by dingkangkang on 2017/12/12.
 * 邮箱851615943@qq.com
 */

public class CircleView  extends View{

    private static final String TAG = "CircleView";
    private Paint mPaint;
    private RectF oval;
    public CircleView(Context context) {
        super(context);
        initView();
    }
    private void initView() {
        mPaint= new Paint();

        mPaint.setAntiAlias(true);
        oval = new RectF();
    }


    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.YELLOW);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        int with = getWidth();
        int height = getHeight();

        Log.d(TAG,with+"_"+height);

        float radius = with / 2;
//        cx：圆心的x坐标。
//        cy：圆心的y坐标。
//        radius：圆的半径。
//        paint：绘制时所使用的画笔。

        canvas.drawCircle(with / 2, with / 2, radius, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(with / 4, with*2 / 5, with / 16, mPaint);

        canvas.drawCircle(with*3 / 4, with*2 / 5, with / 16, mPaint);


        mPaint.setColor(Color.RED);
        //左边  上边  右边 下边     左上 对应的坐标 与 右下对应的坐标对角线对应的对应的矩形（椭圆在矩形中）   左右距离是椭圆的长  上下距离是椭圆的宽
        oval.set(with/4, with/2, with*3/4 , with*3/4);
        //绘制圆弧  圆弧所在的椭圆对象 圆弧的起始角度 圆弧的角度 是否显示半径连线
        canvas.drawArc(oval, 0, 180, false, mPaint);  //根据进度画圆弧

    }
}
