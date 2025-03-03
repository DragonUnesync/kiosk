package D1;

import H3.L;
import H3.O;
import H3.i0;
import M0.H;
import M0.I;
import N1.f;
import P0.r;
import P0.z;
import Q7.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.altbeacon.bluetooth.Pdu;
import y1.C1625a;

public final class h extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final B7.g f1007b = new B7.g(3);

    /* renamed from: a  reason: collision with root package name */
    public final B7.g f1008a;

    public h(B7.g gVar) {
        this.f1008a = gVar;
    }

    public static a I(r rVar, int i, int i8) {
        int i9;
        String str;
        byte[] bArr;
        int v4 = rVar.v();
        Charset X3 = X(v4);
        int i10 = i - 1;
        byte[] bArr2 = new byte[i10];
        rVar.g(bArr2, 0, i10);
        if (i8 == 2) {
            str = "image/" + F.h.E(new String(bArr2, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i9 = 2;
        } else {
            i9 = a0(0, bArr2);
            String E8 = F.h.E(new String(bArr2, 0, i9, StandardCharsets.ISO_8859_1));
            if (E8.indexOf(47) == -1) {
                str = "image/".concat(E8);
            } else {
                str = E8;
            }
        }
        byte b8 = bArr2[i9 + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        int i11 = i9 + 2;
        int Z7 = Z(bArr2, i11, v4);
        String str2 = new String(bArr2, i11, Z7 - i11, X3);
        int W7 = W(v4) + Z7;
        if (i10 <= W7) {
            bArr = z.f3752f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, W7, i10);
        }
        return new a(str, str2, b8, bArr);
    }

    public static c J(r rVar, int i, int i8, boolean z, int i9, B7.g gVar) {
        long j7;
        long j8;
        r rVar2 = rVar;
        int i10 = rVar2.f3733b;
        int a02 = a0(i10, rVar2.f3732a);
        String str = new String(rVar2.f3732a, i10, a02 - i10, StandardCharsets.ISO_8859_1);
        rVar.H(a02 + 1);
        int i11 = rVar.i();
        int i12 = rVar.i();
        long x8 = rVar.x();
        if (x8 == 4294967295L) {
            j7 = -1;
        } else {
            j7 = x8;
        }
        long x9 = rVar.x();
        if (x9 == 4294967295L) {
            j8 = -1;
        } else {
            j8 = x9;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i;
        while (rVar2.f3733b < i13) {
            i M6 = M(i8, rVar, z, i9, gVar);
            if (M6 != null) {
                arrayList.add(M6);
            }
        }
        return new c(str, i11, i12, j7, j8, (i[]) arrayList.toArray(new i[0]));
    }

    public static d K(r rVar, int i, int i8, boolean z, int i9, B7.g gVar) {
        boolean z6;
        boolean z8;
        r rVar2 = rVar;
        int i10 = rVar2.f3733b;
        int a02 = a0(i10, rVar2.f3732a);
        String str = new String(rVar2.f3732a, i10, a02 - i10, StandardCharsets.ISO_8859_1);
        rVar2.H(a02 + 1);
        int v4 = rVar.v();
        if ((v4 & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((v4 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int v8 = rVar.v();
        String[] strArr = new String[v8];
        for (int i11 = 0; i11 < v8; i11++) {
            int i12 = rVar2.f3733b;
            int a03 = a0(i12, rVar2.f3732a);
            strArr[i11] = new String(rVar2.f3732a, i12, a03 - i12, StandardCharsets.ISO_8859_1);
            rVar2.H(a03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i;
        while (rVar2.f3733b < i13) {
            i M6 = M(i8, rVar2, z, i9, gVar);
            if (M6 != null) {
                arrayList.add(M6);
            }
        }
        return new d(str, z6, z8, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e L(int i, r rVar) {
        if (i < 4) {
            return null;
        }
        int v4 = rVar.v();
        Charset X3 = X(v4);
        byte[] bArr = new byte[3];
        rVar.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i - 4;
        byte[] bArr2 = new byte[i8];
        rVar.g(bArr2, 0, i8);
        int Z7 = Z(bArr2, 0, v4);
        String str2 = new String(bArr2, 0, Z7, X3);
        int W7 = W(v4) + Z7;
        return new e(str, str2, Q(bArr2, W7, Z(bArr2, W7, v4), X3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0199, code lost:
        if (r12 == 67) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01cf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0213, code lost:
        r8.H(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0216, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:103:0x0123, B:164:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x012a A[Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }, ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }]), Splitter:B:103:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static D1.i M(int r18, P0.r r19, boolean r20, int r21, B7.g r22) {
        /*
            r7 = r18
            r8 = r19
            r0 = r22
            int r9 = r19.v()
            int r10 = r19.v()
            int r11 = r19.v()
            r2 = 3
            if (r7 < r2) goto L_0x001b
            int r3 = r19.v()
            r12 = r3
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            r3 = 4
            if (r7 != r3) goto L_0x003d
            int r4 = r19.z()
            if (r20 != 0) goto L_0x0048
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 7
            r5 = r5 | r6
            int r6 = r4 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 14
            r5 = r5 | r6
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 21
            r4 = r4 | r5
            goto L_0x0048
        L_0x003d:
            if (r7 != r2) goto L_0x0044
            int r4 = r19.z()
            goto L_0x0048
        L_0x0044:
            int r4 = r19.y()
        L_0x0048:
            if (r7 < r2) goto L_0x004f
            int r5 = r19.B()
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r13 = 0
            if (r9 != 0) goto L_0x0063
            if (r10 != 0) goto L_0x0063
            if (r11 != 0) goto L_0x0063
            if (r12 != 0) goto L_0x0063
            if (r4 != 0) goto L_0x0063
            if (r5 != 0) goto L_0x0063
            int r0 = r8.f3734c
            r8.H(r0)
            return r13
        L_0x0063:
            int r6 = r8.f3733b
            int r14 = r6 + r4
            int r6 = r8.f3734c
            java.lang.String r15 = "Id3Decoder"
            if (r14 <= r6) goto L_0x0078
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            P0.l.B(r15, r0)
            int r0 = r8.f3734c
            r8.H(r0)
            return r13
        L_0x0078:
            if (r0 == 0) goto L_0x00a7
            int r6 = r0.f474U
            switch(r6) {
                case 3: goto L_0x00a0;
                default: goto L_0x007f;
            }
        L_0x007f:
            r6 = 67
            r1 = 2
            r3 = 77
            if (r9 != r6) goto L_0x0090
            r6 = 79
            if (r10 != r6) goto L_0x0090
            if (r11 != r3) goto L_0x0090
            if (r12 == r3) goto L_0x009e
            if (r7 == r1) goto L_0x009e
        L_0x0090:
            if (r9 != r3) goto L_0x00a0
            r3 = 76
            if (r10 != r3) goto L_0x00a0
            if (r11 != r3) goto L_0x00a0
            r3 = 84
            if (r12 == r3) goto L_0x009e
            if (r7 != r1) goto L_0x00a0
        L_0x009e:
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 != 0) goto L_0x00a7
            r8.H(r14)
            return r13
        L_0x00a7:
            r1 = 1
            if (r7 != r2) goto L_0x00c4
            r2 = r5 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00b0
            r2 = 1
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            r3 = r5 & 64
            if (r3 == 0) goto L_0x00b7
            r3 = 1
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            r5 = r5 & 32
            if (r5 == 0) goto L_0x00be
            r5 = 1
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            r6 = r5
            r16 = 0
            r5 = r2
            goto L_0x00f8
        L_0x00c4:
            r2 = 4
            if (r7 != r2) goto L_0x00f2
            r2 = r5 & 64
            if (r2 == 0) goto L_0x00cd
            r2 = 1
            goto L_0x00ce
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            r3 = r5 & 8
            if (r3 == 0) goto L_0x00d4
            r3 = 1
            goto L_0x00d5
        L_0x00d4:
            r3 = 0
        L_0x00d5:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x00db
            r6 = 1
            goto L_0x00dc
        L_0x00db:
            r6 = 0
        L_0x00dc:
            r16 = r5 & 2
            if (r16 == 0) goto L_0x00e3
            r16 = 1
            goto L_0x00e5
        L_0x00e3:
            r16 = 0
        L_0x00e5:
            r5 = r5 & r1
            if (r5 == 0) goto L_0x00ea
            r5 = 1
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r17 = r6
            r6 = r2
            r2 = r3
            r3 = r17
            goto L_0x00f8
        L_0x00f2:
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r16 = 0
        L_0x00f8:
            if (r2 != 0) goto L_0x023c
            if (r3 == 0) goto L_0x00fe
            goto L_0x023c
        L_0x00fe:
            if (r6 == 0) goto L_0x0105
            int r4 = r4 + -1
            r8.I(r1)
        L_0x0105:
            if (r5 == 0) goto L_0x010d
            int r4 = r4 + -4
            r1 = 4
            r8.I(r1)
        L_0x010d:
            if (r16 == 0) goto L_0x0113
            int r4 = b0(r4, r8)
        L_0x0113:
            r6 = r4
            r1 = 2
            r2 = 84
            r3 = 88
            if (r9 != r2) goto L_0x0133
            if (r10 != r3) goto L_0x0133
            if (r11 != r3) goto L_0x0133
            if (r7 == r1) goto L_0x0123
            if (r12 != r3) goto L_0x0133
        L_0x0123:
            D1.n r0 = T(r6, r8)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
        L_0x0127:
            r13 = r6
            goto L_0x020e
        L_0x012a:
            r0 = move-exception
            goto L_0x0213
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            r13 = r6
            goto L_0x0217
        L_0x0131:
            r0 = move-exception
            goto L_0x012e
        L_0x0133:
            if (r9 != r2) goto L_0x013e
            java.lang.String r0 = Y(r7, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            D1.n r0 = R(r6, r8, r0)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x013e:
            r4 = 87
            if (r9 != r4) goto L_0x014f
            if (r10 != r3) goto L_0x014f
            if (r11 != r3) goto L_0x014f
            if (r7 == r1) goto L_0x014a
            if (r12 != r3) goto L_0x014f
        L_0x014a:
            D1.o r0 = V(r6, r8)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x014f:
            if (r9 != r4) goto L_0x015a
            java.lang.String r0 = Y(r7, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            D1.o r0 = U(r6, r8, r0)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x015a:
            r3 = 73
            r4 = 80
            if (r9 != r4) goto L_0x016f
            r5 = 82
            if (r10 != r5) goto L_0x016f
            if (r11 != r3) goto L_0x016f
            r5 = 86
            if (r12 != r5) goto L_0x016f
            D1.m r0 = P(r6, r8)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x016f:
            r5 = 71
            r13 = 79
            if (r9 != r5) goto L_0x0186
            r5 = 69
            if (r10 != r5) goto L_0x0186
            if (r11 != r13) goto L_0x0186
            r5 = 66
            if (r12 == r5) goto L_0x0181
            if (r7 != r1) goto L_0x0186
        L_0x0181:
            D1.f r0 = N(r6, r8)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x0186:
            r5 = 65
            r2 = 67
            if (r7 != r1) goto L_0x0193
            if (r9 != r4) goto L_0x01a0
            if (r10 != r3) goto L_0x01a0
            if (r11 != r2) goto L_0x01a0
            goto L_0x019b
        L_0x0193:
            if (r9 != r5) goto L_0x01a0
            if (r10 != r4) goto L_0x01a0
            if (r11 != r3) goto L_0x01a0
            if (r12 != r2) goto L_0x01a0
        L_0x019b:
            D1.a r0 = I(r8, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x01a0:
            r3 = 77
            if (r9 != r2) goto L_0x01b2
            if (r10 != r13) goto L_0x01b2
            if (r11 != r3) goto L_0x01b2
            if (r12 == r3) goto L_0x01ac
            if (r7 != r1) goto L_0x01b2
        L_0x01ac:
            D1.e r0 = L(r6, r8)     // Catch:{ OutOfMemoryError -> 0x0131, Exception -> 0x012d, all -> 0x012a }
            goto L_0x0127
        L_0x01b2:
            if (r9 != r2) goto L_0x01d1
            r1 = 72
            if (r10 != r1) goto L_0x01d1
            if (r11 != r5) goto L_0x01d1
            if (r12 != r4) goto L_0x01d1
            r1 = r19
            r2 = r6
            r3 = r18
            r4 = r20
            r5 = r21
            r13 = r6
            r6 = r22
            D1.c r0 = J(r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            goto L_0x020e
        L_0x01cd:
            r0 = move-exception
            goto L_0x0217
        L_0x01cf:
            r0 = move-exception
            goto L_0x0217
        L_0x01d1:
            if (r9 != r2) goto L_0x01ec
            r1 = 84
            if (r10 != r1) goto L_0x01ec
            if (r11 != r13) goto L_0x01ec
            if (r12 != r2) goto L_0x01ec
            r1 = r19
            r2 = r6
            r3 = r18
            r4 = r20
            r5 = r21
            r13 = r6
            r6 = r22
            D1.d r0 = K(r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            goto L_0x020e
        L_0x01ec:
            r13 = r6
            if (r9 != r3) goto L_0x01fe
            r0 = 76
            if (r10 != r0) goto L_0x01fe
            if (r11 != r0) goto L_0x01fe
            r0 = 84
            if (r12 != r0) goto L_0x01fe
            D1.l r0 = O(r13, r8)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            goto L_0x020e
        L_0x01fe:
            java.lang.String r0 = Y(r7, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            byte[] r1 = new byte[r13]     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            r2 = 0
            r8.g(r1, r2, r13)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            D1.b r2 = new D1.b     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            r2.<init>(r0, r1)     // Catch:{ OutOfMemoryError -> 0x01cf, Exception -> 0x01cd, all -> 0x012a }
            r0 = r2
        L_0x020e:
            r8.H(r14)
            r1 = 0
            goto L_0x021c
        L_0x0213:
            r8.H(r14)
            throw r0
        L_0x0217:
            r8.H(r14)
            r1 = r0
            r0 = 0
        L_0x021c:
            if (r0 != 0) goto L_0x023b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to decode frame: id="
            r2.<init>(r3)
            java.lang.String r3 = Y(r7, r9, r10, r11, r12)
            r2.append(r3)
            java.lang.String r3 = ", frameSize="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            P0.l.C(r15, r2, r1)
        L_0x023b:
            return r0
        L_0x023c:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            P0.l.B(r15, r0)
            r8.H(r14)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.h.M(int, P0.r, boolean, int, B7.g):D1.i");
    }

    public static f N(int i, r rVar) {
        byte[] bArr;
        int v4 = rVar.v();
        Charset X3 = X(v4);
        int i8 = i - 1;
        byte[] bArr2 = new byte[i8];
        rVar.g(bArr2, 0, i8);
        int a02 = a0(0, bArr2);
        String o2 = I.o(new String(bArr2, 0, a02, StandardCharsets.ISO_8859_1));
        int i9 = a02 + 1;
        int Z7 = Z(bArr2, i9, v4);
        String Q2 = Q(bArr2, i9, Z7, X3);
        int W7 = W(v4) + Z7;
        int Z8 = Z(bArr2, W7, v4);
        String Q6 = Q(bArr2, W7, Z8, X3);
        int W8 = W(v4) + Z8;
        if (i8 <= W8) {
            bArr = z.f3752f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, W8, i8);
        }
        return new f(o2, Q2, Q6, bArr);
    }

    public static l O(int i, r rVar) {
        int B8 = rVar.B();
        int y8 = rVar.y();
        int y9 = rVar.y();
        int v4 = rVar.v();
        int v8 = rVar.v();
        f fVar = new f();
        fVar.q(rVar);
        int i8 = ((i - 10) * 8) / (v4 + v8);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = fVar.i(v4);
            int i11 = fVar.i(v8);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new l(B8, y8, iArr, iArr2, y9);
    }

    public static m P(int i, r rVar) {
        byte[] bArr;
        byte[] bArr2 = new byte[i];
        rVar.g(bArr2, 0, i);
        int a02 = a0(0, bArr2);
        String str = new String(bArr2, 0, a02, StandardCharsets.ISO_8859_1);
        int i8 = a02 + 1;
        if (i <= i8) {
            bArr = z.f3752f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, i8, i);
        }
        return new m(str, bArr);
    }

    public static String Q(byte[] bArr, int i, int i8, Charset charset) {
        if (i8 <= i || i8 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i8 - i, charset);
    }

    public static n R(int i, r rVar, String str) {
        if (i < 1) {
            return null;
        }
        int v4 = rVar.v();
        int i8 = i - 1;
        byte[] bArr = new byte[i8];
        rVar.g(bArr, 0, i8);
        return new n(str, (String) null, S(bArr, v4, 0));
    }

    public static i0 S(byte[] bArr, int i, int i8) {
        if (i8 >= bArr.length) {
            return O.r("");
        }
        L j7 = O.j();
        int Z7 = Z(bArr, i8, i);
        while (i8 < Z7) {
            j7.a(new String(bArr, i8, Z7 - i8, X(i)));
            i8 = W(i) + Z7;
            Z7 = Z(bArr, i8, i);
        }
        i0 g8 = j7.g();
        if (g8.isEmpty()) {
            return O.r("");
        }
        return g8;
    }

    public static n T(int i, r rVar) {
        if (i < 1) {
            return null;
        }
        int v4 = rVar.v();
        int i8 = i - 1;
        byte[] bArr = new byte[i8];
        rVar.g(bArr, 0, i8);
        int Z7 = Z(bArr, 0, v4);
        return new n("TXXX", new String(bArr, 0, Z7, X(v4)), S(bArr, v4, W(v4) + Z7));
    }

    public static o U(int i, r rVar, String str) {
        byte[] bArr = new byte[i];
        rVar.g(bArr, 0, i);
        return new o(str, (String) null, new String(bArr, 0, a0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o V(int i, r rVar) {
        if (i < 1) {
            return null;
        }
        int v4 = rVar.v();
        int i8 = i - 1;
        byte[] bArr = new byte[i8];
        rVar.g(bArr, 0, i8);
        int Z7 = Z(bArr, 0, v4);
        String str = new String(bArr, 0, Z7, X(v4));
        int W7 = W(v4) + Z7;
        return new o("WXXX", str, Q(bArr, W7, a0(W7, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int W(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static Charset X(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i != 3) {
            return StandardCharsets.ISO_8859_1;
        }
        return StandardCharsets.UTF_8;
    }

    public static String Y(int i, int i8, int i9, int i10, int i11) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    public static int Z(byte[] bArr, int i, int i8) {
        int a02 = a0(i, bArr);
        if (i8 == 0 || i8 == 3) {
            return a02;
        }
        while (a02 < bArr.length - 1) {
            if ((a02 - i) % 2 == 0 && bArr[a02 + 1] == 0) {
                return a02;
            }
            a02 = a0(a02 + 1, bArr);
        }
        return bArr.length;
    }

    public static int a0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int b0(int i, r rVar) {
        byte[] bArr = rVar.f3732a;
        int i8 = rVar.f3733b;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i8 + i) {
                return i;
            }
            if ((bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i - (i9 - i8)) - 2);
                i--;
            }
            i9 = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((r10 & 1) != 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c0(P0.r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f3733b
        L_0x0006:
            int r3 = r18.a()     // Catch:{ all -> 0x0020 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00aa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0023
            int r7 = r18.i()     // Catch:{ all -> 0x0020 }
            long r8 = r18.x()     // Catch:{ all -> 0x0020 }
            int r10 = r18.B()     // Catch:{ all -> 0x0020 }
            goto L_0x002d
        L_0x0020:
            r0 = move-exception
            goto L_0x00ae
        L_0x0023:
            int r7 = r18.y()     // Catch:{ all -> 0x0020 }
            int r8 = r18.y()     // Catch:{ all -> 0x0020 }
            long r8 = (long) r8
            r10 = 0
        L_0x002d:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 != 0) goto L_0x003b
            r1.H(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006c
            if (r21 != 0) goto L_0x006c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004c
            r1.H(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006c:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0074
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0088:
            r3 = 0
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.H(r2)
            return r6
        L_0x0097:
            int r3 = r18.a()     // Catch:{ all -> 0x0020 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            r1.H(r2)
            return r6
        L_0x00a4:
            int r3 = (int) r8
            r1.I(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0006
        L_0x00aa:
            r1.H(r2)
            return r4
        L_0x00ae:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.h.c0(P0.r, int, int, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M0.H H(int r13, byte[] r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            r2 = 4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            P0.r r4 = new P0.r
            r4.<init>(r13, r14)
            int r13 = r4.a()
            r14 = 2
            java.lang.String r5 = "Id3Decoder"
            r6 = 10
            r7 = 0
            if (r13 >= r6) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            P0.l.B(r5, r13)
        L_0x001e:
            r10 = r7
            goto L_0x0099
        L_0x0021:
            int r13 = r4.y()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x0042
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r1] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r8)
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r13 = r8.concat(r13)
            P0.l.B(r5, r13)
            goto L_0x001e
        L_0x0042:
            int r13 = r4.v()
            r4.I(r0)
            int r8 = r4.v()
            int r9 = r4.u()
            if (r13 != r14) goto L_0x005d
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0084
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            P0.l.B(r5, r13)
            goto L_0x001e
        L_0x005d:
            r10 = 3
            if (r13 != r10) goto L_0x006e
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0084
            int r10 = r4.i()
            r4.I(r10)
            int r10 = r10 + r2
            int r9 = r9 - r10
            goto L_0x0084
        L_0x006e:
            if (r13 != r2) goto L_0x0093
            r10 = r8 & 64
            if (r10 == 0) goto L_0x007e
            int r10 = r4.u()
            int r11 = r10 + -4
            r4.I(r11)
            int r9 = r9 - r10
        L_0x007e:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x0084
            int r9 = r9 + -10
        L_0x0084:
            if (r13 >= r2) goto L_0x008c
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x008c
            r8 = 1
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            D1.g r10 = new D1.g
            r10.<init>(r13, r9, r8)
            goto L_0x0099
        L_0x0093:
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            Q0.g.u(r13, r8, r5)
            goto L_0x001e
        L_0x0099:
            if (r10 != 0) goto L_0x009c
            return r7
        L_0x009c:
            int r13 = r4.f3733b
            int r8 = r10.f1004a
            if (r8 != r14) goto L_0x00a3
            r6 = 6
        L_0x00a3:
            boolean r14 = r10.f1005b
            int r9 = r10.f1006c
            if (r14 == 0) goto L_0x00ad
            int r9 = b0(r9, r4)
        L_0x00ad:
            int r13 = r13 + r9
            r4.G(r13)
            boolean r13 = c0(r4, r8, r6, r1)
            if (r13 != 0) goto L_0x00c6
            if (r8 != r2) goto L_0x00c0
            boolean r13 = c0(r4, r2, r6, r0)
            if (r13 == 0) goto L_0x00c0
            goto L_0x00c7
        L_0x00c0:
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            Q0.g.u(r8, r13, r5)
            return r7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            int r13 = r4.a()
            if (r13 < r6) goto L_0x00d9
            B7.g r13 = r12.f1008a
            D1.i r13 = M(r8, r4, r0, r6, r13)
            if (r13 == 0) goto L_0x00c7
            r3.add(r13)
            goto L_0x00c7
        L_0x00d9:
            M0.H r13 = new M0.H
            r13.<init>((java.util.List) r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.h.H(int, byte[]):M0.H");
    }

    public final H q(C1625a aVar, ByteBuffer byteBuffer) {
        return H(byteBuffer.limit(), byteBuffer.array());
    }
}
