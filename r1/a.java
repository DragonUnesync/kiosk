package R1;

import H3.O;
import M1.d;
import M1.k;
import M1.l;
import N.e;
import P0.c;
import P0.r;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a implements l {

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f4325X = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f4326Y = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: U  reason: collision with root package name */
    public final StringBuilder f4327U = new StringBuilder();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f4328V = new ArrayList();

    /* renamed from: W  reason: collision with root package name */
    public final r f4329W = new r();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static O0.b b(android.text.Spanned r23, java.lang.String r24) {
        /*
            r0 = r24
            r17 = 0
            r4 = 0
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 0
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 != 0) goto L_0x0027
            O0.b r18 = new O0.b
            r0 = r18
            r1 = r23
            r2 = r4
            r3 = r4
            r5 = r13
            r6 = r16
            r7 = r16
            r8 = r13
            r9 = r16
            r10 = r16
            r11 = r13
            r12 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        L_0x0027:
            int r1 = r24.hashCode()
            r2 = 2
            r3 = 1
            java.lang.String r5 = "{\\an1}"
            java.lang.String r7 = "{\\an2}"
            java.lang.String r8 = "{\\an3}"
            java.lang.String r9 = "{\\an4}"
            java.lang.String r11 = "{\\an5}"
            java.lang.String r12 = "{\\an6}"
            java.lang.String r6 = "{\\an7}"
            r19 = 8
            java.lang.String r10 = "{\\an8}"
            java.lang.String r15 = "{\\an9}"
            r20 = -1
            r21 = 0
            r14 = 3
            r13 = 4
            r4 = 5
            switch(r1) {
                case -685620710: goto L_0x008d;
                case -685620679: goto L_0x0085;
                case -685620648: goto L_0x007d;
                case -685620617: goto L_0x0075;
                case -685620586: goto L_0x006d;
                case -685620555: goto L_0x0065;
                case -685620524: goto L_0x005d;
                case -685620493: goto L_0x0054;
                case -685620462: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0095
        L_0x004c:
            boolean r1 = r0.equals(r15)
            if (r1 == 0) goto L_0x0095
            r1 = 5
            goto L_0x0096
        L_0x0054:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0095
            r1 = 8
            goto L_0x0096
        L_0x005d:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0095
            r1 = 2
            goto L_0x0096
        L_0x0065:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0095
            r1 = 4
            goto L_0x0096
        L_0x006d:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0095
            r1 = 7
            goto L_0x0096
        L_0x0075:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0095
            r1 = 1
            goto L_0x0096
        L_0x007d:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0095
            r1 = 3
            goto L_0x0096
        L_0x0085:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0095
            r1 = 6
            goto L_0x0096
        L_0x008d:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x0095
            r1 = 0
            goto L_0x0096
        L_0x0095:
            r1 = -1
        L_0x0096:
            if (r1 == 0) goto L_0x00a6
            if (r1 == r3) goto L_0x00a6
            if (r1 == r2) goto L_0x00a6
            if (r1 == r14) goto L_0x00a4
            if (r1 == r13) goto L_0x00a4
            if (r1 == r4) goto L_0x00a4
            r1 = 1
            goto L_0x00a7
        L_0x00a4:
            r1 = 2
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            int r22 = r24.hashCode()
            switch(r22) {
                case -685620710: goto L_0x00f0;
                case -685620679: goto L_0x00e8;
                case -685620648: goto L_0x00e0;
                case -685620617: goto L_0x00d8;
                case -685620586: goto L_0x00d0;
                case -685620555: goto L_0x00c7;
                case -685620524: goto L_0x00bf;
                case -685620493: goto L_0x00b7;
                case -685620462: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00f8
        L_0x00af:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00f8
            r6 = 5
            goto L_0x00f9
        L_0x00b7:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00f8
            r6 = 4
            goto L_0x00f9
        L_0x00bf:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00f8
            r6 = 3
            goto L_0x00f9
        L_0x00c7:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00f8
            r6 = 8
            goto L_0x00f9
        L_0x00d0:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00f8
            r6 = 7
            goto L_0x00f9
        L_0x00d8:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00f8
            r6 = 6
            goto L_0x00f9
        L_0x00e0:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00f8
            r6 = 2
            goto L_0x00f9
        L_0x00e8:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00f8
            r6 = 1
            goto L_0x00f9
        L_0x00f0:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00f8
            r6 = 0
            goto L_0x00f9
        L_0x00f8:
            r6 = -1
        L_0x00f9:
            if (r6 == 0) goto L_0x0109
            if (r6 == r3) goto L_0x0109
            if (r6 == r2) goto L_0x0109
            if (r6 == r14) goto L_0x0107
            if (r6 == r13) goto L_0x0107
            if (r6 == r4) goto L_0x0107
            r7 = 1
            goto L_0x010a
        L_0x0107:
            r7 = 0
            goto L_0x010a
        L_0x0109:
            r7 = 2
        L_0x010a:
            r0 = 1034147594(0x3da3d70a, float:0.08)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1064011039(0x3f6b851f, float:0.92)
            if (r1 == 0) goto L_0x0125
            if (r1 == r3) goto L_0x0122
            if (r1 != r2) goto L_0x011c
            r8 = 1064011039(0x3f6b851f, float:0.92)
            goto L_0x0128
        L_0x011c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0122:
            r8 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0128
        L_0x0125:
            r8 = 1034147594(0x3da3d70a, float:0.08)
        L_0x0128:
            if (r7 == 0) goto L_0x0138
            if (r7 == r3) goto L_0x0135
            if (r7 != r2) goto L_0x012f
            goto L_0x013b
        L_0x012f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0135:
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x0138:
            r5 = 1034147594(0x3da3d70a, float:0.08)
        L_0x013b:
            O0.b r18 = new O0.b
            r0 = r18
            r6 = 0
            r21 = r1
            r1 = r23
            r4 = 0
            r2 = r4
            r3 = r4
            r9 = r21
            r10 = r16
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r11 = r13
            r12 = r13
            r14 = 0
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.b(android.text.Spanned, java.lang.String):O0.b");
    }

    public static long c(Matcher matcher, int i) {
        long j7;
        String group = matcher.group(i + 1);
        if (group != null) {
            j7 = Long.parseLong(group) * 3600000;
        } else {
            j7 = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j7;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    public final void D(byte[] bArr, int i, int i8, k kVar, c cVar) {
        ArrayList<M1.a> arrayList;
        long j7;
        String str;
        String str2;
        c cVar2;
        a aVar = this;
        int i9 = i;
        k kVar2 = kVar;
        c cVar3 = cVar;
        String str3 = "SubripParser";
        r rVar = aVar.f4329W;
        rVar.F(i9 + i8, bArr);
        rVar.H(i9);
        Charset D8 = rVar.D();
        if (D8 == null) {
            D8 = StandardCharsets.UTF_8;
        }
        long j8 = kVar2.f3088a;
        long j9 = -9223372036854775807L;
        if (j8 == -9223372036854775807L || !kVar2.f3089b) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
        }
        while (true) {
            String j10 = rVar.j(D8);
            if (j10 == null) {
                break;
            } else if (j10.length() != 0) {
                try {
                    Integer.parseInt(j10);
                    String j11 = rVar.j(D8);
                    if (j11 == null) {
                        P0.l.B(str3, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f4325X.matcher(j11);
                    if (matcher.matches()) {
                        long c8 = c(matcher, 1);
                        long c9 = c(matcher, 6);
                        StringBuilder sb = aVar.f4327U;
                        sb.setLength(0);
                        ArrayList arrayList2 = aVar.f4328V;
                        arrayList2.clear();
                        String j12 = rVar.j(D8);
                        while (!TextUtils.isEmpty(j12)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = j12.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f4326Y.matcher(trim);
                            int i10 = 0;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList2.add(group);
                                Matcher matcher3 = matcher2;
                                int start = matcher2.start() - i10;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i10 += length;
                                matcher2 = matcher3;
                                c cVar4 = cVar;
                                str3 = str3;
                            }
                            sb.append(sb2.toString());
                            j12 = rVar.j(D8);
                            c cVar5 = cVar;
                            str3 = str3;
                        }
                        String str4 = str3;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                str2 = null;
                                break;
                            }
                            str2 = (String) arrayList2.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        if (j8 == -9223372036854775807L || c8 >= j8) {
                            cVar2 = cVar;
                            cVar2.accept(new M1.a(O.r(b(fromHtml, str2)), c8, c9 - c8));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new M1.a(O.r(b(fromHtml, str2)), c8, c9 - c8));
                            }
                            cVar2 = cVar;
                        }
                        cVar3 = cVar2;
                        j9 = -9223372036854775807L;
                        str3 = str4;
                        aVar = this;
                    } else {
                        String str5 = str3;
                        long j13 = j9;
                        str = str5;
                        P0.l.B(str, "Skipping invalid timing: ".concat(j11));
                        cVar3 = cVar3;
                        aVar = this;
                        j7 = j13;
                        str3 = str;
                        j9 = j7;
                    }
                } catch (NumberFormatException unused) {
                    j7 = j9;
                    str = str3;
                    long j14 = j7;
                    P0.l.B(str, "Skipping invalid index: ".concat(j10));
                    cVar3 = cVar3;
                    aVar = this;
                }
            }
        }
        c cVar6 = cVar3;
        if (arrayList != null) {
            for (M1.a accept : arrayList) {
                cVar6.accept(accept);
            }
        }
    }

    public final /* synthetic */ void a() {
    }

    public final /* synthetic */ d o(byte[] bArr, int i, int i8) {
        return e.o(this, bArr, i8);
    }

    public final int y() {
        return 1;
    }
}
