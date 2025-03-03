package J1;

import P0.r;
import Q0.c;
import h1.C1048n;
import java.util.ArrayList;
import java.util.BitSet;
import m2.C1208a;
import p2.g;
import p2.i;
import p2.j;
import p2.o;
import p2.p;
import t2.k;
import t2.l;

public final class e implements c {

    /* renamed from: U  reason: collision with root package name */
    public final int f2354U;

    /* renamed from: V  reason: collision with root package name */
    public int f2355V;

    /* renamed from: W  reason: collision with root package name */
    public int f2356W;

    /* renamed from: X  reason: collision with root package name */
    public int f2357X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f2358Y;

    public e(int i, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f2354U = i8;
        this.f2355V = i9;
        this.f2356W = i10;
        this.f2357X = i11;
        this.f2358Y = bArr;
    }

    public int a() {
        return -1;
    }

    public void b(g gVar) {
        ((ArrayList) this.f2358Y).add(gVar);
        gVar.f14463c.getClass();
        if (gVar instanceof o) {
            o oVar = (o) gVar;
            throw null;
        } else if (gVar instanceof p) {
            p pVar = (p) gVar;
        }
    }

    public int c() {
        return this.f2354U;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: t2.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2358Y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r1 = r13.f2354U
            int r2 = r13.f2355V
            int r1 = r1 + r2
            int r2 = r13.f2356W
            int r1 = r1 + r2
            int r2 = r13.f2357X
            int r2 = r1 - r2
            D2.j r3 = new D2.j
            r4 = 14
            r3.<init>((int) r1, (int) r4)
            r4 = 0
            r5 = 0
        L_0x001d:
            if (r5 >= r1) goto L_0x002d
            if (r5 < r2) goto L_0x0027
            int r6 = r5 + 1
            r3.m(r5, r6)
            goto L_0x002a
        L_0x0027:
            r3.m(r5, r5)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x002d:
            if (r4 >= r0) goto L_0x0094
            java.lang.Object r1 = r13.f2358Y
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r4)
            p2.g r1 = (p2.g) r1
            boolean r2 = r1 instanceof p2.e
            if (r2 != 0) goto L_0x0091
            java.lang.Object r2 = r13.f2358Y
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            t2.l r5 = r1.f14464d
            java.lang.Object[] r6 = r5.f16371V
            int r6 = r6.length
            t2.l r7 = new t2.l
            r7.<init>(r6)
            r8 = 0
            r9 = 0
        L_0x004d:
            if (r9 >= r6) goto L_0x0080
            java.lang.Object r10 = r5.e(r9)
            t2.k r10 = (t2.k) r10
            if (r10 != 0) goto L_0x0059
            r10 = 0
            goto L_0x0072
        L_0x0059:
            java.lang.Object r11 = r3.f1094V     // Catch:{ IndexOutOfBoundsException -> 0x0064 }
            y2.e r11 = (y2.C1630e) r11     // Catch:{ IndexOutOfBoundsException -> 0x0064 }
            int r12 = r10.f15204U     // Catch:{ IndexOutOfBoundsException -> 0x0064 }
            int r11 = r11.f(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0064 }
            goto L_0x0065
        L_0x0064:
            r11 = -1
        L_0x0065:
            if (r11 < 0) goto L_0x0078
            int r12 = r10.f15204U
            if (r12 != r11) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            v2.d r10 = r10.f15205V
            t2.k r10 = t2.k.e(r11, r10)
        L_0x0072:
            r7.f(r9, r10)
            int r9 = r9 + 1
            goto L_0x004d
        L_0x0078:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "no mapping specified for register"
            r0.<init>(r1)
            throw r0
        L_0x0080:
            r7.f16382U = r8
            boolean r6 = r7.equals(r5)
            if (r6 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = r7
        L_0x008a:
            p2.g r1 = r1.k(r5)
            r2.set(r4, r1)
        L_0x0091:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0094:
            int r0 = r13.f2356W
            int r0 = r0 + 1
            r13.f2356W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.e.d():void");
    }

    public int e() {
        r rVar = (r) this.f2358Y;
        int i = this.f2355V;
        if (i == 8) {
            return rVar.v();
        }
        if (i == 16) {
            return rVar.B();
        }
        int i8 = this.f2356W;
        this.f2356W = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f2357X & 15;
        }
        int v4 = rVar.v();
        this.f2357X = v4;
        return (v4 & 240) >> 4;
    }

    public void f() {
        int size = ((ArrayList) this.f2358Y).size();
        for (int i = 0; i < size; i++) {
            g gVar = (g) ((ArrayList) this.f2358Y).get(i);
            if (!(gVar instanceof p2.e)) {
                ((ArrayList) this.f2358Y).set(i, gVar.j(1));
            }
        }
        this.f2355V++;
    }

    public i g(g gVar) {
        i h5 = h(gVar.k(gVar.f14464d.j(gVar.f14462b.e, (BitSet) null)), gVar.f14462b);
        if (h5 != null) {
            return h5;
        }
        throw new C1208a((Exception) null, "No expanded opcode for " + gVar);
    }

    public i h(g gVar, i iVar) {
        while (iVar != null && !iVar.f14469d.v(gVar)) {
            i[] iVarArr = j.f14548a;
            int i = iVar.f14468c;
            if (i == -1) {
                iVar = null;
            } else {
                try {
                    iVar = j.f14548a[i - -1];
                    if (iVar == null) {
                        throw new IllegalArgumentException("bogus opcode");
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return iVar;
    }

    public boolean i(i[] iVarArr) {
        int i;
        int i8 = this.f2355V;
        if (i8 < 0) {
            i8 = 0;
        }
        boolean z = false;
        while (true) {
            int size = ((ArrayList) this.f2358Y).size();
            int i9 = this.f2355V;
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) ((ArrayList) this.f2358Y).get(i10);
                i iVar = iVarArr[i10];
                i h5 = h(gVar, iVar);
                if (h5 == null) {
                    BitSet j7 = g(gVar).f14469d.j(gVar);
                    int i11 = gVar.f14462b.e;
                    l lVar = gVar.f14464d;
                    int length = lVar.f16371V.length;
                    if (i11 == 0 || j7.get(0)) {
                        i = 0;
                    } else {
                        i = ((k) lVar.e(0)).d();
                    }
                    int i12 = 0;
                    while (i11 < length) {
                        if (!j7.get(i11)) {
                            i12 += ((k) lVar.e(i11)).d();
                        }
                        i11++;
                    }
                    int max = Math.max(i12, i);
                    if (max > i9) {
                        i9 = max;
                    }
                } else if (iVar == h5) {
                }
                iVarArr[i10] = h5;
            }
            if (i8 >= i9) {
                this.f2355V = i8;
                return z;
            }
            int i13 = i9 - i8;
            int size2 = ((ArrayList) this.f2358Y).size();
            for (int i14 = 0; i14 < size2; i14++) {
                g gVar2 = (g) ((ArrayList) this.f2358Y).get(i14);
                if (!(gVar2 instanceof p2.e)) {
                    ((ArrayList) this.f2358Y).set(i14, gVar2.j(i13));
                }
            }
            z = true;
            i8 = i9;
        }
    }

    public e(C1048n nVar, int i, int i8, int i9) {
        this.f2354U = i8;
        this.f2358Y = new ArrayList(i);
        this.f2355V = -1;
        this.f2357X = i9;
    }

    public e(c cVar) {
        r rVar = cVar.f4016W;
        this.f2358Y = rVar;
        rVar.H(12);
        this.f2355V = rVar.z() & 255;
        this.f2354U = rVar.z();
    }
}
