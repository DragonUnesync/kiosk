package l7;

import P6.f;
import W6.a;
import com.bumptech.glide.d;
import java.io.Serializable;
import java.util.Arrays;
import m7.C1219b;

public class i implements Serializable, Comparable {

    /* renamed from: X  reason: collision with root package name */
    public static final i f13217X = new i(new byte[0]);

    /* renamed from: U  reason: collision with root package name */
    public final byte[] f13218U;

    /* renamed from: V  reason: collision with root package name */
    public transient int f13219V;

    /* renamed from: W  reason: collision with root package name */
    public transient String f13220W;

    public i(byte[] bArr) {
        f.e(bArr, "data");
        this.f13218U = bArr;
    }

    public int a() {
        return this.f13218U.length;
    }

    public String b() {
        byte[] bArr = this.f13218U;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b8 : bArr) {
            int i8 = i + 1;
            char[] cArr2 = C1219b.f13389a;
            cArr[i] = cArr2[(b8 >> 4) & 15];
            i += 2;
            cArr[i8] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f13218U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            l7.i r10 = (l7.i) r10
            java.lang.String r0 = "other"
            P6.f.e(r10, r0)
            int r0 = r9.a()
            int r1 = r10.a()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0015:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x0030
            byte r7 = r9.d(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.d(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x002a
            int r4 = r4 + 1
            goto L_0x0015
        L_0x002a:
            if (r7 >= r8) goto L_0x002e
        L_0x002c:
            r3 = -1
            goto L_0x0036
        L_0x002e:
            r3 = 1
            goto L_0x0036
        L_0x0030:
            if (r0 != r1) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            if (r0 >= r1) goto L_0x002e
            goto L_0x002c
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.i.compareTo(java.lang.Object):int");
    }

    public byte d(int i) {
        return this.f13218U[i];
    }

    public boolean e(int i, int i8, int i9, byte[] bArr) {
        f.e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f13218U;
            if (i > bArr2.length - i9 || i8 < 0 || i8 > bArr.length - i9 || !d.b(bArr2, i, bArr, i8, i9)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int a8 = iVar.a();
            byte[] bArr = this.f13218U;
            if (a8 != bArr.length || !iVar.e(0, 0, bArr.length, bArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean f(i iVar, int i) {
        f.e(iVar, "other");
        return iVar.e(0, 0, i, this.f13218U);
    }

    public i g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f13218U;
            if (i >= bArr.length) {
                return this;
            }
            byte b8 = bArr[i];
            if (b8 < 65 || b8 > 90) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                f.d(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b8 + 32);
                for (int i8 = i + 1; i8 < copyOf.length; i8++) {
                    byte b9 = copyOf[i8];
                    if (b9 >= 65 && b9 <= 90) {
                        copyOf[i8] = (byte) (b9 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
    }

    public final String h() {
        String str = this.f13220W;
        if (str != null) {
            return str;
        }
        byte[] c8 = c();
        f.e(c8, "<this>");
        String str2 = new String(c8, a.f6191a);
        this.f13220W = str2;
        return str2;
    }

    public int hashCode() {
        int i = this.f13219V;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f13218U);
        this.f13219V = hashCode;
        return hashCode;
    }

    public void i(f fVar, int i) {
        f.e(fVar, "buffer");
        fVar.x(this.f13218U, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0124, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0130, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015c, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0163, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016a, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x019b, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x019e, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a1, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a4, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008b, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b6, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e8, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f0, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0120, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f13218U
            int r2 = r1.length
            if (r2 != 0) goto L_0x000b
            java.lang.String r1 = "[size=0]"
            goto L_0x0275
        L_0x000b:
            int r2 = r1.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000f:
            r8 = 64
            if (r4 >= r2) goto L_0x01a6
            byte r9 = r1[r4]
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 160(0xa0, float:2.24E-43)
            r14 = 127(0x7f, float:1.78E-43)
            r15 = 32
            r10 = 13
            r11 = 10
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r9 < 0) goto L_0x006f
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x002c
            goto L_0x01a6
        L_0x002c:
            if (r9 == r11) goto L_0x003a
            if (r9 == r10) goto L_0x003a
            if (r9 < 0) goto L_0x0035
            if (r9 >= r15) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            if (r14 > r9) goto L_0x003a
            if (r9 >= r13) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r9 != r12) goto L_0x003f
        L_0x003c:
            r5 = -1
            goto L_0x01a6
        L_0x003f:
            if (r9 >= r3) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 2
        L_0x0044:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0047:
            r6 = r16
            if (r4 >= r2) goto L_0x000f
            byte r9 = r1[r4]
            if (r9 < 0) goto L_0x000f
            int r4 = r4 + 1
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x0057
            goto L_0x01a6
        L_0x0057:
            if (r9 == r11) goto L_0x0065
            if (r9 == r10) goto L_0x0065
            if (r9 < 0) goto L_0x0060
            if (r9 >= r15) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            if (r14 > r9) goto L_0x0065
            if (r9 >= r13) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            if (r9 != r12) goto L_0x0068
        L_0x0067:
            goto L_0x003c
        L_0x0068:
            if (r9 >= r3) goto L_0x006c
            r6 = 1
            goto L_0x006d
        L_0x006c:
            r6 = 2
        L_0x006d:
            int r5 = r5 + r6
            goto L_0x0047
        L_0x006f:
            int r7 = r9 >> 5
            r3 = -2
            r12 = 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x00ba
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x007e
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x007e:
            byte r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r12) goto L_0x00b6
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r12) goto L_0x008f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x008f:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0095
            goto L_0x01a6
        L_0x0095:
            if (r3 == r11) goto L_0x00a3
            if (r3 == r10) goto L_0x00a3
            if (r3 < 0) goto L_0x009e
            if (r3 >= r15) goto L_0x009e
            goto L_0x00a8
        L_0x009e:
            if (r14 > r3) goto L_0x00a3
            if (r3 >= r13) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x00a9
        L_0x00a8:
            goto L_0x003c
        L_0x00a9:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00af
            r10 = 1
            goto L_0x00b0
        L_0x00af:
            r10 = 2
        L_0x00b0:
            int r5 = r5 + r10
            int r4 = r4 + 2
        L_0x00b3:
            r6 = r7
            goto L_0x000f
        L_0x00b6:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00ba:
            int r7 = r9 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r7 != r3) goto L_0x0128
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00cc
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00cc:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0124
            byte r3 = r1[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0120
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r12
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x00ec
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00ec:
            if (r14 > r3) goto L_0x00f4
            if (r3 >= r13) goto L_0x00f4
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00f4:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x00fa
            goto L_0x01a6
        L_0x00fa:
            if (r3 == r11) goto L_0x010e
            if (r3 == r10) goto L_0x010e
            if (r3 < 0) goto L_0x0105
            r6 = 32
            if (r3 >= r6) goto L_0x0105
            goto L_0x0113
        L_0x0105:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x010e
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x010e
            goto L_0x0113
        L_0x010e:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0115
        L_0x0113:
            goto L_0x003c
        L_0x0115:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x011b
            r10 = 1
            goto L_0x011c
        L_0x011b:
            r10 = 2
        L_0x011c:
            int r5 = r5 + r10
            int r4 = r4 + 3
            goto L_0x00b3
        L_0x0120:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0124:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0128:
            int r7 = r9 >> 3
            if (r7 != r3) goto L_0x01a4
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0134
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0134:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x01a1
            int r15 = r4 + 2
            byte r15 = r1[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x019e
            byte r3 = r1[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x019b
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x015f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x015f:
            if (r14 > r3) goto L_0x0166
            if (r3 >= r13) goto L_0x0166
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0166:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x016d
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x016d:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0172
            goto L_0x01a6
        L_0x0172:
            if (r3 == r11) goto L_0x0188
            r6 = 13
            if (r3 == r6) goto L_0x0188
            if (r3 < 0) goto L_0x017f
            r6 = 32
            if (r3 >= r6) goto L_0x017f
            goto L_0x018d
        L_0x017f:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x0188
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x018f
        L_0x018d:
            goto L_0x003c
        L_0x018f:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0195
            r10 = 1
            goto L_0x0196
        L_0x0195:
            r10 = 2
        L_0x0196:
            int r5 = r5 + r10
            int r4 = r4 + 4
            goto L_0x00b3
        L_0x019b:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x019e:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x01a1:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x01a4:
            if (r6 != r8) goto L_0x003c
        L_0x01a6:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L_0x021f
            int r5 = r1.length
            if (r5 > r8) goto L_0x01c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r2 = r17.b()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x0275
        L_0x01c9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L_0x0201
            int r3 = r1.length
            if (r8 != r3) goto L_0x01df
            r3 = r0
            goto L_0x01f2
        L_0x01df:
            l7.i r3 = new l7.i
            int r5 = r1.length
            E.e.g(r8, r5)
            r5 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r8)
            java.lang.String r5 = "copyOfRange(...)"
            P6.f.d(r1, r5)
            r3.<init>(r1)
        L_0x01f2:
            java.lang.String r1 = r3.b()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L_0x0275
        L_0x0201:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x021f:
            java.lang.String r6 = r17.h()
            r7 = 0
            java.lang.String r7 = r6.substring(r7, r5)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            P6.f.d(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            java.lang.String r7 = W6.l.Y(r7, r8, r9)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = W6.l.Y(r7, r8, r9)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r7 = W6.l.Y(r7, r8, r9)
            int r6 = r6.length()
            if (r5 >= r6) goto L_0x0264
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r1 = r1.length
            r4.append(r1)
            java.lang.String r1 = " text="
            r4.append(r1)
            r4.append(r7)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L_0x0275
        L_0x0264:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r1.<init>(r2)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L_0x0275:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.i.toString():java.lang.String");
    }
}
