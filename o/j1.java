package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import m.C1183b;
import n.C1224E;
import n.m;
import n.o;
import n.y;

public final class j1 implements y {

    /* renamed from: U  reason: collision with root package name */
    public m f13975U;

    /* renamed from: V  reason: collision with root package name */
    public o f13976V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Toolbar f13977W;

    public j1(Toolbar toolbar) {
        this.f13977W = toolbar;
    }

    public final void a(m mVar, boolean z) {
    }

    public final void d() {
        if (this.f13976V != null) {
            m mVar = this.f13975U;
            if (mVar != null) {
                int size = mVar.f13483Z.size();
                int i = 0;
                while (i < size) {
                    if (this.f13975U.getItem(i) != this.f13976V) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            k(this.f13976V);
        }
    }

    public final boolean f(o oVar) {
        Toolbar toolbar = this.f13977W;
        toolbar.c();
        ViewParent parent = toolbar.f7583e0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f7583e0);
            }
            toolbar.addView(toolbar.f7583e0);
        }
        View actionView = oVar.getActionView();
        toolbar.f7584f0 = actionView;
        this.f13976V = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f7584f0);
            }
            k1 h5 = Toolbar.h();
            h5.f14000a = (toolbar.f7589k0 & 112) | 8388611;
            h5.f14001b = 2;
            toolbar.f7584f0.setLayoutParams(h5);
            toolbar.addView(toolbar.f7584f0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((k1) childAt.getLayoutParams()).f14001b == 2 || childAt == toolbar.f7576U)) {
                toolbar.removeViewAt(childCount);
                toolbar.f7560B0.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f13531w0 = true;
        oVar.f13517h0.p(false);
        View view = toolbar.f7584f0;
        if (view instanceof C1183b) {
            ((C1183b) view).b();
        }
        toolbar.w();
        return true;
    }

    public final void g(Context context, m mVar) {
        o oVar;
        m mVar2 = this.f13975U;
        if (!(mVar2 == null || (oVar = this.f13976V) == null)) {
            mVar2.d(oVar);
        }
        this.f13975U = mVar;
    }

    public final boolean h(C1224E e) {
        return false;
    }

    public final boolean i() {
        return false;
    }

    public final boolean k(o oVar) {
        Toolbar toolbar = this.f13977W;
        View view = toolbar.f7584f0;
        if (view instanceof C1183b) {
            ((C1183b) view).e();
        }
        toolbar.removeView(toolbar.f7584f0);
        toolbar.removeView(toolbar.f7583e0);
        toolbar.f7584f0 = null;
        ArrayList arrayList = toolbar.f7560B0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13976V = null;
        toolbar.requestLayout();
        oVar.f13531w0 = false;
        oVar.f13517h0.p(false);
        toolbar.w();
        return true;
    }
}
