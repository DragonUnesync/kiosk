package d0;

import B3.q;
import T3.a;
import c0.C0607e;
import c0.i;
import d4.k;
import de.ozerov.fully.X;
import java.util.ArrayList;
import java.util.Arrays;

public final class e extends d {

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f9634d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public final k f9635e0 = new k(this);

    /* renamed from: f0  reason: collision with root package name */
    public final X f9636f0;

    /* renamed from: g0  reason: collision with root package name */
    public a f9637g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9638h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C0607e f9639i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9640j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f9641k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f9642l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9643m0;

    /* renamed from: n0  reason: collision with root package name */
    public C0628b[] f9644n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0628b[] f9645o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f9646q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f9647r0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, de.ozerov.fully.X] */
    public e() {
        ? obj = new Object();
        obj.f10490a = true;
        obj.f10491b = true;
        obj.e = new ArrayList();
        new ArrayList();
        obj.f10494f = null;
        obj.f10495g = new Object();
        obj.f10496h = new ArrayList();
        obj.f10492c = this;
        obj.f10493d = this;
        this.f9636f0 = obj;
        this.f9637g0 = null;
        this.f9638h0 = false;
        this.f9639i0 = new C0607e();
        this.f9642l0 = 0;
        this.f9643m0 = 0;
        this.f9644n0 = new C0628b[4];
        this.f9645o0 = new C0628b[4];
        this.p0 = 263;
        this.f9646q0 = false;
        this.f9647r0 = false;
    }

    public final void B(d dVar, int i) {
        if (i == 0) {
            int i8 = this.f9642l0 + 1;
            C0628b[] bVarArr = this.f9645o0;
            if (i8 >= bVarArr.length) {
                this.f9645o0 = (C0628b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            C0628b[] bVarArr2 = this.f9645o0;
            int i9 = this.f9642l0;
            bVarArr2[i9] = new C0628b(dVar, 0, this.f9638h0);
            this.f9642l0 = i9 + 1;
        } else if (i == 1) {
            int i10 = this.f9643m0 + 1;
            C0628b[] bVarArr3 = this.f9644n0;
            if (i10 >= bVarArr3.length) {
                this.f9644n0 = (C0628b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            C0628b[] bVarArr4 = this.f9644n0;
            int i11 = this.f9643m0;
            bVarArr4[i11] = new C0628b(dVar, 1, this.f9638h0);
            this.f9643m0 = i11 + 1;
        }
    }

    public final void C(C0607e eVar) {
        a(eVar);
        int size = this.f9634d0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f9634d0.get(i);
            boolean[] zArr = dVar.f9589H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0627a) {
                z = true;
            }
        }
        if (z) {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar2 = (d) this.f9634d0.get(i8);
                if (dVar2 instanceof C0627a) {
                    C0627a aVar = (C0627a) dVar2;
                    for (int i9 = 0; i9 < aVar.f9705e0; i9++) {
                        d dVar3 = aVar.f9704d0[i9];
                        int i10 = aVar.f9558f0;
                        if (i10 == 0 || i10 == 1) {
                            dVar3.f9589H[0] = true;
                        } else if (i10 == 2 || i10 == 3) {
                            dVar3.f9589H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            d dVar4 = (d) this.f9634d0.get(i11);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(eVar);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            d dVar5 = (d) this.f9634d0.get(i12);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f9613c0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                if (i13 == 2) {
                    dVar5.w(1);
                }
                if (i14 == 2) {
                    dVar5.x(1);
                }
                dVar5.a(eVar);
                if (i13 == 2) {
                    dVar5.w(i13);
                }
                if (i14 == 2) {
                    dVar5.x(i14);
                }
            } else {
                dVar5.f9617h = -1;
                dVar5.i = -1;
                int[] iArr2 = this.f9613c0;
                int i15 = iArr2[0];
                int[] iArr3 = dVar5.f9613c0;
                if (i15 != 2 && iArr3[0] == 4) {
                    C0629c cVar = dVar5.f9632x;
                    int i16 = cVar.e;
                    int l8 = l();
                    C0629c cVar2 = dVar5.z;
                    int i17 = l8 - cVar2.e;
                    cVar.f9581g = eVar.j(cVar);
                    cVar2.f9581g = eVar.j(cVar2);
                    eVar.d(cVar.f9581g, i16);
                    eVar.d(cVar2.f9581g, i17);
                    dVar5.f9617h = 2;
                    dVar5.f9595N = i16;
                    int i18 = i17 - i16;
                    dVar5.f9591J = i18;
                    int i19 = dVar5.f9598Q;
                    if (i18 < i19) {
                        dVar5.f9591J = i19;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C0629c cVar3 = dVar5.f9633y;
                    int i20 = cVar3.e;
                    int i21 = i();
                    C0629c cVar4 = dVar5.f9582A;
                    int i22 = i21 - cVar4.e;
                    cVar3.f9581g = eVar.j(cVar3);
                    cVar4.f9581g = eVar.j(cVar4);
                    eVar.d(cVar3.f9581g, i20);
                    eVar.d(cVar4.f9581g, i22);
                    if (dVar5.f9597P > 0 || dVar5.f9603V == 8) {
                        C0629c cVar5 = dVar5.f9583B;
                        i j7 = eVar.j(cVar5);
                        cVar5.f9581g = j7;
                        eVar.d(j7, dVar5.f9597P + i20);
                    }
                    dVar5.i = 2;
                    dVar5.f9596O = i20;
                    int i23 = i22 - i20;
                    dVar5.f9592K = i23;
                    int i24 = dVar5.f9599R;
                    if (i23 < i24) {
                        dVar5.f9592K = i24;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(eVar);
                }
            }
        }
        if (this.f9642l0 > 0) {
            j.a(this, eVar, 0);
        }
        if (this.f9643m0 > 0) {
            j.a(this, eVar, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0111 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(int r17, boolean r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r16
            de.ozerov.fully.X r2 = r1.f9636f0
            java.lang.Object r3 = r2.f10492c
            d0.e r3 = (d0.e) r3
            r4 = 0
            int r5 = r3.h(r4)
            r6 = 1
            int r7 = r3.h(r6)
            int r8 = r3.m()
            int r9 = r3.n()
            java.lang.Object r10 = r2.e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            e0.k r11 = r3.e
            e0.i r12 = r3.f9614d
            if (r18 == 0) goto L_0x007d
            r13 = 2
            if (r5 == r13) goto L_0x002b
            if (r7 != r13) goto L_0x007d
        L_0x002b:
            java.util.Iterator r14 = r10.iterator()
        L_0x002f:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0049
            java.lang.Object r15 = r14.next()
            e0.l r15 = (e0.l) r15
            int r4 = r15.f11159f
            if (r4 != r0) goto L_0x0047
            boolean r4 = r15.k()
            if (r4 != 0) goto L_0x0047
            r4 = 0
            goto L_0x004b
        L_0x0047:
            r4 = 0
            goto L_0x002f
        L_0x0049:
            r4 = r18
        L_0x004b:
            if (r0 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x007d
            if (r5 != r13) goto L_0x007d
            r3.w(r6)
            r4 = 0
            int r13 = r2.e(r3, r4)
            r3.y(r13)
            e0.f r4 = r12.e
            int r13 = r3.l()
            r4.d(r13)
            goto L_0x007d
        L_0x0066:
            if (r4 == 0) goto L_0x007d
            if (r7 != r13) goto L_0x007d
            r3.x(r6)
            int r4 = r2.e(r3, r6)
            r3.v(r4)
            e0.f r4 = r11.e
            int r13 = r3.i()
            r4.d(r13)
        L_0x007d:
            int[] r4 = r3.f9613c0
            r13 = 4
            if (r0 != 0) goto L_0x009b
            r14 = 0
            r4 = r4[r14]
            if (r4 == r6) goto L_0x0089
            if (r4 != r13) goto L_0x00a3
        L_0x0089:
            int r4 = r3.l()
            int r4 = r4 + r8
            e0.e r9 = r12.i
            r9.d(r4)
            e0.f r9 = r12.e
            int r4 = r4 - r8
            r9.d(r4)
        L_0x0099:
            r4 = 1
            goto L_0x00b6
        L_0x009b:
            r14 = 0
            r4 = r4[r6]
            if (r4 == r6) goto L_0x00a5
            if (r4 != r13) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r4 = 0
            goto L_0x00b6
        L_0x00a5:
            int r4 = r3.i()
            int r4 = r4 + r9
            e0.e r8 = r11.i
            r8.d(r4)
            e0.f r8 = r11.e
            int r4 = r4 - r9
            r8.d(r4)
            goto L_0x0099
        L_0x00b6:
            r2.h()
            java.util.Iterator r2 = r10.iterator()
        L_0x00bd:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00db
            java.lang.Object r8 = r2.next()
            e0.l r8 = (e0.l) r8
            int r9 = r8.f11159f
            if (r9 == r0) goto L_0x00ce
            goto L_0x00bd
        L_0x00ce:
            d0.d r9 = r8.f11156b
            if (r9 != r3) goto L_0x00d7
            boolean r9 = r8.f11160g
            if (r9 != 0) goto L_0x00d7
            goto L_0x00bd
        L_0x00d7:
            r8.e()
            goto L_0x00bd
        L_0x00db:
            java.util.Iterator r2 = r10.iterator()
        L_0x00df:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0111
            java.lang.Object r8 = r2.next()
            e0.l r8 = (e0.l) r8
            int r9 = r8.f11159f
            if (r9 == r0) goto L_0x00f0
            goto L_0x00df
        L_0x00f0:
            if (r4 != 0) goto L_0x00f7
            d0.d r9 = r8.f11156b
            if (r9 != r3) goto L_0x00f7
            goto L_0x00df
        L_0x00f7:
            e0.e r9 = r8.f11161h
            boolean r9 = r9.f11146j
            if (r9 != 0) goto L_0x00ff
        L_0x00fd:
            r4 = 0
            goto L_0x0112
        L_0x00ff:
            e0.e r9 = r8.i
            boolean r9 = r9.f11146j
            if (r9 != 0) goto L_0x0106
            goto L_0x00fd
        L_0x0106:
            boolean r9 = r8 instanceof e0.C0819c
            if (r9 != 0) goto L_0x00df
            e0.f r8 = r8.e
            boolean r8 = r8.f11146j
            if (r8 != 0) goto L_0x00df
            goto L_0x00fd
        L_0x0111:
            r4 = 1
        L_0x0112:
            r3.w(r5)
            r3.x(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.D(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX WARNING: type inference failed for: r2v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r19 = this;
            r1 = r19
            r2 = 0
            r1.f9595N = r2
            r1.f9596O = r2
            int r0 = r19.l()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r19.i()
            int r4 = java.lang.Math.max(r2, r0)
            r1.f9646q0 = r2
            r1.f9647r0 = r2
            int r0 = r1.p0
            r5 = r0 & 64
            r6 = 1
            r7 = 64
            if (r5 != r7) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 != 0) goto L_0x0031
            r5 = 128(0x80, float:1.794E-43)
            r0 = r0 & r5
            if (r0 != r5) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            c0.e r5 = r1.f9639i0
            r5.getClass()
            r5.f8725f = r2
            int r7 = r1.p0
            if (r7 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0041
            r5.f8725f = r6
        L_0x0041:
            int[] r7 = r1.f9613c0
            r8 = r7[r6]
            r9 = r7[r2]
            java.util.ArrayList r10 = r1.f9634d0
            r11 = 2
            if (r9 == r11) goto L_0x0051
            if (r8 != r11) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r12 = 0
            goto L_0x0052
        L_0x0051:
            r12 = 1
        L_0x0052:
            r1.f9642l0 = r2
            r1.f9643m0 = r2
            int r13 = r10.size()
            r0 = 0
        L_0x005b:
            if (r0 >= r13) goto L_0x0071
            java.util.ArrayList r14 = r1.f9634d0
            java.lang.Object r14 = r14.get(r0)
            d0.d r14 = (d0.d) r14
            boolean r15 = r14 instanceof d0.e
            if (r15 == 0) goto L_0x006e
            d0.e r14 = (d0.e) r14
            r14.E()
        L_0x006e:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0071:
            r0 = 0
            r14 = 1
            r15 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x01fb
            int r11 = r0 + 1
            r5.r()     // Catch:{ Exception -> 0x0094 }
            r1.f9642l0 = r2     // Catch:{ Exception -> 0x0094 }
            r1.f9643m0 = r2     // Catch:{ Exception -> 0x0094 }
            r1.f(r5)     // Catch:{ Exception -> 0x0094 }
            r0 = 0
        L_0x0083:
            if (r0 >= r13) goto L_0x0096
            java.util.ArrayList r6 = r1.f9634d0     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0094 }
            d0.d r6 = (d0.d) r6     // Catch:{ Exception -> 0x0094 }
            r6.f(r5)     // Catch:{ Exception -> 0x0094 }
            int r0 = r0 + 1
            r6 = 1
            goto L_0x0083
        L_0x0094:
            r0 = move-exception
            goto L_0x00cd
        L_0x0096:
            r1.C(r5)     // Catch:{ Exception -> 0x0094 }
            c0.h r0 = r5.f8722b     // Catch:{ Exception -> 0x00cb }
            boolean r6 = r5.f8725f     // Catch:{ Exception -> 0x00cb }
            if (r6 == 0) goto L_0x00c5
            r6 = 0
        L_0x00a0:
            int r14 = r5.i     // Catch:{ Exception -> 0x00cb }
            if (r6 >= r14) goto L_0x00b3
            c0.c[] r14 = r5.e     // Catch:{ Exception -> 0x00cb }
            r14 = r14[r6]     // Catch:{ Exception -> 0x00cb }
            boolean r14 = r14.e     // Catch:{ Exception -> 0x00cb }
            if (r14 != 0) goto L_0x00b0
            r5.o(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00c8
        L_0x00b0:
            int r6 = r6 + 1
            goto L_0x00a0
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            int r6 = r5.i     // Catch:{ Exception -> 0x00cb }
            if (r0 >= r6) goto L_0x00c8
            c0.c[] r6 = r5.e     // Catch:{ Exception -> 0x00cb }
            r6 = r6[r0]     // Catch:{ Exception -> 0x00cb }
            c0.i r14 = r6.f8715a     // Catch:{ Exception -> 0x00cb }
            float r6 = r6.f8716b     // Catch:{ Exception -> 0x00cb }
            r14.e = r6     // Catch:{ Exception -> 0x00cb }
            int r0 = r0 + 1
            goto L_0x00b4
        L_0x00c5:
            r5.o(r0)     // Catch:{ Exception -> 0x00cb }
        L_0x00c8:
            r17 = 1
            goto L_0x00e5
        L_0x00cb:
            r0 = move-exception
            r14 = 1
        L_0x00cd:
            r0.printStackTrace()
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r17 = r14
            java.lang.String r14 = "EXCEPTION : "
            r2.<init>(r14)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.println(r0)
        L_0x00e5:
            boolean[] r0 = d0.j.f9706a
            if (r17 == 0) goto L_0x0107
            r2 = 0
            r6 = 2
            r0[r6] = r2
            r1.A(r5)
            java.util.ArrayList r2 = r1.f9634d0
            int r2 = r2.size()
            r6 = 0
        L_0x00f7:
            if (r6 >= r2) goto L_0x011b
            java.util.ArrayList r14 = r1.f9634d0
            java.lang.Object r14 = r14.get(r6)
            d0.d r14 = (d0.d) r14
            r14.A(r5)
            int r6 = r6 + 1
            goto L_0x00f7
        L_0x0107:
            r1.A(r5)
            r2 = 0
        L_0x010b:
            if (r2 >= r13) goto L_0x011b
            java.util.ArrayList r6 = r1.f9634d0
            java.lang.Object r6 = r6.get(r2)
            d0.d r6 = (d0.d) r6
            r6.A(r5)
            int r2 = r2 + 1
            goto L_0x010b
        L_0x011b:
            if (r12 == 0) goto L_0x0183
            r2 = 8
            if (r11 >= r2) goto L_0x0183
            r2 = 2
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0183
            r0 = 0
            r2 = 0
            r6 = 0
        L_0x0129:
            if (r0 >= r13) goto L_0x0151
            java.util.ArrayList r14 = r1.f9634d0
            java.lang.Object r14 = r14.get(r0)
            d0.d r14 = (d0.d) r14
            r17 = r11
            int r11 = r14.f9595N
            int r18 = r14.l()
            int r11 = r18 + r11
            int r2 = java.lang.Math.max(r2, r11)
            int r11 = r14.f9596O
            int r14 = r14.i()
            int r14 = r14 + r11
            int r6 = java.lang.Math.max(r6, r14)
            int r0 = r0 + 1
            r11 = r17
            goto L_0x0129
        L_0x0151:
            r17 = r11
            int r0 = r1.f9598Q
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f9599R
            int r2 = java.lang.Math.max(r2, r6)
            r6 = 2
            if (r9 != r6) goto L_0x0171
            int r11 = r19.l()
            if (r11 >= r0) goto L_0x0171
            r1.y(r0)
            r11 = 0
            r7[r11] = r6
            r0 = 1
            r15 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r8 != r6) goto L_0x0186
            int r11 = r19.i()
            if (r11 >= r2) goto L_0x0186
            r1.v(r2)
            r2 = 1
            r7[r2] = r6
            r0 = 1
            r15 = 1
            goto L_0x0186
        L_0x0183:
            r17 = r11
            r0 = 0
        L_0x0186:
            int r2 = r1.f9598Q
            int r6 = r19.l()
            int r2 = java.lang.Math.max(r2, r6)
            int r6 = r19.l()
            if (r2 <= r6) goto L_0x01a1
            r1.y(r2)
            r2 = 1
            r6 = 0
            r7[r6] = r2
            r0 = 1
            r16 = 1
            goto L_0x01a4
        L_0x01a1:
            r2 = 1
            r16 = r15
        L_0x01a4:
            int r6 = r1.f9599R
            int r11 = r19.i()
            int r6 = java.lang.Math.max(r6, r11)
            int r11 = r19.i()
            if (r6 <= r11) goto L_0x01bc
            r1.v(r6)
            r7[r2] = r2
            r0 = 1
            r6 = 1
            goto L_0x01bf
        L_0x01bc:
            r6 = r0
            r0 = r16
        L_0x01bf:
            if (r0 != 0) goto L_0x01f1
            r11 = 0
            r14 = r7[r11]
            r15 = 2
            if (r14 != r15) goto L_0x01d8
            if (r3 <= 0) goto L_0x01d8
            int r14 = r19.l()
            if (r14 <= r3) goto L_0x01d8
            r1.f9646q0 = r2
            r7[r11] = r2
            r1.y(r3)
            r0 = 1
            r6 = 1
        L_0x01d8:
            r11 = r7[r2]
            r14 = 2
            if (r11 != r14) goto L_0x01ef
            if (r4 <= 0) goto L_0x01ef
            int r11 = r19.i()
            if (r11 <= r4) goto L_0x01ef
            r1.f9647r0 = r2
            r7[r2] = r2
            r1.v(r4)
            r6 = 1
            r15 = 1
            goto L_0x01f3
        L_0x01ef:
            r15 = r0
            goto L_0x01f3
        L_0x01f1:
            r14 = 2
            goto L_0x01ef
        L_0x01f3:
            r14 = r6
            r0 = r17
            r2 = 0
            r6 = 1
            r11 = 2
            goto L_0x0074
        L_0x01fb:
            r1.f9634d0 = r10
            if (r15 == 0) goto L_0x0205
            r2 = 0
            r7[r2] = r9
            r2 = 1
            r7[r2] = r8
        L_0x0205:
            B3.q r0 = r5.f8729k
            r1.u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.E():void");
    }

    public final void s() {
        this.f9639i0.r();
        this.f9640j0 = 0;
        this.f9641k0 = 0;
        this.f9634d0.clear();
        super.s();
    }

    public final void u(q qVar) {
        super.u(qVar);
        int size = this.f9634d0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f9634d0.get(i)).u(qVar);
        }
    }

    public final void z(boolean z, boolean z6) {
        super.z(z, z6);
        int size = this.f9634d0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f9634d0.get(i)).z(z, z6);
        }
    }
}
