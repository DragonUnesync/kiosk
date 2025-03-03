package g1;

import M0.r;
import P0.z;
import f1.C0896i;
import p1.G;
import p1.q;

public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public int f11885a;

    /* renamed from: b  reason: collision with root package name */
    public int f11886b;

    /* renamed from: c  reason: collision with root package name */
    public int f11887c;

    /* renamed from: d  reason: collision with root package name */
    public long f11888d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f11889f;

    /* renamed from: g  reason: collision with root package name */
    public Object f11890g;

    public g(C0896i iVar) {
        this.f11889f = iVar;
        this.f11888d = -9223372036854775807L;
        this.f11886b = -1;
    }

    public void a(long j7, long j8) {
        this.f11888d = j7;
        this.e = j8;
        this.f11887c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if ((r24.f() >> 6) == 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(P0.r r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f11890g
            p1.G r5 = (p1.G) r5
            P0.l.k(r5)
            int r5 = r0.f11886b
            r6 = -1
            if (r5 == r6) goto L_0x002d
            int r5 = f1.C0894g.a(r5)
            if (r2 == r5) goto L_0x002d
            int r7 = P0.z.f3748a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = N.e.v(r7, r5, r8, r2, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            P0.l.B(r7, r5)
        L_0x002d:
            int r5 = r24.a()
            java.lang.Object r7 = r0.f11890g
            p1.G r7 = (p1.G) r7
            r7.a(r5, r1)
            int r7 = r0.f11887c
            r8 = 0
            if (r7 != 0) goto L_0x0077
            byte[] r7 = r1.f3732a
            byte[] r9 = new byte[r3]
            r9 = {0, 0, 1, -74} // fill-array
            if (r7 == 0) goto L_0x006f
            r10 = 0
        L_0x0047:
            int r11 = r7.length
            int r11 = r11 + -3
            if (r10 >= r11) goto L_0x005b
            r11 = 0
        L_0x004d:
            if (r11 >= r3) goto L_0x005c
            int r12 = r10 + r11
            byte r12 = r7[r12]
            byte r13 = r9[r11]
            if (r12 == r13) goto L_0x0059
            int r10 = r10 + r4
            goto L_0x0047
        L_0x0059:
            int r11 = r11 + r4
            goto L_0x004d
        L_0x005b:
            r10 = -1
        L_0x005c:
            if (r10 == r6) goto L_0x006b
            int r10 = r10 + r3
            r1.H(r10)
            int r1 = r24.f()
            int r1 = r1 >> 6
            if (r1 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            r0.f11885a = r4
            goto L_0x0077
        L_0x006f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "array"
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r1 = r0.f11887c
            int r1 = r1 + r5
            r0.f11887c = r1
            if (r28 == 0) goto L_0x00b1
            long r3 = r0.f11888d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L_0x008d
            r0.f11888d = r3
        L_0x008d:
            long r9 = r0.e
            long r13 = r0.f11888d
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = N7.a.x(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f11890g
            r16 = r1
            p1.G r16 = (p1.G) r16
            int r1 = r0.f11885a
            int r3 = r0.f11887c
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.e(r17, r19, r20, r21, r22)
            r0.f11887c = r8
        L_0x00b1:
            r0.f11886b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.g.b(P0.r, long, int, boolean):void");
    }

    public void c(long j7) {
    }

    public void d(q qVar, int i) {
        G q7 = qVar.q(i, 2);
        this.f11890g = q7;
        int i8 = z.f3748a;
        q7.c(((C0896i) this.f11889f).f11548c);
    }

    public g(int i, int i8, r rVar, int i9, Object obj, long j7, long j8) {
        this.f11885a = i;
        this.f11886b = i8;
        this.f11889f = rVar;
        this.f11887c = i9;
        this.f11890g = obj;
        this.f11888d = j7;
        this.e = j8;
    }
}
