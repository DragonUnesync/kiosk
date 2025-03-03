package U1;

import O7.b;
import P0.l;
import P0.r;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f5415a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f5416b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map f5417c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f5418d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f5417c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f5418d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r18, U1.f r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            int r5 = r1.f5401b
            int r6 = r21.length()
            java.lang.String r7 = r1.f5400a
            r7.getClass()
            r9 = -1
            r11 = 1
            r12 = 33
            int r13 = r7.hashCode()
            switch(r13) {
                case 0: goto L_0x006e;
                case 98: goto L_0x0063;
                case 99: goto L_0x0058;
                case 105: goto L_0x004d;
                case 117: goto L_0x0042;
                case 118: goto L_0x0037;
                case 3314158: goto L_0x002c;
                case 3511770: goto L_0x0021;
                default: goto L_0x001e;
            }
        L_0x001e:
            r7 = -1
            goto L_0x0078
        L_0x0021:
            java.lang.String r13 = "ruby"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x002a
            goto L_0x001e
        L_0x002a:
            r7 = 7
            goto L_0x0078
        L_0x002c:
            java.lang.String r13 = "lang"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0035
            goto L_0x001e
        L_0x0035:
            r7 = 6
            goto L_0x0078
        L_0x0037:
            java.lang.String r13 = "v"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0040
            goto L_0x001e
        L_0x0040:
            r7 = 5
            goto L_0x0078
        L_0x0042:
            java.lang.String r13 = "u"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x004b
            goto L_0x001e
        L_0x004b:
            r7 = 4
            goto L_0x0078
        L_0x004d:
            java.lang.String r13 = "i"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0056
            goto L_0x001e
        L_0x0056:
            r7 = 3
            goto L_0x0078
        L_0x0058:
            java.lang.String r13 = "c"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0061
            goto L_0x001e
        L_0x0061:
            r7 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r13 = "b"
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x006c
            goto L_0x001e
        L_0x006c:
            r7 = 1
            goto L_0x0078
        L_0x006e:
            java.lang.String r13 = ""
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0077
            goto L_0x001e
        L_0x0077:
            r7 = 0
        L_0x0078:
            switch(r7) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0152;
                case 2: goto L_0x010a;
                case 3: goto L_0x0100;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00ec;
                case 6: goto L_0x015a;
                case 7: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return
        L_0x007c:
            int r7 = c(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r20.size()
            r13.<init>(r14)
            r14 = r20
            r13.addAll(r14)
            D.j0 r14 = U1.e.f5397c
            java.util.Collections.sort(r13, r14)
            int r14 = r1.f5401b
            r15 = 0
            r16 = 0
        L_0x0098:
            int r10 = r13.size()
            if (r15 >= r10) goto L_0x015a
            java.lang.Object r10 = r13.get(r15)
            U1.e r10 = (U1.e) r10
            U1.f r10 = r10.f5398a
            java.lang.String r10 = r10.f5400a
            java.lang.String r4 = "rt"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00e9
        L_0x00b1:
            java.lang.Object r4 = r13.get(r15)
            U1.e r4 = (U1.e) r4
            U1.f r10 = r4.f5398a
            int r10 = c(r3, r0, r10)
            if (r10 == r9) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            if (r7 == r9) goto L_0x00c4
            r10 = r7
            goto L_0x00c5
        L_0x00c4:
            r10 = 1
        L_0x00c5:
            U1.f r9 = r4.f5398a
            int r9 = r9.f5401b
            int r9 = r9 - r16
            int r4 = r4.f5399b
            int r4 = r4 - r16
            java.lang.CharSequence r17 = r2.subSequence(r9, r4)
            r2.delete(r9, r4)
            O0.g r4 = new O0.g
            java.lang.String r8 = r17.toString()
            r4.<init>(r8, r10)
            r2.setSpan(r4, r14, r9, r12)
            int r4 = r17.length()
            int r16 = r4 + r16
            r14 = r9
        L_0x00e9:
            int r15 = r15 + r11
            r9 = -1
            goto L_0x0098
        L_0x00ec:
            O0.i r4 = new O0.i
            java.lang.String r7 = r1.f5402c
            r4.<init>(r7)
            r2.setSpan(r4, r5, r6, r12)
            goto L_0x015a
        L_0x00f7:
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r2.setSpan(r4, r5, r6, r12)
            goto L_0x015a
        L_0x0100:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r7 = 2
            r4.<init>(r7)
            r2.setSpan(r4, r5, r6, r12)
            goto L_0x015a
        L_0x010a:
            java.util.Set r4 = r1.f5403d
            java.util.Iterator r4 = r4.iterator()
        L_0x0110:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x015a
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r8 = f5417c
            boolean r9 = r8.containsKey(r7)
            if (r9 == 0) goto L_0x0137
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r8.<init>(r7)
            r2.setSpan(r8, r5, r6, r12)
            goto L_0x0110
        L_0x0137:
            java.util.Map r8 = f5418d
            boolean r9 = r8.containsKey(r7)
            if (r9 == 0) goto L_0x0110
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            r8.<init>(r7)
            r2.setSpan(r8, r5, r6, r12)
            goto L_0x0110
        L_0x0152:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r11)
            r2.setSpan(r4, r5, r6, r12)
        L_0x015a:
            java.util.ArrayList r0 = b(r3, r0, r1)
            r1 = 0
        L_0x015f:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x023a
            java.lang.Object r3 = r0.get(r1)
            U1.g r3 = (U1.g) r3
            U1.c r3 = r3.f5405V
            int r4 = r3.f5388k
            r7 = -1
            if (r4 != r7) goto L_0x0179
            int r8 = r3.f5389l
            if (r8 != r7) goto L_0x0179
            r4 = -1
        L_0x0177:
            r7 = -1
            goto L_0x0188
        L_0x0179:
            if (r4 != r11) goto L_0x017d
            r4 = 1
            goto L_0x017e
        L_0x017d:
            r4 = 0
        L_0x017e:
            int r7 = r3.f5389l
            if (r7 != r11) goto L_0x0184
            r7 = 2
            goto L_0x0185
        L_0x0184:
            r7 = 0
        L_0x0185:
            r7 = r7 | r4
            r4 = r7
            goto L_0x0177
        L_0x0188:
            if (r4 == r7) goto L_0x01a9
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            int r8 = r3.f5388k
            if (r8 != r7) goto L_0x0196
            int r9 = r3.f5389l
            if (r9 != r7) goto L_0x0196
            r8 = -1
            goto L_0x01a3
        L_0x0196:
            if (r8 != r11) goto L_0x019a
            r8 = 1
            goto L_0x019b
        L_0x019a:
            r8 = 0
        L_0x019b:
            int r9 = r3.f5389l
            if (r9 != r11) goto L_0x01a1
            r9 = 2
            goto L_0x01a2
        L_0x01a1:
            r9 = 0
        L_0x01a2:
            r8 = r8 | r9
        L_0x01a3:
            r4.<init>(r8)
            G5.s.a(r2, r4, r5, r6)
        L_0x01a9:
            int r4 = r3.f5387j
            if (r4 != r11) goto L_0x01b5
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r2.setSpan(r4, r5, r6, r12)
        L_0x01b5:
            boolean r4 = r3.f5385g
            if (r4 == 0) goto L_0x01d0
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            boolean r8 = r3.f5385g
            if (r8 == 0) goto L_0x01c8
            int r8 = r3.f5384f
            r4.<init>(r8)
            G5.s.a(r2, r4, r5, r6)
            goto L_0x01d0
        L_0x01c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x01d0:
            boolean r4 = r3.i
            if (r4 == 0) goto L_0x01eb
            android.text.style.BackgroundColorSpan r4 = new android.text.style.BackgroundColorSpan
            boolean r8 = r3.i
            if (r8 == 0) goto L_0x01e3
            int r8 = r3.f5386h
            r4.<init>(r8)
            G5.s.a(r2, r4, r5, r6)
            goto L_0x01eb
        L_0x01e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x01eb:
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L_0x01f9
            android.text.style.TypefaceSpan r4 = new android.text.style.TypefaceSpan
            java.lang.String r8 = r3.e
            r4.<init>(r8)
            G5.s.a(r2, r4, r5, r6)
        L_0x01f9:
            int r4 = r3.f5390m
            if (r4 == r11) goto L_0x021e
            r8 = 2
            if (r4 == r8) goto L_0x0212
            r9 = 3
            if (r4 == r9) goto L_0x0204
            goto L_0x022b
        L_0x0204:
            android.text.style.RelativeSizeSpan r4 = new android.text.style.RelativeSizeSpan
            float r10 = r3.f5391n
            r13 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r13
            r4.<init>(r10)
            G5.s.a(r2, r4, r5, r6)
            goto L_0x022b
        L_0x0212:
            r9 = 3
            android.text.style.RelativeSizeSpan r4 = new android.text.style.RelativeSizeSpan
            float r10 = r3.f5391n
            r4.<init>(r10)
            G5.s.a(r2, r4, r5, r6)
            goto L_0x022b
        L_0x021e:
            r8 = 2
            r9 = 3
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            float r10 = r3.f5391n
            int r10 = (int) r10
            r4.<init>(r10, r11)
            G5.s.a(r2, r4, r5, r6)
        L_0x022b:
            boolean r3 = r3.f5393p
            if (r3 == 0) goto L_0x0237
            O0.e r3 = new O0.e
            r3.<init>()
            r2.setSpan(r3, r5, r6, r12)
        L_0x0237:
            int r1 = r1 + r11
            goto L_0x015f
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.i.a(java.lang.String, U1.f, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static ArrayList b(List list, String str, f fVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            String str2 = fVar.f5400a;
            if (!cVar.f5380a.isEmpty() || !cVar.f5381b.isEmpty() || !cVar.f5382c.isEmpty() || !cVar.f5383d.isEmpty()) {
                int a8 = c.a(cVar.f5383d, c.a(cVar.f5381b, c.a(cVar.f5380a, 0, str, b.MAX_POW2), str2, 2), fVar.f5402c, 4);
                if (a8 != -1) {
                    if (fVar.f5403d.containsAll(cVar.f5382c)) {
                        i = a8 + (cVar.f5382c.size() * 4);
                    }
                }
                i = 0;
            } else {
                i = TextUtils.isEmpty(str2);
            }
            if (i > 0) {
                arrayList.add(new g(i, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList b8 = b(list, str, fVar);
        for (int i = 0; i < b8.size(); i++) {
            int i8 = ((g) b8.get(i)).f5405V.f5392o;
            if (i8 != -1) {
                return i8;
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, r rVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String group = matcher.group(1);
            group.getClass();
            hVar.f5406a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            hVar.f5407b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, hVar);
            StringBuilder sb = new StringBuilder();
            rVar.getClass();
            String j7 = rVar.j(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(j7)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(j7.trim());
                j7 = rVar.j(StandardCharsets.UTF_8);
            }
            hVar.f5408c = f(str, arrayList, sb.toString());
            return new d(hVar.a().a(), hVar.f5406a, hVar.f5407b);
        } catch (NumberFormatException unused) {
            l.B("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r18, U1.h r19) {
        /*
            r0 = r19
            java.lang.String r1 = "start"
            java.lang.String r2 = "end"
            java.lang.String r3 = "middle"
            java.lang.String r4 = "center"
            r7 = 3
            r8 = 0
            r9 = -1
            r10 = 2
            r11 = 1
            java.lang.String r12 = "WebvttCueParser"
            java.util.regex.Pattern r13 = f5416b
            r14 = r18
            java.util.regex.Matcher r13 = r13.matcher(r14)
        L_0x0019:
            boolean r14 = r13.find()
            if (r14 == 0) goto L_0x018b
            java.lang.String r14 = r13.group(r11)
            r14.getClass()
            java.lang.String r15 = r13.group(r10)
            r15.getClass()
            java.lang.String r5 = "line"
            boolean r5 = r5.equals(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            if (r5 == 0) goto L_0x0039
            g(r15, r0)     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x0039:
            java.lang.String r5 = "align"
            boolean r5 = r5.equals(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            if (r5 == 0) goto L_0x009c
            int r5 = r15.hashCode()
            switch(r5) {
                case -1364013995: goto L_0x007b;
                case -1074341483: goto L_0x0072;
                case 100571: goto L_0x0069;
                case 3317767: goto L_0x005e;
                case 108511772: goto L_0x0053;
                case 109757538: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r5 = -1
            goto L_0x0083
        L_0x004a:
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x0051
            goto L_0x0048
        L_0x0051:
            r5 = 5
            goto L_0x0083
        L_0x0053:
            java.lang.String r5 = "right"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x005c
            goto L_0x0048
        L_0x005c:
            r5 = 4
            goto L_0x0083
        L_0x005e:
            java.lang.String r5 = "left"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x0067
            goto L_0x0048
        L_0x0067:
            r5 = 3
            goto L_0x0083
        L_0x0069:
            boolean r5 = r15.equals(r2)
            if (r5 != 0) goto L_0x0070
            goto L_0x0048
        L_0x0070:
            r5 = 2
            goto L_0x0083
        L_0x0072:
            boolean r5 = r15.equals(r3)
            if (r5 != 0) goto L_0x0079
            goto L_0x0048
        L_0x0079:
            r5 = 1
            goto L_0x0083
        L_0x007b:
            boolean r5 = r15.equals(r4)
            if (r5 != 0) goto L_0x0082
            goto L_0x0048
        L_0x0082:
            r5 = 0
        L_0x0083:
            switch(r5) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x0097;
                case 3: goto L_0x0095;
                case 4: goto L_0x0093;
                case 5: goto L_0x0091;
                default: goto L_0x0086;
            }
        L_0x0086:
            java.lang.String r5 = "Invalid alignment value: "
            java.lang.String r5 = r5.concat(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            P0.l.B(r12, r5)     // Catch:{ NumberFormatException -> 0x0174 }
        L_0x008f:
            r5 = 2
            goto L_0x0098
        L_0x0091:
            r5 = 1
            goto L_0x0098
        L_0x0093:
            r5 = 5
            goto L_0x0098
        L_0x0095:
            r5 = 4
            goto L_0x0098
        L_0x0097:
            r5 = 3
        L_0x0098:
            r0.f5409d = r5     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x009c:
            java.lang.String r5 = "position"
            boolean r5 = r5.equals(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == 0) goto L_0x011b
            r5 = 44
            int r5 = r15.indexOf(r5)     // Catch:{ NumberFormatException -> 0x0174 }
            if (r5 == r9) goto L_0x0113
            int r14 = r5 + 1
            java.lang.String r14 = r15.substring(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x0174 }
            int r17 = r14.hashCode()
            switch(r17) {
                case -1842484672: goto L_0x00ef;
                case -1364013995: goto L_0x00e6;
                case -1276788989: goto L_0x00db;
                case -1074341483: goto L_0x00d2;
                case 100571: goto L_0x00c9;
                case 109757538: goto L_0x00c0;
                default: goto L_0x00be;
            }
        L_0x00be:
            r6 = -1
            goto L_0x00f9
        L_0x00c0:
            boolean r17 = r14.equals(r1)
            if (r17 != 0) goto L_0x00c7
            goto L_0x00be
        L_0x00c7:
            r6 = 5
            goto L_0x00f9
        L_0x00c9:
            boolean r17 = r14.equals(r2)
            if (r17 != 0) goto L_0x00d0
            goto L_0x00be
        L_0x00d0:
            r6 = 4
            goto L_0x00f9
        L_0x00d2:
            boolean r17 = r14.equals(r3)
            if (r17 != 0) goto L_0x00d9
            goto L_0x00be
        L_0x00d9:
            r6 = 3
            goto L_0x00f9
        L_0x00db:
            java.lang.String r6 = "line-right"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x00e4
            goto L_0x00be
        L_0x00e4:
            r6 = 2
            goto L_0x00f9
        L_0x00e6:
            boolean r6 = r14.equals(r4)
            if (r6 != 0) goto L_0x00ed
            goto L_0x00be
        L_0x00ed:
            r6 = 1
            goto L_0x00f9
        L_0x00ef:
            java.lang.String r6 = "line-left"
            boolean r6 = r14.equals(r6)
            if (r6 != 0) goto L_0x00f8
            goto L_0x00be
        L_0x00f8:
            r6 = 0
        L_0x00f9:
            switch(r6) {
                case 0: goto L_0x010c;
                case 1: goto L_0x010a;
                case 2: goto L_0x0108;
                case 3: goto L_0x010a;
                case 4: goto L_0x0108;
                case 5: goto L_0x010c;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            java.lang.String r6 = "Invalid anchor value: "
            java.lang.String r6 = r6.concat(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            P0.l.B(r12, r6)     // Catch:{ NumberFormatException -> 0x0174 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x010d
        L_0x0108:
            r6 = 2
            goto L_0x010d
        L_0x010a:
            r6 = 1
            goto L_0x010d
        L_0x010c:
            r6 = 0
        L_0x010d:
            r0.i = r6     // Catch:{ NumberFormatException -> 0x0174 }
            java.lang.String r15 = r15.substring(r8, r5)     // Catch:{ NumberFormatException -> 0x0174 }
        L_0x0113:
            float r5 = U1.j.b(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            r0.f5412h = r5     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x011b:
            java.lang.String r5 = "size"
            boolean r5 = r5.equals(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            if (r5 == 0) goto L_0x012b
            float r5 = U1.j.b(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            r0.f5413j = r5     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x012b:
            java.lang.String r5 = "vertical"
            boolean r5 = r5.equals(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            if (r5 == 0) goto L_0x0156
            java.lang.String r5 = "lr"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x0151
            java.lang.String r5 = "rl"
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L_0x014f
            java.lang.String r5 = "Invalid 'vertical' value: "
            java.lang.String r5 = r5.concat(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            P0.l.B(r12, r5)     // Catch:{ NumberFormatException -> 0x0174 }
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0152
        L_0x014f:
            r5 = 1
            goto L_0x0152
        L_0x0151:
            r5 = 2
        L_0x0152:
            r0.f5414k = r5     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x0156:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0174 }
            r5.<init>()     // Catch:{ NumberFormatException -> 0x0174 }
            java.lang.String r6 = "Unknown cue setting "
            r5.append(r6)     // Catch:{ NumberFormatException -> 0x0174 }
            r5.append(r14)     // Catch:{ NumberFormatException -> 0x0174 }
            java.lang.String r6 = ":"
            r5.append(r6)     // Catch:{ NumberFormatException -> 0x0174 }
            r5.append(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            java.lang.String r5 = r5.toString()     // Catch:{ NumberFormatException -> 0x0174 }
            P0.l.B(r12, r5)     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0019
        L_0x0174:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping bad cue setting: "
            r5.<init>(r6)
            java.lang.String r6 = r13.group()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            P0.l.B(r12, r5)
            goto L_0x0019
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.i.e(java.lang.String, U1.h):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString f(java.lang.String r16, java.util.List r17, java.lang.String r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = -1
            r5 = 2
            r6 = 1
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r11 = 0
        L_0x0019:
            int r12 = r18.length()
            java.lang.String r13 = ""
            if (r11 >= r12) goto L_0x0212
            char r12 = r2.charAt(r11)
            java.lang.String r14 = " "
            r15 = 62
            r3 = 60
            r10 = 38
            if (r12 == r10) goto L_0x017f
            if (r12 == r3) goto L_0x0039
            r7.append(r12)
            int r11 = r11 + r6
        L_0x0035:
            r3 = 1
            r6 = -1
            goto L_0x020d
        L_0x0039:
            int r3 = r11 + 1
            int r10 = r18.length()
            if (r3 < r10) goto L_0x0043
        L_0x0041:
            r11 = r3
            goto L_0x0035
        L_0x0043:
            char r10 = r2.charAt(r3)
            r12 = 47
            if (r10 != r12) goto L_0x004d
            r10 = 1
            goto L_0x004e
        L_0x004d:
            r10 = 0
        L_0x004e:
            int r3 = r2.indexOf(r15, r3)
            if (r3 != r4) goto L_0x0059
            int r3 = r18.length()
            goto L_0x005a
        L_0x0059:
            int r3 = r3 + r6
        L_0x005a:
            int r15 = r3 + -2
            char r4 = r2.charAt(r15)
            if (r4 != r12) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r10 == 0) goto L_0x0069
            r12 = 2
            goto L_0x006a
        L_0x0069:
            r12 = 1
        L_0x006a:
            int r11 = r11 + r12
            if (r4 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            int r15 = r3 + -1
        L_0x0070:
            java.lang.String r11 = r2.substring(r11, r15)
            java.lang.String r12 = r11.trim()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0080
            goto L_0x00fe
        L_0x0080:
            java.lang.String r12 = r11.trim()
            boolean r15 = r12.isEmpty()
            r15 = r15 ^ r6
            P0.l.d(r15)
            int r15 = P0.z.f3748a
            java.lang.String r15 = "[ \\.]"
            java.lang.String[] r12 = r12.split(r15, r5)
            r15 = 0
            r12 = r12[r15]
            r12.getClass()
            int r15 = r12.hashCode()
            switch(r15) {
                case 98: goto L_0x00f1;
                case 99: goto L_0x00e6;
                case 105: goto L_0x00db;
                case 117: goto L_0x00d0;
                case 118: goto L_0x00c5;
                case 3650: goto L_0x00ba;
                case 3314158: goto L_0x00af;
                case 3511770: goto L_0x00a4;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r15 = -1
            goto L_0x00fb
        L_0x00a4:
            java.lang.String r15 = "ruby"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ad
            goto L_0x00a1
        L_0x00ad:
            r15 = 7
            goto L_0x00fb
        L_0x00af:
            java.lang.String r15 = "lang"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00b8
            goto L_0x00a1
        L_0x00b8:
            r15 = 6
            goto L_0x00fb
        L_0x00ba:
            java.lang.String r15 = "rt"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00c3
            goto L_0x00a1
        L_0x00c3:
            r15 = 5
            goto L_0x00fb
        L_0x00c5:
            java.lang.String r15 = "v"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ce
            goto L_0x00a1
        L_0x00ce:
            r15 = 4
            goto L_0x00fb
        L_0x00d0:
            java.lang.String r15 = "u"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00d9
            goto L_0x00a1
        L_0x00d9:
            r15 = 3
            goto L_0x00fb
        L_0x00db:
            java.lang.String r15 = "i"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00e4
            goto L_0x00a1
        L_0x00e4:
            r15 = 2
            goto L_0x00fb
        L_0x00e6:
            java.lang.String r15 = "c"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00ef
            goto L_0x00a1
        L_0x00ef:
            r15 = 1
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r15 = "b"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x00fa
            goto L_0x00a1
        L_0x00fa:
            r15 = 0
        L_0x00fb:
            switch(r15) {
                case 0: goto L_0x0102;
                case 1: goto L_0x0102;
                case 2: goto L_0x0102;
                case 3: goto L_0x0102;
                case 4: goto L_0x0102;
                case 5: goto L_0x0102;
                case 6: goto L_0x0102;
                case 7: goto L_0x0102;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            r11 = r3
            r4 = -1
            goto L_0x0019
        L_0x0102:
            if (r10 == 0) goto L_0x0135
        L_0x0104:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x010c
            goto L_0x0041
        L_0x010c:
            java.lang.Object r4 = r8.pop()
            U1.f r4 = (U1.f) r4
            a(r0, r4, r9, r7, r1)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x0128
            U1.e r10 = new U1.e
            int r11 = r7.length()
            r10.<init>(r4, r11)
            r9.add(r10)
            goto L_0x012b
        L_0x0128:
            r9.clear()
        L_0x012b:
            java.lang.String r4 = r4.f5400a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x0104
            goto L_0x0041
        L_0x0135:
            if (r4 != 0) goto L_0x0041
            int r4 = r7.length()
            java.lang.String r10 = r11.trim()
            boolean r11 = r10.isEmpty()
            r11 = r11 ^ r6
            P0.l.d(r11)
            int r11 = r10.indexOf(r14)
            r12 = -1
            if (r11 != r12) goto L_0x0150
            r14 = 0
            goto L_0x015d
        L_0x0150:
            java.lang.String r13 = r10.substring(r11)
            java.lang.String r13 = r13.trim()
            r14 = 0
            java.lang.String r10 = r10.substring(r14, r11)
        L_0x015d:
            java.lang.String r11 = "\\."
            java.lang.String[] r10 = r10.split(r11, r12)
            r11 = r10[r14]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r14 = 1
        L_0x016b:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x0175
            r15 = r10[r14]
            r12.add(r15)
            int r14 = r14 + r6
            goto L_0x016b
        L_0x0175:
            U1.f r10 = new U1.f
            r10.<init>(r11, r4, r13, r12)
            r8.push(r10)
            goto L_0x0041
        L_0x017f:
            int r11 = r11 + r6
            r4 = 59
            int r4 = r2.indexOf(r4, r11)
            r13 = 32
            int r5 = r2.indexOf(r13, r11)
            r6 = -1
            if (r4 != r6) goto L_0x0191
            r4 = r5
            goto L_0x0198
        L_0x0191:
            if (r5 != r6) goto L_0x0194
            goto L_0x0198
        L_0x0194:
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0198:
            if (r4 == r6) goto L_0x0209
            java.lang.String r11 = r2.substring(r11, r4)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case 3309: goto L_0x01cb;
                case 3464: goto L_0x01c0;
                case 96708: goto L_0x01b5;
                case 3374865: goto L_0x01aa;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            r12 = -1
            goto L_0x01d5
        L_0x01aa:
            java.lang.String r12 = "nbsp"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01b3
            goto L_0x01a8
        L_0x01b3:
            r12 = 3
            goto L_0x01d5
        L_0x01b5:
            java.lang.String r12 = "amp"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01be
            goto L_0x01a8
        L_0x01be:
            r12 = 2
            goto L_0x01d5
        L_0x01c0:
            java.lang.String r12 = "lt"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01c9
            goto L_0x01a8
        L_0x01c9:
            r12 = 1
            goto L_0x01d5
        L_0x01cb:
            java.lang.String r12 = "gt"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x01d4
            goto L_0x01a8
        L_0x01d4:
            r12 = 0
        L_0x01d5:
            switch(r12) {
                case 0: goto L_0x01fd;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01f1;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r10 = "ignoring unsupported entity: '&"
            r3.<init>(r10)
            r3.append(r11)
            java.lang.String r10 = ";'"
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r10 = "WebvttCueParser"
            P0.l.B(r10, r3)
            goto L_0x0200
        L_0x01f1:
            r7.append(r13)
            goto L_0x0200
        L_0x01f5:
            r7.append(r10)
            goto L_0x0200
        L_0x01f9:
            r7.append(r3)
            goto L_0x0200
        L_0x01fd:
            r7.append(r15)
        L_0x0200:
            if (r4 != r5) goto L_0x0205
            r7.append(r14)
        L_0x0205:
            r3 = 1
            int r4 = r4 + r3
            r11 = r4
            goto L_0x020d
        L_0x0209:
            r3 = 1
            r7.append(r12)
        L_0x020d:
            r4 = -1
            r5 = 2
            r6 = 1
            goto L_0x0019
        L_0x0212:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0222
            java.lang.Object r2 = r8.pop()
            U1.f r2 = (U1.f) r2
            a(r0, r2, r9, r7, r1)
            goto L_0x0212
        L_0x0222:
            U1.f r2 = new U1.f
            java.util.Set r3 = java.util.Collections.emptySet()
            r4 = 0
            r2.<init>(r13, r4, r13, r3)
            java.util.List r3 = java.util.Collections.emptyList()
            a(r0, r2, r3, r7, r1)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.i.f(java.lang.String, java.util.List, java.lang.String):android.text.SpannedString");
    }

    public static void g(String str, h hVar) {
        int i = 2;
        int indexOf = str.indexOf(44);
        char c8 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    l.B("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = RecyclerView.UNDEFINED_DURATION;
                    break;
            }
            hVar.f5411g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            hVar.e = j.b(str);
            hVar.f5410f = 0;
            return;
        }
        hVar.e = (float) Integer.parseInt(str);
        hVar.f5410f = 1;
    }
}
