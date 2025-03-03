package Z0;

import B.C0002c;
import H3.C0103u;
import H3.M;
import H3.O;
import H3.P;
import H3.i0;
import M0.C0129q;
import M0.H;
import M0.I;
import M0.J;
import M0.r;
import P0.z;
import R0.A;
import T0.e0;
import U0.j;
import Y0.h;
import a1.e;
import a1.s;
import android.net.Uri;
import android.util.SparseArray;
import h1.C1047m;
import h1.C1048n;
import h1.C1058y;
import h1.C1059z;
import h1.f0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l1.p;

public final class k implements C1059z, s {

    /* renamed from: U  reason: collision with root package name */
    public final c f6833U;

    /* renamed from: V  reason: collision with root package name */
    public final e f6834V;

    /* renamed from: W  reason: collision with root package name */
    public final P f6835W;

    /* renamed from: X  reason: collision with root package name */
    public final A f6836X;

    /* renamed from: Y  reason: collision with root package name */
    public final h f6837Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Y0.e f6838Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1048n f6839a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Y0.e f6840b0;

    /* renamed from: c0  reason: collision with root package name */
    public final l1.e f6841c0;

    /* renamed from: d0  reason: collision with root package name */
    public final IdentityHashMap f6842d0;

    /* renamed from: e0  reason: collision with root package name */
    public final P f6843e0;

    /* renamed from: f0  reason: collision with root package name */
    public final C1048n f6844f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f6845g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f6846h0;

    /* renamed from: i0  reason: collision with root package name */
    public final j f6847i0;

    /* renamed from: j0  reason: collision with root package name */
    public final P f6848j0 = new P((Object) this);

    /* renamed from: k0  reason: collision with root package name */
    public C1058y f6849k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f6850l0;

    /* renamed from: m0  reason: collision with root package name */
    public f0 f6851m0;

    /* renamed from: n0  reason: collision with root package name */
    public q[] f6852n0;

    /* renamed from: o0  reason: collision with root package name */
    public q[] f6853o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public C1047m f6854q0;

    public k(c cVar, e eVar, P p3, A a8, h hVar, Y0.e eVar2, C1048n nVar, Y0.e eVar3, l1.e eVar4, C1048n nVar2, boolean z, int i, j jVar) {
        this.f6833U = cVar;
        this.f6834V = eVar;
        this.f6835W = p3;
        this.f6836X = a8;
        this.f6837Y = hVar;
        this.f6838Z = eVar2;
        this.f6839a0 = nVar;
        this.f6840b0 = eVar3;
        this.f6841c0 = eVar4;
        this.f6844f0 = nVar2;
        this.f6845g0 = z;
        this.f6846h0 = i;
        this.f6847i0 = jVar;
        nVar2.getClass();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        this.f6854q0 = new C1047m(i0Var, i0Var);
        this.f6842d0 = new IdentityHashMap();
        this.f6843e0 = new P(29);
        this.f6852n0 = new q[0];
        this.f6853o0 = new q[0];
    }

    public static r k(r rVar, r rVar2, boolean z) {
        O o2;
        String str;
        String str2;
        int i;
        int i8;
        int i9;
        H h5;
        String str3;
        int i10;
        M m8 = O.f2026V;
        O o8 = i0.f2073Y;
        int i11 = -1;
        if (rVar2 != null) {
            str3 = rVar2.f3033k;
            h5 = rVar2.f3034l;
            i9 = rVar2.f3014C;
            i8 = rVar2.e;
            i = rVar2.f3029f;
            str2 = rVar2.f3028d;
            str = rVar2.f3026b;
            o2 = rVar2.f3027c;
        } else {
            String u3 = z.u(1, rVar.f3033k);
            h5 = rVar.f3034l;
            if (z) {
                i9 = rVar.f3014C;
                i8 = rVar.e;
                i = rVar.f3029f;
                str2 = rVar.f3028d;
                str = rVar.f3026b;
                o8 = rVar.f3027c;
            } else {
                i8 = 0;
                str2 = null;
                str = null;
                i9 = -1;
                i = 0;
            }
            O o9 = o8;
            str3 = u3;
            o2 = o9;
        }
        String e = I.e(str3);
        if (z) {
            i10 = rVar.f3031h;
        } else {
            i10 = -1;
        }
        if (z) {
            i11 = rVar.i;
        }
        C0129q qVar = new C0129q();
        qVar.f2989a = rVar.f3025a;
        qVar.f2990b = str;
        qVar.f2991c = O.m(o2);
        qVar.f2998l = I.o(rVar.f3035m);
        qVar.f2999m = I.o(e);
        qVar.f2996j = str3;
        qVar.f2997k = h5;
        qVar.f2995h = i10;
        qVar.i = i11;
        qVar.f2979B = i9;
        qVar.e = i8;
        qVar.f2993f = i;
        qVar.f2992d = str2;
        return new r(qVar);
    }

    public final void a() {
        for (q qVar : this.f6852n0) {
            ArrayList arrayList = qVar.f6911h0;
            if (!arrayList.isEmpty()) {
                j jVar = (j) C0103u.l(arrayList);
                int b8 = qVar.f6901X.b(jVar);
                if (b8 == 1) {
                    jVar.f6811E0 = true;
                } else if (b8 == 0) {
                    qVar.f6915l0.post(new C0002c((Object) qVar, 28, (Object) jVar));
                } else if (b8 == 2 && !qVar.f6893N0) {
                    p pVar = qVar.f6907d0;
                    if (pVar.d()) {
                        pVar.b();
                    }
                }
            }
        }
        this.f6849k0.f0(this);
    }

    public final boolean b() {
        return this.f6854q0.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r4 != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0053 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r17, D2.j r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            Z0.q[] r2 = r0.f6852n0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a4
            r8 = r2[r6]
            Z0.i r9 = r8.f6901X
            android.net.Uri[] r10 = r9.e
            boolean r11 = P0.z.k(r10, r1)
            if (r11 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x009f
        L_0x001d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            k1.r r13 = r9.f6803q
            l1.i r13 = F.h.h(r13)
            h1.n r8 = r8.f6906c0
            r8.getClass()
            r8 = r18
            W1.e r13 = h1.C1048n.p(r13, r8)
            if (r13 == 0) goto L_0x0041
            int r14 = r13.f6147a
            r15 = 2
            if (r14 != r15) goto L_0x0041
            long r13 = r13.f6148b
            goto L_0x0042
        L_0x003f:
            r8 = r18
        L_0x0041:
            r13 = r11
        L_0x0042:
            r15 = 0
        L_0x0043:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L_0x0053
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            int r15 = r15 + 1
            goto L_0x0043
        L_0x0053:
            r15 = -1
        L_0x0054:
            if (r15 != r4) goto L_0x0059
        L_0x0056:
            r4 = 1
            r5 = 1
            goto L_0x0096
        L_0x0059:
            k1.r r5 = r9.f6803q
            int r5 = r5.u(r15)
            if (r5 != r4) goto L_0x0062
            goto L_0x0056
        L_0x0062:
            boolean r4 = r9.f6805s
            android.net.Uri r10 = r9.f6801o
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.f6805s = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0094
            k1.r r4 = r9.f6803q
            boolean r4 = r4.p(r5, r13)
            if (r4 == 0) goto L_0x0091
            a1.e r4 = r9.f6794g
            java.util.HashMap r4 = r4.f7046X
            java.lang.Object r4 = r4.get(r1)
            a1.d r4 = (a1.C0413d) r4
            if (r4 == 0) goto L_0x008c
            boolean r4 = a1.C0413d.a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L_0x008e
        L_0x008c:
            r5 = 1
            r4 = 0
        L_0x008e:
            if (r4 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0091:
            r5 = 1
        L_0x0092:
            r4 = 0
            goto L_0x0096
        L_0x0094:
            r5 = 1
        L_0x0095:
            r4 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x009e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x009e
            r4 = 1
            goto L_0x009f
        L_0x009e:
            r4 = 0
        L_0x009f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00a4:
            h1.y r1 = r0.f6849k0
            r1.f0(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.k.c(android.net.Uri, D2.j, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: Z0.m} */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0320, code lost:
        if (r14 == r0[0]) goto L_0x0343;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(k1.r[] r38, boolean[] r39, h1.Y[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r40
            r12 = r42
            r14 = 1
            int r3 = r1.length
            int[] r15 = new int[r3]
            int r3 = r1.length
            int[] r11 = new int[r3]
            r3 = 0
        L_0x0010:
            int r4 = r1.length
            java.util.IdentityHashMap r8 = r0.f6842d0
            r9 = -1
            if (r3 >= r4) goto L_0x004c
            r4 = r2[r3]
            if (r4 != 0) goto L_0x001c
            r4 = -1
            goto L_0x0026
        L_0x001c:
            java.lang.Object r4 = r8.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0026:
            r15[r3] = r4
            r11[r3] = r9
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004a
            M0.Y r4 = r4.l()
            r5 = 0
        L_0x0033:
            Z0.q[] r6 = r0.f6852n0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.a()
            h1.f0 r6 = r6.f6882C0
            int r6 = r6.b(r4)
            if (r6 == r9) goto L_0x0048
            r11[r3] = r5
            goto L_0x004a
        L_0x0048:
            int r5 = r5 + r14
            goto L_0x0033
        L_0x004a:
            int r3 = r3 + r14
            goto L_0x0010
        L_0x004c:
            r8.clear()
            int r6 = r1.length
            h1.Y[] r7 = new h1.Y[r6]
            int r4 = r1.length
            h1.Y[] r5 = new h1.Y[r4]
            int r3 = r1.length
            r16 = r8
            k1.r[] r8 = new k1.r[r3]
            Z0.q[] r10 = r0.f6852n0
            int r10 = r10.length
            Z0.q[] r10 = new Z0.q[r10]
            r9 = 0
            r19 = 0
            r20 = 0
        L_0x0064:
            Z0.q[] r14 = r0.f6852n0
            int r14 = r14.length
            if (r9 >= r14) goto L_0x0366
            r22 = r4
            r14 = 0
        L_0x006c:
            int r4 = r1.length
            r23 = r6
            if (r14 >= r4) goto L_0x008a
            r4 = r15[r14]
            if (r4 != r9) goto L_0x0078
            r4 = r2[r14]
            goto L_0x0079
        L_0x0078:
            r4 = 0
        L_0x0079:
            r5[r14] = r4
            r4 = r11[r14]
            if (r4 != r9) goto L_0x0082
            r6 = r1[r14]
            goto L_0x0083
        L_0x0082:
            r6 = 0
        L_0x0083:
            r8[r14] = r6
            r4 = 1
            int r14 = r14 + r4
            r6 = r23
            goto L_0x006c
        L_0x008a:
            Z0.q[] r4 = r0.f6852n0
            r14 = r4[r9]
            r14.a()
            int r4 = r14.f6927y0
            r6 = 0
        L_0x0094:
            if (r6 >= r3) goto L_0x0100
            r25 = r5[r6]
            r26 = r7
            r7 = r25
            Z0.m r7 = (Z0.m) r7
            if (r7 == 0) goto L_0x00ee
            r25 = r8[r6]
            if (r25 == 0) goto L_0x00a8
            boolean r25 = r39[r6]
            if (r25 != 0) goto L_0x00ab
        L_0x00a8:
            r25 = r9
            goto L_0x00b4
        L_0x00ab:
            r25 = r9
            r27 = r10
            r28 = r11
            r7 = 1
            r9 = -1
            goto L_0x00f6
        L_0x00b4:
            int r9 = r14.f6927y0
            r21 = 1
            int r9 = r9 + -1
            r14.f6927y0 = r9
            int r9 = r7.f6868W
            r27 = r10
            r10 = -1
            if (r9 == r10) goto L_0x00e6
            Z0.q r9 = r7.f6867V
            r9.a()
            int[] r10 = r9.f6884E0
            r10.getClass()
            int[] r10 = r9.f6884E0
            r28 = r11
            int r11 = r7.f6866U
            r10 = r10[r11]
            boolean[] r11 = r9.f6887H0
            boolean r11 = r11[r10]
            P0.l.j(r11)
            boolean[] r9 = r9.f6887H0
            r11 = 0
            r9[r10] = r11
            r9 = -1
            r7.f6868W = r9
        L_0x00e4:
            r7 = 0
            goto L_0x00ea
        L_0x00e6:
            r28 = r11
            r9 = -1
            goto L_0x00e4
        L_0x00ea:
            r5[r6] = r7
        L_0x00ec:
            r7 = 1
            goto L_0x00f6
        L_0x00ee:
            r25 = r9
            r27 = r10
            r28 = r11
            r9 = -1
            goto L_0x00ec
        L_0x00f6:
            int r6 = r6 + r7
            r9 = r25
            r7 = r26
            r10 = r27
            r11 = r28
            goto L_0x0094
        L_0x0100:
            r26 = r7
            r25 = r9
            r27 = r10
            r28 = r11
            r9 = -1
            if (r20 != 0) goto L_0x011b
            boolean r6 = r14.f6892M0
            if (r6 == 0) goto L_0x0112
            if (r4 != 0) goto L_0x0119
            goto L_0x011b
        L_0x0112:
            long r6 = r14.f6889J0
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            r4 = 0
            goto L_0x011c
        L_0x011b:
            r4 = 1
        L_0x011c:
            Z0.i r11 = r14.f6901X
            k1.r r6 = r11.f6803q
            r18 = r4
            r10 = r6
            r4 = 0
        L_0x0124:
            a1.e r7 = r11.f6794g
            android.net.Uri[] r9 = r11.e
            if (r4 >= r3) goto L_0x019c
            r30 = r3
            r3 = r8[r4]
            if (r3 != 0) goto L_0x0134
            r31 = r8
        L_0x0132:
            r7 = 1
            goto L_0x0193
        L_0x0134:
            r31 = r8
            h1.f0 r8 = r14.f6882C0
            M0.Y r2 = r3.l()
            int r2 = r8.b(r2)
            int r8 = r14.f6885F0
            if (r2 != r8) goto L_0x015c
            k1.r r8 = r11.f6803q
            int r8 = r8.k()
            r8 = r9[r8]
            java.util.HashMap r7 = r7.f7046X
            java.lang.Object r7 = r7.get(r8)
            a1.d r7 = (a1.C0413d) r7
            if (r7 == 0) goto L_0x0159
            r8 = 0
            r7.f7040e0 = r8
        L_0x0159:
            r11.f6803q = r3
            r10 = r3
        L_0x015c:
            r3 = r5[r4]
            if (r3 != 0) goto L_0x0132
            int r3 = r14.f6927y0
            r7 = 1
            int r3 = r3 + r7
            r14.f6927y0 = r3
            Z0.m r3 = new Z0.m
            r3.<init>(r14, r2)
            r5[r4] = r3
            r41[r4] = r7
            int[] r8 = r14.f6884E0
            if (r8 == 0) goto L_0x0193
            r3.b()
            if (r18 != 0) goto L_0x0193
            Z0.p[] r3 = r14.p0
            int[] r8 = r14.f6884E0
            r2 = r8[r2]
            r2 = r3[r2]
            int r3 = r2.r()
            if (r3 == 0) goto L_0x018f
            boolean r2 = r2.G(r12, r7)
            if (r2 != 0) goto L_0x018f
            r21 = 1
            goto L_0x0191
        L_0x018f:
            r21 = 0
        L_0x0191:
            r18 = r21
        L_0x0193:
            int r4 = r4 + r7
            r2 = r40
            r3 = r30
            r8 = r31
            r9 = -1
            goto L_0x0124
        L_0x019c:
            r30 = r3
            r31 = r8
            int r2 = r14.f6927y0
            java.util.ArrayList r3 = r14.f6911h0
            if (r2 != 0) goto L_0x0202
            k1.r r2 = r11.f6803q
            int r2 = r2.k()
            r2 = r9[r2]
            java.util.HashMap r4 = r7.f7046X
            java.lang.Object r2 = r4.get(r2)
            a1.d r2 = (a1.C0413d) r2
            r8 = 0
            if (r2 == 0) goto L_0x01bb
            r2.f7040e0 = r8
        L_0x01bb:
            r2 = 0
            r11.f6800n = r2
            r14.f6880A0 = r2
            r2 = 1
            r14.f6891L0 = r2
            r3.clear()
            l1.p r2 = r14.f6907d0
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x01e4
            boolean r3 = r14.f6925w0
            if (r3 == 0) goto L_0x01e0
            Z0.p[] r3 = r14.p0
            int r4 = r3.length
            r6 = 0
        L_0x01d6:
            if (r6 >= r4) goto L_0x01e0
            r7 = r3[r6]
            r7.j()
            r7 = 1
            int r6 = r6 + r7
            goto L_0x01d6
        L_0x01e0:
            r2.b()
            goto L_0x01e7
        L_0x01e4:
            r14.G()
        L_0x01e7:
            r0 = r11
            r29 = r16
            r3 = r22
            r35 = r23
            r36 = r27
            r27 = r28
            r24 = r30
            r22 = r5
            r23 = r15
            r15 = r25
            r28 = r26
            r26 = r31
            r25 = -1
            goto L_0x02bb
        L_0x0202:
            r8 = 0
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x028b
            int r2 = P0.z.f3748a
            boolean r2 = j$.util.Objects.equals(r10, r6)
            if (r2 != 0) goto L_0x028b
            boolean r2 = r14.f6892M0
            if (r2 != 0) goto L_0x026b
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x021c
            long r2 = -r12
        L_0x021c:
            r6 = r2
            Z0.j r2 = r14.z()
            i1.k[] r17 = r11.a(r2, r12)
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r9 = r14.f6912i0
            r24 = r30
            r3 = r10
            r34 = r22
            r22 = r5
            r4 = r42
            r35 = r23
            r0 = r26
            r30 = r9
            r23 = r15
            r29 = r16
            r15 = r25
            r26 = r31
            r16 = 0
            r25 = -1
            r8 = r32
            r16 = r10
            r36 = r27
            r10 = r30
            r27 = r28
            r28 = r0
            r0 = r11
            r11 = r17
            r3.b(r4, r6, r8, r10, r11)
            M0.r r2 = r2.f12662X
            M0.Y r3 = r0.f6795h
            int r2 = r3.b(r2)
            int r3 = r16.k()
            if (r3 == r2) goto L_0x0269
        L_0x0267:
            r2 = 1
            goto L_0x0285
        L_0x0269:
            r2 = 1
            goto L_0x02a5
        L_0x026b:
            r0 = r11
            r29 = r16
            r34 = r22
            r35 = r23
            r36 = r27
            r27 = r28
            r24 = r30
            r22 = r5
            r23 = r15
            r15 = r25
            r28 = r26
            r26 = r31
            r25 = -1
            goto L_0x0267
        L_0x0285:
            r14.f6891L0 = r2
            r3 = 1
            r18 = 1
            goto L_0x02a7
        L_0x028b:
            r0 = r11
            r29 = r16
            r34 = r22
            r35 = r23
            r36 = r27
            r27 = r28
            r24 = r30
            r2 = 1
            r22 = r5
            r23 = r15
            r15 = r25
            r28 = r26
            r26 = r31
            r25 = -1
        L_0x02a5:
            r3 = r20
        L_0x02a7:
            if (r18 == 0) goto L_0x02b9
            r14.H(r12, r3)
            r3 = r34
            r10 = 0
        L_0x02af:
            if (r10 >= r3) goto L_0x02bb
            r4 = r22[r10]
            if (r4 == 0) goto L_0x02b7
            r41[r10] = r2
        L_0x02b7:
            int r10 = r10 + r2
            goto L_0x02af
        L_0x02b9:
            r3 = r34
        L_0x02bb:
            java.util.ArrayList r2 = r14.f6916m0
            r2.clear()
            r10 = 0
        L_0x02c1:
            if (r10 >= r3) goto L_0x02cf
            r4 = r22[r10]
            if (r4 == 0) goto L_0x02cc
            Z0.m r4 = (Z0.m) r4
            r2.add(r4)
        L_0x02cc:
            r4 = 1
            int r10 = r10 + r4
            goto L_0x02c1
        L_0x02cf:
            r4 = 1
            r14.f6892M0 = r4
            r2 = 0
            r10 = 0
        L_0x02d4:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0301
            r4 = r22[r10]
            r5 = r27[r10]
            if (r5 != r15) goto L_0x02ee
            r4.getClass()
            r28[r10] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r5 = r29
            r5.put(r4, r2)
            r2 = 1
        L_0x02ec:
            r4 = 1
            goto L_0x02fd
        L_0x02ee:
            r5 = r29
            r6 = r23[r10]
            if (r6 != r15) goto L_0x02ec
            if (r4 != 0) goto L_0x02f8
            r4 = 1
            goto L_0x02f9
        L_0x02f8:
            r4 = 0
        L_0x02f9:
            P0.l.j(r4)
            goto L_0x02ec
        L_0x02fd:
            int r10 = r10 + r4
            r29 = r5
            goto L_0x02d4
        L_0x0301:
            r5 = r29
            r4 = 1
            if (r2 == 0) goto L_0x0345
            r6 = r19
            r2 = r36
            r2[r6] = r14
            int r19 = r6 + 1
            if (r6 != 0) goto L_0x0335
            r0.f6798l = r4
            if (r18 != 0) goto L_0x0323
            r4 = r37
            r7 = r28
            Z0.q[] r0 = r4.f6853o0
            int r6 = r0.length
            r8 = 0
            if (r6 == 0) goto L_0x0328
            r0 = r0[r8]
            if (r14 == r0) goto L_0x0343
            goto L_0x0328
        L_0x0323:
            r8 = 0
            r4 = r37
            r7 = r28
        L_0x0328:
            H3.P r0 = r4.f6843e0
            java.lang.Object r0 = r0.f2027U
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r0 = 1
            r20 = 1
            goto L_0x034f
        L_0x0335:
            r8 = 0
            r4 = r37
            r7 = r28
            int r6 = r4.p0
            if (r15 >= r6) goto L_0x0340
            r10 = 1
            goto L_0x0341
        L_0x0340:
            r10 = 0
        L_0x0341:
            r0.f6798l = r10
        L_0x0343:
            r0 = 1
            goto L_0x034f
        L_0x0345:
            r4 = r37
            r6 = r19
            r7 = r28
            r2 = r36
            r8 = 0
            goto L_0x0343
        L_0x034f:
            int r9 = r15 + 1
            r10 = r2
            r0 = r4
            r16 = r5
            r5 = r22
            r15 = r23
            r8 = r26
            r11 = r27
            r6 = r35
            r2 = r40
            r4 = r3
            r3 = r24
            goto L_0x0064
        L_0x0366:
            r4 = r0
            r9 = r2
            r2 = r10
            r8 = 0
            r10 = r6
            r6 = r19
            java.lang.System.arraycopy(r7, r8, r9, r8, r10)
            java.lang.Object[] r0 = P0.z.Q(r6, r2)
            Z0.q[] r0 = (Z0.q[]) r0
            r4.f6853o0 = r0
            H3.i0 r0 = H3.O.n(r0)
            U0.c r1 = new U0.c
            r2 = 8
            r1.<init>(r2)
            java.util.AbstractList r1 = H3.C0103u.z(r0, r1)
            h1.n r2 = r4.f6844f0
            r2.getClass()
            h1.m r2 = new h1.m
            r2.<init>(r0, r1)
            r4.f6854q0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.k.d(k1.r[], boolean[], h1.Y[], boolean[], long):long");
    }

    public final long e() {
        return this.f6854q0.e();
    }

    public final long f() {
        return -9223372036854775807L;
    }

    public final q g(String str, int i, Uri[] uriArr, r[] rVarArr, r rVar, List list, Map map, long j7) {
        Uri[] uriArr2 = uriArr;
        r[] rVarArr2 = rVarArr;
        i iVar = new i(this.f6833U, this.f6834V, uriArr2, rVarArr2, this.f6835W, this.f6836X, this.f6843e0, list, this.f6847i0);
        Y0.e eVar = this.f6840b0;
        P p3 = this.f6848j0;
        Y0.e eVar2 = this.f6838Z;
        C1048n nVar = this.f6839a0;
        return new q(str, i, p3, iVar, map, this.f6841c0, j7, rVar, this.f6837Y, eVar2, nVar, eVar, this.f6846h0);
    }

    public final boolean h(T0.I i) {
        if (this.f6851m0 != null) {
            return this.f6854q0.h(i);
        }
        for (q qVar : this.f6852n0) {
            if (!qVar.f6926x0) {
                T0.H h5 = new T0.H();
                h5.f4672a = qVar.f6889J0;
                qVar.h(new T0.I(h5));
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r2[r7] != 1) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(h1.C1058y r27, long r28) {
        /*
            r26 = this;
            r10 = r26
            r11 = 0
            r0 = r27
            r10.f6849k0 = r0
            a1.e r0 = r10.f6834V
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.f7047Y
            r1.add(r10)
            a1.n r13 = r0.f7052d0
            r13.getClass()
            java.util.Map r14 = java.util.Collections.emptyMap()
            java.util.List r0 = r13.e
            boolean r1 = r0.isEmpty()
            r10.f6850l0 = r11
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            Z0.c r9 = r10.f6833U
            boolean r7 = r10.f6845g0
            java.util.List r6 = r13.f7106f
            if (r1 != 0) goto L_0x0244
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x003d:
            int r11 = r0.size()
            if (r3 >= r11) goto L_0x0071
            java.lang.Object r11 = r0.get(r3)
            a1.m r11 = (a1.m) r11
            M0.r r11 = r11.f7100b
            int r12 = r11.f3044v
            if (r12 > 0) goto L_0x006a
            java.lang.String r11 = r11.f3033k
            r12 = 2
            java.lang.String r16 = P0.z.u(r12, r11)
            if (r16 == 0) goto L_0x005b
            r11 = 2
            r12 = 1
            goto L_0x006c
        L_0x005b:
            r12 = 1
            java.lang.String r11 = P0.z.u(r12, r11)
            if (r11 == 0) goto L_0x0066
            r2[r3] = r12
            int r5 = r5 + r12
            goto L_0x006f
        L_0x0066:
            r11 = -1
            r2[r3] = r11
            goto L_0x006f
        L_0x006a:
            r12 = 1
            r11 = 2
        L_0x006c:
            r2[r3] = r11
            int r4 = r4 + r12
        L_0x006f:
            int r3 = r3 + r12
            goto L_0x003d
        L_0x0071:
            if (r4 <= 0) goto L_0x0077
            r11 = r4
            r1 = 1
        L_0x0075:
            r3 = 0
            goto L_0x0081
        L_0x0077:
            if (r5 >= r1) goto L_0x007e
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x0081
        L_0x007e:
            r11 = r1
            r1 = 0
            goto L_0x0075
        L_0x0081:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            M0.r[] r12 = new M0.r[r11]
            int[] r5 = new int[r11]
            r16 = r7
            r18 = r8
            r7 = 0
            r17 = 0
        L_0x008e:
            int r8 = r0.size()
            if (r7 >= r8) goto L_0x00c6
            if (r1 == 0) goto L_0x00a0
            r8 = r2[r7]
            r19 = r9
            r9 = 2
            if (r8 != r9) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            r9 = 1
            goto L_0x00aa
        L_0x00a0:
            r19 = r9
        L_0x00a2:
            if (r3 == 0) goto L_0x00ac
            r8 = r2[r7]
            r9 = 1
            if (r8 == r9) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r8 = 1
            goto L_0x00c2
        L_0x00ac:
            r9 = 1
        L_0x00ad:
            java.lang.Object r8 = r0.get(r7)
            a1.m r8 = (a1.m) r8
            android.net.Uri r9 = r8.f7099a
            r4[r17] = r9
            M0.r r8 = r8.f7100b
            r12[r17] = r8
            r8 = 1
            int r9 = r17 + 1
            r5[r17] = r7
            r17 = r9
        L_0x00c2:
            int r7 = r7 + r8
            r9 = r19
            goto L_0x008e
        L_0x00c6:
            r19 = r9
            r7 = 0
            r8 = 1
            r0 = r12[r7]
            java.lang.String r0 = r0.f3033k
            r2 = 2
            int r9 = P0.z.t(r2, r0)
            int r7 = P0.z.t(r8, r0)
            if (r7 == r8) goto L_0x00e1
            if (r7 != 0) goto L_0x00ea
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00ea
        L_0x00e1:
            if (r9 > r8) goto L_0x00ea
            int r0 = r7 + r9
            if (r0 <= 0) goto L_0x00ea
            r17 = 1
            goto L_0x00ec
        L_0x00ea:
            r17 = 0
        L_0x00ec:
            if (r1 != 0) goto L_0x00f2
            if (r7 <= 0) goto L_0x00f2
            r2 = 1
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            java.lang.String r8 = "main"
            M0.r r3 = r13.f7108h
            java.util.List r1 = r13.i
            r0 = r26
            r20 = r1
            r1 = r8
            r21 = r3
            r3 = r4
            r4 = r12
            r10 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r20 = r7
            r7 = r14
            r24 = r8
            r22 = r14
            r14 = r18
            r23 = r19
            r18 = r9
            r8 = r28
            Z0.q r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r16 == 0) goto L_0x0241
            if (r17 == 0) goto L_0x0241
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            M0.r r2 = r13.f7108h
            if (r18 <= 0) goto L_0x01eb
            M0.r[] r3 = new M0.r[r11]
            r4 = 0
        L_0x0132:
            if (r4 >= r11) goto L_0x0190
            r5 = r12[r4]
            java.lang.String r6 = r5.f3033k
            r7 = 2
            java.lang.String r6 = P0.z.u(r7, r6)
            java.lang.String r8 = M0.I.e(r6)
            M0.q r9 = new M0.q
            r9.<init>()
            java.lang.String r10 = r5.f3025a
            r9.f2989a = r10
            java.lang.String r10 = r5.f3026b
            r9.f2990b = r10
            H3.O r10 = r5.f3027c
            H3.O r10 = H3.O.m(r10)
            r9.f2991c = r10
            java.lang.String r10 = r5.f3035m
            java.lang.String r10 = M0.I.o(r10)
            r9.f2998l = r10
            java.lang.String r8 = M0.I.o(r8)
            r9.f2999m = r8
            r9.f2996j = r6
            M0.H r6 = r5.f3034l
            r9.f2997k = r6
            int r6 = r5.f3031h
            r9.f2995h = r6
            int r6 = r5.i
            r9.i = r6
            int r6 = r5.f3043u
            r9.f3006t = r6
            int r6 = r5.f3044v
            r9.f3007u = r6
            float r6 = r5.f3045w
            r9.f3008v = r6
            int r6 = r5.e
            r9.e = r6
            int r5 = r5.f3029f
            r9.f2993f = r5
            M0.r r5 = new M0.r
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x0132
        L_0x0190:
            M0.Y r4 = new M0.Y
            r5 = r24
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r20 <= 0) goto L_0x01ba
            if (r2 != 0) goto L_0x01a4
            boolean r3 = r21.isEmpty()
            if (r3 == 0) goto L_0x01ba
        L_0x01a4:
            M0.Y r3 = new M0.Y
            r4 = 0
            r5 = r12[r4]
            M0.r r2 = k(r5, r2, r4)
            r5 = 1
            M0.r[] r6 = new M0.r[r5]
            r6[r4] = r2
            java.lang.String r2 = "main:audio"
            r3.<init>(r2, r6)
            r1.add(r3)
        L_0x01ba:
            java.util.List r2 = r13.i
            if (r2 == 0) goto L_0x01e7
            r3 = 0
        L_0x01bf:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x01e7
            java.lang.String r4 = "main:cc:"
            java.lang.String r4 = Q0.g.m(r3, r4)
            M0.Y r5 = new M0.Y
            java.lang.Object r6 = r2.get(r3)
            M0.r r6 = (M0.r) r6
            r10 = r23
            M0.r r6 = r10.b(r6)
            r7 = 1
            M0.r[] r8 = new M0.r[r7]
            r9 = 0
            r8[r9] = r6
            r5.<init>(r4, r8)
            r1.add(r5)
            int r3 = r3 + r7
            goto L_0x01bf
        L_0x01e7:
            r10 = r23
            r7 = 1
            goto L_0x0207
        L_0x01eb:
            r10 = r23
            r5 = r24
            r7 = 1
            M0.r[] r3 = new M0.r[r11]
            r4 = 0
        L_0x01f3:
            if (r4 >= r11) goto L_0x01ff
            r6 = r12[r4]
            M0.r r6 = k(r6, r2, r7)
            r3[r4] = r6
            int r4 = r4 + r7
            goto L_0x01f3
        L_0x01ff:
            M0.Y r2 = new M0.Y
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x0207:
            M0.Y r2 = new M0.Y
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.String r4 = "ID3"
            r3.f2989a = r4
            java.lang.String r4 = "application/id3"
            java.lang.String r4 = M0.I.o(r4)
            r3.f2999m = r4
            M0.r r4 = new M0.r
            r4.<init>(r3)
            r3 = 1
            M0.r[] r5 = new M0.r[r3]
            r3 = 0
            r5[r3] = r4
            java.lang.String r4 = "main:id3"
            r2.<init>(r4, r5)
            r1.add(r2)
            M0.Y[] r4 = new M0.Y[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            M0.Y[] r3 = (M0.Y[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.F(r3, r1)
            goto L_0x024c
        L_0x0241:
            r10 = r23
            goto L_0x024c
        L_0x0244:
            r21 = r6
            r16 = r7
            r10 = r9
            r22 = r14
            r14 = r8
        L_0x024c:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r21.size()
            r11.<init>(r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r21.size()
            r12.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r21.size()
            r8.<init>(r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r7 = 0
        L_0x026d:
            int r0 = r21.size()
            if (r7 >= r0) goto L_0x0348
            r6 = r21
            java.lang.Object r0 = r6.get(r7)
            a1.l r0 = (a1.l) r0
            java.lang.String r0 = r0.f7098c
            boolean r1 = r9.add(r0)
            if (r1 != 0) goto L_0x028e
            r19 = r6
            r18 = r7
            r20 = r8
            r21 = r9
        L_0x028b:
            r2 = 1
            goto L_0x033e
        L_0x028e:
            r11.clear()
            r12.clear()
            r8.clear()
            r1 = 0
            r17 = 1
        L_0x029a:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x02db
            java.lang.Object r2 = r6.get(r1)
            a1.l r2 = (a1.l) r2
            java.lang.String r2 = r2.f7098c
            int r3 = P0.z.f3748a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x02d8
            java.lang.Object r2 = r6.get(r1)
            a1.l r2 = (a1.l) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.add(r3)
            android.net.Uri r3 = r2.f7096a
            r11.add(r3)
            M0.r r2 = r2.f7097b
            r12.add(r2)
            java.lang.String r2 = r2.f3033k
            r3 = 1
            int r2 = P0.z.t(r3, r2)
            if (r2 != r3) goto L_0x02d2
            r2 = 1
            goto L_0x02d3
        L_0x02d2:
            r2 = 0
        L_0x02d3:
            r2 = r17 & r2
            r17 = r2
            goto L_0x02d9
        L_0x02d8:
            r3 = 1
        L_0x02d9:
            int r1 = r1 + r3
            goto L_0x029a
        L_0x02db:
            java.lang.String r1 = "audio:"
            java.lang.String r5 = r1.concat(r0)
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = P0.z.f3748a
            java.lang.Object[] r1 = r11.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            M0.r[] r1 = new M0.r[r0]
            java.lang.Object[] r0 = r12.toArray(r1)
            r4 = r0
            M0.r[] r4 = (M0.r[]) r4
            java.util.List r18 = java.util.Collections.emptyList()
            r2 = 1
            r19 = 0
            r0 = r26
            r1 = r5
            r25 = r5
            r5 = r19
            r19 = r6
            r6 = r18
            r18 = r7
            r7 = r22
            r20 = r8
            r21 = r9
            r8 = r28
            Z0.q r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = E.e.y(r20)
            r14.add(r1)
            r15.add(r0)
            if (r16 == 0) goto L_0x028b
            if (r17 == 0) goto L_0x028b
            r1 = 0
            M0.r[] r2 = new M0.r[r1]
            java.lang.Object[] r2 = r12.toArray(r2)
            M0.r[] r2 = (M0.r[]) r2
            M0.Y r3 = new M0.Y
            r4 = r25
            r3.<init>(r4, r2)
            r2 = 1
            M0.Y[] r4 = new M0.Y[r2]
            r4[r1] = r3
            int[] r3 = new int[r1]
            r0.F(r4, r3)
        L_0x033e:
            int r7 = r18 + 1
            r8 = r20
            r9 = r21
            r21 = r19
            goto L_0x026d
        L_0x0348:
            int r0 = r15.size()
            r11 = r26
            r11.p0 = r0
            r12 = 0
        L_0x0351:
            java.util.List r0 = r13.f7107g
            int r1 = r0.size()
            if (r12 >= r1) goto L_0x03bd
            java.lang.Object r0 = r0.get(r12)
            a1.l r0 = (a1.l) r0
            java.lang.String r1 = "subtitle:"
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = Q0.g.p(r12, r1, r2)
            java.lang.String r2 = r0.f7098c
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            android.net.Uri r1 = r0.f7096a
            r2 = 1
            android.net.Uri[] r3 = new android.net.Uri[r2]
            r4 = 0
            r3[r4] = r1
            M0.r r9 = r0.f7097b
            M0.r[] r5 = new M0.r[r2]
            r5[r4] = r9
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r7 = 0
            r0 = r26
            r1 = r8
            r4 = r5
            r5 = r7
            r7 = r22
            r11 = r9
            r16 = r13
            r13 = r8
            r8 = r28
            Z0.q r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r12}
            r14.add(r1)
            r15.add(r0)
            M0.Y r1 = new M0.Y
            M0.r r2 = r10.b(r11)
            r3 = 1
            M0.r[] r4 = new M0.r[r3]
            r7 = 0
            r4[r7] = r2
            r1.<init>(r13, r4)
            M0.Y[] r2 = new M0.Y[r3]
            r2[r7] = r1
            int[] r1 = new int[r7]
            r0.F(r2, r1)
            int r12 = r12 + r3
            r11 = r26
            r13 = r16
            goto L_0x0351
        L_0x03bd:
            r7 = 0
            Z0.q[] r0 = new Z0.q[r7]
            java.lang.Object[] r0 = r15.toArray(r0)
            Z0.q[] r0 = (Z0.q[]) r0
            r1 = r26
            r1.f6852n0 = r0
            int[][] r0 = new int[r7][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            Z0.q[] r0 = r1.f6852n0
            int r0 = r0.length
            r1.f6850l0 = r0
            r0 = 0
        L_0x03d8:
            int r2 = r1.p0
            if (r0 >= r2) goto L_0x03e7
            Z0.q[] r2 = r1.f6852n0
            r2 = r2[r0]
            Z0.i r2 = r2.f6901X
            r3 = 1
            r2.f6798l = r3
            int r0 = r0 + r3
            goto L_0x03d8
        L_0x03e7:
            Z0.q[] r0 = r1.f6852n0
            int r2 = r0.length
            r11 = 0
        L_0x03eb:
            if (r11 >= r2) goto L_0x0407
            r3 = r0[r11]
            boolean r4 = r3.f6926x0
            if (r4 != 0) goto L_0x0404
            T0.H r4 = new T0.H
            r4.<init>()
            long r5 = r3.f6889J0
            r4.f4672a = r5
            T0.I r5 = new T0.I
            r5.<init>(r4)
            r3.h(r5)
        L_0x0404:
            r3 = 1
            int r11 = r11 + r3
            goto L_0x03eb
        L_0x0407:
            Z0.q[] r0 = r1.f6852n0
            r1.f6853o0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.k.i(h1.y, long):void");
    }

    public final f0 j() {
        f0 f0Var = this.f6851m0;
        f0Var.getClass();
        return f0Var;
    }

    public final long m(long j7, e0 e0Var) {
        a1.k kVar;
        long j8;
        q[] qVarArr = this.f6853o0;
        int length = qVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            q qVar = qVarArr[i];
            if (qVar.f6923u0 == 2) {
                i iVar = qVar.f6901X;
                int o2 = iVar.f6803q.o();
                Uri[] uriArr = iVar.e;
                int length2 = uriArr.length;
                e eVar = iVar.f6794g;
                if (o2 >= length2 || o2 == -1) {
                    kVar = null;
                } else {
                    kVar = eVar.a(true, uriArr[iVar.f6803q.k()]);
                }
                if (kVar != null) {
                    O o8 = kVar.f7091r;
                    if (!o8.isEmpty() && kVar.f7113c) {
                        long j9 = kVar.f7082h - eVar.f7056h0;
                        long j10 = j7 - j9;
                        int c8 = z.c(o8, Long.valueOf(j10), true);
                        long j11 = ((a1.h) o8.get(c8)).f7068Y;
                        if (c8 != o8.size() - 1) {
                            j8 = ((a1.h) o8.get(c8 + 1)).f7068Y;
                        } else {
                            j8 = j11;
                        }
                        return e0Var.a(j10, j11, j8) + j9;
                    }
                }
            } else {
                i++;
            }
        }
        return j7;
    }

    public final long n() {
        return this.f6854q0.n();
    }

    public final void r() {
        q[] qVarArr = this.f6852n0;
        int length = qVarArr.length;
        int i = 0;
        while (i < length) {
            q qVar = qVarArr[i];
            qVar.E();
            if (!qVar.f6893N0 || qVar.f6926x0) {
                i++;
            } else {
                throw J.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final long s(long j7) {
        q[] qVarArr = this.f6853o0;
        if (qVarArr.length > 0) {
            boolean H8 = qVarArr[0].H(j7, false);
            int i = 1;
            while (true) {
                q[] qVarArr2 = this.f6853o0;
                if (i >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i].H(j7, H8);
                i++;
            }
            if (H8) {
                ((SparseArray) this.f6843e0.f2027U).clear();
            }
        }
        return j7;
    }

    public final void t(long j7) {
        for (q qVar : this.f6853o0) {
            if (qVar.f6925w0 && !qVar.C()) {
                int length = qVar.p0.length;
                for (int i = 0; i < length; i++) {
                    qVar.p0[i].i(j7, qVar.f6887H0[i]);
                }
            }
        }
    }

    public final void u(long j7) {
        this.f6854q0.u(j7);
    }
}
