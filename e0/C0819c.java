package e0;

import Q0.g;
import d0.C0629c;
import d0.d;
import d0.e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e0.c  reason: case insensitive filesystem */
public final class C0819c extends l {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f11137k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f11138l;

    public C0819c(d dVar, int i) {
        super(dVar);
        d dVar2;
        Object obj;
        int i8;
        Object obj2;
        this.f11159f = i;
        d dVar3 = this.f11156b;
        d k8 = dVar3.k(i);
        while (true) {
            d dVar4 = k8;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            k8 = dVar3.k(this.f11159f);
        }
        this.f11156b = dVar2;
        int i9 = this.f11159f;
        if (i9 == 0) {
            obj = dVar2.f9614d;
        } else if (i9 == 1) {
            obj = dVar2.e;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.f11137k;
        arrayList.add(obj);
        d j7 = dVar2.j(this.f11159f);
        while (j7 != null) {
            int i10 = this.f11159f;
            if (i10 == 0) {
                obj2 = j7.f9614d;
            } else if (i10 == 1) {
                obj2 = j7.e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            j7 = j7.j(this.f11159f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            int i11 = this.f11159f;
            if (i11 == 0) {
                lVar.f11156b.f9610b = this;
            } else if (i11 == 1) {
                lVar.f11156b.f9612c = this;
            }
        }
        if (this.f11159f == 0 && ((e) this.f11156b.f9590I).f9638h0 && arrayList.size() > 1) {
            this.f11156b = ((l) g.l(1, arrayList)).f11156b;
        }
        if (this.f11159f == 0) {
            i8 = this.f11156b.f9605X;
        } else {
            i8 = this.f11156b.f9606Y;
        }
        this.f11138l = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a1, code lost:
        if (r2 != r3) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c1, code lost:
        if (r2 != r3) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(e0.C0820d r27) {
        /*
            r26 = this;
            r0 = r26
            e0.e r1 = r0.f11161h
            boolean r2 = r1.f11146j
            if (r2 == 0) goto L_0x03e8
            e0.e r2 = r0.i
            boolean r3 = r2.f11146j
            if (r3 != 0) goto L_0x0010
            goto L_0x03e8
        L_0x0010:
            d0.d r3 = r0.f11156b
            d0.d r3 = r3.f9590I
            if (r3 == 0) goto L_0x001f
            boolean r5 = r3 instanceof d0.e
            if (r5 == 0) goto L_0x001f
            d0.e r3 = (d0.e) r3
            boolean r3 = r3.f9638h0
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            int r5 = r2.f11144g
            int r6 = r1.f11144g
            int r5 = r5 - r6
            java.util.ArrayList r6 = r0.f11137k
            int r7 = r6.size()
            r8 = 0
        L_0x002c:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x0040
            java.lang.Object r11 = r6.get(r8)
            e0.l r11 = (e0.l) r11
            d0.d r11 = r11.f11156b
            int r11 = r11.f9603V
            if (r11 != r10) goto L_0x0041
            int r8 = r8 + 1
            goto L_0x002c
        L_0x0040:
            r8 = -1
        L_0x0041:
            int r11 = r7 + -1
            r12 = r11
        L_0x0044:
            if (r12 < 0) goto L_0x0056
            java.lang.Object r13 = r6.get(r12)
            e0.l r13 = (e0.l) r13
            d0.d r13 = r13.f11156b
            int r13 = r13.f9603V
            if (r13 != r10) goto L_0x0055
            int r12 = r12 + -1
            goto L_0x0044
        L_0x0055:
            r9 = r12
        L_0x0056:
            r12 = 0
        L_0x0057:
            r4 = 2
            if (r12 >= r4) goto L_0x0109
            r4 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0062:
            if (r4 >= r7) goto L_0x00f1
            java.lang.Object r20 = r6.get(r4)
            r13 = r20
            e0.l r13 = (e0.l) r13
            d0.d r15 = r13.f11156b
            r21 = r6
            int r6 = r15.f9603V
            if (r6 != r10) goto L_0x0078
            r23 = r8
            goto L_0x00e7
        L_0x0078:
            int r18 = r18 + 1
            if (r4 <= 0) goto L_0x0083
            if (r4 < r8) goto L_0x0083
            e0.e r6 = r13.f11161h
            int r6 = r6.f11143f
            int r14 = r14 + r6
        L_0x0083:
            e0.f r6 = r13.e
            int r10 = r6.f11144g
            r22 = r10
            int r10 = r13.f11158d
            r23 = r8
            r8 = 3
            if (r10 == r8) goto L_0x0092
            r8 = 1
            goto L_0x0093
        L_0x0092:
            r8 = 0
        L_0x0093:
            if (r8 == 0) goto L_0x00b1
            int r6 = r0.f11159f
            if (r6 != 0) goto L_0x00a2
            e0.i r10 = r15.f9614d
            e0.f r10 = r10.e
            boolean r10 = r10.f11146j
            if (r10 != 0) goto L_0x00a2
            return
        L_0x00a2:
            r10 = 1
            if (r6 != r10) goto L_0x00ae
            e0.k r6 = r15.e
            e0.f r6 = r6.e
            boolean r6 = r6.f11146j
            if (r6 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r24 = r8
            goto L_0x00c8
        L_0x00b1:
            r24 = r8
            r10 = 1
            int r8 = r13.f11155a
            if (r8 != r10) goto L_0x00c1
            if (r12 != 0) goto L_0x00c1
            int r10 = r6.f11149m
            int r17 = r17 + 1
        L_0x00be:
            r24 = 1
            goto L_0x00ca
        L_0x00c1:
            boolean r6 = r6.f11146j
            if (r6 == 0) goto L_0x00c8
            r10 = r22
            goto L_0x00be
        L_0x00c8:
            r10 = r22
        L_0x00ca:
            if (r24 != 0) goto L_0x00dc
            int r17 = r17 + 1
            float[] r6 = r15.f9607Z
            int r8 = r0.f11159f
            r6 = r6[r8]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00dd
            float r19 = r19 + r6
            goto L_0x00dd
        L_0x00dc:
            int r14 = r14 + r10
        L_0x00dd:
            if (r4 >= r11) goto L_0x00e7
            if (r4 >= r9) goto L_0x00e7
            e0.e r6 = r13.i
            int r6 = r6.f11143f
            int r6 = -r6
            int r14 = r14 + r6
        L_0x00e7:
            int r4 = r4 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0062
        L_0x00f1:
            r21 = r6
            r23 = r8
            if (r14 < r5) goto L_0x0104
            if (r17 != 0) goto L_0x00fa
            goto L_0x0104
        L_0x00fa:
            int r12 = r12 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0057
        L_0x0104:
            r4 = r17
            r6 = r18
            goto L_0x0112
        L_0x0109:
            r21 = r6
            r23 = r8
            r4 = 0
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x0112:
            int r1 = r1.f11144g
            if (r3 == 0) goto L_0x0118
            int r1 = r2.f11144g
        L_0x0118:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r5) goto L_0x012f
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0128
            int r10 = r14 - r5
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 + r8
            goto L_0x012f
        L_0x0128:
            int r10 = r14 - r5
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 - r8
        L_0x012f:
            if (r4 <= 0) goto L_0x022e
            int r8 = r5 - r14
            float r8 = (float) r8
            float r10 = (float) r4
            float r10 = r8 / r10
            float r10 = r10 + r2
            int r10 = (int) r10
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r7) goto L_0x01db
            r15 = r21
            java.lang.Object r17 = r15.get(r12)
            r2 = r17
            e0.l r2 = (e0.l) r2
            r17 = r10
            d0.d r10 = r2.f11156b
            r21 = r14
            int r14 = r10.f9603V
            r22 = r1
            r1 = 8
            if (r14 != r1) goto L_0x015b
        L_0x0155:
            r24 = r3
            r25 = r8
            goto L_0x01c9
        L_0x015b:
            int r1 = r2.f11158d
            r14 = 3
            if (r1 != r14) goto L_0x0155
            e0.f r1 = r2.e
            boolean r14 = r1.f11146j
            if (r14 != 0) goto L_0x0155
            r14 = 0
            int r16 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x017c
            float[] r14 = r10.f9607Z
            r24 = r3
            int r3 = r0.f11159f
            r3 = r14[r3]
            float r3 = r3 * r8
            float r3 = r3 / r19
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x0180
        L_0x017c:
            r24 = r3
            r3 = r17
        L_0x0180:
            int r14 = r0.f11159f
            if (r14 != 0) goto L_0x01a4
            int r14 = r10.f9622n
            int r10 = r10.f9621m
            int r2 = r2.f11155a
            r25 = r8
            r8 = 1
            if (r2 != r8) goto L_0x0196
            int r2 = r1.f11149m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x0197
        L_0x0196:
            r2 = r3
        L_0x0197:
            int r2 = java.lang.Math.max(r10, r2)
            if (r14 <= 0) goto L_0x01a1
            int r2 = java.lang.Math.min(r14, r2)
        L_0x01a1:
            if (r2 == r3) goto L_0x01c6
            goto L_0x01c3
        L_0x01a4:
            r25 = r8
            int r8 = r10.f9625q
            int r10 = r10.f9624p
            int r2 = r2.f11155a
            r14 = 1
            if (r2 != r14) goto L_0x01b6
            int r2 = r1.f11149m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x01b7
        L_0x01b6:
            r2 = r3
        L_0x01b7:
            int r2 = java.lang.Math.max(r10, r2)
            if (r8 <= 0) goto L_0x01c1
            int r2 = java.lang.Math.min(r8, r2)
        L_0x01c1:
            if (r2 == r3) goto L_0x01c6
        L_0x01c3:
            int r13 = r13 + 1
            r3 = r2
        L_0x01c6:
            r1.d(r3)
        L_0x01c9:
            int r12 = r12 + 1
            r10 = r17
            r14 = r21
            r1 = r22
            r3 = r24
            r8 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            r21 = r15
            goto L_0x013b
        L_0x01db:
            r22 = r1
            r24 = r3
            r15 = r21
            r21 = r14
            if (r13 <= 0) goto L_0x021d
            int r4 = r4 - r13
            r1 = 0
            r14 = 0
        L_0x01e8:
            if (r1 >= r7) goto L_0x021a
            java.lang.Object r2 = r15.get(r1)
            e0.l r2 = (e0.l) r2
            d0.d r3 = r2.f11156b
            int r3 = r3.f9603V
            r8 = 8
            if (r3 != r8) goto L_0x01fb
            r8 = r23
            goto L_0x0215
        L_0x01fb:
            r8 = r23
            if (r1 <= 0) goto L_0x0206
            if (r1 < r8) goto L_0x0206
            e0.e r3 = r2.f11161h
            int r3 = r3.f11143f
            int r14 = r14 + r3
        L_0x0206:
            e0.f r3 = r2.e
            int r3 = r3.f11144g
            int r14 = r14 + r3
            if (r1 >= r11) goto L_0x0215
            if (r1 >= r9) goto L_0x0215
            e0.e r2 = r2.i
            int r2 = r2.f11143f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x0215:
            int r1 = r1 + 1
            r23 = r8
            goto L_0x01e8
        L_0x021a:
            r8 = r23
            goto L_0x0221
        L_0x021d:
            r8 = r23
            r14 = r21
        L_0x0221:
            int r1 = r0.f11138l
            r2 = 2
            if (r1 != r2) goto L_0x022c
            if (r13 != 0) goto L_0x022c
            r1 = 0
            r0.f11138l = r1
            goto L_0x023a
        L_0x022c:
            r1 = 0
            goto L_0x023a
        L_0x022e:
            r22 = r1
            r24 = r3
            r15 = r21
            r8 = r23
            r1 = 0
            r2 = 2
            r21 = r14
        L_0x023a:
            if (r14 <= r5) goto L_0x023e
            r0.f11138l = r2
        L_0x023e:
            if (r6 <= 0) goto L_0x0246
            if (r4 != 0) goto L_0x0246
            if (r8 != r9) goto L_0x0246
            r0.f11138l = r2
        L_0x0246:
            int r2 = r0.f11138l
            r3 = 1
            if (r2 != r3) goto L_0x02d2
            if (r6 <= r3) goto L_0x0251
            int r5 = r5 - r14
            int r6 = r6 - r3
            int r5 = r5 / r6
            goto L_0x0258
        L_0x0251:
            if (r6 != r3) goto L_0x0257
            int r5 = r5 - r14
            r2 = 2
            int r5 = r5 / r2
            goto L_0x0258
        L_0x0257:
            r5 = 0
        L_0x0258:
            if (r4 <= 0) goto L_0x025b
            r5 = 0
        L_0x025b:
            r1 = r22
            r4 = 0
        L_0x025e:
            if (r4 >= r7) goto L_0x03e8
            if (r24 == 0) goto L_0x0267
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L_0x0268
        L_0x0267:
            r2 = r4
        L_0x0268:
            java.lang.Object r2 = r15.get(r2)
            e0.l r2 = (e0.l) r2
            d0.d r3 = r2.f11156b
            int r3 = r3.f9603V
            e0.e r6 = r2.i
            e0.e r10 = r2.f11161h
            r12 = 8
            if (r3 != r12) goto L_0x0281
            r10.d(r1)
            r6.d(r1)
            goto L_0x02cf
        L_0x0281:
            if (r4 <= 0) goto L_0x0288
            if (r24 == 0) goto L_0x0287
            int r1 = r1 - r5
            goto L_0x0288
        L_0x0287:
            int r1 = r1 + r5
        L_0x0288:
            if (r4 <= 0) goto L_0x0295
            if (r4 < r8) goto L_0x0295
            if (r24 == 0) goto L_0x0292
            int r3 = r10.f11143f
            int r1 = r1 - r3
            goto L_0x0295
        L_0x0292:
            int r3 = r10.f11143f
            int r1 = r1 + r3
        L_0x0295:
            if (r24 == 0) goto L_0x029b
            r6.d(r1)
            goto L_0x029e
        L_0x029b:
            r10.d(r1)
        L_0x029e:
            e0.f r3 = r2.e
            int r12 = r3.f11144g
            int r13 = r2.f11158d
            r14 = 3
            if (r13 != r14) goto L_0x02ae
            int r13 = r2.f11155a
            r14 = 1
            if (r13 != r14) goto L_0x02ae
            int r12 = r3.f11149m
        L_0x02ae:
            if (r24 == 0) goto L_0x02b2
            int r1 = r1 - r12
            goto L_0x02b3
        L_0x02b2:
            int r1 = r1 + r12
        L_0x02b3:
            if (r24 == 0) goto L_0x02ba
            r10.d(r1)
        L_0x02b8:
            r3 = 1
            goto L_0x02be
        L_0x02ba:
            r6.d(r1)
            goto L_0x02b8
        L_0x02be:
            r2.f11160g = r3
            if (r4 >= r11) goto L_0x02cf
            if (r4 >= r9) goto L_0x02cf
            if (r24 == 0) goto L_0x02cb
            int r2 = r6.f11143f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x02cf
        L_0x02cb:
            int r2 = r6.f11143f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x02cf:
            int r4 = r4 + 1
            goto L_0x025e
        L_0x02d2:
            if (r2 != 0) goto L_0x0350
            int r5 = r5 - r14
            r2 = 1
            int r6 = r6 + r2
            int r5 = r5 / r6
            if (r4 <= 0) goto L_0x02db
            r5 = 0
        L_0x02db:
            r1 = r22
            r4 = 0
        L_0x02de:
            if (r4 >= r7) goto L_0x03e8
            if (r24 == 0) goto L_0x02e7
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L_0x02e8
        L_0x02e7:
            r2 = r4
        L_0x02e8:
            java.lang.Object r2 = r15.get(r2)
            e0.l r2 = (e0.l) r2
            d0.d r3 = r2.f11156b
            int r3 = r3.f9603V
            e0.e r6 = r2.i
            e0.e r10 = r2.f11161h
            r12 = 8
            if (r3 != r12) goto L_0x0301
            r10.d(r1)
            r6.d(r1)
            goto L_0x034d
        L_0x0301:
            if (r24 == 0) goto L_0x0305
            int r1 = r1 - r5
            goto L_0x0306
        L_0x0305:
            int r1 = r1 + r5
        L_0x0306:
            if (r4 <= 0) goto L_0x0313
            if (r4 < r8) goto L_0x0313
            if (r24 == 0) goto L_0x0310
            int r3 = r10.f11143f
            int r1 = r1 - r3
            goto L_0x0313
        L_0x0310:
            int r3 = r10.f11143f
            int r1 = r1 + r3
        L_0x0313:
            if (r24 == 0) goto L_0x0319
            r6.d(r1)
            goto L_0x031c
        L_0x0319:
            r10.d(r1)
        L_0x031c:
            e0.f r3 = r2.e
            int r12 = r3.f11144g
            int r13 = r2.f11158d
            r14 = 3
            if (r13 != r14) goto L_0x0330
            int r2 = r2.f11155a
            r13 = 1
            if (r2 != r13) goto L_0x0330
            int r2 = r3.f11149m
            int r12 = java.lang.Math.min(r12, r2)
        L_0x0330:
            if (r24 == 0) goto L_0x0334
            int r1 = r1 - r12
            goto L_0x0335
        L_0x0334:
            int r1 = r1 + r12
        L_0x0335:
            if (r24 == 0) goto L_0x033b
            r10.d(r1)
            goto L_0x033e
        L_0x033b:
            r6.d(r1)
        L_0x033e:
            if (r4 >= r11) goto L_0x034d
            if (r4 >= r9) goto L_0x034d
            if (r24 == 0) goto L_0x0349
            int r2 = r6.f11143f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x034d
        L_0x0349:
            int r2 = r6.f11143f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x034d:
            int r4 = r4 + 1
            goto L_0x02de
        L_0x0350:
            r3 = 2
            if (r2 != r3) goto L_0x03e8
            int r2 = r0.f11159f
            if (r2 != 0) goto L_0x035c
            d0.d r2 = r0.f11156b
            float r2 = r2.f9600S
            goto L_0x0360
        L_0x035c:
            d0.d r2 = r0.f11156b
            float r2 = r2.f9601T
        L_0x0360:
            if (r24 == 0) goto L_0x0366
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 - r2
        L_0x0366:
            int r5 = r5 - r14
            float r3 = (float) r5
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0372
            if (r4 <= 0) goto L_0x0373
        L_0x0372:
            r2 = 0
        L_0x0373:
            if (r24 == 0) goto L_0x0378
            int r2 = r22 - r2
            goto L_0x037a
        L_0x0378:
            int r2 = r22 + r2
        L_0x037a:
            r4 = 0
        L_0x037b:
            if (r4 >= r7) goto L_0x03e8
            if (r24 == 0) goto L_0x0384
            int r1 = r4 + 1
            int r1 = r7 - r1
            goto L_0x0385
        L_0x0384:
            r1 = r4
        L_0x0385:
            java.lang.Object r1 = r15.get(r1)
            e0.l r1 = (e0.l) r1
            d0.d r3 = r1.f11156b
            int r3 = r3.f9603V
            e0.e r5 = r1.i
            e0.e r6 = r1.f11161h
            r10 = 8
            if (r3 != r10) goto L_0x03a0
            r6.d(r2)
            r5.d(r2)
            r13 = 1
            r14 = 3
            goto L_0x03e5
        L_0x03a0:
            if (r4 <= 0) goto L_0x03ad
            if (r4 < r8) goto L_0x03ad
            if (r24 == 0) goto L_0x03aa
            int r3 = r6.f11143f
            int r2 = r2 - r3
            goto L_0x03ad
        L_0x03aa:
            int r3 = r6.f11143f
            int r2 = r2 + r3
        L_0x03ad:
            if (r24 == 0) goto L_0x03b3
            r5.d(r2)
            goto L_0x03b6
        L_0x03b3:
            r6.d(r2)
        L_0x03b6:
            e0.f r3 = r1.e
            int r12 = r3.f11144g
            int r13 = r1.f11158d
            r14 = 3
            if (r13 != r14) goto L_0x03c7
            int r1 = r1.f11155a
            r13 = 1
            if (r1 != r13) goto L_0x03c8
            int r12 = r3.f11149m
            goto L_0x03c8
        L_0x03c7:
            r13 = 1
        L_0x03c8:
            if (r24 == 0) goto L_0x03cc
            int r2 = r2 - r12
            goto L_0x03cd
        L_0x03cc:
            int r2 = r2 + r12
        L_0x03cd:
            if (r24 == 0) goto L_0x03d3
            r6.d(r2)
            goto L_0x03d6
        L_0x03d3:
            r5.d(r2)
        L_0x03d6:
            if (r4 >= r11) goto L_0x03e5
            if (r4 >= r9) goto L_0x03e5
            if (r24 == 0) goto L_0x03e1
            int r1 = r5.f11143f
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03e5
        L_0x03e1:
            int r1 = r5.f11143f
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03e5:
            int r4 = r4 + 1
            goto L_0x037b
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0819c.a(e0.d):void");
    }

    public final void d() {
        ArrayList arrayList = this.f11137k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            d dVar = ((l) arrayList.get(0)).f11156b;
            d dVar2 = ((l) arrayList.get(size - 1)).f11156b;
            int i = this.f11159f;
            C0821e eVar = this.i;
            C0821e eVar2 = this.f11161h;
            if (i == 0) {
                C0629c cVar = dVar.f9632x;
                C0629c cVar2 = dVar2.z;
                C0821e i8 = l.i(cVar, 0);
                int c8 = cVar.c();
                d m8 = m();
                if (m8 != null) {
                    c8 = m8.f9632x.c();
                }
                if (i8 != null) {
                    l.b(eVar2, i8, c8);
                }
                C0821e i9 = l.i(cVar2, 0);
                int c9 = cVar2.c();
                d n4 = n();
                if (n4 != null) {
                    c9 = n4.z.c();
                }
                if (i9 != null) {
                    l.b(eVar, i9, -c9);
                }
            } else {
                C0629c cVar3 = dVar.f9633y;
                C0629c cVar4 = dVar2.f9582A;
                C0821e i10 = l.i(cVar3, 1);
                int c10 = cVar3.c();
                d m9 = m();
                if (m9 != null) {
                    c10 = m9.f9633y.c();
                }
                if (i10 != null) {
                    l.b(eVar2, i10, c10);
                }
                C0821e i11 = l.i(cVar4, 1);
                int c11 = cVar4.c();
                d n5 = n();
                if (n5 != null) {
                    c11 = n5.f9582A.c();
                }
                if (i11 != null) {
                    l.b(eVar, i11, -c11);
                }
            }
            eVar2.f11139a = this;
            eVar.f11139a = this;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11137k;
            if (i < arrayList.size()) {
                ((l) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.f11157c = null;
        Iterator it = this.f11137k.iterator();
        while (it.hasNext()) {
            ((l) it.next()).f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.f11137k;
        int size = arrayList.size();
        long j7 = 0;
        for (int i = 0; i < size; i++) {
            l lVar = (l) arrayList.get(i);
            j7 = ((long) lVar.i.f11143f) + lVar.j() + j7 + ((long) lVar.f11161h.f11143f);
        }
        return j7;
    }

    public final boolean k() {
        ArrayList arrayList = this.f11137k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((l) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11137k;
            if (i >= arrayList.size()) {
                return null;
            }
            d dVar = ((l) arrayList.get(i)).f11156b;
            if (dVar.f9603V != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final d n() {
        ArrayList arrayList = this.f11137k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = ((l) arrayList.get(size)).f11156b;
            if (dVar.f9603V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f11159f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        Iterator it = this.f11137k.iterator();
        while (it.hasNext()) {
            String x8 = N.e.x(concat, "<");
            concat = N.e.x(x8 + ((l) it.next()), "> ");
        }
        return concat;
    }
}
