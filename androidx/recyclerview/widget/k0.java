package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import k2.C1160q;
import v0.C1529b;
import w0.C1576e;

public final class k0 extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final l0 f8443d;
    public final WeakHashMap e = new WeakHashMap();

    public k0(l0 l0Var) {
        this.f8443d = l0Var;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f15919a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final C1160q b(View view) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, C1576e eVar) {
        l0 l0Var = this.f8443d;
        boolean hasPendingAdapterUpdates = l0Var.f8446d.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        if (!hasPendingAdapterUpdates) {
            RecyclerView recyclerView = l0Var.f8446d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().h0(view, eVar);
                C1529b bVar = (C1529b) this.e.get(view);
                if (bVar != null) {
                    bVar.d(view, eVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1529b bVar = (C1529b) this.e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f15919a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        l0 l0Var = this.f8443d;
        if (!l0Var.f8446d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = l0Var.f8446d;
            if (recyclerView.getLayoutManager() != null) {
                C1529b bVar = (C1529b) this.e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                Z z = recyclerView.getLayoutManager().f8309V.mRecycler;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    public final void h(View view, int i) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C1529b bVar = (C1529b) this.e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
