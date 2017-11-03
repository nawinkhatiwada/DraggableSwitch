package com.nawin.androidragger.switchlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;

/**
 * Created on 11/3/17.
 */

public class DraggableSwitch extends CompoundButton {
    private Drawable baseDrawable;

    public DraggableSwitch(Context context) {
        this(context, null);
    }

    public DraggableSwitch(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DraggableSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.DraggableSwitch, defStyleAttr, 0);
        baseDrawable = a.getDrawable(R.styleable.DraggableSwitch_backgroundBase);
        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        baseDrawable.draw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        baseDrawable.setBounds(0, 0, View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }
}
