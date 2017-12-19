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

public class CircleView3 extends View{

    private static final String TAG = "CircleView";
    private Paint mPaint;
    private RectF oval;
    public CircleView3(Context context) {
        super(context);
        initView();
    }
    private void initView() {
        mPaint= new Paint();

        mPaint.setAntiAlias(true);
        oval = new RectF();
    }


    public CircleView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CircleView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public CircleView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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








        canvas.drawCircle(with / 2, with / 2, radius, mPaint);

        mPaint.setColor(Color.BLACK);
        oval.set(with / 4, with*5 / 16, with*5 / 16, with*7 / 16);
        canvas.drawArc(oval,0,360,true, mPaint);

        oval.set(with*11 / 16, with*5 / 16, with*3 / 4, with*7 / 16);
        canvas.drawArc(oval,0,360,true, mPaint);


//        paint.setColor(Color.BLACK);                    //设置画笔颜色
//        canvas.drawColor(Color.WHITE);                  //设置背景颜色
//        paint.setStrokeWidth((float) 1.0);              //设置线宽
//        canvas.drawLine(50, 50, 450, 50, paint);        //绘制直线
//        paint.setStrokeWidth((float) 5.0);              //设置线宽
//        canvas.drawLine(50, 150, 450, 150, paint);      //绘制直线
//        paint.setStrokeWidth((float) 10.0);             //设置线宽
//        canvas.drawLine(50, 250, 450, 250, paint);      //绘制直线
//        paint.setStrokeWidth((float) 15.0);             //设置线宽
//        canvas.drawLine(50, 350, 450, 350, paint);      //绘制直线
//        paint.setStrokeWidth((float) 20.0);             //设置线宽
//        canvas.drawLine(50, 450, 450, 450, paint);      //绘制直线




        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth((float) 3.0);
        canvas.drawLine(with*2/5, with*3/4, with*3/5, with*3/4, mPaint);
//        mPaint.setColor(Color.RED);
//        //左边  上边  右边 下边     左上 对应的坐标 与 右下对应的坐标对角线对应的对应的矩形（椭圆在矩形中）   左右距离是椭圆的长  上下距离是椭圆的宽
//        oval.set(with/4, with/2, with*3/4 , with*3/4);
//        //绘制圆弧  圆弧所在的椭圆对象 圆弧的起始角度 圆弧的角度 是否显示半径连线
//        canvas.drawArc(oval, 0, 180, false, mPaint);  //根据进度画圆弧


        //        paint：绘制时所使用的画笔。

//        startX：起始端点的X坐标。
//
//        startY：起始端点的Y坐标。
//
//        stopX：终止端点的X坐标。
//
//        stopY：终止端点的Y坐标。
//

//        paint：绘制直线所使用的画笔。
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth((float) 1.0);
        canvas.drawLine(0, 0, with, 0, mPaint);
        canvas.drawLine(0, with/16, with, with/16, mPaint);
        canvas.drawLine(0, with*2/16, with, with*2/16, mPaint);
        canvas.drawLine(0, with*3/16, with, with*3/16, mPaint);
        canvas.drawLine(0, with*4/16, with, with*4/16, mPaint);
        canvas.drawLine(0, with*5/16, with, with*5/16, mPaint);
        canvas.drawLine(0, with*6/16, with, with*6/16, mPaint);
        canvas.drawLine(0, with*7/16, with, with*7/16, mPaint);
        canvas.drawLine(0, with*8/16, with, with*8/16, mPaint);
        canvas.drawLine(0, with*9/16, with, with*9/16, mPaint);
        canvas.drawLine(0, with*10/16, with, with*10/16, mPaint);
        canvas.drawLine(0, with*11/16, with, with*11/16, mPaint);
        canvas.drawLine(0, with*12/16, with, with*12/16, mPaint);
        canvas.drawLine(0, with*13/16, with, with*13/16, mPaint);
        canvas.drawLine(0, with*14/16, with, with*14/16, mPaint);
        canvas.drawLine(0, with*15/16, with, with*15/16, mPaint);
        canvas.drawLine(0, with, with, with, mPaint);


        canvas.drawLine(0, 0,0 , with, mPaint);
        canvas.drawLine(with/16, 0,with/16 , with, mPaint);
        canvas.drawLine(with*2/16, 0,with*2/16 , with, mPaint);
        canvas.drawLine(with*3/16, 0,with*3/16 , with, mPaint);
        canvas.drawLine(with*4/16, 0,with*4/16 , with, mPaint);
        canvas.drawLine(with*5/16, 0,with*5/16 , with, mPaint);
        canvas.drawLine(with*6/16, 0,with*6/16 , with, mPaint);
        canvas.drawLine(with*7/16, 0,with*7/16 , with, mPaint);
        canvas.drawLine(with*8/16, 0,with*8/16 , with, mPaint);
        canvas.drawLine(with*9/16, 0,with*9/16 , with, mPaint);
        canvas.drawLine(with*10/16, 0,with*10/16 , with, mPaint);
        canvas.drawLine(with*11/16, 0,with*11/16 , with, mPaint);
        canvas.drawLine(with*12/16, 0,with*12/16 , with, mPaint);
        canvas.drawLine(with*13/16, 0,with*13/16 , with, mPaint);
        canvas.drawLine(with*14/16, 0,with*14/16 , with, mPaint);
        canvas.drawLine(with*15/16, 0,with*15/16 , with, mPaint);
        canvas.drawLine(with, 0,with , with, mPaint);

    }
}
