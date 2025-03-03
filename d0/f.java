package d0;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f9648a;

    /* renamed from: b  reason: collision with root package name */
    public d f9649b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f9650c = 0;

    /* renamed from: d  reason: collision with root package name */
    public C0629c f9651d;
    public C0629c e;

    /* renamed from: f  reason: collision with root package name */
    public C0629c f9652f;

    /* renamed from: g  reason: collision with root package name */
    public C0629c f9653g;

    /* renamed from: h  reason: collision with root package name */
    public int f9654h = 0;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f9655j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f9656k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f9657l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f9658m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f9659n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f9660o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f9661p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f9662q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f9663r;

    public f(g gVar, int i8, C0629c cVar, C0629c cVar2, C0629c cVar3, C0629c cVar4, int i9) {
        this.f9663r = gVar;
        this.f9648a = i8;
        this.f9651d = cVar;
        this.e = cVar2;
        this.f9652f = cVar3;
        this.f9653g = cVar4;
        this.f9654h = gVar.f9683j0;
        this.i = gVar.f9679f0;
        this.f9655j = gVar.f9684k0;
        this.f9656k = gVar.f9680g0;
        this.f9662q = i9;
    }

    public final void a(d dVar) {
        int i8 = this.f9648a;
        int i9 = 0;
        g gVar = this.f9663r;
        if (i8 == 0) {
            int D8 = gVar.D(dVar, this.f9662q);
            if (dVar.f9613c0[0] == 3) {
                this.f9661p++;
                D8 = 0;
            }
            int i10 = gVar.f9666C0;
            if (dVar.f9603V != 8) {
                i9 = i10;
            }
            this.f9657l = D8 + i9 + this.f9657l;
            int C8 = gVar.C(dVar, this.f9662q);
            if (this.f9649b == null || this.f9650c < C8) {
                this.f9649b = dVar;
                this.f9650c = C8;
                this.f9658m = C8;
            }
        } else {
            int D9 = gVar.D(dVar, this.f9662q);
            int C9 = gVar.C(dVar, this.f9662q);
            if (dVar.f9613c0[1] == 3) {
                this.f9661p++;
                C9 = 0;
            }
            int i11 = gVar.f9667D0;
            if (dVar.f9603V != 8) {
                i9 = i11;
            }
            this.f9658m = C9 + i9 + this.f9658m;
            if (this.f9649b == null || this.f9650c < D9) {
                this.f9649b = dVar;
                this.f9650c = D9;
                this.f9657l = D9;
            }
        }
        this.f9660o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f9660o
            r2 = 0
            r3 = 0
        L_0x0006:
            d0.g r4 = r0.f9663r
            if (r3 >= r1) goto L_0x001e
            int r5 = r0.f9659n
            int r5 = r5 + r3
            int r6 = r4.f9678O0
            if (r5 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            d0.d[] r4 = r4.f9677N0
            r4 = r4[r5]
            if (r4 == 0) goto L_0x001b
            r4.t()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02ac
            d0.d r3 = r0.f9649b
            if (r3 != 0) goto L_0x0026
            goto L_0x02ac
        L_0x0026:
            if (r20 == 0) goto L_0x002c
            if (r18 != 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = -1
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0031:
            if (r7 >= r1) goto L_0x0051
            if (r19 == 0) goto L_0x0039
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003a
        L_0x0039:
            r10 = r7
        L_0x003a:
            int r11 = r0.f9659n
            int r11 = r11 + r10
            int r10 = r4.f9678O0
            if (r11 < r10) goto L_0x0042
            goto L_0x0051
        L_0x0042:
            d0.d[] r10 = r4.f9677N0
            r10 = r10[r11]
            int r10 = r10.f9603V
            if (r10 != 0) goto L_0x004e
            if (r8 != r6) goto L_0x004d
            r8 = r7
        L_0x004d:
            r9 = r7
        L_0x004e:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0051:
            int r7 = r0.f9648a
            if (r7 != 0) goto L_0x0184
            d0.d r7 = r0.f9649b
            int r11 = r4.f9690r0
            r7.f9606Y = r11
            int r11 = r0.i
            if (r18 <= 0) goto L_0x0062
            int r12 = r4.f9667D0
            int r11 = r11 + r12
        L_0x0062:
            d0.c r12 = r0.e
            d0.c r13 = r7.f9633y
            r13.a(r12, r11)
            d0.c r11 = r7.f9582A
            if (r20 == 0) goto L_0x0074
            d0.c r12 = r0.f9653g
            int r14 = r0.f9656k
            r11.a(r12, r14)
        L_0x0074:
            if (r18 <= 0) goto L_0x007f
            d0.c r12 = r0.e
            d0.d r12 = r12.f9577b
            d0.c r12 = r12.f9582A
            r12.a(r13, r2)
        L_0x007f:
            int r12 = r4.f9669F0
            r14 = 3
            if (r12 != r14) goto L_0x00a6
            boolean r12 = r7.f9631w
            if (r12 != 0) goto L_0x00a6
            r12 = 0
        L_0x0089:
            if (r12 >= r1) goto L_0x00a6
            if (r19 == 0) goto L_0x0091
            int r15 = r1 + -1
            int r15 = r15 - r12
            goto L_0x0092
        L_0x0091:
            r15 = r12
        L_0x0092:
            int r10 = r0.f9659n
            int r10 = r10 + r15
            int r15 = r4.f9678O0
            if (r10 < r15) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            d0.d[] r15 = r4.f9677N0
            r10 = r15[r10]
            boolean r15 = r10.f9631w
            if (r15 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            int r12 = r12 + 1
            goto L_0x0089
        L_0x00a6:
            r10 = r7
        L_0x00a7:
            r12 = 0
            r15 = 0
        L_0x00a9:
            if (r15 >= r1) goto L_0x02ac
            if (r19 == 0) goto L_0x00b2
            int r16 = r1 + -1
            int r16 = r16 - r15
            goto L_0x00b4
        L_0x00b2:
            r16 = r15
        L_0x00b4:
            int r14 = r0.f9659n
            int r14 = r14 + r16
            int r3 = r4.f9678O0
            if (r14 < r3) goto L_0x00be
            goto L_0x02ac
        L_0x00be:
            d0.d[] r3 = r4.f9677N0
            r3 = r3[r14]
            if (r15 != 0) goto L_0x00cd
            d0.c r14 = r3.f9632x
            d0.c r2 = r0.f9651d
            int r6 = r0.f9654h
            r3.e(r14, r2, r6)
        L_0x00cd:
            if (r16 != 0) goto L_0x00f4
            int r2 = r4.f9689q0
            float r6 = r4.f9695w0
            int r14 = r0.f9659n
            if (r14 != 0) goto L_0x00e2
            int r14 = r4.f9691s0
            r16 = r2
            r2 = -1
            if (r14 == r2) goto L_0x00e5
            float r6 = r4.f9697y0
        L_0x00e0:
            r2 = r14
            goto L_0x00f0
        L_0x00e2:
            r16 = r2
            r2 = -1
        L_0x00e5:
            if (r20 == 0) goto L_0x00ee
            int r14 = r4.f9693u0
            if (r14 == r2) goto L_0x00ee
            float r6 = r4.f9664A0
            goto L_0x00e0
        L_0x00ee:
            r2 = r16
        L_0x00f0:
            r3.f9605X = r2
            r3.f9600S = r6
        L_0x00f4:
            int r2 = r1 + -1
            if (r15 != r2) goto L_0x0101
            d0.c r2 = r3.z
            d0.c r6 = r0.f9652f
            int r14 = r0.f9655j
            r3.e(r2, r6, r14)
        L_0x0101:
            if (r12 == 0) goto L_0x012d
            d0.c r2 = r3.f9632x
            int r6 = r4.f9666C0
            d0.c r12 = r12.z
            r2.a(r12, r6)
            d0.c r2 = r3.f9632x
            if (r15 != r8) goto L_0x011a
            int r6 = r0.f9654h
            boolean r14 = r2.f()
            if (r14 == 0) goto L_0x011a
            r2.f9580f = r6
        L_0x011a:
            r6 = 0
            r12.a(r2, r6)
            r2 = 1
            int r6 = r9 + 1
            if (r15 != r6) goto L_0x012d
            int r2 = r0.f9655j
            boolean r6 = r12.f()
            if (r6 == 0) goto L_0x012d
            r12.f9580f = r2
        L_0x012d:
            if (r3 == r7) goto L_0x017b
            int r2 = r4.f9669F0
            r6 = 3
            if (r2 != r6) goto L_0x0147
            boolean r12 = r10.f9631w
            if (r12 == 0) goto L_0x0147
            if (r3 == r10) goto L_0x0147
            boolean r12 = r3.f9631w
            if (r12 == 0) goto L_0x0147
            d0.c r2 = r3.f9583B
            d0.c r12 = r10.f9583B
            r14 = 0
            r2.a(r12, r14)
            goto L_0x017c
        L_0x0147:
            if (r2 == 0) goto L_0x0174
            r12 = 1
            if (r2 == r12) goto L_0x016d
            if (r5 == 0) goto L_0x0161
            d0.c r2 = r3.f9633y
            d0.c r12 = r0.e
            int r14 = r0.i
            r2.a(r12, r14)
            d0.c r2 = r0.f9653g
            int r12 = r0.f9656k
            d0.c r14 = r3.f9582A
            r14.a(r2, r12)
            goto L_0x017c
        L_0x0161:
            d0.c r2 = r3.f9633y
            r12 = 0
            r2.a(r13, r12)
            d0.c r2 = r3.f9582A
            r2.a(r11, r12)
            goto L_0x017c
        L_0x016d:
            r12 = 0
            d0.c r2 = r3.f9582A
            r2.a(r11, r12)
            goto L_0x017c
        L_0x0174:
            r12 = 0
            d0.c r2 = r3.f9633y
            r2.a(r13, r12)
            goto L_0x017c
        L_0x017b:
            r6 = 3
        L_0x017c:
            int r15 = r15 + 1
            r12 = r3
            r2 = 0
            r6 = -1
            r14 = 3
            goto L_0x00a9
        L_0x0184:
            d0.d r2 = r0.f9649b
            int r3 = r4.f9689q0
            r2.f9605X = r3
            int r3 = r0.f9654h
            if (r18 <= 0) goto L_0x0191
            int r6 = r4.f9666C0
            int r3 = r3 + r6
        L_0x0191:
            d0.c r6 = r2.f9632x
            d0.c r7 = r2.z
            if (r19 == 0) goto L_0x01b2
            d0.c r10 = r0.f9652f
            r7.a(r10, r3)
            if (r20 == 0) goto L_0x01a5
            d0.c r3 = r0.f9651d
            int r10 = r0.f9655j
            r6.a(r3, r10)
        L_0x01a5:
            if (r18 <= 0) goto L_0x01cc
            d0.c r3 = r0.f9652f
            d0.d r3 = r3.f9577b
            d0.c r3 = r3.f9632x
            r10 = 0
            r3.a(r7, r10)
            goto L_0x01cc
        L_0x01b2:
            d0.c r10 = r0.f9651d
            r6.a(r10, r3)
            if (r20 == 0) goto L_0x01c0
            d0.c r3 = r0.f9652f
            int r10 = r0.f9655j
            r7.a(r3, r10)
        L_0x01c0:
            if (r18 <= 0) goto L_0x01cc
            d0.c r3 = r0.f9651d
            d0.d r3 = r3.f9577b
            d0.c r3 = r3.z
            r10 = 0
            r3.a(r6, r10)
        L_0x01cc:
            r3 = 0
            r10 = 0
        L_0x01ce:
            if (r3 >= r1) goto L_0x02ac
            int r11 = r0.f9659n
            int r11 = r11 + r3
            int r12 = r4.f9678O0
            if (r11 < r12) goto L_0x01d9
            goto L_0x02ac
        L_0x01d9:
            d0.d[] r12 = r4.f9677N0
            r11 = r12[r11]
            if (r3 != 0) goto L_0x0208
            d0.c r12 = r11.f9633y
            d0.c r13 = r0.e
            int r14 = r0.i
            r11.e(r12, r13, r14)
            int r12 = r4.f9690r0
            float r13 = r4.f9696x0
            int r14 = r0.f9659n
            if (r14 != 0) goto L_0x01f9
            int r14 = r4.f9692t0
            r15 = -1
            if (r14 == r15) goto L_0x01fa
            float r13 = r4.f9698z0
        L_0x01f7:
            r12 = r14
            goto L_0x0203
        L_0x01f9:
            r15 = -1
        L_0x01fa:
            if (r20 == 0) goto L_0x0203
            int r14 = r4.f9694v0
            if (r14 == r15) goto L_0x0203
            float r13 = r4.f9665B0
            goto L_0x01f7
        L_0x0203:
            r11.f9606Y = r12
            r11.f9601T = r13
            goto L_0x0209
        L_0x0208:
            r15 = -1
        L_0x0209:
            int r12 = r1 + -1
            if (r3 != r12) goto L_0x0216
            d0.c r12 = r11.f9582A
            d0.c r13 = r0.f9653g
            int r14 = r0.f9656k
            r11.e(r12, r13, r14)
        L_0x0216:
            if (r10 == 0) goto L_0x0242
            d0.c r12 = r11.f9633y
            int r13 = r4.f9667D0
            d0.c r10 = r10.f9582A
            r12.a(r10, r13)
            d0.c r12 = r11.f9633y
            if (r3 != r8) goto L_0x022f
            int r13 = r0.i
            boolean r14 = r12.f()
            if (r14 == 0) goto L_0x022f
            r12.f9580f = r13
        L_0x022f:
            r13 = 0
            r10.a(r12, r13)
            r12 = 1
            int r13 = r9 + 1
            if (r3 != r13) goto L_0x0242
            int r12 = r0.f9656k
            boolean r13 = r10.f()
            if (r13 == 0) goto L_0x0242
            r10.f9580f = r12
        L_0x0242:
            if (r11 == r2) goto L_0x026a
            r10 = 2
            if (r19 == 0) goto L_0x026d
            int r12 = r4.f9668E0
            if (r12 == 0) goto L_0x0264
            r13 = 1
            if (r12 == r13) goto L_0x025d
            if (r12 == r10) goto L_0x0251
            goto L_0x026a
        L_0x0251:
            d0.c r10 = r11.f9632x
            r12 = 0
            r10.a(r6, r12)
            d0.c r10 = r11.z
            r10.a(r7, r12)
            goto L_0x026a
        L_0x025d:
            r12 = 0
            d0.c r10 = r11.f9632x
            r10.a(r6, r12)
            goto L_0x026a
        L_0x0264:
            r12 = 0
            d0.c r10 = r11.z
            r10.a(r7, r12)
        L_0x026a:
            r12 = 0
            r13 = 1
            goto L_0x02a7
        L_0x026d:
            int r12 = r4.f9668E0
            if (r12 == 0) goto L_0x02a0
            r13 = 1
            if (r12 == r13) goto L_0x0299
            if (r12 == r10) goto L_0x0278
        L_0x0276:
            r12 = 0
            goto L_0x02a7
        L_0x0278:
            if (r5 == 0) goto L_0x028d
            d0.c r10 = r11.f9632x
            d0.c r12 = r0.f9651d
            int r14 = r0.f9654h
            r10.a(r12, r14)
            d0.c r10 = r0.f9652f
            int r12 = r0.f9655j
            d0.c r14 = r11.z
            r14.a(r10, r12)
            goto L_0x0276
        L_0x028d:
            d0.c r10 = r11.f9632x
            r12 = 0
            r10.a(r6, r12)
            d0.c r10 = r11.z
            r10.a(r7, r12)
            goto L_0x02a7
        L_0x0299:
            r12 = 0
            d0.c r10 = r11.z
            r10.a(r7, r12)
            goto L_0x02a7
        L_0x02a0:
            r12 = 0
            r13 = 1
            d0.c r10 = r11.f9632x
            r10.a(r6, r12)
        L_0x02a7:
            int r3 = r3 + 1
            r10 = r11
            goto L_0x01ce
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.f.b(int, boolean, boolean):void");
    }

    public final int c() {
        if (this.f9648a == 1) {
            return this.f9658m - this.f9663r.f9667D0;
        }
        return this.f9658m;
    }

    public final int d() {
        if (this.f9648a == 0) {
            return this.f9657l - this.f9663r.f9666C0;
        }
        return this.f9657l;
    }

    public final void e(int i8) {
        g gVar;
        int i9;
        int i10 = this.f9661p;
        if (i10 != 0) {
            int i11 = this.f9660o;
            int i12 = i8 / i10;
            int i13 = 0;
            while (true) {
                gVar = this.f9663r;
                if (i13 >= i11 || (i9 = this.f9659n + i13) >= gVar.f9678O0) {
                    this.f9657l = 0;
                    this.f9658m = 0;
                    this.f9649b = null;
                    this.f9650c = 0;
                    int i14 = this.f9660o;
                    int i15 = 0;
                } else {
                    d dVar = gVar.f9677N0[i9];
                    if (this.f9648a == 0) {
                        if (dVar != null) {
                            int[] iArr = dVar.f9613c0;
                            if (iArr[0] == 3 && dVar.f9618j == 0) {
                                gVar.E(1, i12, iArr[1], dVar.i(), dVar);
                            }
                        }
                    } else if (dVar != null) {
                        int[] iArr2 = dVar.f9613c0;
                        if (iArr2[1] == 3 && dVar.f9619k == 0) {
                            gVar.E(iArr2[0], dVar.l(), 1, i12, dVar);
                        }
                    }
                    i13++;
                }
            }
            this.f9657l = 0;
            this.f9658m = 0;
            this.f9649b = null;
            this.f9650c = 0;
            int i142 = this.f9660o;
            int i152 = 0;
            while (i152 < i142) {
                int i16 = this.f9659n + i152;
                if (i16 < gVar.f9678O0) {
                    d dVar2 = gVar.f9677N0[i16];
                    if (this.f9648a == 0) {
                        int l8 = dVar2.l();
                        int i17 = gVar.f9666C0;
                        if (dVar2.f9603V == 8) {
                            i17 = 0;
                        }
                        this.f9657l = l8 + i17 + this.f9657l;
                        int C8 = gVar.C(dVar2, this.f9662q);
                        if (this.f9649b == null || this.f9650c < C8) {
                            this.f9649b = dVar2;
                            this.f9650c = C8;
                            this.f9658m = C8;
                        }
                    } else {
                        int D8 = gVar.D(dVar2, this.f9662q);
                        int C9 = gVar.C(dVar2, this.f9662q);
                        int i18 = gVar.f9667D0;
                        if (dVar2.f9603V == 8) {
                            i18 = 0;
                        }
                        this.f9658m = C9 + i18 + this.f9658m;
                        if (this.f9649b == null || this.f9650c < D8) {
                            this.f9649b = dVar2;
                            this.f9650c = D8;
                            this.f9657l = D8;
                        }
                    }
                    i152++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i8, C0629c cVar, C0629c cVar2, C0629c cVar3, C0629c cVar4, int i9, int i10, int i11, int i12, int i13) {
        this.f9648a = i8;
        this.f9651d = cVar;
        this.e = cVar2;
        this.f9652f = cVar3;
        this.f9653g = cVar4;
        this.f9654h = i9;
        this.i = i10;
        this.f9655j = i11;
        this.f9656k = i12;
        this.f9662q = i13;
    }
}
