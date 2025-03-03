package m;

import B3.q;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import de.ozerov.fully.K2;
import java.lang.ref.WeakReference;
import n.k;
import n.m;
import o.C1277k;

/* renamed from: m.d  reason: case insensitive filesystem */
public final class C1185d extends C1182a implements k {

    /* renamed from: W  reason: collision with root package name */
    public Context f13262W;

    /* renamed from: X  reason: collision with root package name */
    public ActionBarContextView f13263X;

    /* renamed from: Y  reason: collision with root package name */
    public K2 f13264Y;

    /* renamed from: Z  reason: collision with root package name */
    public WeakReference f13265Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f13266a0;

    /* renamed from: b0  reason: collision with root package name */
    public m f13267b0;

    public final void a() {
        if (!this.f13266a0) {
            this.f13266a0 = true;
            this.f13264Y.J(this);
        }
    }

    public final View b() {
        WeakReference weakReference = this.f13265Z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final m c() {
        return this.f13267b0;
    }

    public final MenuInflater d() {
        return new C1189h(this.f13263X.getContext());
    }

    public final CharSequence e() {
        return this.f13263X.getSubtitle();
    }

    public final CharSequence f() {
        return this.f13263X.getTitle();
    }

    public final void g() {
        this.f13264Y.N(this, this.f13267b0);
    }

    public final boolean h() {
        return this.f13263X.p0;
    }

    public final void i(View view) {
        WeakReference weakReference;
        this.f13263X.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f13265Z = weakReference;
    }

    public final void j(int i) {
        k(this.f13262W.getString(i));
    }

    public final void k(CharSequence charSequence) {
        this.f13263X.setSubtitle(charSequence);
    }

    public final void l(int i) {
        m(this.f13262W.getString(i));
    }

    public final void m(CharSequence charSequence) {
        this.f13263X.setTitle(charSequence);
    }

    public final void n(boolean z) {
        this.f13256V = z;
        this.f13263X.setTitleOptional(z);
    }

    public final boolean q(m mVar, MenuItem menuItem) {
        return ((q) this.f13264Y.f10050V).W(this, menuItem);
    }

    public final void s(m mVar) {
        g();
        C1277k kVar = this.f13263X.f7399a0;
        if (kVar != null) {
            kVar.l();
        }
    }
}
