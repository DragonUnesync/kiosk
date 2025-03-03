package U1;

import androidx.recyclerview.widget.RecyclerView;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f5406a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f5407b = 0;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f5408c;

    /* renamed from: d  reason: collision with root package name */
    public int f5409d = 2;
    public float e = -3.4028235E38f;

    /* renamed from: f  reason: collision with root package name */
    public int f5410f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f5411g = 0;

    /* renamed from: h  reason: collision with root package name */
    public float f5412h = -3.4028235E38f;
    public int i = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: j  reason: collision with root package name */
    public float f5413j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public int f5414k = RecyclerView.UNDEFINED_DURATION;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        if (r5 == 0) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final O0.a a() {
        /*
            r13 = this;
            float r0 = r13.f5412h
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 5
            r5 = 4
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0011
            goto L_0x001e
        L_0x0011:
            int r0 = r13.f5409d
            if (r0 == r5) goto L_0x001d
            if (r0 == r4) goto L_0x001a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x001e
        L_0x001a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            int r7 = r13.i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L_0x0028
            goto L_0x0037
        L_0x0028:
            int r7 = r13.f5409d
            if (r7 == r11) goto L_0x0036
            if (r7 == r9) goto L_0x0034
            if (r7 == r5) goto L_0x0036
            if (r7 == r4) goto L_0x0034
            r7 = 1
            goto L_0x0037
        L_0x0034:
            r7 = 2
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            O0.a r8 = new O0.a
            r8.<init>()
            int r12 = r13.f5409d
            if (r12 == r11) goto L_0x0057
            if (r12 == r10) goto L_0x0054
            if (r12 == r9) goto L_0x0051
            if (r12 == r5) goto L_0x0057
            if (r12 == r4) goto L_0x0051
            java.lang.String r4 = "Unknown textAlignment: "
            java.lang.String r5 = "WebvttCueParser"
            Q0.g.u(r12, r4, r5)
            r4 = 0
            goto L_0x0059
        L_0x0051:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0059
        L_0x0054:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0059
        L_0x0057:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0059:
            r8.f3497c = r4
            float r4 = r13.e
            int r5 = r13.f5410f
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0070
            if (r5 != 0) goto L_0x0070
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x006d
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0070
        L_0x006d:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0077
        L_0x0070:
            if (r9 == 0) goto L_0x0074
            r6 = r4
            goto L_0x0077
        L_0x0074:
            if (r5 != 0) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            r8.e = r6
            r8.f3499f = r5
            int r1 = r13.f5411g
            r8.f3500g = r1
            r8.f3501h = r0
            r8.i = r7
            float r1 = r13.f5413j
            if (r7 == 0) goto L_0x00a3
            if (r7 == r11) goto L_0x0096
            if (r7 != r10) goto L_0x008c
            goto L_0x00a5
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L_0x0096:
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x009f
            float r0 = r0 * r4
            goto L_0x00a5
        L_0x009f:
            float r3 = r3 - r0
            float r0 = r3 * r4
            goto L_0x00a5
        L_0x00a3:
            float r0 = r3 - r0
        L_0x00a5:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f3504l = r0
            int r0 = r13.f5414k
            r8.f3508p = r0
            java.lang.CharSequence r0 = r13.f5408c
            if (r0 == 0) goto L_0x00b5
            r8.f3495a = r0
        L_0x00b5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.h.a():O0.a");
    }
}
