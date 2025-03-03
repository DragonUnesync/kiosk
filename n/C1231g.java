package n;

import C3.q;
import Q0.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import k2.C1160q;
import o.C1297u0;
import o.I0;
import o.L0;

/* renamed from: n.g  reason: case insensitive filesystem */
public final class C1231g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: V  reason: collision with root package name */
    public final Context f13439V;

    /* renamed from: W  reason: collision with root package name */
    public final int f13440W;

    /* renamed from: X  reason: collision with root package name */
    public final int f13441X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f13442Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Handler f13443Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f13444a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList f13445b0 = new ArrayList();

    /* renamed from: c0  reason: collision with root package name */
    public final C1228d f13446c0 = new C1228d(0, this);

    /* renamed from: d0  reason: collision with root package name */
    public final q f13447d0 = new q(2, this);

    /* renamed from: e0  reason: collision with root package name */
    public final C1160q f13448e0 = new C1160q(6, (Object) this);

    /* renamed from: f0  reason: collision with root package name */
    public int f13449f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f13450g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f13451h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f13452i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f13453j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13454k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f13455l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f13456m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f13457n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f13458o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public x f13459q0;

    /* renamed from: r0  reason: collision with root package name */
    public ViewTreeObserver f13460r0;

    /* renamed from: s0  reason: collision with root package name */
    public v f13461s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f13462t0;

    public C1231g(Context context, View view, int i, boolean z) {
        int i8 = 0;
        this.f13449f0 = 0;
        this.f13450g0 = 0;
        this.f13439V = context;
        this.f13451h0 = view;
        this.f13441X = i;
        this.f13442Y = z;
        this.f13458o0 = false;
        this.f13453j0 = view.getLayoutDirection() != 1 ? 1 : i8;
        Resources resources = context.getResources();
        this.f13440W = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f13443Z = new Handler();
    }

    public final void a(m mVar, boolean z) {
        int i;
        ArrayList arrayList = this.f13445b0;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (mVar == ((C1230f) arrayList.get(i8)).f13437b) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int i9 = i8 + 1;
            if (i9 < arrayList.size()) {
                ((C1230f) arrayList.get(i9)).f13437b.c(false);
            }
            C1230f fVar = (C1230f) arrayList.remove(i8);
            fVar.f13437b.r(this);
            boolean z6 = this.f13462t0;
            L0 l02 = fVar.f13436a;
            if (z6) {
                if (Build.VERSION.SDK_INT >= 23) {
                    I0.b(l02.f13841t0, (Transition) null);
                }
                l02.f13841t0.setAnimationStyle(0);
            }
            l02.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f13453j0 = ((C1230f) arrayList.get(size2 - 1)).f13438c;
            } else {
                if (this.f13451h0.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.f13453j0 = i;
            }
            if (size2 == 0) {
                dismiss();
                x xVar = this.f13459q0;
                if (xVar != null) {
                    xVar.a(mVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f13460r0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f13460r0.removeGlobalOnLayoutListener(this.f13446c0);
                    }
                    this.f13460r0 = null;
                }
                this.f13452i0.removeOnAttachStateChangeListener(this.f13447d0);
                this.f13461s0.onDismiss();
            } else if (z) {
                ((C1230f) arrayList.get(0)).f13437b.c(false);
            }
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.f13445b0;
        if (arrayList.size() <= 0 || !((C1230f) arrayList.get(0)).f13436a.f13841t0.isShowing()) {
            return false;
        }
        return true;
    }

    public final void c() {
        boolean z;
        if (!b()) {
            ArrayList arrayList = this.f13444a0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((m) it.next());
            }
            arrayList.clear();
            View view = this.f13451h0;
            this.f13452i0 = view;
            if (view != null) {
                if (this.f13460r0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f13460r0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f13446c0);
                }
                this.f13452i0.addOnAttachStateChangeListener(this.f13447d0);
            }
        }
    }

    public final void d() {
        Iterator it = this.f13445b0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1230f) it.next()).f13436a.f13819W.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        ArrayList arrayList = this.f13445b0;
        int size = arrayList.size();
        if (size > 0) {
            C1230f[] fVarArr = (C1230f[]) arrayList.toArray(new C1230f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1230f fVar = fVarArr[i];
                if (fVar.f13436a.f13841t0.isShowing()) {
                    fVar.f13436a.dismiss();
                }
            }
        }
    }

    public final C1297u0 e() {
        ArrayList arrayList = this.f13445b0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1230f) g.l(1, arrayList)).f13436a.f13819W;
    }

    public final boolean h(C1224E e) {
        Iterator it = this.f13445b0.iterator();
        while (it.hasNext()) {
            C1230f fVar = (C1230f) it.next();
            if (e == fVar.f13437b) {
                fVar.f13436a.f13819W.requestFocus();
                return true;
            }
        }
        if (!e.hasVisibleItems()) {
            return false;
        }
        l(e);
        x xVar = this.f13459q0;
        if (xVar != null) {
            xVar.n(e);
        }
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(x xVar) {
        this.f13459q0 = xVar;
    }

    public final void l(m mVar) {
        mVar.b(this, this.f13439V);
        if (b()) {
            v(mVar);
        } else {
            this.f13444a0.add(mVar);
        }
    }

    public final void n(View view) {
        if (this.f13451h0 != view) {
            this.f13451h0 = view;
            this.f13450g0 = Gravity.getAbsoluteGravity(this.f13449f0, view.getLayoutDirection());
        }
    }

    public final void o(boolean z) {
        this.f13458o0 = z;
    }

    public final void onDismiss() {
        C1230f fVar;
        ArrayList arrayList = this.f13445b0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (C1230f) arrayList.get(i);
            if (!fVar.f13436a.f13841t0.isShowing()) {
                break;
            }
            i++;
        }
        if (fVar != null) {
            fVar.f13437b.c(false);
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
        if (this.f13449f0 != i) {
            this.f13449f0 = i;
            this.f13450g0 = Gravity.getAbsoluteGravity(i, this.f13451h0.getLayoutDirection());
        }
    }

    public final void q(int i) {
        this.f13454k0 = true;
        this.f13456m0 = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f13461s0 = (v) onDismissListener;
    }

    public final void s(boolean z) {
        this.p0 = z;
    }

    public final void t(int i) {
        this.f13455l0 = true;
        this.f13457n0 = i;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [o.L0, o.G0] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        if (((r3.getWidth() + r12[0]) + r6) > r10.right) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0138, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        if ((r12[0] - r6) < 0) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(n.m r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r3 = r0.f13439V
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r3)
            n.j r5 = new n.j
            boolean r6 = r0.f13442Y
            r7 = 2131558411(0x7f0d000b, float:1.8742137E38)
            r5.<init>(r1, r4, r6, r7)
            boolean r6 = r18.b()
            r7 = 1
            if (r6 != 0) goto L_0x0022
            boolean r6 = r0.f13458o0
            if (r6 == 0) goto L_0x0022
            r5.f13473W = r7
            goto L_0x002e
        L_0x0022:
            boolean r6 = r18.b()
            if (r6 == 0) goto L_0x002e
            boolean r6 = n.u.u(r19)
            r5.f13473W = r6
        L_0x002e:
            int r6 = r0.f13440W
            int r6 = n.u.m(r5, r3, r6)
            o.L0 r8 = new o.L0
            int r9 = r0.f13441X
            r10 = 0
            r8.<init>(r3, r10, r9)
            o.z r3 = r8.f13841t0
            k2.q r9 = r0.f13448e0
            r8.f13860x0 = r9
            r8.f13832j0 = r0
            r3.setOnDismissListener(r0)
            android.view.View r9 = r0.f13451h0
            r8.f13831i0 = r9
            int r9 = r0.f13450g0
            r8.f13828f0 = r9
            r8.f13840s0 = r7
            r3.setFocusable(r7)
            r9 = 2
            r3.setInputMethodMode(r9)
            r8.o(r5)
            r8.q(r6)
            int r5 = r0.f13450g0
            r8.f13828f0 = r5
            java.util.ArrayList r5 = r0.f13445b0
            int r11 = r5.size()
            if (r11 <= 0) goto L_0x00db
            java.lang.Object r11 = Q0.g.l(r7, r5)
            n.f r11 = (n.C1230f) r11
            n.m r12 = r11.f13437b
            java.util.ArrayList r13 = r12.f13483Z
            int r13 = r13.size()
            r14 = 0
        L_0x0079:
            if (r14 >= r13) goto L_0x008f
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x008c
            android.view.SubMenu r9 = r15.getSubMenu()
            if (r1 != r9) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            int r14 = r14 + r7
            r9 = 2
            goto L_0x0079
        L_0x008f:
            r15 = r10
        L_0x0090:
            if (r15 != 0) goto L_0x0094
            r2 = r10
            goto L_0x00dd
        L_0x0094:
            o.L0 r9 = r11.f13436a
            o.u0 r9 = r9.f13819W
            android.widget.ListAdapter r12 = r9.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00ad
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            n.j r12 = (n.j) r12
            goto L_0x00b0
        L_0x00ad:
            n.j r12 = (n.j) r12
            r13 = 0
        L_0x00b0:
            int r14 = r12.getCount()
            r10 = 0
        L_0x00b5:
            if (r10 >= r14) goto L_0x00c1
            n.o r2 = r12.getItem(r10)
            if (r15 != r2) goto L_0x00bf
            r2 = -1
            goto L_0x00c3
        L_0x00bf:
            int r10 = r10 + r7
            goto L_0x00b5
        L_0x00c1:
            r2 = -1
            r10 = -1
        L_0x00c3:
            if (r10 != r2) goto L_0x00c7
        L_0x00c5:
            r2 = 0
            goto L_0x00dd
        L_0x00c7:
            int r10 = r10 + r13
            int r2 = r9.getFirstVisiblePosition()
            int r10 = r10 - r2
            if (r10 < 0) goto L_0x00c5
            int r2 = r9.getChildCount()
            if (r10 < r2) goto L_0x00d6
            goto L_0x00c5
        L_0x00d6:
            android.view.View r2 = r9.getChildAt(r10)
            goto L_0x00dd
        L_0x00db:
            r2 = 0
            r11 = 0
        L_0x00dd:
            if (r2 == 0) goto L_0x01aa
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x00fc
            java.lang.reflect.Method r9 = o.L0.f13859y0
            if (r9 == 0) goto L_0x0100
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00f4 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00f4 }
            r13 = 0
            r10[r13] = r12     // Catch:{ Exception -> 0x00f4 }
            r9.invoke(r3, r10)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0100
        L_0x00f4:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x0100
        L_0x00fc:
            r9 = 0
            o.J0.a(r3, r9)
        L_0x0100:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x010a
            r10 = 0
            o.I0.a(r3, r10)
        L_0x010a:
            java.lang.Object r3 = Q0.g.l(r7, r5)
            n.f r3 = (n.C1230f) r3
            o.L0 r3 = r3.f13436a
            o.u0 r3 = r3.f13819W
            r10 = 2
            int[] r12 = new int[r10]
            r3.getLocationOnScreen(r12)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r13 = r0.f13452i0
            r13.getWindowVisibleDisplayFrame(r10)
            int r13 = r0.f13453j0
            if (r13 != r7) goto L_0x013a
            r17 = 0
            r12 = r12[r17]
            int r3 = r3.getWidth()
            int r3 = r3 + r12
            int r3 = r3 + r6
            int r10 = r10.right
            if (r3 <= r10) goto L_0x0138
        L_0x0136:
            r3 = 0
            goto L_0x0142
        L_0x0138:
            r3 = 1
            goto L_0x0142
        L_0x013a:
            r17 = 0
            r3 = r12[r17]
            int r3 = r3 - r6
            if (r3 >= 0) goto L_0x0136
            goto L_0x0138
        L_0x0142:
            if (r3 != r7) goto L_0x0146
            r13 = 1
            goto L_0x0147
        L_0x0146:
            r13 = 0
        L_0x0147:
            r0.f13453j0 = r3
            r3 = 26
            r10 = 5
            if (r9 < r3) goto L_0x0153
            r8.f13831i0 = r2
            r3 = 0
            r12 = 0
            goto L_0x0188
        L_0x0153:
            r3 = 2
            int[] r9 = new int[r3]
            android.view.View r12 = r0.f13451h0
            r12.getLocationOnScreen(r9)
            int[] r3 = new int[r3]
            r2.getLocationOnScreen(r3)
            int r12 = r0.f13450g0
            r12 = r12 & 7
            if (r12 != r10) goto L_0x017c
            r12 = 0
            r14 = r9[r12]
            android.view.View r15 = r0.f13451h0
            int r15 = r15.getWidth()
            int r15 = r15 + r14
            r9[r12] = r15
            r14 = r3[r12]
            int r15 = r2.getWidth()
            int r15 = r15 + r14
            r3[r12] = r15
            goto L_0x017d
        L_0x017c:
            r12 = 0
        L_0x017d:
            r14 = r3[r12]
            r15 = r9[r12]
            int r12 = r14 - r15
            r3 = r3[r7]
            r9 = r9[r7]
            int r3 = r3 - r9
        L_0x0188:
            int r9 = r0.f13450g0
            r9 = r9 & r10
            if (r9 != r10) goto L_0x0197
            if (r13 == 0) goto L_0x0191
            int r12 = r12 + r6
            goto L_0x01a0
        L_0x0191:
            int r2 = r2.getWidth()
            int r12 = r12 - r2
            goto L_0x01a0
        L_0x0197:
            if (r13 == 0) goto L_0x019f
            int r2 = r2.getWidth()
            int r12 = r12 + r2
            goto L_0x01a0
        L_0x019f:
            int r12 = r12 - r6
        L_0x01a0:
            r8.f13822Z = r12
            r8.f13827e0 = r7
            r8.f13826d0 = r7
            r8.h(r3)
            goto L_0x01c8
        L_0x01aa:
            boolean r2 = r0.f13454k0
            if (r2 == 0) goto L_0x01b2
            int r2 = r0.f13456m0
            r8.f13822Z = r2
        L_0x01b2:
            boolean r2 = r0.f13455l0
            if (r2 == 0) goto L_0x01bb
            int r2 = r0.f13457n0
            r8.h(r2)
        L_0x01bb:
            android.graphics.Rect r2 = r0.f13542U
            if (r2 == 0) goto L_0x01c5
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r2)
            goto L_0x01c6
        L_0x01c5:
            r10 = 0
        L_0x01c6:
            r8.f13839r0 = r10
        L_0x01c8:
            n.f r2 = new n.f
            int r3 = r0.f13453j0
            r2.<init>(r8, r1, r3)
            r5.add(r2)
            r8.c()
            o.u0 r2 = r8.f13819W
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L_0x0206
            boolean r3 = r0.p0
            if (r3 == 0) goto L_0x0206
            java.lang.CharSequence r3 = r1.f13490g0
            if (r3 == 0) goto L_0x0206
            r3 = 2131558418(0x7f0d0012, float:1.8742151E38)
            r5 = 0
            android.view.View r3 = r4.inflate(r3, r2, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r5)
            java.lang.CharSequence r1 = r1.f13490g0
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r5)
            r8.c()
        L_0x0206:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1231g.v(n.m):void");
    }
}
