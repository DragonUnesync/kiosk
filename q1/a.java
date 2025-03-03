package Q1;

import M0.C0120h;
import M1.d;
import M1.l;
import N.e;
import P0.r;
import P0.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a implements l {

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f4079a0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: U  reason: collision with root package name */
    public final boolean f4080U;

    /* renamed from: V  reason: collision with root package name */
    public final C0120h f4081V;

    /* renamed from: W  reason: collision with root package name */
    public final r f4082W = new r();

    /* renamed from: X  reason: collision with root package name */
    public LinkedHashMap f4083X;

    /* renamed from: Y  reason: collision with root package name */
    public float f4084Y = -3.4028235E38f;

    /* renamed from: Z  reason: collision with root package name */
    public float f4085Z = -3.4028235E38f;

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f4080U = false;
            this.f4081V = null;
            return;
        }
        this.f4080U = true;
        String o2 = z.o((byte[]) list.get(0));
        P0.l.d(o2.startsWith("Format:"));
        C0120h c8 = C0120h.c(o2);
        c8.getClass();
        this.f4081V = c8;
        c(new r((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int b(long j7, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) arrayList.get(size)).longValue() == j7) {
                return size;
            } else {
                if (((Long) arrayList.get(size)).longValue() < j7) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        arrayList.add(i, Long.valueOf(j7));
        if (i != 0) {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long d(String str) {
        Matcher matcher = f4079a0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = z.f3748a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        r3 = androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0240, code lost:
        switch(r0) {
            case -1: goto L_0x0246;
            case 0: goto L_0x0243;
            case 1: goto L_0x024d;
            case 2: goto L_0x024b;
            case 3: goto L_0x0249;
            case 4: goto L_0x024d;
            case 5: goto L_0x024b;
            case 6: goto L_0x0249;
            case 7: goto L_0x024d;
            case 8: goto L_0x024b;
            case 9: goto L_0x0249;
            default: goto L_0x0243;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0243, code lost:
        Q0.g.u(r0, "Unknown alignment: ", "SsaParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0246, code lost:
        r6 = androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0249, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x024e, code lost:
        switch(r0) {
            case -1: goto L_0x0254;
            case 0: goto L_0x0251;
            case 1: goto L_0x025f;
            case 2: goto L_0x025f;
            case 3: goto L_0x025f;
            case 4: goto L_0x025b;
            case 5: goto L_0x025b;
            case 6: goto L_0x025b;
            case 7: goto L_0x0257;
            case 8: goto L_0x0257;
            case 9: goto L_0x0257;
            default: goto L_0x0251;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0251, code lost:
        Q0.g.u(r0, "Unknown alignment: ", "SsaParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0254, code lost:
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0257, code lost:
        r0 = r20;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025b, code lost:
        r0 = r20;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025f, code lost:
        r0 = r20;
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0265, code lost:
        if (r0 == null) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0269, code lost:
        if (r10 == -3.4028235E38f) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026d, code lost:
        if (r9 == -3.4028235E38f) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026f, code lost:
        r26 = r0.y / r10;
        r29 = r0.x / r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x027a, code lost:
        r10 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0282, code lost:
        if (r6 == 0) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0284, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0285, code lost:
        if (r6 == 1) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0287, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0288, code lost:
        if (r6 == 2) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        r17 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028e, code lost:
        r17 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0292, code lost:
        r15 = 2;
        r17 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0296, code lost:
        r14 = 1;
        r15 = 2;
        r17 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029b, code lost:
        if (r3 == 0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029d, code lost:
        if (r3 == r14) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029f, code lost:
        if (r3 == r15) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a1, code lost:
        r10 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a5, code lost:
        r10 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a8, code lost:
        r10 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ab, code lost:
        r26 = r10;
        r29 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02af, code lost:
        r21 = new O0.b(r13, r23, (android.text.Layout.Alignment) null, (android.graphics.Bitmap) null, r26, 0, r3, r29, r6, r31, r32, -3.4028235E38f, -3.4028235E38f, false, -16777216, androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION, 0.0f);
        r1 = b(r7, r5, r4);
        r3 = b(r11, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d3, code lost:
        if (r1 >= r3) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d5, code lost:
        ((java.util.List) r4.get(r1)).add(r21);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0230, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0235, code lost:
        r23 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0101 */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d A[Catch:{ RuntimeException -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(byte[] r41, int r42, int r43, M1.k r44, P0.c r45) {
        /*
            r40 = this;
            r0 = r40
            r1 = r42
            r2 = r44
            r3 = r45
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r1 + r43
            P0.r r7 = r0.f4082W
            r8 = r41
            r7.F(r6, r8)
            r7.H(r1)
            java.nio.charset.Charset r1 = r7.D()
            if (r1 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
        L_0x0027:
            boolean r6 = r0.f4080U
            if (r6 != 0) goto L_0x002e
            r0.c(r7, r1)
        L_0x002e:
            if (r6 == 0) goto L_0x0033
            M0.h r6 = r0.f4081V
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            java.lang.String r9 = r7.j(r1)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x02ed
            java.lang.String r13 = "Format:"
            boolean r13 = r9.startsWith(r13)
            if (r13 == 0) goto L_0x004c
            M0.h r6 = M0.C0120h.c(r9)
            goto L_0x0034
        L_0x004c:
            java.lang.String r13 = "Dialogue:"
            boolean r14 = r9.startsWith(r13)
            if (r14 == 0) goto L_0x0061
            java.lang.String r14 = "SsaParser"
            if (r6 != 0) goto L_0x0069
            java.lang.String r10 = "Skipping dialogue line before complete format: "
            java.lang.String r9 = r10.concat(r9)
            P0.l.B(r14, r9)
        L_0x0061:
            r18 = r1
            r16 = r6
            r39 = r7
            goto L_0x02e1
        L_0x0069:
            boolean r13 = r9.startsWith(r13)
            P0.l.d(r13)
            r13 = 9
            java.lang.String r13 = r9.substring(r13)
            java.lang.String r15 = ","
            int r8 = r6.f2951f
            java.lang.String[] r13 = r13.split(r15, r8)
            int r15 = r13.length
            if (r15 == r8) goto L_0x008b
            java.lang.String r8 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r8 = r8.concat(r9)
            P0.l.B(r14, r8)
            goto L_0x0061
        L_0x008b:
            int r8 = r6.f2948b
            r8 = r13[r8]
            r15 = r7
            long r7 = d(r8)
            java.lang.String r10 = "Skipping invalid timing: "
            int r16 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r16 != 0) goto L_0x00a9
            java.lang.String r7 = r10.concat(r9)
            P0.l.B(r14, r7)
        L_0x00a1:
            r18 = r1
            r16 = r6
            r39 = r15
            goto L_0x02e1
        L_0x00a9:
            int r11 = r6.f2949c
            r11 = r13[r11]
            long r11 = d(r11)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x00c2
            java.lang.String r7 = r10.concat(r9)
            P0.l.B(r14, r7)
            goto L_0x00a1
        L_0x00c2:
            java.util.LinkedHashMap r9 = r0.f4083X
            r10 = -1
            r18 = r1
            if (r9 == 0) goto L_0x00da
            int r1 = r6.f2950d
            if (r1 == r10) goto L_0x00da
            r1 = r13[r1]
            java.lang.String r1 = r1.trim()
            java.lang.Object r1 = r9.get(r1)
            Q1.d r1 = (Q1.d) r1
            goto L_0x00db
        L_0x00da:
            r1 = 0
        L_0x00db:
            int r9 = r6.e
            r9 = r13[r9]
            java.util.regex.Pattern r13 = Q1.c.f4095a
            java.util.regex.Matcher r13 = r13.matcher(r9)
            r19 = -1
            r20 = 0
        L_0x00e9:
            boolean r16 = r13.find()
            if (r16 == 0) goto L_0x0127
            r16 = r6
            r10 = 1
            java.lang.String r6 = r13.group(r10)
            r6.getClass()
            android.graphics.PointF r10 = Q1.c.a(r6)     // Catch:{ RuntimeException -> 0x0101 }
            if (r10 == 0) goto L_0x0101
            r20 = r10
        L_0x0101:
            java.util.regex.Pattern r10 = Q1.c.f4098d     // Catch:{ RuntimeException -> 0x011b }
            java.util.regex.Matcher r6 = r10.matcher(r6)     // Catch:{ RuntimeException -> 0x011b }
            boolean r10 = r6.find()     // Catch:{ RuntimeException -> 0x011b }
            if (r10 == 0) goto L_0x011d
            r10 = 1
            java.lang.String r6 = r6.group(r10)     // Catch:{ RuntimeException -> 0x011b }
            r6.getClass()     // Catch:{ RuntimeException -> 0x011b }
            int r6 = Q1.d.a(r6)     // Catch:{ RuntimeException -> 0x011b }
        L_0x0119:
            r10 = -1
            goto L_0x011f
        L_0x011b:
            goto L_0x0123
        L_0x011d:
            r6 = -1
            goto L_0x0119
        L_0x011f:
            if (r6 == r10) goto L_0x0123
            r19 = r6
        L_0x0123:
            r6 = r16
            r10 = -1
            goto L_0x00e9
        L_0x0127:
            r16 = r6
            Q1.c r6 = new Q1.c
            java.util.regex.Pattern r6 = Q1.c.f4095a
            java.util.regex.Matcher r6 = r6.matcher(r9)
            java.lang.String r9 = ""
            java.lang.String r6 = r6.replaceAll(r9)
            java.lang.String r9 = "\\N"
            java.lang.String r10 = "\n"
            java.lang.String r6 = r6.replace(r9, r10)
            java.lang.String r9 = "\\n"
            java.lang.String r6 = r6.replace(r9, r10)
            java.lang.String r9 = "\\h"
            java.lang.String r10 = " "
            java.lang.String r6 = r6.replace(r9, r10)
            float r9 = r0.f4084Y
            float r10 = r0.f4085Z
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r6)
            r34 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r37 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0216
            java.lang.Integer r6 = r1.f4101c
            if (r6 == 0) goto L_0x0177
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r6 = r6.intValue()
            r0.<init>(r6)
            int r6 = r13.length()
            r39 = r15
            r3 = 33
            r15 = 0
            r13.setSpan(r0, r15, r6, r3)
            goto L_0x0179
        L_0x0177:
            r39 = r15
        L_0x0179:
            int r0 = r1.f4106j
            r3 = 3
            if (r0 != r3) goto L_0x0195
            java.lang.Integer r0 = r1.f4102d
            if (r0 == 0) goto L_0x0195
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            int r0 = r0.intValue()
            r6.<init>(r0)
            int r0 = r13.length()
            r3 = 33
            r15 = 0
            r13.setSpan(r6, r15, r0, r3)
        L_0x0195:
            float r0 = r1.e
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x01a6
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x01a6
            float r0 = r0 / r10
            r3 = r0
            r0 = 1
            goto L_0x01ab
        L_0x01a6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01ab:
            boolean r6 = r1.f4104g
            boolean r15 = r1.f4103f
            if (r15 == 0) goto L_0x01c8
            if (r6 == 0) goto L_0x01c8
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r15 = 3
            r6.<init>(r15)
            int r15 = r13.length()
            r23 = r0
            r22 = r3
            r0 = 0
            r3 = 33
            r13.setSpan(r6, r0, r15, r3)
            goto L_0x01ee
        L_0x01c8:
            r23 = r0
            r22 = r3
            r0 = 0
            r3 = 33
            if (r15 == 0) goto L_0x01df
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r15 = 1
            r6.<init>(r15)
            int r15 = r13.length()
            r13.setSpan(r6, r0, r15, r3)
            goto L_0x01ee
        L_0x01df:
            if (r6 == 0) goto L_0x01ee
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r15 = 2
            r6.<init>(r15)
            int r15 = r13.length()
            r13.setSpan(r6, r0, r15, r3)
        L_0x01ee:
            boolean r6 = r1.f4105h
            if (r6 == 0) goto L_0x01fe
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            int r15 = r13.length()
            r13.setSpan(r6, r0, r15, r3)
        L_0x01fe:
            boolean r6 = r1.i
            if (r6 == 0) goto L_0x020e
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            int r15 = r13.length()
            r13.setSpan(r6, r0, r15, r3)
        L_0x020e:
            r3 = r19
            r32 = r22
            r31 = r23
            r0 = -1
            goto L_0x0220
        L_0x0216:
            r39 = r15
            r3 = r19
            r0 = -1
            r31 = -2147483648(0xffffffff80000000, float:-0.0)
            r32 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0220:
            if (r3 == r0) goto L_0x0224
            r0 = r3
            goto L_0x0228
        L_0x0224:
            if (r1 == 0) goto L_0x0228
            int r0 = r1.f4100b
        L_0x0228:
            java.lang.String r1 = "Unknown alignment: "
            switch(r0) {
                case -1: goto L_0x0230;
                case 0: goto L_0x022d;
                case 1: goto L_0x023b;
                case 2: goto L_0x0238;
                case 3: goto L_0x0233;
                case 4: goto L_0x023b;
                case 5: goto L_0x0238;
                case 6: goto L_0x0233;
                case 7: goto L_0x023b;
                case 8: goto L_0x0238;
                case 9: goto L_0x0233;
                default: goto L_0x022d;
            }
        L_0x022d:
            Q0.g.u(r0, r1, r14)
        L_0x0230:
            r23 = 0
            goto L_0x023e
        L_0x0233:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x0235:
            r23 = r3
            goto L_0x023e
        L_0x0238:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0235
        L_0x023b:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0235
        L_0x023e:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x0246;
                case 0: goto L_0x0243;
                case 1: goto L_0x024d;
                case 2: goto L_0x024b;
                case 3: goto L_0x0249;
                case 4: goto L_0x024d;
                case 5: goto L_0x024b;
                case 6: goto L_0x0249;
                case 7: goto L_0x024d;
                case 8: goto L_0x024b;
                case 9: goto L_0x0249;
                default: goto L_0x0243;
            }
        L_0x0243:
            Q0.g.u(r0, r1, r14)
        L_0x0246:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x024e
        L_0x0249:
            r6 = 2
            goto L_0x024e
        L_0x024b:
            r6 = 1
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            switch(r0) {
                case -1: goto L_0x0254;
                case 0: goto L_0x0251;
                case 1: goto L_0x025f;
                case 2: goto L_0x025f;
                case 3: goto L_0x025f;
                case 4: goto L_0x025b;
                case 5: goto L_0x025b;
                case 6: goto L_0x025b;
                case 7: goto L_0x0257;
                case 8: goto L_0x0257;
                case 9: goto L_0x0257;
                default: goto L_0x0251;
            }
        L_0x0251:
            Q0.g.u(r0, r1, r14)
        L_0x0254:
            r0 = r20
            goto L_0x0262
        L_0x0257:
            r0 = r20
            r3 = 0
            goto L_0x0262
        L_0x025b:
            r0 = r20
            r3 = 1
            goto L_0x0262
        L_0x025f:
            r0 = r20
            r3 = 2
        L_0x0262:
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == 0) goto L_0x027a
            int r14 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r14 == 0) goto L_0x027a
            int r14 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r14 == 0) goto L_0x027a
            float r1 = r0.x
            float r1 = r1 / r9
            float r0 = r0.y
            float r0 = r0 / r10
            r26 = r0
            r29 = r1
            goto L_0x02af
        L_0x027a:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1064514355(0x3f733333, float:0.95)
            if (r6 == 0) goto L_0x0296
            r14 = 1
            if (r6 == r14) goto L_0x0292
            r15 = 2
            if (r6 == r15) goto L_0x028e
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x029b
        L_0x028e:
            r17 = 1064514355(0x3f733333, float:0.95)
            goto L_0x029b
        L_0x0292:
            r15 = 2
            r17 = 1056964608(0x3f000000, float:0.5)
            goto L_0x029b
        L_0x0296:
            r14 = 1
            r15 = 2
            r17 = 1028443341(0x3d4ccccd, float:0.05)
        L_0x029b:
            if (r3 == 0) goto L_0x02a8
            if (r3 == r14) goto L_0x02a5
            if (r3 == r15) goto L_0x02ab
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x02ab
        L_0x02a5:
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x02ab
        L_0x02a8:
            r10 = 1028443341(0x3d4ccccd, float:0.05)
        L_0x02ab:
            r26 = r10
            r29 = r17
        L_0x02af:
            O0.b r0 = new O0.b
            r21 = r0
            r25 = 0
            r24 = r25
            r35 = 0
            r36 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r38 = 0
            r22 = r13
            r1 = 0
            r27 = r1
            r28 = r3
            r30 = r6
            r33 = r34
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            int r1 = b(r7, r5, r4)
            int r3 = b(r11, r5, r4)
        L_0x02d3:
            if (r1 >= r3) goto L_0x02e1
            java.lang.Object r6 = r4.get(r1)
            java.util.List r6 = (java.util.List) r6
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x02d3
        L_0x02e1:
            r0 = r40
            r3 = r45
            r6 = r16
            r1 = r18
            r7 = r39
            goto L_0x0034
        L_0x02ed:
            long r0 = r2.f3088a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0302
            boolean r2 = r2.f3089b
            if (r2 == 0) goto L_0x0302
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0303
        L_0x0302:
            r8 = 0
        L_0x0303:
            r2 = 0
        L_0x0304:
            int r3 = r4.size()
            if (r2 >= r3) goto L_0x037c
            java.lang.Object r3 = r4.get(r2)
            r10 = r3
            java.util.List r10 = (java.util.List) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x0322
            if (r2 == 0) goto L_0x0322
            r7 = r45
            r6 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0373
        L_0x0322:
            int r3 = r4.size()
            r6 = 1
            int r3 = r3 - r6
            if (r2 == r3) goto L_0x0376
            java.lang.Object r3 = r5.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r11 = r3.longValue()
            int r3 = r2 + 1
            java.lang.Object r3 = r5.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r13 = r3.longValue()
            java.lang.Object r3 = r5.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r18 = r3.longValue()
            long r13 = r13 - r18
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0368
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x035a
            goto L_0x0368
        L_0x035a:
            if (r8 == 0) goto L_0x0365
            M1.a r3 = new M1.a
            r9 = r3
            r9.<init>(r10, r11, r13)
            r8.add(r3)
        L_0x0365:
            r7 = r45
            goto L_0x0373
        L_0x0368:
            M1.a r3 = new M1.a
            r9 = r3
            r9.<init>(r10, r11, r13)
            r7 = r45
            r7.accept(r3)
        L_0x0373:
            int r2 = r2 + 1
            goto L_0x0304
        L_0x0376:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x037c:
            r7 = r45
            if (r8 == 0) goto L_0x0394
            java.util.Iterator r0 = r8.iterator()
        L_0x0384:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0394
            java.lang.Object r1 = r0.next()
            M1.a r1 = (M1.a) r1
            r7.accept(r1)
            goto L_0x0384
        L_0x0394:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.D(byte[], int, int, M1.k, P0.c):void");
    }

    public final /* synthetic */ void a() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:150|151) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x029f, code lost:
        if (r4 != 3) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        P0.l.B("SsaStyle", "Ignoring unknown BorderStyle: " + r0);
        r4 = -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x02a1 */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(P0.r r38, java.nio.charset.Charset r39) {
        /*
            r37 = this;
            r1 = r37
            r2 = 6
            r3 = 3
            r4 = 7
            r5 = -1
            r6 = 2
            r7 = 0
            r8 = 1
        L_0x0009:
            java.lang.String r0 = r38.j(r39)
            if (r0 == 0) goto L_0x0301
            java.lang.String r9 = "[Script Info]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            r10 = 91
            if (r9 == 0) goto L_0x006f
        L_0x0019:
            java.lang.String r0 = r38.j(r39)
            if (r0 == 0) goto L_0x0009
            int r9 = r38.a()
            if (r9 == 0) goto L_0x002b
            char r9 = r38.d(r39)
            if (r9 == r10) goto L_0x0009
        L_0x002b:
            java.lang.String r9 = ":"
            java.lang.String[] r0 = r0.split(r9)
            int r9 = r0.length
            if (r9 == r6) goto L_0x0035
            goto L_0x0019
        L_0x0035:
            r9 = r0[r7]
            java.lang.String r9 = r9.trim()
            java.lang.String r9 = F.h.E(r9)
            r9.getClass()
            java.lang.String r11 = "playresx"
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0062
            java.lang.String r11 = "playresy"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0053
            goto L_0x0019
        L_0x0053:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x0060 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0060 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0060 }
            r1.f4085Z = r0     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x0019
        L_0x0060:
            goto L_0x0019
        L_0x0062:
            r0 = r0[r8]     // Catch:{ NumberFormatException -> 0x0060 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0060 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0060 }
            r1.f4084Y = r0     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x0019
        L_0x006f:
            java.lang.String r9 = "[V4+ Styles]"
            boolean r9 = r9.equalsIgnoreCase(r0)
            java.lang.String r11 = "SsaParser"
            if (r9 == 0) goto L_0x02eb
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r13 = 0
        L_0x007f:
            java.lang.String r14 = r38.j(r39)
            if (r14 == 0) goto L_0x02e3
            int r0 = r38.a()
            if (r0 == 0) goto L_0x0091
            char r0 = r38.d(r39)
            if (r0 == r10) goto L_0x02e3
        L_0x0091:
            java.lang.String r0 = "Format:"
            boolean r0 = r14.startsWith(r0)
            java.lang.String r15 = ","
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r14.substring(r4)
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r15)
            r13 = 0
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1
            r24 = -1
        L_0x00b7:
            int r14 = r0.length
            if (r13 >= r14) goto L_0x0166
            r14 = r0[r13]
            java.lang.String r14 = r14.trim()
            java.lang.String r14 = F.h.E(r14)
            r14.getClass()
            int r25 = r14.hashCode()
            switch(r25) {
                case -1178781136: goto L_0x0138;
                case -1026963764: goto L_0x012d;
                case -192095652: goto L_0x0122;
                case -70925746: goto L_0x0117;
                case 3029637: goto L_0x010c;
                case 3373707: goto L_0x0101;
                case 366554320: goto L_0x00f6;
                case 767321349: goto L_0x00eb;
                case 1767875043: goto L_0x00de;
                case 1988365454: goto L_0x00d1;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r4 = -1
            goto L_0x0142
        L_0x00d1:
            java.lang.String r4 = "outlinecolour"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x00da
            goto L_0x00ce
        L_0x00da:
            r4 = 9
            goto L_0x0142
        L_0x00de:
            java.lang.String r4 = "alignment"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x00e7
            goto L_0x00ce
        L_0x00e7:
            r4 = 8
            goto L_0x0142
        L_0x00eb:
            java.lang.String r4 = "borderstyle"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x00f4
            goto L_0x00ce
        L_0x00f4:
            r4 = 7
            goto L_0x0142
        L_0x00f6:
            java.lang.String r4 = "fontsize"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x00ff
            goto L_0x00ce
        L_0x00ff:
            r4 = 6
            goto L_0x0142
        L_0x0101:
            java.lang.String r4 = "name"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x010a
            goto L_0x00ce
        L_0x010a:
            r4 = 5
            goto L_0x0142
        L_0x010c:
            java.lang.String r4 = "bold"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0115
            goto L_0x00ce
        L_0x0115:
            r4 = 4
            goto L_0x0142
        L_0x0117:
            java.lang.String r4 = "primarycolour"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0120
            goto L_0x00ce
        L_0x0120:
            r4 = 3
            goto L_0x0142
        L_0x0122:
            java.lang.String r4 = "strikeout"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x012b
            goto L_0x00ce
        L_0x012b:
            r4 = 2
            goto L_0x0142
        L_0x012d:
            java.lang.String r4 = "underline"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0136
            goto L_0x00ce
        L_0x0136:
            r4 = 1
            goto L_0x0142
        L_0x0138:
            java.lang.String r4 = "italic"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0141
            goto L_0x00ce
        L_0x0141:
            r4 = 0
        L_0x0142:
            switch(r4) {
                case 0: goto L_0x0160;
                case 1: goto L_0x015d;
                case 2: goto L_0x015a;
                case 3: goto L_0x0157;
                case 4: goto L_0x0154;
                case 5: goto L_0x0152;
                case 6: goto L_0x014f;
                case 7: goto L_0x014c;
                case 8: goto L_0x0149;
                case 9: goto L_0x0146;
                default: goto L_0x0145;
            }
        L_0x0145:
            goto L_0x0162
        L_0x0146:
            r18 = r13
            goto L_0x0162
        L_0x0149:
            r16 = r13
            goto L_0x0162
        L_0x014c:
            r24 = r13
            goto L_0x0162
        L_0x014f:
            r19 = r13
            goto L_0x0162
        L_0x0152:
            r15 = r13
            goto L_0x0162
        L_0x0154:
            r20 = r13
            goto L_0x0162
        L_0x0157:
            r17 = r13
            goto L_0x0162
        L_0x015a:
            r23 = r13
            goto L_0x0162
        L_0x015d:
            r22 = r13
            goto L_0x0162
        L_0x0160:
            r21 = r13
        L_0x0162:
            int r13 = r13 + r8
            r4 = 7
            goto L_0x00b7
        L_0x0166:
            if (r15 == r5) goto L_0x0173
            Q1.b r4 = new Q1.b
            int r0 = r0.length
            r14 = r4
            r25 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r13 = r4
            goto L_0x0174
        L_0x0173:
            r13 = 0
        L_0x0174:
            r4 = 7
            goto L_0x007f
        L_0x0177:
            java.lang.String r0 = "Style:"
            boolean r4 = r14.startsWith(r0)
            if (r4 == 0) goto L_0x02db
            if (r13 != 0) goto L_0x018c
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r0 = r0.concat(r14)
            P0.l.B(r11, r0)
            goto L_0x02db
        L_0x018c:
            boolean r0 = r14.startsWith(r0)
            P0.l.d(r0)
            java.lang.String r0 = r14.substring(r2)
            java.lang.String[] r4 = android.text.TextUtils.split(r0, r15)
            int r0 = r4.length
            int r15 = r13.f4094k
            java.lang.String r2 = "'"
            java.lang.String r6 = "SsaStyle"
            if (r0 == r15) goto L_0x01c3
            int r0 = r4.length
            int r4 = P0.z.f3748a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = "Skipping malformed 'Style:' line (expected "
            java.lang.String r7 = " values, found "
            java.lang.String r10 = "): '"
            java.lang.StringBuilder r0 = u.C1477r.e(r4, r15, r7, r0, r10)
            r0.append(r14)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            P0.l.B(r6, r0)
        L_0x01c0:
            r7 = 0
            goto L_0x02d4
        L_0x01c3:
            Q1.d r7 = new Q1.d     // Catch:{ RuntimeException -> 0x01de }
            int r0 = r13.f4086a     // Catch:{ RuntimeException -> 0x01de }
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r27 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            int r0 = r13.f4087b     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x01e1
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            int r0 = Q1.d.a(r0)     // Catch:{ RuntimeException -> 0x01de }
            r28 = r0
            goto L_0x01e3
        L_0x01de:
            r0 = move-exception
            goto L_0x02be
        L_0x01e1:
            r28 = -1
        L_0x01e3:
            int r0 = r13.f4088c     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x01f4
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            java.lang.Integer r0 = Q1.d.c(r0)     // Catch:{ RuntimeException -> 0x01de }
            r29 = r0
            goto L_0x01f6
        L_0x01f4:
            r29 = 0
        L_0x01f6:
            int r0 = r13.f4089d     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x0207
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            java.lang.Integer r0 = Q1.d.c(r0)     // Catch:{ RuntimeException -> 0x01de }
            r30 = r0
            goto L_0x0209
        L_0x0207:
            r30 = 0
        L_0x0209:
            int r0 = r13.e     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x0234
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r15 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            float r10 = java.lang.Float.parseFloat(r15)     // Catch:{ NumberFormatException -> 0x0218 }
            goto L_0x0231
        L_0x0218:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r12 = "Failed to parse font size: '"
            r0.<init>(r12)     // Catch:{ RuntimeException -> 0x01de }
            r0.append(r15)     // Catch:{ RuntimeException -> 0x01de }
            r0.append(r2)     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x01de }
            P0.l.C(r6, r0, r10)     // Catch:{ RuntimeException -> 0x01de }
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0231:
            r31 = r10
            goto L_0x0237
        L_0x0234:
            r31 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0237:
            int r0 = r13.f4090f     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x024a
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            boolean r0 = Q1.d.b(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x024a
            r32 = 1
            goto L_0x024c
        L_0x024a:
            r32 = 0
        L_0x024c:
            int r0 = r13.f4091g     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x025f
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            boolean r0 = Q1.d.b(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x025f
            r33 = 1
            goto L_0x0261
        L_0x025f:
            r33 = 0
        L_0x0261:
            int r0 = r13.f4092h     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x0274
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            boolean r0 = Q1.d.b(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0274
            r34 = 1
            goto L_0x0276
        L_0x0274:
            r34 = 0
        L_0x0276:
            int r0 = r13.i     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x0289
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            boolean r0 = Q1.d.b(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0289
            r35 = 1
            goto L_0x028b
        L_0x0289:
            r35 = 0
        L_0x028b:
            int r0 = r13.f4093j     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == r5) goto L_0x02b6
            r0 = r4[r0]     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r4 = r0.trim()     // Catch:{ NumberFormatException -> 0x02a1 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x02a1 }
            if (r4 == r8) goto L_0x02b3
            if (r4 == r3) goto L_0x02b3
        L_0x02a1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r10 = "Ignoring unknown BorderStyle: "
            r4.<init>(r10)     // Catch:{ RuntimeException -> 0x01de }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r0 = r4.toString()     // Catch:{ RuntimeException -> 0x01de }
            P0.l.B(r6, r0)     // Catch:{ RuntimeException -> 0x01de }
            r4 = -1
        L_0x02b3:
            r36 = r4
            goto L_0x02b8
        L_0x02b6:
            r36 = -1
        L_0x02b8:
            r26 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x02d4
        L_0x02be:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Skipping malformed 'Style:' line: '"
            r4.<init>(r7)
            r4.append(r14)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            P0.l.C(r6, r2, r0)
            goto L_0x01c0
        L_0x02d4:
            if (r7 == 0) goto L_0x02db
            java.lang.String r0 = r7.f4099a
            r9.put(r0, r7)
        L_0x02db:
            r2 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            r10 = 91
            goto L_0x007f
        L_0x02e3:
            r1.f4083X = r9
        L_0x02e5:
            r2 = 6
            r4 = 7
            r6 = 2
            r7 = 0
            goto L_0x0009
        L_0x02eb:
            java.lang.String r2 = "[V4 Styles]"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L_0x02f9
            java.lang.String r0 = "[V4 Styles] are not supported"
            P0.l.s(r11, r0)
            goto L_0x02e5
        L_0x02f9:
            java.lang.String r2 = "[Events]"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02e5
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.c(P0.r, java.nio.charset.Charset):void");
    }

    public final /* synthetic */ d o(byte[] bArr, int i, int i8) {
        return e.o(this, bArr, i8);
    }

    public final int y() {
        return 1;
    }
}
