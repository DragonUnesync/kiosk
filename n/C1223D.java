package n;

import C3.q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import o.C1297u0;
import o.G0;
import o.L0;

/* renamed from: n.D  reason: case insensitive filesystem */
public final class C1223D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: V  reason: collision with root package name */
    public final Context f13391V;

    /* renamed from: W  reason: collision with root package name */
    public final m f13392W;

    /* renamed from: X  reason: collision with root package name */
    public final j f13393X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f13394Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13395Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f13396a0;

    /* renamed from: b0  reason: collision with root package name */
    public final L0 f13397b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C1228d f13398c0 = new C1228d(1, this);

    /* renamed from: d0  reason: collision with root package name */
    public final q f13399d0 = new q(3, this);

    /* renamed from: e0  reason: collision with root package name */
    public v f13400e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f13401f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f13402g0;

    /* renamed from: h0  reason: collision with root package name */
    public x f13403h0;

    /* renamed from: i0  reason: collision with root package name */
    public ViewTreeObserver f13404i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f13405j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13406k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f13407l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f13408m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f13409n0;

    /* JADX WARNING: type inference failed for: r6v1, types: [o.L0, o.G0] */
    public C1223D(int i, Context context, View view, m mVar, boolean z) {
        this.f13391V = context;
        this.f13392W = mVar;
        this.f13394Y = z;
        this.f13393X = new j(mVar, LayoutInflater.from(context), z, 2131558419);
        this.f13396a0 = i;
        Resources resources = context.getResources();
        this.f13395Z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13401f0 = view;
        this.f13397b0 = new G0(context, (AttributeSet) null, i);
        mVar.b(this, context);
    }

    public final void a(m mVar, boolean z) {
        if (mVar == this.f13392W) {
            dismiss();
            x xVar = this.f13403h0;
            if (xVar != null) {
                xVar.a(mVar, z);
            }
        }
    }

    public final boolean b() {
        if (this.f13405j0 || !this.f13397b0.f13841t0.isShowing()) {
            return false;
        }
        return true;
    }

    public final void c() {
        View view;
        boolean z;
        Rect rect;
        if (!b()) {
            if (this.f13405j0 || (view = this.f13401f0) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f13402g0 = view;
            L0 l02 = this.f13397b0;
            l02.f13841t0.setOnDismissListener(this);
            l02.f13832j0 = this;
            l02.f13840s0 = true;
            l02.f13841t0.setFocusable(true);
            View view2 = this.f13402g0;
            if (this.f13404i0 == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f13404i0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13398c0);
            }
            view2.addOnAttachStateChangeListener(this.f13399d0);
            l02.f13831i0 = view2;
            l02.f13828f0 = this.f13408m0;
            boolean z6 = this.f13406k0;
            Context context = this.f13391V;
            j jVar = this.f13393X;
            if (!z6) {
                this.f13407l0 = u.m(jVar, context, this.f13395Z);
                this.f13406k0 = true;
            }
            l02.q(this.f13407l0);
            l02.f13841t0.setInputMethodMode(2);
            Rect rect2 = this.f13542U;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            l02.f13839r0 = rect;
            l02.c();
            C1297u0 u0Var = l02.f13819W;
            u0Var.setOnKeyListener(this);
            if (this.f13409n0) {
                m mVar = this.f13392W;
                if (mVar.f13490g0 != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131558418, u0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(mVar.f13490g0);
                    }
                    frameLayout.setEnabled(false);
                    u0Var.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            l02.o(jVar);
            l02.c();
        }
    }

    public final void d() {
        this.f13406k0 = false;
        j jVar = this.f13393X;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        if (b()) {
            this.f13397b0.dismiss();
        }
    }

    public final C1297u0 e() {
        return this.f13397b0.f13819W;
    }

    public final boolean h(C1224E e) {
        if (e.hasVisibleItems()) {
            View view = this.f13402g0;
            w wVar = new w(this.f13396a0, this.f13391V, view, e, this.f13394Y);
            x xVar = this.f13403h0;
            wVar.f13550h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.j(xVar);
            }
            boolean u3 = u.u(e);
            wVar.f13549g = u3;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.o(u3);
            }
            wVar.f13551j = this.f13400e0;
            this.f13400e0 = null;
            this.f13392W.c(false);
            L0 l02 = this.f13397b0;
            int i = l02.f13822Z;
            int m8 = l02.m();
            if ((Gravity.getAbsoluteGravity(this.f13408m0, this.f13401f0.getLayoutDirection()) & 7) == 5) {
                i += this.f13401f0.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(i, m8, true, true);
                }
            }
            x xVar2 = this.f13403h0;
            if (xVar2 != null) {
                xVar2.n(e);
            }
            return true;
        }
        return false;
    }

    public final boolean i() {
        return false;
    }

    public final void j(x xVar) {
        this.f13403h0 = xVar;
    }

    public final void l(m mVar) {
    }

    public final void n(View view) {
        this.f13401f0 = view;
    }

    public final void o(boolean z) {
        this.f13393X.f13473W = z;
    }

    public final void onDismiss() {
        this.f13405j0 = true;
        this.f13392W.c(true);
        ViewTreeObserver viewTreeObserver = this.f13404i0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13404i0 = this.f13402g0.getViewTreeObserver();
            }
            this.f13404i0.removeGlobalOnLayoutListener(this.f13398c0);
            this.f13404i0 = null;
        }
        this.f13402g0.removeOnAttachStateChangeListener(this.f13399d0);
        v vVar = this.f13400e0;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        this.f13408m0 = i;
    }

    public final void q(int i) {
        this.f13397b0.f13822Z = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f13400e0 = (v) onDismissListener;
    }

    public final void s(boolean z) {
        this.f13409n0 = z;
    }

    public final void t(int i) {
        this.f13397b0.h(i);
    }
}
