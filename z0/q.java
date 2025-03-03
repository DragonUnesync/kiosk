package Z0;

import D2.j;
import H3.C0103u;
import H3.O;
import H3.P;
import M0.C0126n;
import M0.C0129q;
import M0.H;
import M0.I;
import M0.Y;
import M0.r;
import P0.l;
import P0.z;
import Q0.g;
import R0.v;
import Y0.h;
import a1.C0413d;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import h1.C1031B;
import h1.C1036b;
import h1.C1048n;
import h1.C1053t;
import h1.W;
import h1.a0;
import h1.f0;
import i1.C1092e;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.e;
import l1.i;
import l1.k;
import l1.m;
import l1.n;
import l1.p;

public final class q implements k, n, a0, p1.q, W {

    /* renamed from: S0  reason: collision with root package name */
    public static final Set f6879S0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A0  reason: collision with root package name */
    public r f6880A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f6881B0;

    /* renamed from: C0  reason: collision with root package name */
    public f0 f6882C0;

    /* renamed from: D0  reason: collision with root package name */
    public Set f6883D0;

    /* renamed from: E0  reason: collision with root package name */
    public int[] f6884E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f6885F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f6886G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean[] f6887H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean[] f6888I0;

    /* renamed from: J0  reason: collision with root package name */
    public long f6889J0;

    /* renamed from: K0  reason: collision with root package name */
    public long f6890K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f6891L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f6892M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f6893N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f6894O0;

    /* renamed from: P0  reason: collision with root package name */
    public long f6895P0;

    /* renamed from: Q0  reason: collision with root package name */
    public C0126n f6896Q0;

    /* renamed from: R0  reason: collision with root package name */
    public j f6897R0;

    /* renamed from: U  reason: collision with root package name */
    public final String f6898U;

    /* renamed from: V  reason: collision with root package name */
    public final int f6899V;

    /* renamed from: W  reason: collision with root package name */
    public final P f6900W;

    /* renamed from: X  reason: collision with root package name */
    public final i f6901X;

    /* renamed from: Y  reason: collision with root package name */
    public final e f6902Y;

    /* renamed from: Z  reason: collision with root package name */
    public final r f6903Z;

    /* renamed from: a0  reason: collision with root package name */
    public final h f6904a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Y0.e f6905b0;

    /* renamed from: c0  reason: collision with root package name */
    public final C1048n f6906c0;

    /* renamed from: d0  reason: collision with root package name */
    public final p f6907d0 = new p("Loader:HlsSampleStreamWrapper");

    /* renamed from: e0  reason: collision with root package name */
    public final Y0.e f6908e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f6909f0;

    /* renamed from: g0  reason: collision with root package name */
    public final com.bumptech.glide.manager.q f6910g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f6911h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f6912i0;

    /* renamed from: j0  reason: collision with root package name */
    public final n f6913j0;

    /* renamed from: k0  reason: collision with root package name */
    public final n f6914k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Handler f6915l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f6916m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Map f6917n0;

    /* renamed from: o0  reason: collision with root package name */
    public C1092e f6918o0;
    public p[] p0;

    /* renamed from: q0  reason: collision with root package name */
    public int[] f6919q0;

    /* renamed from: r0  reason: collision with root package name */
    public final HashSet f6920r0;

    /* renamed from: s0  reason: collision with root package name */
    public final SparseIntArray f6921s0;

    /* renamed from: t0  reason: collision with root package name */
    public o f6922t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6923u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f6924v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f6925w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f6926x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6927y0;

    /* renamed from: z0  reason: collision with root package name */
    public r f6928z0;

    public q(String str, int i, P p3, i iVar, Map map, e eVar, long j7, r rVar, h hVar, Y0.e eVar2, C1048n nVar, Y0.e eVar3, int i8) {
        this.f6898U = str;
        this.f6899V = i;
        this.f6900W = p3;
        this.f6901X = iVar;
        this.f6917n0 = map;
        this.f6902Y = eVar;
        this.f6903Z = rVar;
        this.f6904a0 = hVar;
        this.f6905b0 = eVar2;
        this.f6906c0 = nVar;
        this.f6908e0 = eVar3;
        this.f6909f0 = i8;
        com.bumptech.glide.manager.q qVar = new com.bumptech.glide.manager.q(4);
        qVar.f9081W = null;
        qVar.f9080V = false;
        qVar.f9082X = null;
        this.f6910g0 = qVar;
        this.f6919q0 = new int[0];
        Set set = f6879S0;
        this.f6920r0 = new HashSet(set.size());
        this.f6921s0 = new SparseIntArray(set.size());
        this.p0 = new p[0];
        this.f6888I0 = new boolean[0];
        this.f6887H0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f6911h0 = arrayList;
        this.f6912i0 = DesugarCollections.unmodifiableList(arrayList);
        this.f6916m0 = new ArrayList();
        this.f6913j0 = new n(this, 0);
        this.f6914k0 = new n(this, 1);
        this.f6915l0 = z.m((Handler.Callback) null);
        this.f6889J0 = j7;
        this.f6890K0 = j7;
    }

    public static int B(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return 0;
        }
        return 1;
    }

    public static p1.n v(int i, int i8) {
        l.B("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i8);
        return new p1.n();
    }

    public static r x(r rVar, r rVar2, boolean z) {
        String str;
        String str2;
        int i;
        int i8;
        if (rVar == null) {
            return rVar2;
        }
        String str3 = rVar2.f3036n;
        int i9 = I.i(str3);
        String str4 = rVar.f3033k;
        if (z.t(i9, str4) == 1) {
            str2 = z.u(i9, str4);
            str = I.e(str2);
        } else {
            String c8 = I.c(str4, str3);
            str = str3;
            str2 = c8;
        }
        C0129q a8 = rVar2.a();
        a8.f2989a = rVar.f3025a;
        a8.f2990b = rVar.f3026b;
        a8.f2991c = O.m(rVar.f3027c);
        a8.f2992d = rVar.f3028d;
        a8.e = rVar.e;
        a8.f2993f = rVar.f3029f;
        if (z) {
            i = rVar.f3031h;
        } else {
            i = -1;
        }
        a8.f2995h = i;
        if (z) {
            i8 = rVar.i;
        } else {
            i8 = -1;
        }
        a8.i = i8;
        a8.f2996j = str2;
        if (i9 == 2) {
            a8.f3006t = rVar.f3043u;
            a8.f3007u = rVar.f3044v;
            a8.f3008v = rVar.f3045w;
        }
        if (str != null) {
            a8.g(str);
        }
        int i10 = rVar.f3014C;
        if (i10 != -1 && i9 == 1) {
            a8.f2979B = i10;
        }
        H h5 = rVar.f3034l;
        if (h5 != null) {
            H h8 = rVar2.f3034l;
            if (h8 != null) {
                h5 = h8.v(h5);
            }
            a8.f2997k = h5;
        }
        return new r(a8);
    }

    public final void A(m mVar, long j7, long j8, boolean z) {
        C1092e eVar = (C1092e) mVar;
        this.f6918o0 = null;
        long j9 = eVar.f12659U;
        Uri uri = eVar.f12667c0.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f6906c0.getClass();
        this.f6908e0.c(tVar, eVar.f12661W, this.f6899V, eVar.f12662X, eVar.f12663Y, eVar.f12664Z, eVar.f12665a0, eVar.f12666b0);
        if (!z) {
            if (C() || this.f6927y0 == 0) {
                G();
            }
            if (this.f6927y0 > 0) {
                this.f6900W.f0(this);
            }
        }
    }

    public final boolean C() {
        if (this.f6890K0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void D() {
        boolean z;
        int i;
        r rVar;
        if (!this.f6881B0 && this.f6884E0 == null && this.f6925w0) {
            p[] pVarArr = this.p0;
            int length = pVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                if (pVarArr[i8].u() != null) {
                    i8++;
                } else {
                    return;
                }
            }
            f0 f0Var = this.f6882C0;
            if (f0Var != null) {
                int i9 = f0Var.f12469a;
                int[] iArr = new int[i9];
                this.f6884E0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        p[] pVarArr2 = this.p0;
                        if (i11 >= pVarArr2.length) {
                            break;
                        }
                        r u3 = pVarArr2[i11].u();
                        l.k(u3);
                        r rVar2 = this.f6882C0.a(i10).f2888d[0];
                        String str = rVar2.f3036n;
                        String str2 = u3.f3036n;
                        int i12 = I.i(str2);
                        if (i12 == 3) {
                            int i13 = z.f3748a;
                            if (Objects.equals(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || u3.f3019H == rVar2.f3019H) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i11++;
                        } else if (i12 == I.i(str)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    this.f6884E0[i10] = i11;
                }
                Iterator it = this.f6916m0.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).b();
                }
                return;
            }
            int length2 = this.p0.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 2;
                if (i14 >= length2) {
                    break;
                }
                r u8 = this.p0[i14].u();
                l.k(u8);
                String str3 = u8.f3036n;
                if (!I.n(str3)) {
                    if (I.k(str3)) {
                        i17 = 1;
                    } else if (I.m(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (B(i17) > B(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            Y y8 = this.f6901X.f6795h;
            int i18 = y8.f2885a;
            this.f6885F0 = -1;
            this.f6884E0 = new int[length2];
            for (int i19 = 0; i19 < length2; i19++) {
                this.f6884E0[i19] = i19;
            }
            Y[] yArr = new Y[length2];
            for (int i20 = 0; i20 < length2; i20++) {
                r u9 = this.p0[i20].u();
                l.k(u9);
                String str4 = this.f6898U;
                r rVar3 = this.f6903Z;
                if (i20 == i16) {
                    r[] rVarArr = new r[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        r rVar4 = y8.f2888d[i21];
                        if (i15 == 1 && rVar3 != null) {
                            rVar4 = rVar4.e(rVar3);
                        }
                        if (i18 == 1) {
                            rVar = u9.e(rVar4);
                        } else {
                            rVar = x(rVar4, u9, true);
                        }
                        rVarArr[i21] = rVar;
                    }
                    yArr[i20] = new Y(str4, rVarArr);
                    this.f6885F0 = i20;
                } else {
                    if (i15 != 2 || !I.k(u9.f3036n)) {
                        rVar3 = null;
                    }
                    StringBuilder B8 = N.e.B(str4, ":muxed:");
                    if (i20 < i16) {
                        i = i20;
                    } else {
                        i = i20 - 1;
                    }
                    B8.append(i);
                    yArr[i20] = new Y(B8.toString(), x(rVar3, u9, false));
                }
            }
            this.f6882C0 = w(yArr);
            if (this.f6883D0 == null) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            this.f6883D0 = Collections.emptySet();
            this.f6926x0 = true;
            this.f6900W.C0();
        }
    }

    public final void E() {
        this.f6907d0.a();
        i iVar = this.f6901X;
        C1036b bVar = iVar.f6800n;
        if (bVar == null) {
            Uri uri = iVar.f6801o;
            if (uri != null && iVar.f6805s) {
                C0413d dVar = (C0413d) iVar.f6794g.f7046X.get(uri);
                dVar.f7031V.a();
                IOException iOException = dVar.f7039d0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(Y[] yArr, int... iArr) {
        this.f6882C0 = w(yArr);
        this.f6883D0 = new HashSet();
        for (int a8 : iArr) {
            this.f6883D0.add(this.f6882C0.a(a8));
        }
        this.f6885F0 = 0;
        this.f6915l0.post(new U.p(6, (Object) this.f6900W));
        this.f6926x0 = true;
    }

    public final void G() {
        for (p D8 : this.p0) {
            D8.D(this.f6891L0);
        }
        this.f6891L0 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r12 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(long r10, boolean r12) {
        /*
            r9 = this;
            r9.f6889J0 = r10
            boolean r0 = r9.C()
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r9.f6890K0 = r10
            return r1
        L_0x000c:
            Z0.i r0 = r9.f6901X
            boolean r0 = r0.f6802p
            java.util.ArrayList r2 = r9.f6911h0
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x002d
            r0 = 0
        L_0x0017:
            int r5 = r2.size()
            if (r0 >= r5) goto L_0x002d
            java.lang.Object r5 = r2.get(r0)
            Z0.j r5 = (Z0.j) r5
            long r6 = r5.f12665a0
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x002d:
            r5 = r3
        L_0x002e:
            boolean r0 = r9.f6925w0
            if (r0 == 0) goto L_0x0062
            if (r12 != 0) goto L_0x0062
            Z0.p[] r12 = r9.p0
            int r12 = r12.length
            r0 = 0
        L_0x0038:
            if (r0 >= r12) goto L_0x005e
            Z0.p[] r6 = r9.p0
            r6 = r6[r0]
            if (r5 == 0) goto L_0x0049
            int r7 = r5.g(r0)
            boolean r6 = r6.F(r7)
            goto L_0x004d
        L_0x0049:
            boolean r6 = r6.G(r10, r4)
        L_0x004d:
            if (r6 != 0) goto L_0x005b
            boolean[] r6 = r9.f6888I0
            boolean r6 = r6[r0]
            if (r6 != 0) goto L_0x0059
            boolean r6 = r9.f6886G0
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r12 = 0
            goto L_0x005f
        L_0x005b:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x005e:
            r12 = 1
        L_0x005f:
            if (r12 == 0) goto L_0x0062
            return r4
        L_0x0062:
            r9.f6890K0 = r10
            r9.f6893N0 = r4
            r2.clear()
            l1.p r10 = r9.f6907d0
            boolean r11 = r10.d()
            if (r11 == 0) goto L_0x0086
            boolean r11 = r9.f6925w0
            if (r11 == 0) goto L_0x0082
            Z0.p[] r11 = r9.p0
            int r12 = r11.length
        L_0x0078:
            if (r4 >= r12) goto L_0x0082
            r0 = r11[r4]
            r0.j()
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0082:
            r10.b()
            goto L_0x008b
        L_0x0086:
            r10.f13152W = r3
            r9.G()
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.q.H(long, boolean):boolean");
    }

    public final void a() {
        l.j(this.f6926x0);
        this.f6882C0.getClass();
        this.f6883D0.getClass();
    }

    public final boolean b() {
        return this.f6907d0.d();
    }

    public final void c() {
        for (p C8 : this.p0) {
            C8.C();
        }
    }

    public final long e() {
        if (C()) {
            return this.f6890K0;
        }
        if (this.f6893N0) {
            return Long.MIN_VALUE;
        }
        return z().f12666b0;
    }

    public final void g() {
        this.f6894O0 = true;
        this.f6915l0.post(this.f6914k0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: Z0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: Z0.a} */
    /* JADX WARNING: type inference failed for: r1v28, types: [java.io.IOException, h1.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(T0.I r58) {
        /*
            r57 = this;
            r0 = r57
            r1 = 1
            boolean r2 = r0.f6893N0
            r3 = 0
            if (r2 != 0) goto L_0x0016
            l1.p r2 = r0.f6907d0
            boolean r4 = r2.d()
            if (r4 != 0) goto L_0x0016
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x001a
        L_0x0016:
            r1 = r0
            r0 = 0
            goto L_0x0573
        L_0x001a:
            boolean r4 = r57.C()
            if (r4 == 0) goto L_0x0036
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.f6890K0
            Z0.p[] r7 = r0.p0
            int r8 = r7.length
            r9 = 0
        L_0x002a:
            if (r9 >= r8) goto L_0x0034
            r10 = r7[r9]
            long r11 = r0.f6890K0
            r10.f12424t = r11
            int r9 = r9 + r1
            goto L_0x002a
        L_0x0034:
            r14 = r4
            goto L_0x004e
        L_0x0036:
            Z0.j r4 = r57.z()
            boolean r5 = r4.f6808B0
            if (r5 == 0) goto L_0x0042
            long r4 = r4.f12666b0
        L_0x0040:
            r5 = r4
            goto L_0x004b
        L_0x0042:
            long r5 = r0.f6889J0
            long r7 = r4.f12665a0
            long r4 = java.lang.Math.max(r5, r7)
            goto L_0x0040
        L_0x004b:
            java.util.List r4 = r0.f6912i0
            goto L_0x0034
        L_0x004e:
            com.bumptech.glide.manager.q r4 = r0.f6910g0
            r15 = 0
            r4.f9081W = r15
            r4.f9080V = r3
            r4.f9082X = r15
            boolean r7 = r0.f6926x0
            if (r7 != 0) goto L_0x0065
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r16 = 0
            goto L_0x0067
        L_0x0065:
            r16 = 1
        L_0x0067:
            Z0.i r12 = r0.f6901X
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x0071
            r13 = r15
            goto L_0x0078
        L_0x0071:
            java.lang.Object r7 = H3.C0103u.l(r14)
            Z0.j r7 = (Z0.j) r7
            r13 = r7
        L_0x0078:
            if (r13 != 0) goto L_0x007e
            r7 = r58
            r11 = -1
            goto L_0x0089
        L_0x007e:
            M0.Y r7 = r12.f6795h
            M0.r r8 = r13.f12662X
            int r7 = r7.b(r8)
            r11 = r7
            r7 = r58
        L_0x0089:
            long r8 = r7.f4675a
            long r17 = r5 - r8
            r20 = r11
            long r10 = r12.f6804r
            r21 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x009e
            long r10 = r10 - r8
            goto L_0x009f
        L_0x009e:
            r10 = r1
        L_0x009f:
            if (r13 == 0) goto L_0x00c8
            boolean r7 = r12.f6802p
            if (r7 != 0) goto L_0x00c8
            r22 = r4
            long r3 = r13.f12666b0
            long r1 = r13.f12665a0
            long r3 = r3 - r1
            long r1 = r17 - r3
            r23 = r14
            r14 = 0
            long r1 = java.lang.Math.max(r14, r1)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x00c6
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r14, r10)
        L_0x00c4:
            r10 = r1
            goto L_0x00cf
        L_0x00c6:
            r3 = r10
            goto L_0x00c4
        L_0x00c8:
            r22 = r4
            r23 = r14
            r3 = r10
            r10 = r17
        L_0x00cf:
            i1.k[] r15 = r12.a(r13, r5)
            k1.r r7 = r12.f6803q
            r1 = r20
            r2 = -1
            r14 = r12
            r58 = r13
            r12 = r3
            r3 = r14
            r14 = r23
            r4 = 0
            r7.b(r8, r10, r12, r14, r15)
            k1.r r7 = r3.f6803q
            int r12 = r7.k()
            if (r1 == r12) goto L_0x00ed
            r13 = 1
            goto L_0x00ee
        L_0x00ed:
            r13 = 0
        L_0x00ee:
            android.net.Uri[] r14 = r3.e
            r15 = r14[r12]
            a1.e r10 = r3.f6794g
            boolean r7 = r10.c(r15)
            if (r7 != 0) goto L_0x010e
            r7 = r22
            r7.f9082X = r15
            boolean r1 = r3.f6805s
            android.net.Uri r2 = r3.f6801o
            boolean r2 = r15.equals(r2)
            r1 = r1 & r2
            r3.f6805s = r1
            r3.f6801o = r15
            r0 = r7
            goto L_0x04b3
        L_0x010e:
            r7 = r22
            r8 = 1
            a1.k r11 = r10.a(r8, r15)
            r11.getClass()
            boolean r8 = r11.f7113c
            r3.f6802p = r8
            boolean r8 = r11.f7088o
            r17 = r5
            long r4 = r11.f7082h
            if (r8 == 0) goto L_0x012b
            r8 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0136
        L_0x012b:
            long r8 = r11.f7094u
            long r8 = r8 + r4
            r19 = r3
            long r2 = r10.f7056h0
            long r2 = r8 - r2
            r8 = r19
        L_0x0136:
            r8.f6804r = r2
            long r2 = r10.f7056h0
            long r2 = r4 - r2
            r9 = r7
            r7 = 0
            r4 = r8
            r5 = r58
            r6 = r13
            r19 = r12
            r12 = r7
            r7 = r11
            r22 = r8
            r12 = r9
            r8 = r2
            r24 = r2
            r3 = r10
            r2 = r11
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r7 = r2.f7084k
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x01a4
            r10 = r58
            if (r10 == 0) goto L_0x01a2
            if (r13 == 0) goto L_0x01a2
            r15 = r14[r1]
            r2 = 1
            a1.k r13 = r3.a(r2, r15)
            r13.getClass()
            long r4 = r3.f7056h0
            long r6 = r13.f7082h
            long r24 = r6 - r4
            r6 = 0
            r4 = r22
            r5 = r10
            r7 = r13
            r8 = r24
            r2 = r10
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11 = r1
            r7 = r2
            r2 = r13
            goto L_0x01a8
        L_0x01a2:
            r7 = r10
            goto L_0x01a6
        L_0x01a4:
            r7 = r58
        L_0x01a6:
            r11 = r19
        L_0x01a8:
            if (r11 == r1) goto L_0x01bc
            r8 = -1
            if (r1 == r8) goto L_0x01bc
            r1 = r14[r1]
            java.util.HashMap r3 = r3.f7046X
            java.lang.Object r1 = r3.get(r1)
            a1.d r1 = (a1.C0413d) r1
            if (r1 == 0) goto L_0x01bc
            r3 = 0
            r1.f7040e0 = r3
        L_0x01bc:
            long r8 = r2.f7084k
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ce
            h1.b r1 = new h1.b
            r1.<init>()
            r3 = r22
            r3.f6800n = r1
        L_0x01cb:
            r0 = r12
            goto L_0x04b3
        L_0x01ce:
            r3 = r22
            long r13 = r5 - r8
            int r1 = (int) r13
            H3.O r10 = r2.f7091r
            int r13 = r10.size()
            r17 = 1
            H3.O r14 = r2.f7092s
            if (r1 != r13) goto L_0x01f9
            r13 = -1
            if (r4 == r13) goto L_0x01e3
            goto L_0x01e4
        L_0x01e3:
            r4 = 0
        L_0x01e4:
            int r1 = r14.size()
            if (r4 >= r1) goto L_0x01f6
            Z0.h r1 = new Z0.h
            java.lang.Object r13 = r14.get(r4)
            a1.i r13 = (a1.i) r13
            r1.<init>(r13, r5, r4)
            goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            r0 = r1
            goto L_0x024b
        L_0x01f9:
            java.lang.Object r13 = r10.get(r1)
            a1.h r13 = (a1.h) r13
            r0 = -1
            if (r4 != r0) goto L_0x0208
            Z0.h r1 = new Z0.h
            r1.<init>(r13, r5, r0)
            goto L_0x01f7
        L_0x0208:
            H3.O r0 = r13.f7063g0
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x021e
            Z0.h r0 = new Z0.h
            H3.O r1 = r13.f7063g0
            java.lang.Object r1 = r1.get(r4)
            a1.i r1 = (a1.i) r1
            r0.<init>(r1, r5, r4)
            goto L_0x024b
        L_0x021e:
            r0 = 1
            int r1 = r1 + r0
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0235
            Z0.h r0 = new Z0.h
            java.lang.Object r1 = r10.get(r1)
            a1.i r1 = (a1.i) r1
            long r5 = r5 + r17
            r4 = -1
            r0.<init>(r1, r5, r4)
            goto L_0x024b
        L_0x0235:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x024a
            Z0.h r0 = new Z0.h
            r1 = 0
            java.lang.Object r4 = r14.get(r1)
            a1.i r4 = (a1.i) r4
            long r5 = r5 + r17
            r0.<init>(r4, r5, r1)
            goto L_0x024b
        L_0x024a:
            r0 = 0
        L_0x024b:
            if (r0 != 0) goto L_0x0280
            boolean r0 = r2.f7088o
            if (r0 != 0) goto L_0x0262
            r12.f9082X = r15
            boolean r0 = r3.f6805s
            android.net.Uri r1 = r3.f6801o
            boolean r1 = r15.equals(r1)
            r0 = r0 & r1
            r3.f6805s = r0
            r3.f6801o = r15
            goto L_0x01cb
        L_0x0262:
            if (r16 != 0) goto L_0x026a
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x026c
        L_0x026a:
            r0 = 1
            goto L_0x0282
        L_0x026c:
            Z0.h r0 = new Z0.h
            java.lang.Object r1 = H3.C0103u.l(r10)
            a1.i r1 = (a1.i) r1
            int r4 = r10.size()
            long r4 = (long) r4
            long r8 = r8 + r4
            long r8 = r8 - r17
            r4 = -1
            r0.<init>(r1, r8, r4)
        L_0x0280:
            r1 = 0
            goto L_0x0286
        L_0x0282:
            r12.f9080V = r0
            goto L_0x01cb
        L_0x0286:
            r3.f6805s = r1
            r1 = 0
            r3.f6801o = r1
            android.os.SystemClock.elapsedRealtime()
            a1.i r1 = r0.f6785a
            a1.h r4 = r1.f7065V
            java.lang.String r5 = r2.f7111a
            if (r4 == 0) goto L_0x02a1
            java.lang.String r4 = r4.f7070a0
            if (r4 != 0) goto L_0x029b
            goto L_0x02a1
        L_0x029b:
            android.net.Uri r4 = P0.l.z(r5, r4)
        L_0x029f:
            r6 = 1
            goto L_0x02a3
        L_0x02a1:
            r4 = 0
            goto L_0x029f
        L_0x02a3:
            Z0.e r8 = r3.d(r4, r11, r6)
            r12.f9081W = r8
            if (r8 == 0) goto L_0x02ad
        L_0x02ab:
            goto L_0x01cb
        L_0x02ad:
            java.lang.String r6 = r1.f7070a0
            if (r6 != 0) goto L_0x02b4
            r6 = 0
        L_0x02b2:
            r8 = 0
            goto L_0x02b9
        L_0x02b4:
            android.net.Uri r6 = P0.l.z(r5, r6)
            goto L_0x02b2
        L_0x02b9:
            Z0.e r9 = r3.d(r6, r11, r8)
            r12.f9081W = r9
            if (r9 == 0) goto L_0x02c2
            goto L_0x02ab
        L_0x02c2:
            long r8 = r1.f7068Y
            if (r7 != 0) goto L_0x02cf
            java.util.concurrent.atomic.AtomicInteger r10 = Z0.j.f6806F0
        L_0x02c8:
            r16 = r8
            r22 = r12
            r55 = 0
            goto L_0x0308
        L_0x02cf:
            android.net.Uri r10 = r7.f6814g0
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x02dc
            boolean r10 = r7.f6808B0
            if (r10 == 0) goto L_0x02dc
            goto L_0x02c8
        L_0x02dc:
            long r13 = r24 + r8
            boolean r10 = r1 instanceof a1.f
            r22 = r12
            boolean r12 = r2.f7113c
            if (r10 == 0) goto L_0x02f8
            r10 = r1
            a1.f r10 = (a1.f) r10
            boolean r10 = r10.f7057f0
            if (r10 != 0) goto L_0x02f6
            int r10 = r0.f6787c
            if (r10 != 0) goto L_0x02f4
            if (r12 == 0) goto L_0x02f4
            goto L_0x02f6
        L_0x02f4:
            r10 = 0
            goto L_0x02f7
        L_0x02f6:
            r10 = 1
        L_0x02f7:
            r12 = r10
        L_0x02f8:
            r16 = r8
            if (r12 == 0) goto L_0x0305
            long r8 = r7.f12666b0
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r8 = 0
            goto L_0x0306
        L_0x0305:
            r8 = 1
        L_0x0306:
            r55 = r8
        L_0x0308:
            boolean r8 = r0.f6788d
            if (r55 == 0) goto L_0x0312
            if (r8 == 0) goto L_0x0312
            r0 = r22
            goto L_0x04b3
        L_0x0312:
            M0.r[] r9 = r3.f6793f
            r30 = r9[r11]
            k1.r r9 = r3.f6803q
            int r37 = r9.n()
            k1.r r9 = r3.f6803q
            java.lang.Object r38 = r9.r()
            boolean r9 = r3.f6798l
            H3.P r10 = r3.f6796j
            if (r6 != 0) goto L_0x032d
            r10.getClass()
            r6 = 0
            goto L_0x0337
        L_0x032d:
            java.lang.Object r11 = r10.f2027U
            Z0.d r11 = (Z0.d) r11
            java.lang.Object r6 = r11.get(r6)
            byte[] r6 = (byte[]) r6
        L_0x0337:
            if (r4 != 0) goto L_0x033b
            r4 = 0
            goto L_0x0345
        L_0x033b:
            java.lang.Object r10 = r10.f2027U
            Z0.d r10 = (Z0.d) r10
            java.lang.Object r4 = r10.get(r4)
            byte[] r4 = (byte[]) r4
        L_0x0345:
            java.util.concurrent.atomic.AtomicInteger r10 = Z0.j.f6806F0
            java.util.Map r43 = java.util.Collections.emptyMap()
            java.lang.String r10 = r1.f7064U
            android.net.Uri r10 = P0.l.z(r5, r10)
            if (r8 == 0) goto L_0x0358
            r11 = 8
            r49 = 8
            goto L_0x035a
        L_0x0358:
            r49 = 0
        L_0x035a:
            java.lang.String r11 = "The uri must be set."
            P0.l.l(r10, r11)
            R0.l r29 = new R0.l
            r42 = 0
            r48 = 0
            r41 = 1
            long r12 = r1.f7072c0
            r14 = r8
            r18 = r9
            long r8 = r1.f7073d0
            r39 = r29
            r40 = r10
            r44 = r12
            r46 = r8
            r39.<init>(r40, r41, r42, r43, r44, r46, r48, r49)
            if (r6 == 0) goto L_0x037e
            r31 = 1
            goto L_0x0380
        L_0x037e:
            r31 = 0
        L_0x0380:
            if (r31 == 0) goto L_0x038c
            java.lang.String r8 = r1.f7071b0
            r8.getClass()
            byte[] r8 = Z0.j.f(r8)
            goto L_0x038d
        L_0x038c:
            r8 = 0
        L_0x038d:
            R0.h r9 = r3.f6790b
            if (r6 == 0) goto L_0x039c
            r8.getClass()
            Z0.a r10 = new Z0.a
            r10.<init>(r9, r6, r8)
            r28 = r10
            goto L_0x039e
        L_0x039c:
            r28 = r9
        L_0x039e:
            a1.h r6 = r1.f7065V
            if (r6 == 0) goto L_0x03f0
            if (r4 == 0) goto L_0x03a6
            r8 = 1
            goto L_0x03a7
        L_0x03a6:
            r8 = 0
        L_0x03a7:
            if (r8 == 0) goto L_0x03b3
            java.lang.String r10 = r6.f7071b0
            r10.getClass()
            byte[] r10 = Z0.j.f(r10)
            goto L_0x03b4
        L_0x03b3:
            r10 = 0
        L_0x03b4:
            java.lang.String r12 = r6.f7064U
            android.net.Uri r5 = P0.l.z(r5, r12)
            java.util.Map r43 = java.util.Collections.emptyMap()
            P0.l.l(r5, r11)
            R0.l r11 = new R0.l
            long r12 = r6.f7072c0
            r49 = 0
            r41 = 1
            r42 = 0
            r58 = r14
            r19 = r15
            long r14 = r6.f7073d0
            r48 = 0
            r39 = r11
            r40 = r5
            r44 = r12
            r46 = r14
            r39.<init>(r40, r41, r42, r43, r44, r46, r48, r49)
            if (r4 == 0) goto L_0x03ea
            r10.getClass()
            Z0.a r5 = new Z0.a
            r5.<init>(r9, r4, r10)
            r15 = r5
            goto L_0x03eb
        L_0x03ea:
            r15 = r9
        L_0x03eb:
            r34 = r8
            r32 = r15
            goto L_0x03f9
        L_0x03f0:
            r58 = r14
            r19 = r15
            r11 = 0
            r32 = 0
            r34 = 0
        L_0x03f9:
            long r39 = r24 + r16
            long r4 = r1.f7066W
            long r41 = r39 + r4
            int r2 = r2.f7083j
            int r4 = r1.f7067X
            int r2 = r2 + r4
            if (r7 == 0) goto L_0x0450
            R0.l r4 = r7.f6818k0
            if (r11 == r4) goto L_0x0423
            if (r11 == 0) goto L_0x0421
            if (r4 == 0) goto L_0x0421
            android.net.Uri r5 = r11.f4277a
            android.net.Uri r6 = r4.f4277a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0421
            long r5 = r11.e
            long r8 = r4.e
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0421
            goto L_0x0423
        L_0x0421:
            r4 = 0
            goto L_0x0424
        L_0x0423:
            r4 = 1
        L_0x0424:
            android.net.Uri r5 = r7.f6814g0
            r15 = r19
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0434
            boolean r5 = r7.f6808B0
            if (r5 == 0) goto L_0x0434
            r5 = 1
            goto L_0x0435
        L_0x0434:
            r5 = 0
        L_0x0435:
            if (r4 == 0) goto L_0x0444
            if (r5 == 0) goto L_0x0444
            boolean r4 = r7.f6810D0
            if (r4 != 0) goto L_0x0444
            int r4 = r7.f6813f0
            if (r4 != r2) goto L_0x0444
            Z0.b r4 = r7.f6829w0
            goto L_0x0445
        L_0x0444:
            r4 = 0
        L_0x0445:
            D1.h r5 = r7.f6825s0
            P0.r r6 = r7.f6826t0
            r52 = r4
            r53 = r5
        L_0x044d:
            r54 = r6
            goto L_0x0464
        L_0x0450:
            r15 = r19
            D1.h r4 = new D1.h
            r5 = 0
            r4.<init>(r5)
            P0.r r6 = new P0.r
            r7 = 10
            r6.<init>((int) r7)
            r53 = r4
            r52 = r5
            goto L_0x044d
        L_0x0464:
            Z0.j r4 = new Z0.j
            r5 = 1
            r46 = r58 ^ 1
            H3.P r5 = r3.f6792d
            java.lang.Object r5 = r5.f2027U
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r6 = r5.get(r2)
            P0.w r6 = (P0.w) r6
            if (r6 != 0) goto L_0x0484
            P0.w r6 = new P0.w
            r7 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r6.<init>(r7)
            r5.put(r2, r6)
        L_0x0484:
            r50 = r6
            int r5 = r0.f6787c
            r45 = r5
            boolean r5 = r1.f7074e0
            r48 = r5
            Z0.c r5 = r3.f6789a
            r27 = r5
            java.util.List r5 = r3.i
            r36 = r5
            long r5 = r0.f6786b
            r43 = r5
            M0.n r0 = r1.f7069Z
            r51 = r0
            U0.j r0 = r3.f6797k
            r56 = r0
            r26 = r4
            r33 = r11
            r35 = r15
            r47 = r2
            r49 = r18
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r0 = r22
            r0.f9081W = r4
        L_0x04b3:
            boolean r1 = r0.f9080V
            java.lang.Object r2 = r0.f9081W
            i1.e r2 = (i1.C1092e) r2
            java.lang.Object r0 = r0.f9082X
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x04cc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r57
            r1.f6890K0 = r3
            r0 = 1
            r1.f6893N0 = r0
            return r0
        L_0x04cc:
            r1 = r57
            if (r2 != 0) goto L_0x04e8
            if (r0 == 0) goto L_0x04e6
            H3.P r2 = r1.f6900W
            java.lang.Object r2 = r2.f2027U
            Z0.k r2 = (Z0.k) r2
            a1.e r2 = r2.f6834V
            java.util.HashMap r2 = r2.f7046X
            java.lang.Object r0 = r2.get(r0)
            a1.d r0 = (a1.C0413d) r0
            r2 = 1
            r0.c(r2)
        L_0x04e6:
            r0 = 0
            return r0
        L_0x04e8:
            boolean r0 = r2 instanceof Z0.j
            if (r0 == 0) goto L_0x053f
            r0 = r2
            Z0.j r0 = (Z0.j) r0
            r1.f6897R0 = r0
            M0.r r3 = r0.f12662X
            r1.f6928z0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f6890K0 = r3
            java.util.ArrayList r3 = r1.f6911h0
            r3.add(r0)
            H3.L r3 = H3.O.j()
            Z0.p[] r4 = r1.p0
            int r5 = r4.length
            r6 = 0
        L_0x0509:
            if (r6 >= r5) goto L_0x051c
            r7 = r4[r6]
            int r8 = r7.f12421q
            int r7 = r7.f12420p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0509
        L_0x051c:
            H3.i0 r3 = r3.g()
            r0.f6830x0 = r1
            r0.f6809C0 = r3
            Z0.p[] r3 = r1.p0
            int r4 = r3.length
            r5 = 0
        L_0x0528:
            if (r5 >= r4) goto L_0x053f
            r6 = r3[r5]
            r6.getClass()
            int r7 = r0.f6812e0
            long r7 = (long) r7
            r6.f12402C = r7
            boolean r7 = r0.f6815h0
            if (r7 == 0) goto L_0x053c
            r7 = 1
            r6.f12406G = r7
            goto L_0x053d
        L_0x053c:
            r7 = 1
        L_0x053d:
            int r5 = r5 + r7
            goto L_0x0528
        L_0x053f:
            r1.f6918o0 = r2
            h1.n r0 = r1.f6906c0
            int r3 = r2.f12661W
            int r0 = r0.r(r3)
            r3 = r21
            long r8 = r3.f(r2, r1, r0)
            h1.t r11 = new h1.t
            long r5 = r2.f12659U
            R0.l r7 = r2.f12660V
            r4 = r11
            r4.<init>(r5, r7, r8)
            Y0.e r10 = r1.f6908e0
            int r15 = r2.f12663Y
            java.lang.Object r0 = r2.f12664Z
            int r12 = r2.f12661W
            int r13 = r1.f6899V
            M0.r r14 = r2.f12662X
            long r3 = r2.f12665a0
            long r5 = r2.f12666b0
            r16 = r0
            r17 = r3
            r19 = r5
            r10.g(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0573:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.q.h(T0.I):boolean");
    }

    public final W1.e k(m mVar, long j7, long j8, IOException iOException, int i) {
        boolean z;
        W1.e eVar;
        W1.e eVar2;
        int i8;
        IOException iOException2 = iOException;
        C1092e eVar3 = (C1092e) mVar;
        boolean z6 = eVar3 instanceof j;
        if (z6 && !((j) eVar3).f6811E0 && (iOException2 instanceof v) && ((i8 = ((v) iOException2).f4313X) == 410 || i8 == 404)) {
            return p.f13147X;
        }
        long j9 = eVar3.f12667c0.f4323V;
        Uri uri = eVar3.f12667c0.f4324W;
        C1053t tVar = new C1053t(j8);
        z.c0(eVar3.f12665a0);
        z.c0(eVar3.f12666b0);
        j jVar = new j(i, (Object) iOException2);
        i iVar = this.f6901X;
        i h5 = F.h.h(iVar.f6803q);
        this.f6906c0.getClass();
        W1.e p3 = C1048n.p(h5, jVar);
        boolean z8 = false;
        if (p3 == null || p3.f6147a != 2) {
            z = false;
        } else {
            k1.r rVar = iVar.f6803q;
            z = rVar.p(rVar.u(iVar.f6795h.b(eVar3.f12662X)), p3.f6148b);
        }
        if (z) {
            if (z6 && j9 == 0) {
                ArrayList arrayList = this.f6911h0;
                if (((j) arrayList.remove(arrayList.size() - 1)) == eVar3) {
                    z8 = true;
                }
                l.j(z8);
                if (arrayList.isEmpty()) {
                    this.f6890K0 = this.f6889J0;
                } else {
                    ((j) C0103u.l(arrayList)).f6810D0 = true;
                }
            }
            eVar = p.f13148Y;
        } else {
            long s8 = C1048n.s(jVar);
            if (s8 != -9223372036854775807L) {
                eVar2 = new W1.e(s8, 0, false);
            } else {
                eVar2 = p.f13149Z;
            }
            eVar = eVar2;
        }
        boolean a8 = eVar.a();
        Y0.e eVar4 = this.f6908e0;
        long j10 = eVar3.f12665a0;
        long j11 = eVar3.f12666b0;
        int i9 = eVar3.f12661W;
        int i10 = this.f6899V;
        r rVar2 = eVar3.f12662X;
        int i11 = eVar3.f12663Y;
        Object obj = eVar3.f12664Z;
        eVar4.e(tVar, i9, i10, rVar2, i11, obj, j10, j11, iOException, !a8);
        if (!a8) {
            this.f6918o0 = null;
        }
        if (z) {
            if (!this.f6926x0) {
                T0.H h8 = new T0.H();
                h8.f4672a = this.f6889J0;
                h(new T0.I(h8));
            } else {
                this.f6900W.f0(this);
            }
        }
        return eVar;
    }

    public final void l(p1.z zVar) {
    }

    public final long n() {
        if (this.f6893N0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f6890K0;
        }
        long j7 = this.f6889J0;
        j z = z();
        if (!z.f6808B0) {
            ArrayList arrayList = this.f6911h0;
            if (arrayList.size() > 1) {
                z = (j) g.l(2, arrayList);
            } else {
                z = null;
            }
        }
        if (z != null) {
            j7 = Math.max(j7, z.f12666b0);
        }
        if (this.f6925w0) {
            for (p o2 : this.p0) {
                j7 = Math.max(j7, o2.o());
            }
        }
        return j7;
    }

    public final void o() {
        this.f6915l0.post(this.f6913j0);
    }

    public final void p(m mVar, long j7, long j8) {
        C1092e eVar = (C1092e) mVar;
        this.f6918o0 = null;
        i iVar = this.f6901X;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            iVar.f6799m = eVar2.f6779d0;
            Uri uri = eVar2.f12660V.f4277a;
            byte[] bArr = eVar2.f6781f0;
            bArr.getClass();
            P p3 = iVar.f6796j;
            p3.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((d) p3.f2027U).put(uri, bArr);
        }
        long j9 = eVar.f12659U;
        Uri uri2 = eVar.f12667c0.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f6906c0.getClass();
        this.f6908e0.d(tVar, eVar.f12661W, this.f6899V, eVar.f12662X, eVar.f12663Y, eVar.f12664Z, eVar.f12665a0, eVar.f12666b0);
        if (!this.f6926x0) {
            T0.H h5 = new T0.H();
            h5.f4672a = this.f6889J0;
            h(new T0.I(h5));
            return;
        }
        this.f6900W.f0(this);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [p1.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p1.G q(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.util.Set r2 = f6879S0
            boolean r1 = r2.contains(r1)
            java.util.HashSet r3 = r11.f6920r0
            android.util.SparseIntArray r4 = r11.f6921s0
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            P0.l.d(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0056
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L_0x0034
            int[] r1 = r11.f6919q0
            r1[r2] = r12
        L_0x0034:
            int[] r1 = r11.f6919q0
            r1 = r1[r2]
            if (r1 != r12) goto L_0x0040
            Z0.p[] r1 = r11.p0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0056
        L_0x0040:
            p1.n r1 = v(r12, r13)
            goto L_0x003e
        L_0x0045:
            r1 = 0
        L_0x0046:
            Z0.p[] r2 = r11.p0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0056
            int[] r7 = r11.f6919q0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0054
            r6 = r2[r1]
            goto L_0x0056
        L_0x0054:
            int r1 = r1 + r0
            goto L_0x0046
        L_0x0056:
            if (r6 != 0) goto L_0x00e8
            boolean r1 = r11.f6894O0
            if (r1 == 0) goto L_0x0061
            p1.n r12 = v(r12, r13)
            return r12
        L_0x0061:
            Z0.p[] r1 = r11.p0
            int r1 = r1.length
            if (r13 == r0) goto L_0x0069
            r2 = 2
            if (r13 != r2) goto L_0x006a
        L_0x0069:
            r5 = 1
        L_0x006a:
            Z0.p r6 = new Z0.p
            Y0.e r2 = r11.f6905b0
            l1.e r7 = r11.f6902Y
            java.util.Map r8 = r11.f6917n0
            Y0.h r9 = r11.f6904a0
            r6.<init>(r7, r9, r2, r8)
            long r7 = r11.f6889J0
            r6.f12424t = r7
            if (r5 == 0) goto L_0x0083
            M0.n r2 = r11.f6896Q0
            r6.f6878I = r2
            r6.z = r0
        L_0x0083:
            long r7 = r11.f6895P0
            long r9 = r6.f12405F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x008f
            r6.f12405F = r7
            r6.z = r0
        L_0x008f:
            Z0.j r2 = r11.f6897R0
            if (r2 == 0) goto L_0x0098
            int r2 = r2.f6812e0
            long r7 = (long) r2
            r6.f12402C = r7
        L_0x0098:
            r6.f12411f = r11
            int[] r2 = r11.f6919q0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.f6919q0 = r2
            r2[r1] = r12
            Z0.p[] r12 = r11.p0
            int r2 = P0.z.f3748a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            Z0.p[] r0 = (Z0.p[]) r0
            r11.p0 = r0
            boolean[] r12 = r11.f6888I0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.f6888I0 = r12
            r12[r1] = r5
            boolean r12 = r11.f6886G0
            r12 = r12 | r5
            r11.f6886G0 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3.add(r12)
            r4.append(r13, r1)
            int r12 = B(r13)
            int r0 = r11.f6923u0
            int r0 = B(r0)
            if (r12 <= r0) goto L_0x00e0
            r11.f6924v0 = r1
            r11.f6923u0 = r13
        L_0x00e0:
            boolean[] r12 = r11.f6887H0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.f6887H0 = r12
        L_0x00e8:
            r12 = 5
            if (r13 != r12) goto L_0x00fb
            Z0.o r12 = r11.f6922t0
            if (r12 != 0) goto L_0x00f8
            Z0.o r12 = new Z0.o
            int r13 = r11.f6909f0
            r12.<init>(r6, r13)
            r11.f6922t0 = r12
        L_0x00f8:
            Z0.o r12 = r11.f6922t0
            return r12
        L_0x00fb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.q.q(int, int):p1.G");
    }

    public final void u(long j7) {
        int i;
        boolean z;
        p pVar = this.f6907d0;
        if (!pVar.c() && !C()) {
            boolean d8 = pVar.d();
            i iVar = this.f6901X;
            List list = this.f6912i0;
            if (d8) {
                this.f6918o0.getClass();
                C1092e eVar = this.f6918o0;
                if (iVar.f6800n != null) {
                    z = false;
                } else {
                    z = iVar.f6803q.i(j7, eVar, list);
                }
                if (z) {
                    pVar.b();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                y(size);
            }
            if (iVar.f6800n != null || iVar.f6803q.length() < 2) {
                i = list.size();
            } else {
                i = iVar.f6803q.h(j7, list);
            }
            if (i < this.f6911h0.size()) {
                y(i);
            }
        }
    }

    public final f0 w(Y[] yArr) {
        for (int i = 0; i < yArr.length; i++) {
            Y y8 = yArr[i];
            r[] rVarArr = new r[y8.f2885a];
            for (int i8 = 0; i8 < y8.f2885a; i8++) {
                r rVar = y8.f2888d[i8];
                int k8 = this.f6904a0.k(rVar);
                C0129q a8 = rVar.a();
                a8.f2988K = k8;
                rVarArr[i8] = new r(a8);
            }
            yArr[i] = new Y(y8.f2886b, rVarArr);
        }
        return new f0(yArr);
    }

    public final void y(int i) {
        ArrayList arrayList;
        l.j(!this.f6907d0.d());
        int i8 = i;
        loop0:
        while (true) {
            arrayList = this.f6911h0;
            if (i8 >= arrayList.size()) {
                i8 = -1;
                break;
            }
            int i9 = i8;
            while (true) {
                if (i9 >= arrayList.size()) {
                    j jVar = (j) arrayList.get(i8);
                    int i10 = 0;
                    while (i10 < this.p0.length) {
                        if (this.p0[i10].r() <= jVar.g(i10)) {
                            i10++;
                        }
                    }
                    break loop0;
                } else if (((j) arrayList.get(i9)).f6815h0) {
                    break;
                } else {
                    i9++;
                }
            }
            i8++;
        }
        if (i8 != -1) {
            long j7 = z().f12666b0;
            j jVar2 = (j) arrayList.get(i8);
            z.T(arrayList, i8, arrayList.size());
            for (int i11 = 0; i11 < this.p0.length; i11++) {
                this.p0[i11].l(jVar2.g(i11));
            }
            if (arrayList.isEmpty()) {
                this.f6890K0 = this.f6889J0;
            } else {
                ((j) C0103u.l(arrayList)).f6810D0 = true;
            }
            this.f6893N0 = false;
            int i12 = this.f6923u0;
            long j8 = jVar2.f12665a0;
            Y0.e eVar = this.f6908e0;
            g1.g gVar = new g1.g(1, i12, (r) null, 3, (Object) null, z.c0(j8), z.c0(j7));
            C1031B b8 = eVar.f6316b;
            b8.getClass();
            eVar.a(new D.O(eVar, b8, gVar, 8));
        }
    }

    public final j z() {
        return (j) g.l(1, this.f6911h0);
    }
}
