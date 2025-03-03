package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import k2.C1160q;
import n.C1220A;
import n.C1224E;
import n.m;
import n.o;
import n.p;
import n.u;
import n.x;
import n.y;
import n.z;

/* renamed from: o.k  reason: case insensitive filesystem */
public final class C1277k implements y {

    /* renamed from: U  reason: collision with root package name */
    public final Context f13978U;

    /* renamed from: V  reason: collision with root package name */
    public Context f13979V;

    /* renamed from: W  reason: collision with root package name */
    public m f13980W;

    /* renamed from: X  reason: collision with root package name */
    public final LayoutInflater f13981X;

    /* renamed from: Y  reason: collision with root package name */
    public x f13982Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13983Z = 2131558403;

    /* renamed from: a0  reason: collision with root package name */
    public final int f13984a0 = 2131558402;

    /* renamed from: b0  reason: collision with root package name */
    public C1220A f13985b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1275j f13986c0;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f13987d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13988e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f13989f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f13990g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f13991h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f13992i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f13993j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13994k0;

    /* renamed from: l0  reason: collision with root package name */
    public final SparseBooleanArray f13995l0 = new SparseBooleanArray();

    /* renamed from: m0  reason: collision with root package name */
    public C1269g f13996m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1269g f13997n0;

    /* renamed from: o0  reason: collision with root package name */
    public C1273i f13998o0;
    public C1271h p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C1160q f13999q0 = new C1160q(10, (Object) this);

    public C1277k(Context context) {
        this.f13978U = context;
        this.f13981X = LayoutInflater.from(context);
    }

    public final void a(m mVar, boolean z) {
        c();
        C1269g gVar = this.f13997n0;
        if (gVar != null && gVar.b()) {
            gVar.i.dismiss();
        }
        x xVar = this.f13982Y;
        if (xVar != null) {
            xVar.a(mVar, z);
        }
    }

    public final View b(o oVar, View view, ViewGroup viewGroup) {
        z zVar;
        View actionView = oVar.getActionView();
        int i = 0;
        if (actionView == null || oVar.e()) {
            if (view instanceof z) {
                zVar = (z) view;
            } else {
                zVar = (z) this.f13981X.inflate(this.f13984a0, viewGroup, false);
            }
            zVar.a(oVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f13985b0);
            if (this.p0 == null) {
                this.p0 = new C1271h(this);
            }
            actionMenuItemView.setPopupCallback(this.p0);
            actionView = (View) zVar;
        }
        if (oVar.f13531w0) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1281m)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        C1220A a8;
        C1273i iVar = this.f13998o0;
        if (iVar == null || (a8 = this.f13985b0) == null) {
            C1269g gVar = this.f13996m0;
            if (gVar == null) {
                return false;
            }
            if (gVar.b()) {
                gVar.i.dismiss();
            }
            return true;
        }
        ((View) a8).removeCallbacks(iVar);
        this.f13998o0 = null;
        return true;
    }

    public final void d() {
        C1220A a8;
        int i;
        o oVar;
        ViewGroup viewGroup = (ViewGroup) this.f13985b0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            m mVar = this.f13980W;
            if (mVar != null) {
                mVar.i();
                ArrayList l8 = this.f13980W.l();
                int size = l8.size();
                i = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    o oVar2 = (o) l8.get(i8);
                    if (oVar2.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof z) {
                            oVar = ((z) childAt).getItemData();
                        } else {
                            oVar = null;
                        }
                        View b8 = b(oVar2, childAt, viewGroup);
                        if (oVar2 != oVar) {
                            b8.setPressed(false);
                            b8.jumpDrawablesToCurrentState();
                        }
                        if (b8 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b8.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b8);
                            }
                            ((ViewGroup) this.f13985b0).addView(b8, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f13986c0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f13985b0).requestLayout();
        m mVar2 = this.f13980W;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f13486c0;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                p pVar = ((o) arrayList2.get(i9)).f13529u0;
            }
        }
        m mVar3 = this.f13980W;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f13487d0;
        }
        if (this.f13989f0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((o) arrayList.get(0)).f13531w0;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f13986c0 == null) {
                this.f13986c0 = new C1275j(this, this.f13978U);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f13986c0.getParent();
            if (viewGroup3 != this.f13985b0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f13986c0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13985b0;
                C1275j jVar = this.f13986c0;
                actionMenuView.getClass();
                C1281m l9 = ActionMenuView.l();
                l9.f14002a = true;
                actionMenuView.addView(jVar, l9);
            }
        } else {
            C1275j jVar2 = this.f13986c0;
            if (jVar2 != null && jVar2.getParent() == (a8 = this.f13985b0)) {
                ((ViewGroup) a8).removeView(this.f13986c0);
            }
        }
        ((ActionMenuView) this.f13985b0).setOverflowReserved(this.f13989f0);
    }

    public final boolean e() {
        C1269g gVar = this.f13996m0;
        if (gVar == null || !gVar.b()) {
            return false;
        }
        return true;
    }

    public final boolean f(o oVar) {
        return false;
    }

    public final void g(Context context, m mVar) {
        this.f13979V = context;
        LayoutInflater.from(context);
        this.f13980W = mVar;
        Resources resources = context.getResources();
        if (!this.f13990g0) {
            this.f13989f0 = true;
        }
        int i = 2;
        this.f13991h0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i = 4;
        } else if (i8 >= 360) {
            i = 3;
        }
        this.f13993j0 = i;
        int i10 = this.f13991h0;
        if (this.f13989f0) {
            if (this.f13986c0 == null) {
                C1275j jVar = new C1275j(this, this.f13978U);
                this.f13986c0 = jVar;
                if (this.f13988e0) {
                    jVar.setImageDrawable(this.f13987d0);
                    this.f13987d0 = null;
                    this.f13988e0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13986c0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f13986c0.getMeasuredWidth();
        } else {
            this.f13986c0 = null;
        }
        this.f13992i0 = i10;
        float f8 = resources.getDisplayMetrics().density;
    }

    public final boolean h(C1224E e) {
        boolean z;
        if (!e.hasVisibleItems()) {
            return false;
        }
        C1224E e8 = e;
        while (true) {
            m mVar = e8.f13410t0;
            if (mVar == this.f13980W) {
                break;
            }
            e8 = mVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f13985b0;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof z) && ((z) childAt).getItemData() == e8.f13411u0) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        e.f13411u0.getClass();
        int size = e.f13483Z.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z = false;
                break;
            }
            MenuItem item = e.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i8++;
        }
        C1269g gVar = new C1269g(this, this.f13979V, e, view);
        this.f13997n0 = gVar;
        gVar.f13549g = z;
        u uVar = gVar.i;
        if (uVar != null) {
            uVar.o(z);
        }
        C1269g gVar2 = this.f13997n0;
        if (!gVar2.b()) {
            if (gVar2.e != null) {
                gVar2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        x xVar = this.f13982Y;
        if (xVar != null) {
            xVar.n(e);
        }
        return true;
    }

    public final boolean i() {
        int i;
        ArrayList arrayList;
        int i8;
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        m mVar = this.f13980W;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i9 = this.f13993j0;
        int i10 = this.f13992i0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f13985b0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z = true;
            if (i11 >= i) {
                break;
            }
            o oVar = (o) arrayList.get(i11);
            int i14 = oVar.f13527s0;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z10 = true;
            }
            if (this.f13994k0 && oVar.f13531w0) {
                i9 = 0;
            }
            i11++;
        }
        if (this.f13989f0 && (z10 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = this.f13995l0;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i) {
            o oVar2 = (o) arrayList.get(i16);
            int i18 = oVar2.f13527s0;
            if ((i18 & 2) == i8) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i19 = oVar2.f13505V;
            if (z6) {
                View b8 = b(oVar2, (View) null, viewGroup);
                b8.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b8.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z);
                }
                oVar2.g(z);
            } else if ((i18 & true) == z) {
                boolean z11 = sparseBooleanArray.get(i19);
                if ((i15 > 0 || z11) && i10 > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    View b9 = b(oVar2, (View) null, viewGroup);
                    b9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b9.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    if (i10 + i17 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z8 &= z9;
                }
                if (z8 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z11) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        o oVar3 = (o) arrayList.get(i20);
                        if (oVar3.f13505V == i19) {
                            if (oVar3.f()) {
                                i15++;
                            }
                            oVar3.g(false);
                        }
                    }
                }
                if (z8) {
                    i15--;
                }
                oVar2.g(z8);
            } else {
                oVar2.g(false);
                i16++;
                i8 = 2;
                z = true;
            }
            i16++;
            i8 = 2;
            z = true;
        }
        return true;
    }

    public final void j(x xVar) {
        throw null;
    }

    public final boolean k(o oVar) {
        return false;
    }

    public final boolean l() {
        m mVar;
        if (!this.f13989f0 || e() || (mVar = this.f13980W) == null || this.f13985b0 == null || this.f13998o0 != null) {
            return false;
        }
        mVar.i();
        if (mVar.f13487d0.isEmpty()) {
            return false;
        }
        C1273i iVar = new C1273i(this, new C1269g(this, this.f13979V, this.f13980W, (View) this.f13986c0));
        this.f13998o0 = iVar;
        ((View) this.f13985b0).post(iVar);
        return true;
    }
}
