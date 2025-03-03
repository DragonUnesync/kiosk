package com.woxthebox.draglistview;

import O7.b;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

public class DragItem {
    protected static final int ANIMATION_DURATION = 250;
    private float mAnimationDx;
    private float mAnimationDy;
    private boolean mCanDragHorizontally = true;
    private boolean mCanDragVertically = true;
    private View mDragView;
    private float mOffsetX;
    private float mOffsetY;
    private float mPosTouchDx;
    private float mPosTouchDy;
    private float mPosX;
    private float mPosY;
    private View mRealDragView;
    private float mRealStartX;
    private float mRealStartY;
    private boolean mSnapToTouch = true;

    public DragItem(Context context) {
        this.mDragView = new View(context);
        hide();
    }

    private void show() {
        this.mDragView.setVisibility(0);
    }

    private void updatePosition() {
        if (this.mCanDragHorizontally) {
            View view = this.mDragView;
            view.setX(((this.mPosX + this.mOffsetX) + this.mAnimationDx) - (((float) view.getMeasuredWidth()) / 2.0f));
        }
        if (this.mCanDragVertically) {
            View view2 = this.mDragView;
            view2.setY(((this.mPosY + this.mOffsetY) + this.mAnimationDy) - (((float) view2.getMeasuredHeight()) / 2.0f));
        }
        this.mDragView.invalidate();
    }

    public boolean canDragHorizontally() {
        return this.mCanDragHorizontally;
    }

    public boolean canDragVertically() {
        return this.mCanDragVertically;
    }

    public void endDrag(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        onEndDragAnimation(this.mDragView);
        float measuredWidth = (((float) this.mDragView.getMeasuredWidth()) / 2.0f) + (view.getX() - (((float) (this.mDragView.getMeasuredWidth() - view.getMeasuredWidth())) / 2.0f));
        float measuredHeight = (((float) this.mDragView.getMeasuredHeight()) / 2.0f) + (view.getY() - (((float) (this.mDragView.getMeasuredHeight() - view.getMeasuredHeight())) / 2.0f));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("X", new float[]{this.mPosX, measuredWidth}), PropertyValuesHolder.ofFloat("Y", new float[]{this.mPosY, measuredHeight})});
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(250);
        ofPropertyValuesHolder.addListener(animatorListenerAdapter);
        ofPropertyValuesHolder.start();
    }

    public View getDragItemView() {
        return this.mDragView;
    }

    public View getRealDragView() {
        return this.mRealDragView;
    }

    public float getX() {
        return this.mPosX;
    }

    public float getY() {
        return this.mPosY;
    }

    public void hide() {
        this.mDragView.setVisibility(8);
        this.mRealDragView = null;
    }

    public boolean isDragging() {
        if (this.mDragView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean isSnapToTouch() {
        return this.mSnapToTouch;
    }

    public void onBindDragView(View view, View view2) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        view2.setBackground(new BitmapDrawable(view.getResources(), createBitmap));
    }

    public void onEndDragAnimation(View view) {
    }

    public void onMeasureDragView(View view, View view2) {
        view2.setLayoutParams(new FrameLayout.LayoutParams(view.getMeasuredWidth(), view.getMeasuredHeight()));
        view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), b.MAX_POW2), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), b.MAX_POW2));
    }

    public void onStartDragAnimation(View view) {
    }

    public void setAnimationDY(float f8) {
        this.mAnimationDy = f8;
        updatePosition();
    }

    public void setAnimationDx(float f8) {
        this.mAnimationDx = f8;
        updatePosition();
    }

    public void setCanDragHorizontally(boolean z) {
        this.mCanDragHorizontally = z;
    }

    public void setCanDragVertically(boolean z) {
        this.mCanDragVertically = z;
    }

    public void setOffset(float f8, float f9) {
        this.mOffsetX = f8;
        this.mOffsetY = f9;
        updatePosition();
    }

    public void setPosition(float f8, float f9) {
        if (this.mCanDragHorizontally) {
            this.mPosX = f8 + this.mPosTouchDx;
        } else {
            float f10 = this.mRealStartX;
            this.mPosX = f10;
            View view = this.mDragView;
            view.setX(f10 - (((float) view.getMeasuredWidth()) / 2.0f));
        }
        if (this.mCanDragVertically) {
            this.mPosY = f9 + this.mPosTouchDy;
        } else {
            float f11 = this.mRealStartY;
            this.mPosY = f11;
            View view2 = this.mDragView;
            view2.setY(f11 - (((float) view2.getMeasuredHeight()) / 2.0f));
        }
        updatePosition();
    }

    public void setSnapToTouch(boolean z) {
        this.mSnapToTouch = z;
    }

    public void setX(float f8) {
        this.mPosX = f8;
        updatePosition();
    }

    public void setY(float f8) {
        this.mPosY = f8;
        updatePosition();
    }

    public void startDrag(View view, float f8, float f9) {
        show();
        this.mRealDragView = view;
        onBindDragView(view, this.mDragView);
        onMeasureDragView(view, this.mDragView);
        onStartDragAnimation(this.mDragView);
        this.mRealStartX = (((float) this.mDragView.getMeasuredWidth()) / 2.0f) + (view.getX() - (((float) (this.mDragView.getMeasuredWidth() - view.getMeasuredWidth())) / 2.0f));
        float measuredHeight = (((float) this.mDragView.getMeasuredHeight()) / 2.0f) + (view.getY() - (((float) (this.mDragView.getMeasuredHeight() - view.getMeasuredHeight())) / 2.0f));
        this.mRealStartY = measuredHeight;
        if (this.mSnapToTouch) {
            this.mPosTouchDx = 0.0f;
            this.mPosTouchDy = 0.0f;
            setPosition(f8, f9);
            setAnimationDx(this.mRealStartX - f8);
            setAnimationDY(this.mRealStartY - f9);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("AnimationDx", new float[]{this.mAnimationDx, 0.0f}), PropertyValuesHolder.ofFloat("AnimationDY", new float[]{this.mAnimationDy, 0.0f})});
            ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(250);
            ofPropertyValuesHolder.start();
            return;
        }
        this.mPosTouchDx = this.mRealStartX - f8;
        this.mPosTouchDy = measuredHeight - f9;
        setPosition(f8, f9);
    }

    public DragItem(Context context, int i) {
        this.mDragView = View.inflate(context, i, (ViewGroup) null);
        hide();
    }
}
