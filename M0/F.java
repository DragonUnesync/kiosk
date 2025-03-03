package M0;

import H3.M;
import H3.O;
import H3.i0;
import N.e;
import P0.z;
import j$.util.Objects;
import java.util.Arrays;

public final class F {
    public static final F z;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f2814a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f2815b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f2816c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f2817d;
    public final CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f2818f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f2819g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f2820h;
    public final Integer i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f2821j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f2822k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f2823l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f2824m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f2825n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f2826o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f2827p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f2828q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f2829r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f2830s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f2831t;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f2832u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f2833v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f2834w;

    /* renamed from: x  reason: collision with root package name */
    public final Integer f2835x;

    /* renamed from: y  reason: collision with root package name */
    public final O f2836y;

    /* JADX WARNING: type inference failed for: r0v0, types: [M0.E, java.lang.Object] */
    static {
        ? obj = new Object();
        M m8 = O.f2026V;
        obj.f2813x = i0.f2073Y;
        z = new F(obj);
        e.D(0, 1, 2, 3, 4);
        e.D(5, 6, 8, 9, 10);
        e.D(11, 12, 13, 14, 15);
        e.D(16, 17, 18, 19, 20);
        e.D(21, 22, 23, 24, 25);
        e.D(26, 27, 28, 29, 30);
        e.D(31, 32, 33, 34, 1000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F(M0.E r8) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.Boolean r0 = r8.f2800k
            java.lang.Integer r1 = r8.f2799j
            java.lang.Integer r2 = r8.f2812w
            r3 = 1
            r4 = -1
            r5 = 0
            if (r0 == 0) goto L_0x003b
            boolean r6 = r0.booleanValue()
            if (r6 != 0) goto L_0x0019
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x0069
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            int r6 = r1.intValue()
            if (r6 != r4) goto L_0x0069
        L_0x0021:
            if (r2 == 0) goto L_0x0036
            int r1 = r2.intValue()
            switch(r1) {
                case 1: goto L_0x0035;
                case 2: goto L_0x0035;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0035;
                case 6: goto L_0x0035;
                case 7: goto L_0x0035;
                case 8: goto L_0x0035;
                case 9: goto L_0x0035;
                case 10: goto L_0x0035;
                case 11: goto L_0x0035;
                case 12: goto L_0x0035;
                case 13: goto L_0x0035;
                case 14: goto L_0x0035;
                case 15: goto L_0x0035;
                case 16: goto L_0x0035;
                case 17: goto L_0x0035;
                case 18: goto L_0x0035;
                case 19: goto L_0x0035;
                case 20: goto L_0x002a;
                case 21: goto L_0x0034;
                case 22: goto L_0x0032;
                case 23: goto L_0x0030;
                case 24: goto L_0x002e;
                case 25: goto L_0x002c;
                case 26: goto L_0x002a;
                case 27: goto L_0x002a;
                case 28: goto L_0x002a;
                case 29: goto L_0x002a;
                case 30: goto L_0x002a;
                case 31: goto L_0x0035;
                case 32: goto L_0x0035;
                case 33: goto L_0x0035;
                case 34: goto L_0x0035;
                case 35: goto L_0x0035;
                default: goto L_0x002a;
            }
        L_0x002a:
            r3 = 0
            goto L_0x0035
        L_0x002c:
            r3 = 6
            goto L_0x0035
        L_0x002e:
            r3 = 5
            goto L_0x0035
        L_0x0030:
            r3 = 4
            goto L_0x0035
        L_0x0032:
            r3 = 3
            goto L_0x0035
        L_0x0034:
            r3 = 2
        L_0x0035:
            r5 = r3
        L_0x0036:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0069
        L_0x003b:
            if (r1 == 0) goto L_0x0069
            int r0 = r1.intValue()
            if (r0 == r4) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r3 == 0) goto L_0x0069
            if (r2 != 0) goto L_0x0069
            int r2 = r1.intValue()
            switch(r2) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0063;
                case 3: goto L_0x0060;
                case 4: goto L_0x005d;
                case 5: goto L_0x005a;
                case 6: goto L_0x0057;
                default: goto L_0x0054;
            }
        L_0x0054:
            r5 = 20
            goto L_0x0065
        L_0x0057:
            r5 = 25
            goto L_0x0065
        L_0x005a:
            r5 = 24
            goto L_0x0065
        L_0x005d:
            r5 = 23
            goto L_0x0065
        L_0x0060:
            r5 = 22
            goto L_0x0065
        L_0x0063:
            r5 = 21
        L_0x0065:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x0069:
            java.lang.CharSequence r3 = r8.f2792a
            r7.f2814a = r3
            java.lang.CharSequence r3 = r8.f2793b
            r7.f2815b = r3
            java.lang.CharSequence r3 = r8.f2794c
            r7.f2816c = r3
            java.lang.CharSequence r3 = r8.f2795d
            r7.f2817d = r3
            java.lang.CharSequence r3 = r8.e
            r7.e = r3
            byte[] r3 = r8.f2796f
            r7.f2818f = r3
            java.lang.Integer r3 = r8.f2797g
            r7.f2819g = r3
            java.lang.Integer r3 = r8.f2798h
            r7.f2820h = r3
            java.lang.Integer r3 = r8.i
            r7.i = r3
            r7.f2821j = r1
            r7.f2822k = r0
            java.lang.Integer r0 = r8.f2801l
            r7.f2823l = r0
            r7.f2824m = r0
            java.lang.Integer r0 = r8.f2802m
            r7.f2825n = r0
            java.lang.Integer r0 = r8.f2803n
            r7.f2826o = r0
            java.lang.Integer r0 = r8.f2804o
            r7.f2827p = r0
            java.lang.Integer r0 = r8.f2805p
            r7.f2828q = r0
            java.lang.Integer r0 = r8.f2806q
            r7.f2829r = r0
            java.lang.CharSequence r0 = r8.f2807r
            r7.f2830s = r0
            java.lang.CharSequence r0 = r8.f2808s
            r7.f2831t = r0
            java.lang.CharSequence r0 = r8.f2809t
            r7.f2832u = r0
            java.lang.CharSequence r0 = r8.f2810u
            r7.f2833v = r0
            java.lang.CharSequence r0 = r8.f2811v
            r7.f2834w = r0
            r7.f2835x = r2
            H3.O r8 = r8.f2813x
            r7.f2836y = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.F.<init>(M0.E):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [M0.E, java.lang.Object] */
    public final E a() {
        ? obj = new Object();
        obj.f2792a = this.f2814a;
        obj.f2793b = this.f2815b;
        obj.f2794c = this.f2816c;
        obj.f2795d = this.f2817d;
        obj.e = this.e;
        obj.f2796f = this.f2818f;
        obj.f2797g = this.f2819g;
        obj.f2798h = this.f2820h;
        obj.i = this.i;
        obj.f2799j = this.f2821j;
        obj.f2800k = this.f2822k;
        obj.f2801l = this.f2824m;
        obj.f2802m = this.f2825n;
        obj.f2803n = this.f2826o;
        obj.f2804o = this.f2827p;
        obj.f2805p = this.f2828q;
        obj.f2806q = this.f2829r;
        obj.f2807r = this.f2830s;
        obj.f2808s = this.f2831t;
        obj.f2809t = this.f2832u;
        obj.f2810u = this.f2833v;
        obj.f2811v = this.f2834w;
        obj.f2812w = this.f2835x;
        obj.f2813x = this.f2836y;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f8 = (F) obj;
        int i8 = z.f3748a;
        if (!Objects.equals(this.f2814a, f8.f2814a) || !Objects.equals(this.f2815b, f8.f2815b) || !Objects.equals(this.f2816c, f8.f2816c) || !Objects.equals(this.f2817d, f8.f2817d) || !Objects.equals(this.e, f8.e) || !Arrays.equals(this.f2818f, f8.f2818f) || !Objects.equals(this.f2819g, f8.f2819g) || !Objects.equals(this.f2820h, f8.f2820h) || !Objects.equals(this.i, f8.i) || !Objects.equals(this.f2821j, f8.f2821j) || !Objects.equals(this.f2822k, f8.f2822k) || !Objects.equals(this.f2824m, f8.f2824m) || !Objects.equals(this.f2825n, f8.f2825n) || !Objects.equals(this.f2826o, f8.f2826o) || !Objects.equals(this.f2827p, f8.f2827p) || !Objects.equals(this.f2828q, f8.f2828q) || !Objects.equals(this.f2829r, f8.f2829r) || !Objects.equals(this.f2830s, f8.f2830s) || !Objects.equals(this.f2831t, f8.f2831t) || !Objects.equals(this.f2832u, f8.f2832u) || !Objects.equals(this.f2833v, f8.f2833v) || !Objects.equals(this.f2834w, f8.f2834w) || !Objects.equals(this.f2835x, f8.f2835x) || !Objects.equals(this.f2836y, f8.f2836y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f2818f));
        CharSequence charSequence = this.f2834w;
        Integer num = this.f2835x;
        Integer num2 = num;
        Integer num3 = this.f2827p;
        Integer num4 = this.f2828q;
        Integer num5 = this.f2829r;
        CharSequence charSequence2 = this.f2830s;
        CharSequence charSequence3 = this.f2831t;
        CharSequence charSequence4 = this.f2832u;
        CharSequence charSequence5 = this.f2833v;
        return Arrays.hashCode(new Object[]{this.f2814a, this.f2815b, this.f2816c, this.f2817d, null, null, this.e, null, null, null, valueOf, this.f2819g, null, this.f2820h, this.i, this.f2821j, this.f2822k, null, this.f2824m, this.f2825n, this.f2826o, num3, num4, num5, charSequence2, charSequence3, charSequence4, null, null, charSequence5, null, charSequence, num2, 1, this.f2836y});
    }
}
