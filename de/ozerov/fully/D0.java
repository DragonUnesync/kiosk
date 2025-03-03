package de.ozerov.fully;

import U.p;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0450a;
import androidx.fragment.app.L;
import androidx.fragment.app.r;
import h.C1022j;
import n2.a;

public abstract class D0 extends r {

    /* renamed from: e1  reason: collision with root package name */
    public final String f9849e1 = getClass().getSimpleName();

    /* renamed from: f1  reason: collision with root package name */
    public FullyActivity f9850f1;

    /* renamed from: g1  reason: collision with root package name */
    public C1022j f9851g1;

    /* renamed from: h1  reason: collision with root package name */
    public View f9852h1;

    /* renamed from: i1  reason: collision with root package name */
    public p f9853i1;

    /* renamed from: j1  reason: collision with root package name */
    public final Handler f9854j1 = new Handler();

    /* renamed from: k1  reason: collision with root package name */
    public final C0 f9855k1 = new C0(0, this);

    public void A() {
        View view = this.f9852h1;
        if (view != null) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f9855k1);
        }
        this.f9854j1.removeCallbacksAndMessages((Object) null);
        super.A();
        if (this.f9853i1 != null && this.f9850f1.w()) {
            this.f9853i1.run();
        }
    }

    public void H(View view, Bundle bundle) {
        this.f9852h1 = view;
        if (view != null) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f9855k1);
        }
    }

    public void S() {
        try {
            Dialog dialog = this.f8029a1;
            if (dialog != null && dialog.isShowing()) {
                O(true, false);
            }
            if (!this.f8025W0) {
                O(true, false);
            }
        } catch (Exception e) {
            Log.e(this.f9849e1, "Failed to dismiss dialog window due to " + e.getMessage());
        }
    }

    public final void T(L l8, String str) {
        if (l8.C(str) == null) {
            try {
                C0450a aVar = new C0450a(l8);
                aVar.f(0, this, str, 1);
                aVar.e(true, true);
            } catch (IllegalStateException unused) {
            }
        } else {
            Log.w(this.f9849e1, "Fragment already opened ".concat(str));
        }
    }

    public final void w(C1022j jVar) {
        super.w(jVar);
        C1022j h5 = h();
        this.f9851g1 = h5;
        if (h5 instanceof FullyActivity) {
            this.f9850f1 = (FullyActivity) h5;
        }
    }

    public View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f8025W0) {
            return null;
        }
        a.q(this.f9851g1.getWindow(), this.f8029a1.getWindow());
        this.f8029a1.getWindow().requestFeature(1);
        this.f8029a1.setOnKeyListener(new B0(this));
        return null;
    }
}
