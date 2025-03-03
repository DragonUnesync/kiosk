package C0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k2.C1160q;
import o3.c;
import v0.C1510H;
import v0.C1529b;
import w0.C1576e;
import z3.e;

public abstract class b extends C1529b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f492n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    public static final e f493o = new e(10);

    /* renamed from: p  reason: collision with root package name */
    public static final e f494p = new e(11);

    /* renamed from: d  reason: collision with root package name */
    public final Rect f495d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f496f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f497g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f498h;
    public final Chip i;

    /* renamed from: j  reason: collision with root package name */
    public a f499j;

    /* renamed from: k  reason: collision with root package name */
    public int f500k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    public int f501l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    public int f502m = RecyclerView.UNDEFINED_DURATION;

    public b(Chip chip) {
        if (chip != null) {
            this.i = chip;
            this.f498h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
            chip.setFocusable(true);
            WeakHashMap weakHashMap = C1510H.f15874a;
            if (chip.getImportantForAccessibility() == 0) {
                chip.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final C1160q b(View view) {
        if (this.f499j == null) {
            this.f499j = new a(this);
        }
        return this.f499j;
    }

    public final void d(View view, C1576e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((c) this).f14207q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            eVar.k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i8) {
        if (this.f501l != i8) {
            return false;
        }
        this.f501l = RecyclerView.UNDEFINED_DURATION;
        c cVar = (c) this;
        if (i8 == 1) {
            Chip chip = cVar.f14207q;
            chip.f9256j0 = false;
            chip.refreshDrawableState();
        }
        q(i8, 8);
        return true;
    }

    public final C1576e k(int i8) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1576e eVar = new C1576e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        eVar.i("android.view.View");
        Rect rect = f492n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i8, eVar);
        if (eVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        eVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(chip.getContext().getPackageName());
                eVar.f16193b = i8;
                obtain.setSource(chip, i8);
                if (this.f500k == i8) {
                    obtain.setAccessibilityFocused(true);
                    eVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    eVar.a(64);
                }
                if (this.f501l == i8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    eVar.a(2);
                } else if (obtain.isFocusable()) {
                    eVar.a(1);
                }
                obtain.setFocused(z);
                int[] iArr = this.f497g;
                chip.getLocationOnScreen(iArr);
                Rect rect3 = this.f495d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    eVar.f(rect3);
                    rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                }
                Rect rect4 = this.f496f;
                if (chip.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    if (rect3.intersect(rect4)) {
                        obtain.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                            ViewParent parent = chip.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    obtain.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return eVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: w0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: w0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: w0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: w0.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l(r4)
            Y.j r5 = new Y.j
            r5.<init>()
            r7 = 0
        L_0x0015:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0038
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            w0.e r8 = r0.k(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.d(r9, r8)
            int r7 = r7 + r3
            goto L_0x0015
        L_0x0038:
            int r4 = r0.f501l
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r8) goto L_0x0040
            r4 = 0
            goto L_0x0046
        L_0x0040:
            java.lang.Object r4 = r5.c(r4)
            w0.e r4 = (w0.C1576e) r4
        L_0x0046:
            z3.e r9 = f493o
            z3.e r10 = f494p
            com.google.android.material.chip.Chip r11 = r0.i
            r12 = 2
            if (r1 == r3) goto L_0x015b
            if (r1 == r12) goto L_0x015b
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r7 = 17
            if (r1 == r7) goto L_0x006a
            if (r1 == r15) goto L_0x006a
            if (r1 == r14) goto L_0x006a
            if (r1 != r12) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006a:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.f501l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r8) goto L_0x007f
            w0.e r2 = r0.n(r6)
            r2.f(r3)
        L_0x007c:
            r18 = -1
            goto L_0x00b4
        L_0x007f:
            if (r2 == 0) goto L_0x0085
            r3.set(r2)
            goto L_0x007c
        L_0x0085:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r7) goto L_0x00ae
            if (r1 == r15) goto L_0x00a7
            if (r1 == r14) goto L_0x00a1
            if (r1 != r12) goto L_0x009b
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            goto L_0x007c
        L_0x009b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00a1:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            goto L_0x007c
        L_0x00a7:
            r11 = 0
            r18 = -1
            r3.set(r11, r6, r2, r6)
            goto L_0x00b4
        L_0x00ae:
            r11 = 0
            r18 = -1
            r3.set(r2, r11, r2, r6)
        L_0x00b4:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r7) goto L_0x00ea
            if (r1 == r15) goto L_0x00df
            if (r1 == r14) goto L_0x00d3
            if (r1 != r12) goto L_0x00cd
            int r6 = r3.height()
            r7 = 1
            int r6 = r6 + r7
            int r6 = -r6
            r14 = 0
            r2.offset(r14, r6)
            goto L_0x00f4
        L_0x00cd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00d3:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            int r6 = -r6
            r2.offset(r6, r14)
            goto L_0x00f4
        L_0x00df:
            r7 = 1
            r14 = 0
            int r6 = r3.height()
            int r6 = r6 + r7
            r2.offset(r14, r6)
            goto L_0x00f4
        L_0x00ea:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            r2.offset(r6, r14)
        L_0x00f4:
            r10.getClass()
            int r6 = r5.f6311W
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r11 = 0
            r16 = 0
        L_0x0101:
            if (r11 >= r6) goto L_0x0157
            java.lang.Object[] r10 = r5.f6310V
            r10 = r10[r11]
            w0.e r10 = (w0.C1576e) r10
            if (r10 != r4) goto L_0x010c
            goto L_0x0154
        L_0x010c:
            r9.getClass()
            r10.f(r7)
            boolean r12 = Q7.g.u(r1, r3, r7)
            if (r12 != 0) goto L_0x0119
            goto L_0x0154
        L_0x0119:
            boolean r12 = Q7.g.u(r1, r3, r2)
            if (r12 != 0) goto L_0x0120
            goto L_0x014f
        L_0x0120:
            boolean r12 = Q7.g.b(r1, r3, r7, r2)
            if (r12 == 0) goto L_0x0127
            goto L_0x014f
        L_0x0127:
            boolean r12 = Q7.g.b(r1, r3, r2, r7)
            if (r12 == 0) goto L_0x012e
            goto L_0x0154
        L_0x012e:
            int r12 = Q7.g.x(r1, r3, r7)
            int r13 = Q7.g.y(r1, r3, r7)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r13 = r13 * r13
            int r13 = r13 + r15
            int r12 = Q7.g.x(r1, r3, r2)
            int r15 = Q7.g.y(r1, r3, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r13 >= r15) goto L_0x0154
        L_0x014f:
            r2.set(r7)
            r16 = r10
        L_0x0154:
            r13 = 1
            int r11 = r11 + r13
            goto L_0x0101
        L_0x0157:
            r1 = r16
            goto L_0x01c7
        L_0x015b:
            r13 = 1
            r14 = 0
            r18 = -1
            java.util.WeakHashMap r2 = v0.C1510H.f15874a
            int r2 = r11.getLayoutDirection()
            if (r2 != r13) goto L_0x0169
            r2 = 1
            goto L_0x016a
        L_0x0169:
            r2 = 0
        L_0x016a:
            r10.getClass()
            int r3 = r5.f6311W
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = 0
        L_0x0175:
            if (r11 >= r3) goto L_0x0183
            java.lang.Object[] r7 = r5.f6310V
            r7 = r7[r11]
            w0.e r7 = (w0.C1576e) r7
            r6.add(r7)
            r7 = 1
            int r11 = r11 + r7
            goto L_0x0175
        L_0x0183:
            r7 = 1
            C0.c r3 = new C0.c
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r7) goto L_0x01ae
            if (r1 != r12) goto L_0x01a6
            int r1 = r6.size()
            if (r4 != 0) goto L_0x0198
            r2 = -1
            goto L_0x019c
        L_0x0198:
            int r2 = r6.lastIndexOf(r4)
        L_0x019c:
            int r2 = r2 + r7
            if (r2 >= r1) goto L_0x01a4
            java.lang.Object r7 = r6.get(r2)
            goto L_0x01c2
        L_0x01a4:
            r7 = 0
            goto L_0x01c2
        L_0x01a6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01ae:
            int r1 = r6.size()
            if (r4 != 0) goto L_0x01b6
        L_0x01b4:
            r2 = 1
            goto L_0x01bb
        L_0x01b6:
            int r1 = r6.indexOf(r4)
            goto L_0x01b4
        L_0x01bb:
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x01a4
            java.lang.Object r7 = r6.get(r1)
        L_0x01c2:
            r16 = r7
            w0.e r16 = (w0.C1576e) r16
            goto L_0x0157
        L_0x01c7:
            if (r1 != 0) goto L_0x01ca
            goto L_0x01df
        L_0x01ca:
            int r2 = r5.f6311W
            r6 = 0
        L_0x01cd:
            if (r6 >= r2) goto L_0x01da
            java.lang.Object[] r3 = r5.f6310V
            r3 = r3[r6]
            if (r3 != r1) goto L_0x01d7
            r13 = r6
            goto L_0x01db
        L_0x01d7:
            r3 = 1
            int r6 = r6 + r3
            goto L_0x01cd
        L_0x01da:
            r13 = -1
        L_0x01db:
            int[] r1 = r5.f6309U
            r8 = r1[r13]
        L_0x01df:
            boolean r1 = r0.p(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.m(int, android.graphics.Rect):boolean");
    }

    public final C1576e n(int i8) {
        if (i8 != -1) {
            return k(i8);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        C1576e eVar = new C1576e(obtain);
        WeakHashMap weakHashMap = C1510H.f15874a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                eVar.f16192a.addChild(chip, ((Integer) arrayList.get(i9)).intValue());
            }
            return eVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i8, C1576e eVar);

    public final boolean p(int i8) {
        int i9;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i9 = this.f501l) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            j(i9);
        }
        if (i8 == Integer.MIN_VALUE) {
            return false;
        }
        this.f501l = i8;
        c cVar = (c) this;
        if (i8 == 1) {
            Chip chip2 = cVar.f14207q;
            chip2.f9256j0 = true;
            chip2.refreshDrawableState();
        }
        q(i8, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f498h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            com.google.android.material.chip.Chip r0 = r5.i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            w0.e r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f16192a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            r7.setSource(r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.q(int, int):void");
    }
}
