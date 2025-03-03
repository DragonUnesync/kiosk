package g2;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public p f11992U;

    /* renamed from: V  reason: collision with root package name */
    public FrameLayout f11993V;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: g2.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01e0 A[EDGE_INSN: B:130:0x01e0->B:87:0x01e0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r17 = this;
            r0 = r17
            android.widget.FrameLayout r1 = r0.f11993V
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r0)
            r1.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = g2.t.f11996c
            android.widget.FrameLayout r3 = r0.f11993V
            boolean r1 = r1.remove(r3)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            return r8
        L_0x001a:
            Y.e r1 = g2.t.b()
            java.lang.Object r2 = r1.get(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L_0x0030
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.put(r3, r2)
        L_0x002e:
            r5 = 0
            goto L_0x003b
        L_0x0030:
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x002e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x003b:
            g2.p r9 = r0.f11992U
            r2.add(r9)
            g2.r r2 = new g2.r
            r2.<init>(r0, r1)
            r9.a(r2)
            r1 = 0
            r9.h(r3, r1)
            if (r5 == 0) goto L_0x0062
            java.util.Iterator r2 = r5.iterator()
        L_0x0052:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r2.next()
            g2.p r5 = (g2.p) r5
            r5.A(r3)
            goto L_0x0052
        L_0x0062:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.f11977e0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.f11978f0 = r2
            B3.q r2 = r9.f11973a0
            B3.q r5 = r9.f11974b0
            Y.e r6 = new Y.e
            java.lang.Object r7 = r2.f449U
            Y.e r7 = (Y.e) r7
            r6.<init>(r7)
            Y.e r7 = new Y.e
            java.lang.Object r10 = r5.f449U
            Y.e r10 = (Y.e) r10
            r7.<init>(r10)
            r10 = 0
        L_0x0087:
            int[] r11 = r9.f11976d0
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01e0
            r11 = r11[r10]
            if (r11 == r8) goto L_0x019f
            r12 = 2
            if (r11 == r12) goto L_0x014e
            r12 = 3
            if (r11 == r12) goto L_0x00f6
            r12 = 4
            if (r11 == r12) goto L_0x009c
        L_0x0099:
            r1 = r2
            goto L_0x01d7
        L_0x009c:
            java.lang.Object r11 = r2.f451W
            Y.g r11 = (Y.g) r11
            int r12 = r11.h()
            r13 = 0
        L_0x00a5:
            if (r13 >= r12) goto L_0x0099
            java.lang.Object r14 = r11.i(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x00ee
            boolean r15 = r9.u(r14)
            if (r15 == 0) goto L_0x00ee
            r16 = r2
            long r1 = r11.f(r13)
            java.lang.Object r15 = r5.f451W
            Y.g r15 = (Y.g) r15
            java.lang.Object r1 = r15.d(r1)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x00f0
            boolean r2 = r9.u(r1)
            if (r2 == 0) goto L_0x00f0
            java.lang.Object r2 = r6.get(r14)
            g2.x r2 = (g2.x) r2
            java.lang.Object r15 = r7.get(r1)
            g2.x r15 = (g2.x) r15
            if (r2 == 0) goto L_0x00f0
            if (r15 == 0) goto L_0x00f0
            java.util.ArrayList r4 = r9.f11977e0
            r4.add(r2)
            java.util.ArrayList r2 = r9.f11978f0
            r2.add(r15)
            r6.remove(r14)
            r7.remove(r1)
            goto L_0x00f0
        L_0x00ee:
            r16 = r2
        L_0x00f0:
            int r13 = r13 + 1
            r2 = r16
            r1 = 0
            goto L_0x00a5
        L_0x00f6:
            r1 = r2
            java.lang.Object r2 = r1.f450V
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            java.lang.Object r4 = r5.f450V
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            int r11 = r2.size()
            r12 = 0
        L_0x0104:
            if (r12 >= r11) goto L_0x01d7
            java.lang.Object r13 = r2.valueAt(r12)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x0148
            boolean r14 = r9.u(r13)
            if (r14 == 0) goto L_0x0148
            int r14 = r2.keyAt(r12)
            java.lang.Object r14 = r4.get(r14)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0148
            boolean r15 = r9.u(r14)
            if (r15 == 0) goto L_0x0148
            java.lang.Object r15 = r6.get(r13)
            g2.x r15 = (g2.x) r15
            java.lang.Object r16 = r7.get(r14)
            r8 = r16
            g2.x r8 = (g2.x) r8
            if (r15 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            java.util.ArrayList r0 = r9.f11977e0
            r0.add(r15)
            java.util.ArrayList r0 = r9.f11978f0
            r0.add(r8)
            r6.remove(r13)
            r7.remove(r14)
        L_0x0148:
            int r12 = r12 + 1
            r0 = r17
            r8 = 1
            goto L_0x0104
        L_0x014e:
            r1 = r2
            java.lang.Object r0 = r1.f452X
            Y.e r0 = (Y.e) r0
            java.lang.Object r2 = r5.f452X
            Y.e r2 = (Y.e) r2
            int r4 = r0.f6308W
            r8 = 0
        L_0x015a:
            if (r8 >= r4) goto L_0x01d7
            java.lang.Object r11 = r0.j(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x019c
            boolean r12 = r9.u(r11)
            if (r12 == 0) goto L_0x019c
            java.lang.Object r12 = r0.f(r8)
            java.lang.Object r12 = r2.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x019c
            boolean r13 = r9.u(r12)
            if (r13 == 0) goto L_0x019c
            java.lang.Object r13 = r6.get(r11)
            g2.x r13 = (g2.x) r13
            java.lang.Object r14 = r7.get(r12)
            g2.x r14 = (g2.x) r14
            if (r13 == 0) goto L_0x019c
            if (r14 == 0) goto L_0x019c
            java.util.ArrayList r15 = r9.f11977e0
            r15.add(r13)
            java.util.ArrayList r13 = r9.f11978f0
            r13.add(r14)
            r6.remove(r11)
            r7.remove(r12)
        L_0x019c:
            int r8 = r8 + 1
            goto L_0x015a
        L_0x019f:
            r1 = r2
            int r0 = r6.f6308W
            r2 = 1
            int r0 = r0 - r2
        L_0x01a4:
            if (r0 < 0) goto L_0x01d7
            java.lang.Object r2 = r6.f(r0)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x01d4
            boolean r4 = r9.u(r2)
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r2 = r7.remove(r2)
            g2.x r2 = (g2.x) r2
            if (r2 == 0) goto L_0x01d4
            android.view.View r4 = r2.f12001b
            boolean r4 = r9.u(r4)
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r4 = r6.h(r0)
            g2.x r4 = (g2.x) r4
            java.util.ArrayList r8 = r9.f11977e0
            r8.add(r4)
            java.util.ArrayList r4 = r9.f11978f0
            r4.add(r2)
        L_0x01d4:
            int r0 = r0 + -1
            goto L_0x01a4
        L_0x01d7:
            int r10 = r10 + 1
            r0 = r17
            r2 = r1
            r1 = 0
            r8 = 1
            goto L_0x0087
        L_0x01e0:
            r0 = 0
        L_0x01e1:
            int r1 = r6.f6308W
            if (r0 >= r1) goto L_0x0201
            java.lang.Object r1 = r6.j(r0)
            g2.x r1 = (g2.x) r1
            android.view.View r2 = r1.f12001b
            boolean r2 = r9.u(r2)
            if (r2 == 0) goto L_0x01fe
            java.util.ArrayList r2 = r9.f11977e0
            r2.add(r1)
            java.util.ArrayList r1 = r9.f11978f0
            r2 = 0
            r1.add(r2)
        L_0x01fe:
            int r0 = r0 + 1
            goto L_0x01e1
        L_0x0201:
            r1 = 0
        L_0x0202:
            int r0 = r7.f6308W
            if (r1 >= r0) goto L_0x0224
            java.lang.Object r0 = r7.j(r1)
            g2.x r0 = (g2.x) r0
            android.view.View r2 = r0.f12001b
            boolean r2 = r9.u(r2)
            if (r2 == 0) goto L_0x0220
            java.util.ArrayList r2 = r9.f11978f0
            r2.add(r0)
            java.util.ArrayList r0 = r9.f11977e0
            r2 = 0
            r0.add(r2)
            goto L_0x0221
        L_0x0220:
            r2 = 0
        L_0x0221:
            int r1 = r1 + 1
            goto L_0x0202
        L_0x0224:
            Y.e r0 = g2.p.p()
            int r1 = r0.f6308W
            android.view.WindowId r2 = r3.getWindowId()
            r4 = 1
            int r1 = r1 - r4
        L_0x0230:
            if (r1 < 0) goto L_0x0294
            java.lang.Object r4 = r0.f(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0291
            java.lang.Object r5 = r0.get(r4)
            g2.k r5 = (g2.k) r5
            if (r5 == 0) goto L_0x0291
            android.view.View r6 = r5.f11952a
            if (r6 == 0) goto L_0x0291
            android.view.WindowId r7 = r5.f11955d
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0291
            r7 = 1
            g2.x r8 = r9.r(r6, r7)
            g2.x r10 = r9.n(r6, r7)
            if (r8 != 0) goto L_0x0268
            if (r10 != 0) goto L_0x0268
            B3.q r7 = r9.f11974b0
            java.lang.Object r7 = r7.f449U
            Y.e r7 = (Y.e) r7
            java.lang.Object r6 = r7.get(r6)
            r10 = r6
            g2.x r10 = (g2.x) r10
        L_0x0268:
            if (r8 != 0) goto L_0x026c
            if (r10 == 0) goto L_0x0291
        L_0x026c:
            g2.x r6 = r5.f11954c
            g2.p r5 = r5.e
            boolean r6 = r5.t(r6, r10)
            if (r6 == 0) goto L_0x0291
            g2.p r5 = r5.o()
            r5.getClass()
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x028e
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x028a
            goto L_0x028e
        L_0x028a:
            r0.remove(r4)
            goto L_0x0291
        L_0x028e:
            r4.cancel()
        L_0x0291:
            int r1 = r1 + -1
            goto L_0x0230
        L_0x0294:
            B3.q r4 = r9.f11973a0
            B3.q r5 = r9.f11974b0
            java.util.ArrayList r6 = r9.f11977e0
            java.util.ArrayList r7 = r9.f11978f0
            r2 = r9
            r2.l(r3, r4, r5, r6, r7)
            r9.B()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.s.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f11993V;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f11996c;
        FrameLayout frameLayout2 = this.f11993V;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) t.b().get(frameLayout2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((p) it.next()).A(frameLayout2);
            }
        }
        this.f11992U.i(true);
    }
}
