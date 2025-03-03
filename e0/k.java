package e0;

import d0.d;
import u.C1477r;

public final class k extends l {

    /* renamed from: k  reason: collision with root package name */
    public C0821e f11153k;

    /* renamed from: l  reason: collision with root package name */
    public C0817a f11154l;

    public final void a(C0820d dVar) {
        int i;
        float f8;
        float f9;
        float f10;
        if (C1477r.h(this.f11162j) != 3) {
            C0822f fVar = this.e;
            if (fVar.f11141c && !fVar.f11146j && this.f11158d == 3) {
                d dVar2 = this.f11156b;
                int i8 = dVar2.f9619k;
                if (i8 == 2) {
                    d dVar3 = dVar2.f9590I;
                    if (dVar3 != null) {
                        C0822f fVar2 = dVar3.e.e;
                        if (fVar2.f11146j) {
                            fVar.d((int) ((((float) fVar2.f11144g) * dVar2.f9626r) + 0.5f));
                        }
                    }
                } else if (i8 == 3) {
                    C0822f fVar3 = dVar2.f9614d.e;
                    if (fVar3.f11146j) {
                        int i9 = dVar2.f9594M;
                        if (i9 == -1) {
                            f8 = (float) fVar3.f11144g;
                            f9 = dVar2.f9593L;
                        } else if (i9 == 0) {
                            f10 = ((float) fVar3.f11144g) * dVar2.f9593L;
                            i = (int) (f10 + 0.5f);
                            fVar.d(i);
                        } else if (i9 != 1) {
                            i = 0;
                            fVar.d(i);
                        } else {
                            f8 = (float) fVar3.f11144g;
                            f9 = dVar2.f9593L;
                        }
                        f10 = f8 / f9;
                        i = (int) (f10 + 0.5f);
                        fVar.d(i);
                    }
                }
            }
            C0821e eVar = this.f11161h;
            if (eVar.f11141c) {
                C0821e eVar2 = this.i;
                if (eVar2.f11141c) {
                    if (!eVar.f11146j || !eVar2.f11146j || !fVar.f11146j) {
                        if (!fVar.f11146j && this.f11158d == 3) {
                            d dVar4 = this.f11156b;
                            if (dVar4.f9618j == 0 && !dVar4.r()) {
                                int i10 = ((C0821e) eVar.f11148l.get(0)).f11144g + eVar.f11143f;
                                int i11 = ((C0821e) eVar2.f11148l.get(0)).f11144g + eVar2.f11143f;
                                eVar.d(i10);
                                eVar2.d(i11);
                                fVar.d(i11 - i10);
                                return;
                            }
                        }
                        if (!fVar.f11146j && this.f11158d == 3 && this.f11155a == 1 && eVar.f11148l.size() > 0 && eVar2.f11148l.size() > 0) {
                            int i12 = (((C0821e) eVar2.f11148l.get(0)).f11144g + eVar2.f11143f) - (((C0821e) eVar.f11148l.get(0)).f11144g + eVar.f11143f);
                            int i13 = fVar.f11149m;
                            if (i12 < i13) {
                                fVar.d(i12);
                            } else {
                                fVar.d(i13);
                            }
                        }
                        if (fVar.f11146j && eVar.f11148l.size() > 0 && eVar2.f11148l.size() > 0) {
                            C0821e eVar3 = (C0821e) eVar.f11148l.get(0);
                            C0821e eVar4 = (C0821e) eVar2.f11148l.get(0);
                            int i14 = eVar3.f11144g;
                            int i15 = eVar.f11143f + i14;
                            int i16 = eVar4.f11144g;
                            int i17 = eVar2.f11143f + i16;
                            float f11 = this.f11156b.f9601T;
                            if (eVar3 == eVar4) {
                                f11 = 0.5f;
                            } else {
                                i14 = i15;
                                i16 = i17;
                            }
                            eVar.d((int) ((((float) ((i16 - i14) - fVar.f11144g)) * f11) + ((float) i14) + 0.5f));
                            eVar2.d(eVar.f11144g + fVar.f11144g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.f11156b;
        l(dVar5.f9633y, dVar5.f9582A, 1);
    }

    /* JADX WARNING: type inference failed for: r0v123, types: [e0.a, e0.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r0 = r14.f11156b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            d0.d r0 = r14.f11156b
            boolean r1 = r0.f9608a
            e0.f r2 = r14.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.i()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11146j
            e0.e r1 = r14.i
            e0.e r3 = r14.f11161h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0082
            d0.d r0 = r14.f11156b
            int[] r7 = r0.f9613c0
            r7 = r7[r5]
            r14.f11158d = r7
            boolean r0 = r0.f9631w
            if (r0 == 0) goto L_0x002d
            e0.a r0 = new e0.a
            r0.<init>(r14)
            r14.f11154l = r0
        L_0x002d:
            int r0 = r14.f11158d
            if (r0 == r4) goto L_0x00ae
            if (r0 != r6) goto L_0x0076
            d0.d r7 = r14.f11156b
            d0.d r7 = r7.f9590I
            if (r7 == 0) goto L_0x0076
            int[] r8 = r7.f9613c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0076
            int r0 = r7.i()
            d0.d r4 = r14.f11156b
            d0.c r4 = r4.f9633y
            int r4 = r4.c()
            int r0 = r0 - r4
            d0.d r4 = r14.f11156b
            d0.c r4 = r4.f9582A
            int r4 = r4.c()
            int r0 = r0 - r4
            e0.k r4 = r7.e
            e0.e r5 = r4.f11161h
            d0.d r6 = r14.f11156b
            d0.c r6 = r6.f9633y
            int r6 = r6.c()
            e0.l.b(r3, r5, r6)
            e0.e r3 = r4.i
            d0.d r4 = r14.f11156b
            d0.c r4 = r4.f9582A
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0076:
            if (r0 != r5) goto L_0x00ae
            d0.d r0 = r14.f11156b
            int r0 = r0.i()
            r2.d(r0)
            goto L_0x00ae
        L_0x0082:
            int r0 = r14.f11158d
            if (r0 != r6) goto L_0x00ae
            d0.d r0 = r14.f11156b
            d0.d r7 = r0.f9590I
            if (r7 == 0) goto L_0x00ae
            int[] r8 = r7.f9613c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00ae
            e0.k r2 = r7.e
            e0.e r4 = r2.f11161h
            d0.c r0 = r0.f9633y
            int r0 = r0.c()
            e0.l.b(r3, r4, r0)
            e0.e r0 = r2.i
            d0.d r2 = r14.f11156b
            d0.c r2 = r2.f9582A
            int r2 = r2.c()
            int r2 = -r2
            e0.l.b(r1, r0, r2)
            return
        L_0x00ae:
            boolean r0 = r2.f11146j
            e0.e r7 = r14.f11153k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d2
            d0.d r10 = r14.f11156b
            boolean r11 = r10.f9608a
            if (r11 == 0) goto L_0x01d2
            d0.c[] r0 = r10.f9587F
            r11 = r0[r9]
            d0.c r12 = r11.f9579d
            if (r12 == 0) goto L_0x012e
            r13 = r0[r4]
            d0.c r13 = r13.f9579d
            if (r13 == 0) goto L_0x012e
            boolean r0 = r10.r()
            if (r0 == 0) goto L_0x00ea
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f11143f = r0
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f11143f = r0
            goto L_0x0121
        L_0x00ea:
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r9]
            e0.e r0 = e0.l.h(r0)
            if (r0 == 0) goto L_0x0103
            d0.d r2 = r14.f11156b
            d0.c[] r2 = r2.f9587F
            r2 = r2[r9]
            int r2 = r2.c()
            e0.l.b(r3, r0, r2)
        L_0x0103:
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            e0.e r0 = e0.l.h(r0)
            if (r0 == 0) goto L_0x011d
            d0.d r2 = r14.f11156b
            d0.c[] r2 = r2.f9587F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            e0.l.b(r1, r0, r2)
        L_0x011d:
            r3.f11140b = r5
            r1.f11140b = r5
        L_0x0121:
            d0.d r0 = r14.f11156b
            boolean r1 = r0.f9631w
            if (r1 == 0) goto L_0x0364
            int r0 = r0.f9597P
            e0.l.b(r7, r3, r0)
            goto L_0x0364
        L_0x012e:
            if (r12 == 0) goto L_0x0155
            e0.e r0 = e0.l.h(r11)
            if (r0 == 0) goto L_0x0364
            d0.d r4 = r14.f11156b
            d0.c[] r4 = r4.f9587F
            r4 = r4[r9]
            int r4 = r4.c()
            e0.l.b(r3, r0, r4)
            int r0 = r2.f11144g
            e0.l.b(r1, r3, r0)
            d0.d r0 = r14.f11156b
            boolean r1 = r0.f9631w
            if (r1 == 0) goto L_0x0364
            int r0 = r0.f9597P
            e0.l.b(r7, r3, r0)
            goto L_0x0364
        L_0x0155:
            r5 = r0[r4]
            d0.c r9 = r5.f9579d
            if (r9 == 0) goto L_0x0182
            e0.e r0 = e0.l.h(r5)
            if (r0 == 0) goto L_0x0175
            d0.d r5 = r14.f11156b
            d0.c[] r5 = r5.f9587F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r0, r4)
            int r0 = r2.f11144g
            int r0 = -r0
            e0.l.b(r3, r1, r0)
        L_0x0175:
            d0.d r0 = r14.f11156b
            boolean r1 = r0.f9631w
            if (r1 == 0) goto L_0x0364
            int r0 = r0.f9597P
            e0.l.b(r7, r3, r0)
            goto L_0x0364
        L_0x0182:
            r0 = r0[r6]
            d0.c r4 = r0.f9579d
            if (r4 == 0) goto L_0x01a0
            e0.e r0 = e0.l.h(r0)
            if (r0 == 0) goto L_0x0364
            e0.l.b(r7, r0, r8)
            d0.d r0 = r14.f11156b
            int r0 = r0.f9597P
            int r0 = -r0
            e0.l.b(r3, r7, r0)
            int r0 = r2.f11144g
            e0.l.b(r1, r3, r0)
            goto L_0x0364
        L_0x01a0:
            boolean r0 = r10 instanceof d0.i
            if (r0 != 0) goto L_0x0364
            d0.d r0 = r10.f9590I
            if (r0 == 0) goto L_0x0364
            r0 = 7
            d0.c r0 = r10.g(r0)
            d0.c r0 = r0.f9579d
            if (r0 != 0) goto L_0x0364
            d0.d r0 = r14.f11156b
            d0.d r4 = r0.f9590I
            e0.k r4 = r4.e
            e0.e r4 = r4.f11161h
            int r0 = r0.n()
            e0.l.b(r3, r4, r0)
            int r0 = r2.f11144g
            e0.l.b(r1, r3, r0)
            d0.d r0 = r14.f11156b
            boolean r1 = r0.f9631w
            if (r1 == 0) goto L_0x0364
            int r0 = r0.f9597P
            e0.l.b(r7, r3, r0)
            goto L_0x0364
        L_0x01d2:
            if (r0 != 0) goto L_0x0229
            int r0 = r14.f11158d
            if (r0 != r4) goto L_0x0229
            d0.d r0 = r14.f11156b
            int r10 = r0.f9619k
            if (r10 == r9) goto L_0x0209
            if (r10 == r4) goto L_0x01e1
            goto L_0x022c
        L_0x01e1:
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x022c
            d0.d r0 = r14.f11156b
            int r10 = r0.f9618j
            if (r10 != r4) goto L_0x01ee
            goto L_0x022c
        L_0x01ee:
            e0.i r0 = r0.f9614d
            e0.f r0 = r0.e
            java.util.ArrayList r10 = r2.f11148l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            r2.f11140b = r5
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r1)
            goto L_0x022c
        L_0x0209:
            d0.d r0 = r0.f9590I
            if (r0 != 0) goto L_0x020e
            goto L_0x022c
        L_0x020e:
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r10 = r2.f11148l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            r2.f11140b = r5
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r1)
            goto L_0x022c
        L_0x0229:
            r2.b(r14)
        L_0x022c:
            d0.d r0 = r14.f11156b
            d0.c[] r10 = r0.f9587F
            r11 = r10[r9]
            d0.c r12 = r11.f9579d
            if (r12 == 0) goto L_0x0285
            r13 = r10[r4]
            d0.c r13 = r13.f9579d
            if (r13 == 0) goto L_0x0285
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x025c
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f11143f = r0
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f11143f = r0
            goto L_0x0278
        L_0x025c:
            d0.d r0 = r14.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r9]
            e0.e r0 = e0.l.h(r0)
            d0.d r1 = r14.f11156b
            d0.c[] r1 = r1.f9587F
            r1 = r1[r4]
            e0.e r1 = e0.l.h(r1)
            r0.b(r14)
            r1.b(r14)
            r14.f11162j = r6
        L_0x0278:
            d0.d r0 = r14.f11156b
            boolean r0 = r0.f9631w
            if (r0 == 0) goto L_0x035a
            e0.a r0 = r14.f11154l
            r14.c(r7, r3, r5, r0)
            goto L_0x035a
        L_0x0285:
            r13 = 0
            if (r12 == 0) goto L_0x02d1
            e0.e r0 = e0.l.h(r11)
            if (r0 == 0) goto L_0x035a
            d0.d r6 = r14.f11156b
            d0.c[] r6 = r6.f9587F
            r6 = r6[r9]
            int r6 = r6.c()
            e0.l.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            d0.d r0 = r14.f11156b
            boolean r0 = r0.f9631w
            if (r0 == 0) goto L_0x02a9
            e0.a r0 = r14.f11154l
            r14.c(r7, r3, r5, r0)
        L_0x02a9:
            int r0 = r14.f11158d
            if (r0 != r4) goto L_0x035a
            d0.d r0 = r14.f11156b
            float r1 = r0.f9593L
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x035a
            e0.i r0 = r0.f9614d
            int r1 = r0.f11158d
            if (r1 != r4) goto L_0x035a
            e0.f r0 = r0.e
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11148l
            d0.d r1 = r14.f11156b
            e0.i r1 = r1.f9614d
            e0.f r1 = r1.e
            r0.add(r1)
            r2.f11139a = r14
            goto L_0x035a
        L_0x02d1:
            r9 = r10[r4]
            d0.c r11 = r9.f9579d
            r12 = -1
            if (r11 == 0) goto L_0x02fb
            e0.e r0 = e0.l.h(r9)
            if (r0 == 0) goto L_0x035a
            d0.d r6 = r14.f11156b
            d0.c[] r6 = r6.f9587F
            r4 = r6[r4]
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            d0.d r0 = r14.f11156b
            boolean r0 = r0.f9631w
            if (r0 == 0) goto L_0x035a
            e0.a r0 = r14.f11154l
            r14.c(r7, r3, r5, r0)
            goto L_0x035a
        L_0x02fb:
            r6 = r10[r6]
            d0.c r9 = r6.f9579d
            if (r9 == 0) goto L_0x0313
            e0.e r0 = e0.l.h(r6)
            if (r0 == 0) goto L_0x035a
            e0.l.b(r7, r0, r8)
            e0.a r0 = r14.f11154l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x035a
        L_0x0313:
            boolean r6 = r0 instanceof d0.i
            if (r6 != 0) goto L_0x035a
            d0.d r6 = r0.f9590I
            if (r6 == 0) goto L_0x035a
            e0.k r6 = r6.e
            e0.e r6 = r6.f11161h
            int r0 = r0.n()
            e0.l.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            d0.d r0 = r14.f11156b
            boolean r0 = r0.f9631w
            if (r0 == 0) goto L_0x0334
            e0.a r0 = r14.f11154l
            r14.c(r7, r3, r5, r0)
        L_0x0334:
            int r0 = r14.f11158d
            if (r0 != r4) goto L_0x035a
            d0.d r0 = r14.f11156b
            float r1 = r0.f9593L
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x035a
            e0.i r0 = r0.f9614d
            int r1 = r0.f11158d
            if (r1 != r4) goto L_0x035a
            e0.f r0 = r0.e
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11148l
            d0.d r1 = r14.f11156b
            e0.i r1 = r1.f9614d
            e0.f r1 = r1.e
            r0.add(r1)
            r2.f11139a = r14
        L_0x035a:
            java.util.ArrayList r0 = r2.f11148l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0364
            r2.f11141c = r5
        L_0x0364:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.d():void");
    }

    public final void e() {
        C0821e eVar = this.f11161h;
        if (eVar.f11146j) {
            this.f11156b.f9596O = eVar.f11144g;
        }
    }

    public final void f() {
        this.f11157c = null;
        this.f11161h.c();
        this.i.c();
        this.f11153k.c();
        this.e.c();
        this.f11160g = false;
    }

    public final boolean k() {
        if (this.f11158d != 3 || this.f11156b.f9619k == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f11160g = false;
        C0821e eVar = this.f11161h;
        eVar.c();
        eVar.f11146j = false;
        C0821e eVar2 = this.i;
        eVar2.c();
        eVar2.f11146j = false;
        C0821e eVar3 = this.f11153k;
        eVar3.c();
        eVar3.f11146j = false;
        this.e.f11146j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f11156b.f9604W;
    }
}
