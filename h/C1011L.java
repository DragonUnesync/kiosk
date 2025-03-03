package h;

import B3.q;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import de.ozerov.fully.K2;
import java.lang.ref.WeakReference;
import m.C1182a;
import m.C1189h;
import n.k;
import n.m;
import o.C1277k;

/* renamed from: h.L  reason: case insensitive filesystem */
public final class C1011L extends C1182a implements k {

    /* renamed from: W  reason: collision with root package name */
    public final Context f12128W;

    /* renamed from: X  reason: collision with root package name */
    public final m f12129X;

    /* renamed from: Y  reason: collision with root package name */
    public K2 f12130Y;

    /* renamed from: Z  reason: collision with root package name */
    public WeakReference f12131Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ C1012M f12132a0;

    public C1011L(C1012M m8, Context context, K2 k22) {
        this.f12132a0 = m8;
        this.f12128W = context;
        this.f12130Y = k22;
        m mVar = new m(context);
        mVar.f13489f0 = 1;
        this.f12129X = mVar;
        mVar.f13482Y = this;
    }

    public final void a() {
        C1012M m8 = this.f12132a0;
        if (m8.i == this) {
            boolean z = m8.f12147p;
            boolean z6 = m8.f12148q;
            if (z || z6) {
                m8.f12141j = this;
                m8.f12142k = this.f12130Y;
            } else {
                this.f12130Y.J(this);
            }
            this.f12130Y = null;
            m8.V(false);
            ActionBarContextView actionBarContextView = m8.f12138f;
            if (actionBarContextView.f7406h0 == null) {
                actionBarContextView.e();
            }
            m8.f12136c.setHideOnContentScrollEnabled(m8.f12153v);
            m8.i = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.f12131Z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final m c() {
        return this.f12129X;
    }

    public final MenuInflater d() {
        return new C1189h(this.f12128W);
    }

    public final CharSequence e() {
        return this.f12132a0.f12138f.getSubtitle();
    }

    public final CharSequence f() {
        return this.f12132a0.f12138f.getTitle();
    }

    public final void g() {
        if (this.f12132a0.i == this) {
            m mVar = this.f12129X;
            mVar.w();
            try {
                this.f12130Y.N(this, mVar);
            } finally {
                mVar.v();
            }
        }
    }

    public final boolean h() {
        return this.f12132a0.f12138f.p0;
    }

    public final void i(View view) {
        this.f12132a0.f12138f.setCustomView(view);
        this.f12131Z = new WeakReference(view);
    }

    public final void j(int i) {
        k(this.f12132a0.f12134a.getResources().getString(i));
    }

    public final void k(CharSequence charSequence) {
        this.f12132a0.f12138f.setSubtitle(charSequence);
    }

    public final void l(int i) {
        m(this.f12132a0.f12134a.getResources().getString(i));
    }

    public final void m(CharSequence charSequence) {
        this.f12132a0.f12138f.setTitle(charSequence);
    }

    public final void n(boolean z) {
        this.f13256V = z;
        this.f12132a0.f12138f.setTitleOptional(z);
    }

    public final boolean q(m mVar, MenuItem menuItem) {
        K2 k22 = this.f12130Y;
        if (k22 != null) {
            return ((q) k22.f10050V).W(this, menuItem);
        }
        return false;
    }

    public final void s(m mVar) {
        if (this.f12130Y != null) {
            g();
            C1277k kVar = this.f12132a0.f12138f.f7399a0;
            if (kVar != null) {
                kVar.l();
            }
        }
    }
}
