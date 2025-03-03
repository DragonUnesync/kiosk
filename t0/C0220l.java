package T0;

import M0.K;
import M0.r;
import N.e;
import P0.l;
import P0.z;
import android.os.Bundle;
import h1.C1031B;

/* renamed from: T0.l  reason: case insensitive filesystem */
public final class C0220l extends K {

    /* renamed from: W  reason: collision with root package name */
    public final int f4864W;

    /* renamed from: X  reason: collision with root package name */
    public final String f4865X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f4866Y;

    /* renamed from: Z  reason: collision with root package name */
    public final r f4867Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f4868a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C1031B f4869b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f4870c0;

    static {
        e.D(1001, 1002, 1003, 1004, 1005);
        z.J(1006);
    }

    public C0220l(int i, Exception exc, int i8) {
        this(i, exc, i8, (String) null, -1, (r) null, 4, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0220l(String str, Throwable th, int i, int i8, String str2, int i9, r rVar, int i10, C1031B b8, long j7, boolean z) {
        super(str, th, i, j7);
        int i11 = i8;
        boolean z6 = z;
        Bundle bundle = Bundle.EMPTY;
        boolean z8 = false;
        l.d(!z6 || i11 == 1);
        l.d((th != null || i11 == 3) ? true : z8);
        this.f4864W = i11;
        this.f4865X = str2;
        this.f4866Y = i9;
        this.f4867Z = rVar;
        this.f4868a0 = i10;
        this.f4869b0 = b8;
        this.f4870c0 = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0220l(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, M0.r r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L_0x0064
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L_0x0017
            if (r4 == r0) goto L_0x0014
            java.lang.String r0 = "Unexpected runtime error"
        L_0x000d:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x006c
        L_0x0014:
            java.lang.String r0 = "Remote error"
            goto L_0x000d
        L_0x0017:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = P0.z.f3748a
            if (r8 == 0) goto L_0x005a
            if (r8 == r1) goto L_0x0057
            r1 = 2
            if (r8 == r1) goto L_0x0054
            if (r8 == r0) goto L_0x0051
            r0 = 4
            if (r8 != r0) goto L_0x004b
            java.lang.String r0 = "YES"
            goto L_0x005c
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0051:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x005c
        L_0x0054:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x005c
        L_0x0057:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "NO"
        L_0x005c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x006c
        L_0x0064:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x006c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0079
            java.lang.String r1 = ": null"
            java.lang.String r0 = N.e.x(r0, r1)
        L_0x0079:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.C0220l.<init>(int, java.lang.Exception, int, java.lang.String, int, M0.r, int, boolean):void");
    }
}
