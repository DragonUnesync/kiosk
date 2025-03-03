package r2;

import J1.e;
import K1.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k2.C1160q;
import p2.C1339a;
import p2.C1340b;
import p2.C1341c;
import p2.d;
import p2.f;
import p2.g;
import p2.h;
import p2.o;
import p2.p;
import t2.C1419a;
import t2.C1420b;
import u2.C1490a;
import u2.q;
import u2.u;
import v2.C1559b;
import v2.c;
import y2.C1627b;
import y2.C1628c;

/* renamed from: r2.e  reason: case insensitive filesystem */
public final class C1386e extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final q f14878Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B3.q f14879Z;

    /* renamed from: a0  reason: collision with root package name */
    public k f14880a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f14881b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C1559b f14882c0;

    public C1386e(q qVar, B3.q qVar2, boolean z, C1559b bVar) {
        super(4, -1);
        if (qVar == null) {
            throw new NullPointerException("ref == null");
        } else if (qVar2 == null) {
            throw new NullPointerException("code == null");
        } else if (bVar != null) {
            this.f14878Y = qVar;
            this.f14879Z = qVar2;
            this.f14881b0 = z;
            this.f14882c0 = bVar;
            this.f14880a0 = null;
        } else {
            throw new NullPointerException("throwsList == null");
        }
    }

    public final void a(C1387f fVar) {
        w wVar = fVar.f14892l;
        B3.q qVar = this.f14879Z;
        qVar.getClass();
        ((e) qVar.f449U).getClass();
        C1420b bVar = (C1420b) ((d4.k) ((d4.k) qVar.f450V).f9766V).f9766V;
        int length = bVar.f16371V.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (((C1628c) ((C1419a) bVar.e(i)).f15183b.h().d()).f16371V.length != 0) {
                d4.k kVar = (d4.k) qVar.f450V;
                kVar.getClass();
                HashSet hashSet = new HashSet(20);
                C1420b bVar2 = (C1420b) ((d4.k) kVar.f9766V).f9766V;
                int length2 = bVar2.f16371V.length;
                for (int i8 = 0; i8 < length2; i8++) {
                    v2.e d8 = ((C1419a) bVar2.e(i8)).f15183b.h().d();
                    int length3 = ((C1628c) d8).f16371V.length;
                    for (int i9 = 0; i9 < length3; i9++) {
                        hashSet.add(d8.b(i9));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    fVar.f14887f.q((c) it.next());
                }
                this.f14880a0 = new k(qVar);
            } else {
                i++;
            }
        }
        e eVar = (e) qVar.f449U;
        eVar.getClass();
        HashSet hashSet2 = new HashSet(20);
        Iterator it2 = ((ArrayList) eVar.f2358Y).iterator();
        while (it2.hasNext()) {
            g gVar = (g) it2.next();
            if (gVar instanceof f) {
                hashSet2.add(((f) gVar).e);
            } else if (gVar instanceof o) {
                ((o) gVar).getClass();
                throw null;
            } else if (gVar instanceof p) {
                ((p) gVar).getClass();
            }
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            fVar.a((C1490a) it3.next());
        }
    }

    public final q b() {
        return q.TYPE_CODE_ITEM;
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.Cloneable, byte[], java.lang.Object] */
    public final void i(w wVar, int i) {
        boolean z;
        int H8;
        C1387f fVar = wVar.f14851b;
        C1160q qVar = new C1160q(14, (Object) fVar);
        B3.q qVar2 = this.f14879Z;
        Iterator it = ((ArrayList) ((e) qVar2.f449U).f2358Y).iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar instanceof f) {
                f fVar2 = (f) gVar;
                C1490a aVar = fVar2.e;
                int H9 = qVar.H(aVar);
                if (H9 >= 0) {
                    fVar2.o(H9);
                }
                if ((aVar instanceof u2.p) && (H8 = qVar.H(((u2.p) aVar).f15759U)) >= 0) {
                    fVar2.n(H8);
                }
            }
        }
        k kVar = this.f14880a0;
        int i8 = 0;
        if (kVar != null) {
            kVar.c();
            z zVar = fVar.f14887f;
            int length = ((d) kVar.f2582W).f16371V.length;
            kVar.f2584Y = new TreeMap();
            for (int i9 = 0; i9 < length; i9++) {
                ((TreeMap) kVar.f2584Y).put(((C1341c) ((d) kVar.f2582W).e(i9)).f14457W, (Object) null);
            }
            if (((TreeMap) kVar.f2584Y).size() <= 65535) {
                C1627b bVar = new C1627b();
                kVar.f2580U = bVar.m(((TreeMap) kVar.f2584Y).size());
                for (Map.Entry entry : ((TreeMap) kVar.f2584Y).entrySet()) {
                    C1340b bVar2 = (C1340b) entry.getKey();
                    Object[] objArr = bVar2.f16371V;
                    int length2 = objArr.length;
                    int length3 = objArr.length;
                    if (length3 == 0) {
                        z = false;
                    } else {
                        z = ((C1339a) bVar2.e(length3 - 1)).f14452U.equals(u.f15769X);
                    }
                    entry.setValue(Integer.valueOf(bVar.f16368c));
                    if (z) {
                        bVar.l(-(length2 - 1));
                        length2--;
                    } else {
                        bVar.l(length2);
                    }
                    for (int i10 = 0; i10 < length2; i10++) {
                        C1339a aVar2 = (C1339a) bVar2.e(i10);
                        bVar.m(zVar.m(aVar2.f14452U));
                        bVar.m(aVar2.f14453V);
                    }
                    if (z) {
                        bVar.m(((C1339a) bVar2.e(length2)).f14453V);
                    }
                }
                int i11 = bVar.f16368c;
                ? r32 = new byte[i11];
                System.arraycopy(bVar.f16367b, 0, r32, 0, i11);
                kVar.f2583X = r32;
                k kVar2 = this.f14880a0;
                kVar2.c();
                i8 = (((d) kVar2.f2582W).f16371V.length * 8) + ((byte[]) kVar2.f2583X).length;
            } else {
                throw new UnsupportedOperationException("too many catch handlers");
            }
        }
        qVar2.C();
        int h5 = ((h) qVar2.f452X).h();
        if ((h5 & 1) != 0) {
            h5++;
        }
        j((h5 * 2) + 16 + i8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(r2.C1387f r18, y2.C1627b r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r19.d()
            B3.q r3 = r1.f14879Z
            r3.C()
            java.lang.Object r4 = r3.f452X
            p2.h r4 = (p2.h) r4
            int r4 = r4.f14465W
            r3.C()
            java.lang.Object r5 = r3.f452X
            p2.h r5 = (p2.h) r5
            java.lang.Object[] r6 = r5.f16371V
            int r6 = r6.length
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0020:
            r10 = 1
            if (r8 >= r6) goto L_0x004e
            java.lang.Object r11 = r5.e(r8)
            p2.g r11 = (p2.g) r11
            boolean r12 = r11 instanceof p2.f
            if (r12 == 0) goto L_0x004b
            r12 = r11
            p2.f r12 = (p2.f) r12
            u2.a r12 = r12.e
            boolean r13 = r12 instanceof u2.q
            if (r13 == 0) goto L_0x0047
            u2.q r12 = (u2.q) r12
            p2.i r11 = r11.f14462b
            int r11 = r11.f14467b
            r13 = 113(0x71, float:1.58E-43)
            if (r11 != r13) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            int r10 = r12.f(r10)
            goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            if (r10 <= r9) goto L_0x004b
            r9 = r10
        L_0x004b:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x004e:
            u2.q r5 = r1.f14878Y
            boolean r6 = r1.f14881b0
            int r6 = r5.f(r6)
            r3.C()
            java.lang.Object r8 = r3.f452X
            p2.h r8 = (p2.h) r8
            int r8 = r8.h()
            r11 = r8 & 1
            if (r11 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            K1.k r11 = r1.f14880a0
            if (r11 != 0) goto L_0x006d
            r11 = 0
            goto L_0x0077
        L_0x006d:
            r11.c()
            java.lang.Object r11 = r11.f2582W
            p2.d r11 = (p2.d) r11
            java.lang.Object[] r11 = r11.f16371V
            int r11 = r11.length
        L_0x0077:
            r12 = 2
            if (r2 == 0) goto L_0x0133
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r17.g()
            r13.append(r14)
            r14 = 32
            r13.append(r14)
            java.lang.String r14 = r5.a()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r0.b(r7, r13)
            java.lang.String r13 = android.support.v4.media.session.b.P(r4)
            java.lang.String r14 = "  registers_size: "
            java.lang.String r13 = r14.concat(r13)
            r0.b(r12, r13)
            java.lang.String r13 = android.support.v4.media.session.b.P(r6)
            java.lang.String r14 = "  ins_size:       "
            java.lang.String r13 = r14.concat(r13)
            r0.b(r12, r13)
            java.lang.String r13 = android.support.v4.media.session.b.P(r9)
            java.lang.String r14 = "  outs_size:      "
            java.lang.String r13 = r14.concat(r13)
            r0.b(r12, r13)
            java.lang.String r13 = android.support.v4.media.session.b.P(r11)
            java.lang.String r14 = "  tries_size:     "
            java.lang.String r13 = r14.concat(r13)
            r0.b(r12, r13)
            java.lang.String r13 = android.support.v4.media.session.b.Q(r7)
            java.lang.String r14 = "  debug_off:      "
            java.lang.String r13 = r14.concat(r13)
            r14 = 4
            r0.b(r14, r13)
            java.lang.String r13 = android.support.v4.media.session.b.Q(r8)
            java.lang.String r15 = "  insns_size:     "
            java.lang.String r13 = r15.concat(r13)
            r0.b(r14, r13)
            v2.b r13 = r1.f14882c0
            java.lang.Object[] r14 = r13.f16371V
            int r14 = r14.length
            if (r14 == 0) goto L_0x0133
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "  throws "
            r14.<init>(r15)
            java.lang.Object[] r15 = r13.f16371V
            int r15 = r15.length
            if (r15 != 0) goto L_0x00fe
            java.lang.String r13 = "<empty>"
            goto L_0x0127
        L_0x00fe:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r7 = 100
            r12.<init>(r7)
            r7 = 0
        L_0x0106:
            if (r7 >= r15) goto L_0x0123
            r16 = r15
            if (r7 == 0) goto L_0x0111
            java.lang.String r15 = ", "
            r12.append(r15)
        L_0x0111:
            java.lang.Object r15 = r13.e(r7)
            v2.c r15 = (v2.c) r15
            java.lang.String r15 = r15.a()
            r12.append(r15)
            int r7 = r7 + 1
            r15 = r16
            goto L_0x0106
        L_0x0123:
            java.lang.String r13 = r12.toString()
        L_0x0127:
            r14.append(r13)
            java.lang.String r7 = r14.toString()
            r12 = 0
            r0.b(r12, r7)
            goto L_0x0134
        L_0x0133:
            r12 = 0
        L_0x0134:
            r0.k(r4)
            r0.k(r6)
            r0.k(r9)
            r0.k(r11)
            r0.j(r12)
            r0.j(r8)
            r3.C()
            java.lang.Object r3 = r3.f452X
            p2.h r3 = (p2.h) r3
            r3.i(r0)     // Catch:{ RuntimeException -> 0x02ab }
            K1.k r3 = r1.f14880a0
            if (r3 == 0) goto L_0x02aa
            if (r10 == 0) goto L_0x0162
            if (r2 == 0) goto L_0x015e
            java.lang.String r2 = "  padding: 0"
            r3 = 2
            r0.b(r3, r2)
        L_0x015e:
            r2 = 0
            r0.k(r2)
        L_0x0162:
            K1.k r2 = r1.f14880a0
            r2.c()
            boolean r3 = r19.d()
            java.lang.String r4 = ".."
            if (r3 == 0) goto L_0x0246
            r2.c()
            java.lang.Object r3 = r2.f2582W
            p2.d r3 = (p2.d) r3
            java.lang.Object[] r3 = r3.f16371V
            int r3 = r3.length
            java.lang.String r5 = "  tries:"
            r6 = 0
            r0.b(r6, r5)
            r12 = 0
        L_0x0180:
            java.lang.String r5 = "    "
            if (r12 >= r3) goto L_0x01d1
            java.lang.Object r6 = r2.f2582W
            p2.d r6 = (p2.d) r6
            java.lang.Object r6 = r6.e(r12)
            p2.c r6 = (p2.C1341c) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "    try "
            r7.<init>(r8)
            int r8 = r6.f14455U
            char r9 = (char) r8
            if (r8 != r9) goto L_0x019f
            java.lang.String r8 = android.support.v4.media.session.b.P(r8)
            goto L_0x01a3
        L_0x019f:
            java.lang.String r8 = android.support.v4.media.session.b.Q(r8)
        L_0x01a3:
            r7.append(r8)
            r7.append(r4)
            int r8 = r6.f14456V
            char r9 = (char) r8
            if (r8 != r9) goto L_0x01b3
            java.lang.String r8 = android.support.v4.media.session.b.P(r8)
            goto L_0x01b7
        L_0x01b3:
            java.lang.String r8 = android.support.v4.media.session.b.Q(r8)
        L_0x01b7:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            p2.b r6 = r6.f14457W
            java.lang.String r8 = ""
            java.lang.String r5 = r6.i(r5, r8)
            r6 = 6
            r0.b(r6, r7)
            r6 = 2
            r0.b(r6, r5)
            int r12 = r12 + 1
            goto L_0x0180
        L_0x01d1:
            java.lang.String r3 = "  handlers:"
            r12 = 0
            r0.b(r12, r3)
            int r3 = r2.f2580U
            java.lang.Object r6 = r2.f2584Y
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            int r6 = r6.size()
            java.lang.String r6 = android.support.v4.media.session.b.P(r6)
            java.lang.String r7 = "    size: "
            java.lang.String r6 = r7.concat(r6)
            r0.b(r3, r6)
            java.lang.Object r3 = r2.f2584Y
            java.util.TreeMap r3 = (java.util.TreeMap) r3
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r6 = 0
            r7 = 0
        L_0x01fc:
            boolean r8 = r3.hasNext()
            java.lang.String r9 = ": "
            if (r8 == 0) goto L_0x0230
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            p2.b r10 = (p2.C1340b) r10
            java.lang.Object r8 = r8.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r6 == 0) goto L_0x022d
            int r11 = r8 - r7
            java.lang.String r7 = android.support.v4.media.session.b.P(r7)
            java.lang.String r7 = r7.concat(r9)
            java.lang.String r6 = r6.i(r5, r7)
            r0.b(r11, r6)
        L_0x022d:
            r7 = r8
            r6 = r10
            goto L_0x01fc
        L_0x0230:
            java.lang.Cloneable r3 = r2.f2583X
            byte[] r3 = (byte[]) r3
            int r3 = r3.length
            int r3 = r3 - r7
            java.lang.String r7 = android.support.v4.media.session.b.P(r7)
            java.lang.String r7 = r7.concat(r9)
            java.lang.String r5 = r6.i(r5, r7)
            r0.b(r3, r5)
            goto L_0x0247
        L_0x0246:
            r12 = 0
        L_0x0247:
            java.lang.Object r3 = r2.f2582W
            p2.d r3 = (p2.d) r3
            java.lang.Object[] r3 = r3.f16371V
            int r3 = r3.length
            r7 = 0
        L_0x024f:
            if (r7 >= r3) goto L_0x02a3
            java.lang.Object r5 = r2.f2582W
            p2.d r5 = (p2.d) r5
            java.lang.Object r5 = r5.e(r7)
            p2.c r5 = (p2.C1341c) r5
            int r6 = r5.f14456V
            int r8 = r5.f14455U
            int r9 = r6 - r8
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r10) goto L_0x0281
            r0.j(r8)
            r0.k(r9)
            java.lang.Object r6 = r2.f2584Y
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            p2.b r5 = r5.f14457W
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.k(r5)
            int r7 = r7 + 1
            goto L_0x024f
        L_0x0281:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bogus exception range: "
            r2.<init>(r3)
            java.lang.String r3 = android.support.v4.media.session.b.Q(r8)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = android.support.v4.media.session.b.Q(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x02a3:
            java.lang.Cloneable r2 = r2.f2583X
            byte[] r2 = (byte[]) r2
            r0.h(r2)
        L_0x02aa:
            return
        L_0x02ab:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "...while writing instructions for "
            r0.<init>(r3)
            java.lang.String r3 = r5.a()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            m2.a r0 = m2.C1208a.a(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C1386e.k(r2.f, y2.b):void");
    }

    public final String toString() {
        return "CodeItem{" + this.f14878Y.a() + "}";
    }
}
