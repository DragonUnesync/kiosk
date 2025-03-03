package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import v0.C1510H;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f9265U;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.c((Calendar) null);
        if (m.U(getContext(), 16843277)) {
            setNextFocusLeftId(2131361927);
            setNextFocusRightId(2131361950);
        }
        this.f9265U = m.U(getContext(), 2130969432);
        C1510H.p(this, new g(2));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (p) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        pVar.getClass();
        int max = Math.max(pVar.a(), getFirstVisiblePosition());
        int min = Math.min(pVar.c(), getLastVisiblePosition());
        pVar.getItem(max);
        pVar.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((p) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((p) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((p) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((p) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i, int i8) {
        if (this.f9265U) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i8);
    }

    public final void setSelection(int i) {
        if (i < ((p) super.getAdapter()).a()) {
            super.setSelection(((p) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m18getAdapter() {
        return (p) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof p) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()}));
    }
}
