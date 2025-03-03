package h1;

import K1.i;
import R0.g;
import U.d;
import android.content.Context;
import java.util.HashMap;
import p1.m;

/* renamed from: h1.p  reason: case insensitive filesystem */
public final class C1050p implements C1030A {

    /* renamed from: a  reason: collision with root package name */
    public final d f12500a;

    /* renamed from: b  reason: collision with root package name */
    public final A1.d f12501b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12502c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12503d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12504f;

    /* renamed from: g  reason: collision with root package name */
    public final float f12505g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12506h;

    public C1050p(Context context, m mVar) {
        A1.d dVar = new A1.d(context);
        this.f12501b = dVar;
        d dVar2 = new d(mVar, new i(9));
        this.f12500a = dVar2;
        if (dVar != ((A1.d) dVar2.f5260Y)) {
            dVar2.f5260Y = dVar;
            ((HashMap) dVar2.f5258W).clear();
            ((HashMap) dVar2.f5259X).clear();
        }
        this.f12502c = -9223372036854775807L;
        this.f12503d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f12504f = -3.4028235E38f;
        this.f12505g = -3.4028235E38f;
        this.f12506h = true;
    }

    public static C1030A d(Class cls, A1.d dVar) {
        try {
            return (C1030A) cls.getConstructor(new Class[]{g.class}).newInstance(new Object[]{dVar});
        } catch (Exception e8) {
            throw new IllegalStateException(e8);
        }
    }

    public final C1030A a(boolean z) {
        this.f12506h = z;
        d dVar = this.f12500a;
        dVar.f5256U = z;
        m mVar = (m) dVar.f5257V;
        synchronized (mVar) {
            mVar.f14415b = z;
        }
        for (C1030A a8 : ((HashMap) dVar.f5259X).values()) {
            a8.a(z);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: h1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: M0.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: M0.w} */
    /* JADX WARNING: type inference failed for: r11v0, types: [M0.u, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h1.C1035a b(M0.C r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            M0.z r2 = r0.f2786b
            r2.getClass()
            M0.z r2 = r0.f2786b
            android.net.Uri r2 = r2.f3060a
            java.lang.String r2 = r2.getScheme()
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.String r4 = "ssai"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            throw r3
        L_0x001e:
            M0.z r2 = r0.f2786b
            java.lang.String r2 = r2.f3061b
            java.lang.String r4 = "application/x-image-uri"
            boolean r2 = j$.util.Objects.equals(r2, r4)
            if (r2 != 0) goto L_0x021f
            M0.z r2 = r0.f2786b
            android.net.Uri r4 = r2.f3060a
            java.lang.String r2 = r2.f3061b
            int r2 = P0.z.H(r4, r2)
            M0.z r4 = r0.f2786b
            long r4 = r4.e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0050
            U.d r4 = r1.f12500a
            java.lang.Object r4 = r4.f5257V
            p1.m r4 = (p1.m) r4
            monitor-enter(r4)
            r4.f14417d = r8     // Catch:{ all -> 0x004d }
            monitor-exit(r4)
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            U.d r4 = r1.f12500a     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Object r5 = r4.f5259X     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ ClassNotFoundException -> 0x0218 }
            h1.A r9 = (h1.C1030A) r9     // Catch:{ ClassNotFoundException -> 0x0218 }
            if (r9 == 0) goto L_0x0063
            goto L_0x0080
        L_0x0063:
            G3.i r9 = r4.f(r2)     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Object r9 = r9.get()     // Catch:{ ClassNotFoundException -> 0x0218 }
            h1.A r9 = (h1.C1030A) r9     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Object r10 = r4.f5261Z     // Catch:{ ClassNotFoundException -> 0x0218 }
            K1.i r10 = (K1.i) r10     // Catch:{ ClassNotFoundException -> 0x0218 }
            r9.c(r10)     // Catch:{ ClassNotFoundException -> 0x0218 }
            boolean r4 = r4.f5256U     // Catch:{ ClassNotFoundException -> 0x0218 }
            r9.a(r4)     // Catch:{ ClassNotFoundException -> 0x0218 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x0218 }
            r5.put(r2, r9)     // Catch:{ ClassNotFoundException -> 0x0218 }
        L_0x0080:
            M0.y r2 = r0.f2787c
            M0.x r2 = r2.a()
            M0.y r4 = r0.f2787c
            long r10 = r4.f3056a
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0092
            long r10 = r1.f12502c
            r2.f3052a = r10
        L_0x0092:
            float r5 = r4.f3059d
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x009f
            float r5 = r1.f12504f
            r2.f3055d = r5
        L_0x009f:
            float r5 = r4.e
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00a9
            float r5 = r1.f12505g
            r2.e = r5
        L_0x00a9:
            long r10 = r4.f3057b
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00b3
            long r10 = r1.f12503d
            r2.f3053b = r10
        L_0x00b3:
            long r4 = r4.f3058c
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00bd
            long r4 = r1.e
            r2.f3054c = r4
        L_0x00bd:
            M0.y r4 = new M0.y
            r4.<init>(r2)
            M0.y r2 = r0.f2787c
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x014d
            H3.M r2 = H3.O.f2026V
            H3.i0 r2 = H3.i0.f2073Y
            java.util.List r2 = java.util.Collections.emptyList()
            H3.i0 r5 = H3.i0.f2073Y
            M0.A r10 = M0.A.f2783a
            M0.w r10 = r0.e
            M0.u r11 = new M0.u
            r11.<init>()
            long r12 = r10.f3051a
            r11.f3050a = r12
            java.lang.String r10 = r0.f2785a
            M0.F r12 = r0.f2788d
            M0.y r13 = r0.f2787c
            r13.a()
            M0.A r13 = r0.f2789f
            M0.z r0 = r0.f2786b
            if (r0 == 0) goto L_0x0109
            java.lang.String r2 = r0.f3061b
            android.net.Uri r5 = r0.f3060a
            java.util.List r6 = r0.f3062c
            H3.O r7 = r0.f3063d
            H3.M r14 = H3.O.f2026V
            H3.i0 r14 = H3.i0.f2073Y
            long r14 = r0.e
            r18 = r2
            r17 = r5
            r20 = r6
            r21 = r7
            r22 = r14
            goto L_0x0113
        L_0x0109:
            r20 = r2
            r17 = r3
            r18 = r17
            r21 = r5
            r22 = r6
        L_0x0113:
            M0.x r0 = r4.a()
            r19 = 0
            if (r17 == 0) goto L_0x0125
            M0.z r2 = new M0.z
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r17 = r2
            goto L_0x0127
        L_0x0125:
            r17 = r19
        L_0x0127:
            M0.C r2 = new M0.C
            if (r10 == 0) goto L_0x012d
        L_0x012b:
            r15 = r10
            goto L_0x0130
        L_0x012d:
            java.lang.String r10 = ""
            goto L_0x012b
        L_0x0130:
            M0.w r4 = new M0.w
            r4.<init>(r11)
            M0.y r5 = new M0.y
            r5.<init>(r0)
            if (r12 == 0) goto L_0x013f
        L_0x013c:
            r19 = r12
            goto L_0x0142
        L_0x013f:
            M0.F r12 = M0.F.z
            goto L_0x013c
        L_0x0142:
            r14 = r2
            r16 = r4
            r18 = r5
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = r2
        L_0x014d:
            h1.a r2 = r9.b(r0)
            M0.z r4 = r0.f2786b
            H3.O r4 = r4.f3063d
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x01fc
            int r5 = r4.size()
            int r5 = r5 + r8
            h1.a[] r5 = new h1.C1035a[r5]
            r6 = 0
            r5[r6] = r2
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x01f7
            boolean r0 = r1.f12506h
            if (r0 == 0) goto L_0x01c7
            M0.q r0 = new M0.q
            r0.<init>()
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            java.util.ArrayList r2 = M0.I.f2839a
            r0.f2999m = r3
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            r0.f2992d = r3
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            r0.e = r6
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            r0.f2993f = r6
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            r0.f2990b = r3
            java.lang.Object r2 = r4.get(r6)
            M0.B r2 = (M0.B) r2
            r2.getClass()
            r0.f2989a = r3
            M0.r r2 = new M0.r
            r2.<init>(r0)
            java.lang.Object r0 = r4.get(r6)
            M0.B r0 = (M0.B) r0
            r0.getClass()
            throw r3
        L_0x01c7:
            A1.d r0 = r1.f12501b
            r0.getClass()
            java.lang.Object r0 = r4.get(r6)
            M0.B r0 = (M0.B) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r8)
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            H3.M r2 = H3.O.f2026V
            H3.i0 r2 = H3.i0.f2073Y
            java.util.Collections.emptyList()
            H3.i0 r2 = H3.i0.f2073Y
            M0.A r2 = M0.A.f2783a
            android.net.Uri r2 = android.net.Uri.EMPTY
            r0.getClass()
            throw r3
        L_0x01f7:
            h1.K r2 = new h1.K
            r2.<init>(r5)
        L_0x01fc:
            M0.w r3 = r0.e
            long r3 = r3.f3051a
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0207
            goto L_0x020d
        L_0x0207:
            h1.g r5 = new h1.g
            r5.<init>(r2, r3, r8)
            r2 = r5
        L_0x020d:
            M0.z r3 = r0.f2786b
            r3.getClass()
            M0.z r0 = r0.f2786b
            r0.getClass()
            return r2
        L_0x0218:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x021f:
            M0.z r0 = r0.f2786b
            long r4 = r0.e
            int r0 = P0.z.f3748a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1050p.b(M0.C):h1.a");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h1.C1030A c(K1.i r3) {
        /*
            r2 = this;
            U.d r0 = r2.f12500a
            r0.f5261Z = r3
            java.lang.Object r1 = r0.f5257V
            p1.m r1 = (p1.m) r1
            monitor-enter(r1)
            r1.f14416c = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            java.lang.Object r0 = r0.f5259X
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()
            h1.A r1 = (h1.C1030A) r1
            r1.c(r3)
            goto L_0x0018
        L_0x0028:
            return r2
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r3
        L_0x002b:
            r3 = move-exception
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1050p.c(K1.i):h1.A");
    }
}
