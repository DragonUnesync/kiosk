package h;

import C0.e;
import D2.G;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.o;
import o.C1277k;
import o.j1;
import o.o1;
import v0.C1510H;

/* renamed from: h.H  reason: case insensitive filesystem */
public final class C1007H extends b {

    /* renamed from: a  reason: collision with root package name */
    public final o1 f12113a;

    /* renamed from: b  reason: collision with root package name */
    public final w f12114b;

    /* renamed from: c  reason: collision with root package name */
    public final C1006G f12115c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12116d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12117f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f12118g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final e f12119h = new e(19, this);

    public C1007H(Toolbar toolbar, CharSequence charSequence, w wVar) {
        C1006G g8 = new C1006G(this);
        o1 o1Var = new o1(toolbar, false);
        this.f12113a = o1Var;
        wVar.getClass();
        this.f12114b = wVar;
        o1Var.f14031k = wVar;
        toolbar.setOnMenuItemClickListener(g8);
        if (!o1Var.f14028g) {
            o1Var.f14029h = charSequence;
            if ((o1Var.f14024b & 8) != 0) {
                Toolbar toolbar2 = o1Var.f14023a;
                toolbar2.setTitle(charSequence);
                if (o1Var.f14028g) {
                    C1510H.q(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f12115c = new C1006G(this);
    }

    public final boolean A() {
        return this.f12113a.f14023a.v();
    }

    public final void E(Drawable drawable) {
        this.f12113a.f14023a.setBackground(drawable);
    }

    public final void F(boolean z) {
    }

    public final void G(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        o1 o1Var = this.f12113a;
        o1Var.a((i & 4) | (o1Var.f14024b & -5));
    }

    public final void H(Drawable drawable) {
        o1 o1Var = this.f12113a;
        o1Var.f14027f = drawable;
        int i = o1Var.f14024b & 4;
        Toolbar toolbar = o1Var.f14023a;
        if (i != 0) {
            if (drawable == null) {
                drawable = o1Var.f14035o;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    public final void I(boolean z) {
    }

    public final void J(CharSequence charSequence) {
        o1 o1Var = this.f12113a;
        o1Var.f14028g = true;
        o1Var.f14029h = charSequence;
        if ((o1Var.f14024b & 8) != 0) {
            Toolbar toolbar = o1Var.f14023a;
            toolbar.setTitle(charSequence);
            if (o1Var.f14028g) {
                C1510H.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void K(CharSequence charSequence) {
        o1 o1Var = this.f12113a;
        if (!o1Var.f14028g) {
            o1Var.f14029h = charSequence;
            if ((o1Var.f14024b & 8) != 0) {
                Toolbar toolbar = o1Var.f14023a;
                toolbar.setTitle(charSequence);
                if (o1Var.f14028g) {
                    C1510H.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void L() {
        this.f12113a.f14023a.setVisibility(0);
    }

    public final Menu V() {
        boolean z = this.e;
        o1 o1Var = this.f12113a;
        if (!z) {
            G g8 = new G((Object) this);
            C1006G g9 = new C1006G(this);
            Toolbar toolbar = o1Var.f14023a;
            toolbar.f7569K0 = g8;
            toolbar.f7570L0 = g9;
            ActionMenuView actionMenuView = toolbar.f7576U;
            if (actionMenuView != null) {
                actionMenuView.f7449r0 = g8;
                actionMenuView.f7450s0 = g9;
            }
            this.e = true;
        }
        return o1Var.f14023a.getMenu();
    }

    public final boolean f() {
        C1277k kVar;
        ActionMenuView actionMenuView = this.f12113a.f14023a.f7576U;
        if (actionMenuView == null || (kVar = actionMenuView.f7448q0) == null || !kVar.c()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        o oVar;
        j1 j1Var = this.f12113a.f14023a.f7568J0;
        if (j1Var == null || (oVar = j1Var.f13976V) == null) {
            return false;
        }
        if (j1Var == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    public final void k(boolean z) {
        if (z != this.f12117f) {
            this.f12117f = z;
            ArrayList arrayList = this.f12118g;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final int m() {
        return this.f12113a.f14024b;
    }

    public final Context p() {
        return this.f12113a.f14023a.getContext();
    }

    public final void q() {
        this.f12113a.f14023a.setVisibility(8);
    }

    public final boolean t() {
        o1 o1Var = this.f12113a;
        Toolbar toolbar = o1Var.f14023a;
        e eVar = this.f12119h;
        toolbar.removeCallbacks(eVar);
        Toolbar toolbar2 = o1Var.f14023a;
        WeakHashMap weakHashMap = C1510H.f15874a;
        toolbar2.postOnAnimation(eVar);
        return true;
    }

    public final void v() {
    }

    public final void x() {
        this.f12113a.f14023a.removeCallbacks(this.f12119h);
    }

    public final boolean y(int i, KeyEvent keyEvent) {
        int i8;
        Menu V8 = V();
        if (V8 == null) {
            return false;
        }
        if (keyEvent != null) {
            i8 = keyEvent.getDeviceId();
        } else {
            i8 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i8).getKeyboardType() == 1) {
            z = false;
        }
        V8.setQwertyMode(z);
        return V8.performShortcut(i, keyEvent, 0);
    }

    public final boolean z(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            A();
        }
        return true;
    }
}
