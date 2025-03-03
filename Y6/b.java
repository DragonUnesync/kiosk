package Y6;

import D6.r;
import P6.f;
import W6.a;
import W6.d;
import W6.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class b implements j {

    /* renamed from: U  reason: collision with root package name */
    public static final b f6598U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public static final b f6599V = new Object();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f6621d.put(str, gVar);
        return gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: l7.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: l7.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: l7.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: l7.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: l7.f} */
    /* JADX WARNING: type inference failed for: r9v1, types: [l7.f, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            r0 = r17
            r1 = r20
            r2 = r25 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = 0
            goto L_0x000d
        L_0x000b:
            r2 = r18
        L_0x000d:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0016
            int r4 = r17.length()
            goto L_0x0018
        L_0x0016:
            r4 = r19
        L_0x0018:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x001e
            r5 = 0
            goto L_0x0020
        L_0x001e:
            r5 = r21
        L_0x0020:
            r6 = r25 & 16
            if (r6 == 0) goto L_0x0026
            r6 = 0
            goto L_0x0028
        L_0x0026:
            r6 = r22
        L_0x0028:
            r7 = r25 & 32
            if (r7 == 0) goto L_0x002e
            r7 = 0
            goto L_0x0030
        L_0x002e:
            r7 = r23
        L_0x0030:
            r8 = r25 & 64
            if (r8 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = r24
        L_0x0037:
            java.lang.String r8 = "<this>"
            P6.f.e(r0, r8)
            r8 = r2
        L_0x003d:
            if (r8 >= r4) goto L_0x0110
            int r9 = r0.codePointAt(r8)
            r10 = 32
            r11 = 128(0x80, float:1.794E-43)
            r12 = 43
            r13 = 37
            r14 = 127(0x7f, float:1.78E-43)
            if (r9 < r10) goto L_0x0073
            if (r9 == r14) goto L_0x0073
            if (r9 < r11) goto L_0x0055
            if (r3 == 0) goto L_0x0073
        L_0x0055:
            char r15 = (char) r9
            boolean r15 = W6.d.b0(r1, r15)
            if (r15 != 0) goto L_0x0073
            if (r9 != r13) goto L_0x0068
            if (r5 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x0068
            boolean r15 = d(r8, r4, r0)
            if (r15 == 0) goto L_0x0073
        L_0x0068:
            if (r9 != r12) goto L_0x006d
            if (r7 == 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            int r9 = java.lang.Character.charCount(r9)
            int r8 = r8 + r9
            goto L_0x003d
        L_0x0073:
            l7.f r9 = new l7.f
            r9.<init>()
            r9.C(r2, r8, r0)
            r2 = 0
        L_0x007c:
            if (r8 >= r4) goto L_0x0107
            int r15 = r0.codePointAt(r8)
            if (r5 == 0) goto L_0x0095
            r13 = 9
            if (r15 == r13) goto L_0x00c5
            r13 = 10
            if (r15 == r13) goto L_0x00c5
            r13 = 12
            if (r15 == r13) goto L_0x00c5
            r13 = 13
            if (r15 != r13) goto L_0x0095
            goto L_0x00c5
        L_0x0095:
            if (r15 != r12) goto L_0x00a4
            if (r7 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x009e
            java.lang.String r13 = "+"
            goto L_0x00a0
        L_0x009e:
            java.lang.String r13 = "%2B"
        L_0x00a0:
            r9.D(r13)
            goto L_0x00c5
        L_0x00a4:
            if (r15 < r10) goto L_0x00c8
            if (r15 == r14) goto L_0x00c8
            if (r15 < r11) goto L_0x00ac
            if (r3 == 0) goto L_0x00c8
        L_0x00ac:
            char r13 = (char) r15
            boolean r13 = W6.d.b0(r1, r13)
            if (r13 != 0) goto L_0x00c8
            r13 = 37
            if (r15 != r13) goto L_0x00c2
            if (r5 == 0) goto L_0x00c8
            if (r6 == 0) goto L_0x00c2
            boolean r13 = d(r8, r4, r0)
            if (r13 != 0) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            r9.E(r15)
        L_0x00c5:
            r11 = 37
            goto L_0x00fa
        L_0x00c8:
            if (r2 != 0) goto L_0x00cf
            l7.f r2 = new l7.f
            r2.<init>()
        L_0x00cf:
            r2.E(r15)
        L_0x00d2:
            boolean r13 = r2.k()
            if (r13 != 0) goto L_0x00c5
            byte r13 = r2.n()
            r10 = r13 & 255(0xff, float:3.57E-43)
            r11 = 37
            r9.z(r11)
            char[] r16 = Y6.o.f6668j
            int r10 = r10 >> 4
            r10 = r10 & 15
            char r10 = r16[r10]
            r9.z(r10)
            r10 = r13 & 15
            char r10 = r16[r10]
            r9.z(r10)
            r10 = 32
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00d2
        L_0x00fa:
            int r10 = java.lang.Character.charCount(r15)
            int r8 = r8 + r10
            r10 = 32
            r11 = 128(0x80, float:1.794E-43)
            r13 = 37
            goto L_0x007c
        L_0x0107:
            long r0 = r9.f13216V
            java.nio.charset.Charset r2 = W6.a.f6191a
            java.lang.String r0 = r9.s(r0, r2)
            goto L_0x0119
        L_0x0110:
            java.lang.String r0 = r0.substring(r2, r4)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            P6.f.d(r0, r1)
        L_0x0119:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.b.b(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static boolean d(int i, int i8, String str) {
        int i9 = i + 2;
        if (i9 >= i8 || str.charAt(i) != '%' || Z6.b.q(str.charAt(i + 1)) == -1 || Z6.b.q(str.charAt(i9)) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [l7.f, java.lang.Object] */
    public static String e(String str, int i, int i8, boolean z, int i9) {
        int i10;
        int i11;
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        if ((i9 & 4) != 0) {
            z = false;
        }
        f.e(str, "<this>");
        int i12 = i;
        while (i10 < i8) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z)) {
                ? obj = new Object();
                obj.C(i, i10, str);
                while (i10 < i8) {
                    int codePointAt = str.codePointAt(i10);
                    if (codePointAt == 37 && (i11 = i10 + 2) < i8) {
                        int q7 = Z6.b.q(str.charAt(i10 + 1));
                        int q8 = Z6.b.q(str.charAt(i11));
                        if (!(q7 == -1 || q8 == -1)) {
                            obj.z((q7 << 4) + q8);
                            i10 = Character.charCount(codePointAt) + i11;
                        }
                    } else if (codePointAt == 43 && z) {
                        obj.z(32);
                        i10++;
                    }
                    obj.E(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
                return obj.s(obj.f13216V, a.f6191a);
            }
            i12 = i10 + 1;
        }
        String substring = str.substring(i, i8);
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int f02 = d.f0(str, '&', i, false, 4);
            if (f02 == -1) {
                f02 = str.length();
            }
            int f03 = d.f0(str, '=', i, false, 4);
            if (f03 == -1 || f03 > f02) {
                String substring = str.substring(i, f02);
                f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add((Object) null);
            } else {
                String substring2 = str.substring(i, f03);
                f.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(f03 + 1, f02);
                f.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = f02 + 1;
        }
        return arrayList;
    }

    public void W(o oVar, List list) {
        f.e(oVar, "url");
    }

    public synchronized g c(String str) {
        g gVar;
        String str2;
        try {
            f.e(str, "javaName");
            LinkedHashMap linkedHashMap = g.f6621d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (l.a0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    f.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (l.a0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    f.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                gVar = (g) linkedHashMap.get(str2);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return gVar;
    }

    public List z(o oVar) {
        f.e(oVar, "url");
        return r.f1269U;
    }
}
