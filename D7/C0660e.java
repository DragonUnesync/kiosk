package d7;

import P6.f;
import Y6.u;
import Z6.b;
import h1.C1048n;
import l7.i;

/* renamed from: d7.e  reason: case insensitive filesystem */
public abstract class C0660e {
    static {
        i iVar = i.f13217X;
        C1048n.m("\"\\");
        C1048n.m("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (f.a((String) uVar.f6739U.f733W, "HEAD")) {
            return false;
        }
        int i = uVar.f6742X;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && b.j(uVar) == -1) {
            String b8 = uVar.f6744Z.b("Transfer-Encoding");
            if (b8 == null) {
                b8 = null;
            }
            if ("chunked".equalsIgnoreCase(b8)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020c, code lost:
        if (((java.util.regex.Pattern) r3.f3955V).matcher(r0).matches() == false) goto L_0x020e;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(Y6.j r37, Y6.o r38, Y6.m r39) {
        /*
            r1 = r37
            r2 = r38
            r0 = r39
            r3 = 1
            java.lang.String r4 = "<this>"
            P6.f.e(r1, r4)
            java.lang.String r5 = "url"
            P6.f.e(r2, r5)
            java.lang.String r5 = "headers"
            P6.f.e(r0, r5)
            Y6.b r5 = Y6.j.f6653J
            if (r1 != r5) goto L_0x001b
            return
        L_0x001b:
            java.util.regex.Pattern r5 = Y6.i.f6642j
            int r5 = r39.size()
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x0024:
            if (r8 >= r5) goto L_0x0043
            java.lang.String r10 = r0.c(r8)
            java.lang.String r11 = "Set-Cookie"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0041
            if (r9 != 0) goto L_0x003a
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 2
            r9.<init>(r10)
        L_0x003a:
            java.lang.String r10 = r0.f(r8)
            r9.add(r10)
        L_0x0041:
            int r8 = r8 + r3
            goto L_0x0024
        L_0x0043:
            D6.r r5 = D6.r.f1269U
            if (r9 == 0) goto L_0x0052
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r9)
            java.lang.String r8 = "{\n      Collections.unmodifiableList(result)\n    }"
            P6.f.d(r0, r8)
            r8 = r0
            goto L_0x0053
        L_0x0052:
            r8 = r5
        L_0x0053:
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L_0x0059:
            if (r10 >= r9) goto L_0x026d
            java.lang.Object r0 = r8.get(r10)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r0 = "setCookie"
            P6.f.e(r12, r0)
            long r13 = java.lang.System.currentTimeMillis()
            byte[] r0 = Z6.b.f6982a
            int r0 = r12.length()
            r15 = 59
            int r0 = Z6.b.e(r12, r15, r6, r0)
            r7 = 61
            int r15 = Z6.b.e(r12, r7, r6, r0)
            if (r15 != r0) goto L_0x0087
        L_0x007f:
            r39 = r5
            r36 = r8
        L_0x0083:
            r0 = 0
            r3 = 0
            goto L_0x0255
        L_0x0087:
            java.lang.String r17 = Z6.b.x(r6, r15, r12)
            int r16 = r17.length()
            if (r16 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            int r6 = Z6.b.l(r17)
            r7 = -1
            if (r6 == r7) goto L_0x009a
        L_0x0099:
            goto L_0x007f
        L_0x009a:
            int r15 = r15 + r3
            java.lang.String r18 = Z6.b.x(r15, r0, r12)
            int r6 = Z6.b.l(r18)
            if (r6 == r7) goto L_0x00a6
            goto L_0x007f
        L_0x00a6:
            int r0 = r0 + r3
            int r6 = r12.length()
            r19 = -1
            r21 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r27 = r19
            r29 = r21
            r7 = 0
            r15 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
        L_0x00c0:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r6) goto L_0x01a2
            r39 = r5
            r3 = 59
            int r5 = Z6.b.e(r12, r3, r0, r6)
            r16 = r6
            r3 = 61
            int r6 = Z6.b.e(r12, r3, r0, r5)
            java.lang.String r0 = Z6.b.x(r0, r6, r12)
            if (r6 >= r5) goto L_0x00e8
            r35 = 1
            int r6 = r6 + 1
            java.lang.String r6 = Z6.b.x(r6, r5, r12)
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r6 = ""
        L_0x00ea:
            java.lang.String r3 = "expires"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0105
            int r0 = r6.length()     // Catch:{ IllegalArgumentException -> 0x0101 }
            long r29 = G5.s.v(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0101 }
            r36 = r8
        L_0x00fc:
            r3 = 1
            r25 = 1
            goto L_0x0198
        L_0x0101:
            r36 = r8
            goto L_0x017f
        L_0x0105:
            java.lang.String r3 = "max-age"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0147
            long r27 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x011f }
            r31 = 0
            int r0 = (r27 > r31 ? 1 : (r27 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r33 = r27
        L_0x011a:
            r36 = r8
            r27 = r33
            goto L_0x00fc
        L_0x011f:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            r36 = r8
            java.lang.String r8 = "compile(...)"
            P6.f.d(r0, r8)     // Catch:{ NumberFormatException -> 0x017f }
            java.util.regex.Matcher r0 = r0.matcher(r6)     // Catch:{ NumberFormatException -> 0x017f }
            boolean r0 = r0.matches()     // Catch:{ NumberFormatException -> 0x017f }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = "-"
            r3 = 0
            boolean r0 = W6.l.a0(r6, r0, r3)     // Catch:{ NumberFormatException -> 0x017f }
            if (r0 == 0) goto L_0x0143
            r31 = r33
        L_0x0143:
            r27 = r31
            goto L_0x00fc
        L_0x0146:
            throw r3     // Catch:{ NumberFormatException -> 0x017f }
        L_0x0147:
            r36 = r8
            java.lang.String r3 = "domain"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0176
            java.lang.String r0 = "."
            boolean r3 = r6.endsWith(r0)     // Catch:{  }
            if (r3 != 0) goto L_0x016e
            java.lang.String r0 = W6.d.l0(r6, r0)     // Catch:{  }
            java.lang.String r0 = android.support.v4.media.session.b.N(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0168
            r7 = r0
            r3 = 1
            r26 = 0
            goto L_0x0198
        L_0x0168:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            java.lang.String r3 = "Failed requirement."
            r0.<init>(r3)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0176:
            java.lang.String r3 = "path"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0181
            r15 = r6
        L_0x017f:
            r3 = 1
            goto L_0x0198
        L_0x0181:
            java.lang.String r3 = "secure"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x018d
            r3 = 1
            r23 = 1
            goto L_0x0198
        L_0x018d:
            java.lang.String r3 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x017f
            r3 = 1
            r24 = 1
        L_0x0198:
            int r0 = r5 + 1
            r5 = r39
            r6 = r16
            r8 = r36
            goto L_0x00c0
        L_0x01a2:
            r39 = r5
            r36 = r8
            int r0 = (r27 > r33 ? 1 : (r27 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x01ad
            r19 = r33
            goto L_0x01d2
        L_0x01ad:
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01d0
            r5 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x01bf
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0
            long r31 = r27 * r5
        L_0x01bf:
            long r31 = r13 + r31
            int r0 = (r31 > r13 ? 1 : (r31 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x01cd
            int r0 = (r31 > r21 ? 1 : (r31 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ca
            goto L_0x01cd
        L_0x01ca:
            r19 = r31
            goto L_0x01d2
        L_0x01cd:
            r19 = r21
            goto L_0x01d2
        L_0x01d0:
            r19 = r29
        L_0x01d2:
            java.lang.String r0 = r2.f6672d
            if (r7 != 0) goto L_0x01d8
            r7 = r0
            goto L_0x020e
        L_0x01d8:
            boolean r3 = P6.f.a(r0, r7)
            if (r3 == 0) goto L_0x01df
            goto L_0x020e
        L_0x01df:
            P6.f.e(r0, r4)
            boolean r3 = r0.endsWith(r7)
            if (r3 == 0) goto L_0x0253
            int r3 = r0.length()
            int r5 = r7.length()
            int r3 = r3 - r5
            r5 = 1
            int r3 = r3 - r5
            char r3 = r0.charAt(r3)
            r5 = 46
            if (r3 != r5) goto L_0x0253
            P6.j r3 = Z6.b.e
            r3.getClass()
            java.lang.Object r3 = r3.f3955V
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x0253
        L_0x020e:
            int r0 = r0.length()
            int r3 = r7.length()
            if (r0 == r3) goto L_0x0222
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f14280g
            java.lang.String r0 = r0.a(r7)
            if (r0 != 0) goto L_0x0222
            goto L_0x0083
        L_0x0222:
            java.lang.String r0 = "/"
            r3 = 0
            if (r15 == 0) goto L_0x0231
            boolean r5 = W6.l.a0(r15, r0, r3)
            if (r5 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r22 = r15
            goto L_0x0249
        L_0x0231:
            java.lang.String r5 = r38.b()
            r6 = 47
            r8 = 6
            int r6 = W6.d.i0(r5, r6, r3, r8)
            if (r6 == 0) goto L_0x0247
            java.lang.String r0 = r5.substring(r3, r6)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            P6.f.d(r0, r5)
        L_0x0247:
            r22 = r0
        L_0x0249:
            Y6.i r0 = new Y6.i
            r16 = r0
            r21 = r7
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x0255
        L_0x0253:
            r3 = 0
            r0 = 0
        L_0x0255:
            if (r0 != 0) goto L_0x0259
        L_0x0257:
            r5 = 1
            goto L_0x0264
        L_0x0259:
            if (r11 != 0) goto L_0x0260
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0260:
            r11.add(r0)
            goto L_0x0257
        L_0x0264:
            int r10 = r10 + r5
            r5 = r39
            r8 = r36
            r3 = 1
            r6 = 0
            goto L_0x0059
        L_0x026d:
            r39 = r5
            if (r11 == 0) goto L_0x027b
            java.util.List r5 = j$.util.DesugarCollections.unmodifiableList(r11)
            java.lang.String r0 = "{\n        Collections.un…ableList(cookies)\n      }"
            P6.f.d(r5, r0)
            goto L_0x027d
        L_0x027b:
            r5 = r39
        L_0x027d:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0284
            return
        L_0x0284:
            r1.W(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.C0660e.b(Y6.j, Y6.o, Y6.m):void");
    }
}
