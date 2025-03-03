package S1;

import M0.C0123k;
import M1.f;
import M1.k;
import M1.l;
import P0.c;
import P0.z;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class e implements l {

    /* renamed from: V  reason: collision with root package name */
    public static final Pattern f4415V = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: W  reason: collision with root package name */
    public static final Pattern f4416W = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f4417X = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f4418Y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f4419Z = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f4420a0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: b0  reason: collision with root package name */
    public static final Pattern f4421b0 = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: c0  reason: collision with root package name */
    public static final d f4422c0 = new d(30.0f, 1, 1);

    /* renamed from: U  reason: collision with root package name */
    public final XmlPullParserFactory f4423U;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f4423U = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static g b(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean c(String str) {
        if (str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information")) {
            return true;
        }
        return false;
    }

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f4421b0.matcher(attributeValue);
        if (!matcher.matches()) {
            P0.l.B("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            P0.l.c("Invalid cell resolution " + parseInt + " " + parseInt2, z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            P0.l.B("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, g gVar) {
        Matcher matcher;
        char c8 = 65535;
        int i = z.f3748a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f4417X;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            P0.l.B("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(N.e.z(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    gVar.f4439j = 3;
                    break;
                case 1:
                    gVar.f4439j = 2;
                    break;
                case 2:
                    gVar.f4439j = 1;
                    break;
                default:
                    throw new Exception(N.e.y("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f4440k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(N.e.y("Invalid expression for fontSize: '", str, "'."));
    }

    public static d f(XmlPullParser xmlPullParser) {
        int i;
        float f8;
        int i8;
        boolean z;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i9 = z.f3748a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                z = true;
            } else {
                z = false;
            }
            P0.l.c("frameRateMultiplier doesn't have 2 parts", z);
            f8 = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
        } else {
            f8 = 1.0f;
        }
        d dVar = f4422c0;
        int i10 = dVar.f4413b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        } else {
            i8 = dVar.f4414c;
        }
        return new d(((float) i) * f8, i10, i8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024d A[LOOP:0: B:1:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, M0.C0123k r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = 2
            r4 = -1
            r5 = 0
            r6 = 1
        L_0x000a:
            r20.next()
            java.lang.String r7 = "style"
            boolean r8 = P0.l.v(r0, r7)
            if (r8 == 0) goto L_0x0057
            java.lang.String r7 = P0.l.q(r0, r7)
            S1.g r8 = new S1.g
            r8.<init>()
            S1.g r8 = i(r0, r8)
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = r7.trim()
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0031
            java.lang.String[] r7 = new java.lang.String[r5]
            goto L_0x0039
        L_0x0031:
            int r9 = P0.z.f3748a
            java.lang.String r9 = "\\s+"
            java.lang.String[] r7 = r7.split(r9, r4)
        L_0x0039:
            int r9 = r7.length
            r10 = 0
        L_0x003b:
            if (r10 >= r9) goto L_0x004a
            r11 = r7[r10]
            java.lang.Object r11 = r1.get(r11)
            S1.g r11 = (S1.g) r11
            r8.a(r11)
            int r10 = r10 + r6
            goto L_0x003b
        L_0x004a:
            java.lang.String r7 = r8.f4441l
            if (r7 == 0) goto L_0x0051
            r1.put(r7, r8)
        L_0x0051:
            r5 = r24
        L_0x0053:
            r10 = r25
            goto L_0x0244
        L_0x0057:
            java.lang.String r7 = "region"
            boolean r7 = P0.l.v(r0, r7)
            java.lang.String r8 = "id"
            if (r7 == 0) goto L_0x0217
            java.lang.String r10 = P0.l.q(r0, r8)
            r7 = 0
            if (r10 != 0) goto L_0x006a
            goto L_0x020c
        L_0x006a:
            java.lang.String r8 = "origin"
            java.lang.String r8 = P0.l.q(r0, r8)
            java.lang.String r9 = "TtmlParser"
            if (r8 == 0) goto L_0x0207
            java.util.regex.Pattern r11 = f4419Z
            java.util.regex.Matcher r12 = r11.matcher(r8)
            java.util.regex.Pattern r13 = f4420a0
            java.util.regex.Matcher r14 = r13.matcher(r8)
            boolean r15 = r12.matches()
            java.lang.String r4 = "Ignoring region with missing tts:extent: "
            java.lang.String r5 = "Ignoring region with malformed origin: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r15 == 0) goto L_0x00b1
            java.lang.String r14 = r12.group(r6)     // Catch:{ NumberFormatException -> 0x00a8 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x00a8 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ NumberFormatException -> 0x00a8 }
            float r14 = r14 / r16
            java.lang.String r12 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x00a8 }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x00a8 }
            float r5 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x00a8 }
            float r5 = r5 / r16
            r12 = r14
            goto L_0x00e3
        L_0x00a8:
            java.lang.String r4 = r5.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x00b1:
            boolean r12 = r14.matches()
            if (r12 == 0) goto L_0x01fd
            if (r2 != 0) goto L_0x00c2
            java.lang.String r4 = r4.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x00c2:
            java.lang.String r12 = r14.group(r6)     // Catch:{ NumberFormatException -> 0x01f5 }
            r12.getClass()     // Catch:{ NumberFormatException -> 0x01f5 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01f5 }
            java.lang.String r14 = r14.group(r3)     // Catch:{ NumberFormatException -> 0x01f5 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x01f5 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x01f5 }
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01f5 }
            int r15 = r2.f2964b     // Catch:{ NumberFormatException -> 0x01f5 }
            float r15 = (float) r15     // Catch:{ NumberFormatException -> 0x01f5 }
            float r12 = r12 / r15
            float r14 = (float) r14     // Catch:{ NumberFormatException -> 0x01f5 }
            int r5 = r2.f2965c     // Catch:{ NumberFormatException -> 0x01f5 }
            float r5 = (float) r5
            float r5 = r14 / r5
        L_0x00e3:
            java.lang.String r14 = "extent"
            java.lang.String r14 = P0.l.q(r0, r14)
            if (r14 == 0) goto L_0x01ef
            java.util.regex.Matcher r11 = r11.matcher(r14)
            java.util.regex.Matcher r13 = r13.matcher(r14)
            boolean r14 = r11.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r14 == 0) goto L_0x0122
            java.lang.String r4 = r11.group(r6)     // Catch:{ NumberFormatException -> 0x0119 }
            r4.getClass()     // Catch:{ NumberFormatException -> 0x0119 }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0119 }
            float r4 = r4 / r16
            java.lang.String r11 = r11.group(r3)     // Catch:{ NumberFormatException -> 0x0119 }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x0119 }
            float r7 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x0119 }
            float r7 = r7 / r16
            r15 = r4
            r16 = r7
            goto L_0x0156
        L_0x0119:
            java.lang.String r4 = r15.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x0122:
            boolean r11 = r13.matches()
            if (r11 == 0) goto L_0x01e5
            if (r2 != 0) goto L_0x0133
            java.lang.String r4 = r4.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x0133:
            java.lang.String r4 = r13.group(r6)     // Catch:{ NumberFormatException -> 0x01dd }
            r4.getClass()     // Catch:{ NumberFormatException -> 0x01dd }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01dd }
            java.lang.String r11 = r13.group(r3)     // Catch:{ NumberFormatException -> 0x01dd }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x01dd }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01dd }
            float r4 = (float) r4     // Catch:{ NumberFormatException -> 0x01dd }
            int r13 = r2.f2964b     // Catch:{ NumberFormatException -> 0x01dd }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01dd }
            float r4 = r4 / r13
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01dd }
            int r7 = r2.f2965c     // Catch:{ NumberFormatException -> 0x01dd }
            float r7 = (float) r7
            float r11 = r11 / r7
            r15 = r4
            r16 = r11
        L_0x0156:
            java.lang.String r4 = "displayAlign"
            java.lang.String r4 = P0.l.q(r0, r4)
            if (r4 == 0) goto L_0x0182
            java.lang.String r4 = F.h.E(r4)
            r4.getClass()
            java.lang.String r7 = "center"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x017a
            java.lang.String r7 = "after"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0176
            goto L_0x0182
        L_0x0176:
            float r5 = r5 + r16
            r14 = 2
            goto L_0x0183
        L_0x017a:
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r16 / r4
            float r4 = r4 + r5
            r5 = r4
            r14 = 1
            goto L_0x0183
        L_0x0182:
            r14 = 0
        L_0x0183:
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = r22
            float r8 = (float) r7
            float r18 = r4 / r8
            java.lang.String r4 = "writingMode"
            java.lang.String r4 = P0.l.q(r0, r4)
            if (r4 == 0) goto L_0x01cc
            java.lang.String r4 = F.h.E(r4)
            r4.getClass()
            int r8 = r4.hashCode()
            switch(r8) {
                case 3694: goto L_0x01b8;
                case 3553396: goto L_0x01ad;
                case 3553576: goto L_0x01a2;
                default: goto L_0x01a0;
            }
        L_0x01a0:
            r4 = -1
            goto L_0x01c2
        L_0x01a2:
            java.lang.String r8 = "tbrl"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01ab
            goto L_0x01a0
        L_0x01ab:
            r4 = 2
            goto L_0x01c2
        L_0x01ad:
            java.lang.String r8 = "tblr"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01b6
            goto L_0x01a0
        L_0x01b6:
            r4 = 1
            goto L_0x01c2
        L_0x01b8:
            java.lang.String r8 = "tb"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x01c1
            goto L_0x01a0
        L_0x01c1:
            r4 = 0
        L_0x01c2:
            switch(r4) {
                case 0: goto L_0x01c9;
                case 1: goto L_0x01c9;
                case 2: goto L_0x01c6;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            goto L_0x01cc
        L_0x01c6:
            r19 = 1
            goto L_0x01d0
        L_0x01c9:
            r19 = 2
            goto L_0x01d0
        L_0x01cc:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01d0:
            S1.f r4 = new S1.f
            r13 = 0
            r17 = 1
            r9 = r4
            r11 = r12
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7 = r4
            goto L_0x020c
        L_0x01dd:
            java.lang.String r4 = r15.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x01e5:
            java.lang.String r4 = "Ignoring region with unsupported extent: "
            java.lang.String r4 = r4.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x01ef:
            java.lang.String r4 = "Ignoring region without an extent"
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x01f5:
            java.lang.String r4 = r5.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x01fd:
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            java.lang.String r4 = r4.concat(r8)
            P0.l.B(r9, r4)
            goto L_0x020c
        L_0x0207:
            java.lang.String r4 = "Ignoring region without an origin"
            P0.l.B(r9, r4)
        L_0x020c:
            if (r7 == 0) goto L_0x0051
            java.lang.String r4 = r7.f4424a
            r5 = r24
            r5.put(r4, r7)
            goto L_0x0053
        L_0x0217:
            r5 = r24
            java.lang.String r4 = "metadata"
            boolean r7 = P0.l.v(r0, r4)
            if (r7 == 0) goto L_0x0053
        L_0x0221:
            r20.next()
            java.lang.String r7 = "image"
            boolean r7 = P0.l.v(r0, r7)
            if (r7 == 0) goto L_0x023c
            java.lang.String r7 = P0.l.q(r0, r8)
            if (r7 == 0) goto L_0x023c
            java.lang.String r9 = r20.nextText()
            r10 = r25
            r10.put(r7, r9)
            goto L_0x023e
        L_0x023c:
            r10 = r25
        L_0x023e:
            boolean r7 = P0.l.t(r0, r4)
            if (r7 == 0) goto L_0x0221
        L_0x0244:
            java.lang.String r4 = "head"
            boolean r4 = P0.l.t(r0, r4)
            if (r4 == 0) goto L_0x024d
            return
        L_0x024d:
            r4 = -1
            r5 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.e.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, M0.k, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static S1.c h(org.xmlpull.v1.XmlPullParser r21, S1.c r22, java.util.HashMap r23, S1.d r24) {
        /*
            r0 = r21
            r11 = r22
            r1 = r24
            r2 = -1
            r3 = 1
            int r4 = r21.getAttributeCount()
            r5 = 0
            S1.g r7 = i(r0, r5)
            java.lang.String r6 = ""
            r10 = 0
            r12 = r5
            r14 = r12
            r13 = r6
            r5 = 0
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0027:
            if (r5 >= r4) goto L_0x00c6
            java.lang.String r6 = r0.getAttributeName(r5)
            java.lang.String r8 = r0.getAttributeValue(r5)
            r6.getClass()
            int r9 = r6.hashCode()
            switch(r9) {
                case -934795532: goto L_0x0074;
                case 99841: goto L_0x0069;
                case 100571: goto L_0x005e;
                case 93616297: goto L_0x0053;
                case 109780401: goto L_0x0048;
                case 1292595405: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r6 = -1
            goto L_0x007e
        L_0x003d:
            java.lang.String r9 = "backgroundImage"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0046
            goto L_0x003b
        L_0x0046:
            r6 = 5
            goto L_0x007e
        L_0x0048:
            java.lang.String r9 = "style"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0051
            goto L_0x003b
        L_0x0051:
            r6 = 4
            goto L_0x007e
        L_0x0053:
            java.lang.String r9 = "begin"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x005c
            goto L_0x003b
        L_0x005c:
            r6 = 3
            goto L_0x007e
        L_0x005e:
            java.lang.String r9 = "end"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0067
            goto L_0x003b
        L_0x0067:
            r6 = 2
            goto L_0x007e
        L_0x0069:
            java.lang.String r9 = "dur"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0072
            goto L_0x003b
        L_0x0072:
            r6 = 1
            goto L_0x007e
        L_0x0074:
            java.lang.String r9 = "region"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x007d
            goto L_0x003b
        L_0x007d:
            r6 = 0
        L_0x007e:
            switch(r6) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0091;
                case 5: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x008e
        L_0x0082:
            java.lang.String r6 = "#"
            boolean r6 = r8.startsWith(r6)
            if (r6 == 0) goto L_0x008e
            java.lang.String r14 = r8.substring(r3)
        L_0x008e:
            r6 = r23
            goto L_0x00c3
        L_0x0091:
            java.lang.String r6 = r8.trim()
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x009e
            java.lang.String[] r6 = new java.lang.String[r10]
            goto L_0x00a6
        L_0x009e:
            int r8 = P0.z.f3748a
            java.lang.String r8 = "\\s+"
            java.lang.String[] r6 = r6.split(r8, r2)
        L_0x00a6:
            int r8 = r6.length
            if (r8 <= 0) goto L_0x008e
            r12 = r6
            goto L_0x008e
        L_0x00ab:
            long r15 = j(r8, r1)
            goto L_0x008e
        L_0x00b0:
            long r17 = j(r8, r1)
            goto L_0x008e
        L_0x00b5:
            long r19 = j(r8, r1)
            goto L_0x008e
        L_0x00ba:
            r6 = r23
            boolean r9 = r6.containsKey(r8)
            if (r9 == 0) goto L_0x00c3
            r13 = r8
        L_0x00c3:
            int r5 = r5 + r3
            goto L_0x0027
        L_0x00c6:
            if (r11 == 0) goto L_0x00df
            long r1 = r11.f4404d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00e4
            int r5 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            long r15 = r15 + r1
        L_0x00d8:
            int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00e4
            long r17 = r17 + r1
            goto L_0x00e4
        L_0x00df:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e4:
            int r1 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00fb
            int r1 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00f1
            long r19 = r15 + r19
            r5 = r19
            goto L_0x00fd
        L_0x00f1:
            if (r11 == 0) goto L_0x00fb
            long r1 = r11.e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00fb
            r5 = r1
            goto L_0x00fd
        L_0x00fb:
            r5 = r17
        L_0x00fd:
            java.lang.String r1 = r21.getName()
            S1.c r17 = new S1.c
            r2 = 0
            r0 = r17
            r3 = r15
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.e.h(org.xmlpull.v1.XmlPullParser, S1.c, java.util.HashMap, S1.d):S1.c");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: S1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: android.text.Layout$Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: android.text.Layout$Alignment} */
    /* JADX WARNING: type inference failed for: r12v47, types: [S1.b] */
    /* JADX WARNING: type inference failed for: r11v38, types: [S1.b] */
    /* JADX WARNING: type inference failed for: r12v55, types: [S1.b] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x049e, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static S1.g i(org.xmlpull.v1.XmlPullParser r19, S1.g r20) {
        /*
            r1 = r19
            java.lang.String r2 = "none"
            java.lang.String r3 = "after"
            java.lang.String r4 = "before"
            java.lang.String r5 = "start"
            java.lang.String r6 = "right"
            java.lang.String r7 = "left"
            java.lang.String r8 = "end"
            java.lang.String r9 = "center"
            int r10 = r19.getAttributeCount()
            r0 = r20
            r14 = 0
        L_0x0019:
            if (r14 >= r10) goto L_0x0520
            java.lang.String r12 = r1.getAttributeValue(r14)
            java.lang.String r13 = r1.getAttributeName(r14)
            r13.getClass()
            r16 = 0
            java.lang.String r15 = "TtmlParser"
            int r17 = r13.hashCode()
            switch(r17) {
                case -1550943582: goto L_0x00e0;
                case -1224696685: goto L_0x00d4;
                case -1065511464: goto L_0x00c8;
                case -879295043: goto L_0x00bc;
                case -734428249: goto L_0x00b0;
                case 3355: goto L_0x00a5;
                case 3511770: goto L_0x009a;
                case 94842723: goto L_0x008f;
                case 109403361: goto L_0x0082;
                case 110138194: goto L_0x0075;
                case 365601008: goto L_0x0068;
                case 921125321: goto L_0x005b;
                case 1115953443: goto L_0x004e;
                case 1287124693: goto L_0x0041;
                case 1754920356: goto L_0x0034;
                default: goto L_0x0031;
            }
        L_0x0031:
            r11 = -1
            goto L_0x00eb
        L_0x0034:
            java.lang.String r11 = "multiRowAlign"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r11 = 14
            goto L_0x00eb
        L_0x0041:
            java.lang.String r11 = "backgroundColor"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x004a
            goto L_0x0031
        L_0x004a:
            r11 = 13
            goto L_0x00eb
        L_0x004e:
            java.lang.String r11 = "rubyPosition"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x0057
            goto L_0x0031
        L_0x0057:
            r11 = 12
            goto L_0x00eb
        L_0x005b:
            java.lang.String r11 = "textEmphasis"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x0064
            goto L_0x0031
        L_0x0064:
            r11 = 11
            goto L_0x00eb
        L_0x0068:
            java.lang.String r11 = "fontSize"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x0071
            goto L_0x0031
        L_0x0071:
            r11 = 10
            goto L_0x00eb
        L_0x0075:
            java.lang.String r11 = "textCombine"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x007e
            goto L_0x0031
        L_0x007e:
            r11 = 9
            goto L_0x00eb
        L_0x0082:
            java.lang.String r11 = "shear"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x008b
            goto L_0x0031
        L_0x008b:
            r11 = 8
            goto L_0x00eb
        L_0x008f:
            java.lang.String r11 = "color"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x0098
            goto L_0x0031
        L_0x0098:
            r11 = 7
            goto L_0x00eb
        L_0x009a:
            java.lang.String r11 = "ruby"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00a3
            goto L_0x0031
        L_0x00a3:
            r11 = 6
            goto L_0x00eb
        L_0x00a5:
            java.lang.String r11 = "id"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00ae
            goto L_0x0031
        L_0x00ae:
            r11 = 5
            goto L_0x00eb
        L_0x00b0:
            java.lang.String r11 = "fontWeight"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00ba
            goto L_0x0031
        L_0x00ba:
            r11 = 4
            goto L_0x00eb
        L_0x00bc:
            java.lang.String r11 = "textDecoration"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00c6
            goto L_0x0031
        L_0x00c6:
            r11 = 3
            goto L_0x00eb
        L_0x00c8:
            java.lang.String r11 = "textAlign"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00d2
            goto L_0x0031
        L_0x00d2:
            r11 = 2
            goto L_0x00eb
        L_0x00d4:
            java.lang.String r11 = "fontFamily"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00de
            goto L_0x0031
        L_0x00de:
            r11 = 1
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r11 = "fontStyle"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x00ea
            goto L_0x0031
        L_0x00ea:
            r11 = 0
        L_0x00eb:
            switch(r11) {
                case 0: goto L_0x0506;
                case 1: goto L_0x04f9;
                case 2: goto L_0x04a1;
                case 3: goto L_0x0438;
                case 4: goto L_0x0425;
                case 5: goto L_0x040c;
                case 6: goto L_0x038b;
                case 7: goto L_0x0372;
                case 8: goto L_0x0326;
                case 9: goto L_0x02fa;
                case 10: goto L_0x02e7;
                case 11: goto L_0x0184;
                case 12: goto L_0x0160;
                case 13: goto L_0x014b;
                case 14: goto L_0x00f1;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r18 = r3
            goto L_0x0144
        L_0x00f1:
            S1.g r0 = b(r0)
            java.lang.String r11 = F.h.E(r12)
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1364013995: goto L_0x0129;
                case 100571: goto L_0x0120;
                case 3317767: goto L_0x0117;
                case 108511772: goto L_0x010e;
                case 109757538: goto L_0x0105;
                default: goto L_0x0103;
            }
        L_0x0103:
            r11 = -1
            goto L_0x0131
        L_0x0105:
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x010c
            goto L_0x0103
        L_0x010c:
            r11 = 4
            goto L_0x0131
        L_0x010e:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x0115
            goto L_0x0103
        L_0x0115:
            r11 = 3
            goto L_0x0131
        L_0x0117:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x011e
            goto L_0x0103
        L_0x011e:
            r11 = 2
            goto L_0x0131
        L_0x0120:
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x0127
            goto L_0x0103
        L_0x0127:
            r11 = 1
            goto L_0x0131
        L_0x0129:
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0130
            goto L_0x0103
        L_0x0130:
            r11 = 0
        L_0x0131:
            switch(r11) {
                case 0: goto L_0x013d;
                case 1: goto L_0x013a;
                case 2: goto L_0x0137;
                case 3: goto L_0x013a;
                case 4: goto L_0x0137;
                default: goto L_0x0134;
            }
        L_0x0134:
            r11 = r16
            goto L_0x0140
        L_0x0137:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0134
        L_0x013a:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0134
        L_0x013d:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0134
        L_0x0140:
            r0.f4445p = r11
        L_0x0142:
            r18 = r3
        L_0x0144:
            r1 = 4
            r3 = 2
            r11 = 3
        L_0x0147:
            r12 = 1
            r13 = 0
            goto L_0x0519
        L_0x014b:
            S1.g r0 = b(r0)
            r11 = 0
            int r13 = P0.b.a(r12, r11)     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.f4435d = r13     // Catch:{ IllegalArgumentException -> 0x015a }
            r11 = 1
            r0.e = r11     // Catch:{ IllegalArgumentException -> 0x015a }
            goto L_0x0142
        L_0x015a:
            java.lang.String r11 = "Failed parsing background value: "
            N.e.H(r11, r12, r15)
            goto L_0x0142
        L_0x0160:
            java.lang.String r11 = F.h.E(r12)
            r11.getClass()
            boolean r12 = r11.equals(r4)
            if (r12 != 0) goto L_0x017c
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0174
            goto L_0x0142
        L_0x0174:
            S1.g r0 = b(r0)
            r11 = 2
            r0.f4443n = r11
            goto L_0x0142
        L_0x017c:
            S1.g r0 = b(r0)
            r11 = 1
            r0.f4443n = r11
            goto L_0x0142
        L_0x0184:
            S1.g r0 = b(r0)
            java.util.regex.Pattern r11 = S1.b.f4394d
            if (r12 != 0) goto L_0x0192
        L_0x018c:
            r18 = r3
        L_0x018e:
            r1 = r16
            goto L_0x02e3
        L_0x0192:
            java.lang.String r11 = r12.trim()
            java.lang.String r11 = F.h.E(r11)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x01a1
            goto L_0x018c
        L_0x01a1:
            java.util.regex.Pattern r12 = S1.b.f4394d
            java.lang.String[] r11 = android.text.TextUtils.split(r11, r12)
            int r12 = r11.length
            if (r12 == 0) goto L_0x01c3
            r13 = 1
            if (r12 == r13) goto L_0x01b9
            int r12 = r11.length
            java.lang.Object r11 = r11.clone()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            H3.U r11 = H3.U.j(r12, r11)
            goto L_0x01c5
        L_0x01b9:
            r12 = 0
            r11 = r11[r12]
            H3.v0 r12 = new H3.v0
            r12.<init>(r11)
            r11 = r12
            goto L_0x01c5
        L_0x01c3:
            H3.o0 r11 = H3.o0.f2104d0
        L_0x01c5:
            H3.U r12 = S1.b.f4397h
            H3.r0 r12 = H3.C0103u.n(r12, r11)
            java.lang.String r13 = "outside"
            java.lang.Object r12 = H3.C0103u.k(r12, r13)
            java.lang.String r12 = (java.lang.String) r12
            int r15 = r12.hashCode()
            r1 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r15 == r1) goto L_0x01f7
            r1 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r15 == r1) goto L_0x01ef
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r15 == r1) goto L_0x01e7
            goto L_0x01ff
        L_0x01e7:
            boolean r1 = r12.equals(r3)
            if (r1 == 0) goto L_0x01ff
            r1 = 0
            goto L_0x0200
        L_0x01ef:
            boolean r1 = r12.equals(r13)
            if (r1 == 0) goto L_0x01ff
            r1 = 1
            goto L_0x0200
        L_0x01f7:
            boolean r1 = r12.equals(r4)
            if (r1 == 0) goto L_0x01ff
            r1 = 2
            goto L_0x0200
        L_0x01ff:
            r1 = -1
        L_0x0200:
            if (r1 == 0) goto L_0x0209
            r12 = 1
            if (r1 == r12) goto L_0x0207
            r1 = 1
            goto L_0x020a
        L_0x0207:
            r1 = -2
            goto L_0x020a
        L_0x0209:
            r1 = 2
        L_0x020a:
            H3.U r12 = S1.b.e
            H3.r0 r12 = H3.C0103u.n(r12, r11)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x024b
            H3.V r11 = new H3.V
            r11.<init>(r12)
            java.lang.Object r11 = r11.next()
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r11.hashCode()
            r13 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r12 == r13) goto L_0x0238
            r13 = 3387192(0x33af38, float:4.746467E-39)
            if (r12 == r13) goto L_0x0230
            goto L_0x023e
        L_0x0230:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x023e
            r11 = 0
            goto L_0x023f
        L_0x0238:
            java.lang.String r12 = "auto"
            boolean r11 = r11.equals(r12)
        L_0x023e:
            r11 = -1
        L_0x023f:
            S1.b r12 = new S1.b
            r13 = 0
            r12.<init>(r11, r13, r1)
            r18 = r3
        L_0x0247:
            r16 = r12
            goto L_0x018e
        L_0x024b:
            r13 = 0
            H3.U r12 = S1.b.f4396g
            H3.r0 r12 = H3.C0103u.n(r12, r11)
            H3.U r15 = S1.b.f4395f
            H3.r0 r11 = H3.C0103u.n(r15, r11)
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x0270
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x0270
            S1.b r11 = new S1.b
            r15 = -1
            r11.<init>(r15, r13, r1)
            r18 = r3
            r16 = r11
            goto L_0x018e
        L_0x0270:
            r15 = -1
            java.lang.String r13 = "filled"
            java.lang.Object r12 = H3.C0103u.k(r12, r13)
            java.lang.String r12 = (java.lang.String) r12
            int r15 = r12.hashCode()
            r18 = r3
            r3 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r15 == r3) goto L_0x0294
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r15 == r3) goto L_0x028a
            goto L_0x0298
        L_0x028a:
            java.lang.String r3 = "open"
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L_0x0298
            r3 = 2
            goto L_0x0299
        L_0x0294:
            boolean r3 = r12.equals(r13)
        L_0x0298:
            r3 = 1
        L_0x0299:
            java.lang.String r12 = "circle"
            java.lang.Object r11 = H3.C0103u.k(r11, r12)
            java.lang.String r11 = (java.lang.String) r11
            int r13 = r11.hashCode()
            r15 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r13 == r15) goto L_0x02c9
            r12 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r13 == r12) goto L_0x02bf
            r12 = 99657(0x18549, float:1.39649E-40)
            if (r13 == r12) goto L_0x02b5
            goto L_0x02d1
        L_0x02b5:
            java.lang.String r12 = "dot"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x02d1
            r11 = 0
            goto L_0x02d2
        L_0x02bf:
            java.lang.String r12 = "sesame"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x02d1
            r11 = 1
            goto L_0x02d2
        L_0x02c9:
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x02d1
            r11 = 2
            goto L_0x02d2
        L_0x02d1:
            r11 = -1
        L_0x02d2:
            if (r11 == 0) goto L_0x02db
            r12 = 1
            if (r11 == r12) goto L_0x02d9
            r11 = 1
            goto L_0x02dc
        L_0x02d9:
            r11 = 3
            goto L_0x02dc
        L_0x02db:
            r11 = 2
        L_0x02dc:
            S1.b r12 = new S1.b
            r12.<init>(r11, r3, r1)
            goto L_0x0247
        L_0x02e3:
            r0.f4447r = r1
            goto L_0x0144
        L_0x02e7:
            r18 = r3
            r1 = -1
            S1.g r0 = b(r0)     // Catch:{ f -> 0x02f3 }
            e(r12, r0)     // Catch:{ f -> 0x02f3 }
            goto L_0x0144
        L_0x02f3:
            java.lang.String r3 = "Failed parsing fontSize value: "
            N.e.H(r3, r12, r15)
            goto L_0x0144
        L_0x02fa:
            r18 = r3
            r1 = -1
            java.lang.String r3 = F.h.E(r12)
            r3.getClass()
            java.lang.String r11 = "all"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x031d
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0314
            goto L_0x0144
        L_0x0314:
            S1.g r0 = b(r0)
            r3 = 0
            r0.f4446q = r3
            goto L_0x0144
        L_0x031d:
            S1.g r0 = b(r0)
            r3 = 1
            r0.f4446q = r3
            goto L_0x0144
        L_0x0326:
            r18 = r3
            r1 = -1
            S1.g r3 = b(r0)
            java.util.regex.Pattern r0 = f4418Y
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r11 = r0.matches()
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r11 != 0) goto L_0x0342
            java.lang.String r0 = "Invalid value for shear: "
            N.e.H(r0, r12, r15)
            goto L_0x036d
        L_0x0342:
            r11 = 1
            java.lang.String r0 = r0.group(r11)     // Catch:{ NumberFormatException -> 0x035b }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x035b }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x035b }
            r11 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r11, r0)     // Catch:{ NumberFormatException -> 0x035b }
            r11 = 1120403456(0x42c80000, float:100.0)
            float r13 = java.lang.Math.min(r11, r0)     // Catch:{ NumberFormatException -> 0x035b }
            goto L_0x036d
        L_0x035b:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to parse shear: "
            r11.<init>(r1)
            r11.append(r12)
            java.lang.String r1 = r11.toString()
            P0.l.C(r15, r1, r0)
        L_0x036d:
            r3.f4448s = r13
            r0 = r3
            goto L_0x0144
        L_0x0372:
            r18 = r3
            S1.g r0 = b(r0)
            r1 = 0
            int r3 = P0.b.a(r12, r1)     // Catch:{ IllegalArgumentException -> 0x0384 }
            r0.f4433b = r3     // Catch:{ IllegalArgumentException -> 0x0384 }
            r1 = 1
            r0.f4434c = r1     // Catch:{ IllegalArgumentException -> 0x0384 }
            goto L_0x0144
        L_0x0384:
            java.lang.String r1 = "Failed parsing color value: "
            N.e.H(r1, r12, r15)
            goto L_0x0144
        L_0x038b:
            r18 = r3
            java.lang.String r1 = F.h.E(r12)
            r1.getClass()
            int r3 = r1.hashCode()
            switch(r3) {
                case -618561360: goto L_0x03d4;
                case -410956671: goto L_0x03c9;
                case -250518009: goto L_0x03be;
                case -136074796: goto L_0x03b3;
                case 3016401: goto L_0x03a8;
                case 3556653: goto L_0x039d;
                default: goto L_0x039b;
            }
        L_0x039b:
            r1 = -1
            goto L_0x03de
        L_0x039d:
            java.lang.String r3 = "text"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03a6
            goto L_0x039b
        L_0x03a6:
            r1 = 5
            goto L_0x03de
        L_0x03a8:
            java.lang.String r3 = "base"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03b1
            goto L_0x039b
        L_0x03b1:
            r1 = 4
            goto L_0x03de
        L_0x03b3:
            java.lang.String r3 = "textContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03bc
            goto L_0x039b
        L_0x03bc:
            r1 = 3
            goto L_0x03de
        L_0x03be:
            java.lang.String r3 = "delimiter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03c7
            goto L_0x039b
        L_0x03c7:
            r1 = 2
            goto L_0x03de
        L_0x03c9:
            java.lang.String r3 = "container"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03d2
            goto L_0x039b
        L_0x03d2:
            r1 = 1
            goto L_0x03de
        L_0x03d4:
            java.lang.String r3 = "baseContainer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x03dd
            goto L_0x039b
        L_0x03dd:
            r1 = 0
        L_0x03de:
            switch(r1) {
                case 0: goto L_0x0401;
                case 1: goto L_0x03f7;
                case 2: goto L_0x03ee;
                case 3: goto L_0x03e3;
                case 4: goto L_0x0401;
                case 5: goto L_0x03e3;
                default: goto L_0x03e1;
            }
        L_0x03e1:
            goto L_0x0144
        L_0x03e3:
            S1.g r0 = b(r0)
            r11 = 3
            r0.f4442m = r11
            r1 = 4
        L_0x03eb:
            r3 = 2
            goto L_0x0147
        L_0x03ee:
            r11 = 3
            S1.g r0 = b(r0)
            r1 = 4
            r0.f4442m = r1
            goto L_0x03eb
        L_0x03f7:
            r1 = 4
            r11 = 3
            S1.g r0 = b(r0)
            r3 = 1
            r0.f4442m = r3
            goto L_0x03eb
        L_0x0401:
            r1 = 4
            r11 = 3
            S1.g r0 = b(r0)
            r3 = 2
            r0.f4442m = r3
            goto L_0x0147
        L_0x040c:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            java.lang.String r13 = "style"
            java.lang.String r15 = r19.getName()
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0147
            S1.g r0 = b(r0)
            r0.f4441l = r12
            goto L_0x0147
        L_0x0425:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            S1.g r0 = b(r0)
            java.lang.String r13 = "bold"
            boolean r12 = r13.equalsIgnoreCase(r12)
            r0.f4438h = r12
            goto L_0x0147
        L_0x0438:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            java.lang.String r12 = F.h.E(r12)
            r12.getClass()
            int r13 = r12.hashCode()
            switch(r13) {
                case -1461280213: goto L_0x046e;
                case -1026963764: goto L_0x0463;
                case 913457136: goto L_0x0458;
                case 1679736913: goto L_0x044d;
                default: goto L_0x044b;
            }
        L_0x044b:
            r12 = -1
            goto L_0x0478
        L_0x044d:
            java.lang.String r13 = "linethrough"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0456
            goto L_0x044b
        L_0x0456:
            r12 = 3
            goto L_0x0478
        L_0x0458:
            java.lang.String r13 = "nolinethrough"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0461
            goto L_0x044b
        L_0x0461:
            r12 = 2
            goto L_0x0478
        L_0x0463:
            java.lang.String r13 = "underline"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x046c
            goto L_0x044b
        L_0x046c:
            r12 = 1
            goto L_0x0478
        L_0x046e:
            java.lang.String r13 = "nounderline"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0477
            goto L_0x044b
        L_0x0477:
            r12 = 0
        L_0x0478:
            switch(r12) {
                case 0: goto L_0x0497;
                case 1: goto L_0x048e;
                case 2: goto L_0x0485;
                case 3: goto L_0x047d;
                default: goto L_0x047b;
            }
        L_0x047b:
            r13 = 0
            goto L_0x049e
        L_0x047d:
            S1.g r0 = b(r0)
            r12 = 1
            r0.f4436f = r12
            goto L_0x047b
        L_0x0485:
            r12 = 1
            S1.g r0 = b(r0)
            r13 = 0
            r0.f4436f = r13
            goto L_0x049e
        L_0x048e:
            r12 = 1
            r13 = 0
            S1.g r0 = b(r0)
            r0.f4437g = r12
            goto L_0x049e
        L_0x0497:
            r13 = 0
            S1.g r0 = b(r0)
            r0.f4437g = r13
        L_0x049e:
            r12 = 1
            goto L_0x0519
        L_0x04a1:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            r13 = 0
            S1.g r0 = b(r0)
            java.lang.String r12 = F.h.E(r12)
            r12.getClass()
            int r15 = r12.hashCode()
            switch(r15) {
                case -1364013995: goto L_0x04df;
                case 100571: goto L_0x04d6;
                case 3317767: goto L_0x04cd;
                case 108511772: goto L_0x04c4;
                case 109757538: goto L_0x04bb;
                default: goto L_0x04b9;
            }
        L_0x04b9:
            r12 = -1
            goto L_0x04e7
        L_0x04bb:
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x04c2
            goto L_0x04b9
        L_0x04c2:
            r12 = 4
            goto L_0x04e7
        L_0x04c4:
            boolean r12 = r12.equals(r6)
            if (r12 != 0) goto L_0x04cb
            goto L_0x04b9
        L_0x04cb:
            r12 = 3
            goto L_0x04e7
        L_0x04cd:
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x04d4
            goto L_0x04b9
        L_0x04d4:
            r12 = 2
            goto L_0x04e7
        L_0x04d6:
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x04dd
            goto L_0x04b9
        L_0x04dd:
            r12 = 1
            goto L_0x04e7
        L_0x04df:
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x04e6
            goto L_0x04b9
        L_0x04e6:
            r12 = 0
        L_0x04e7:
            switch(r12) {
                case 0: goto L_0x04f3;
                case 1: goto L_0x04f0;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04f0;
                case 4: goto L_0x04ed;
                default: goto L_0x04ea;
            }
        L_0x04ea:
            r12 = r16
            goto L_0x04f6
        L_0x04ed:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x04ea
        L_0x04f0:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x04ea
        L_0x04f3:
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x04ea
        L_0x04f6:
            r0.f4444o = r12
            goto L_0x049e
        L_0x04f9:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            r13 = 0
            S1.g r0 = b(r0)
            r0.f4432a = r12
            goto L_0x049e
        L_0x0506:
            r18 = r3
            r1 = 4
            r3 = 2
            r11 = 3
            r13 = 0
            S1.g r0 = b(r0)
            java.lang.String r15 = "italic"
            boolean r12 = r15.equalsIgnoreCase(r12)
            r0.i = r12
            goto L_0x049e
        L_0x0519:
            int r14 = r14 + r12
            r1 = r19
            r3 = r18
            goto L_0x0019
        L_0x0520:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.e.i(org.xmlpull.v1.XmlPullParser, S1.g):S1.g");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
        if (r13.equals("ms") == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long j(java.lang.String r13, S1.d r14) {
        /*
            r0 = 4
            r1 = 3
            java.util.regex.Pattern r2 = f4415V
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x007e
            java.lang.String r13 = r2.group(r7)
            r13.getClass()
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r2.group(r6)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r1)
            r13.getClass()
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r0)
            r0 = 0
            if (r13 == 0) goto L_0x0050
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0051
        L_0x0050:
            r9 = r0
        L_0x0051:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0063
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r3 = r14.f4412a
            float r13 = r13 / r3
            double r9 = (double) r13
            goto L_0x0064
        L_0x0063:
            r9 = r0
        L_0x0064:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0079
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f4413b
            double r2 = (double) r13
            double r0 = r0 / r2
            float r13 = r14.f4412a
            double r13 = (double) r13
            double r0 = r0 / r13
        L_0x0079:
            double r7 = r7 + r0
            double r7 = r7 * r4
            long r13 = (long) r7
            return r13
        L_0x007e:
            java.util.regex.Pattern r2 = f4416W
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x00fc
            java.lang.String r13 = r2.group(r7)
            r13.getClass()
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r2.group(r6)
            r13.getClass()
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case 102: goto L_0x00d0;
                case 104: goto L_0x00c5;
                case 109: goto L_0x00ba;
                case 116: goto L_0x00af;
                case 3494: goto L_0x00a6;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r0 = -1
            goto L_0x00da
        L_0x00a6:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00da
            goto L_0x00a4
        L_0x00af:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00b8
            goto L_0x00a4
        L_0x00b8:
            r0 = 3
            goto L_0x00da
        L_0x00ba:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c3
            goto L_0x00a4
        L_0x00c3:
            r0 = 2
            goto L_0x00da
        L_0x00c5:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ce
            goto L_0x00a4
        L_0x00ce:
            r0 = 1
            goto L_0x00da
        L_0x00d0:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d9
            goto L_0x00a4
        L_0x00d9:
            r0 = 0
        L_0x00da:
            switch(r0) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00e5;
                case 4: goto L_0x00de;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            goto L_0x00f8
        L_0x00de:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00e3:
            double r8 = r8 / r13
            goto L_0x00f8
        L_0x00e5:
            int r13 = r14.f4414c
            double r13 = (double) r13
            goto L_0x00e3
        L_0x00e9:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00eb:
            double r8 = r8 * r13
            goto L_0x00f8
        L_0x00ee:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00eb
        L_0x00f4:
            float r13 = r14.f4412a
            double r13 = (double) r13
            goto L_0x00e3
        L_0x00f8:
            double r8 = r8 * r4
            long r13 = (long) r8
            return r13
        L_0x00fc:
            M1.f r14 = new M1.f
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = u.C1477r.d(r0, r13)
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.e.j(java.lang.String, S1.d):long");
    }

    public static C0123k k(XmlPullParser xmlPullParser) {
        String q7 = P0.l.q(xmlPullParser, "extent");
        if (q7 == null) {
            return null;
        }
        Matcher matcher = f4420a0.matcher(q7);
        if (!matcher.matches()) {
            P0.l.B("TtmlParser", "Ignoring non-pixel tts extent: ".concat(q7));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0123k(parseInt, Integer.parseInt(group2), 4);
        } catch (NumberFormatException unused) {
            P0.l.B("TtmlParser", "Ignoring malformed tts extent: ".concat(q7));
            return null;
        }
    }

    public final void D(byte[] bArr, int i, int i8, k kVar, c cVar) {
        d.v(o(bArr, i, i8), kVar, cVar);
    }

    public final /* synthetic */ void a() {
    }

    public final M1.d o(byte[] bArr, int i, int i8) {
        d dVar;
        try {
            XmlPullParser newPullParser = this.f4423U.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION));
            C0123k kVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i8), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar2 = f4422c0;
            int i9 = 15;
            C7.d dVar3 = null;
            int i10 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = f(newPullParser);
                            i9 = d(newPullParser);
                            kVar = k(newPullParser);
                        }
                        C0123k kVar2 = kVar;
                        d dVar4 = dVar2;
                        int i11 = i9;
                        if (!c(name)) {
                            P0.l.s("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i10++;
                            dVar2 = dVar4;
                        } else {
                            if ("head".equals(name)) {
                                dVar = dVar4;
                                g(newPullParser, hashMap, i11, kVar2, hashMap2, hashMap3);
                            } else {
                                dVar = dVar4;
                                try {
                                    c h5 = h(newPullParser, cVar, hashMap2, dVar);
                                    arrayDeque.push(h5);
                                    if (cVar != null) {
                                        if (cVar.f4411m == null) {
                                            cVar.f4411m = new ArrayList();
                                        }
                                        cVar.f4411m.add(h5);
                                    }
                                } catch (f e) {
                                    P0.l.C("TtmlParser", "Suppressing parser error", e);
                                    i10++;
                                }
                            }
                            dVar2 = dVar;
                        }
                        kVar = kVar2;
                        i9 = i11;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a8 = c.a(newPullParser.getText());
                        if (cVar.f4411m == null) {
                            cVar.f4411m = new ArrayList();
                        }
                        cVar.f4411m.add(a8);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            dVar3 = new C7.d(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            dVar3.getClass();
            return dVar3;
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        } catch (IOException e9) {
            throw new IllegalStateException("Unexpected error when reading input.", e9);
        }
    }

    public final int y() {
        return 1;
    }
}
