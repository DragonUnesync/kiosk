package J1;

import D1.e;
import D1.i;
import D1.n;
import H3.O;
import H3.P;
import M0.G;
import M0.H;
import P0.l;
import P0.r;
import Q0.a;
import Q0.d;
import Q0.g;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2456a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i8;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i9 = i + 32;
        if (uuidArr != null) {
            i9 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i9);
        allocate.putInt(i9);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i8 = 16777216;
        } else {
            i8 = 0;
        }
        allocate.putInt(i8);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a b(H h5, String str) {
        int i = 0;
        while (true) {
            G[] gArr = h5.f2837U;
            if (i >= gArr.length) {
                return null;
            }
            G g8 = gArr[i];
            if (g8 instanceof a) {
                a aVar = (a) g8;
                if (aVar.f4009U.equals(str)) {
                    return aVar;
                }
            }
            i++;
        }
    }

    public static boolean c(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        int[] iArr = f2456a;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i) {
                return true;
            }
        }
        return false;
    }

    public static e d(int i, r rVar) {
        int i8 = rVar.i();
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            String r8 = rVar.r(i8 - 16);
            return new e("und", r8, r8);
        }
        l.B("MetadataUtil", "Failed to parse comment attribute: " + d.b(i));
        return null;
    }

    public static D1.a e(r rVar) {
        String str;
        int i = rVar.i();
        if (rVar.i() == 1684108385) {
            int i8 = rVar.i();
            byte[] bArr = f.f2359a;
            int i9 = i8 & 16777215;
            if (i9 == 13) {
                str = "image/jpeg";
            } else if (i9 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                g.u(i9, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            rVar.I(4);
            int i10 = i - 16;
            byte[] bArr2 = new byte[i10];
            rVar.g(bArr2, 0, i10);
            return new D1.a(str, (String) null, 3, bArr2);
        }
        l.B("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static n f(int i, r rVar, String str) {
        int i8 = rVar.i();
        if (rVar.i() == 1684108385 && i8 >= 22) {
            rVar.I(10);
            int B8 = rVar.B();
            if (B8 > 0) {
                String m8 = g.m(B8, "");
                int B9 = rVar.B();
                if (B9 > 0) {
                    m8 = m8 + "/" + B9;
                }
                return new n(str, (String) null, O.r(m8));
            }
        }
        l.B("MetadataUtil", "Failed to parse index/count attribute: " + d.b(i));
        return null;
    }

    public static int g(r rVar) {
        int i = rVar.i();
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            int i8 = i - 16;
            if (i8 == 1) {
                return rVar.v();
            }
            if (i8 == 2) {
                return rVar.B();
            }
            if (i8 == 3) {
                return rVar.y();
            }
            if (i8 == 4 && (rVar.f() & 128) == 0) {
                return rVar.z();
            }
        }
        l.B("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static i h(int i, String str, r rVar, boolean z, boolean z6) {
        int g8 = g(rVar);
        if (z6) {
            g8 = Math.min(1, g8);
        }
        if (g8 < 0) {
            l.B("MetadataUtil", "Failed to parse uint8 attribute: " + d.b(i));
            return null;
        } else if (z) {
            return new n(str, (String) null, O.r(Integer.toString(g8)));
        } else {
            return new e("und", str, Integer.toString(g8));
        }
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, H3.P] */
    public static P i(byte[] bArr) {
        r rVar = new r(bArr);
        if (rVar.f3734c < 32) {
            return null;
        }
        rVar.H(0);
        int a8 = rVar.a();
        int i = rVar.i();
        if (i != a8) {
            l.B("PsshAtomUtil", "Advertised atom size (" + i + ") does not match buffer size: " + a8);
            return null;
        }
        int i8 = rVar.i();
        if (i8 != 1886614376) {
            g.u(i8, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int c8 = f.c(rVar.i());
        if (c8 > 1) {
            g.u(c8, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(rVar.p(), rVar.p());
        if (c8 == 1) {
            int z = rVar.z();
            UUID[] uuidArr = new UUID[z];
            for (int i9 = 0; i9 < z; i9++) {
                uuidArr[i9] = new UUID(rVar.p(), rVar.p());
            }
        }
        int z6 = rVar.z();
        int a9 = rVar.a();
        if (z6 != a9) {
            l.B("PsshAtomUtil", "Atom data size (" + z6 + ") does not match the bytes left: " + a9);
            return null;
        }
        rVar.g(new byte[z6], 0, z6);
        ? obj = new Object();
        obj.f2027U = uuid;
        return obj;
    }

    public static n j(int i, r rVar, String str) {
        int i8 = rVar.i();
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            return new n(str, (String) null, O.r(rVar.r(i8 - 16)));
        }
        l.B("MetadataUtil", "Failed to parse text attribute: " + d.b(i));
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [p1.D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [p1.D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [p1.D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1.D k(p1.p r22, boolean r23, boolean r24) {
        /*
            r0 = r22
            r1 = r24
            r2 = 1
            long r3 = r22.i()
            r5 = 4096(0x1000, double:2.0237E-320)
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0017
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            int r6 = (int) r5
            P0.r r5 = new P0.r
            r10 = 64
            r5.<init>((int) r10)
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0022:
            if (r11 >= r6) goto L_0x00b2
            r14 = 8
            r5.E(r14)
            byte[] r15 = r5.f3732a
            boolean r15 = r0.r(r15, r10, r14, r2)
            if (r15 != 0) goto L_0x0033
            goto L_0x00b2
        L_0x0033:
            long r15 = r5.x()
            int r13 = r5.i()
            r17 = 1
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x0054
            byte[] r15 = r5.f3732a
            r0.v(r15, r14, r14)
            r15 = 16
            r5.G(r15)
            long r17 = r5.p()
            r7 = r17
            r17 = r3
            goto L_0x0070
        L_0x0054:
            r17 = 0
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x006b
            long r17 = r22.i()
            int r19 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r19 == 0) goto L_0x006b
            long r15 = r22.s()
            long r17 = r17 - r15
            long r7 = (long) r14
            long r15 = r17 + r7
        L_0x006b:
            r17 = r3
            r7 = r15
            r15 = 8
        L_0x0070:
            long r2 = (long) r15
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007b
            J1.l r0 = new J1.l
            r0.<init>()
            return r0
        L_0x007b:
            int r11 = r11 + r15
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r13 != r4) goto L_0x0095
            int r2 = (int) r7
            int r6 = r6 + r2
            if (r9 == 0) goto L_0x0092
            long r2 = (long) r6
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x0092
            r2 = r17
            int r6 = (int) r2
        L_0x008d:
            r3 = r2
        L_0x008e:
            r2 = 1
            r7 = -1
            goto L_0x0022
        L_0x0092:
            r2 = r17
            goto L_0x008d
        L_0x0095:
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r13 == r4) goto L_0x009f
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r13 != r4) goto L_0x00a2
        L_0x009f:
            r5 = 1
            goto L_0x012e
        L_0x00a2:
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r13 != r4) goto L_0x00a8
            r12 = 1
        L_0x00a8:
            long r14 = (long) r11
            long r14 = r14 + r7
            long r14 = r14 - r2
            r20 = r5
            long r4 = (long) r6
            int r21 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r21 < 0) goto L_0x00b5
        L_0x00b2:
            r2 = 0
            goto L_0x012f
        L_0x00b5:
            long r7 = r7 - r2
            int r2 = (int) r7
            int r11 = r11 + r2
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r13 != r3) goto L_0x0121
            r3 = 8
            if (r2 >= r3) goto L_0x00c7
            J1.l r0 = new J1.l
            r0.<init>()
            return r0
        L_0x00c7:
            r3 = r20
            r3.E(r2)
            byte[] r4 = r3.f3732a
            r0.v(r4, r10, r2)
            int r2 = r3.i()
            boolean r2 = c(r2, r1)
            if (r2 == 0) goto L_0x00dc
            r12 = 1
        L_0x00dc:
            r2 = 4
            r3.I(r2)
            int r4 = r3.a()
            int r4 = r4 / r2
            if (r12 != 0) goto L_0x0102
            if (r4 <= 0) goto L_0x0102
            int[] r13 = new int[r4]
            r2 = 0
        L_0x00ec:
            if (r2 >= r4) goto L_0x0100
            int r5 = r3.i()
            r13[r2] = r5
            boolean r5 = c(r5, r1)
            if (r5 == 0) goto L_0x00fd
            r5 = 1
            r12 = 1
            goto L_0x0104
        L_0x00fd:
            r5 = 1
            int r2 = r2 + r5
            goto L_0x00ec
        L_0x0100:
            r5 = 1
            goto L_0x0104
        L_0x0102:
            r5 = 1
            r13 = 0
        L_0x0104:
            if (r12 != 0) goto L_0x0129
            J1.l r0 = new J1.l
            r0.<init>()
            if (r13 == 0) goto L_0x011e
            int r1 = K3.a.f2657W
            int r1 = r13.length
            if (r1 != 0) goto L_0x0113
            goto L_0x0120
        L_0x0113:
            K3.a r1 = new K3.a
            int r2 = r13.length
            int[] r2 = java.util.Arrays.copyOf(r13, r2)
            r1.<init>(r2)
            goto L_0x0120
        L_0x011e:
            int r1 = K3.a.f2657W
        L_0x0120:
            return r0
        L_0x0121:
            r3 = r20
            r5 = 1
            if (r2 == 0) goto L_0x0129
            r0.w(r2)
        L_0x0129:
            r5 = r3
            r3 = r17
            goto L_0x008e
        L_0x012e:
            r2 = 1
        L_0x012f:
            if (r12 != 0) goto L_0x0134
            J1.l r0 = J1.l.f2416c
            return r0
        L_0x0134:
            r0 = r23
            if (r0 == r2) goto L_0x0140
            if (r2 == 0) goto L_0x013d
            J1.l r0 = J1.l.f2414a
            goto L_0x013f
        L_0x013d:
            J1.l r0 = J1.l.f2415b
        L_0x013f:
            return r0
        L_0x0140:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.q.k(p1.p, boolean, boolean):p1.D");
    }
}
