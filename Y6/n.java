package Y6;

import D6.k;
import P6.f;
import java.util.ArrayList;
import java.util.Iterator;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f6661a;

    /* renamed from: b  reason: collision with root package name */
    public String f6662b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f6663c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f6664d;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f6665f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f6666g;

    /* renamed from: h  reason: collision with root package name */
    public String f6667h;

    public n() {
        ArrayList arrayList = new ArrayList();
        this.f6665f = arrayList;
        arrayList.add("");
    }

    public final o a() {
        ArrayList arrayList;
        String str;
        String str2 = this.f6661a;
        if (str2 != null) {
            String e8 = b.e(this.f6662b, 0, 0, false, 7);
            String e9 = b.e(this.f6663c, 0, 0, false, 7);
            String str3 = this.f6664d;
            if (str3 != null) {
                int b8 = b();
                ArrayList arrayList2 = this.f6665f;
                ArrayList arrayList3 = new ArrayList(k.M(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(b.e((String) it.next(), 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f6666g;
                String str4 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(k.M(arrayList4));
                    for (String str5 : arrayList4) {
                        if (str5 != null) {
                            str = b.e(str5, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str6 = this.f6667h;
                if (str6 != null) {
                    str4 = b.e(str6, 0, 0, false, 7);
                }
                return new o(str2, e8, e9, str3, b8, arrayList3, arrayList, str4, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.f6661a;
        f.b(str);
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0273, code lost:
        if (r1 < 65536) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r7 == ':') goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x023e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(Y6.o r33, java.lang.String r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r10 = r34
            r2 = 6
            r11 = 1
            byte[] r3 = Z6.b.f6982a
            int r3 = r34.length()
            r12 = 0
            int r3 = Z6.b.m(r12, r3, r10)
            int r4 = r34.length()
            int r13 = Z6.b.n(r3, r4, r10)
            int r4 = r13 - r3
            r14 = -1
            r15 = 91
            r5 = 2
            r9 = 58
            if (r4 >= r5) goto L_0x0027
        L_0x0025:
            r4 = -1
            goto L_0x007b
        L_0x0027:
            char r4 = r10.charAt(r3)
            r6 = 97
            int r7 = P6.f.f(r4, r6)
            r8 = 65
            if (r7 < 0) goto L_0x003d
            r7 = 122(0x7a, float:1.71E-43)
            int r7 = P6.f.f(r4, r7)
            if (r7 <= 0) goto L_0x004c
        L_0x003d:
            int r7 = P6.f.f(r4, r8)
            if (r7 < 0) goto L_0x0025
            r7 = 90
            int r4 = P6.f.f(r4, r7)
            if (r4 <= 0) goto L_0x004c
            goto L_0x0025
        L_0x004c:
            int r4 = r3 + 1
        L_0x004e:
            if (r4 >= r13) goto L_0x0025
            char r7 = r10.charAt(r4)
            if (r6 > r7) goto L_0x005b
            r6 = 123(0x7b, float:1.72E-43)
            if (r7 >= r6) goto L_0x005b
            goto L_0x0075
        L_0x005b:
            if (r8 > r7) goto L_0x0060
            if (r7 >= r15) goto L_0x0060
            goto L_0x0075
        L_0x0060:
            r6 = 48
            if (r6 > r7) goto L_0x0067
            if (r7 >= r9) goto L_0x0067
            goto L_0x0075
        L_0x0067:
            r6 = 43
            if (r7 != r6) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            r6 = 45
            if (r7 != r6) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r6 = 46
            if (r7 != r6) goto L_0x0079
        L_0x0075:
            int r4 = r4 + r11
            r6 = 97
            goto L_0x004e
        L_0x0079:
            if (r7 != r9) goto L_0x0025
        L_0x007b:
            java.lang.String r8 = "http"
            java.lang.String r7 = "https"
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r4 == r14) goto L_0x00bc
            java.lang.String r15 = "https:"
            boolean r15 = W6.l.Z(r3, r10, r15, r11)
            if (r15 == 0) goto L_0x008f
            r0.f6661a = r7
            int r3 = r3 + r2
            goto L_0x00c2
        L_0x008f:
            java.lang.String r2 = "http:"
            boolean r2 = W6.l.Z(r3, r10, r2, r11)
            if (r2 == 0) goto L_0x009c
            r0.f6661a = r8
            int r3 = r3 + 5
            goto L_0x00c2
        L_0x009c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r3)
            java.lang.String r3 = r10.substring(r12, r4)
            P6.f.d(r3, r6)
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00bc:
            if (r1 == 0) goto L_0x041a
            java.lang.String r2 = r1.f6669a
            r0.f6661a = r2
        L_0x00c2:
            r2 = r3
            r4 = 0
        L_0x00c4:
            r15 = 47
            r12 = 92
            if (r2 >= r13) goto L_0x00d8
            char r9 = r10.charAt(r2)
            if (r9 == r12) goto L_0x00d2
            if (r9 != r15) goto L_0x00d8
        L_0x00d2:
            int r4 = r4 + r11
            int r2 = r2 + r11
            r9 = 58
            r12 = 0
            goto L_0x00c4
        L_0x00d8:
            java.util.ArrayList r9 = r0.f6665f
            r11 = 35
            if (r4 >= r5) goto L_0x0138
            if (r1 == 0) goto L_0x0138
            java.lang.String r5 = r0.f6661a
            java.lang.String r2 = r1.f6669a
            boolean r2 = P6.f.a(r2, r5)
            if (r2 != 0) goto L_0x00eb
            goto L_0x0138
        L_0x00eb:
            java.lang.String r2 = r33.e()
            r0.f6662b = r2
            java.lang.String r2 = r33.a()
            r0.f6663c = r2
            java.lang.String r2 = r1.f6672d
            r0.f6664d = r2
            int r2 = r1.e
            r0.e = r2
            r9.clear()
            java.util.ArrayList r2 = r33.c()
            r9.addAll(r2)
            if (r3 == r13) goto L_0x0111
            char r2 = r10.charAt(r3)
            if (r2 != r11) goto L_0x0133
        L_0x0111:
            java.lang.String r19 = r33.d()
            if (r19 == 0) goto L_0x0130
            r24 = 0
            r27 = 211(0xd3, float:2.96E-43)
            r20 = 0
            r21 = 0
            java.lang.String r22 = " \"'<>#"
            r23 = 1
            r25 = 1
            r26 = 0
            java.lang.String r1 = Y6.b.b(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.util.ArrayList r1 = Y6.b.f(r1)
            goto L_0x0131
        L_0x0130:
            r1 = 0
        L_0x0131:
            r0.f6666g = r1
        L_0x0133:
            r33 = r9
            r14 = 0
            goto L_0x02dc
        L_0x0138:
            int r3 = r3 + r4
            r5 = r3
            r19 = 0
            r20 = 0
        L_0x013e:
            java.lang.String r1 = "@/\\?#"
            int r4 = Z6.b.f(r10, r5, r1, r13)
            if (r4 == r13) goto L_0x014b
            char r1 = r10.charAt(r4)
            goto L_0x014c
        L_0x014b:
            r1 = -1
        L_0x014c:
            if (r1 == r14) goto L_0x0213
            if (r1 == r11) goto L_0x0213
            if (r1 == r15) goto L_0x0213
            if (r1 == r12) goto L_0x0213
            r2 = 63
            if (r1 == r2) goto L_0x0213
            r3 = 64
            if (r1 == r3) goto L_0x015d
            goto L_0x013e
        L_0x015d:
            java.lang.String r3 = "%40"
            if (r19 != 0) goto L_0x01ca
            r1 = 58
            int r11 = Z6.b.e(r10, r1, r5, r4)
            r18 = 0
            r21 = 0
            java.lang.String r22 = " \"':;<=>@[]^`{}|/\\?#"
            r23 = 1
            r24 = 0
            r25 = 240(0xf0, float:3.36E-43)
            r26 = 58
            r1 = r34
            r2 = r5
            r5 = r3
            r3 = r11
            r12 = r4
            r4 = r22
            r15 = r5
            r5 = r23
            r28 = r6
            r6 = r24
            r29 = r7
            r7 = r18
            r30 = r8
            r8 = r21
            r33 = r9
            r14 = 58
            r9 = r25
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r20 == 0) goto L_0x01ac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f6662b
            r2.append(r3)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x01ac:
            r0.f6662b = r1
            if (r11 == r12) goto L_0x01c6
            r1 = 1
            int r2 = r11 + 1
            r7 = 0
            r8 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r1 = r34
            r3 = r12
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f6663c = r1
            r19 = 1
        L_0x01c6:
            r1 = 1
            r20 = 1
            goto L_0x0200
        L_0x01ca:
            r15 = r3
            r12 = r4
            r28 = r6
            r29 = r7
            r30 = r8
            r33 = r9
            r14 = 58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r0.f6663c
            r11.append(r1)
            r11.append(r15)
            r7 = 0
            r8 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r6 = 1
            r9 = 0
            r15 = 240(0xf0, float:3.36E-43)
            r1 = r34
            r2 = r5
            r3 = r12
            r5 = r6
            r6 = r9
            r9 = r15
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            r0.f6663c = r1
            r1 = 1
        L_0x0200:
            int r5 = r12 + 1
            r9 = r33
            r6 = r28
            r7 = r29
            r8 = r30
            r11 = 35
            r12 = 92
            r14 = -1
            r15 = 47
            goto L_0x013e
        L_0x0213:
            r12 = r4
            r28 = r6
            r29 = r7
            r30 = r8
            r33 = r9
            r14 = 58
            r4 = r5
        L_0x021f:
            if (r4 >= r12) goto L_0x023e
            char r1 = r10.charAt(r4)
            r2 = 91
            if (r1 != r2) goto L_0x0237
        L_0x0229:
            r1 = 1
            int r4 = r4 + r1
            if (r4 >= r12) goto L_0x0235
            char r1 = r10.charAt(r4)
            r3 = 93
            if (r1 != r3) goto L_0x0229
        L_0x0235:
            r1 = 1
            goto L_0x023c
        L_0x0237:
            if (r1 != r14) goto L_0x0235
            r11 = r4
            r1 = 1
            goto L_0x0240
        L_0x023c:
            int r4 = r4 + r1
            goto L_0x021f
        L_0x023e:
            r1 = 1
            r11 = r12
        L_0x0240:
            int r14 = r11 + 1
            r1 = 4
            r15 = 34
            if (r14 >= r12) goto L_0x02ab
            r2 = 0
            java.lang.String r1 = Y6.b.e(r10, r5, r11, r2, r1)
            java.lang.String r1 = android.support.v4.media.session.b.N(r1)
            r0.f6664d = r1
            java.lang.String r4 = ""
            r9 = 248(0xf8, float:3.48E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r1 = r34
            r2 = r14
            r3 = r12
            r31 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0276 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0276 }
            r2 = 1
            if (r2 > r1) goto L_0x027b
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 >= r2) goto L_0x027b
            goto L_0x027c
        L_0x0276:
            goto L_0x027b
        L_0x0278:
            r31 = r5
            goto L_0x0276
        L_0x027b:
            r1 = -1
        L_0x027c:
            r0.e = r1
            r2 = -1
            if (r1 == r2) goto L_0x0287
            r3 = r28
            r5 = r31
            r14 = 0
            goto L_0x02d7
        L_0x0287:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL port: \""
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r14, r12)
            r3 = r28
            P6.f.d(r2, r3)
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x02ab:
            r3 = r28
            r2 = -1
            r14 = 0
            java.lang.String r1 = Y6.b.e(r10, r5, r11, r14, r1)
            java.lang.String r1 = android.support.v4.media.session.b.N(r1)
            r0.f6664d = r1
            java.lang.String r1 = r0.f6661a
            P6.f.b(r1)
            r4 = r30
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x02c9
            r1 = 80
            goto L_0x02d5
        L_0x02c9:
            r4 = r29
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x02d4
            r1 = 443(0x1bb, float:6.21E-43)
            goto L_0x02d5
        L_0x02d4:
            r1 = -1
        L_0x02d5:
            r0.e = r1
        L_0x02d7:
            java.lang.String r1 = r0.f6664d
            if (r1 == 0) goto L_0x03f8
            r3 = r12
        L_0x02dc:
            java.lang.String r1 = "?#"
            int r11 = Z6.b.f(r10, r3, r1, r13)
            if (r3 != r11) goto L_0x02e7
        L_0x02e4:
            r2 = 1
            goto L_0x03b0
        L_0x02e7:
            char r1 = r10.charAt(r3)
            java.lang.String r12 = ""
            r2 = 47
            if (r1 == r2) goto L_0x02f5
            r2 = 92
            if (r1 != r2) goto L_0x02f9
        L_0x02f5:
            r15 = r33
            r2 = 1
            goto L_0x0305
        L_0x02f9:
            int r1 = r33.size()
            r2 = 1
            int r1 = r1 - r2
            r15 = r33
            r15.set(r1, r12)
            goto L_0x030c
        L_0x0305:
            r15.clear()
            r15.add(r12)
            int r3 = r3 + r2
        L_0x030c:
            r2 = r3
        L_0x030d:
            if (r2 >= r11) goto L_0x02e4
            java.lang.String r1 = "/\\"
            int r9 = Z6.b.f(r10, r2, r1, r11)
            if (r9 >= r11) goto L_0x031a
            r16 = 1
            goto L_0x031c
        L_0x031a:
            r16 = 0
        L_0x031c:
            r7 = 0
            r8 = 0
            java.lang.String r4 = " \"<>^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r17 = 240(0xf0, float:3.36E-43)
            r1 = r34
            r3 = r9
            r18 = r9
            r9 = r17
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x037f
            java.lang.String r2 = "%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0340
            goto L_0x037f
        L_0x0340:
            java.lang.String r2 = ".."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = "%2e."
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = ".%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = "%2e%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0361
            goto L_0x0381
        L_0x0361:
            r2 = 1
            java.lang.Object r3 = Q0.g.l(r2, r15)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0377
            int r3 = r15.size()
            int r3 = r3 - r2
            r15.set(r3, r1)
            goto L_0x037a
        L_0x0377:
            r15.add(r1)
        L_0x037a:
            if (r16 == 0) goto L_0x037f
            r15.add(r12)
        L_0x037f:
            r2 = 1
            goto L_0x03a5
        L_0x0381:
            int r1 = r15.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r1 = r15.remove(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x03a2
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x03a2
            int r1 = r15.size()
            int r1 = r1 - r2
            r15.set(r1, r12)
            goto L_0x03a5
        L_0x03a2:
            r15.add(r12)
        L_0x03a5:
            if (r16 == 0) goto L_0x03ac
            int r1 = r18 + 1
            r2 = r1
            goto L_0x030d
        L_0x03ac:
            r2 = r18
            goto L_0x030d
        L_0x03b0:
            if (r11 >= r13) goto L_0x03d9
            char r1 = r10.charAt(r11)
            r3 = 63
            if (r1 != r3) goto L_0x03d9
            r1 = 35
            int r12 = Z6.b.e(r10, r1, r11, r13)
            int r3 = r11 + 1
            r7 = 1
            r8 = 0
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r6 = 0
            r9 = 208(0xd0, float:2.91E-43)
            r1 = r34
            r2 = r3
            r3 = r12
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = Y6.b.f(r1)
            r0.f6666g = r1
            r11 = r12
        L_0x03d9:
            if (r11 >= r13) goto L_0x03f7
            char r1 = r10.charAt(r11)
            r2 = 35
            if (r1 != r2) goto L_0x03f7
            r1 = 1
            int r2 = r11 + 1
            r7 = 0
            r8 = 1
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            r9 = 176(0xb0, float:2.47E-43)
            r1 = r34
            r3 = r13
            java.lang.String r1 = Y6.b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f6667h = r1
        L_0x03f7:
            return
        L_0x03f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL host: \""
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r5, r11)
            P6.f.d(r2, r3)
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x041a:
            int r1 = r34.length()
            if (r1 <= r2) goto L_0x042b
            java.lang.String r1 = W6.d.r0(r2, r10)
            java.lang.String r2 = "..."
            java.lang.String r1 = r1.concat(r2)
            goto L_0x042c
        L_0x042b:
            r1 = r10
        L_0x042c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r1 = u.C1477r.d(r3, r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.n.c(Y6.o, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r1 != r3) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.f6661a
            if (r1 == 0) goto L_0x0012
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L_0x0017
        L_0x0012:
            java.lang.String r1 = "//"
            r0.append(r1)
        L_0x0017:
            java.lang.String r1 = r8.f6662b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            java.lang.String r1 = r8.f6663c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0044
        L_0x002a:
            java.lang.String r1 = r8.f6662b
            r0.append(r1)
            java.lang.String r1 = r8.f6663c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x003f
            r0.append(r2)
            java.lang.String r1 = r8.f6663c
            r0.append(r1)
        L_0x003f:
            r1 = 64
            r0.append(r1)
        L_0x0044:
            java.lang.String r1 = r8.f6664d
            if (r1 == 0) goto L_0x0063
            boolean r1 = W6.d.b0(r1, r2)
            if (r1 == 0) goto L_0x005e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r8.f6664d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L_0x0063
        L_0x005e:
            java.lang.String r1 = r8.f6664d
            r0.append(r1)
        L_0x0063:
            int r1 = r8.e
            r3 = -1
            if (r1 != r3) goto L_0x006c
            java.lang.String r1 = r8.f6661a
            if (r1 == 0) goto L_0x0091
        L_0x006c:
            int r1 = r8.b()
            java.lang.String r4 = r8.f6661a
            if (r4 == 0) goto L_0x008b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x007f
            r3 = 80
            goto L_0x0089
        L_0x007f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            r3 = 443(0x1bb, float:6.21E-43)
        L_0x0089:
            if (r1 == r3) goto L_0x0091
        L_0x008b:
            r0.append(r2)
            r0.append(r1)
        L_0x0091:
            java.util.ArrayList r1 = r8.f6665f
            java.lang.String r2 = "<this>"
            P6.f.e(r1, r2)
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x009e:
            if (r4 >= r2) goto L_0x00b1
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x009e
        L_0x00b1:
            java.util.ArrayList r1 = r8.f6666g
            if (r1 == 0) goto L_0x0100
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r8.f6666g
            P6.f.b(r1)
            int r2 = r1.size()
            T6.c r2 = B.C0003d.Q(r3, r2)
            r3 = 2
            T6.a r2 = B.C0003d.L(r2, r3)
            int r3 = r2.f5006U
            int r4 = r2.f5007V
            int r2 = r2.f5008W
            if (r2 <= 0) goto L_0x00d6
            if (r3 <= r4) goto L_0x00da
        L_0x00d6:
            if (r2 >= 0) goto L_0x0100
            if (r4 > r3) goto L_0x0100
        L_0x00da:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto L_0x00ef
            r7 = 38
            r0.append(r7)
        L_0x00ef:
            r0.append(r5)
            if (r6 == 0) goto L_0x00fc
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        L_0x00fc:
            if (r3 == r4) goto L_0x0100
            int r3 = r3 + r2
            goto L_0x00da
        L_0x0100:
            java.lang.String r1 = r8.f6667h
            if (r1 == 0) goto L_0x010e
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r8.f6667h
            r0.append(r1)
        L_0x010e:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            P6.f.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.n.toString():java.lang.String");
    }
}
