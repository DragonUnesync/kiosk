package g2;

import B3.q;
import N.e;
import Q7.g;
import a1.C0410a;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g2.a  reason: case insensitive filesystem */
public final class C0948a extends p {

    /* renamed from: A0  reason: collision with root package name */
    public int f11925A0;

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f11926w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f11927x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f11928y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f11929z0;

    public final void A(FrameLayout frameLayout) {
        super.A(frameLayout);
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).A(frameLayout);
        }
    }

    public final void B() {
        if (this.f11926w0.isEmpty()) {
            J();
            m();
            return;
        }
        u uVar = new u();
        uVar.f11998b = this;
        Iterator it = this.f11926w0.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(uVar);
        }
        this.f11928y0 = this.f11926w0.size();
        if (!this.f11927x0) {
            for (int i = 1; i < this.f11926w0.size(); i++) {
                ((p) this.f11926w0.get(i - 1)).a(new u((p) this.f11926w0.get(i), 2));
            }
            p pVar = (p) this.f11926w0.get(0);
            if (pVar != null) {
                pVar.B();
                return;
            }
            return;
        }
        Iterator it2 = this.f11926w0.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).B();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.f11988q0
            g2.a r7 = r0.f11975c0
            r8 = 0
            if (r7 == 0) goto L_0x001f
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0016
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x001e
        L_0x0016:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
        L_0x001e:
            return
        L_0x001f:
            r7 = 1
            r10 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0027
            r12 = 1
            goto L_0x0028
        L_0x0027:
            r12 = 0
        L_0x0028:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x0030
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0038
        L_0x0030:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x003f
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x003f
        L_0x0038:
            r0.f11984l0 = r10
            U0.c r14 = g2.o.f11958L
            r0.w(r0, r14, r12)
        L_0x003f:
            boolean r14 = r0.f11927x0
            if (r14 == 0) goto L_0x005f
        L_0x0043:
            java.util.ArrayList r11 = r0.f11926w0
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0059
            java.util.ArrayList r11 = r0.f11926w0
            java.lang.Object r11 = r11.get(r10)
            g2.p r11 = (g2.p) r11
            r11.C(r1, r3)
            int r10 = r10 + 1
            goto L_0x0043
        L_0x0059:
            r16 = r12
            r17 = r13
            goto L_0x00cc
        L_0x005f:
            r10 = 1
        L_0x0060:
            java.util.ArrayList r14 = r0.f11926w0
            int r14 = r14.size()
            if (r10 >= r14) goto L_0x007b
            java.util.ArrayList r14 = r0.f11926w0
            java.lang.Object r14 = r14.get(r10)
            g2.p r14 = (g2.p) r14
            long r14 = r14.f11989r0
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 <= 0) goto L_0x0078
        L_0x0076:
            int r10 = r10 - r7
            goto L_0x0082
        L_0x0078:
            int r10 = r10 + 1
            goto L_0x0060
        L_0x007b:
            java.util.ArrayList r10 = r0.f11926w0
            int r10 = r10.size()
            goto L_0x0076
        L_0x0082:
            if (r11 < 0) goto L_0x00ad
        L_0x0084:
            java.util.ArrayList r11 = r0.f11926w0
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0059
            java.util.ArrayList r11 = r0.f11926w0
            java.lang.Object r11 = r11.get(r10)
            g2.p r11 = (g2.p) r11
            long r14 = r11.f11989r0
            r16 = r12
            r17 = r13
            long r12 = r1 - r14
            int r18 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r18 >= 0) goto L_0x00a1
            goto L_0x00cc
        L_0x00a1:
            long r14 = r3 - r14
            r11.C(r12, r14)
            int r10 = r10 + 1
            r12 = r16
            r13 = r17
            goto L_0x0084
        L_0x00ad:
            r16 = r12
            r17 = r13
        L_0x00b1:
            if (r10 < 0) goto L_0x00cc
            java.util.ArrayList r11 = r0.f11926w0
            java.lang.Object r11 = r11.get(r10)
            g2.p r11 = (g2.p) r11
            long r12 = r11.f11989r0
            long r14 = r1 - r12
            long r12 = r3 - r12
            r11.C(r14, r12)
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            int r10 = r10 + -1
            goto L_0x00b1
        L_0x00cc:
            g2.a r10 = r0.f11975c0
            if (r10 == 0) goto L_0x00e9
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
        L_0x00d8:
            if (r17 >= 0) goto L_0x00e9
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x00e9
        L_0x00de:
            if (r10 <= 0) goto L_0x00e2
            r0.f11984l0 = r7
        L_0x00e2:
            U0.c r1 = g2.o.f11959M
            r7 = r16
            r0.w(r0, r1, r7)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0948a.C(long, long):void");
    }

    public final void D(long j7) {
        ArrayList arrayList;
        this.f11969W = j7;
        if (j7 >= 0 && (arrayList = this.f11926w0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((p) this.f11926w0.get(i)).D(j7);
            }
        }
    }

    public final void E(g gVar) {
        this.f11925A0 |= 8;
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).E(gVar);
        }
    }

    public final void F(TimeInterpolator timeInterpolator) {
        this.f11925A0 |= 1;
        ArrayList arrayList = this.f11926w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((p) this.f11926w0.get(i)).F(timeInterpolator);
            }
        }
        this.f11970X = timeInterpolator;
    }

    public final void G(C0410a aVar) {
        super.G(aVar);
        this.f11925A0 |= 4;
        if (this.f11926w0 != null) {
            for (int i = 0; i < this.f11926w0.size(); i++) {
                ((p) this.f11926w0.get(i)).G(aVar);
            }
        }
    }

    public final void H() {
        this.f11925A0 |= 2;
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).H();
        }
    }

    public final void I(long j7) {
        this.f11968V = j7;
    }

    public final String K(String str) {
        String K4 = super.K(str);
        for (int i = 0; i < this.f11926w0.size(); i++) {
            StringBuilder B8 = e.B(K4, "\n");
            B8.append(((p) this.f11926w0.get(i)).K(str + "  "));
            K4 = B8.toString();
        }
        return K4;
    }

    public final void L(p pVar) {
        this.f11926w0.add(pVar);
        pVar.f11975c0 = this;
        long j7 = this.f11969W;
        if (j7 >= 0) {
            pVar.D(j7);
        }
        if ((this.f11925A0 & 1) != 0) {
            pVar.F(this.f11970X);
        }
        if ((this.f11925A0 & 2) != 0) {
            pVar.H();
        }
        if ((this.f11925A0 & 4) != 0) {
            pVar.G(this.p0);
        }
        if ((this.f11925A0 & 8) != 0) {
            pVar.E((g) null);
        }
    }

    public final void c() {
        super.c();
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).c();
        }
    }

    public final void d(x xVar) {
        if (u(xVar.f12001b)) {
            Iterator it = this.f11926w0.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.u(xVar.f12001b)) {
                    pVar.d(xVar);
                    xVar.f12002c.add(pVar);
                }
            }
        }
    }

    public final void f(x xVar) {
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).f(xVar);
        }
    }

    public final void g(x xVar) {
        if (u(xVar.f12001b)) {
            Iterator it = this.f11926w0.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.u(xVar.f12001b)) {
                    pVar.g(xVar);
                    xVar.f12002c.add(pVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final p clone() {
        C0948a aVar = (C0948a) super.clone();
        aVar.f11926w0 = new ArrayList();
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            p j7 = ((p) this.f11926w0.get(i)).clone();
            aVar.f11926w0.add(j7);
            j7.f11975c0 = aVar;
        }
        return aVar;
    }

    public final void l(FrameLayout frameLayout, q qVar, q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j7 = this.f11968V;
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) this.f11926w0.get(i);
            if (j7 > 0 && (this.f11927x0 || i == 0)) {
                long j8 = pVar.f11968V;
                if (j8 > 0) {
                    pVar.I(j8 + j7);
                } else {
                    pVar.I(j7);
                }
            }
            pVar.l(frameLayout, qVar, qVar2, arrayList, arrayList2);
        }
    }

    public final boolean s() {
        for (int i = 0; i < this.f11926w0.size(); i++) {
            if (((p) this.f11926w0.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.f11926w0.size();
        for (int i = 0; i < size; i++) {
            ((p) this.f11926w0.get(i)).x(viewGroup);
        }
    }

    public final void y() {
        this.f11988q0 = 0;
        u uVar = new u(this, 0);
        for (int i = 0; i < this.f11926w0.size(); i++) {
            p pVar = (p) this.f11926w0.get(i);
            pVar.a(uVar);
            pVar.y();
            long j7 = pVar.f11988q0;
            if (this.f11927x0) {
                this.f11988q0 = Math.max(this.f11988q0, j7);
            } else {
                long j8 = this.f11988q0;
                pVar.f11989r0 = j8;
                this.f11988q0 = j8 + j7;
            }
        }
    }

    public final p z(n nVar) {
        super.z(nVar);
        return this;
    }
}
