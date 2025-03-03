package h1;

import H3.M;
import H3.O;
import H3.i0;
import K1.i;
import M0.A;
import M0.C;
import M0.C0115c;
import M0.C0132u;
import M0.C0135x;
import M0.C0136y;
import M0.C0137z;
import M0.F;
import M0.V;
import M0.X;
import P0.l;
import android.net.Uri;
import com.bumptech.glide.c;
import java.util.Collections;
import java.util.List;

public final class c0 extends X {

    /* renamed from: n  reason: collision with root package name */
    public static final Object f12442n = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f12443b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12444c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12445d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12446f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12447g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12448h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12449j;

    /* renamed from: k  reason: collision with root package name */
    public final i f12450k;

    /* renamed from: l  reason: collision with root package name */
    public final C f12451l;

    /* renamed from: m  reason: collision with root package name */
    public final C0136y f12452m;

    static {
        C0132u uVar = new C0132u();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        List emptyList = Collections.emptyList();
        i0 i0Var2 = i0.f2073Y;
        C0135x xVar = new C0135x();
        A a8 = A.f2783a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0137z(uri, (String) null, (c) null, emptyList, i0Var2, -9223372036854775807L);
        }
        uVar.a();
        xVar.a();
        F f8 = F.z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(long j7, boolean z, boolean z6, C c8) {
        this(-9223372036854775807L, -9223372036854775807L, j7, j7, 0, 0, z, false, false, (i) null, c8, z6 ? c8.f2787c : null);
    }

    public final int b(Object obj) {
        if (f12442n.equals(obj)) {
            return 0;
        }
        return -1;
    }

    public final V f(int i8, V v4, boolean z) {
        Object obj;
        l.g(i8, 1);
        if (z) {
            obj = f12442n;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        long j7 = -this.f12446f;
        v4.getClass();
        V v8 = v4;
        v8.h((Object) null, obj2, 0, this.f12445d, j7, C0115c.f2914c, false);
        return v4;
    }

    public final int h() {
        return 1;
    }

    public final Object l(int i8) {
        l.g(i8, 1);
        return f12442n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 > r5) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M0.W m(int r23, M0.W r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            P0.l.g(r2, r1)
            long r1 = r0.f12447g
            boolean r13 = r0.i
            if (r13 == 0) goto L_0x002c
            boolean r3 = r0.f12449j
            if (r3 != 0) goto L_0x002c
            r3 = 0
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0025
        L_0x0023:
            r15 = r3
            goto L_0x002d
        L_0x0025:
            long r1 = r1 + r25
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            r15 = r1
        L_0x002d:
            java.lang.Object r1 = M0.W.f2868q
            M0.y r14 = r0.f12452m
            long r1 = r0.e
            r17 = r1
            M0.C r4 = r0.f12451l
            K1.i r5 = r0.f12450k
            long r6 = r0.f12443b
            long r8 = r0.f12444c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f12448h
            r19 = 0
            long r1 = r0.f12446f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c0.m(int, M0.W, long):M0.W");
    }

    public final int o() {
        return 1;
    }

    public c0(long j7, long j8, long j9, long j10, long j11, long j12, boolean z, boolean z6, boolean z8, i iVar, C c8, C0136y yVar) {
        this.f12443b = j7;
        this.f12444c = j8;
        this.f12445d = j9;
        this.e = j10;
        this.f12446f = j11;
        this.f12447g = j12;
        this.f12448h = z;
        this.i = z6;
        this.f12449j = z8;
        this.f12450k = iVar;
        c8.getClass();
        this.f12451l = c8;
        this.f12452m = yVar;
    }
}
