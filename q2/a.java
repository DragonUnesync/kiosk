package q2;

import B.C0003d;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.BitSet;
import p2.f;
import p2.g;
import p2.u;
import t2.k;
import t2.l;
import u2.m;
import u2.n;
import v2.c;
import y2.C1627b;
import y2.C1628c;

public final class a extends C0003d {

    /* renamed from: A  reason: collision with root package name */
    public static final a f14729A = new a(25);

    /* renamed from: b  reason: collision with root package name */
    public static final a f14730b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f14731c = new a(1);

    /* renamed from: d  reason: collision with root package name */
    public static final a f14732d = new a(2);
    public static final a e = new a(3);

    /* renamed from: f  reason: collision with root package name */
    public static final a f14733f = new a(4);

    /* renamed from: g  reason: collision with root package name */
    public static final a f14734g = new a(5);

    /* renamed from: h  reason: collision with root package name */
    public static final a f14735h = new a(6);
    public static final a i = new a(7);

    /* renamed from: j  reason: collision with root package name */
    public static final a f14736j = new a(8);

    /* renamed from: k  reason: collision with root package name */
    public static final a f14737k = new a(9);

    /* renamed from: l  reason: collision with root package name */
    public static final a f14738l = new a(10);

    /* renamed from: m  reason: collision with root package name */
    public static final a f14739m = new a(11);

    /* renamed from: n  reason: collision with root package name */
    public static final a f14740n = new a(12);

    /* renamed from: o  reason: collision with root package name */
    public static final a f14741o = new a(13);

    /* renamed from: p  reason: collision with root package name */
    public static final a f14742p = new a(14);

    /* renamed from: q  reason: collision with root package name */
    public static final a f14743q = new a(15);

    /* renamed from: r  reason: collision with root package name */
    public static final a f14744r = new a(16);

    /* renamed from: s  reason: collision with root package name */
    public static final a f14745s = new a(17);

    /* renamed from: t  reason: collision with root package name */
    public static final a f14746t = new a(18);

    /* renamed from: u  reason: collision with root package name */
    public static final a f14747u = new a(19);

    /* renamed from: v  reason: collision with root package name */
    public static final a f14748v = new a(20);

    /* renamed from: w  reason: collision with root package name */
    public static final a f14749w = new a(21);

    /* renamed from: x  reason: collision with root package name */
    public static final a f14750x = new a(22);

    /* renamed from: y  reason: collision with root package name */
    public static final a f14751y = new a(23);
    public static final a z = new a(24);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14752a;

    public /* synthetic */ a(int i8) {
        this.f14752a = i8;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [y2.f, y2.c, t2.l] */
    public static l S(l lVar) {
        int T8 = T(lVar);
        int length = lVar.f16371V.length;
        if (T8 == length) {
            return lVar;
        }
        ? cVar = new C1628c(T8);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            k kVar = (k) lVar.e(i9);
            cVar.f(i8, kVar);
            if (kVar.d() == 2) {
                cVar.f(i8 + 1, k.e(kVar.f15204U + 1, c.f16058i0));
                i8 += 2;
            } else {
                i8++;
            }
        }
        cVar.f16382U = false;
        return cVar;
    }

    public static int T(l lVar) {
        int length = lVar.f16371V.length;
        if (length > 5) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            k kVar = (k) lVar.e(i9);
            i8 += kVar.d();
            if (!C0003d.O((kVar.d() + kVar.f15204U) - 1)) {
                return -1;
            }
        }
        if (i8 <= 5) {
            return i8;
        }
        return -1;
    }

    public final void R(C1627b bVar, p2.k kVar) {
        int h5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        switch (this.f14752a) {
            case 0:
                bVar.k(C0003d.D(kVar, ((u) kVar).m() & 255));
                return;
            case 1:
                bVar.k(C0003d.D(kVar, 0));
                return;
            case 2:
                int g8 = ((n) ((f) kVar).e).g();
                bVar.k(C0003d.D(kVar, C0003d.z(((k) kVar.f14464d.e(0)).f15204U, g8 & 15)));
                return;
            case 3:
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                return;
            case 4:
                l lVar = kVar.f14464d;
                int length = lVar.f16371V.length;
                bVar.k(C0003d.D(kVar, C0003d.z(((k) lVar.e(length - 2)).f15204U, ((k) lVar.e(length - 1)).f15204U)));
                return;
            case 5:
                int m8 = ((u) kVar).m();
                bVar.k(C0003d.D(kVar, 0));
                bVar.k((short) m8);
                return;
            case 6:
                int m9 = ((f) kVar).m();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) m9);
                return;
            case 7:
                n nVar = (n) ((f) kVar).e;
                l lVar2 = kVar.f14464d;
                if (((k) lVar2.e(0)).d() == 1) {
                    h5 = nVar.g() >>> 16;
                } else {
                    h5 = (int) (nVar.h() >>> 48);
                }
                short s8 = (short) h5;
                bVar.k(C0003d.D(kVar, ((k) lVar2.e(0)).f15204U));
                bVar.k(s8);
                return;
            case 8:
                int g9 = ((n) ((f) kVar).e).g();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) g9);
                return;
            case 9:
                int m10 = ((u) kVar).m();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) m10);
                return;
            case 10:
                int g10 = ((n) ((f) kVar).e).g();
                l lVar3 = kVar.f14464d;
                short D8 = C0003d.D(kVar, ((k) lVar3.e(0)).f15204U);
                short h8 = C0003d.h(((k) lVar3.e(1)).f15204U, g10 & 255);
                bVar.k(D8);
                bVar.k(h8);
                return;
            case 11:
                int m11 = ((f) kVar).m();
                l lVar4 = kVar.f14464d;
                bVar.k(C0003d.D(kVar, C0003d.z(((k) lVar4.e(0)).f15204U, ((k) lVar4.e(1)).f15204U)));
                bVar.k((short) m11);
                return;
            case 12:
                int g11 = ((n) ((f) kVar).e).g();
                l lVar5 = kVar.f14464d;
                bVar.k(C0003d.D(kVar, C0003d.z(((k) lVar5.e(0)).f15204U, ((k) lVar5.e(1)).f15204U)));
                bVar.k((short) g11);
                return;
            case 13:
                int m12 = ((u) kVar).m();
                l lVar6 = kVar.f14464d;
                bVar.k(C0003d.D(kVar, C0003d.z(((k) lVar6.e(0)).f15204U, ((k) lVar6.e(1)).f15204U)));
                bVar.k((short) m12);
                return;
            case EnterpriseDeviceManager.KNOX_2_3:
                l lVar7 = kVar.f14464d;
                bVar.k(C0003d.D(kVar, ((k) lVar7.e(0)).f15204U));
                bVar.k((short) ((k) lVar7.e(1)).f15204U);
                return;
            case EnterpriseDeviceManager.KNOX_2_4:
                l lVar8 = kVar.f14464d;
                short D9 = C0003d.D(kVar, ((k) lVar8.e(0)).f15204U);
                short h9 = C0003d.h(((k) lVar8.e(1)).f15204U, ((k) lVar8.e(2)).f15204U);
                bVar.k(D9);
                bVar.k(h9);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                int m13 = ((f) kVar).m();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) m13);
                bVar.k((short) (m13 >> 16));
                return;
            case EnterpriseDeviceManager.KNOX_2_5:
                int g12 = ((n) ((f) kVar).e).g();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) g12);
                bVar.k((short) (g12 >> 16));
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                int m14 = ((u) kVar).m();
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) m14);
                bVar.k((short) (m14 >> 16));
                return;
            case EnterpriseDeviceManager.KNOX_2_6:
                short D10 = C0003d.D(kVar, 0);
                l lVar9 = kVar.f14464d;
                bVar.k(D10);
                bVar.k((short) ((k) lVar9.e(0)).f15204U);
                bVar.k((short) ((k) lVar9.e(1)).f15204U);
                return;
            case EnterpriseDeviceManager.KNOX_2_7:
                int m15 = ((f) kVar).m();
                l S8 = S(kVar.f14464d);
                int length2 = S8.f16371V.length;
                int i13 = 0;
                if (length2 > 0) {
                    i8 = ((k) S8.e(0)).f15204U;
                } else {
                    i8 = 0;
                }
                if (length2 > 1) {
                    i9 = ((k) S8.e(1)).f15204U;
                } else {
                    i9 = 0;
                }
                if (length2 > 2) {
                    i10 = ((k) S8.e(2)).f15204U;
                } else {
                    i10 = 0;
                }
                if (length2 > 3) {
                    i11 = ((k) S8.e(3)).f15204U;
                } else {
                    i11 = 0;
                }
                if (length2 > 4) {
                    i13 = ((k) S8.e(4)).f15204U;
                }
                short D11 = C0003d.D(kVar, C0003d.z(i13, length2));
                short s9 = (short) m15;
                if ((i8 & 15) != i8) {
                    throw new IllegalArgumentException("n0 out of range 0..15");
                } else if ((i9 & 15) != i9) {
                    throw new IllegalArgumentException("n1 out of range 0..15");
                } else if ((i10 & 15) != i10) {
                    throw new IllegalArgumentException("n2 out of range 0..15");
                } else if ((i11 & 15) == i11) {
                    bVar.k(D11);
                    bVar.k(s9);
                    bVar.k((short) ((i9 << 4) | i8 | (i10 << 8) | (i11 << 12)));
                    return;
                } else {
                    throw new IllegalArgumentException("n3 out of range 0..15");
                }
            case 21:
                int m16 = ((f) kVar).m();
                l lVar10 = kVar.f14464d;
                if (lVar10.f16371V.length == 0) {
                    i12 = 0;
                } else {
                    i12 = ((k) lVar10.e(0)).f15204U;
                }
                int length3 = lVar10.f16371V.length;
                int i14 = 0;
                for (int i15 = 0; i15 < length3; i15++) {
                    i14 += lVar10.b(i15).d();
                }
                bVar.k(C0003d.D(kVar, i14));
                bVar.k((short) m16);
                bVar.k((short) i12);
                return;
            case 22:
                throw new ClassCastException();
            case 23:
                throw new ClassCastException();
            case 24:
                long j7 = ((m) ((f) kVar).e).f15757U;
                bVar.k(C0003d.D(kVar, ((k) kVar.f14464d.e(0)).f15204U));
                bVar.k((short) ((int) j7));
                bVar.k((short) ((int) (j7 >> 16)));
                bVar.k((short) ((int) (j7 >> 32)));
                bVar.k((short) ((int) (j7 >> 48)));
                return;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    public boolean b(u uVar) {
        switch (this.f14752a) {
            case 0:
                int m8 = uVar.m();
                if (m8 == 0 || ((byte) m8) != m8) {
                    return false;
                }
                return true;
            case 5:
                int m9 = uVar.m();
                if (m9 == 0 || ((short) m9) != m9) {
                    return false;
                }
                return true;
            case 9:
                int m10 = uVar.m();
                if (m10 == 0 || ((short) m10) != m10) {
                    return false;
                }
                return true;
            case 13:
                int m11 = uVar.m();
                if (m11 == 0 || ((short) m11) != m11) {
                    return false;
                }
                return true;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                return true;
            default:
                return super.b(uVar);
        }
    }

    public final int g() {
        switch (this.f14752a) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 2;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 2;
            case 11:
                return 2;
            case 12:
                return 2;
            case 13:
                return 2;
            case EnterpriseDeviceManager.KNOX_2_3:
                return 2;
            case EnterpriseDeviceManager.KNOX_2_4:
                return 2;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                return 3;
            case EnterpriseDeviceManager.KNOX_2_5:
                return 3;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                return 3;
            case EnterpriseDeviceManager.KNOX_2_6:
                return 3;
            case EnterpriseDeviceManager.KNOX_2_7:
                return 3;
            case 21:
                return 3;
            case 22:
                return 4;
            case 23:
                return 4;
            case 24:
                return 5;
            default:
                throw new RuntimeException("unsupported");
        }
    }

    public BitSet j(g gVar) {
        switch (this.f14752a) {
            case 2:
                BitSet bitSet = new BitSet(1);
                bitSet.set(0, C0003d.O(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet;
            case 3:
                BitSet bitSet2 = new BitSet(1);
                bitSet2.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet2;
            case 4:
                BitSet bitSet3 = new BitSet(2);
                l lVar = gVar.f14464d;
                int length = lVar.f16371V.length;
                int i8 = ((k) lVar.e(0)).f15204U;
                int i9 = ((k) lVar.e(1)).f15204U;
                if (length == 2) {
                    bitSet3.set(0, C0003d.O(i8));
                    bitSet3.set(1, C0003d.O(i9));
                } else if (length == 3) {
                    if (i8 != i9) {
                        bitSet3.set(0, false);
                        bitSet3.set(1, false);
                    } else {
                        boolean O8 = C0003d.O(i9);
                        bitSet3.set(0, O8);
                        bitSet3.set(1, O8);
                    }
                    bitSet3.set(2, C0003d.O(((k) lVar.e(2)).f15204U));
                } else {
                    throw new AssertionError();
                }
                return bitSet3;
            case 6:
                l lVar2 = gVar.f14464d;
                int length2 = lVar2.f16371V.length;
                BitSet bitSet4 = new BitSet(length2);
                boolean N2 = C0003d.N(((k) lVar2.e(0)).f15204U);
                if (length2 == 1) {
                    bitSet4.set(0, N2);
                } else if (((k) lVar2.e(0)).f15204U == ((k) lVar2.e(1)).f15204U) {
                    bitSet4.set(0, N2);
                    bitSet4.set(1, N2);
                }
                return bitSet4;
            case 7:
                BitSet bitSet5 = new BitSet(1);
                bitSet5.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet5;
            case 8:
                BitSet bitSet6 = new BitSet(1);
                bitSet6.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet6;
            case 9:
                BitSet bitSet7 = new BitSet(1);
                bitSet7.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet7;
            case 10:
                BitSet bitSet8 = new BitSet(2);
                l lVar3 = gVar.f14464d;
                bitSet8.set(0, C0003d.N(((k) lVar3.e(0)).f15204U));
                bitSet8.set(1, C0003d.N(((k) lVar3.e(1)).f15204U));
                return bitSet8;
            case 11:
                BitSet bitSet9 = new BitSet(2);
                l lVar4 = gVar.f14464d;
                bitSet9.set(0, C0003d.O(((k) lVar4.e(0)).f15204U));
                bitSet9.set(1, C0003d.O(((k) lVar4.e(1)).f15204U));
                return bitSet9;
            case 12:
                BitSet bitSet10 = new BitSet(2);
                l lVar5 = gVar.f14464d;
                bitSet10.set(0, C0003d.O(((k) lVar5.e(0)).f15204U));
                bitSet10.set(1, C0003d.O(((k) lVar5.e(1)).f15204U));
                return bitSet10;
            case 13:
                BitSet bitSet11 = new BitSet(2);
                l lVar6 = gVar.f14464d;
                bitSet11.set(0, C0003d.O(((k) lVar6.e(0)).f15204U));
                bitSet11.set(1, C0003d.O(((k) lVar6.e(1)).f15204U));
                return bitSet11;
            case EnterpriseDeviceManager.KNOX_2_3:
                BitSet bitSet12 = new BitSet(2);
                l lVar7 = gVar.f14464d;
                bitSet12.set(0, C0003d.N(((k) lVar7.e(0)).f15204U));
                bitSet12.set(1, C0003d.P(((k) lVar7.e(1)).f15204U));
                return bitSet12;
            case EnterpriseDeviceManager.KNOX_2_4:
                BitSet bitSet13 = new BitSet(3);
                l lVar8 = gVar.f14464d;
                bitSet13.set(0, C0003d.N(((k) lVar8.e(0)).f15204U));
                bitSet13.set(1, C0003d.N(((k) lVar8.e(1)).f15204U));
                bitSet13.set(2, C0003d.N(((k) lVar8.e(2)).f15204U));
                return bitSet13;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                l lVar9 = gVar.f14464d;
                int length3 = lVar9.f16371V.length;
                BitSet bitSet14 = new BitSet(length3);
                boolean N8 = C0003d.N(((k) lVar9.e(0)).f15204U);
                if (length3 == 1) {
                    bitSet14.set(0, N8);
                } else if (((k) lVar9.e(0)).f15204U == ((k) lVar9.e(1)).f15204U) {
                    bitSet14.set(0, N8);
                    bitSet14.set(1, N8);
                }
                return bitSet14;
            case EnterpriseDeviceManager.KNOX_2_5:
                BitSet bitSet15 = new BitSet(1);
                bitSet15.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet15;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                BitSet bitSet16 = new BitSet(1);
                bitSet16.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet16;
            case EnterpriseDeviceManager.KNOX_2_6:
                BitSet bitSet17 = new BitSet(2);
                l lVar10 = gVar.f14464d;
                bitSet17.set(0, C0003d.P(((k) lVar10.e(0)).f15204U));
                bitSet17.set(1, C0003d.P(((k) lVar10.e(1)).f15204U));
                return bitSet17;
            case EnterpriseDeviceManager.KNOX_2_7:
                l lVar11 = gVar.f14464d;
                int length4 = lVar11.f16371V.length;
                BitSet bitSet18 = new BitSet(length4);
                for (int i10 = 0; i10 < length4; i10++) {
                    k kVar = (k) lVar11.e(i10);
                    bitSet18.set(i10, C0003d.O((kVar.d() + kVar.f15204U) - 1));
                }
                return bitSet18;
            case 22:
                l lVar12 = gVar.f14464d;
                int length5 = lVar12.f16371V.length;
                BitSet bitSet19 = new BitSet(length5);
                for (int i11 = 0; i11 < length5; i11++) {
                    k kVar2 = (k) lVar12.e(i11);
                    bitSet19.set(i11, C0003d.O((kVar2.d() + kVar2.f15204U) - 1));
                }
                return bitSet19;
            case 24:
                BitSet bitSet20 = new BitSet(1);
                bitSet20.set(0, C0003d.N(((k) gVar.f14464d.e(0)).f15204U));
                return bitSet20;
            default:
                return super.j(gVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: t2.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String t(p2.k r10) {
        /*
            r9 = this;
            int r0 = r9.f14752a
            switch(r0) {
                case 0: goto L_0x0437;
                case 1: goto L_0x0434;
                case 2: goto L_0x0407;
                case 3: goto L_0x03f9;
                case 4: goto L_0x03c7;
                case 5: goto L_0x03c2;
                case 6: goto L_0x039c;
                case 7: goto L_0x036f;
                case 8: goto L_0x0342;
                case 9: goto L_0x031c;
                case 10: goto L_0x02de;
                case 11: goto L_0x02a7;
                case 12: goto L_0x0269;
                case 13: goto L_0x0232;
                case 14: goto L_0x0205;
                case 15: goto L_0x01c7;
                case 16: goto L_0x01a1;
                case 17: goto L_0x0174;
                case 18: goto L_0x014e;
                case 19: goto L_0x0121;
                case 20: goto L_0x00fe;
                case 21: goto L_0x00df;
                case 22: goto L_0x0059;
                case 23: goto L_0x003a;
                case 24: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "unsupported"
            r10.<init>(r0)
            throw r10
        L_0x000d:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r2)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            t2.l r1 = r10.f14464d
            java.lang.String r1 = B.C0003d.H(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = r10.d()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0059:
            t2.l r0 = r10.f14464d
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r2 = 0
            r3 = 5
            r4 = -1
            if (r1 <= r3) goto L_0x0064
            goto L_0x0089
        L_0x0064:
            r5 = 0
            r6 = 0
        L_0x0066:
            if (r5 >= r1) goto L_0x0086
            java.lang.Object r7 = r0.e(r5)
            t2.k r7 = (t2.k) r7
            int r8 = r7.d()
            int r6 = r6 + r8
            int r8 = r7.d()
            int r7 = r7.f15204U
            int r8 = r8 + r7
            int r8 = r8 + -1
            boolean r7 = B.C0003d.O(r8)
            if (r7 != 0) goto L_0x0083
            goto L_0x0089
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x0086:
            if (r6 > r3) goto L_0x0089
            r4 = r6
        L_0x0089:
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            if (r4 != r1) goto L_0x008f
            goto L_0x00c2
        L_0x008f:
            t2.l r3 = new t2.l
            r3.<init>(r4)
            r4 = 0
            r5 = 0
        L_0x0096:
            if (r4 >= r1) goto L_0x00bf
            java.lang.Object r6 = r0.e(r4)
            t2.k r6 = (t2.k) r6
            r3.f(r5, r6)
            int r7 = r6.d()
            r8 = 2
            if (r7 != r8) goto L_0x00ba
            int r7 = r5 + 1
            int r6 = r6.f15204U
            int r6 = r6 + 1
            v2.c r8 = v2.c.f16058i0
            t2.k r6 = t2.k.e(r6, r8)
            r3.f(r7, r6)
            int r5 = r5 + 2
            goto L_0x00bc
        L_0x00ba:
            int r5 = r5 + 1
        L_0x00bc:
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00bf:
            r3.f16382U = r2
            r0 = r3
        L_0x00c2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = B.C0003d.G(r0)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r10 = r10.d()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x00df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            t2.l r1 = r10.f14464d
            java.lang.String r1 = B.C0003d.H(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = r10.d()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x00fe:
            t2.l r0 = r10.f14464d
            t2.l r0 = S(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = B.C0003d.G(r0)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r10 = r10.d()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0121:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r1 = r10.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 1
            java.lang.Object r10 = r10.e(r1)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = B.C0003d.c(r10)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0174:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r2)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x01a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = r10.d()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x01c7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r1 = r10.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r2 = 1
            java.lang.Object r2 = r10.e(r2)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r0.append(r2)
            r0.append(r1)
            r1 = 2
            java.lang.Object r10 = r10.e(r1)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0205:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r1 = r10.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 1
            java.lang.Object r10 = r10.e(r1)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0232:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r3 = 1
            java.lang.Object r2 = r2.e(r3)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = B.C0003d.c(r10)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0269:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r2 = r10.e(r2)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r3 = 1
            java.lang.Object r10 = r10.e(r3)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x02a7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r3 = 1
            java.lang.Object r2 = r2.e(r3)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = r10.d()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x02de:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r2 = r10.e(r2)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r3 = 1
            java.lang.Object r10 = r10.e(r3)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x031c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = B.C0003d.c(r10)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x0342:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r2)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x036f:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r2)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x039c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            t2.l r2 = r10.f14464d
            java.lang.Object r1 = r2.e(r1)
            t2.k r1 = (t2.k) r1
            java.lang.String r1 = r1.g()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r10 = r10.d()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x03c2:
            java.lang.String r10 = B.C0003d.c(r10)
            return r10
        L_0x03c7:
            t2.l r10 = r10.f14464d
            java.lang.Object[] r0 = r10.f16371V
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0 + -2
            java.lang.Object r2 = r10.e(r2)
            t2.k r2 = (t2.k) r2
            java.lang.String r2 = r2.g()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r0 = r0 + -1
            java.lang.Object r10 = r10.e(r0)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x03f9:
            r0 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r0)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            return r10
        L_0x0407:
            r0 = r10
            p2.f r0 = (p2.f) r0
            u2.a r0 = r0.e
            u2.n r0 = (u2.n) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            t2.l r10 = r10.f14464d
            java.lang.Object r10 = r10.e(r2)
            t2.k r10 = (t2.k) r10
            java.lang.String r10 = r10.g()
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            java.lang.String r10 = B.C0003d.y(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0434:
            java.lang.String r10 = ""
            return r10
        L_0x0437:
            java.lang.String r10 = B.C0003d.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a.t(p2.k):java.lang.String");
    }

    public final String u(p2.k kVar) {
        int i8;
        switch (this.f14752a) {
            case 0:
                return C0003d.a(kVar);
            case 1:
                return "";
            case 2:
                return C0003d.x((n) ((f) kVar).e, 4);
            case 3:
                return "";
            case 4:
                return "";
            case 5:
                return C0003d.a(kVar);
            case 6:
                return kVar.c();
            case 7:
                n nVar = (n) ((f) kVar).e;
                if (((k) kVar.f14464d.e(0)).d() == 1) {
                    i8 = 32;
                } else {
                    i8 = 64;
                }
                return C0003d.x(nVar, i8);
            case 8:
                return C0003d.x((n) ((f) kVar).e, 16);
            case 9:
                return C0003d.a(kVar);
            case 10:
                return C0003d.x((n) ((f) kVar).e, 8);
            case 11:
                return kVar.c();
            case 12:
                return C0003d.x((n) ((f) kVar).e, 16);
            case 13:
                return C0003d.a(kVar);
            case EnterpriseDeviceManager.KNOX_2_3:
                return "";
            case EnterpriseDeviceManager.KNOX_2_4:
                return "";
            case EnterpriseDeviceManager.KNOX_2_4_1:
                return kVar.c();
            case EnterpriseDeviceManager.KNOX_2_5:
                return C0003d.x((n) ((f) kVar).e, 32);
            case EnterpriseDeviceManager.KNOX_2_5_1:
                return C0003d.a(kVar);
            case EnterpriseDeviceManager.KNOX_2_6:
                return "";
            case EnterpriseDeviceManager.KNOX_2_7:
                return kVar.c();
            case 21:
                return kVar.c();
            case 22:
                return kVar.c();
            case 23:
                return kVar.c();
            case 24:
                return C0003d.x((n) ((f) kVar).e, 64);
            default:
                throw new RuntimeException("unsupported");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: t2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: t2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: t2.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0399 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(p2.g r8) {
        /*
            r7 = this;
            int r0 = r7.f14752a
            switch(r0) {
                case 0: goto L_0x04cd;
                case 1: goto L_0x04be;
                case 2: goto L_0x0485;
                case 3: goto L_0x0468;
                case 4: goto L_0x041d;
                case 5: goto L_0x0400;
                case 6: goto L_0x03ad;
                case 7: goto L_0x035c;
                case 8: goto L_0x0326;
                case 9: goto L_0x02fa;
                case 10: goto L_0x02b5;
                case 11: goto L_0x0271;
                case 12: goto L_0x022c;
                case 13: goto L_0x01f1;
                case 14: goto L_0x01c5;
                case 15: goto L_0x018a;
                case 16: goto L_0x0143;
                case 17: goto L_0x0117;
                case 18: goto L_0x00f9;
                case 19: goto L_0x00cd;
                case 20: goto L_0x00a5;
                case 21: goto L_0x002e;
                case 22: goto L_0x002c;
                case 23: goto L_0x002a;
                case 24: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r8 = 1
            return r8
        L_0x0007:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x0029
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r2 = r8 instanceof u2.m
        L_0x0029:
            return r2
        L_0x002a:
            r8 = 0
            return r8
        L_0x002c:
            r8 = 0
            return r8
        L_0x002e:
            boolean r0 = r8 instanceof p2.f
            r1 = 0
            if (r0 != 0) goto L_0x0035
            goto L_0x00a4
        L_0x0035:
            p2.f r8 = (p2.f) r8
            int r0 = r8.m()
            boolean r0 = B.C0003d.P(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x00a4
        L_0x0042:
            u2.a r0 = r8.e
            boolean r2 = r0 instanceof u2.q
            if (r2 != 0) goto L_0x004d
            boolean r0 = r0 instanceof u2.u
            if (r0 != 0) goto L_0x004d
            goto L_0x00a4
        L_0x004d:
            t2.l r8 = r8.f14464d
            java.lang.Object[] r0 = r8.f16371V
            int r2 = r0.length
            r3 = 1
            if (r2 == 0) goto L_0x00a3
            int r0 = r0.length
            r2 = 2
            if (r0 >= r2) goto L_0x005b
        L_0x0059:
            r0 = 1
            goto L_0x007a
        L_0x005b:
            java.lang.Object r2 = r8.e(r1)
            t2.k r2 = (t2.k) r2
            int r2 = r2.f15204U
            r4 = 0
        L_0x0064:
            if (r4 >= r0) goto L_0x0059
            java.lang.Object r5 = r8.e(r4)
            t2.k r5 = (t2.k) r5
            int r6 = r5.f15204U
            if (r6 == r2) goto L_0x0072
            r0 = 0
            goto L_0x007a
        L_0x0072:
            int r5 = r5.d()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L_0x0064
        L_0x007a:
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r8.e(r1)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.P(r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object[] r0 = r8.f16371V
            int r0 = r0.length
            r2 = 0
            r4 = 0
        L_0x008f:
            if (r2 >= r0) goto L_0x009d
            v2.c r5 = r8.b(r2)
            int r5 = r5.d()
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x008f
        L_0x009d:
            boolean r8 = B.C0003d.N(r4)
            if (r8 == 0) goto L_0x00a4
        L_0x00a3:
            r1 = 1
        L_0x00a4:
            return r1
        L_0x00a5:
            boolean r0 = r8 instanceof p2.f
            r1 = 0
            if (r0 != 0) goto L_0x00ab
            goto L_0x00cc
        L_0x00ab:
            p2.f r8 = (p2.f) r8
            int r0 = r8.m()
            boolean r0 = B.C0003d.P(r0)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00cc
        L_0x00b8:
            u2.a r0 = r8.e
            boolean r2 = r0 instanceof u2.q
            if (r2 != 0) goto L_0x00c3
            boolean r0 = r0 instanceof u2.u
            if (r0 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            t2.l r8 = r8.f14464d
            int r8 = T(r8)
            if (r8 < 0) goto L_0x00cc
            r1 = 1
        L_0x00cc:
            return r1
        L_0x00cd:
            t2.l r0 = r8.f14464d
            boolean r8 = r8 instanceof p2.t
            r1 = 0
            if (r8 == 0) goto L_0x00f8
            java.lang.Object[] r8 = r0.f16371V
            int r8 = r8.length
            r2 = 2
            if (r8 != r2) goto L_0x00f8
            java.lang.Object r8 = r0.e(r1)
            t2.k r8 = (t2.k) r8
            int r8 = r8.f15204U
            boolean r8 = B.C0003d.P(r8)
            if (r8 == 0) goto L_0x00f8
            r8 = 1
            java.lang.Object r0 = r0.e(r8)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.P(r0)
            if (r0 == 0) goto L_0x00f8
            r1 = 1
        L_0x00f8:
            return r1
        L_0x00f9:
            t2.l r0 = r8.f14464d
            boolean r8 = r8 instanceof p2.u
            r1 = 0
            if (r8 == 0) goto L_0x0116
            java.lang.Object[] r8 = r0.f16371V
            int r8 = r8.length
            r2 = 1
            if (r8 != r2) goto L_0x0116
            java.lang.Object r8 = r0.e(r1)
            t2.k r8 = (t2.k) r8
            int r8 = r8.f15204U
            boolean r8 = B.C0003d.N(r8)
            if (r8 != 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r1 = 1
        L_0x0116:
            return r1
        L_0x0117:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x0142
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x0142
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x0133
            goto L_0x0142
        L_0x0133:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.n
            if (r0 != 0) goto L_0x013c
            goto L_0x0142
        L_0x013c:
            u2.n r8 = (u2.n) r8
            boolean r2 = r8.f()
        L_0x0142:
            return r2
        L_0x0143:
            boolean r0 = r8 instanceof p2.f
            r1 = 0
            if (r0 != 0) goto L_0x0149
            goto L_0x0189
        L_0x0149:
            t2.l r0 = r8.f14464d
            java.lang.Object[] r2 = r0.f16371V
            int r2 = r2.length
            r3 = 1
            if (r2 == r3) goto L_0x0168
            r4 = 2
            if (r2 == r4) goto L_0x0155
            goto L_0x0189
        L_0x0155:
            java.lang.Object r2 = r0.e(r1)
            t2.k r2 = (t2.k) r2
            java.lang.Object r0 = r0.e(r3)
            t2.k r0 = (t2.k) r0
            int r4 = r2.f15204U
            int r0 = r0.f15204U
            if (r4 == r0) goto L_0x016f
            goto L_0x0189
        L_0x0168:
            java.lang.Object r0 = r0.e(r1)
            r2 = r0
            t2.k r2 = (t2.k) r2
        L_0x016f:
            int r0 = r2.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x0178
            goto L_0x0189
        L_0x0178:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.u
            if (r0 != 0) goto L_0x0188
            boolean r0 = r8 instanceof u2.h
            if (r0 != 0) goto L_0x0188
            boolean r8 = r8 instanceof u2.t
            if (r8 == 0) goto L_0x0189
        L_0x0188:
            r1 = 1
        L_0x0189:
            return r1
        L_0x018a:
            t2.l r0 = r8.f14464d
            boolean r8 = r8 instanceof p2.t
            r1 = 0
            if (r8 == 0) goto L_0x01c4
            java.lang.Object[] r8 = r0.f16371V
            int r8 = r8.length
            r2 = 3
            if (r8 != r2) goto L_0x01c4
            java.lang.Object r8 = r0.e(r1)
            t2.k r8 = (t2.k) r8
            int r8 = r8.f15204U
            boolean r8 = B.C0003d.N(r8)
            if (r8 == 0) goto L_0x01c4
            r8 = 1
            java.lang.Object r2 = r0.e(r8)
            t2.k r2 = (t2.k) r2
            int r2 = r2.f15204U
            boolean r2 = B.C0003d.N(r2)
            if (r2 == 0) goto L_0x01c4
            r2 = 2
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 == 0) goto L_0x01c4
            r1 = 1
        L_0x01c4:
            return r1
        L_0x01c5:
            t2.l r0 = r8.f14464d
            boolean r8 = r8 instanceof p2.t
            r1 = 0
            if (r8 == 0) goto L_0x01f0
            java.lang.Object[] r8 = r0.f16371V
            int r8 = r8.length
            r2 = 2
            if (r8 != r2) goto L_0x01f0
            java.lang.Object r8 = r0.e(r1)
            t2.k r8 = (t2.k) r8
            int r8 = r8.f15204U
            boolean r8 = B.C0003d.N(r8)
            if (r8 == 0) goto L_0x01f0
            r8 = 1
            java.lang.Object r0 = r0.e(r8)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.P(r0)
            if (r0 == 0) goto L_0x01f0
            r1 = 1
        L_0x01f0:
            return r1
        L_0x01f1:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.u
            r2 = 0
            if (r1 == 0) goto L_0x022b
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 2
            if (r1 != r3) goto L_0x022b
            java.lang.Object r1 = r0.e(r2)
            t2.k r1 = (t2.k) r1
            int r1 = r1.f15204U
            boolean r1 = B.C0003d.O(r1)
            if (r1 == 0) goto L_0x022b
            r1 = 1
            java.lang.Object r0 = r0.e(r1)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.O(r0)
            if (r0 != 0) goto L_0x021c
            goto L_0x022b
        L_0x021c:
            p2.u r8 = (p2.u) r8
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x022a
            boolean r8 = r7.b(r8)
            r2 = r8
            goto L_0x022b
        L_0x022a:
            r2 = 1
        L_0x022b:
            return r2
        L_0x022c:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x0270
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 2
            if (r1 != r3) goto L_0x0270
            java.lang.Object r1 = r0.e(r2)
            t2.k r1 = (t2.k) r1
            int r1 = r1.f15204U
            boolean r1 = B.C0003d.O(r1)
            if (r1 == 0) goto L_0x0270
            r1 = 1
            java.lang.Object r0 = r0.e(r1)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.O(r0)
            if (r0 != 0) goto L_0x0257
            goto L_0x0270
        L_0x0257:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.n
            if (r0 != 0) goto L_0x0260
            goto L_0x0270
        L_0x0260:
            u2.n r8 = (u2.n) r8
            boolean r0 = r8.f()
            if (r0 == 0) goto L_0x0270
            int r8 = r8.g()
            short r0 = (short) r8
            if (r0 != r8) goto L_0x0270
            r2 = 1
        L_0x0270:
            return r2
        L_0x0271:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x02b4
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 2
            if (r1 != r3) goto L_0x02b4
            java.lang.Object r1 = r0.e(r2)
            t2.k r1 = (t2.k) r1
            int r1 = r1.f15204U
            boolean r1 = B.C0003d.O(r1)
            if (r1 == 0) goto L_0x02b4
            r1 = 1
            java.lang.Object r0 = r0.e(r1)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.O(r0)
            if (r0 != 0) goto L_0x029c
            goto L_0x02b4
        L_0x029c:
            p2.f r8 = (p2.f) r8
            int r0 = r8.m()
            boolean r0 = B.C0003d.P(r0)
            if (r0 != 0) goto L_0x02a9
            goto L_0x02b4
        L_0x02a9:
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.u
            if (r0 != 0) goto L_0x02b3
            boolean r8 = r8 instanceof u2.h
            if (r8 == 0) goto L_0x02b4
        L_0x02b3:
            r2 = 1
        L_0x02b4:
            return r2
        L_0x02b5:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x02f9
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 2
            if (r1 != r3) goto L_0x02f9
            java.lang.Object r1 = r0.e(r2)
            t2.k r1 = (t2.k) r1
            int r1 = r1.f15204U
            boolean r1 = B.C0003d.N(r1)
            if (r1 == 0) goto L_0x02f9
            r1 = 1
            java.lang.Object r0 = r0.e(r1)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x02e0
            goto L_0x02f9
        L_0x02e0:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.n
            if (r0 != 0) goto L_0x02e9
            goto L_0x02f9
        L_0x02e9:
            u2.n r8 = (u2.n) r8
            boolean r0 = r8.f()
            if (r0 == 0) goto L_0x02f9
            int r8 = r8.g()
            byte r0 = (byte) r8
            if (r0 != r8) goto L_0x02f9
            r2 = 1
        L_0x02f9:
            return r2
        L_0x02fa:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.u
            r2 = 0
            if (r1 == 0) goto L_0x0325
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x0325
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x0316
            goto L_0x0325
        L_0x0316:
            p2.u r8 = (p2.u) r8
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x0324
            boolean r8 = r7.b(r8)
            r2 = r8
            goto L_0x0325
        L_0x0324:
            r2 = 1
        L_0x0325:
            return r2
        L_0x0326:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x035b
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x035b
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x0342
            goto L_0x035b
        L_0x0342:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.n
            if (r0 != 0) goto L_0x034b
            goto L_0x035b
        L_0x034b:
            u2.n r8 = (u2.n) r8
            boolean r0 = r8.f()
            if (r0 == 0) goto L_0x035b
            int r8 = r8.g()
            short r0 = (short) r8
            if (r0 != r8) goto L_0x035b
            r2 = 1
        L_0x035b:
            return r2
        L_0x035c:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x03ac
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x03ac
            java.lang.Object r1 = r0.e(r2)
            t2.k r1 = (t2.k) r1
            int r1 = r1.f15204U
            boolean r1 = B.C0003d.N(r1)
            if (r1 != 0) goto L_0x0378
            goto L_0x03ac
        L_0x0378:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r1 = r8 instanceof u2.n
            if (r1 != 0) goto L_0x0381
            goto L_0x03ac
        L_0x0381:
            u2.n r8 = (u2.n) r8
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.d()
            if (r0 != r3) goto L_0x039b
            int r8 = r8.g()
            r0 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r0
            if (r8 != 0) goto L_0x03ac
        L_0x0399:
            r2 = 1
            goto L_0x03ac
        L_0x039b:
            long r0 = r8.h()
            r4 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r0 = r0 & r4
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x03ac
            goto L_0x0399
        L_0x03ac:
            return r2
        L_0x03ad:
            boolean r0 = r8 instanceof p2.f
            r1 = 0
            if (r0 != 0) goto L_0x03b3
            goto L_0x03ff
        L_0x03b3:
            t2.l r0 = r8.f14464d
            java.lang.Object[] r2 = r0.f16371V
            int r2 = r2.length
            r3 = 1
            if (r2 == r3) goto L_0x03d2
            r4 = 2
            if (r2 == r4) goto L_0x03bf
            goto L_0x03ff
        L_0x03bf:
            java.lang.Object r2 = r0.e(r1)
            t2.k r2 = (t2.k) r2
            java.lang.Object r0 = r0.e(r3)
            t2.k r0 = (t2.k) r0
            int r4 = r2.f15204U
            int r0 = r0.f15204U
            if (r4 == r0) goto L_0x03d9
            goto L_0x03ff
        L_0x03d2:
            java.lang.Object r0 = r0.e(r1)
            r2 = r0
            t2.k r2 = (t2.k) r2
        L_0x03d9:
            int r0 = r2.f15204U
            boolean r0 = B.C0003d.N(r0)
            if (r0 != 0) goto L_0x03e2
            goto L_0x03ff
        L_0x03e2:
            p2.f r8 = (p2.f) r8
            int r0 = r8.m()
            boolean r0 = B.C0003d.P(r0)
            if (r0 != 0) goto L_0x03ef
            goto L_0x03ff
        L_0x03ef:
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.u
            if (r0 != 0) goto L_0x03fe
            boolean r0 = r8 instanceof u2.h
            if (r0 != 0) goto L_0x03fe
            boolean r8 = r8 instanceof u2.t
            if (r8 != 0) goto L_0x03fe
            goto L_0x03ff
        L_0x03fe:
            r1 = 1
        L_0x03ff:
            return r1
        L_0x0400:
            boolean r0 = r8 instanceof p2.u
            if (r0 == 0) goto L_0x041b
            t2.l r0 = r8.f14464d
            java.lang.Object[] r0 = r0.f16371V
            int r0 = r0.length
            if (r0 == 0) goto L_0x040c
            goto L_0x041b
        L_0x040c:
            p2.u r8 = (p2.u) r8
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x0419
            boolean r8 = r7.b(r8)
            goto L_0x041c
        L_0x0419:
            r8 = 1
            goto L_0x041c
        L_0x041b:
            r8 = 0
        L_0x041c:
            return r8
        L_0x041d:
            boolean r0 = r8 instanceof p2.t
            r1 = 0
            if (r0 != 0) goto L_0x0423
            goto L_0x0467
        L_0x0423:
            t2.l r8 = r8.f14464d
            java.lang.Object[] r0 = r8.f16371V
            int r0 = r0.length
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L_0x0449
            r4 = 3
            if (r0 == r4) goto L_0x0430
            goto L_0x0467
        L_0x0430:
            java.lang.Object r0 = r8.e(r3)
            t2.k r0 = (t2.k) r0
            java.lang.Object r2 = r8.e(r2)
            t2.k r2 = (t2.k) r2
            java.lang.Object r8 = r8.e(r1)
            t2.k r8 = (t2.k) r8
            int r4 = r0.f15204U
            int r8 = r8.f15204U
            if (r4 == r8) goto L_0x0456
            goto L_0x0467
        L_0x0449:
            java.lang.Object r0 = r8.e(r1)
            t2.k r0 = (t2.k) r0
            java.lang.Object r8 = r8.e(r3)
            r2 = r8
            t2.k r2 = (t2.k) r2
        L_0x0456:
            int r8 = r0.f15204U
            boolean r8 = B.C0003d.O(r8)
            if (r8 == 0) goto L_0x0467
            int r8 = r2.f15204U
            boolean r8 = B.C0003d.O(r8)
            if (r8 == 0) goto L_0x0467
            r1 = 1
        L_0x0467:
            return r1
        L_0x0468:
            t2.l r0 = r8.f14464d
            boolean r8 = r8 instanceof p2.t
            r1 = 0
            if (r8 == 0) goto L_0x0484
            java.lang.Object[] r8 = r0.f16371V
            int r8 = r8.length
            r2 = 1
            if (r8 != r2) goto L_0x0484
            java.lang.Object r8 = r0.e(r1)
            t2.k r8 = (t2.k) r8
            int r8 = r8.f15204U
            boolean r8 = B.C0003d.N(r8)
            if (r8 == 0) goto L_0x0484
            r1 = 1
        L_0x0484:
            return r1
        L_0x0485:
            t2.l r0 = r8.f14464d
            boolean r1 = r8 instanceof p2.f
            r2 = 0
            if (r1 == 0) goto L_0x04bd
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L_0x04bd
            java.lang.Object r0 = r0.e(r2)
            t2.k r0 = (t2.k) r0
            int r0 = r0.f15204U
            boolean r0 = B.C0003d.O(r0)
            if (r0 != 0) goto L_0x04a1
            goto L_0x04bd
        L_0x04a1:
            p2.f r8 = (p2.f) r8
            u2.a r8 = r8.e
            boolean r0 = r8 instanceof u2.n
            if (r0 != 0) goto L_0x04aa
            goto L_0x04bd
        L_0x04aa:
            u2.n r8 = (u2.n) r8
            boolean r0 = r8.f()
            if (r0 == 0) goto L_0x04bd
            int r8 = r8.g()
            r0 = -8
            if (r8 < r0) goto L_0x04bd
            r0 = 7
            if (r8 > r0) goto L_0x04bd
            r2 = 1
        L_0x04bd:
            return r2
        L_0x04be:
            boolean r0 = r8 instanceof p2.t
            if (r0 == 0) goto L_0x04cb
            t2.l r8 = r8.f14464d
            java.lang.Object[] r8 = r8.f16371V
            int r8 = r8.length
            if (r8 != 0) goto L_0x04cb
            r8 = 1
            goto L_0x04cc
        L_0x04cb:
            r8 = 0
        L_0x04cc:
            return r8
        L_0x04cd:
            boolean r0 = r8 instanceof p2.u
            if (r0 == 0) goto L_0x04e8
            t2.l r0 = r8.f14464d
            java.lang.Object[] r0 = r0.f16371V
            int r0 = r0.length
            if (r0 == 0) goto L_0x04d9
            goto L_0x04e8
        L_0x04d9:
            p2.u r8 = (p2.u) r8
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x04e6
            boolean r8 = r7.b(r8)
            goto L_0x04e9
        L_0x04e6:
            r8 = 1
            goto L_0x04e9
        L_0x04e8:
            r8 = 0
        L_0x04e9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a.v(p2.g):boolean");
    }
}
