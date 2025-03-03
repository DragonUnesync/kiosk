package u2;

import v2.C1558a;
import v2.C1559b;
import v2.c;
import y2.C1628c;

public final class q extends p {

    /* renamed from: W  reason: collision with root package name */
    public final C1558a f15761W;

    /* renamed from: X  reason: collision with root package name */
    public C1558a f15762X;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r3.equals("invokeExact") == false) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(u2.u r3, u2.r r4) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            u2.t r0 = r4.f15764V
            u2.u r1 = u2.u.f15770Y
            boolean r1 = r3.equals(r1)
            u2.t r4 = r4.f15763U
            java.lang.String r0 = r0.f15766U
            if (r1 == 0) goto L_0x0028
            java.lang.String r3 = r4.f15766U
            r3.getClass()
            java.lang.String r4 = "invoke"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x01dc
            java.lang.String r4 = "invokeExact"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01dc
            goto L_0x01e3
        L_0x0028:
            u2.u r1 = u2.u.f15771Z
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x01e3
            java.lang.String r3 = r4.f15766U
            r3.getClass()
            r4 = -1
            int r1 = r3.hashCode()
            switch(r1) {
                case -1946504908: goto L_0x01ce;
                case -1686727776: goto L_0x01c3;
                case -1671098288: goto L_0x01b8;
                case -1292078254: goto L_0x01ad;
                case -1117944904: goto L_0x01a2;
                case -1103072857: goto L_0x0197;
                case -1032914329: goto L_0x018c;
                case -1032892181: goto L_0x0181;
                case -794517348: goto L_0x0173;
                case -567150350: goto L_0x0165;
                case -240822786: goto L_0x0157;
                case -230706875: goto L_0x0149;
                case -127361888: goto L_0x013b;
                case -37641530: goto L_0x012d;
                case 102230: goto L_0x011f;
                case 113762: goto L_0x0111;
                case 93645315: goto L_0x0103;
                case 101293086: goto L_0x00f5;
                case 189872914: goto L_0x00e7;
                case 282707520: goto L_0x00d9;
                case 282724865: goto L_0x00cb;
                case 353422447: goto L_0x00bd;
                case 470702883: goto L_0x00af;
                case 685319959: goto L_0x00a1;
                case 748071969: goto L_0x0093;
                case 937077366: goto L_0x0085;
                case 1245632875: goto L_0x0077;
                case 1352153939: goto L_0x0069;
                case 1483964149: goto L_0x005b;
                case 2002508693: goto L_0x004d;
                case 2013994287: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x01d8
        L_0x003f:
            java.lang.String r1 = "weakCompareAndSetRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0049
            goto L_0x01d8
        L_0x0049:
            r4 = 30
            goto L_0x01d8
        L_0x004d:
            java.lang.String r1 = "getAndSetAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0057
            goto L_0x01d8
        L_0x0057:
            r4 = 29
            goto L_0x01d8
        L_0x005b:
            java.lang.String r1 = "compareAndExchange"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0065
            goto L_0x01d8
        L_0x0065:
            r4 = 28
            goto L_0x01d8
        L_0x0069:
            java.lang.String r1 = "getAndBitwiseOr"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0073
            goto L_0x01d8
        L_0x0073:
            r4 = 27
            goto L_0x01d8
        L_0x0077:
            java.lang.String r1 = "getAndBitwiseXorAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0081
            goto L_0x01d8
        L_0x0081:
            r4 = 26
            goto L_0x01d8
        L_0x0085:
            java.lang.String r1 = "getAndAddAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x008f
            goto L_0x01d8
        L_0x008f:
            r4 = 25
            goto L_0x01d8
        L_0x0093:
            java.lang.String r1 = "compareAndExchangeAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x009d
            goto L_0x01d8
        L_0x009d:
            r4 = 24
            goto L_0x01d8
        L_0x00a1:
            java.lang.String r1 = "getOpaque"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00ab
            goto L_0x01d8
        L_0x00ab:
            r4 = 23
            goto L_0x01d8
        L_0x00af:
            java.lang.String r1 = "setOpaque"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00b9
            goto L_0x01d8
        L_0x00b9:
            r4 = 22
            goto L_0x01d8
        L_0x00bd:
            java.lang.String r1 = "getAndBitwiseAndAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00c7
            goto L_0x01d8
        L_0x00c7:
            r4 = 21
            goto L_0x01d8
        L_0x00cb:
            java.lang.String r1 = "getAndSet"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00d5
            goto L_0x01d8
        L_0x00d5:
            r4 = 20
            goto L_0x01d8
        L_0x00d9:
            java.lang.String r1 = "getAndAdd"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00e3
            goto L_0x01d8
        L_0x00e3:
            r4 = 19
            goto L_0x01d8
        L_0x00e7:
            java.lang.String r1 = "getVolatile"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00f1
            goto L_0x01d8
        L_0x00f1:
            r4 = 18
            goto L_0x01d8
        L_0x00f5:
            java.lang.String r1 = "setVolatile"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00ff
            goto L_0x01d8
        L_0x00ff:
            r4 = 17
            goto L_0x01d8
        L_0x0103:
            java.lang.String r1 = "getAndBitwiseOrAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x010d
            goto L_0x01d8
        L_0x010d:
            r4 = 16
            goto L_0x01d8
        L_0x0111:
            java.lang.String r1 = "set"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x011b
            goto L_0x01d8
        L_0x011b:
            r4 = 15
            goto L_0x01d8
        L_0x011f:
            java.lang.String r1 = "get"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0129
            goto L_0x01d8
        L_0x0129:
            r4 = 14
            goto L_0x01d8
        L_0x012d:
            java.lang.String r1 = "getAndSetRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0137
            goto L_0x01d8
        L_0x0137:
            r4 = 13
            goto L_0x01d8
        L_0x013b:
            java.lang.String r1 = "getAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0145
            goto L_0x01d8
        L_0x0145:
            r4 = 12
            goto L_0x01d8
        L_0x0149:
            java.lang.String r1 = "setRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0153
            goto L_0x01d8
        L_0x0153:
            r4 = 11
            goto L_0x01d8
        L_0x0157:
            java.lang.String r1 = "weakCompareAndSetAcquire"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0161
            goto L_0x01d8
        L_0x0161:
            r4 = 10
            goto L_0x01d8
        L_0x0165:
            java.lang.String r1 = "weakCompareAndSetPlain"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x016f
            goto L_0x01d8
        L_0x016f:
            r4 = 9
            goto L_0x01d8
        L_0x0173:
            java.lang.String r1 = "getAndBitwiseXorRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x017d
            goto L_0x01d8
        L_0x017d:
            r4 = 8
            goto L_0x01d8
        L_0x0181:
            java.lang.String r1 = "getAndBitwiseXor"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x018a
            goto L_0x01d8
        L_0x018a:
            r4 = 7
            goto L_0x01d8
        L_0x018c:
            java.lang.String r1 = "getAndBitwiseAnd"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0195
            goto L_0x01d8
        L_0x0195:
            r4 = 6
            goto L_0x01d8
        L_0x0197:
            java.lang.String r1 = "getAndAddRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01a0
            goto L_0x01d8
        L_0x01a0:
            r4 = 5
            goto L_0x01d8
        L_0x01a2:
            java.lang.String r1 = "weakCompareAndSet"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01ab
            goto L_0x01d8
        L_0x01ab:
            r4 = 4
            goto L_0x01d8
        L_0x01ad:
            java.lang.String r1 = "compareAndExchangeRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01d8
        L_0x01b6:
            r4 = 3
            goto L_0x01d8
        L_0x01b8:
            java.lang.String r1 = "compareAndSet"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01c1
            goto L_0x01d8
        L_0x01c1:
            r4 = 2
            goto L_0x01d8
        L_0x01c3:
            java.lang.String r1 = "getAndBitwiseAndRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01cc
            goto L_0x01d8
        L_0x01cc:
            r4 = 1
            goto L_0x01d8
        L_0x01ce:
            java.lang.String r1 = "getAndBitwiseOrRelease"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x01d7
            goto L_0x01d8
        L_0x01d7:
            r4 = 0
        L_0x01d8:
            switch(r4) {
                case 0: goto L_0x01dc;
                case 1: goto L_0x01dc;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01dc;
                case 4: goto L_0x01dc;
                case 5: goto L_0x01dc;
                case 6: goto L_0x01dc;
                case 7: goto L_0x01dc;
                case 8: goto L_0x01dc;
                case 9: goto L_0x01dc;
                case 10: goto L_0x01dc;
                case 11: goto L_0x01dc;
                case 12: goto L_0x01dc;
                case 13: goto L_0x01dc;
                case 14: goto L_0x01dc;
                case 15: goto L_0x01dc;
                case 16: goto L_0x01dc;
                case 17: goto L_0x01dc;
                case 18: goto L_0x01dc;
                case 19: goto L_0x01dc;
                case 20: goto L_0x01dc;
                case 21: goto L_0x01dc;
                case 22: goto L_0x01dc;
                case 23: goto L_0x01dc;
                case 24: goto L_0x01dc;
                case 25: goto L_0x01dc;
                case 26: goto L_0x01dc;
                case 27: goto L_0x01dc;
                case 28: goto L_0x01dc;
                case 29: goto L_0x01dc;
                case 30: goto L_0x01dc;
                default: goto L_0x01db;
            }
        L_0x01db:
            goto L_0x01e3
        L_0x01dc:
            v2.a r3 = v2.C1558a.b(r0)
            r2.f15761W = r3
            goto L_0x0201
        L_0x01e3:
            if (r0 == 0) goto L_0x0205
            j$.util.concurrent.ConcurrentHashMap r3 = v2.C1558a.f16000Y
            java.lang.Object r4 = r3.get(r0)
            v2.a r4 = (v2.C1558a) r4
            if (r4 == 0) goto L_0x01f0
            goto L_0x01ff
        L_0x01f0:
            v2.a r4 = v2.C1558a.b(r0)
            java.lang.String r0 = r4.f16001U
            java.lang.Object r3 = r3.putIfAbsent(r0, r4)
            v2.a r3 = (v2.C1558a) r3
            if (r3 == 0) goto L_0x01ff
            r4 = r3
        L_0x01ff:
            r2.f15761W = r4
        L_0x0201:
            r3 = 0
            r2.f15762X = r3
            return
        L_0x0205:
            j$.util.concurrent.ConcurrentHashMap r3 = v2.C1558a.f16000Y
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "descriptor == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.q.<init>(u2.u, u2.r):void");
    }

    public final int d(C1490a aVar) {
        p pVar = (p) aVar;
        int b8 = this.f15759U.compareTo(pVar.f15759U);
        if (b8 == 0) {
            b8 = this.f15760V.f15763U.compareTo(pVar.f15760V.f15763U);
        }
        if (b8 != 0) {
            return b8;
        }
        return this.f15761W.compareTo(((q) aVar).f15761W);
    }

    public final String e() {
        return "method";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [y2.f, v2.b, y2.c] */
    public final int f(boolean z) {
        C1558a aVar = this.f15761W;
        if (!z) {
            if (this.f15762X == null) {
                c cVar = this.f15759U.f15772U;
                aVar.getClass();
                String str = "(" + cVar.f16075U + aVar.f16001U.substring(1);
                Object[] objArr = aVar.f16003W.f16371V;
                int length = objArr.length;
                ? cVar2 = new C1628c(length + 1);
                cVar2.f(0, cVar);
                int i = 0;
                while (i < length) {
                    int i8 = i + 1;
                    cVar2.f(i8, objArr[i]);
                    i = i8;
                }
                cVar2.f16382U = false;
                C1558a aVar2 = new C1558a(str, aVar.f16002V, cVar2);
                C1558a aVar3 = (C1558a) C1558a.f16000Y.putIfAbsent(str, aVar2);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                }
                this.f15762X = aVar2;
            }
            aVar = this.f15762X;
        }
        C1559b bVar = aVar.f16003W;
        int length2 = bVar.f16371V.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            i9 += ((c) bVar.e(i10)).d();
        }
        return i9;
    }

    public final c getType() {
        return this.f15761W.f16002V;
    }
}
