package c0;

import B3.q;
import d0.C0629c;
import java.util.Arrays;

/* renamed from: c0.e  reason: case insensitive filesystem */
public final class C0607e {

    /* renamed from: o  reason: collision with root package name */
    public static int f8719o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f8720p = true;

    /* renamed from: a  reason: collision with root package name */
    public int f8721a;

    /* renamed from: b  reason: collision with root package name */
    public final h f8722b;

    /* renamed from: c  reason: collision with root package name */
    public int f8723c;

    /* renamed from: d  reason: collision with root package name */
    public int f8724d;
    public C0605c[] e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8725f;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f8726g;

    /* renamed from: h  reason: collision with root package name */
    public int f8727h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f8728j;

    /* renamed from: k  reason: collision with root package name */
    public final q f8729k;

    /* renamed from: l  reason: collision with root package name */
    public i[] f8730l;

    /* renamed from: m  reason: collision with root package name */
    public int f8731m;

    /* renamed from: n  reason: collision with root package name */
    public C0605c f8732n;

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: type inference failed for: r1v2, types: [c0.h, c0.c] */
    public C0607e() {
        this.f8721a = 0;
        this.f8723c = 32;
        this.f8724d = 32;
        this.e = null;
        this.f8725f = false;
        this.f8726g = new boolean[32];
        this.f8727h = 1;
        this.i = 0;
        this.f8728j = 32;
        this.f8730l = new i[f8719o];
        this.f8731m = 0;
        this.e = new C0605c[32];
        q();
        ? obj = new Object();
        obj.f449U = new C0608f();
        obj.f450V = new C0608f();
        obj.f451W = new C0608f();
        obj.f452X = new i[32];
        this.f8729k = obj;
        ? cVar = new C0605c(obj);
        cVar.f8738f = new i[128];
        cVar.f8739g = new i[128];
        cVar.f8740h = 0;
        cVar.i = new g(cVar);
        this.f8722b = cVar;
        if (f8720p) {
            this.f8732n = new C0606d(obj);
        } else {
            this.f8732n = new C0605c(obj);
        }
    }

    public static int m(Object obj) {
        i iVar = ((C0629c) obj).f9581g;
        if (iVar != null) {
            return (int) (iVar.e + 0.5f);
        }
        return 0;
    }

    public final i a(int i8) {
        i iVar = (i) ((C0608f) this.f8729k.f451W).a();
        if (iVar == null) {
            iVar = new i(i8);
            iVar.f8750l = i8;
        } else {
            iVar.c();
            iVar.f8750l = i8;
        }
        int i9 = this.f8731m;
        int i10 = f8719o;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            f8719o = i11;
            this.f8730l = (i[]) Arrays.copyOf(this.f8730l, i11);
        }
        i[] iVarArr = this.f8730l;
        int i12 = this.f8731m;
        this.f8731m = i12 + 1;
        iVarArr[i12] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9, int i10) {
        C0605c k8 = k();
        if (iVar2 == iVar3) {
            k8.f8718d.i(iVar, 1.0f);
            k8.f8718d.i(iVar4, 1.0f);
            k8.f8718d.i(iVar2, -2.0f);
        } else if (f8 == 0.5f) {
            k8.f8718d.i(iVar, 1.0f);
            k8.f8718d.i(iVar2, -1.0f);
            k8.f8718d.i(iVar3, -1.0f);
            k8.f8718d.i(iVar4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                k8.f8716b = (float) ((-i8) + i9);
            }
        } else if (f8 <= 0.0f) {
            k8.f8718d.i(iVar, -1.0f);
            k8.f8718d.i(iVar2, 1.0f);
            k8.f8716b = (float) i8;
        } else if (f8 >= 1.0f) {
            k8.f8718d.i(iVar4, -1.0f);
            k8.f8718d.i(iVar3, 1.0f);
            k8.f8716b = (float) (-i9);
        } else {
            float f9 = 1.0f - f8;
            k8.f8718d.i(iVar, f9 * 1.0f);
            k8.f8718d.i(iVar2, f9 * -1.0f);
            k8.f8718d.i(iVar3, -1.0f * f8);
            k8.f8718d.i(iVar4, 1.0f * f8);
            if (i8 > 0 || i9 > 0) {
                k8.f8716b = (((float) i9) * f8) + (((float) (-i8)) * f9);
            }
        }
        if (i10 != 8) {
            k8.a(this, i10);
        }
        c(k8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ba, code lost:
        if (r4.f8749k <= 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r4.f8749k <= 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00df, code lost:
        if (r4.f8749k <= 1) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ed, code lost:
        if (r4.f8749k <= 1) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(c0.C0605c r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f8728j
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f8727h
            int r2 = r2 + r3
            int r4 = r0.f8724d
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.n()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x019e
            c0.c[] r2 = r0.e
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0071
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0071
            c0.b r6 = r1.f8718d
            int r6 = r6.d()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.f8717c
            if (r7 >= r6) goto L_0x0043
            c0.b r9 = r1.f8718d
            c0.i r9 = r9.g(r7)
            int r10 = r9.f8743c
            if (r10 != r5) goto L_0x003d
            boolean r10 = r9.f8745f
            if (r10 == 0) goto L_0x0040
        L_0x003d:
            r8.add(r9)
        L_0x0040:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0043:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006f
            java.util.Iterator r6 = r8.iterator()
        L_0x004d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x006b
            java.lang.Object r7 = r6.next()
            c0.i r7 = (c0.i) r7
            boolean r9 = r7.f8745f
            if (r9 == 0) goto L_0x0061
            r1.g(r7, r3)
            goto L_0x004d
        L_0x0061:
            c0.c[] r9 = r0.e
            int r7 = r7.f8743c
            r7 = r9[r7]
            r1.h(r7, r3)
            goto L_0x004d
        L_0x006b:
            r8.clear()
            goto L_0x0022
        L_0x006f:
            r2 = 1
            goto L_0x0022
        L_0x0071:
            c0.i r2 = r1.f8715a
            r6 = 0
            if (r2 != 0) goto L_0x0085
            float r2 = r1.f8716b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0085
            c0.b r2 = r1.f8718d
            int r2 = r2.d()
            if (r2 != 0) goto L_0x0085
            return
        L_0x0085:
            float r2 = r1.f8716b
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0096
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f8716b = r2
            c0.b r2 = r1.f8718d
            r2.k()
        L_0x0096:
            c0.b r2 = r1.f8718d
            int r2 = r2.d()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00a4:
            if (r8 >= r2) goto L_0x00fd
            c0.b r15 = r1.f8718d
            float r15 = r15.a(r8)
            c0.b r4 = r1.f8718d
            c0.i r4 = r4.g(r8)
            int r5 = r4.f8750l
            if (r5 != r3) goto L_0x00d5
            if (r9 != 0) goto L_0x00c2
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00be
        L_0x00bc:
            r12 = 1
            goto L_0x00bf
        L_0x00be:
            r12 = 0
        L_0x00bf:
            r9 = r4
            r11 = r15
            goto L_0x00f9
        L_0x00c2:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cb
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00be
            goto L_0x00bc
        L_0x00cb:
            if (r12 != 0) goto L_0x00f9
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00f9
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x00f9
        L_0x00d5:
            if (r9 != 0) goto L_0x00f9
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f9
            if (r10 != 0) goto L_0x00e7
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00e3
        L_0x00e1:
            r14 = 1
            goto L_0x00e4
        L_0x00e3:
            r14 = 0
        L_0x00e4:
            r10 = r4
            r13 = r15
            goto L_0x00f9
        L_0x00e7:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00e3
            goto L_0x00e1
        L_0x00f0:
            if (r14 != 0) goto L_0x00f9
            int r5 = r4.f8749k
            if (r5 > r3) goto L_0x00f9
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x00f9:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a4
        L_0x00fd:
            if (r9 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r9 = r10
        L_0x0101:
            if (r9 != 0) goto L_0x0105
            r2 = 1
            goto L_0x0109
        L_0x0105:
            r1.f(r9)
            r2 = 0
        L_0x0109:
            c0.b r4 = r1.f8718d
            int r4 = r4.d()
            if (r4 != 0) goto L_0x0113
            r1.e = r3
        L_0x0113:
            if (r2 == 0) goto L_0x018d
            int r2 = r0.f8727h
            int r2 = r2 + r3
            int r4 = r0.f8724d
            if (r2 < r4) goto L_0x011f
            r16.n()
        L_0x011f:
            r2 = 3
            c0.i r2 = r0.a(r2)
            int r4 = r0.f8721a
            int r4 = r4 + r3
            r0.f8721a = r4
            int r5 = r0.f8727h
            int r5 = r5 + r3
            r0.f8727h = r5
            r2.f8742b = r4
            B3.q r5 = r0.f8729k
            java.lang.Object r5 = r5.f452X
            c0.i[] r5 = (c0.i[]) r5
            r5[r4] = r2
            r1.f8715a = r2
            r16.h(r17)
            c0.c r4 = r0.f8732n
            r4.getClass()
            r4.f8715a = r7
            c0.b r5 = r4.f8718d
            r5.clear()
            r5 = 0
        L_0x014a:
            c0.b r8 = r1.f8718d
            int r8 = r8.d()
            if (r5 >= r8) goto L_0x0166
            c0.b r8 = r1.f8718d
            c0.i r8 = r8.g(r5)
            c0.b r9 = r1.f8718d
            float r9 = r9.a(r5)
            c0.b r10 = r4.f8718d
            r10.e(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x014a
        L_0x0166:
            c0.c r4 = r0.f8732n
            r0.p(r4)
            int r4 = r2.f8743c
            r5 = -1
            if (r4 != r5) goto L_0x018b
            c0.i r4 = r1.f8715a
            if (r4 != r2) goto L_0x017d
            c0.i r2 = r1.e(r7, r2)
            if (r2 == 0) goto L_0x017d
            r1.f(r2)
        L_0x017d:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0186
            c0.i r2 = r1.f8715a
            r2.d(r1)
        L_0x0186:
            int r2 = r0.i
            int r2 = r2 - r3
            r0.i = r2
        L_0x018b:
            r4 = 1
            goto L_0x018e
        L_0x018d:
            r4 = 0
        L_0x018e:
            c0.i r2 = r1.f8715a
            if (r2 == 0) goto L_0x019d
            int r2 = r2.f8750l
            if (r2 == r3) goto L_0x019f
            float r2 = r1.f8716b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            return
        L_0x019e:
            r4 = 0
        L_0x019f:
            if (r4 != 0) goto L_0x01a4
            r16.h(r17)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0607e.c(c0.c):void");
    }

    public final void d(i iVar, int i8) {
        int i9 = iVar.f8743c;
        if (i9 == -1) {
            iVar.e = (float) i8;
            iVar.f8745f = true;
            int i10 = iVar.f8748j;
            for (int i11 = 0; i11 < i10; i11++) {
                iVar.i[i11].g(iVar, false);
            }
            iVar.f8748j = 0;
        } else if (i9 != -1) {
            C0605c cVar = this.e[i9];
            if (cVar.e) {
                cVar.f8716b = (float) i8;
            } else if (cVar.f8718d.d() == 0) {
                cVar.e = true;
                cVar.f8716b = (float) i8;
            } else {
                C0605c k8 = k();
                if (i8 < 0) {
                    k8.f8716b = (float) (i8 * -1);
                    k8.f8718d.i(iVar, 1.0f);
                } else {
                    k8.f8716b = (float) i8;
                    k8.f8718d.i(iVar, -1.0f);
                }
                c(k8);
            }
        } else {
            C0605c k9 = k();
            k9.f8715a = iVar;
            float f8 = (float) i8;
            iVar.e = f8;
            k9.f8716b = f8;
            k9.e = true;
            c(k9);
        }
    }

    public final void e(i iVar, i iVar2, int i8, int i9) {
        boolean z = false;
        if (i9 == 8 && iVar2.f8745f && iVar.f8743c == -1) {
            iVar.e = iVar2.e + ((float) i8);
            iVar.f8745f = true;
            int i10 = iVar.f8748j;
            for (int i11 = 0; i11 < i10; i11++) {
                iVar.i[i11].g(iVar, false);
            }
            iVar.f8748j = 0;
            return;
        }
        C0605c k8 = k();
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z = true;
            }
            k8.f8716b = (float) i8;
        }
        if (!z) {
            k8.f8718d.i(iVar, -1.0f);
            k8.f8718d.i(iVar2, 1.0f);
        } else {
            k8.f8718d.i(iVar, 1.0f);
            k8.f8718d.i(iVar2, -1.0f);
        }
        if (i9 != 8) {
            k8.a(this, i9);
        }
        c(k8);
    }

    public final void f(i iVar, i iVar2, int i8, int i9) {
        C0605c k8 = k();
        i l8 = l();
        l8.f8744d = 0;
        k8.b(iVar, iVar2, l8, i8);
        if (i9 != 8) {
            k8.f8718d.i(i(i9), (float) ((int) (k8.f8718d.j(l8) * -1.0f)));
        }
        c(k8);
    }

    public final void g(i iVar, i iVar2, int i8, int i9) {
        C0605c k8 = k();
        i l8 = l();
        l8.f8744d = 0;
        k8.c(iVar, iVar2, l8, i8);
        if (i9 != 8) {
            k8.f8718d.i(i(i9), (float) ((int) (k8.f8718d.j(l8) * -1.0f)));
        }
        c(k8);
    }

    public final void h(C0605c cVar) {
        boolean z = f8720p;
        q qVar = this.f8729k;
        if (z) {
            C0605c cVar2 = this.e[this.i];
            if (cVar2 != null) {
                ((C0608f) qVar.f449U).b(cVar2);
            }
        } else {
            C0605c cVar3 = this.e[this.i];
            if (cVar3 != null) {
                ((C0608f) qVar.f450V).b(cVar3);
            }
        }
        C0605c[] cVarArr = this.e;
        int i8 = this.i;
        cVarArr[i8] = cVar;
        i iVar = cVar.f8715a;
        iVar.f8743c = i8;
        this.i = i8 + 1;
        iVar.d(cVar);
    }

    public final i i(int i8) {
        if (this.f8727h + 1 >= this.f8724d) {
            n();
        }
        i a8 = a(4);
        int i9 = this.f8721a + 1;
        this.f8721a = i9;
        this.f8727h++;
        a8.f8742b = i9;
        a8.f8744d = i8;
        ((i[]) this.f8729k.f452X)[i9] = a8;
        h hVar = this.f8722b;
        hVar.i.f8736U = a8;
        float[] fArr = a8.f8747h;
        Arrays.fill(fArr, 0.0f);
        fArr[a8.f8744d] = 1.0f;
        hVar.i(a8);
        return a8;
    }

    public final i j(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8727h + 1 >= this.f8724d) {
            n();
        }
        if (obj instanceof C0629c) {
            C0629c cVar = (C0629c) obj;
            iVar = cVar.f9581g;
            if (iVar == null) {
                cVar.i();
                iVar = cVar.f9581g;
            }
            int i8 = iVar.f8742b;
            q qVar = this.f8729k;
            if (i8 == -1 || i8 > this.f8721a || ((i[]) qVar.f452X)[i8] == null) {
                if (i8 != -1) {
                    iVar.c();
                }
                int i9 = this.f8721a + 1;
                this.f8721a = i9;
                this.f8727h++;
                iVar.f8742b = i9;
                iVar.f8750l = 1;
                ((i[]) qVar.f452X)[i9] = iVar;
            }
        }
        return iVar;
    }

    public final C0605c k() {
        boolean z = f8720p;
        q qVar = this.f8729k;
        if (z) {
            C0605c cVar = (C0605c) ((C0608f) qVar.f449U).a();
            if (cVar == null) {
                return new C0606d(qVar);
            }
            cVar.f8715a = null;
            cVar.f8718d.clear();
            cVar.f8716b = 0.0f;
            cVar.e = false;
            return cVar;
        }
        C0605c cVar2 = (C0605c) ((C0608f) qVar.f450V).a();
        if (cVar2 == null) {
            return new C0605c(qVar);
        }
        cVar2.f8715a = null;
        cVar2.f8718d.clear();
        cVar2.f8716b = 0.0f;
        cVar2.e = false;
        return cVar2;
    }

    public final i l() {
        if (this.f8727h + 1 >= this.f8724d) {
            n();
        }
        i a8 = a(3);
        int i8 = this.f8721a + 1;
        this.f8721a = i8;
        this.f8727h++;
        a8.f8742b = i8;
        ((i[]) this.f8729k.f452X)[i8] = a8;
        return a8;
    }

    public final void n() {
        int i8 = this.f8723c * 2;
        this.f8723c = i8;
        this.e = (C0605c[]) Arrays.copyOf(this.e, i8);
        q qVar = this.f8729k;
        qVar.f452X = (i[]) Arrays.copyOf((i[]) qVar.f452X, this.f8723c);
        int i9 = this.f8723c;
        this.f8726g = new boolean[i9];
        this.f8724d = i9;
        this.f8728j = i9;
    }

    public final void o(h hVar) {
        q qVar;
        int i8 = 0;
        while (true) {
            if (i8 >= this.i) {
                break;
            }
            C0605c cVar = this.e[i8];
            int i9 = 1;
            if (cVar.f8715a.f8750l != 1) {
                float f8 = 0.0f;
                if (cVar.f8716b < 0.0f) {
                    boolean z = false;
                    int i10 = 0;
                    while (!z) {
                        i10 += i9;
                        float f9 = Float.MAX_VALUE;
                        int i11 = 0;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        while (true) {
                            int i15 = this.i;
                            qVar = this.f8729k;
                            if (i11 >= i15) {
                                break;
                            }
                            C0605c cVar2 = this.e[i11];
                            if (cVar2.f8715a.f8750l != i9 && !cVar2.e && cVar2.f8716b < f8) {
                                int i16 = 1;
                                while (i16 < this.f8727h) {
                                    i iVar = ((i[]) qVar.f452X)[i16];
                                    float j7 = cVar2.f8718d.j(iVar);
                                    if (j7 > f8) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f10 = iVar.f8746g[i17] / j7;
                                            if ((f10 < f9 && i17 == i14) || i17 > i14) {
                                                i14 = i17;
                                                f9 = f10;
                                                i12 = i11;
                                                i13 = i16;
                                            }
                                        }
                                    }
                                    i16++;
                                    f8 = 0.0f;
                                }
                            }
                            i11++;
                            f8 = 0.0f;
                            i9 = 1;
                        }
                        if (i12 != -1) {
                            C0605c cVar3 = this.e[i12];
                            cVar3.f8715a.f8743c = -1;
                            cVar3.f(((i[]) qVar.f452X)[i13]);
                            i iVar2 = cVar3.f8715a;
                            iVar2.f8743c = i12;
                            iVar2.d(cVar3);
                        } else {
                            z = true;
                        }
                        if (i10 > this.f8727h / 2) {
                            z = true;
                        }
                        f8 = 0.0f;
                        i9 = 1;
                    }
                }
            }
            i8++;
        }
        p(hVar);
        for (int i18 = 0; i18 < this.i; i18++) {
            C0605c cVar4 = this.e[i18];
            cVar4.f8715a.e = cVar4.f8716b;
        }
    }

    public final void p(C0605c cVar) {
        for (int i8 = 0; i8 < this.f8727h; i8++) {
            this.f8726g[i8] = false;
        }
        boolean z = false;
        int i9 = 0;
        while (!z) {
            i9++;
            if (i9 < this.f8727h * 2) {
                i iVar = cVar.f8715a;
                if (iVar != null) {
                    this.f8726g[iVar.f8742b] = true;
                }
                i d8 = cVar.d(this.f8726g);
                if (d8 != null) {
                    boolean[] zArr = this.f8726g;
                    int i10 = d8.f8742b;
                    if (!zArr[i10]) {
                        zArr[i10] = true;
                    } else {
                        return;
                    }
                }
                if (d8 != null) {
                    float f8 = Float.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.i; i12++) {
                        C0605c cVar2 = this.e[i12];
                        if (cVar2.f8715a.f8750l != 1 && !cVar2.e && cVar2.f8718d.f(d8)) {
                            float j7 = cVar2.f8718d.j(d8);
                            if (j7 < 0.0f) {
                                float f9 = (-cVar2.f8716b) / j7;
                                if (f9 < f8) {
                                    i11 = i12;
                                    f8 = f9;
                                }
                            }
                        }
                    }
                    if (i11 > -1) {
                        C0605c cVar3 = this.e[i11];
                        cVar3.f8715a.f8743c = -1;
                        cVar3.f(d8);
                        i iVar2 = cVar3.f8715a;
                        iVar2.f8743c = i11;
                        iVar2.d(cVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    public final void q() {
        boolean z = f8720p;
        q qVar = this.f8729k;
        int i8 = 0;
        if (z) {
            while (true) {
                C0605c[] cVarArr = this.e;
                if (i8 < cVarArr.length) {
                    C0605c cVar = cVarArr[i8];
                    if (cVar != null) {
                        ((C0608f) qVar.f449U).b(cVar);
                    }
                    this.e[i8] = null;
                    i8++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C0605c[] cVarArr2 = this.e;
                if (i8 < cVarArr2.length) {
                    C0605c cVar2 = cVarArr2[i8];
                    if (cVar2 != null) {
                        ((C0608f) qVar.f450V).b(cVar2);
                    }
                    this.e[i8] = null;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        q qVar;
        int i8 = 0;
        while (true) {
            qVar = this.f8729k;
            i[] iVarArr = (i[]) qVar.f452X;
            if (i8 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i8];
            if (iVar != null) {
                iVar.c();
            }
            i8++;
        }
        C0608f fVar = (C0608f) qVar.f451W;
        i[] iVarArr2 = this.f8730l;
        int i9 = this.f8731m;
        fVar.getClass();
        if (i9 > iVarArr2.length) {
            i9 = iVarArr2.length;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            i iVar2 = iVarArr2[i10];
            int i11 = fVar.f8735c;
            Object[] objArr = fVar.f8734b;
            if (i11 < objArr.length) {
                objArr[i11] = iVar2;
                fVar.f8735c = i11 + 1;
            }
        }
        this.f8731m = 0;
        Arrays.fill((i[]) qVar.f452X, (Object) null);
        this.f8721a = 0;
        h hVar = this.f8722b;
        hVar.f8740h = 0;
        hVar.f8716b = 0.0f;
        this.f8727h = 1;
        for (int i12 = 0; i12 < this.i; i12++) {
            this.e[i12].getClass();
        }
        q();
        this.i = 0;
        if (f8720p) {
            this.f8732n = new C0606d(qVar);
        } else {
            this.f8732n = new C0605c(qVar);
        }
    }
}
