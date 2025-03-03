package V1;

import M0.C0129q;
import M0.I;
import P0.a;
import P0.q;
import P0.r;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: V1.f  reason: case insensitive filesystem */
public final class C0347f {

    /* renamed from: a  reason: collision with root package name */
    public List f5767a;

    /* renamed from: b  reason: collision with root package name */
    public int f5768b;

    public C0347f(int i, List list) {
        this.f5768b = i;
        this.f5767a = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return new V1.x(new V1.C0343b(r2, r7.l(), 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V1.H a(int r6, P0.q r7) {
        /*
            r5 = this;
            r0 = 2
            if (r6 == r0) goto L_0x0159
            r1 = 3
            java.lang.Object r2 = r7.f3728c
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L_0x014a
            r1 = 4
            if (r6 == r1) goto L_0x014a
            r3 = 21
            if (r6 == r3) goto L_0x013f
            r3 = 27
            r4 = 0
            if (r6 == r3) goto L_0x0119
            r1 = 36
            if (r6 == r1) goto L_0x0105
            r1 = 45
            if (r6 == r1) goto L_0x00fa
            r1 = 89
            if (r6 == r1) goto L_0x00eb
            r1 = 172(0xac, float:2.41E-43)
            if (r6 == r1) goto L_0x00db
            r1 = 257(0x101, float:3.6E-43)
            if (r6 == r1) goto L_0x00ce
            r1 = 138(0x8a, float:1.93E-43)
            if (r6 == r1) goto L_0x00bd
            r1 = 139(0x8b, float:1.95E-43)
            if (r6 == r1) goto L_0x00ac
            switch(r6) {
                case 15: goto L_0x0095;
                case 16: goto L_0x0081;
                case 17: goto L_0x006b;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r6) {
                case 128: goto L_0x0159;
                case 129: goto L_0x005b;
                case 130: goto L_0x0052;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r6) {
                case 134: goto L_0x003c;
                case 135: goto L_0x005b;
                case 136: goto L_0x00bd;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r4
        L_0x003c:
            r6 = 16
            boolean r6 = r5.c(r6)
            if (r6 == 0) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            V1.D r4 = new V1.D
            B.q0 r6 = new B.q0
            java.lang.String r7 = "application/x-scte35"
            r6.<init>((java.lang.String) r7)
            r4.<init>(r6)
        L_0x0051:
            return r4
        L_0x0052:
            r6 = 64
            boolean r6 = r5.c(r6)
            if (r6 != 0) goto L_0x00bd
            return r4
        L_0x005b:
            V1.x r6 = new V1.x
            V1.b r0 = new V1.b
            int r7 = r7.l()
            r1 = 0
            r0.<init>(r2, r7, r1)
            r6.<init>(r0)
            return r6
        L_0x006b:
            boolean r6 = r5.c(r0)
            if (r6 == 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            V1.x r4 = new V1.x
            V1.t r6 = new V1.t
            int r7 = r7.l()
            r6.<init>(r2, r7)
            r4.<init>(r6)
        L_0x0080:
            return r4
        L_0x0081:
            V1.x r6 = new V1.x
            V1.n r0 = new V1.n
            R2.c r1 = new R2.c
            java.util.List r7 = r5.b(r7)
            r1.<init>((java.util.List) r7)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        L_0x0095:
            boolean r6 = r5.c(r0)
            if (r6 == 0) goto L_0x009c
            goto L_0x00ab
        L_0x009c:
            V1.x r4 = new V1.x
            V1.e r6 = new V1.e
            int r7 = r7.l()
            r0 = 0
            r6.<init>(r0, r2, r7)
            r4.<init>(r6)
        L_0x00ab:
            return r4
        L_0x00ac:
            V1.x r6 = new V1.x
            V1.g r0 = new V1.g
            int r7 = r7.l()
            r1 = 5408(0x1520, float:7.578E-42)
            r0.<init>(r2, r7, r1)
            r6.<init>(r0)
            return r6
        L_0x00bd:
            V1.x r6 = new V1.x
            V1.g r0 = new V1.g
            int r7 = r7.l()
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r2, r7, r1)
            r6.<init>(r0)
            return r6
        L_0x00ce:
            V1.D r6 = new V1.D
            B.q0 r7 = new B.q0
            java.lang.String r0 = "application/vnd.dvb.ait"
            r7.<init>((java.lang.String) r0)
            r6.<init>(r7)
            return r6
        L_0x00db:
            V1.x r6 = new V1.x
            V1.b r0 = new V1.b
            int r7 = r7.l()
            r1 = 1
            r0.<init>(r2, r7, r1)
            r6.<init>(r0)
            return r6
        L_0x00eb:
            V1.x r6 = new V1.x
            V1.h r0 = new V1.h
            java.lang.Object r7 = r7.f3729d
            java.util.List r7 = (java.util.List) r7
            r0.<init>(r7)
            r6.<init>(r0)
            return r6
        L_0x00fa:
            V1.x r6 = new V1.x
            V1.v r7 = new V1.v
            r7.<init>()
            r6.<init>(r7)
            return r6
        L_0x0105:
            V1.x r6 = new V1.x
            V1.s r0 = new V1.s
            B.q0 r1 = new B.q0
            java.util.List r7 = r5.b(r7)
            r1.<init>((java.util.List) r7)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        L_0x0119:
            boolean r6 = r5.c(r1)
            if (r6 == 0) goto L_0x0120
            goto L_0x013e
        L_0x0120:
            V1.x r4 = new V1.x
            V1.q r6 = new V1.q
            B.q0 r0 = new B.q0
            java.util.List r7 = r5.b(r7)
            r0.<init>((java.util.List) r7)
            r7 = 1
            boolean r7 = r5.c(r7)
            r1 = 8
            boolean r1 = r5.c(r1)
            r6.<init>(r0, r7, r1)
            r4.<init>(r6)
        L_0x013e:
            return r4
        L_0x013f:
            V1.x r6 = new V1.x
            V1.h r7 = new V1.h
            r7.<init>()
            r6.<init>(r7)
            return r6
        L_0x014a:
            V1.x r6 = new V1.x
            V1.u r0 = new V1.u
            int r7 = r7.l()
            r0.<init>(r2, r7)
            r6.<init>(r0)
            return r6
        L_0x0159:
            V1.x r6 = new V1.x
            V1.k r0 = new V1.k
            R2.c r1 = new R2.c
            java.util.List r7 = r5.b(r7)
            r1.<init>((java.util.List) r7)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0347f.a(int, P0.q):V1.H");
    }

    public List b(q qVar) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z6;
        boolean c8 = c(32);
        List list2 = this.f5767a;
        if (c8) {
            return list2;
        }
        r rVar = new r((byte[]) qVar.e);
        while (rVar.a() > 0) {
            int v4 = rVar.v();
            int v8 = rVar.f3733b + rVar.v();
            if (v4 == 134) {
                ArrayList arrayList = new ArrayList();
                int v9 = rVar.v() & 31;
                for (int i8 = 0; i8 < v9; i8++) {
                    String t8 = rVar.t(3, StandardCharsets.UTF_8);
                    int v10 = rVar.v();
                    if ((v10 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = v10 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v11 = (byte) rVar.v();
                    rVar.I(1);
                    if (z) {
                        if ((v11 & 64) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        byte[] bArr = a.f3688a;
                        list = Collections.singletonList(z6 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C0129q qVar2 = new C0129q();
                    qVar2.f2999m = I.o(str);
                    qVar2.f2992d = t8;
                    qVar2.f2984G = i;
                    qVar2.f3002p = list;
                    arrayList.add(new M0.r(qVar2));
                }
                list2 = arrayList;
            }
            rVar.H(v8);
        }
        return list2;
    }

    public boolean c(int i) {
        if ((i & this.f5768b) != 0) {
            return true;
        }
        return false;
    }
}
