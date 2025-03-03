package A;

import B.N;
import B.W;
import B.k0;
import B.q0;
import B2.b;
import D.C0036c;
import D.C0038d;
import D.C0047h0;
import D.C0053k0;
import D.C0064s;
import D.C0065t;
import D.H0;
import D.K;
import D.Y;
import D.Z;
import D.t0;
import D2.j;
import D2.o;
import D2.p;
import D2.u;
import E0.g;
import G.c;
import G.i;
import G5.m;
import H1.d;
import H1.e;
import H2.C0082c;
import H2.r;
import H2.w;
import H2.z;
import M0.C0121i;
import M0.J;
import Q.h;
import V0.v;
import X2.a;
import a0.k;
import android.content.Context;
import android.media.Image;
import android.os.Handler;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.widget.EditText;
import android.widget.TextView;
import com.bumptech.glide.manager.q;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import m4.C1214b;
import o.s1;
import org.altbeacon.bluetooth.Pdu;
import p1.F;
import p1.l;
import p1.s;
import r.C1366a;
import u0.C1486a;

public class f implements t0, c, Z, C0065t, C0047h0, a, B6.a, F5.a, k, G.a, r, b {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f16U;

    /* renamed from: V  reason: collision with root package name */
    public Object f17V;

    public /* synthetic */ f(int i, Object obj) {
        this.f16U = i;
        this.f17V = obj;
    }

    public static k0 K(W w2) {
        if (w2 == null) {
            return null;
        }
        return new k0(w2, new Size(w2.c(), w2.b()), new H.c(new h((C0064s) null, H0.f784b, w2.e().b())));
    }

    private final void X(Throwable th) {
    }

    public void C() {
        ((q) this.f17V).C();
    }

    public int D() {
        return ((q) this.f17V).D();
    }

    public void E(Y y8, Executor executor) {
        ((q) this.f17V).E(new g(this, 4, y8), executor);
    }

    public W F() {
        return K(((q) this.f17V).F());
    }

    public void H(Object obj) {
        ((C1486a) this.f17V).accept(obj);
    }

    public void I(int i, int i8, l lVar) {
        H1.c cVar;
        H1.c cVar2;
        int i9;
        H1.c cVar3;
        long j7;
        int i10;
        int i11;
        int i12;
        int i13 = i;
        int i14 = i8;
        l lVar2 = lVar;
        d dVar = (d) this.f17V;
        SparseArray sparseArray = dVar.f1906c;
        int i15 = 4;
        int i16 = 0;
        int i17 = 1;
        if (i13 == 161 || i13 == 163) {
            int i18 = dVar.f1884I;
            P0.r rVar = dVar.i;
            if (i18 == 0) {
                e eVar = dVar.f1904b;
                dVar.f1890O = (int) eVar.c(lVar2, false, true, 8);
                dVar.f1891P = eVar.f1932c;
                dVar.f1886K = -9223372036854775807L;
                dVar.f1884I = 1;
                rVar.E(0);
            }
            H1.c cVar4 = (H1.c) sparseArray.get(dVar.f1890O);
            if (cVar4 == null) {
                lVar2.m(i14 - dVar.f1891P);
                dVar.f1884I = 0;
                return;
            }
            cVar4.f1845Y.getClass();
            if (dVar.f1884I == 1) {
                dVar.j(lVar2, 3);
                int i19 = (rVar.f3732a[2] & 6) >> 1;
                byte b8 = Pdu.MANUFACTURER_DATA_PDU_TYPE;
                if (i19 == 0) {
                    dVar.f1888M = 1;
                    int[] iArr = dVar.f1889N;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    dVar.f1889N = iArr;
                    iArr[0] = (i14 - dVar.f1891P) - 3;
                } else {
                    dVar.j(lVar2, 4);
                    int i20 = (rVar.f3732a[3] & Pdu.MANUFACTURER_DATA_PDU_TYPE) + 1;
                    dVar.f1888M = i20;
                    int[] iArr2 = dVar.f1889N;
                    if (iArr2 == null) {
                        iArr2 = new int[i20];
                    } else if (iArr2.length < i20) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i20)];
                    }
                    dVar.f1889N = iArr2;
                    if (i19 == 2) {
                        int i21 = dVar.f1888M;
                        Arrays.fill(iArr2, 0, i21, ((i14 - dVar.f1891P) - 4) / i21);
                    } else if (i19 == 1) {
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            i10 = dVar.f1888M - 1;
                            if (i22 >= i10) {
                                break;
                            }
                            dVar.f1889N[i22] = 0;
                            while (true) {
                                i11 = i15 + 1;
                                dVar.j(lVar2, i11);
                                byte b9 = rVar.f3732a[i15] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                                int[] iArr3 = dVar.f1889N;
                                i12 = iArr3[i22] + b9;
                                iArr3[i22] = i12;
                                if (b9 != 255) {
                                    break;
                                }
                                i15 = i11;
                            }
                            i23 += i12;
                            i22++;
                            i15 = i11;
                        }
                        dVar.f1889N[i10] = ((i14 - dVar.f1891P) - i15) - i23;
                    } else if (i19 == 3) {
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            int i26 = dVar.f1888M - i17;
                            if (i24 >= i26) {
                                cVar2 = cVar4;
                                dVar.f1889N[i26] = ((i14 - dVar.f1891P) - i15) - i25;
                                break;
                            }
                            dVar.f1889N[i24] = i16;
                            int i27 = i15 + 1;
                            dVar.j(lVar2, i27);
                            if (rVar.f3732a[i15] != 0) {
                                int i28 = 0;
                                while (true) {
                                    if (i28 >= 8) {
                                        cVar3 = cVar4;
                                        j7 = 0;
                                        i15 = i27;
                                        break;
                                    }
                                    int i29 = i17 << (7 - i28);
                                    if ((rVar.f3732a[i15] & i29) != 0) {
                                        int i30 = i27 + i28;
                                        dVar.j(lVar2, i30);
                                        H1.c cVar5 = cVar4;
                                        j7 = (long) (rVar.f3732a[i15] & b8 & (~i29));
                                        while (i27 < i30) {
                                            j7 = (j7 << 8) | ((long) (rVar.f3732a[i27] & Pdu.MANUFACTURER_DATA_PDU_TYPE));
                                            i27++;
                                            cVar5 = cVar5;
                                        }
                                        cVar3 = cVar5;
                                        if (i24 > 0) {
                                            j7 -= (1 << ((i28 * 7) + 6)) - 1;
                                        }
                                        i15 = i30;
                                    } else {
                                        H1.c cVar6 = cVar4;
                                        i28++;
                                        b8 = Pdu.MANUFACTURER_DATA_PDU_TYPE;
                                        i17 = 1;
                                    }
                                }
                                if (j7 >= -2147483648L && j7 <= 2147483647L) {
                                    int i31 = (int) j7;
                                    int[] iArr4 = dVar.f1889N;
                                    if (i24 != 0) {
                                        i31 += iArr4[i24 - 1];
                                    }
                                    iArr4[i24] = i31;
                                    i25 += i31;
                                    i24++;
                                    cVar4 = cVar3;
                                    b8 = Pdu.MANUFACTURER_DATA_PDU_TYPE;
                                    i16 = 0;
                                    i17 = 1;
                                }
                            } else {
                                throw J.a((RuntimeException) null, "No valid varint length mask found");
                            }
                        }
                        throw J.a((RuntimeException) null, "EBML lacing sample size out of range.");
                    } else {
                        throw J.a((RuntimeException) null, "Unexpected lacing value: " + i19);
                    }
                }
                cVar2 = cVar4;
                byte[] bArr = rVar.f3732a;
                dVar.f1885J = dVar.m((long) ((bArr[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (bArr[0] << 8))) + dVar.f1879D;
                cVar = cVar2;
                if (cVar.f1850d == 2 || (i13 == 163 && (rVar.f3732a[2] & 128) == 128)) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                dVar.f1892Q = i9;
                dVar.f1884I = 2;
                dVar.f1887L = 0;
            } else {
                cVar = cVar4;
            }
            if (i13 == 163) {
                while (true) {
                    int i32 = dVar.f1887L;
                    if (i32 < dVar.f1888M) {
                        dVar.g(cVar, ((long) ((dVar.f1887L * cVar.e) / 1000)) + dVar.f1885J, dVar.f1892Q, dVar.n(lVar2, cVar, dVar.f1889N[i32], false), 0);
                        dVar.f1887L++;
                        cVar = cVar;
                    } else {
                        dVar.f1884I = 0;
                        return;
                    }
                }
            } else {
                H1.c cVar7 = cVar;
                while (true) {
                    int i33 = dVar.f1887L;
                    if (i33 < dVar.f1888M) {
                        int[] iArr5 = dVar.f1889N;
                        iArr5[i33] = dVar.n(lVar2, cVar7, iArr5[i33], true);
                        dVar.f1887L++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i13 != 165) {
            if (i13 == 16877) {
                dVar.d(i13);
                H1.c cVar8 = dVar.f1926w;
                int i34 = cVar8.f1852g;
                if (i34 == 1685485123 || i34 == 1685480259) {
                    byte[] bArr2 = new byte[i14];
                    cVar8.f1835O = bArr2;
                    lVar2.c(bArr2, 0, i14, false);
                    return;
                }
                lVar2.m(i14);
            } else if (i13 == 16981) {
                dVar.d(i13);
                H1.c cVar9 = dVar.f1926w;
                byte[] bArr3 = new byte[i14];
                cVar9.i = bArr3;
                lVar2.c(bArr3, 0, i14, false);
            } else if (i13 == 18402) {
                byte[] bArr4 = new byte[i14];
                lVar2.c(bArr4, 0, i14, false);
                dVar.d(i13);
                dVar.f1926w.f1854j = new F(1, 0, 0, bArr4);
            } else if (i13 == 21419) {
                P0.r rVar2 = dVar.f1914k;
                Arrays.fill(rVar2.f3732a, (byte) 0);
                lVar2.c(rVar2.f3732a, 4 - i14, i14, false);
                rVar2.H(0);
                dVar.f1928y = (int) rVar2.x();
            } else if (i13 == 25506) {
                dVar.d(i13);
                H1.c cVar10 = dVar.f1926w;
                byte[] bArr5 = new byte[i14];
                cVar10.f1855k = bArr5;
                lVar2.c(bArr5, 0, i14, false);
            } else if (i13 == 30322) {
                dVar.d(i13);
                H1.c cVar11 = dVar.f1926w;
                byte[] bArr6 = new byte[i14];
                cVar11.f1867w = bArr6;
                lVar2.c(bArr6, 0, i14, false);
            } else {
                throw J.a((RuntimeException) null, "Unexpected id: " + i13);
            }
        } else if (dVar.f1884I == 2) {
            H1.c cVar12 = (H1.c) sparseArray.get(dVar.f1890O);
            if (dVar.f1893R != 4 || !"V_VP9".equals(cVar12.f1848b)) {
                lVar2.m(i14);
                return;
            }
            P0.r rVar3 = dVar.f1919p;
            rVar3.E(i14);
            lVar2.c(rVar3.f3732a, 0, i14, false);
        }
    }

    public /* synthetic */ Set J() {
        switch (this.f16U) {
            case 1:
                return N.e.n(this);
            default:
                return N.e.n(this);
        }
    }

    public ByteBuffer L() {
        return ((Image.Plane) this.f17V).getBuffer();
    }

    public int O() {
        return ((Image.Plane) this.f17V).getPixelStride();
    }

    public void Q(g gVar) {
        switch (this.f16U) {
            case 1:
                x().Q(gVar);
                return;
            default:
                N.e.b(this, gVar);
                return;
        }
    }

    public int U() {
        return ((Image.Plane) this.f17V).getRowStride();
    }

    public void V() {
        if (((C0053k0) x()).o0(C0065t.f952c, (Object) null) != null) {
            throw new ClassCastException();
        }
    }

    public void W(int i, long j7) {
        d dVar = (d) this.f17V;
        dVar.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        dVar.d(i);
                        dVar.f1926w.f1850d = (int) j7;
                        return;
                    case 136:
                        dVar.d(i);
                        H1.c cVar = dVar.f1926w;
                        if (j7 == 1) {
                            z = true;
                        }
                        cVar.f1843W = z;
                        return;
                    case 155:
                        dVar.f1886K = dVar.m(j7);
                        return;
                    case 159:
                        dVar.d(i);
                        dVar.f1926w.f1836P = (int) j7;
                        return;
                    case 176:
                        dVar.d(i);
                        dVar.f1926w.f1857m = (int) j7;
                        return;
                    case 179:
                        dVar.b(i);
                        dVar.f1880E.i(dVar.m(j7));
                        return;
                    case 186:
                        dVar.d(i);
                        dVar.f1926w.f1858n = (int) j7;
                        return;
                    case 215:
                        dVar.d(i);
                        dVar.f1926w.f1849c = (int) j7;
                        return;
                    case 231:
                        dVar.f1879D = dVar.m(j7);
                        return;
                    case 238:
                        dVar.f1893R = (int) j7;
                        return;
                    case 241:
                        if (!dVar.f1882G) {
                            dVar.b(i);
                            dVar.f1881F.i(j7);
                            dVar.f1882G = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.f1894S = true;
                        return;
                    case 16871:
                        dVar.d(i);
                        dVar.f1926w.f1852g = (int) j7;
                        return;
                    case 16980:
                        if (j7 != 3) {
                            throw J.a((RuntimeException) null, "ContentCompAlgo " + j7 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j7 < 1 || j7 > 2) {
                            throw J.a((RuntimeException) null, "DocTypeReadVersion " + j7 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j7 != 1) {
                            throw J.a((RuntimeException) null, "EBMLReadVersion " + j7 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j7 != 5) {
                            throw J.a((RuntimeException) null, "ContentEncAlgo " + j7 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j7 != 1) {
                            throw J.a((RuntimeException) null, "AESSettingsCipherMode " + j7 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.z = j7 + dVar.f1922s;
                        return;
                    case 21432:
                        int i8 = (int) j7;
                        dVar.d(i);
                        if (i8 == 0) {
                            dVar.f1926w.f1868x = 0;
                            return;
                        } else if (i8 == 1) {
                            dVar.f1926w.f1868x = 2;
                            return;
                        } else if (i8 == 3) {
                            dVar.f1926w.f1868x = 1;
                            return;
                        } else if (i8 == 15) {
                            dVar.f1926w.f1868x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        dVar.d(i);
                        dVar.f1926w.f1860p = (int) j7;
                        return;
                    case 21682:
                        dVar.d(i);
                        dVar.f1926w.f1862r = (int) j7;
                        return;
                    case 21690:
                        dVar.d(i);
                        dVar.f1926w.f1861q = (int) j7;
                        return;
                    case 21930:
                        dVar.d(i);
                        H1.c cVar2 = dVar.f1926w;
                        if (j7 == 1) {
                            z = true;
                        }
                        cVar2.f1842V = z;
                        return;
                    case 21938:
                        dVar.d(i);
                        H1.c cVar3 = dVar.f1926w;
                        cVar3.f1869y = true;
                        cVar3.f1859o = (int) j7;
                        return;
                    case 21998:
                        dVar.d(i);
                        dVar.f1926w.f1851f = (int) j7;
                        return;
                    case 22186:
                        dVar.d(i);
                        dVar.f1926w.f1839S = j7;
                        return;
                    case 22203:
                        dVar.d(i);
                        dVar.f1926w.f1840T = j7;
                        return;
                    case 25188:
                        dVar.d(i);
                        dVar.f1926w.f1837Q = (int) j7;
                        return;
                    case 30114:
                        dVar.f1895T = j7;
                        return;
                    case 30321:
                        dVar.d(i);
                        int i9 = (int) j7;
                        if (i9 == 0) {
                            dVar.f1926w.f1863s = 0;
                            return;
                        } else if (i9 == 1) {
                            dVar.f1926w.f1863s = 1;
                            return;
                        } else if (i9 == 2) {
                            dVar.f1926w.f1863s = 2;
                            return;
                        } else if (i9 == 3) {
                            dVar.f1926w.f1863s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        dVar.d(i);
                        dVar.f1926w.e = (int) j7;
                        return;
                    case 2807729:
                        dVar.f1923t = j7;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                dVar.d(i);
                                int i10 = (int) j7;
                                if (i10 == 1) {
                                    dVar.f1926w.f1822B = 2;
                                    return;
                                } else if (i10 == 2) {
                                    dVar.f1926w.f1822B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                dVar.d(i);
                                int g8 = C0121i.g((int) j7);
                                if (g8 != -1) {
                                    dVar.f1926w.f1821A = g8;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i);
                                dVar.f1926w.f1869y = true;
                                int f8 = C0121i.f((int) j7);
                                if (f8 != -1) {
                                    dVar.f1926w.z = f8;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i);
                                dVar.f1926w.f1823C = (int) j7;
                                return;
                            case 21949:
                                dVar.d(i);
                                dVar.f1926w.f1824D = (int) j7;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j7 != 1) {
                throw J.a((RuntimeException) null, "ContentEncodingScope " + j7 + " not supported");
            }
        } else if (j7 != 0) {
            throw J.a((RuntimeException) null, "ContentEncodingOrder " + j7 + " not supported");
        }
    }

    public /* synthetic */ Object Y(C0036c cVar, D.J j7) {
        int i = this.f16U;
        return N.e.r(this, cVar, j7);
    }

    public void Z() {
        synchronized (((m) this.f17V).f1717h) {
            try {
                m mVar = (m) this.f17V;
                if (mVar.f1712b) {
                    ((Handler) mVar.f1711a).obtainMessage(2131362667).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Throwable th) {
        F.h.m("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    public L3.b apply(Object obj) {
        return i.c(((C1366a) this.f17V).apply(obj));
    }

    public int b() {
        return ((q) this.f17V).b();
    }

    public /* synthetic */ Object b0(C0036c cVar) {
        int i = this.f16U;
        return N.e.p(this, cVar);
    }

    public int c() {
        return ((q) this.f17V).c();
    }

    public void close() {
        ((q) this.f17V).close();
    }

    public Object d() {
        switch (this.f16U) {
            case 10:
                o oVar = (o) this.f17V;
                return new D2.l((p) oVar.f1138W, (q0) oVar.f1139X);
            default:
                s1 s1Var = (s1) this.f17V;
                return new u((G2.e) s1Var.f14070a, (G2.e) s1Var.f14071b, (G2.e) s1Var.f14072c, (G2.e) s1Var.f14073d, (D2.q) s1Var.e, (D2.q) s1Var.f14074f, (q0) s1Var.f14075g);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(java.lang.Object r6, java.io.File r7, B2.i r8) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.lang.String r8 = "StreamEncoder"
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r2 = r5.f17V
            E2.g r2 = (E2.g) r2
            java.lang.Object r0 = r2.d(r1, r0)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037 }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0037 }
        L_0x0019:
            int r7 = r6.read(r0)     // Catch:{ IOException -> 0x0027, all -> 0x0024 }
            r3 = -1
            if (r7 == r3) goto L_0x002a
            r4.write(r0, r1, r7)     // Catch:{ IOException -> 0x0027, all -> 0x0024 }
            goto L_0x0019
        L_0x0024:
            r6 = move-exception
            r3 = r4
            goto L_0x004d
        L_0x0027:
            r6 = move-exception
            r3 = r4
            goto L_0x0038
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x0027, all -> 0x0024 }
            r4.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r2.h(r0)
            r1 = 1
            goto L_0x004c
        L_0x0035:
            r6 = move-exception
            goto L_0x004d
        L_0x0037:
            r6 = move-exception
        L_0x0038:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r7 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r8, r7, r6)     // Catch:{ all -> 0x0035 }
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            r2.h(r0)
        L_0x004c:
            return r1
        L_0x004d:
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r2.h(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.e(java.lang.Object, java.io.File, B2.i):boolean");
    }

    public void f(Object obj) {
        switch (this.f16U) {
            case 3:
                Void voidR = (Void) obj;
                return;
            case 4:
                Void voidR2 = (Void) obj;
                return;
            default:
                Void voidR3 = (Void) obj;
                ((M.f) this.f17V).run();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, H1.c] */
    public void f0(int i, long j7, long j8) {
        d dVar = (d) this.f17V;
        P0.l.k(dVar.f1909d0);
        if (i == 160) {
            dVar.f1894S = false;
            dVar.f1895T = 0;
        } else if (i == 174) {
            ? obj = new Object();
            obj.f1857m = -1;
            obj.f1858n = -1;
            obj.f1859o = -1;
            obj.f1860p = -1;
            obj.f1861q = -1;
            obj.f1862r = 0;
            obj.f1863s = -1;
            obj.f1864t = 0.0f;
            obj.f1865u = 0.0f;
            obj.f1866v = 0.0f;
            obj.f1867w = null;
            obj.f1868x = -1;
            obj.f1869y = false;
            obj.z = -1;
            obj.f1821A = -1;
            obj.f1822B = -1;
            obj.f1823C = 1000;
            obj.f1824D = 200;
            obj.f1825E = -1.0f;
            obj.f1826F = -1.0f;
            obj.f1827G = -1.0f;
            obj.f1828H = -1.0f;
            obj.f1829I = -1.0f;
            obj.f1830J = -1.0f;
            obj.f1831K = -1.0f;
            obj.f1832L = -1.0f;
            obj.f1833M = -1.0f;
            obj.f1834N = -1.0f;
            obj.f1836P = 1;
            obj.f1837Q = -1;
            obj.f1838R = 8000;
            obj.f1839S = 0;
            obj.f1840T = 0;
            obj.f1843W = true;
            obj.f1844X = "eng";
            dVar.f1926w = obj;
        } else if (i == 187) {
            dVar.f1882G = false;
        } else if (i == 19899) {
            dVar.f1928y = -1;
            dVar.z = -1;
        } else if (i == 20533) {
            dVar.d(i);
            dVar.f1926w.f1853h = true;
        } else if (i == 21968) {
            dVar.d(i);
            dVar.f1926w.f1869y = true;
        } else if (i == 408125543) {
            long j9 = dVar.f1922s;
            if (j9 == -1 || j9 == j7) {
                dVar.f1922s = j7;
                dVar.f1921r = j8;
                return;
            }
            throw J.a((RuntimeException) null, "Multiple Segment elements not supported");
        } else if (i == 475249515) {
            dVar.f1880E = new j(2, (byte) 0);
            dVar.f1881F = new j(2, (byte) 0);
        } else if (i != 524531317 || dVar.f1927x) {
        } else {
            if (!dVar.f1908d || dVar.f1877B == -1) {
                dVar.f1909d0.l(new s(dVar.f1925v));
                dVar.f1927x = true;
                return;
            }
            dVar.f1876A = true;
        }
    }

    public /* synthetic */ Set g(C0036c cVar) {
        int i = this.f16U;
        return N.e.g(this, cVar);
    }

    public Object get() {
        return new D4.c((C1214b) ((M5.b) this.f17V).f3175U);
    }

    public Object h(a0.j jVar) {
        boolean z;
        boolean z6;
        switch (this.f16U) {
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                G.d dVar = (G.d) this.f17V;
                if (dVar.f1600V == null) {
                    z = true;
                } else {
                    z = false;
                }
                n2.a.m("The result can only set once!", z);
                dVar.f1600V = jVar;
                return "FutureChain[" + dVar + "]";
            default:
                G.m mVar = (G.m) this.f17V;
                if (mVar.f1624Z == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                n2.a.m("The result can only set once!", z6);
                mVar.f1624Z = jVar;
                return "ListFuture[" + this + "]";
        }
    }

    public Surface j() {
        return ((q) this.f17V).j();
    }

    public /* synthetic */ D.J m(C0036c cVar) {
        int i = this.f16U;
        return N.e.e(this, cVar);
    }

    public H2.q m0(w wVar) {
        return new C0082c(1, (z) this.f17V);
    }

    public W o() {
        return K(((q) this.f17V).o());
    }

    public /* synthetic */ Object o0(C0036c cVar, Object obj) {
        int i = this.f16U;
        return N.e.q(this, cVar, obj);
    }

    public /* synthetic */ boolean q0(C0036c cVar) {
        int i = this.f16U;
        return N.e.a(this, cVar);
    }

    public void s(int i) {
        switch (this.f16U) {
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                F5.c cVar = ((F5.b) this.f17V).f1564n0;
                if (cVar != null) {
                    if (i != 0) {
                        if (i == 1) {
                            cVar.setChildrenEnabled(false);
                            return;
                        } else if (i != 2) {
                            return;
                        }
                    }
                    cVar.setChildrenEnabled(true);
                    return;
                }
                return;
            default:
                SlidingMenu slidingMenu = (SlidingMenu) this.f17V;
                if (i == 0) {
                    int i8 = SlidingMenu.f9511a0;
                    slidingMenu.getClass();
                }
                if (i == 1) {
                    int i9 = SlidingMenu.f9511a0;
                    slidingMenu.getClass();
                }
                if (i == 2) {
                    int i10 = SlidingMenu.f9511a0;
                    slidingMenu.getClass();
                    return;
                }
                return;
        }
    }

    public int t() {
        return ((q) this.f17V).t();
    }

    public K x() {
        switch (this.f16U) {
            case 1:
                return (K) this.f17V;
            default:
                return C0053k0.f919W;
        }
    }

    public void z(Throwable th) {
        switch (this.f16U) {
            case 3:
                ((W) this.f17V).close();
                return;
            case 4:
                ((N) this.f17V).close();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ f(int i, boolean z) {
        this.f16U = i;
    }

    public f(Context context) {
        this.f16U = 15;
        this.f17V = new F2.e(context, 0, false);
    }

    public f(int i) {
        this.f16U = i;
        switch (i) {
            case 27:
                this.f17V = new z(7);
                return;
            case 28:
                this.f17V = new v(500);
                return;
            default:
                this.f17V = new C0038d(new Object());
                return;
        }
    }

    public f(TextView textView) {
        this.f16U = 14;
        this.f17V = new g(textView);
    }

    public f(EditText editText) {
        this.f16U = 13;
        this.f17V = new A1.d(editText);
    }
}
