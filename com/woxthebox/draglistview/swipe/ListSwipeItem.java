package com.woxthebox.draglistview.swipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.R;
import com.woxthebox.draglistview.swipe.ListSwipeHelper;

public class ListSwipeItem extends RelativeLayout {
    private float mFlingSpeed;
    private View mLeftView;
    private int mLeftViewId;
    private float mMaxLeftTranslationX = Float.MAX_VALUE;
    private float mMaxRightTranslationX = Float.MAX_VALUE;
    private View mRightView;
    private int mRightViewId;
    private float mStartSwipeTranslationX;
    private SwipeDirection mSwipeDirection = SwipeDirection.LEFT_AND_RIGHT;
    private SwipeInStyle mSwipeInStyle = SwipeInStyle.APPEAR;
    /* access modifiers changed from: private */
    public ListSwipeHelper.OnSwipeListener mSwipeListener;
    private boolean mSwipeStarted;
    /* access modifiers changed from: private */
    public SwipeState mSwipeState = SwipeState.IDLE;
    /* access modifiers changed from: private */
    public float mSwipeTranslationX;
    private View mSwipeView;
    private int mSwipeViewId;
    /* access modifiers changed from: private */
    public j0 mViewHolder;

    public enum SwipeDirection {
        LEFT,
        RIGHT,
        LEFT_AND_RIGHT,
        NONE
    }

    public enum SwipeInStyle {
        APPEAR,
        SLIDE
    }

    public enum SwipeState {
        IDLE,
        SWIPING,
        ANIMATING
    }

    public ListSwipeItem(Context context) {
        super(context);
    }

    private float getTranslateToXPosition(float f8, float f9, float f10) {
        int measuredWidth;
        int i = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i == 0 && Math.abs(f8 - f9) < ((float) (getMeasuredWidth() / 3))) {
            return f8;
        }
        if (f9 < 0.0f) {
            if (i > 0) {
                return 0.0f;
            }
            measuredWidth = -getMeasuredWidth();
        } else if (f8 == 0.0f) {
            if (f10 < 0.0f) {
                return 0.0f;
            }
            measuredWidth = getMeasuredWidth();
        } else if (i <= 0) {
            return 0.0f;
        } else {
            measuredWidth = getMeasuredWidth();
        }
        return (float) measuredWidth;
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ListSwipeItem);
        this.mSwipeViewId = obtainStyledAttributes.getResourceId(R.styleable.ListSwipeItem_swipeViewId, -1);
        this.mLeftViewId = obtainStyledAttributes.getResourceId(R.styleable.ListSwipeItem_leftViewId, -1);
        this.mRightViewId = obtainStyledAttributes.getResourceId(R.styleable.ListSwipeItem_rightViewId, -1);
        obtainStyledAttributes.recycle();
    }

    public void animateToSwipeTranslationX(float f8, Animator.AnimatorListener... animatorListenerArr) {
        float f9 = this.mSwipeTranslationX;
        if (f8 != f9) {
            this.mSwipeState = SwipeState.ANIMATING;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SwipeTranslationX", new float[]{f9, f8});
            ofFloat.setDuration(250);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            for (Animator.AnimatorListener animatorListener : animatorListenerArr) {
                if (animatorListener != null) {
                    ofFloat.addListener(animatorListener);
                }
            }
            ofFloat.start();
        }
    }

    public float getMaxLeftTranslationX() {
        return Math.min(this.mMaxLeftTranslationX, (float) getMeasuredWidth());
    }

    public float getMaxRightTranslationX() {
        return Math.min(this.mMaxRightTranslationX, (float) getMeasuredWidth());
    }

    public SwipeDirection getSupportedSwipeDirection() {
        return this.mSwipeDirection;
    }

    public SwipeDirection getSwipedDirection() {
        if (this.mSwipeState != SwipeState.IDLE) {
            return SwipeDirection.NONE;
        }
        if (this.mSwipeView.getTranslationX() == (-getMaxLeftTranslationX())) {
            return SwipeDirection.LEFT;
        }
        if (this.mSwipeView.getTranslationX() == getMaxRightTranslationX()) {
            return SwipeDirection.RIGHT;
        }
        return SwipeDirection.NONE;
    }

    public void handleSwipeMove(float f8, j0 j0Var) {
        if (!isAnimating()) {
            this.mSwipeState = SwipeState.SWIPING;
            if (!this.mSwipeStarted) {
                this.mSwipeStarted = true;
                this.mViewHolder = j0Var;
                j0Var.setIsRecyclable(false);
            }
            swipeTranslationByX(f8);
        }
    }

    public void handleSwipeMoveStarted(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        this.mStartSwipeTranslationX = this.mSwipeTranslationX;
        this.mSwipeListener = onSwipeListener;
    }

    public void handleSwipeUp(Animator.AnimatorListener animatorListener) {
        if (!isAnimating() && this.mSwipeStarted) {
            AnonymousClass2 r32 = new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    SwipeState unused = ListSwipeItem.this.mSwipeState = SwipeState.IDLE;
                    if (ListSwipeItem.this.mSwipeTranslationX == 0.0f) {
                        ListSwipeItem.this.resetSwipe(false);
                    }
                    if (ListSwipeItem.this.mViewHolder != null) {
                        ListSwipeItem.this.mViewHolder.setIsRecyclable(true);
                    }
                }
            };
            if (this.mFlingSpeed != 0.0f || Math.abs(this.mStartSwipeTranslationX - this.mSwipeTranslationX) >= ((float) (getMeasuredWidth() / 3))) {
                animateToSwipeTranslationX(getTranslateToXPosition(this.mStartSwipeTranslationX, this.mSwipeTranslationX, this.mFlingSpeed), r32, animatorListener);
            } else {
                animateToSwipeTranslationX(this.mStartSwipeTranslationX, r32, animatorListener);
            }
            this.mStartSwipeTranslationX = 0.0f;
            this.mFlingSpeed = 0.0f;
        }
    }

    public boolean isAnimating() {
        if (this.mSwipeState == SwipeState.ANIMATING) {
            return true;
        }
        return false;
    }

    public boolean isSwipeStarted() {
        return this.mSwipeStarted;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mSwipeView = findViewById(this.mSwipeViewId);
        this.mLeftView = findViewById(this.mLeftViewId);
        this.mRightView = findViewById(this.mRightViewId);
        View view = this.mLeftView;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.mRightView;
        if (view2 != null) {
            view2.setVisibility(4);
        }
    }

    public void resetSwipe(boolean z) {
        if (!isAnimating() && this.mSwipeStarted) {
            if (this.mSwipeTranslationX == 0.0f) {
                this.mSwipeListener = null;
            } else if (z) {
                animateToSwipeTranslationX(0.0f, new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        SwipeState unused = ListSwipeItem.this.mSwipeState = SwipeState.IDLE;
                        ListSwipeHelper.OnSwipeListener unused2 = ListSwipeItem.this.mSwipeListener = null;
                    }
                });
            } else {
                setSwipeTranslationX(0.0f);
                this.mSwipeState = SwipeState.IDLE;
                this.mSwipeListener = null;
            }
            j0 j0Var = this.mViewHolder;
            if (j0Var != null && !j0Var.isRecyclable()) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mViewHolder = null;
            this.mFlingSpeed = 0.0f;
            this.mStartSwipeTranslationX = 0.0f;
            this.mSwipeStarted = false;
        }
    }

    public void setFlingSpeed(float f8) {
        this.mFlingSpeed = f8;
    }

    public void setMaxLeftTranslationX(float f8) {
        this.mMaxLeftTranslationX = Math.abs(f8);
    }

    public void setMaxRightTranslationX(float f8) {
        this.mMaxRightTranslationX = Math.abs(f8);
    }

    public void setSupportedSwipeDirection(SwipeDirection swipeDirection) {
        this.mSwipeDirection = swipeDirection;
    }

    public void setSwipeInStyle(SwipeInStyle swipeInStyle) {
        this.mSwipeInStyle = swipeInStyle;
    }

    public void setSwipeListener(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        this.mSwipeListener = onSwipeListener;
    }

    public void setSwipeTranslationX(float f8) {
        SwipeDirection swipeDirection = this.mSwipeDirection;
        if ((swipeDirection == SwipeDirection.LEFT && f8 > 0.0f) || ((swipeDirection == SwipeDirection.RIGHT && f8 < 0.0f) || swipeDirection == SwipeDirection.NONE)) {
            f8 = 0.0f;
        }
        float min = Math.min(f8, getMaxRightTranslationX());
        this.mSwipeTranslationX = min;
        float max = Math.max(min, -getMaxLeftTranslationX());
        this.mSwipeTranslationX = max;
        if (max != this.mSwipeView.getTranslationX()) {
            this.mSwipeView.setTranslationX(this.mSwipeTranslationX);
            ListSwipeHelper.OnSwipeListener onSwipeListener = this.mSwipeListener;
            if (onSwipeListener != null) {
                onSwipeListener.onItemSwiping(this, this.mSwipeTranslationX);
            }
            float f9 = this.mSwipeTranslationX;
            if (f9 < 0.0f) {
                if (this.mSwipeInStyle == SwipeInStyle.SLIDE) {
                    this.mRightView.setTranslationX(((float) getMeasuredWidth()) + this.mSwipeTranslationX);
                }
                this.mRightView.setVisibility(0);
                this.mLeftView.setVisibility(4);
            } else if (f9 > 0.0f) {
                if (this.mSwipeInStyle == SwipeInStyle.SLIDE) {
                    this.mLeftView.setTranslationX(((float) (-getMeasuredWidth())) + this.mSwipeTranslationX);
                }
                this.mLeftView.setVisibility(0);
                this.mRightView.setVisibility(4);
            } else {
                this.mRightView.setVisibility(4);
                this.mLeftView.setVisibility(4);
            }
        }
    }

    public void setTag(Object obj) {
        super.setTag(obj);
        j0 j0Var = this.mViewHolder;
        if (j0Var != null && j0Var.isRecyclable()) {
            resetSwipe(false);
        }
    }

    public void swipeTranslationByX(float f8) {
        setSwipeTranslationX(this.mSwipeTranslationX + f8);
    }

    public ListSwipeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ListSwipeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
