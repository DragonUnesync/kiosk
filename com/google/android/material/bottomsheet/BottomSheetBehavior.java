package com.google.android.material.bottomsheet;

import A3.d;
import A3.g;
import B.C0003d;
import C0.f;
import C3.D;
import D2.G;
import D2.j;
import G.l;
import N.e;
import O7.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.woxthebox.draglistview.R;
import de.ozerov.fully.K2;
import f3.C0899a;
import h0.C1026a;
import h0.C1029d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k3.C1161a;
import v0.C1510H;
import v0.C1518P;
import v0.C1519Q;
import v0.C1520S;
import v0.C1528a;
import v0.C1529b;
import v0.C1551x;
import v0.C1553z;
import w0.C1575d;
import z3.k;

public class BottomSheetBehavior<V extends View> extends C1026a {

    /* renamed from: A  reason: collision with root package name */
    public final g f9163A = new g(this);

    /* renamed from: B  reason: collision with root package name */
    public final ValueAnimator f9164B;

    /* renamed from: C  reason: collision with root package name */
    public final int f9165C;

    /* renamed from: D  reason: collision with root package name */
    public int f9166D;

    /* renamed from: E  reason: collision with root package name */
    public int f9167E;

    /* renamed from: F  reason: collision with root package name */
    public final float f9168F = 0.5f;

    /* renamed from: G  reason: collision with root package name */
    public int f9169G;

    /* renamed from: H  reason: collision with root package name */
    public final float f9170H = -1.0f;

    /* renamed from: I  reason: collision with root package name */
    public boolean f9171I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f9172J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f9173K = true;

    /* renamed from: L  reason: collision with root package name */
    public int f9174L = 4;

    /* renamed from: M  reason: collision with root package name */
    public f f9175M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f9176N;

    /* renamed from: O  reason: collision with root package name */
    public int f9177O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f9178P;

    /* renamed from: Q  reason: collision with root package name */
    public final float f9179Q = 0.1f;

    /* renamed from: R  reason: collision with root package name */
    public int f9180R;

    /* renamed from: S  reason: collision with root package name */
    public int f9181S;

    /* renamed from: T  reason: collision with root package name */
    public int f9182T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f9183U;

    /* renamed from: V  reason: collision with root package name */
    public WeakReference f9184V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f9185W = new ArrayList();

    /* renamed from: X  reason: collision with root package name */
    public VelocityTracker f9186X;

    /* renamed from: Y  reason: collision with root package name */
    public int f9187Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9188Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f9189a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f9190a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9191b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f9192b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f9193c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f9194c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public final int f9195d;

    /* renamed from: d0  reason: collision with root package name */
    public final d f9196d0 = new d(this, 1);
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9197f;

    /* renamed from: g  reason: collision with root package name */
    public int f9198g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9199h;
    public final z3.g i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f9200j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9201k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final int f9202l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f9203m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9204n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f9205o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f9206p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f9207q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f9208r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9209s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9210t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9211u;

    /* renamed from: v  reason: collision with root package name */
    public int f9212v;

    /* renamed from: w  reason: collision with root package name */
    public int f9213w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f9214x;

    /* renamed from: y  reason: collision with root package name */
    public final k f9215y;
    public boolean z;

    public BottomSheetBehavior() {
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (C1553z.i(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View v4 = v(viewGroup.getChildAt(i8));
                if (v4 != null) {
                    return v4;
                }
            }
        }
        return null;
    }

    public static int w(int i8, int i9, int i10, int i11) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i9, i11);
        if (i10 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), b.MAX_POW2);
        }
        if (size != 0) {
            i10 = Math.min(size, i10);
        }
        return View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION);
    }

    public final void A(int i8) {
        if (i8 == -1) {
            if (!this.f9197f) {
                this.f9197f = true;
            } else {
                return;
            }
        } else if (this.f9197f || this.e != i8) {
            this.f9197f = false;
            this.e = Math.max(0, i8);
        } else {
            return;
        }
        I();
    }

    public final void B(int i8) {
        String str;
        int i9;
        if (i8 == 1 || i8 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i8 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(e.A(sb, str, " should not be set externally."));
        } else if (this.f9171I || i8 != 5) {
            if (i8 != 6 || !this.f9191b || y(i8) > this.f9166D) {
                i9 = i8;
            } else {
                i9 = 3;
            }
            WeakReference weakReference = this.f9183U;
            if (weakReference == null || weakReference.get() == null) {
                C(i8);
                return;
            }
            View view = (View) this.f9183U.get();
            l lVar = new l(this, view, i9);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                if (view.isAttachedToWindow()) {
                    view.post(lVar);
                    return;
                }
            }
            lVar.run();
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i8);
        }
    }

    public final void C(int i8) {
        if (this.f9174L != i8) {
            this.f9174L = i8;
            if (!(i8 == 4 || i8 == 3 || i8 == 6)) {
                boolean z6 = this.f9171I;
            }
            WeakReference weakReference = this.f9183U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i8 == 3) {
                    H(true);
                } else if (i8 == 6 || i8 == 5 || i8 == 4) {
                    H(false);
                }
                G(i8, true);
                ArrayList arrayList = this.f9185W;
                if (arrayList.size() <= 0) {
                    F();
                } else {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final boolean D(View view, float f8) {
        if (this.f9172J) {
            return true;
        }
        if (view.getTop() < this.f9169G) {
            return false;
        }
        int t8 = t();
        if (Math.abs(((f8 * this.f9179Q) + ((float) view.getTop())) - ((float) this.f9169G)) / ((float) t8) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            C0.f r1 = r2.f9175M
            if (r1 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0015
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L_0x0040
            goto L_0x0032
        L_0x0015:
            int r5 = r3.getLeft()
            r1.f526r = r3
            r3 = -1
            r1.f513c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L_0x0030
            int r5 = r1.f511a
            if (r5 != 0) goto L_0x0030
            android.view.View r5 = r1.f526r
            if (r5 == 0) goto L_0x0030
            r5 = 0
            r1.f526r = r5
        L_0x0030:
            if (r3 == 0) goto L_0x0040
        L_0x0032:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            A3.g r3 = r2.f9163A
            r3.a(r4)
            goto L_0x0043
        L_0x0040:
            r2.C(r4)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i8;
        boolean z6;
        C1529b bVar;
        WeakReference weakReference = this.f9183U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1510H.m(view, 524288);
            C1510H.i(view, 0);
            C1510H.m(view, 262144);
            C1510H.i(view, 0);
            C1510H.m(view, 1048576);
            C1510H.i(view, 0);
            SparseIntArray sparseIntArray = this.f9194c0;
            int i9 = sparseIntArray.get(0, -1);
            if (i9 != -1) {
                C1510H.m(view, i9);
                C1510H.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i10 = 6;
            if (!this.f9191b && this.f9174L != 6) {
                String string = view.getResources().getString(2131951653);
                j jVar = new j(6, (Object) this);
                ArrayList e8 = C1510H.e(view);
                int i11 = 0;
                while (true) {
                    if (i11 >= e8.size()) {
                        int i12 = -1;
                        for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                            int i14 = C1510H.e[i13];
                            boolean z8 = true;
                            for (int i15 = 0; i15 < e8.size(); i15++) {
                                if (((C1575d) e8.get(i15)).a() != i14) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z8 &= z6;
                            }
                            if (z8) {
                                i12 = i14;
                            }
                        }
                        i8 = i12;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1575d) e8.get(i11)).f16187a).getLabel())) {
                        i8 = ((C1575d) e8.get(i11)).a();
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i8 != -1) {
                    C1575d dVar = new C1575d((Object) null, i8, string, jVar, (Class) null);
                    View.AccessibilityDelegate c8 = C1510H.c(view);
                    if (c8 == null) {
                        bVar = null;
                    } else if (c8 instanceof C1528a) {
                        bVar = ((C1528a) c8).f15915a;
                    } else {
                        bVar = new C1529b(c8);
                    }
                    if (bVar == null) {
                        bVar = new C1529b();
                    }
                    C1510H.p(view, bVar);
                    C1510H.m(view, dVar.a());
                    C1510H.e(view).add(dVar);
                    C1510H.i(view, 0);
                }
                sparseIntArray.put(0, i8);
            }
            if (this.f9171I && this.f9174L != 5) {
                C1510H.n(view, C1575d.f16184j, new j(5, (Object) this));
            }
            int i16 = this.f9174L;
            if (i16 == 3) {
                if (this.f9191b) {
                    i10 = 4;
                }
                C1510H.n(view, C1575d.i, new j(i10, (Object) this));
            } else if (i16 == 4) {
                if (this.f9191b) {
                    i10 = 3;
                }
                C1510H.n(view, C1575d.f16183h, new j(i10, (Object) this));
            } else if (i16 == 6) {
                C1510H.n(view, C1575d.i, new j(4, (Object) this));
                C1510H.n(view, C1575d.f16183h, new j(3, (Object) this));
            }
        }
    }

    public final void G(int i8, boolean z6) {
        boolean z8;
        z3.g gVar = this.i;
        ValueAnimator valueAnimator = this.f9164B;
        if (i8 != 2) {
            if (this.f9174L != 3 || (!this.f9214x && !z())) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (this.z != z8 && gVar != null) {
                this.z = z8;
                float f8 = 1.0f;
                if (!z6 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.z) {
                        f8 = s();
                    }
                    z3.f fVar = gVar.f16469U;
                    if (fVar.i != f8) {
                        fVar.i = f8;
                        gVar.f16473Y = true;
                        gVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f9 = gVar.f16469U.i;
                    if (z8) {
                        f8 = s();
                    }
                    valueAnimator.setFloatValues(new float[]{f9, f8});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void H(boolean z6) {
        WeakReference weakReference = this.f9183U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z6) {
                    if (this.f9192b0 == null) {
                        this.f9192b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = coordinatorLayout.getChildAt(i8);
                    if (childAt != this.f9183U.get() && z6) {
                        this.f9192b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z6) {
                    this.f9192b0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.f9183U != null) {
            r();
            if (this.f9174L == 4 && (view = (View) this.f9183U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(C1029d dVar) {
        this.f9183U = null;
        this.f9175M = null;
    }

    public final void e() {
        this.f9183U = null;
        this.f9175M = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.f9173K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.f9187Y = r4
            r9.f9188Z = r4
            android.view.VelocityTracker r5 = r9.f9186X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.f9186X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.f9186X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f9186X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.f9186X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.f9190a0 = r1
            r9.f9187Y = r4
            boolean r11 = r9.f9176N
            if (r11 == 0) goto L_0x0089
            r9.f9176N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f9188Z = r7
            int r7 = r9.f9174L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.f9184V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.f9188Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f9187Y = r7
            r9.f9190a0 = r2
        L_0x0078:
            int r7 = r9.f9187Y
            if (r7 != r4) goto L_0x0086
            int r7 = r9.f9188Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = 1
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            r9.f9176N = r11
        L_0x0089:
            boolean r11 = r9.f9176N
            if (r11 != 0) goto L_0x0098
            C0.f r11 = r9.f9175M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L_0x0098
            return r2
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.f9184V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.f9176N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.f9174L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            C0.f r10 = r9.f9175M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.f9188Z
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            C0.f r11 = r9.f9175M
            int r11 = r11.f512b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
            r1 = 1
        L_0x00db:
            return r1
        L_0x00dc:
            r9.f9176N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v15, types: [F2.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v17, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i8) {
        boolean z6;
        int i9 = this.f9202l;
        z3.g gVar = this.i;
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f9183U == null) {
            this.f9198g = coordinatorLayout.getResources().getDimensionPixelSize(2131165298);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29 || this.f9204n || this.f9197f) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (this.f9205o || this.f9206p || this.f9207q || this.f9209s || this.f9210t || this.f9211u || z6) {
                G g8 = new G((Object) this, z6);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.f1527a = paddingStart;
                obj.f1528b = paddingEnd;
                obj.f1529c = paddingBottom;
                C1553z.m(view, new K2((Object) g8, 24, (Object) obj));
                if (view.isAttachedToWindow()) {
                    C1551x.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            H.j jVar = new H.j(view);
            if (i10 >= 30) {
                view.setWindowInsetsAnimationCallback(new C1520S(jVar));
            } else {
                PathInterpolator pathInterpolator = C1519Q.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                C1518P p3 = new C1518P(view, jVar);
                view.setTag(R.id.tag_window_insets_animation_callback, p3);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(p3);
                }
            }
            this.f9183U = new WeakReference(view);
            Context context = view.getContext();
            C0003d.J(context, 2130969412, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            C0003d.I(context, 2130969395, 300);
            C0003d.I(context, 2130969400, 150);
            C0003d.I(context, 2130969399, 100);
            Resources resources = view.getResources();
            resources.getDimension(2131165397);
            resources.getDimension(2131165398);
            if (gVar != null) {
                view.setBackground(gVar);
                float f8 = this.f9170H;
                if (f8 == -1.0f) {
                    f8 = C1553z.e(view);
                }
                gVar.i(f8);
            } else {
                ColorStateList colorStateList = this.f9200j;
                if (colorStateList != null) {
                    C1510H.r(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f9175M == null) {
            this.f9175M = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f9196d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i8);
        this.f9181S = coordinatorLayout.getWidth();
        this.f9182T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f9180R = height;
        int i11 = this.f9182T;
        int i12 = i11 - height;
        int i13 = this.f9213w;
        if (i12 < i13) {
            if (this.f9208r) {
                if (i9 != -1) {
                    i11 = Math.min(i11, i9);
                }
                this.f9180R = i11;
            } else {
                int i14 = i11 - i13;
                if (i9 != -1) {
                    i14 = Math.min(i14, i9);
                }
                this.f9180R = i14;
            }
        }
        this.f9166D = Math.max(0, this.f9182T - this.f9180R);
        this.f9167E = (int) ((1.0f - this.f9168F) * ((float) this.f9182T));
        r();
        int i15 = this.f9174L;
        if (i15 == 3) {
            C1510H.k(view, x());
        } else if (i15 == 6) {
            C1510H.k(view, this.f9167E);
        } else if (this.f9171I && i15 == 5) {
            C1510H.k(view, this.f9182T);
        } else if (i15 == 4) {
            C1510H.k(view, this.f9169G);
        } else if (i15 == 1 || i15 == 2) {
            C1510H.k(view, top - view.getTop());
        }
        G(this.f9174L, false);
        this.f9184V = new WeakReference(v(view));
        ArrayList arrayList = this.f9185W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i8, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, this.f9201k, marginLayoutParams.width), w(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f9202l, marginLayoutParams.height));
        return true;
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.f9184V;
        if (weakReference == null || view != weakReference.get() || this.f9174L == 3) {
            return false;
        }
        return true;
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
        View view3;
        if (i10 != 1) {
            WeakReference weakReference = this.f9184V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i11 = top - i9;
                if (i9 > 0) {
                    if (i11 < x()) {
                        int x8 = top - x();
                        iArr[1] = x8;
                        C1510H.k(view, -x8);
                        C(3);
                    } else if (this.f9173K) {
                        iArr[1] = i9;
                        C1510H.k(view, -i9);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i9 < 0 && !view2.canScrollVertically(-1)) {
                    int i12 = this.f9169G;
                    if (i11 > i12 && !this.f9171I) {
                        int i13 = top - i12;
                        iArr[1] = i13;
                        C1510H.k(view, -i13);
                        C(4);
                    } else if (this.f9173K) {
                        iArr[1] = i9;
                        C1510H.k(view, -i9);
                        C(1);
                    } else {
                        return;
                    }
                }
                u(view.getTop());
                this.f9177O = i9;
                this.f9178P = true;
            }
        }
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int[] iArr) {
    }

    public final void m(View view, Parcelable parcelable) {
        C1161a aVar = (C1161a) parcelable;
        int i8 = this.f9189a;
        if (i8 != 0) {
            if (i8 == -1 || (i8 & 1) == 1) {
                this.e = aVar.f13028X;
            }
            if (i8 == -1 || (i8 & 2) == 2) {
                this.f9191b = aVar.f13029Y;
            }
            if (i8 == -1 || (i8 & 4) == 4) {
                this.f9171I = aVar.f13030Z;
            }
            if (i8 == -1 || (i8 & 8) == 8) {
                this.f9172J = aVar.f13031a0;
            }
        }
        int i9 = aVar.f13027W;
        if (i9 == 1 || i9 == 2) {
            this.f9174L = 4;
        } else {
            this.f9174L = i9;
        }
    }

    public final Parcelable n(View view) {
        return new C1161a(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean o(View view, int i8, int i9) {
        this.f9177O = 0;
        this.f9178P = false;
        if ((i8 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r3.f9167E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.f9166D) < java.lang.Math.abs(r5 - r3.f9169G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.f9169G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f9169G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.f9167E) < java.lang.Math.abs(r5 - r3.f9169G)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto L_0x000f
            r3.C(r1)
            return
        L_0x000f:
            java.lang.ref.WeakReference r6 = r3.f9184V
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto L_0x00b5
            boolean r5 = r3.f9178P
            if (r5 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r5 = r3.f9177O
            r6 = 6
            if (r5 <= 0) goto L_0x0034
            boolean r5 = r3.f9191b
            if (r5 == 0) goto L_0x002a
            goto L_0x00af
        L_0x002a:
            int r5 = r4.getTop()
            int r0 = r3.f9167E
            if (r5 <= r0) goto L_0x00af
            goto L_0x00ae
        L_0x0034:
            boolean r5 = r3.f9171I
            if (r5 == 0) goto L_0x0055
            android.view.VelocityTracker r5 = r3.f9186X
            if (r5 != 0) goto L_0x003e
            r5 = 0
            goto L_0x004d
        L_0x003e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f9193c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f9186X
            int r0 = r3.f9187Y
            float r5 = r5.getYVelocity(r0)
        L_0x004d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L_0x0055
            r1 = 5
            goto L_0x00af
        L_0x0055:
            int r5 = r3.f9177O
            r0 = 4
            if (r5 != 0) goto L_0x0093
            int r5 = r4.getTop()
            boolean r2 = r3.f9191b
            if (r2 == 0) goto L_0x0074
            int r6 = r3.f9166D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f9169G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r2 = r3.f9167E
            if (r5 >= r2) goto L_0x0083
            int r0 = r3.f9169G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f9169G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r5 = r3.f9191b
            if (r5 == 0) goto L_0x0099
        L_0x0097:
            r1 = 4
            goto L_0x00af
        L_0x0099:
            int r5 = r4.getTop()
            int r1 = r3.f9167E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f9169G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
        L_0x00ae:
            r1 = 6
        L_0x00af:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f9178P = r5
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i8 = this.f9174L;
        if (i8 == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.f9175M;
        if (fVar != null && (this.f9173K || i8 == 1)) {
            fVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f9187Y = -1;
            this.f9188Z = -1;
            VelocityTracker velocityTracker = this.f9186X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9186X = null;
            }
        }
        if (this.f9186X == null) {
            this.f9186X = VelocityTracker.obtain();
        }
        this.f9186X.addMovement(motionEvent);
        if (this.f9175M != null && ((this.f9173K || this.f9174L == 1) && actionMasked == 2 && !this.f9176N)) {
            float abs = Math.abs(((float) this.f9188Z) - motionEvent.getY());
            f fVar2 = this.f9175M;
            if (abs > ((float) fVar2.f512b)) {
                fVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9176N;
    }

    public final void r() {
        int t8 = t();
        if (this.f9191b) {
            this.f9169G = Math.max(this.f9182T - t8, this.f9166D);
        } else {
            this.f9169G = this.f9182T - t8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float s() {
        /*
            r5 = this;
            z3.g r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f9183U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f9183U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            z3.g r2 = r5.i
            z3.f r3 = r2.f16469U
            z3.k r3 = r3.f16454a
            z3.c r3 = r3.e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            z3.g r2 = r5.i
            z3.f r4 = r2.f16469U
            z3.k r4 = r4.f16454a
            z3.c r4 = r4.f16505f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            float r1 = r0 / r2
        L_0x0074:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i8;
        if (this.f9197f) {
            return Math.min(Math.max(this.f9198g, this.f9182T - ((this.f9181S * 9) / 16)), this.f9180R) + this.f9212v;
        }
        if (this.f9204n || this.f9205o || (i8 = this.f9203m) <= 0) {
            return this.e + this.f9212v;
        }
        return Math.max(this.e, i8 + this.f9199h);
    }

    public final void u(int i8) {
        if (((View) this.f9183U.get()) != null) {
            ArrayList arrayList = this.f9185W;
            if (!arrayList.isEmpty()) {
                int i9 = this.f9169G;
                if (i8 <= i9 && i9 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final int x() {
        int i8;
        if (this.f9191b) {
            return this.f9166D;
        }
        int i9 = this.f9165C;
        if (this.f9208r) {
            i8 = 0;
        } else {
            i8 = this.f9213w;
        }
        return Math.max(i9, i8);
    }

    public final int y(int i8) {
        if (i8 == 3) {
            return x();
        }
        if (i8 == 4) {
            return this.f9169G;
        }
        if (i8 == 5) {
            return this.f9182T;
        }
        if (i8 == 6) {
            return this.f9167E;
        }
        throw new IllegalArgumentException(Q0.g.m(i8, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f9183U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f9183U.get()).getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return true;
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i8;
        this.f9199h = context.getResources().getDimensionPixelSize(2131165932);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0899a.f11649a);
        int i9 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9200j = c.j(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f9215y = k.b(context, attributeSet, 2130968708, 2132018032).a();
        }
        k kVar = this.f9215y;
        if (kVar != null) {
            z3.g gVar = new z3.g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f9200j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.f9164B = ofFloat;
        ofFloat.setDuration(500);
        this.f9164B.addUpdateListener(new D(1, this));
        this.f9170H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f9201k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f9202l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i8 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i8);
        }
        boolean z6 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f9171I != z6) {
            this.f9171I = z6;
            if (!z6 && this.f9174L == 5) {
                B(4);
            }
            F();
        }
        this.f9204n = obtainStyledAttributes.getBoolean(13, false);
        boolean z8 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f9191b != z8) {
            this.f9191b = z8;
            if (this.f9183U != null) {
                r();
            }
            C((!this.f9191b || this.f9174L != 6) ? this.f9174L : i9);
            G(this.f9174L, true);
            F();
        }
        this.f9172J = obtainStyledAttributes.getBoolean(12, false);
        this.f9173K = obtainStyledAttributes.getBoolean(4, true);
        this.f9189a = obtainStyledAttributes.getInt(10, 0);
        float f8 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f8 <= 0.0f || f8 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f9168F = f8;
        if (this.f9183U != null) {
            this.f9167E = (int) ((1.0f - f8) * ((float) this.f9182T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.f9165C = dimensionPixelOffset;
                G(this.f9174L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i10 = peekValue2.data;
            if (i10 >= 0) {
                this.f9165C = i10;
                G(this.f9174L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f9195d = obtainStyledAttributes.getInt(11, 500);
        this.f9205o = obtainStyledAttributes.getBoolean(17, false);
        this.f9206p = obtainStyledAttributes.getBoolean(18, false);
        this.f9207q = obtainStyledAttributes.getBoolean(19, false);
        this.f9208r = obtainStyledAttributes.getBoolean(20, true);
        this.f9209s = obtainStyledAttributes.getBoolean(14, false);
        this.f9210t = obtainStyledAttributes.getBoolean(15, false);
        this.f9211u = obtainStyledAttributes.getBoolean(16, false);
        this.f9214x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f9193c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
