package com.google.android.material.internal;

import B0.b;
import B3.g;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import o.C1300w;
import t3.C1427a;
import v0.C1510H;

public class CheckableImageButton extends C1300w implements Checkable {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f9353d0 = {16842912};

    /* renamed from: a0  reason: collision with root package name */
    public boolean f9354a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f9355b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f9356c0 = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969145);
        C1510H.p(this, new g(3, this));
    }

    public final boolean isChecked() {
        return this.f9354a0;
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.f9354a0) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f9353d0);
        }
        return super.onCreateDrawableState(i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1427a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1427a aVar = (C1427a) parcelable;
        super.onRestoreInstanceState(aVar.f367U);
        setChecked(aVar.f15380W);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, t3.a, B0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        bVar.f15380W = this.f9354a0;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f9355b0 != z) {
            this.f9355b0 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f9355b0 && this.f9354a0 != z) {
            this.f9354a0 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f9356c0 = z;
    }

    public void setPressed(boolean z) {
        if (this.f9356c0) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f9354a0);
    }
}
