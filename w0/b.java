package W0;

import B3.q;
import D2.G;
import D2.o;
import H3.C0103u;
import H3.M;
import H3.O;
import H3.i0;
import K1.i;
import M0.C0129q;
import M0.I;
import M0.Y;
import M0.r;
import P0.z;
import Q0.g;
import R0.A;
import U0.j;
import X0.a;
import X0.c;
import X0.f;
import X0.m;
import Y0.h;
import android.util.Pair;
import android.util.SparseArray;
import h1.C1047m;
import h1.C1048n;
import h1.C1058y;
import h1.C1059z;
import h1.X;
import h1.Z;
import h1.a0;
import h1.f0;
import i1.C1088a;
import i1.C1094g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.e;
import l1.p;

public final class b implements C1059z, Z {

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f6009t0 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: u0  reason: collision with root package name */
    public static final Pattern f6010u0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: U  reason: collision with root package name */
    public final int f6011U;

    /* renamed from: V  reason: collision with root package name */
    public final o f6012V;

    /* renamed from: W  reason: collision with root package name */
    public final A f6013W;

    /* renamed from: X  reason: collision with root package name */
    public final h f6014X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1048n f6015Y;

    /* renamed from: Z  reason: collision with root package name */
    public final q f6016Z;

    /* renamed from: a0  reason: collision with root package name */
    public final long f6017a0;

    /* renamed from: b0  reason: collision with root package name */
    public final l1.q f6018b0;

    /* renamed from: c0  reason: collision with root package name */
    public final e f6019c0;

    /* renamed from: d0  reason: collision with root package name */
    public final f0 f6020d0;

    /* renamed from: e0  reason: collision with root package name */
    public final a[] f6021e0;

    /* renamed from: f0  reason: collision with root package name */
    public final C1048n f6022f0;

    /* renamed from: g0  reason: collision with root package name */
    public final o f6023g0;

    /* renamed from: h0  reason: collision with root package name */
    public final IdentityHashMap f6024h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Y0.e f6025i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Y0.e f6026j0;

    /* renamed from: k0  reason: collision with root package name */
    public C1058y f6027k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1094g[] f6028l0;

    /* renamed from: m0  reason: collision with root package name */
    public l[] f6029m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1047m f6030n0;

    /* renamed from: o0  reason: collision with root package name */
    public c f6031o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f6032q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6033r0 = true;

    /* renamed from: s0  reason: collision with root package name */
    public long f6034s0;

    public b(int i, c cVar, q qVar, int i8, o oVar, A a8, h hVar, Y0.e eVar, C1048n nVar, Y0.e eVar2, long j7, l1.q qVar2, e eVar3, C1048n nVar2, d dVar, j jVar) {
        String m8;
        int i9;
        int i10;
        List list;
        boolean[] zArr;
        int i11;
        r[] rVarArr;
        r[] k8;
        f a9;
        Integer num;
        c cVar2 = cVar;
        int i12 = i8;
        o oVar2 = oVar;
        h hVar2 = hVar;
        e eVar4 = eVar3;
        this.f6011U = i;
        this.f6031o0 = cVar2;
        this.f6016Z = qVar;
        this.p0 = i12;
        this.f6012V = oVar2;
        this.f6013W = a8;
        this.f6014X = hVar2;
        this.f6026j0 = eVar;
        this.f6015Y = nVar;
        this.f6025i0 = eVar2;
        this.f6017a0 = j7;
        this.f6018b0 = qVar2;
        this.f6019c0 = eVar4;
        this.f6022f0 = nVar2;
        this.f6023g0 = new o(cVar2, dVar, eVar4);
        this.f6028l0 = new C1094g[0];
        this.f6029m0 = new l[0];
        this.f6024h0 = new IdentityHashMap();
        nVar2.getClass();
        M m9 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        this.f6030n0 = new C1047m(i0Var, i0Var);
        X0.h b8 = cVar2.b(i12);
        List list2 = b8.f6246d;
        this.f6032q0 = list2;
        List list3 = b8.f6245c;
        int size = list3.size();
        HashMap hashMap = new HashMap(C0103u.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            hashMap.put(Long.valueOf(((a) list3.get(i13)).f6205a), Integer.valueOf(i13));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i13));
            arrayList.add(arrayList2);
            sparseArray.put(i13, arrayList2);
        }
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = (a) list3.get(i14);
            f a10 = a("http://dashif.org/guidelines/trickmode", aVar.e);
            List list4 = aVar.f6209f;
            a10 = a10 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a10;
            int intValue = (a10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a10.f6237b)))) == null) ? i14 : num.intValue();
            if (intValue == i14 && (a9 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i15 = z.f3748a;
                for (String parseLong : a9.f6237b.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(parseLong)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i14) {
                List list5 = (List) sparseArray.get(i14);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i14, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i16 = 0; i16 < size2; i16++) {
            int[] y8 = E.e.y((Collection) arrayList.get(i16));
            iArr[i16] = y8;
            Arrays.sort(y8);
        }
        boolean[] zArr2 = new boolean[size2];
        r[][] rVarArr2 = new r[size2][];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr2 = iArr[i17];
            int length = iArr2.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                List list7 = ((a) list3.get(iArr2[i19])).f6207c;
                int[] iArr3 = iArr2;
                for (int i20 = 0; i20 < list7.size(); i20++) {
                    if (!((m) list7.get(i20)).f6261X.isEmpty()) {
                        zArr2[i17] = true;
                        i18++;
                        break;
                    }
                }
                i19++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i17];
            int length2 = iArr4.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = iArr4[i21];
                a aVar2 = (a) list3.get(i22);
                List list8 = ((a) list3.get(i22)).f6208d;
                int[] iArr5 = iArr4;
                int i23 = length2;
                int i24 = 0;
                while (i24 < list8.size()) {
                    f fVar = (f) list8.get(i24);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f6236a)) {
                        C0129q qVar3 = new C0129q();
                        qVar3.f2999m = I.o("application/cea-608");
                        qVar3.f2989a = g.o(new StringBuilder(), aVar2.f6205a, ":cea608");
                        k8 = k(fVar, f6009t0, new r(qVar3));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f6236a)) {
                        C0129q qVar4 = new C0129q();
                        qVar4.f2999m = I.o("application/cea-708");
                        qVar4.f2989a = g.o(new StringBuilder(), aVar2.f6205a, ":cea708");
                        k8 = k(fVar, f6010u0, new r(qVar4));
                    } else {
                        i24++;
                        list8 = list9;
                    }
                    rVarArr = k8;
                    i11 = 1;
                }
                i21++;
                iArr4 = iArr5;
                length2 = i23;
            }
            i11 = 1;
            rVarArr = new r[0];
            rVarArr2[i17] = rVarArr;
            if (rVarArr.length != 0) {
                i18 += i11;
            }
            i17 += i11;
        }
        int size3 = list2.size() + i18 + size2;
        Y[] yArr = new Y[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr6 = iArr[i25];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i27 = size2;
            int i28 = 0;
            while (i28 < length3) {
                arrayList3.addAll(((a) list3.get(iArr6[i28])).f6207c);
                i28++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            r[] rVarArr3 = new r[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size4;
                r rVar = ((m) arrayList3.get(i29)).f6258U;
                ArrayList arrayList4 = arrayList3;
                C0129q a11 = rVar.a();
                a11.f2988K = hVar2.k(rVar);
                rVarArr3[i29] = new r(a11);
                i29++;
                size4 = i30;
                arrayList3 = arrayList4;
            }
            a aVar3 = (a) list3.get(iArr6[0]);
            long j8 = aVar3.f6205a;
            if (j8 != -1) {
                m8 = Long.toString(j8);
            } else {
                m8 = g.m(i25, "unset:");
            }
            int i31 = i26 + 1;
            if (zArr2[i25]) {
                i9 = i31;
                i31 = i26 + 2;
            } else {
                i9 = -1;
            }
            if (rVarArr2[i25].length != 0) {
                i10 = i31;
                i31++;
            } else {
                i10 = -1;
            }
            g(oVar2, rVarArr3);
            List list10 = list3;
            yArr[i26] = new Y(m8, rVarArr3);
            M m10 = O.f2026V;
            i0 i0Var2 = i0.f2073Y;
            aVarArr[i26] = new a(aVar3.f6206b, 0, iArr6, i26, i9, i10, -1, i0Var2);
            int i32 = i9;
            int i33 = -1;
            if (i32 != -1) {
                String x8 = N.e.x(m8, ":emsg");
                C0129q qVar5 = new C0129q();
                qVar5.f2989a = x8;
                qVar5.f2999m = I.o("application/x-emsg");
                list = list2;
                zArr = zArr2;
                yArr[i32] = new Y(x8, new r(qVar5));
                aVarArr[i32] = new a(5, 1, iArr6, i26, -1, -1, -1, i0Var2);
                i33 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i10 != i33) {
                String x9 = N.e.x(m8, ":cc");
                aVarArr[i10] = new a(3, 1, iArr6, i26, -1, -1, -1, O.n(rVarArr2[i25]));
                g(oVar2, rVarArr2[i25]);
                yArr[i10] = new Y(x9, rVarArr2[i25]);
            }
            i25++;
            size2 = i27;
            hVar2 = hVar;
            iArr = iArr7;
            i26 = i31;
            list3 = list10;
            zArr2 = zArr;
            list2 = list;
        }
        List list11 = list2;
        int i34 = 0;
        while (i34 < list11.size()) {
            List list12 = list11;
            X0.g gVar = (X0.g) list12.get(i34);
            C0129q qVar6 = new C0129q();
            qVar6.f2989a = gVar.a();
            qVar6.f2999m = I.o("application/x-emsg");
            yArr[i26] = new Y(gVar.a() + ":" + i34, new r(qVar6));
            M m11 = O.f2026V;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i34, i0.f2073Y);
            i34++;
            list11 = list12;
            i26++;
        }
        Pair create = Pair.create(new f0(yArr), aVarArr);
        this.f6020d0 = (f0) create.first;
        this.f6021e0 = (a[]) create.second;
    }

    public static f a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            f fVar = (f) list.get(i);
            if (str.equals(fVar.f6236a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void g(o oVar, r[] rVarArr) {
        String str;
        for (int i = 0; i < rVarArr.length; i++) {
            r rVar = rVarArr[i];
            G g8 = (G) oVar.f1139X;
            if (g8.f1051U && ((i) g8.f1052V).a(rVar)) {
                C0129q a8 = rVar.a();
                a8.f2999m = I.o("application/x-media3-cues");
                a8.f2985H = ((i) g8.f1052V).o(rVar);
                StringBuilder sb = new StringBuilder();
                sb.append(rVar.f3036n);
                String str2 = rVar.f3033k;
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a8.f2996j = sb.toString();
                a8.f3004r = Long.MAX_VALUE;
                rVar = new r(a8);
            }
            rVarArr[i] = rVar;
        }
    }

    public static r[] k(f fVar, Pattern pattern, r rVar) {
        String str = fVar.f6237b;
        if (str == null) {
            return new r[]{rVar};
        }
        int i = z.f3748a;
        String[] split = str.split(";", -1);
        r[] rVarArr = new r[split.length];
        for (int i8 = 0; i8 < split.length; i8++) {
            Matcher matcher = pattern.matcher(split[i8]);
            if (!matcher.matches()) {
                return new r[]{rVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C0129q a8 = rVar.a();
            a8.f2989a = rVar.f3025a + ":" + parseInt;
            a8.f2984G = parseInt;
            a8.f2992d = matcher.group(2);
            rVarArr[i8] = new r(a8);
        }
        return rVarArr;
    }

    public final boolean b() {
        return this.f6030n0.b();
    }

    public final int c(int[] iArr, int i) {
        int i8 = iArr[i];
        if (i8 == -1) {
            return -1;
        }
        a[] aVarArr = this.f6021e0;
        int i9 = aVarArr[i8].e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && aVarArr[i11].f6004c == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: h1.Y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(k1.r[] r40, boolean[] r41, h1.Y[] r42, boolean[] r43, long r44) {
        /*
            r39 = this;
            r15 = r39
            r0 = r40
            r14 = r42
            r12 = r44
            int r1 = r0.length
            int[] r11 = new int[r1]
            r10 = 0
            r1 = 0
        L_0x000d:
            int r2 = r0.length
            r8 = -1
            if (r1 >= r2) goto L_0x0027
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0022
            h1.f0 r3 = r15.f6020d0
            M0.Y r2 = r2.l()
            int r2 = r3.b(r2)
            r11[r1] = r2
            goto L_0x0024
        L_0x0022:
            r11[r1] = r8
        L_0x0024:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0027:
            r1 = 0
        L_0x0028:
            int r2 = r0.length
            r16 = 0
            if (r1 >= r2) goto L_0x004f
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0035
            boolean r2 = r41[r1]
            if (r2 != 0) goto L_0x004c
        L_0x0035:
            r2 = r14[r1]
            boolean r3 = r2 instanceof i1.C1094g
            if (r3 == 0) goto L_0x0041
            i1.g r2 = (i1.C1094g) r2
            r2.B(r15)
            goto L_0x004a
        L_0x0041:
            boolean r3 = r2 instanceof i1.C1093f
            if (r3 == 0) goto L_0x004a
            i1.f r2 = (i1.C1093f) r2
            r2.c()
        L_0x004a:
            r14[r1] = r16
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x004f:
            r1 = 0
        L_0x0050:
            int r2 = r0.length
            r9 = 1
            if (r1 >= r2) goto L_0x008c
            r2 = r14[r1]
            boolean r3 = r2 instanceof h1.C1051q
            if (r3 != 0) goto L_0x005e
            boolean r2 = r2 instanceof i1.C1093f
            if (r2 == 0) goto L_0x0089
        L_0x005e:
            int r2 = r15.c(r11, r1)
            if (r2 != r8) goto L_0x0069
            r2 = r14[r1]
            boolean r2 = r2 instanceof h1.C1051q
            goto L_0x007a
        L_0x0069:
            r3 = r14[r1]
            boolean r4 = r3 instanceof i1.C1093f
            if (r4 == 0) goto L_0x0078
            i1.f r3 = (i1.C1093f) r3
            i1.g r3 = r3.f12668U
            r2 = r14[r2]
            if (r3 != r2) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            r2 = r9
        L_0x007a:
            if (r2 != 0) goto L_0x0089
            r2 = r14[r1]
            boolean r3 = r2 instanceof i1.C1093f
            if (r3 == 0) goto L_0x0087
            i1.f r2 = (i1.C1093f) r2
            r2.c()
        L_0x0087:
            r14[r1] = r16
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x008c:
            r7 = 0
        L_0x008d:
            int r1 = r0.length
            if (r7 >= r1) goto L_0x01ed
            r1 = r0[r7]
            if (r1 != 0) goto L_0x009b
            r33 = r7
            r37 = r11
            r0 = r14
            goto L_0x01df
        L_0x009b:
            r2 = r14[r7]
            if (r2 != 0) goto L_0x01d0
            r43[r7] = r9
            r2 = r11[r7]
            W0.a[] r3 = r15.f6021e0
            r2 = r3[r2]
            int r3 = r2.f6004c
            if (r3 != 0) goto L_0x01aa
            int r3 = r2.f6006f
            if (r3 == r8) goto L_0x00b2
            r30 = 1
            goto L_0x00b4
        L_0x00b2:
            r30 = 0
        L_0x00b4:
            if (r30 == 0) goto L_0x00be
            h1.f0 r4 = r15.f6020d0
            M0.Y r3 = r4.a(r3)
            r4 = 1
            goto L_0x00c1
        L_0x00be:
            r3 = r16
            r4 = 0
        L_0x00c1:
            int r5 = r2.f6007g
            if (r5 == r8) goto L_0x00cc
            W0.a[] r6 = r15.f6021e0
            r5 = r6[r5]
            H3.i0 r5 = r5.f6008h
            goto L_0x00d0
        L_0x00cc:
            H3.i0 r5 = H3.O.p()
        L_0x00d0:
            int r6 = r5.size()
            int r6 = r6 + r4
            M0.r[] r4 = new M0.r[r6]
            int[] r6 = new int[r6]
            if (r30 == 0) goto L_0x00e6
            M0.r r3 = r3.a()
            r4[r10] = r3
            r3 = 5
            r6[r10] = r3
            r3 = 1
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x00ec:
            int r9 = r5.size()
            if (r10 >= r9) goto L_0x0106
            java.lang.Object r9 = r5.get(r10)
            M0.r r9 = (M0.r) r9
            r4[r3] = r9
            r17 = 3
            r6[r3] = r17
            r8.add(r9)
            r9 = 1
            int r3 = r3 + r9
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x0106:
            r9 = 1
            X0.c r3 = r15.f6031o0
            boolean r3 = r3.f6217d
            if (r3 == 0) goto L_0x011a
            if (r30 == 0) goto L_0x011a
            W0.o r3 = r15.f6023g0
            W0.n r5 = new W0.n
            l1.e r10 = r3.f6113U
            r5.<init>(r3, r10)
            r10 = r5
            goto L_0x011c
        L_0x011a:
            r10 = r16
        L_0x011c:
            D2.o r3 = r15.f6012V
            l1.q r5 = r15.f6018b0
            X0.c r9 = r15.f6031o0
            r33 = r7
            B3.q r7 = r15.f6016Z
            r34 = r11
            int r11 = r15.p0
            int[] r12 = r2.f6002a
            int r13 = r2.f6003b
            r25 = r13
            long r13 = r15.f6017a0
            R0.A r0 = r15.f6013W
            r35 = r4
            java.lang.Object r4 = r3.f1138W
            R0.g r4 = (R0.g) r4
            R0.h r4 = r4.g()
            if (r0 == 0) goto L_0x0143
            r4.o(r0)
        L_0x0143:
            W0.k r0 = new W0.k
            r36 = r6
            java.lang.Object r6 = r3.f1139X
            r18 = r6
            D2.G r18 = (D2.G) r18
            int r3 = r3.f1137V
            r17 = r0
            r19 = r5
            r20 = r9
            r21 = r7
            r22 = r11
            r23 = r12
            r24 = r1
            r26 = r4
            r27 = r13
            r29 = r3
            r31 = r8
            r32 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            i1.g r14 = new i1.g
            int r2 = r2.f6003b
            l1.e r7 = r15.f6019c0
            Y0.h r11 = r15.f6014X
            Y0.e r12 = r15.f6026j0
            h1.n r13 = r15.f6015Y
            Y0.e r8 = r15.f6025i0
            boolean r9 = r15.f6033r0
            r1 = r14
            r3 = r36
            r4 = r35
            r5 = r0
            r6 = r39
            r0 = r33
            r17 = r8
            r18 = r9
            r8 = r44
            r0 = r10
            r10 = r11
            r37 = r34
            r11 = r12
            r12 = r13
            r13 = r17
            r38 = r14
            r14 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            monitor-enter(r39)
            java.util.IdentityHashMap r1 = r15.f6024h0     // Catch:{ all -> 0x01a7 }
            r2 = r38
            r1.put(r2, r0)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r39)     // Catch:{ all -> 0x01a7 }
            r0 = r42
            r0[r33] = r2
            goto L_0x01df
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r39)     // Catch:{ all -> 0x01a7 }
            throw r0
        L_0x01aa:
            r33 = r7
            r37 = r11
            r0 = r14
            r4 = 2
            if (r3 != r4) goto L_0x01df
            java.util.List r3 = r15.f6032q0
            int r2 = r2.f6005d
            java.lang.Object r2 = r3.get(r2)
            X0.g r2 = (X0.g) r2
            M0.Y r1 = r1.l()
            M0.r r1 = r1.a()
            W0.l r3 = new W0.l
            X0.c r4 = r15.f6031o0
            boolean r4 = r4.f6217d
            r3.<init>(r2, r1, r4)
            r0[r33] = r3
            goto L_0x01df
        L_0x01d0:
            r33 = r7
            r37 = r11
            r0 = r14
            boolean r3 = r2 instanceof i1.C1094g
            if (r3 == 0) goto L_0x01df
            i1.g r2 = (i1.C1094g) r2
            W0.k r2 = r2.f12677Y
            r2.f6094j = r1
        L_0x01df:
            int r7 = r33 + 1
            r12 = r44
            r14 = r0
            r11 = r37
            r8 = -1
            r9 = 1
            r10 = 0
            r0 = r40
            goto L_0x008d
        L_0x01ed:
            r37 = r11
            r0 = r14
            r1 = r40
            r10 = 0
        L_0x01f3:
            int r2 = r1.length
            if (r10 >= r2) goto L_0x0264
            r2 = r0[r10]
            if (r2 != 0) goto L_0x0259
            r2 = r1[r10]
            if (r2 == 0) goto L_0x0259
            r2 = r37
            r3 = r2[r10]
            W0.a[] r4 = r15.f6021e0
            r3 = r4[r3]
            int r4 = r3.f6004c
            r5 = 1
            if (r4 != r5) goto L_0x0255
            int r4 = r15.c(r2, r10)
            r6 = -1
            if (r4 != r6) goto L_0x021c
            h1.q r3 = new h1.q
            r3.<init>()
            r0[r10] = r3
            r12 = r44
            goto L_0x025f
        L_0x021c:
            r4 = r0[r4]
            i1.g r4 = (i1.C1094g) r4
            int r3 = r3.f6003b
            r7 = 0
        L_0x0223:
            h1.X[] r8 = r4.f12686h0
            int r9 = r8.length
            if (r7 >= r9) goto L_0x024f
            int[] r9 = r4.f12674V
            r9 = r9[r7]
            if (r9 != r3) goto L_0x024a
            boolean[] r3 = r4.f12676X
            boolean r9 = r3[r7]
            r11 = 1
            r9 = r9 ^ r11
            P0.l.j(r9)
            r3[r7] = r11
            r3 = r8[r7]
            r12 = r44
            r3.G(r12, r11)
            i1.f r3 = new i1.f
            r8 = r8[r7]
            r3.<init>(r4, r4, r8, r7)
            r0[r10] = r3
            goto L_0x025f
        L_0x024a:
            r12 = r44
            int r7 = r7 + 1
            goto L_0x0223
        L_0x024f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0255:
            r12 = r44
        L_0x0257:
            r6 = -1
            goto L_0x025f
        L_0x0259:
            r12 = r44
            r2 = r37
            r5 = 1
            goto L_0x0257
        L_0x025f:
            int r10 = r10 + 1
            r37 = r2
            goto L_0x01f3
        L_0x0264:
            r12 = r44
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r10 = 0
        L_0x0272:
            if (r10 >= r3) goto L_0x028c
            r4 = r0[r10]
            boolean r5 = r4 instanceof i1.C1094g
            if (r5 == 0) goto L_0x0280
            i1.g r4 = (i1.C1094g) r4
            r1.add(r4)
            goto L_0x0289
        L_0x0280:
            boolean r5 = r4 instanceof W0.l
            if (r5 == 0) goto L_0x0289
            W0.l r4 = (W0.l) r4
            r2.add(r4)
        L_0x0289:
            int r10 = r10 + 1
            goto L_0x0272
        L_0x028c:
            int r0 = r1.size()
            i1.g[] r0 = new i1.C1094g[r0]
            r15.f6028l0 = r0
            r1.toArray(r0)
            int r0 = r2.size()
            W0.l[] r0 = new W0.l[r0]
            r15.f6029m0 = r0
            r2.toArray(r0)
            h1.n r0 = r15.f6022f0
            U0.c r2 = new U0.c
            r3 = 7
            r2.<init>(r3)
            java.util.AbstractList r2 = H3.C0103u.z(r1, r2)
            r0.getClass()
            h1.m r0 = new h1.m
            r0.<init>(r1, r2)
            r15.f6030n0 = r0
            boolean r0 = r15.f6033r0
            if (r0 == 0) goto L_0x02c1
            r0 = 0
            r15.f6033r0 = r0
            r15.f6034s0 = r12
        L_0x02c1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.b.d(k1.r[], boolean[], h1.Y[], boolean[], long):long");
    }

    public final long e() {
        return this.f6030n0.e();
    }

    public final long f() {
        C1094g[] gVarArr = this.f6028l0;
        int length = gVarArr.length;
        int i = 0;
        while (i < length) {
            C1094g gVar = gVarArr[i];
            gVar.getClass();
            try {
                if (gVar.f12695r0) {
                    return this.f6034s0;
                }
                i++;
            } finally {
                gVar.f12695r0 = false;
            }
        }
        return -9223372036854775807L;
    }

    public final void f0(a0 a0Var) {
        this.f6027k0.f0(this);
    }

    public final boolean h(T0.I i) {
        return this.f6030n0.h(i);
    }

    public final void i(C1058y yVar, long j7) {
        this.f6027k0 = yVar;
        yVar.o(this);
    }

    public final f0 j() {
        return this.f6020d0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r3 < (((r0.Z() + r10) + r8) - 1)) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m(long r19, T0.e0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            i1.g[] r0 = r7.f6028l0
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x0009:
            if (r5 >= r3) goto L_0x0072
            r6 = r0[r5]
            int r8 = r6.f12673U
            r9 = 2
            if (r8 != r9) goto L_0x006f
            W0.k r0 = r6.f12677Y
            W0.i[] r0 = r0.i
            int r3 = r0.length
        L_0x0017:
            if (r4 >= r3) goto L_0x006d
            r5 = r0[r4]
            W0.h r6 = r5.f6084d
            if (r6 == 0) goto L_0x006a
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            goto L_0x006a
        L_0x002a:
            W0.h r0 = r5.f6084d
            P0.l.k(r0)
            long r3 = r5.e
            long r3 = r0.e(r1, r3)
            long r10 = r5.f6085f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x005f
            r14 = -1
            r16 = 1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0057
            P0.l.k(r0)
            long r14 = r0.Z()
            long r14 = r14 + r10
            long r14 = r14 + r8
            long r14 = r14 - r16
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
        L_0x0057:
            long r3 = r3 + r16
            long r3 = r5.f(r3)
            r5 = r3
            goto L_0x0060
        L_0x005f:
            r5 = r12
        L_0x0060:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            goto L_0x006e
        L_0x006a:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x006d:
            r0 = r1
        L_0x006e:
            return r0
        L_0x006f:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.b.m(long, T0.e0):long");
    }

    public final long n() {
        return this.f6030n0.n();
    }

    public final void r() {
        this.f6018b0.a();
    }

    public final long s(long j7) {
        long j8;
        ArrayList arrayList;
        C1088a aVar;
        boolean z;
        boolean z6;
        long j9 = j7;
        for (C1094g gVar : this.f6028l0) {
            gVar.f12692n0 = j9;
            gVar.f12694q0 = false;
            if (gVar.x()) {
                gVar.f12691m0 = j9;
            } else {
                int i = 0;
                while (true) {
                    arrayList = gVar.f12683e0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    aVar = (C1088a) arrayList.get(i);
                    int i8 = (aVar.f12665a0 > j9 ? 1 : (aVar.f12665a0 == j9 ? 0 : -1));
                    if (i8 == 0 && aVar.f12636e0 == -9223372036854775807L) {
                        break;
                    } else if (i8 > 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                aVar = null;
                X x8 = gVar.f12685g0;
                if (aVar != null) {
                    z = x8.F(aVar.d(0));
                } else {
                    if (j9 < gVar.e()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z = x8.G(j9, z6);
                }
                X[] xArr = gVar.f12686h0;
                if (z) {
                    gVar.f12693o0 = gVar.z(x8.r(), 0);
                    for (X G8 : xArr) {
                        G8.G(j9, true);
                    }
                } else {
                    gVar.f12691m0 = j9;
                    gVar.f12696s0 = false;
                    arrayList.clear();
                    gVar.f12693o0 = 0;
                    p pVar = gVar.f12681c0;
                    if (pVar.d()) {
                        x8.j();
                        for (X j10 : xArr) {
                            j10.j();
                        }
                        pVar.b();
                    } else {
                        pVar.f13152W = null;
                        x8.D(false);
                        for (X D8 : xArr) {
                            D8.D(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.f6029m0) {
            int a8 = z.a(lVar.f6101W, j9, true);
            lVar.f6105a0 = a8;
            if (!lVar.f6102X || a8 != lVar.f6101W.length) {
                j8 = -9223372036854775807L;
            } else {
                j8 = j9;
            }
            lVar.f6106b0 = j8;
        }
        return j9;
    }

    public final void t(long j7) {
        long j8;
        for (C1094g gVar : this.f6028l0) {
            if (!gVar.x()) {
                X x8 = gVar.f12685g0;
                int i = x8.f12421q;
                x8.i(j7, true);
                X x9 = gVar.f12685g0;
                int i8 = x9.f12421q;
                if (i8 > i) {
                    synchronized (x9) {
                        if (x9.f12420p == 0) {
                            j8 = Long.MIN_VALUE;
                        } else {
                            j8 = x9.f12418n[x9.f12422r];
                        }
                    }
                    int i9 = 0;
                    while (true) {
                        X[] xArr = gVar.f12686h0;
                        if (i9 >= xArr.length) {
                            break;
                        }
                        xArr[i9].i(j8, gVar.f12676X[i9]);
                        i9++;
                    }
                }
                int min = Math.min(gVar.z(i8, 0), gVar.f12693o0);
                if (min > 0) {
                    z.T(gVar.f12683e0, 0, min);
                    gVar.f12693o0 -= min;
                }
            }
        }
    }

    public final void u(long j7) {
        this.f6030n0.u(j7);
    }
}
