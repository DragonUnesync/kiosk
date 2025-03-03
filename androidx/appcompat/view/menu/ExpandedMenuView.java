package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import d4.k;
import n.C1220A;
import n.l;
import n.m;
import n.o;
import n.y;

public final class ExpandedMenuView extends ListView implements l, C1220A, AdapterView.OnItemClickListener {

    /* renamed from: V  reason: collision with root package name */
    public static final int[] f7368V = {16842964, 16843049};

    /* renamed from: U  reason: collision with root package name */
    public m f7369U;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k K22 = k.K2(context, attributeSet, f7368V, 16842868);
        TypedArray typedArray = (TypedArray) K22.f9767W;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(K22.I(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(K22.I(1));
        }
        K22.M2();
    }

    public final void c(m mVar) {
        this.f7369U = mVar;
    }

    public final boolean d(o oVar) {
        return this.f7369U.q(oVar, (y) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        d((o) getAdapter().getItem(i));
    }
}
