package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.C0940a;
import java.lang.ref.WeakReference;
import o.u1;

public final class ViewStubCompat extends View {

    /* renamed from: U  reason: collision with root package name */
    public int f7604U = 0;

    /* renamed from: V  reason: collision with root package name */
    public int f7605V;

    /* renamed from: W  reason: collision with root package name */
    public WeakReference f7606W;

    /* renamed from: a0  reason: collision with root package name */
    public LayoutInflater f7607a0;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11813B, 0, 0);
        this.f7605V = obtainStyledAttributes.getResourceId(2, -1);
        this.f7604U = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f7604U != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f7607a0;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f7604U, viewGroup, false);
            int i = this.f7605V;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f7606W = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f7605V;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f7607a0;
    }

    public int getLayoutResource() {
        return this.f7604U;
    }

    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f7605V = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f7607a0 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f7604U = i;
    }

    public void setOnInflateListener(u1 u1Var) {
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.f7606W;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
