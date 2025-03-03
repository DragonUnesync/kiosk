package f7;

import D6.h;
import java.util.Arrays;
import l7.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11709a = true;

    /* renamed from: b  reason: collision with root package name */
    public final f f11710b;

    /* renamed from: c  reason: collision with root package name */
    public int f11711c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11712d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public C0939b[] f11713f;

    /* renamed from: g  reason: collision with root package name */
    public int f11714g;

    /* renamed from: h  reason: collision with root package name */
    public int f11715h;
    public int i;

    public d(f fVar) {
        this.f11710b = fVar;
        this.f11711c = Integer.MAX_VALUE;
        this.e = 4096;
        this.f11713f = new C0939b[8];
        this.f11714g = 7;
    }

    public final void a(int i8) {
        int i9;
        if (i8 > 0) {
            int length = this.f11713f.length - 1;
            int i10 = 0;
            while (true) {
                i9 = this.f11714g;
                if (length < i9 || i8 <= 0) {
                    C0939b[] bVarArr = this.f11713f;
                    int i11 = i9 + 1;
                    System.arraycopy(bVarArr, i11, bVarArr, i11 + i10, this.f11715h);
                    C0939b[] bVarArr2 = this.f11713f;
                    int i12 = this.f11714g + 1;
                    Arrays.fill(bVarArr2, i12, i12 + i10, (Object) null);
                    this.f11714g += i10;
                } else {
                    C0939b bVar = this.f11713f[length];
                    P6.f.b(bVar);
                    i8 -= bVar.f11702c;
                    int i13 = this.i;
                    C0939b bVar2 = this.f11713f[length];
                    P6.f.b(bVar2);
                    this.i = i13 - bVar2.f11702c;
                    this.f11715h--;
                    i10++;
                    length--;
                }
            }
            C0939b[] bVarArr3 = this.f11713f;
            int i112 = i9 + 1;
            System.arraycopy(bVarArr3, i112, bVarArr3, i112 + i10, this.f11715h);
            C0939b[] bVarArr22 = this.f11713f;
            int i122 = this.f11714g + 1;
            Arrays.fill(bVarArr22, i122, i122 + i10, (Object) null);
            this.f11714g += i10;
        }
    }

    public final void b(C0939b bVar) {
        int i8 = this.e;
        int i9 = bVar.f11702c;
        if (i9 > i8) {
            C0939b[] bVarArr = this.f11713f;
            h.F(0, bVarArr.length, bVarArr);
            this.f11714g = this.f11713f.length - 1;
            this.f11715h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i9) - i8);
        int i10 = this.f11715h + 1;
        C0939b[] bVarArr2 = this.f11713f;
        if (i10 > bVarArr2.length) {
            C0939b[] bVarArr3 = new C0939b[(bVarArr2.length * 2)];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f11714g = this.f11713f.length - 1;
            this.f11713f = bVarArr3;
        }
        int i11 = this.f11714g;
        this.f11714g = i11 - 1;
        this.f11713f[i11] = bVar;
        this.f11715h++;
        this.i += i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r2v6, types: [l7.f, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(l7.i r13) {
        /*
            r12 = this;
            r0 = 8
            java.lang.String r1 = "data"
            P6.f.e(r13, r1)
            l7.f r1 = r12.f11710b
            boolean r2 = r12.f11709a
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r2 == 0) goto L_0x008c
            int[] r2 = f7.y.f11808a
            int r2 = r13.a()
            r5 = 0
            r8 = r5
            r7 = 0
        L_0x001a:
            if (r7 >= r2) goto L_0x002d
            byte r10 = r13.d(r7)
            byte[] r11 = Z6.b.f6982a
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r11 = f7.y.f11809b
            byte r10 = r11[r10]
            long r10 = (long) r10
            long r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x001a
        L_0x002d:
            r2 = 7
            long r10 = (long) r2
            long r8 = r8 + r10
            r2 = 3
            long r7 = r8 >> r2
            int r2 = (int) r7
            int r7 = r13.a()
            if (r2 >= r7) goto L_0x008c
            l7.f r2 = new l7.f
            r2.<init>()
            int[] r7 = f7.y.f11808a
            int r7 = r13.a()
            r8 = r5
            r5 = 0
        L_0x0047:
            if (r4 >= r7) goto L_0x006b
            byte r6 = r13.d(r4)
            byte[] r10 = Z6.b.f6982a
            r6 = r6 & 255(0xff, float:3.57E-43)
            int[] r10 = f7.y.f11808a
            r10 = r10[r6]
            byte[] r11 = f7.y.f11809b
            byte r6 = r11[r6]
            long r8 = r8 << r6
            long r10 = (long) r10
            long r8 = r8 | r10
            int r5 = r5 + r6
        L_0x005d:
            if (r5 < r0) goto L_0x0068
            int r5 = r5 + -8
            long r10 = r8 >> r5
            int r6 = (int) r10
            r2.z(r6)
            goto L_0x005d
        L_0x0068:
            int r4 = r4 + 1
            goto L_0x0047
        L_0x006b:
            if (r5 <= 0) goto L_0x0079
            int r0 = r0 - r5
            long r6 = r8 << r0
            r8 = 255(0xff, double:1.26E-321)
            long r4 = r8 >>> r5
            long r4 = r4 | r6
            int r13 = (int) r4
            r2.z(r13)
        L_0x0079:
            long r4 = r2.f13216V
            l7.i r13 = r2.p(r4)
            int r0 = r13.a()
            r2 = 128(0x80, float:1.794E-43)
            r12.e(r0, r3, r2)
            r1.w(r13)
            goto L_0x0096
        L_0x008c:
            int r0 = r13.a()
            r12.e(r0, r3, r4)
            r1.w(r13)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.d.c(l7.i):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ArrayList r14) {
        /*
            r13 = this;
            boolean r0 = r13.f11712d
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r13.f11711c
            int r2 = r13.e
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L_0x0012
            r13.e(r0, r4, r3)
        L_0x0012:
            r13.f11712d = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.f11711c = r0
            int r0 = r13.e
            r13.e(r0, r4, r3)
        L_0x001e:
            int r0 = r14.size()
            r2 = 0
        L_0x0023:
            if (r2 >= r0) goto L_0x00fd
            java.lang.Object r3 = r14.get(r2)
            f7.b r3 = (f7.C0939b) r3
            l7.i r4 = r3.f11700a
            l7.i r4 = r4.g()
            java.util.Map r5 = f7.e.f11717b
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = -1
            l7.i r7 = r3.f11701b
            if (r5 == 0) goto L_0x006c
            int r5 = r5.intValue()
            int r8 = r5 + 1
            r9 = 2
            if (r9 > r8) goto L_0x0069
            r9 = 8
            if (r8 >= r9) goto L_0x0069
            f7.b[] r9 = f7.e.f11716a
            r10 = r9[r5]
            l7.i r10 = r10.f11701b
            boolean r10 = P6.f.a(r10, r7)
            if (r10 == 0) goto L_0x0059
            r5 = r8
            goto L_0x006e
        L_0x0059:
            r9 = r9[r8]
            l7.i r9 = r9.f11701b
            boolean r9 = P6.f.a(r9, r7)
            if (r9 == 0) goto L_0x0069
            int r5 = r5 + 2
            r12 = r8
            r8 = r5
            r5 = r12
            goto L_0x006e
        L_0x0069:
            r5 = r8
        L_0x006a:
            r8 = -1
            goto L_0x006e
        L_0x006c:
            r5 = -1
            goto L_0x006a
        L_0x006e:
            if (r8 != r6) goto L_0x00ac
            int r9 = r13.f11714g
            int r9 = r9 + 1
            f7.b[] r10 = r13.f11713f
            int r10 = r10.length
        L_0x0077:
            if (r9 >= r10) goto L_0x00ac
            f7.b[] r11 = r13.f11713f
            r11 = r11[r9]
            P6.f.b(r11)
            l7.i r11 = r11.f11700a
            boolean r11 = P6.f.a(r11, r4)
            if (r11 == 0) goto L_0x00a9
            f7.b[] r11 = r13.f11713f
            r11 = r11[r9]
            P6.f.b(r11)
            l7.i r11 = r11.f11701b
            boolean r11 = P6.f.a(r11, r7)
            if (r11 == 0) goto L_0x009f
            int r8 = r13.f11714g
            int r9 = r9 - r8
            f7.b[] r8 = f7.e.f11716a
            int r8 = r8.length
            int r8 = r8 + r9
            goto L_0x00ac
        L_0x009f:
            if (r5 != r6) goto L_0x00a9
            int r5 = r13.f11714g
            int r5 = r9 - r5
            f7.b[] r11 = f7.e.f11716a
            int r11 = r11.length
            int r5 = r5 + r11
        L_0x00a9:
            int r9 = r9 + 1
            goto L_0x0077
        L_0x00ac:
            if (r8 == r6) goto L_0x00b6
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.794E-43)
            r13.e(r8, r3, r4)
            goto L_0x00f9
        L_0x00b6:
            r8 = 64
            if (r5 != r6) goto L_0x00c9
            l7.f r5 = r13.f11710b
            r5.z(r8)
            r13.c(r4)
            r13.c(r7)
            r13.b(r3)
            goto L_0x00f9
        L_0x00c9:
            l7.i r6 = f7.C0939b.f11696d
            r4.getClass()
            java.lang.String r9 = "prefix"
            P6.f.e(r6, r9)
            int r9 = r6.a()
            boolean r6 = r4.f(r6, r9)
            if (r6 == 0) goto L_0x00ee
            l7.i r6 = f7.C0939b.i
            boolean r4 = P6.f.a(r6, r4)
            if (r4 != 0) goto L_0x00ee
            r3 = 15
            r13.e(r5, r3, r1)
            r13.c(r7)
            goto L_0x00f9
        L_0x00ee:
            r4 = 63
            r13.e(r5, r4, r8)
            r13.c(r7)
            r13.b(r3)
        L_0x00f9:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.d.d(java.util.ArrayList):void");
    }

    public final void e(int i8, int i9, int i10) {
        f fVar = this.f11710b;
        if (i8 < i9) {
            fVar.z(i8 | i10);
            return;
        }
        fVar.z(i10 | i9);
        int i11 = i8 - i9;
        while (i11 >= 128) {
            fVar.z(128 | (i11 & 127));
            i11 >>>= 7;
        }
        fVar.z(i11);
    }
}
