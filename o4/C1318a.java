package o4;

import O4.a;
import O4.b;
import X5.C0353d;
import m4.C1214b;
import p4.C1342a;

/* renamed from: o4.a  reason: case insensitive filesystem */
public final class C1318a extends C0353d {

    /* renamed from: U  reason: collision with root package name */
    public final C1342a f14267U;

    /* renamed from: V  reason: collision with root package name */
    public final C1319b f14268V;

    public C1318a(C1342a aVar, C1214b bVar, a aVar2) {
        this.f14267U = aVar;
        b bVar2 = aVar2.f3651g;
        bVar.getClass();
        this.f14268V = new C1319b(bVar2.f3657d, bVar2.f3658f, bVar2.f3659g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b A[Catch:{ c -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[Catch:{ c -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void decode(T5.Y r10, S5.C0185n r11, java.util.List r12) {
        /*
            r9 = this;
            o4.b r0 = r9.f14268V
            int r1 = r11.readableBytes()
            r2 = 2
            if (r1 >= r2) goto L_0x000a
            return
        L_0x000a:
            int r1 = r11.readerIndex()
            short r2 = r11.readUnsignedByte()
            int r3 = r2 >> 4
            r2 = r2 & 15
            int r4 = G5.s.j(r11)
            r5 = 0
            if (r4 >= 0) goto L_0x002e
            r12 = -1
            if (r4 != r12) goto L_0x0026
            r11.readerIndex(r1)     // Catch:{ c -> 0x0024 }
            return
        L_0x0024:
            r12 = move-exception
            goto L_0x007d
        L_0x0026:
            o4.c r12 = new o4.c     // Catch:{ c -> 0x0024 }
            java.lang.String r0 = "malformed remaining length"
            r12.<init>(r0)     // Catch:{ c -> 0x0024 }
            throw r12     // Catch:{ c -> 0x0024 }
        L_0x002e:
            int r6 = r11.readerIndex()     // Catch:{ c -> 0x0024 }
            int r7 = r6 - r1
            int r7 = r7 + r4
            r0.getClass()     // Catch:{ c -> 0x0024 }
            r8 = 268435460(0x10000004, float:2.524356E-29)
            if (r7 > r8) goto L_0x0073
            int r7 = r11.writerIndex()     // Catch:{ c -> 0x0024 }
            int r6 = r6 + r4
            if (r7 >= r6) goto L_0x0048
            r11.readerIndex(r1)     // Catch:{ c -> 0x0024 }
            return
        L_0x0048:
            p4.a r1 = r9.f14267U     // Catch:{ c -> 0x0024 }
            if (r3 < 0) goto L_0x0055
            o4.d[] r1 = r1.f14639a     // Catch:{ c -> 0x0024 }
            int r4 = r1.length     // Catch:{ c -> 0x0024 }
            if (r3 < r4) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r1 = r1[r3]     // Catch:{ c -> 0x0024 }
            goto L_0x0059
        L_0x0055:
            r1.getClass()     // Catch:{ c -> 0x0024 }
        L_0x0058:
            r1 = r5
        L_0x0059:
            if (r1 == 0) goto L_0x0069
            r11.writerIndex(r6)     // Catch:{ c -> 0x0024 }
            L4.c r0 = r1.a(r2, r11, r0)     // Catch:{ c -> 0x0024 }
            r12.add(r0)     // Catch:{ c -> 0x0024 }
            r11.writerIndex(r7)     // Catch:{ c -> 0x0024 }
            goto L_0x00bc
        L_0x0069:
            o4.c r12 = new o4.c     // Catch:{ c -> 0x0024 }
            x5.b r0 = x5.C1607b.PROTOCOL_ERROR     // Catch:{ c -> 0x0024 }
            java.lang.String r1 = "must not receive this packet type"
            r12.<init>(r0, r1)     // Catch:{ c -> 0x0024 }
            throw r12     // Catch:{ c -> 0x0024 }
        L_0x0073:
            o4.c r12 = new o4.c     // Catch:{ c -> 0x0024 }
            x5.b r0 = x5.C1607b.PACKET_TOO_LARGE     // Catch:{ c -> 0x0024 }
            java.lang.String r1 = "incoming packet exceeded maximum packet size"
            r12.<init>(r0, r1)     // Catch:{ c -> 0x0024 }
            throw r12     // Catch:{ c -> 0x0024 }
        L_0x007d:
            r11.clear()
            r11 = 1
            if (r3 < r11) goto L_0x008d
            u5.b[] r0 = u5.C1495b.f15800j0
            int r1 = r0.length
            if (r3 <= r1) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            int r3 = r3 - r11
            r11 = r0[r3]
            goto L_0x0090
        L_0x008d:
            u5.b r11 = u5.C1495b.f15785U
        L_0x008f:
            r11 = r5
        L_0x0090:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception while decoding "
            r0.<init>(r1)
            if (r11 != 0) goto L_0x009b
            java.lang.String r11 = "UNKNOWN"
        L_0x009b:
            r0.append(r11)
            java.lang.String r11 = ": "
            r0.append(r11)
            java.lang.String r11 = r12.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            T5.K r10 = r10.channel()
            l5.a r0 = new l5.a
            r0.<init>(r11, r5)
            x5.b r11 = r12.f14272U
            G5.s.k(r10, r11, r0)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C1318a.decode(T5.Y, S5.n, java.util.List):void");
    }

    public final boolean isSharable() {
        return false;
    }
}
