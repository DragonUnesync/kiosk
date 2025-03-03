package N1;

import H3.P;
import O0.b;
import P0.l;
import P0.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends i {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f3288A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f3289B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f3290C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f3291D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f3292E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F  reason: collision with root package name */
    public static final int[] f3293F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G  reason: collision with root package name */
    public static final boolean[] f3294G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h  reason: collision with root package name */
    public final r f3295h = new r();
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3296j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3297k;

    /* renamed from: l  reason: collision with root package name */
    public final long f3298l = 16000000;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f3299m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public b f3300n = new b(0, 4);

    /* renamed from: o  reason: collision with root package name */
    public List f3301o;

    /* renamed from: p  reason: collision with root package name */
    public List f3302p;

    /* renamed from: q  reason: collision with root package name */
    public int f3303q;

    /* renamed from: r  reason: collision with root package name */
    public int f3304r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3305s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3306t;

    /* renamed from: u  reason: collision with root package name */
    public byte f3307u;

    /* renamed from: v  reason: collision with root package name */
    public byte f3308v;

    /* renamed from: w  reason: collision with root package name */
    public int f3309w = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3310x;

    /* renamed from: y  reason: collision with root package name */
    public long f3311y;

    public c(String str, int i8) {
        int i9;
        if ("application/x-mp4-cea-608".equals(str)) {
            i9 = 2;
        } else {
            i9 = 3;
        }
        this.i = i9;
        if (i8 == 1) {
            this.f3297k = 0;
            this.f3296j = 0;
        } else if (i8 == 2) {
            this.f3297k = 1;
            this.f3296j = 0;
        } else if (i8 == 3) {
            this.f3297k = 0;
            this.f3296j = 1;
        } else if (i8 != 4) {
            l.B("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f3297k = 0;
            this.f3296j = 0;
        } else {
            this.f3297k = 1;
            this.f3296j = 1;
        }
        l(0);
        k();
        this.f3310x = true;
        this.f3311y = -9223372036854775807L;
    }

    public final P f() {
        List list = this.f3301o;
        this.f3302p = list;
        list.getClass();
        return new P((Object) list);
    }

    public final void flush() {
        super.flush();
        this.f3301o = null;
        this.f3302p = null;
        l(0);
        this.f3304r = 4;
        this.f3300n.f3287h = 4;
        k();
        this.f3305s = false;
        this.f3306t = false;
        this.f3307u = 0;
        this.f3308v = 0;
        this.f3309w = 0;
        this.f3310x = true;
        this.f3311y = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(N1.h r15) {
        /*
            r14 = this;
            java.nio.ByteBuffer r15 = r15.f4386Y
            r15.getClass()
            byte[] r0 = r15.array()
            int r15 = r15.limit()
            P0.r r1 = r14.f3295h
            r1.F(r15, r0)
            r15 = 0
            r0 = 0
        L_0x0014:
            int r2 = r1.a()
            r3 = 3
            r4 = 1
            int r5 = r14.i
            if (r2 < r5) goto L_0x026c
            r2 = 2
            if (r5 != r2) goto L_0x0023
            r5 = -4
            goto L_0x0027
        L_0x0023:
            int r5 = r1.v()
        L_0x0027:
            int r6 = r1.v()
            int r7 = r1.v()
            r8 = r5 & 2
            if (r8 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            r8 = r5 & 1
            int r9 = r14.f3296j
            if (r8 == r9) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            r9 = r7 & 127(0x7f, float:1.78E-43)
            byte r9 = (byte) r9
            if (r8 != 0) goto L_0x0046
            if (r9 != 0) goto L_0x0046
            goto L_0x0014
        L_0x0046:
            boolean r10 = r14.f3305s
            r5 = r5 & 4
            r11 = 4
            if (r5 != r11) goto L_0x0059
            boolean[] r5 = f3294G
            boolean r6 = r5[r6]
            if (r6 == 0) goto L_0x0059
            boolean r5 = r5[r7]
            if (r5 == 0) goto L_0x0059
            r5 = 1
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            r14.f3305s = r5
            r6 = 16
            if (r5 == 0) goto L_0x007a
            r7 = r8 & 240(0xf0, float:3.36E-43)
            if (r7 != r6) goto L_0x007a
            boolean r7 = r14.f3306t
            if (r7 == 0) goto L_0x0073
            byte r7 = r14.f3307u
            if (r7 != r8) goto L_0x0073
            byte r7 = r14.f3308v
            if (r7 != r9) goto L_0x0073
            r14.f3306t = r15
            goto L_0x0014
        L_0x0073:
            r14.f3306t = r4
            r14.f3307u = r8
            r14.f3308v = r9
            goto L_0x007c
        L_0x007a:
            r14.f3306t = r15
        L_0x007c:
            if (r5 != 0) goto L_0x0085
            if (r10 == 0) goto L_0x0014
            r14.k()
        L_0x0083:
            r0 = 1
            goto L_0x0014
        L_0x0085:
            r5 = 32
            r7 = 20
            if (r4 > r8) goto L_0x0092
            r10 = 15
            if (r8 > r10) goto L_0x0092
            r14.f3310x = r15
            goto L_0x00a8
        L_0x0092:
            r10 = r8 & 246(0xf6, float:3.45E-43)
            if (r10 != r7) goto L_0x00a8
            if (r9 == r5) goto L_0x00a6
            r10 = 47
            if (r9 == r10) goto L_0x00a6
            switch(r9) {
                case 37: goto L_0x00a6;
                case 38: goto L_0x00a6;
                case 39: goto L_0x00a6;
                default: goto L_0x009f;
            }
        L_0x009f:
            switch(r9) {
                case 41: goto L_0x00a6;
                case 42: goto L_0x00a3;
                case 43: goto L_0x00a3;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00a8
        L_0x00a3:
            r14.f3310x = r15
            goto L_0x00a8
        L_0x00a6:
            r14.f3310x = r4
        L_0x00a8:
            boolean r10 = r14.f3310x
            if (r10 != 0) goto L_0x00ae
            goto L_0x0014
        L_0x00ae:
            r10 = r8 & 224(0xe0, float:3.14E-43)
            if (r10 != 0) goto L_0x00b7
            int r12 = r8 >> 3
            r12 = r12 & r4
            r14.f3309w = r12
        L_0x00b7:
            int r12 = r14.f3309w
            int r13 = r14.f3297k
            if (r12 != r13) goto L_0x0014
            if (r10 != 0) goto L_0x024e
            r0 = r8 & 247(0xf7, float:3.46E-43)
            r10 = 17
            if (r0 != r10) goto L_0x00d8
            r12 = r9 & 240(0xf0, float:3.36E-43)
            r13 = 48
            if (r12 != r13) goto L_0x00d8
            N1.b r0 = r14.f3300n
            r2 = r9 & 15
            int[] r3 = f3291D
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0083
        L_0x00d8:
            r12 = r8 & 246(0xf6, float:3.45E-43)
            r13 = 18
            if (r12 != r13) goto L_0x0100
            r13 = r9 & 224(0xe0, float:3.14E-43)
            if (r13 != r5) goto L_0x0100
            N1.b r0 = r14.f3300n
            r0.b()
            N1.b r0 = r14.f3300n
            r2 = r8 & 1
            if (r2 != 0) goto L_0x00f5
            r2 = r9 & 31
            int[] r3 = f3292E
            r2 = r3[r2]
        L_0x00f3:
            char r2 = (char) r2
            goto L_0x00fc
        L_0x00f5:
            r2 = r9 & 31
            int[] r3 = f3293F
            r2 = r3[r2]
            goto L_0x00f3
        L_0x00fc:
            r0.a(r2)
            goto L_0x0083
        L_0x0100:
            if (r0 != r10) goto L_0x012a
            r10 = r9 & 240(0xf0, float:3.36E-43)
            if (r10 != r5) goto L_0x012a
            N1.b r0 = r14.f3300n
            r0.a(r5)
            r0 = r9 & 1
            if (r0 != r4) goto L_0x0111
            r0 = 1
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            int r2 = r9 >> 1
            r2 = r2 & 7
            N1.b r3 = r14.f3300n
            java.util.ArrayList r5 = r3.f3281a
            N1.a r6 = new N1.a
            java.lang.StringBuilder r3 = r3.f3283c
            int r3 = r3.length()
            r6.<init>(r2, r3, r0)
            r5.add(r6)
            goto L_0x0083
        L_0x012a:
            r10 = r8 & 240(0xf0, float:3.36E-43)
            if (r10 != r6) goto L_0x019a
            r10 = r9 & 192(0xc0, float:2.69E-43)
            r13 = 64
            if (r10 != r13) goto L_0x019a
            int[] r0 = z
            r2 = r8 & 7
            r0 = r0[r2]
            r2 = r9 & 32
            if (r2 == 0) goto L_0x0140
            int r0 = r0 + 1
        L_0x0140:
            N1.b r2 = r14.f3300n
            int r3 = r2.f3284d
            if (r0 == r3) goto L_0x0164
            int r3 = r14.f3303q
            if (r3 == r4) goto L_0x0160
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x0160
            N1.b r2 = new N1.b
            int r3 = r14.f3303q
            int r5 = r14.f3304r
            r2.<init>(r3, r5)
            r14.f3300n = r2
            java.util.ArrayList r3 = r14.f3299m
            r3.add(r2)
        L_0x0160:
            N1.b r2 = r14.f3300n
            r2.f3284d = r0
        L_0x0164:
            r0 = r9 & 16
            if (r0 != r6) goto L_0x016a
            r0 = 1
            goto L_0x016b
        L_0x016a:
            r0 = 0
        L_0x016b:
            r2 = r9 & 1
            if (r2 != r4) goto L_0x0171
            r2 = 1
            goto L_0x0172
        L_0x0171:
            r2 = 0
        L_0x0172:
            int r3 = r9 >> 1
            r3 = r3 & 7
            N1.b r5 = r14.f3300n
            if (r0 == 0) goto L_0x017d
            r6 = 8
            goto L_0x017e
        L_0x017d:
            r6 = r3
        L_0x017e:
            java.util.ArrayList r7 = r5.f3281a
            N1.a r8 = new N1.a
            java.lang.StringBuilder r5 = r5.f3283c
            int r5 = r5.length()
            r8.<init>(r6, r5, r2)
            r7.add(r8)
            if (r0 == 0) goto L_0x0083
            N1.b r0 = r14.f3300n
            int[] r2 = f3288A
            r2 = r2[r3]
            r0.e = r2
            goto L_0x0083
        L_0x019a:
            r6 = 23
            r8 = 33
            if (r0 != r6) goto L_0x01ae
            if (r9 < r8) goto L_0x01ae
            r0 = 35
            if (r9 > r0) goto L_0x01ae
            N1.b r0 = r14.f3300n
            int r9 = r9 + -32
            r0.f3285f = r9
            goto L_0x0083
        L_0x01ae:
            if (r12 != r7) goto L_0x0083
            r0 = r9 & 240(0xf0, float:3.36E-43)
            if (r0 != r5) goto L_0x0083
            if (r9 == r5) goto L_0x0249
            r0 = 41
            if (r9 == r0) goto L_0x0244
            switch(r9) {
                case 37: goto L_0x0239;
                case 38: goto L_0x022e;
                case 39: goto L_0x0223;
                default: goto L_0x01bd;
            }
        L_0x01bd:
            int r0 = r14.f3303q
            if (r0 != 0) goto L_0x01c3
            goto L_0x0083
        L_0x01c3:
            if (r9 == r8) goto L_0x021c
            switch(r9) {
                case 44: goto L_0x020b;
                case 45: goto L_0x01da;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01ca;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x0083
        L_0x01ca:
            java.util.ArrayList r0 = r14.j()
            r14.f3301o = r0
            r14.k()
            goto L_0x0083
        L_0x01d5:
            r14.k()
            goto L_0x0083
        L_0x01da:
            if (r0 != r4) goto L_0x0083
            N1.b r0 = r14.f3300n
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0083
            N1.b r0 = r14.f3300n
            java.util.ArrayList r2 = r0.f3282b
            android.text.SpannableString r3 = r0.d()
            r2.add(r3)
            java.lang.StringBuilder r3 = r0.f3283c
            r3.setLength(r15)
            java.util.ArrayList r3 = r0.f3281a
            r3.clear()
            int r3 = r0.f3287h
            int r0 = r0.f3284d
            int r0 = java.lang.Math.min(r3, r0)
        L_0x0201:
            int r3 = r2.size()
            if (r3 < r0) goto L_0x0083
            r2.remove(r15)
            goto L_0x0201
        L_0x020b:
            java.util.List r0 = java.util.Collections.emptyList()
            r14.f3301o = r0
            int r0 = r14.f3303q
            if (r0 == r4) goto L_0x0217
            if (r0 != r3) goto L_0x0083
        L_0x0217:
            r14.k()
            goto L_0x0083
        L_0x021c:
            N1.b r0 = r14.f3300n
            r0.b()
            goto L_0x0083
        L_0x0223:
            r14.l(r4)
            r14.f3304r = r11
            N1.b r0 = r14.f3300n
            r0.f3287h = r11
            goto L_0x0083
        L_0x022e:
            r14.l(r4)
            r14.f3304r = r3
            N1.b r0 = r14.f3300n
            r0.f3287h = r3
            goto L_0x0083
        L_0x0239:
            r14.l(r4)
            r14.f3304r = r2
            N1.b r0 = r14.f3300n
            r0.f3287h = r2
            goto L_0x0083
        L_0x0244:
            r14.l(r3)
            goto L_0x0083
        L_0x0249:
            r14.l(r2)
            goto L_0x0083
        L_0x024e:
            N1.b r0 = r14.f3300n
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            int[] r3 = f3290C
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            r0 = r9 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0083
            N1.b r0 = r14.f3300n
            r2 = r9 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0083
        L_0x026c:
            if (r0 == 0) goto L_0x027e
            int r15 = r14.f3303q
            if (r15 == r4) goto L_0x0274
            if (r15 != r3) goto L_0x027e
        L_0x0274:
            java.util.ArrayList r15 = r14.j()
            r14.f3301o = r15
            long r0 = r14.e
            r14.f3311y = r0
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.c.g(N1.h):void");
    }

    /* renamed from: h */
    public final M1.c c() {
        M1.c cVar;
        M1.c h5 = super.c();
        if (h5 != null) {
            return h5;
        }
        long j7 = this.f3298l;
        if (j7 == -9223372036854775807L) {
            return null;
        }
        long j8 = this.f3311y;
        if (j8 == -9223372036854775807L || this.e - j8 < j7 || (cVar = (M1.c) this.f3358b.pollFirst()) == null) {
            return null;
        }
        this.f3301o = Collections.emptyList();
        this.f3311y = -9223372036854775807L;
        P f8 = f();
        long j9 = this.e;
        cVar.f4391W = j9;
        cVar.f3071Y = f8;
        cVar.f3072Z = j9;
        return cVar;
    }

    public final boolean i() {
        if (this.f3301o != this.f3302p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f3299m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i8 = 2;
        for (int i9 = 0; i9 < size; i9++) {
            b c8 = ((b) arrayList.get(i9)).c(RecyclerView.UNDEFINED_DURATION);
            arrayList2.add(c8);
            if (c8 != null) {
                i8 = Math.min(i8, c8.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList2.get(i10);
            if (bVar != null) {
                if (bVar.i != i8) {
                    bVar = ((b) arrayList.get(i10)).c(i8);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f3300n;
        bVar.f3286g = this.f3303q;
        bVar.f3281a.clear();
        bVar.f3282b.clear();
        bVar.f3283c.setLength(0);
        bVar.f3284d = 15;
        bVar.e = 0;
        bVar.f3285f = 0;
        ArrayList arrayList = this.f3299m;
        arrayList.clear();
        arrayList.add(this.f3300n);
    }

    public final void l(int i8) {
        int i9 = this.f3303q;
        if (i9 != i8) {
            this.f3303q = i8;
            if (i8 == 3) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f3299m;
                    if (i10 < arrayList.size()) {
                        ((b) arrayList.get(i10)).f3286g = i8;
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i9 == 3 || i8 == 1 || i8 == 0) {
                    this.f3301o = Collections.emptyList();
                }
            }
        }
    }

    public final void release() {
    }
}
