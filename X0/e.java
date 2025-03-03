package X0;

import B.q0;
import F.h;
import H3.C0103u;
import M0.J;
import P0.l;
import P0.z;
import R0.j;
import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.r;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class e extends DefaultHandler implements r {

    /* renamed from: V  reason: collision with root package name */
    public static final Pattern f6231V = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: W  reason: collision with root package name */
    public static final Pattern f6232W = Pattern.compile("CC([1-4])=.*");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f6233X = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: Y  reason: collision with root package name */
    public static final int[] f6234Y = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: U  reason: collision with root package name */
    public final XmlPullParserFactory f6235U;

    public e() {
        try {
            this.f6235U = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long a(ArrayList arrayList, long j7, long j8, int i, long j9) {
        int i8;
        if (i >= 0) {
            i8 = i + 1;
        } else {
            int i9 = z.f3748a;
            i8 = (int) ((((j9 - j7) + j8) - 1) / j8);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList.add(new q(j7, j8));
            j7 += j8;
        }
        return j7;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (l.u(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (l.u(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r0 == 0) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r8.equals("fa01") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fd, code lost:
        if (r0 < 33) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            r0 = 6
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = -1
            r8 = 0
            java.lang.String r9 = "schemeIdUri"
            java.lang.String r9 = r12.getAttributeValue(r8, r9)
            if (r9 != 0) goto L_0x0012
            r9 = r8
        L_0x0012:
            r9.getClass()
            java.lang.String r10 = "value"
            int r11 = r9.hashCode()
            switch(r11) {
                case -2128649360: goto L_0x0062;
                case -1352850286: goto L_0x0057;
                case -1138141449: goto L_0x004c;
                case -986633423: goto L_0x0041;
                case -79006963: goto L_0x0036;
                case 312179081: goto L_0x002b;
                case 2036691300: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            r9 = -1
            goto L_0x006c
        L_0x0020:
            java.lang.String r11 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0029
            goto L_0x001e
        L_0x0029:
            r9 = 6
            goto L_0x006c
        L_0x002b:
            java.lang.String r11 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0034
            goto L_0x001e
        L_0x0034:
            r9 = 5
            goto L_0x006c
        L_0x0036:
            java.lang.String r11 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x003f
            goto L_0x001e
        L_0x003f:
            r9 = 4
            goto L_0x006c
        L_0x0041:
            java.lang.String r11 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            r9 = 3
            goto L_0x006c
        L_0x004c:
            java.lang.String r11 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0055
            goto L_0x001e
        L_0x0055:
            r9 = 2
            goto L_0x006c
        L_0x0057:
            java.lang.String r11 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0060
            goto L_0x001e
        L_0x0060:
            r9 = 1
            goto L_0x006c
        L_0x0062:
            java.lang.String r11 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x006b
            goto L_0x001e
        L_0x006b:
            r9 = 0
        L_0x006c:
            switch(r9) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00f0;
                case 2: goto L_0x0096;
                case 3: goto L_0x0087;
                case 4: goto L_0x00f5;
                case 5: goto L_0x0071;
                case 6: goto L_0x0096;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0100
        L_0x0071:
            java.lang.String r0 = r12.getAttributeValue(r8, r10)
            if (r0 != 0) goto L_0x0079
            goto L_0x0100
        L_0x0079:
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 != 0) goto L_0x00ee
            goto L_0x0100
        L_0x0087:
            int r0 = k(r12, r10, r7)
            if (r0 < 0) goto L_0x0100
            int[] r1 = f6234Y
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0100
            r7 = r1[r0]
            goto L_0x0100
        L_0x0096:
            java.lang.String r8 = r12.getAttributeValue(r8, r10)
            if (r8 != 0) goto L_0x009e
        L_0x009c:
            r0 = -1
            goto L_0x00ee
        L_0x009e:
            java.lang.String r8 = F.h.E(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case 1596796: goto L_0x00d8;
                case 2937391: goto L_0x00cd;
                case 3094034: goto L_0x00c2;
                case 3094035: goto L_0x00b7;
                case 3133436: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r2 = -1
            goto L_0x00e2
        L_0x00ae:
            java.lang.String r3 = "fa01"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00e2
            goto L_0x00ac
        L_0x00b7:
            java.lang.String r2 = "f801"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00c0
            goto L_0x00ac
        L_0x00c0:
            r2 = 3
            goto L_0x00e2
        L_0x00c2:
            java.lang.String r2 = "f800"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00cb
            goto L_0x00ac
        L_0x00cb:
            r2 = 2
            goto L_0x00e2
        L_0x00cd:
            java.lang.String r2 = "a000"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ac
        L_0x00d6:
            r2 = 1
            goto L_0x00e2
        L_0x00d8:
            java.lang.String r2 = "4000"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00e1
            goto L_0x00ac
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            switch(r2) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00ee;
                case 4: goto L_0x00e6;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x009c
        L_0x00e6:
            r0 = 8
            goto L_0x00ee
        L_0x00e9:
            r0 = 5
            goto L_0x00ee
        L_0x00eb:
            r0 = 2
            goto L_0x00ee
        L_0x00ed:
            r0 = 1
        L_0x00ee:
            r7 = r0
            goto L_0x0100
        L_0x00f0:
            int r7 = k(r12, r10, r7)
            goto L_0x0100
        L_0x00f5:
            int r0 = k(r12, r10, r7)
            if (r0 <= 0) goto L_0x0100
            r1 = 33
            if (r0 >= r1) goto L_0x0100
            goto L_0x00ee
        L_0x0100:
            r12.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = P0.l.t(r12, r0)
            if (r0 == 0) goto L_0x0100
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j7;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z) {
        int i;
        int i8;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else if (z) {
            i = 1;
        } else {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        if (attributeValue2 != null) {
            i8 = Integer.parseInt(attributeValue2);
        } else {
            i8 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!l.t(xmlPullParser, "BaseURL"));
        if (str2 == null || l.r(str2)[0] == -1) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                b bVar = (b) list.get(i9);
                String y8 = l.y(bVar.f6210a, str2);
                if (attributeValue3 == null) {
                    str = y8;
                } else {
                    str = attributeValue3;
                }
                if (z) {
                    i = bVar.f6212c;
                    i8 = bVar.f6213d;
                    str = bVar.f6211b;
                }
                arrayList.add(new b(y8, i, str, i8));
            }
            return arrayList;
        }
        if (attributeValue3 == null) {
            attributeValue3 = str2;
        }
        return C0103u.p(new b(str2, i, attributeValue3, i8));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        r2 = null;
        r8 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "schemeIdUri"
            java.lang.String r2 = r14.getAttributeValue(r1, r2)
            r3 = -1
            r4 = 58
            java.lang.String r5 = "MpdParser"
            r6 = 0
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = F.h.E(r2)
            r2.getClass()
            int r7 = r2.hashCode()
            switch(r7) {
                case -1980789791: goto L_0x0041;
                case 489446379: goto L_0x0036;
                case 755418770: goto L_0x002b;
                case 1812765994: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            r2 = -1
            goto L_0x004b
        L_0x0020:
            java.lang.String r7 = "urn:mpeg:dash:mp4protection:2011"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0029
            goto L_0x001e
        L_0x0029:
            r2 = 3
            goto L_0x004b
        L_0x002b:
            java.lang.String r7 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0034
            goto L_0x001e
        L_0x0034:
            r2 = 2
            goto L_0x004b
        L_0x0036:
            java.lang.String r7 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x003f
            goto L_0x001e
        L_0x003f:
            r2 = 1
            goto L_0x004b
        L_0x0041:
            java.lang.String r7 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            r2 = 0
        L_0x004b:
            switch(r2) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b3;
                case 3: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x00be
        L_0x0050:
            java.lang.String r2 = "value"
            java.lang.String r2 = r14.getAttributeValue(r1, r2)
            int r7 = r14.getAttributeCount()
            r8 = 0
        L_0x005b:
            if (r8 >= r7) goto L_0x007c
            java.lang.String r9 = r14.getAttributeName(r8)
            int r10 = r9.indexOf(r4)
            if (r10 != r3) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            int r10 = r10 + r0
            java.lang.String r9 = r9.substring(r10)
        L_0x006d:
            java.lang.String r10 = "default_KID"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x007a
            java.lang.String r7 = r14.getAttributeValue(r8)
            goto L_0x007d
        L_0x007a:
            int r8 = r8 + r0
            goto L_0x005b
        L_0x007c:
            r7 = r1
        L_0x007d:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "\\s+"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            java.util.UUID[] r8 = new java.util.UUID[r8]
            r9 = 0
        L_0x0095:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x00a2
            r10 = r7[r9]
            java.util.UUID r10 = java.util.UUID.fromString(r10)
            r8[r9] = r10
            int r9 = r9 + r0
            goto L_0x0095
        L_0x00a2:
            java.util.UUID r7 = M0.C0119g.f2944b
            byte[] r8 = J1.q.a(r7, r8, r1)
            r9 = r1
            goto L_0x00c1
        L_0x00aa:
            java.lang.String r7 = "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."
            P0.l.B(r5, r7)
            r7 = r1
        L_0x00b0:
            r8 = r7
        L_0x00b1:
            r9 = r8
            goto L_0x00c1
        L_0x00b3:
            java.util.UUID r7 = M0.C0119g.f2946d
        L_0x00b5:
            r2 = r1
            r8 = r2
            goto L_0x00b1
        L_0x00b8:
            java.util.UUID r7 = M0.C0119g.e
            goto L_0x00b5
        L_0x00bb:
            java.util.UUID r7 = M0.C0119g.f2945c
            goto L_0x00b5
        L_0x00be:
            r2 = r1
            r7 = r2
            goto L_0x00b0
        L_0x00c1:
            r14.next()
            java.lang.String r10 = "clearkey:Laurl"
            boolean r10 = P0.l.v(r14, r10)
            r11 = 4
            if (r10 != 0) goto L_0x00d5
            java.lang.String r10 = "dashif:Laurl"
            boolean r10 = P0.l.v(r14, r10)
            if (r10 == 0) goto L_0x00e1
        L_0x00d5:
            int r10 = r14.next()
            if (r10 != r11) goto L_0x00e1
            java.lang.String r9 = r14.getText()
            goto L_0x0161
        L_0x00e1:
            java.lang.String r10 = "ms:laurl"
            boolean r10 = P0.l.v(r14, r10)
            if (r10 == 0) goto L_0x00f1
            java.lang.String r9 = "licenseUrl"
            java.lang.String r9 = r14.getAttributeValue(r1, r9)
            goto L_0x0161
        L_0x00f1:
            if (r8 != 0) goto L_0x0139
            boolean r10 = P0.l.u(r14)
            if (r10 == 0) goto L_0x0139
            java.lang.String r10 = r14.getName()
            int r12 = r10.indexOf(r4)
            if (r12 != r3) goto L_0x0104
            goto L_0x0109
        L_0x0104:
            int r12 = r12 + r0
            java.lang.String r10 = r10.substring(r12)
        L_0x0109:
            java.lang.String r12 = "pssh"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0139
            int r10 = r14.next()
            if (r10 != r11) goto L_0x0139
            java.lang.String r7 = r14.getText()
            byte[] r7 = android.util.Base64.decode(r7, r6)
            H3.P r8 = J1.q.i(r7)
            if (r8 != 0) goto L_0x0127
            r8 = r1
            goto L_0x012b
        L_0x0127:
            java.lang.Object r8 = r8.f2027U
            java.util.UUID r8 = (java.util.UUID) r8
        L_0x012b:
            if (r8 != 0) goto L_0x0135
            java.lang.String r7 = "Skipping malformed cenc:pssh data"
            P0.l.B(r5, r7)
            r7 = r8
            r8 = r1
            goto L_0x0161
        L_0x0135:
            r13 = r8
            r8 = r7
            r7 = r13
            goto L_0x0161
        L_0x0139:
            if (r8 != 0) goto L_0x015e
            java.util.UUID r10 = M0.C0119g.e
            boolean r12 = r10.equals(r7)
            if (r12 == 0) goto L_0x015e
            java.lang.String r12 = "mspr:pro"
            boolean r12 = P0.l.v(r14, r12)
            if (r12 == 0) goto L_0x015e
            int r12 = r14.next()
            if (r12 != r11) goto L_0x015e
            java.lang.String r8 = r14.getText()
            byte[] r8 = android.util.Base64.decode(r8, r6)
            byte[] r8 = J1.q.a(r10, r1, r8)
            goto L_0x0161
        L_0x015e:
            b(r14)
        L_0x0161:
            java.lang.String r10 = "ContentProtection"
            boolean r10 = P0.l.t(r14, r10)
            if (r10 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x0172
            M0.m r1 = new M0.m
            java.lang.String r14 = "video/mp4"
            r1.<init>(r7, r9, r14, r8)
        L_0x0172:
            android.util.Pair r14 = android.util.Pair.create(r2, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if ("image".equals(attributeValue)) {
            return 4;
        }
        return -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!l.t(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j7) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j7;
        }
        Matcher matcher = z.i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d13 = 0.0d;
        if (group != null) {
            d8 = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d8 = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d9 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d9 = 0.0d;
        }
        double d14 = d8 + d9;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d10 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d10 = 0.0d;
        }
        double d15 = d14 + d10;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d11 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d11 = 0.0d;
        }
        double d16 = d15 + d11;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d12 = Double.parseDouble(group5) * 60.0d;
        } else {
            d12 = 0.0d;
        }
        double d17 = d16 + d12;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d13 = Double.parseDouble(group6);
        }
        long j8 = (long) ((d17 + d13) * 1000.0d);
        if (!isEmpty) {
            return -j8;
        }
        return j8;
    }

    public static float j(XmlPullParser xmlPullParser, float f8) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f8;
        }
        Matcher matcher = f6231V.matcher(attributeValue);
        if (!matcher.matches()) {
            return f8;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        if (!TextUtils.isEmpty(group)) {
            return ((float) parseInt) / ((float) Integer.parseInt(group));
        }
        return (float) parseInt;
    }

    public static int k(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    public static long l(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j7;
        }
        return Long.parseLong(attributeValue);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v6, resolved type: X0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r121v3, resolved type: X0.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r118v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v61, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v63, resolved type: java.lang.Exception} */
    /* JADX WARNING: type inference failed for: r6v91, types: [java.lang.Object, M0.x] */
    /* JADX WARNING: type inference failed for: r15v62 */
    /* JADX WARNING: type inference failed for: r89v25, types: [X0.k] */
    /* JADX WARNING: type inference failed for: r89v26, types: [X0.l] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0978, code lost:
        if ("audio/eac3-joc".equals(r0) != false) goto L_0x0980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x10ae, code lost:
        r85 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x10b0, code lost:
        r89 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x1136, code lost:
        r162.nextToken();
        r4 = r85;
        r6 = r89;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0939  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x097e  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0bee  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0bf1  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0c0c  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0c0f  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0c2b  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0c2f  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0c5d A[LOOP:6: B:187:0x0692->B:419:0x0c5d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0f9a A[LOOP:5: B:125:0x03e4->B:521:0x0f9a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x1375 A[LOOP:1: B:40:0x00cf->B:619:0x1375, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x1341 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x0dfb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:629:0x08ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:635:0x09b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X0.c m(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) {
        /*
            r13 = r162
            r10 = 1
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.String r1 = "profiles"
            r8 = 0
            java.lang.String r1 = r13.getAttributeValue(r8, r1)
            if (r1 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
        L_0x0016:
            int r1 = r0.length
            r2 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0028
            r3 = r0[r2]
            java.lang.String r4 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0026
            r9 = 1
            goto L_0x0029
        L_0x0026:
            int r2 = r2 + r10
            goto L_0x0018
        L_0x0028:
            r9 = 0
        L_0x0029:
            java.lang.String r0 = "availabilityStartTime"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0039
            r17 = r6
            goto L_0x003f
        L_0x0039:
            long r0 = P0.z.R(r0)
            r17 = r0
        L_0x003f:
            java.lang.String r0 = "mediaPresentationDuration"
            long r19 = i(r13, r0, r6)
            java.lang.String r0 = "minBufferTime"
            long r21 = i(r13, r0, r6)
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            java.lang.String r1 = "dynamic"
            boolean r23 = r1.equals(r0)
            if (r23 == 0) goto L_0x0062
            java.lang.String r0 = "minimumUpdatePeriod"
            long r0 = i(r13, r0, r6)
            r24 = r0
            goto L_0x0064
        L_0x0062:
            r24 = r6
        L_0x0064:
            if (r23 == 0) goto L_0x006f
            java.lang.String r0 = "timeShiftBufferDepth"
            long r0 = i(r13, r0, r6)
            r26 = r0
            goto L_0x0071
        L_0x006f:
            r26 = r6
        L_0x0071:
            if (r23 == 0) goto L_0x007c
            java.lang.String r0 = "suggestedPresentationDelay"
            long r0 = i(r13, r0, r6)
            r28 = r0
            goto L_0x007e
        L_0x007c:
            r28 = r6
        L_0x007e:
            java.lang.String r0 = "publishTime"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 != 0) goto L_0x0089
            r30 = r6
            goto L_0x008f
        L_0x0089:
            long r0 = P0.z.R(r0)
            r30 = r0
        L_0x008f:
            if (r23 == 0) goto L_0x0094
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = r6
        L_0x0095:
            X0.b r2 = new X0.b
            java.lang.String r3 = r163.toString()
            java.lang.String r4 = r163.toString()
            if (r9 == 0) goto L_0x00a3
            r5 = 1
            goto L_0x00a5
        L_0x00a3:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r2.<init>(r3, r5, r4, r10)
            X0.b[] r3 = new X0.b[r10]
            r3[r11] = r2
            java.util.ArrayList r4 = H3.C0103u.p(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r23 == 0) goto L_0x00bf
            r34 = r6
            goto L_0x00c1
        L_0x00bf:
            r34 = 0
        L_0x00c1:
            r37 = r8
            r38 = r37
            r39 = r38
            r40 = r39
            r14 = r34
            r35 = 0
            r36 = 0
        L_0x00cf:
            r162.next()
            java.lang.String r3 = "BaseURL"
            boolean r41 = P0.l.v(r13, r3)
            if (r41 == 0) goto L_0x0101
            if (r35 != 0) goto L_0x00e2
            long r0 = d(r13, r0)
            r35 = 1
        L_0x00e2:
            java.util.ArrayList r3 = e(r13, r4, r9)
            r2.addAll(r3)
            r70 = r2
            r32 = r4
            r2 = r5
            r71 = r6
            r88 = r9
            r46 = r14
            r41 = 0
            r43 = -1
            r52 = 0
            r63 = 4
        L_0x00fc:
            r98 = 1
            r15 = r8
            goto L_0x1339
        L_0x0101:
            java.lang.String r11 = "ProgramInformation"
            boolean r42 = P0.l.v(r13, r11)
            java.lang.String r12 = "lang"
            if (r42 == 0) goto L_0x018a
            java.lang.String r3 = "moreInformationURL"
            java.lang.String r3 = r13.getAttributeValue(r8, r3)
            if (r3 != 0) goto L_0x0116
            r48 = r8
            goto L_0x0118
        L_0x0116:
            r48 = r3
        L_0x0118:
            java.lang.String r3 = r13.getAttributeValue(r8, r12)
            if (r3 != 0) goto L_0x0121
            r49 = r8
            goto L_0x0123
        L_0x0121:
            r49 = r3
        L_0x0123:
            r3 = r8
            r12 = r3
            r37 = r12
        L_0x0127:
            r162.next()
            java.lang.String r6 = "Title"
            boolean r6 = P0.l.v(r13, r6)
            if (r6 == 0) goto L_0x0137
            java.lang.String r3 = r162.nextText()
            goto L_0x0157
        L_0x0137:
            java.lang.String r6 = "Source"
            boolean r6 = P0.l.v(r13, r6)
            if (r6 == 0) goto L_0x0145
            java.lang.String r6 = r162.nextText()
            r12 = r6
            goto L_0x0157
        L_0x0145:
            java.lang.String r6 = "Copyright"
            boolean r6 = P0.l.v(r13, r6)
            if (r6 == 0) goto L_0x0154
            java.lang.String r6 = r162.nextText()
            r37 = r6
            goto L_0x0157
        L_0x0154:
            b(r162)
        L_0x0157:
            boolean r6 = P0.l.t(r13, r11)
            if (r6 == 0) goto L_0x0184
            X0.i r6 = new X0.i
            r44 = r6
            r45 = r3
            r46 = r12
            r47 = r37
            r44.<init>(r45, r46, r47, r48, r49)
            r70 = r2
            r32 = r4
            r2 = r5
            r37 = r6
        L_0x0171:
            r88 = r9
            r46 = r14
            r41 = 0
            r43 = -1
            r52 = 0
            r63 = 4
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00fc
        L_0x0184:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0127
        L_0x018a:
            java.lang.String r6 = "UTCTiming"
            boolean r6 = P0.l.v(r13, r6)
            java.lang.String r11 = "value"
            java.lang.String r7 = "schemeIdUri"
            if (r6 == 0) goto L_0x01ab
            java.lang.String r3 = r13.getAttributeValue(r8, r7)
            java.lang.String r6 = r13.getAttributeValue(r8, r11)
            T7.C r7 = new T7.C
            r7.<init>((int) r10, (java.lang.String) r3, (java.lang.String) r6)
            r70 = r2
            r32 = r4
            r2 = r5
            r38 = r7
            goto L_0x0171
        L_0x01ab:
            java.lang.String r6 = "Location"
            boolean r6 = P0.l.v(r13, r6)
            if (r6 == 0) goto L_0x01c7
            java.lang.String r3 = r163.toString()
            java.lang.String r6 = r162.nextText()
            android.net.Uri r3 = P0.l.z(r3, r6)
            r70 = r2
            r39 = r3
            r32 = r4
            r2 = r5
            goto L_0x0171
        L_0x01c7:
            java.lang.String r6 = "ServiceDescription"
            boolean r42 = P0.l.v(r13, r6)
            if (r42 == 0) goto L_0x027e
            r42 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r44 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01e7:
            r162.next()
            java.lang.String r10 = "Latency"
            boolean r10 = P0.l.v(r13, r10)
            java.lang.String r8 = "max"
            r52 = r0
            java.lang.String r0 = "min"
            if (r10 == 0) goto L_0x0212
            java.lang.String r1 = "target"
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r44 = l(r13, r1, r10)
            long r0 = l(r13, r0, r10)
            long r46 = l(r13, r8, r10)
            r8 = r4
            r10 = r5
            r11 = r44
        L_0x020f:
            r4 = r46
            goto L_0x023e
        L_0x0212:
            java.lang.String r1 = "PlaybackRate"
            boolean r1 = P0.l.v(r13, r1)
            if (r1 == 0) goto L_0x0239
            r1 = 0
            java.lang.String r0 = r13.getAttributeValue(r1, r0)
            if (r0 != 0) goto L_0x0225
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x022a
        L_0x0225:
            float r0 = java.lang.Float.parseFloat(r0)
            r3 = r0
        L_0x022a:
            java.lang.String r0 = r13.getAttributeValue(r1, r8)
            if (r0 != 0) goto L_0x0234
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0239
        L_0x0234:
            float r0 = java.lang.Float.parseFloat(r0)
            r7 = r0
        L_0x0239:
            r8 = r4
            r10 = r5
            r0 = r44
            goto L_0x020f
        L_0x023e:
            boolean r40 = P0.l.t(r13, r6)
            if (r40 == 0) goto L_0x0272
            M0.x r6 = new M0.x
            r6.<init>()
            r6.f3052a = r11
            r6.f3053b = r0
            r6.f3054c = r4
            r6.f3055d = r3
            r6.e = r7
            r70 = r2
            r40 = r6
            r32 = r8
            r88 = r9
            r2 = r10
            r46 = r14
            r0 = r52
            r15 = 0
            r41 = 0
            r43 = -1
            r52 = 0
            r63 = 4
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r98 = 1
            goto L_0x1339
        L_0x0272:
            r44 = r0
            r46 = r4
            r4 = r8
            r5 = r10
            r0 = r52
            r8 = 0
            r10 = 1
            goto L_0x01e7
        L_0x027e:
            r52 = r0
            r8 = r4
            r10 = r5
            java.lang.String r6 = "Period"
            boolean r0 = P0.l.v(r13, r6)
            if (r0 == 0) goto L_0x131a
            if (r36 != 0) goto L_0x131a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0294
            r4 = r2
            goto L_0x0295
        L_0x0294:
            r4 = r8
        L_0x0295:
            java.lang.String r5 = "id"
            r0 = 0
            java.lang.String r55 = r13.getAttributeValue(r0, r5)
            java.lang.String r0 = "start"
            long r56 = i(r13, r0, r14)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r42 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r42 == 0) goto L_0x02b0
            long r44 = r17 + r56
        L_0x02ad:
            r46 = r14
            goto L_0x02b3
        L_0x02b0:
            r44 = r0
            goto L_0x02ad
        L_0x02b3:
            java.lang.String r14 = "duration"
            long r50 = i(r13, r14, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r42 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r59 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r60 = r0
            r62 = r10
            r63 = r11
            r10 = r52
            r54 = 0
            r58 = 0
        L_0x02d8:
            r162.next()
            boolean r64 = P0.l.v(r13, r3)
            if (r64 == 0) goto L_0x031e
            if (r58 != 0) goto L_0x02e9
            long r10 = d(r13, r10)
            r58 = 1
        L_0x02e9:
            java.util.ArrayList r0 = e(r13, r4, r9)
            r14.addAll(r0)
            r70 = r2
            r84 = r3
            r33 = r4
            r0 = r6
            r34 = r7
            r32 = r8
            r88 = r9
            r80 = r14
            r67 = r15
            r66 = r42
            r64 = r52
            r42 = r59
            r16 = r63
            r15 = 0
            r41 = 0
            r43 = -1
            r52 = 0
            r63 = 4
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r98 = 1
            r59 = r5
            r14 = r12
            goto L_0x1297
        L_0x031e:
            java.lang.String r1 = "AdaptationSet"
            boolean r0 = P0.l.v(r13, r1)
            java.lang.String r66 = ""
            r67 = r15
            java.lang.String r15 = "SegmentBase"
            r68 = r10
            java.lang.String r10 = "SegmentList"
            java.lang.String r11 = "SegmentTemplate"
            if (r0 == 0) goto L_0x0fe5
            boolean r0 = r14.isEmpty()
            r71 = r1
            r70 = r2
            if (r0 != 0) goto L_0x033e
            r0 = r14
            goto L_0x033f
        L_0x033e:
            r0 = r4
        L_0x033f:
            r1 = -1
            long r73 = l(r13, r5, r1)
            int r1 = g(r162)
            java.lang.String r2 = "mimeType"
            r72 = r1
            r1 = 0
            java.lang.String r75 = r13.getAttributeValue(r1, r2)
            r80 = r14
            java.lang.String r14 = "codecs"
            java.lang.String r76 = r13.getAttributeValue(r1, r14)
            java.lang.String r1 = "width"
            r77 = r4
            r78 = r11
            r4 = -1
            int r11 = k(r13, r1, r4)
            r79 = r8
            java.lang.String r8 = "height"
            r81 = r6
            int r6 = k(r13, r8, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = j(r13, r4)
            r82 = r7
            java.lang.String r7 = "audioSamplingRate"
            r83 = r10
            r84 = r15
            r10 = -1
            int r15 = k(r13, r7, r10)
            r10 = 0
            java.lang.String r85 = r13.getAttributeValue(r10, r12)
            r86 = r7
            java.lang.String r7 = "label"
            java.lang.String r7 = r13.getAttributeValue(r10, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r87 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r88 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r89 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r90 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r91 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r92 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r93 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r94 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r95 = r1
            r98 = r5
            r99 = r6
            r96 = r11
            r100 = r54
            r101 = r60
            r5 = r68
            r1 = r72
            r11 = r85
            r72 = 0
            r85 = -1
            r97 = 0
        L_0x03e4:
            r162.next()
            boolean r103 = P0.l.v(r13, r3)
            if (r103 == 0) goto L_0x044e
            if (r97 != 0) goto L_0x03f8
            long r5 = d(r13, r5)
            r103 = r5
            r97 = 1
            goto L_0x03fa
        L_0x03f8:
            r103 = r5
        L_0x03fa:
            java.util.ArrayList r5 = e(r13, r0, r9)
            r8.addAll(r5)
        L_0x0401:
            r128 = r2
        L_0x0403:
            r16 = r7
            r147 = r10
            r10 = r12
            r114 = r14
            r64 = r52
            r144 = r63
            r33 = r77
            r160 = r78
            r32 = r79
            r139 = r81
            r138 = r82
            r14 = r83
            r52 = r86
            r6 = r87
            r140 = r88
            r127 = r90
            r77 = r91
            r49 = r92
            r142 = r94
            r48 = r96
            r137 = r98
            r81 = r99
            r12 = 0
            r41 = 0
            r98 = 1
            r83 = r0
            r79 = r4
            r94 = r8
            r88 = r9
            r63 = r11
            r53 = r15
            r0 = r71
            r15 = r84
            r71 = r95
            r11 = 4
            r84 = r3
            r3 = r89
            r89 = r93
            goto L_0x0df5
        L_0x044e:
            r103 = r5
            java.lang.String r6 = "ContentProtection"
            boolean r5 = P0.l.v(r13, r6)
            if (r5 == 0) goto L_0x046e
            android.util.Pair r5 = f(r162)
            java.lang.Object r6 = r5.first
            if (r6 == 0) goto L_0x0464
            r72 = r6
            java.lang.String r72 = (java.lang.String) r72
        L_0x0464:
            java.lang.Object r5 = r5.second
            if (r5 == 0) goto L_0x0401
            M0.m r5 = (M0.C0125m) r5
            r10.add(r5)
            goto L_0x0401
        L_0x046e:
            java.lang.String r5 = "ContentComponent"
            boolean r5 = P0.l.v(r13, r5)
            if (r5 == 0) goto L_0x04a1
            r5 = 0
            java.lang.String r6 = r13.getAttributeValue(r5, r12)
            if (r11 != 0) goto L_0x047f
            r11 = r6
            goto L_0x0489
        L_0x047f:
            if (r6 != 0) goto L_0x0482
            goto L_0x0489
        L_0x0482:
            boolean r5 = r11.equals(r6)
            P0.l.j(r5)
        L_0x0489:
            int r5 = g(r162)
            r6 = -1
            if (r1 != r6) goto L_0x0493
            r1 = r5
            goto L_0x0401
        L_0x0493:
            if (r5 != r6) goto L_0x0497
            goto L_0x0401
        L_0x0497:
            if (r1 != r5) goto L_0x049b
            r5 = 1
            goto L_0x049c
        L_0x049b:
            r5 = 0
        L_0x049c:
            P0.l.j(r5)
            goto L_0x0401
        L_0x04a1:
            java.lang.String r5 = "Role"
            boolean r105 = P0.l.v(r13, r5)
            if (r105 == 0) goto L_0x0501
            X0.f r5 = h(r13, r5)
            r15.add(r5)
            r128 = r2
            r16 = r7
            r147 = r10
            r10 = r12
            r114 = r14
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r160 = r78
            r32 = r79
            r139 = r81
            r138 = r82
            r14 = r83
            r52 = r86
            r6 = r87
            r140 = r88
            r127 = r90
            r77 = r91
            r49 = r92
            r142 = r94
            r71 = r95
            r48 = r96
            r137 = r98
            r81 = r99
            r12 = 0
            r41 = 0
            r98 = 1
            r83 = r0
        L_0x04e8:
            r86 = r1
            r79 = r4
            r94 = r8
            r88 = r9
            r63 = r11
            r53 = r15
            r15 = r84
            r0 = r101
            r11 = 4
            r84 = r3
            r3 = r89
            r89 = r93
            goto L_0x0def
        L_0x0501:
            java.lang.String r5 = "AudioChannelConfiguration"
            boolean r105 = P0.l.v(r13, r5)
            if (r105 == 0) goto L_0x0513
            int r5 = c(r162)
            r128 = r2
            r85 = r5
            goto L_0x0403
        L_0x0513:
            r105 = r0
            java.lang.String r0 = "Accessibility"
            boolean r106 = P0.l.v(r13, r0)
            if (r106 == 0) goto L_0x055d
            X0.f r0 = h(r13, r0)
            r7.add(r0)
        L_0x0524:
            r128 = r2
            r16 = r7
            r147 = r10
            r10 = r12
            r114 = r14
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r160 = r78
            r32 = r79
            r139 = r81
            r138 = r82
            r14 = r83
            r52 = r86
            r6 = r87
            r140 = r88
            r127 = r90
            r77 = r91
            r49 = r92
            r142 = r94
            r71 = r95
            r48 = r96
            r137 = r98
            r81 = r99
            r83 = r105
            r12 = 0
            r41 = 0
            r98 = 1
            goto L_0x04e8
        L_0x055d:
            java.lang.String r0 = "EssentialProperty"
            boolean r106 = P0.l.v(r13, r0)
            if (r106 == 0) goto L_0x056d
            X0.f r0 = h(r13, r0)
            r4.add(r0)
            goto L_0x0524
        L_0x056d:
            r106 = r15
            java.lang.String r15 = "SupplementalProperty"
            boolean r107 = P0.l.v(r13, r15)
            if (r107 == 0) goto L_0x05d1
            X0.f r0 = h(r13, r15)
            r5 = r99
            r5.add(r0)
            r128 = r2
            r16 = r7
            r147 = r10
            r10 = r12
            r114 = r14
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r160 = r78
            r32 = r79
            r139 = r81
            r138 = r82
            r14 = r83
            r15 = r84
            r52 = r86
            r6 = r87
            r140 = r88
            r127 = r90
            r77 = r91
            r49 = r92
            r142 = r94
            r71 = r95
            r48 = r96
            r137 = r98
            r83 = r105
            r53 = r106
            r12 = 0
            r41 = 0
            r98 = 1
            r86 = r1
            r84 = r3
            r79 = r4
            r81 = r5
            r94 = r8
            r88 = r9
            r63 = r11
            r3 = r89
            r89 = r93
            r0 = r101
            r11 = 4
            goto L_0x0def
        L_0x05d1:
            r107 = r15
            r161 = r99
            r99 = r6
            r6 = r161
            java.lang.String r15 = "Representation"
            boolean r108 = P0.l.v(r13, r15)
            r109 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r108 == 0) goto L_0x0ccc
            boolean r108 = r8.isEmpty()
            r49 = r7
            if (r108 != 0) goto L_0x05f9
            r108 = r8
            r110 = r12
            r7 = r98
            r98 = r15
            r15 = r108
            r8 = 0
            goto L_0x0604
        L_0x05f9:
            r108 = r8
            r110 = r12
            r7 = r98
            r8 = 0
            r98 = r15
            r15 = r105
        L_0x0604:
            java.lang.String r12 = r13.getAttributeValue(r8, r7)
            java.lang.String r8 = "bandwidth"
            r112 = r12
            r12 = -1
            int r8 = k(r13, r8, r12)
            r12 = 0
            java.lang.String r111 = r13.getAttributeValue(r12, r2)
            if (r111 != 0) goto L_0x061b
            r113 = r75
            goto L_0x061d
        L_0x061b:
            r113 = r111
        L_0x061d:
            java.lang.String r111 = r13.getAttributeValue(r12, r14)
            r114 = r14
            if (r111 != 0) goto L_0x0627
            r111 = r76
        L_0x0627:
            r12 = r95
            r161 = r96
            r96 = r10
            r10 = r161
            int r14 = k(r13, r12, r10)
            r115 = r8
            r8 = r93
            r93 = r14
            r161 = r92
            r92 = r7
            r7 = r161
            int r14 = k(r13, r8, r7)
            r116 = r7
            r7 = r91
            r91 = r14
            float r14 = j(r13, r7)
            r117 = r7
            r7 = r86
            r86 = r14
            r14 = r90
            r90 = r12
            int r12 = k(r13, r7, r14)
            r127 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r123 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r124 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r4)
            r125 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            r126 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r129 = r0
            r128 = r1
            r121 = r10
            r120 = r11
            r130 = r85
            r122 = r100
            r0 = r101
            r10 = r103
            r118 = 0
            r119 = 0
        L_0x0692:
            r162.next()
            boolean r131 = P0.l.v(r13, r3)
            if (r131 == 0) goto L_0x0715
            if (r119 != 0) goto L_0x06a6
            long r10 = d(r13, r10)
            r131 = r2
            r119 = 1
            goto L_0x06a8
        L_0x06a6:
            r131 = r2
        L_0x06a8:
            java.util.ArrayList r2 = e(r13, r15, r9)
            r14.addAll(r2)
        L_0x06af:
            r151 = r12
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r32 = r79
            r139 = r81
            r138 = r82
            r145 = r83
            r136 = r84
            r146 = r87
            r140 = r88
            r141 = r89
            r71 = r90
            r137 = r92
            r142 = r94
            r147 = r96
            r2 = r98
            r83 = r105
            r94 = r108
            r149 = r110
            r150 = r112
            r143 = r115
            r77 = r117
            r148 = r120
            r48 = r121
            r134 = r128
            r12 = r130
            r128 = r131
            r41 = 0
            r84 = r3
            r79 = r4
            r92 = r5
            r81 = r6
            r52 = r7
            r89 = r8
            r88 = r9
            r82 = r14
            r105 = r15
            r53 = r49
            r14 = r99
            r6 = r107
            r15 = r109
            r49 = r116
            r8 = r118
            r3 = r123
            r5 = r124
            r7 = r125
            r9 = r126
            r4 = r129
            goto L_0x08e8
        L_0x0715:
            r131 = r2
            boolean r2 = P0.l.v(r13, r5)
            if (r2 == 0) goto L_0x0722
            int r130 = c(r162)
            goto L_0x06af
        L_0x0722:
            r2 = r84
            boolean r84 = P0.l.v(r13, r2)
            if (r84 == 0) goto L_0x0736
            r84 = r2
            r2 = r122
            X0.r r2 = (X0.r) r2
            X0.r r122 = r(r13, r2)
            goto L_0x06af
        L_0x0736:
            r84 = r2
            r2 = r83
            boolean r83 = P0.l.v(r13, r2)
            if (r83 == 0) goto L_0x07ce
            long r132 = d(r13, r0)
            r1 = r122
            X0.o r1 = (X0.o) r1
            r64 = r52
            r83 = r105
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r105 = r15
            r15 = r129
            r0 = r162
            r135 = r71
            r71 = r90
            r134 = r128
            r90 = r2
            r136 = r84
            r128 = r131
            r84 = r3
            r2 = r44
            r33 = r77
            r32 = r79
            r137 = r92
            r77 = r117
            r79 = r4
            r92 = r5
            r4 = r50
            r52 = r7
            r53 = r49
            r139 = r81
            r138 = r82
            r140 = r88
            r141 = r89
            r49 = r116
            r81 = r6
            r82 = r14
            r14 = r99
            r6 = r10
            r89 = r8
            r88 = r9
            r142 = r94
            r94 = r108
            r143 = r115
            r8 = r132
            r144 = r63
            r15 = r78
            r146 = r87
            r145 = r90
            r147 = r96
            r148 = r120
            r48 = r121
            r41 = 0
            r95 = r10
            r10 = r26
            X0.o r122 = s(r0, r1, r2, r4, r6, r8, r10)
            r151 = r12
            r10 = r95
            r2 = r98
            r6 = r107
            r15 = r109
            r149 = r110
            r150 = r112
            r8 = r118
            r3 = r123
            r5 = r124
            r7 = r125
            r9 = r126
            r4 = r129
            r12 = r130
            r0 = r132
            goto L_0x08e8
        L_0x07ce:
            r145 = r2
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r32 = r79
            r139 = r81
            r138 = r82
            r136 = r84
            r146 = r87
            r140 = r88
            r141 = r89
            r71 = r90
            r137 = r92
            r142 = r94
            r147 = r96
            r83 = r105
            r94 = r108
            r143 = r115
            r77 = r117
            r148 = r120
            r48 = r121
            r134 = r128
            r128 = r131
            r41 = 0
            r84 = r3
            r79 = r4
            r92 = r5
            r81 = r6
            r52 = r7
            r89 = r8
            r88 = r9
            r95 = r10
            r82 = r14
            r105 = r15
            r53 = r49
            r15 = r78
            r14 = r99
            r49 = r116
            boolean r2 = P0.l.v(r13, r15)
            if (r2 == 0) goto L_0x085f
            long r115 = d(r13, r0)
            r1 = r122
            X0.p r1 = (X0.p) r1
            r0 = r162
            r2 = r81
            r3 = r44
            r5 = r50
            r7 = r95
            r9 = r115
            r151 = r12
            r78 = r15
            r149 = r110
            r150 = r112
            r15 = -1
            r11 = r26
            X0.p r122 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r10 = r95
            r2 = r98
            r6 = r107
            r15 = r109
            r0 = r115
            r8 = r118
            r3 = r123
        L_0x0853:
            r5 = r124
            r7 = r125
            r9 = r126
            r4 = r129
        L_0x085b:
            r12 = r130
            goto L_0x08e8
        L_0x085f:
            r151 = r12
            r78 = r15
            r149 = r110
            r150 = r112
            r15 = -1
            boolean r2 = P0.l.v(r13, r14)
            if (r2 == 0) goto L_0x0893
            android.util.Pair r2 = f(r162)
            java.lang.Object r3 = r2.first
            if (r3 == 0) goto L_0x087a
            r118 = r3
            java.lang.String r118 = (java.lang.String) r118
        L_0x087a:
            java.lang.Object r2 = r2.second
            if (r2 == 0) goto L_0x0886
            M0.m r2 = (M0.C0125m) r2
            r3 = r123
            r3.add(r2)
            goto L_0x0888
        L_0x0886:
            r3 = r123
        L_0x0888:
            r10 = r95
            r2 = r98
            r6 = r107
            r15 = r109
            r8 = r118
            goto L_0x0853
        L_0x0893:
            r2 = r98
            r3 = r123
            boolean r4 = P0.l.v(r13, r2)
            if (r4 == 0) goto L_0x08af
            X0.f r4 = h(r13, r2)
            r5 = r124
            r5.add(r4)
            r6 = r107
            r7 = r125
            r9 = r126
            r4 = r129
            goto L_0x08e0
        L_0x08af:
            r5 = r124
            r4 = r129
            boolean r6 = P0.l.v(r13, r4)
            if (r6 == 0) goto L_0x08c7
            X0.f r6 = h(r13, r4)
            r7 = r125
            r7.add(r6)
            r6 = r107
            r9 = r126
            goto L_0x08e0
        L_0x08c7:
            r6 = r107
            r7 = r125
            boolean r8 = P0.l.v(r13, r6)
            if (r8 == 0) goto L_0x08db
            X0.f r8 = h(r13, r6)
            r9 = r126
            r9.add(r8)
            goto L_0x08e0
        L_0x08db:
            r9 = r126
            b(r162)
        L_0x08e0:
            r10 = r95
            r15 = r109
            r8 = r118
            goto L_0x085b
        L_0x08e8:
            boolean r63 = P0.l.t(r13, r15)
            if (r63 == 0) goto L_0x0c5d
            boolean r0 = M0.I.k(r113)
            if (r0 == 0) goto L_0x08fb
            java.lang.String r0 = M0.I.b(r111)
        L_0x08f8:
            r1 = r113
            goto L_0x0931
        L_0x08fb:
            boolean r0 = M0.I.n(r113)
            if (r0 == 0) goto L_0x0906
            java.lang.String r0 = M0.I.j(r111)
            goto L_0x08f8
        L_0x0906:
            boolean r0 = M0.I.m(r113)
            if (r0 == 0) goto L_0x0910
        L_0x090c:
            r0 = r113
            r1 = r0
            goto L_0x0931
        L_0x0910:
            boolean r0 = M0.I.l(r113)
            if (r0 == 0) goto L_0x0917
            goto L_0x090c
        L_0x0917:
            java.lang.String r0 = "application/mp4"
            r1 = r113
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0930
            java.lang.String r0 = M0.I.e(r111)
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0931
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L_0x0931
        L_0x0930:
            r0 = 0
        L_0x0931:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r2.equals(r0)
            if (r4 == 0) goto L_0x097e
            r11 = 0
        L_0x093a:
            int r0 = r9.size()
            java.lang.String r4 = "audio/eac3-joc"
            java.lang.String r6 = "ec+3"
            if (r11 >= r0) goto L_0x0972
            java.lang.Object r0 = r9.get(r11)
            X0.f r0 = (X0.f) r0
            java.lang.String r10 = r0.f6236a
            java.lang.String r14 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r14 = r14.equals(r10)
            java.lang.String r0 = r0.f6237b
            if (r14 == 0) goto L_0x095e
            java.lang.String r14 = "JOC"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L_0x096c
        L_0x095e:
            java.lang.String r14 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x096f
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x096f
        L_0x096c:
            r0 = r4
            r10 = 1
            goto L_0x0974
        L_0x096f:
            r10 = 1
            int r11 = r11 + r10
            goto L_0x093a
        L_0x0972:
            r10 = 1
            r0 = r2
        L_0x0974:
            boolean r2 = r4.equals(r0)
            if (r2 == 0) goto L_0x097b
            goto L_0x0980
        L_0x097b:
            r6 = r111
            goto L_0x0980
        L_0x097e:
            r10 = 1
            goto L_0x097b
        L_0x0980:
            r2 = 0
            r11 = 0
        L_0x0982:
            int r4 = r106.size()
            java.lang.String r14 = "urn:mpeg:dash:role:2011"
            if (r11 >= r4) goto L_0x09b8
            r4 = r106
            java.lang.Object r15 = r4.get(r11)
            X0.f r15 = (X0.f) r15
            java.lang.String r10 = r15.f6236a
            boolean r10 = F.h.n(r14, r10)
            if (r10 == 0) goto L_0x09b3
            java.lang.String r10 = r15.f6237b
            if (r10 != 0) goto L_0x09a0
        L_0x099e:
            r10 = 0
            goto L_0x09b2
        L_0x09a0:
            java.lang.String r14 = "forced_subtitle"
            boolean r14 = r10.equals(r14)
            if (r14 != 0) goto L_0x09b1
            java.lang.String r14 = "forced-subtitle"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x09b1
            goto L_0x099e
        L_0x09b1:
            r10 = 2
        L_0x09b2:
            r2 = r2 | r10
        L_0x09b3:
            r10 = 1
            int r11 = r11 + r10
            r106 = r4
            goto L_0x0982
        L_0x09b8:
            r4 = r106
            r10 = 0
            r11 = 0
        L_0x09bc:
            int r15 = r4.size()
            if (r11 >= r15) goto L_0x09df
            java.lang.Object r15 = r4.get(r11)
            X0.f r15 = (X0.f) r15
            r106 = r4
            java.lang.String r4 = r15.f6236a
            boolean r4 = F.h.n(r14, r4)
            if (r4 == 0) goto L_0x09da
            java.lang.String r4 = r15.f6237b
            int r4 = p(r4)
            r4 = r4 | r10
            r10 = r4
        L_0x09da:
            r4 = 1
            int r11 = r11 + r4
            r4 = r106
            goto L_0x09bc
        L_0x09df:
            r106 = r4
            r4 = 0
            r11 = 0
        L_0x09e3:
            int r15 = r53.size()
            if (r11 >= r15) goto L_0x0a72
            r15 = r53
            java.lang.Object r53 = r15.get(r11)
            r13 = r53
            X0.f r13 = (X0.f) r13
            r124 = r5
            java.lang.String r5 = r13.f6236a
            boolean r5 = F.h.n(r14, r5)
            r53 = r14
            java.lang.String r14 = r13.f6237b
            if (r5 == 0) goto L_0x0a09
            int r5 = p(r14)
        L_0x0a05:
            r4 = r4 | r5
        L_0x0a06:
            r5 = 1
            goto L_0x0a67
        L_0x0a09:
            java.lang.String r5 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            java.lang.String r13 = r13.f6236a
            boolean r5 = F.h.n(r5, r13)
            if (r5 == 0) goto L_0x0a06
            if (r14 != 0) goto L_0x0a17
        L_0x0a15:
            r5 = 0
            goto L_0x0a05
        L_0x0a17:
            int r5 = r14.hashCode()
            switch(r5) {
                case 49: goto L_0x0a4c;
                case 50: goto L_0x0a41;
                case 51: goto L_0x0a36;
                case 52: goto L_0x0a2b;
                case 53: goto L_0x0a1e;
                case 54: goto L_0x0a20;
                default: goto L_0x0a1e;
            }
        L_0x0a1e:
            r5 = -1
            goto L_0x0a56
        L_0x0a20:
            java.lang.String r5 = "6"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a29
            goto L_0x0a1e
        L_0x0a29:
            r5 = 4
            goto L_0x0a56
        L_0x0a2b:
            java.lang.String r5 = "4"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a34
            goto L_0x0a1e
        L_0x0a34:
            r5 = 3
            goto L_0x0a56
        L_0x0a36:
            java.lang.String r5 = "3"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a3f
            goto L_0x0a1e
        L_0x0a3f:
            r5 = 2
            goto L_0x0a56
        L_0x0a41:
            java.lang.String r5 = "2"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a4a
            goto L_0x0a1e
        L_0x0a4a:
            r5 = 1
            goto L_0x0a56
        L_0x0a4c:
            java.lang.String r5 = "1"
            boolean r5 = r14.equals(r5)
            if (r5 != 0) goto L_0x0a55
            goto L_0x0a1e
        L_0x0a55:
            r5 = 0
        L_0x0a56:
            switch(r5) {
                case 0: goto L_0x0a64;
                case 1: goto L_0x0a61;
                case 2: goto L_0x0a5f;
                case 3: goto L_0x0a5c;
                case 4: goto L_0x0a5a;
                default: goto L_0x0a59;
            }
        L_0x0a59:
            goto L_0x0a15
        L_0x0a5a:
            r5 = 1
            goto L_0x0a05
        L_0x0a5c:
            r5 = 8
            goto L_0x0a05
        L_0x0a5f:
            r5 = 4
            goto L_0x0a05
        L_0x0a61:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0a05
        L_0x0a64:
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x0a05
        L_0x0a67:
            int r11 = r11 + r5
            r13 = r162
            r14 = r53
            r5 = r124
            r53 = r15
            goto L_0x09e3
        L_0x0a72:
            r124 = r5
            r15 = r53
            r4 = r4 | r10
            int r5 = q(r7)
            r4 = r4 | r5
            int r5 = q(r9)
            r4 = r4 | r5
            r11 = 0
        L_0x0a82:
            int r5 = r7.size()
            if (r11 >= r5) goto L_0x0ad7
            java.lang.Object r5 = r7.get(r11)
            X0.f r5 = (X0.f) r5
            java.lang.String r10 = r5.f6236a
            java.lang.String r13 = "http://dashif.org/thumbnail_tile"
            boolean r10 = F.h.n(r13, r10)
            if (r10 != 0) goto L_0x0aa6
            java.lang.String r10 = "http://dashif.org/guidelines/thumbnail_tile"
            java.lang.String r13 = r5.f6236a
            boolean r10 = F.h.n(r10, r13)
            if (r10 == 0) goto L_0x0aa3
            goto L_0x0aa6
        L_0x0aa3:
            r5 = 1
            r13 = 2
            goto L_0x0ad5
        L_0x0aa6:
            java.lang.String r5 = r5.f6237b
            if (r5 == 0) goto L_0x0ad3
            int r10 = P0.z.f3748a
            java.lang.String r10 = "x"
            r13 = -1
            java.lang.String[] r5 = r5.split(r10, r13)
            int r10 = r5.length
            r13 = 2
            if (r10 == r13) goto L_0x0ab9
        L_0x0ab7:
            r5 = 1
            goto L_0x0ad5
        L_0x0ab9:
            r10 = r5[r41]     // Catch:{ NumberFormatException -> 0x0ab7 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0ab7 }
            r14 = 1
            r5 = r5[r14]     // Catch:{ NumberFormatException -> 0x0ab7 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0ab7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0ab7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0ab7 }
            android.util.Pair r5 = android.util.Pair.create(r10, r5)     // Catch:{ NumberFormatException -> 0x0ab7 }
            goto L_0x0ad9
        L_0x0ad3:
            r13 = 2
            goto L_0x0ab7
        L_0x0ad5:
            int r11 = r11 + r5
            goto L_0x0a82
        L_0x0ad7:
            r13 = 2
            r5 = 0
        L_0x0ad9:
            M0.q r10 = new M0.q
            r10.<init>()
            r11 = r150
            r10.f2989a = r11
            java.lang.String r1 = M0.I.o(r1)
            r10.f2998l = r1
            java.lang.String r1 = M0.I.o(r0)
            r10.f2999m = r1
            r10.f2996j = r6
            r1 = r143
            r10.i = r1
            r10.e = r2
            r10.f2993f = r4
            r1 = r148
            r10.f2992d = r1
            if (r5 == 0) goto L_0x0b07
            java.lang.Object r2 = r5.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0b08
        L_0x0b07:
            r2 = -1
        L_0x0b08:
            r10.f2986I = r2
            if (r5 == 0) goto L_0x0b15
            java.lang.Object r2 = r5.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0b16
        L_0x0b15:
            r2 = -1
        L_0x0b16:
            r10.f2987J = r2
            boolean r2 = M0.I.n(r0)
            if (r2 == 0) goto L_0x0b2d
            r5 = r93
            r10.f3006t = r5
            r2 = r91
            r10.f3007u = r2
            r0 = r86
            r10.f3008v = r0
        L_0x0b2a:
            r6 = 1
            goto L_0x0be7
        L_0x0b2d:
            r2 = r91
            r5 = r93
            boolean r4 = M0.I.k(r0)
            if (r4 == 0) goto L_0x0b3e
            r10.f2979B = r12
            r0 = r151
            r10.f2980C = r0
            goto L_0x0b2a
        L_0x0b3e:
            boolean r4 = M0.I.m(r0)
            if (r4 == 0) goto L_0x0bdc
            java.lang.String r2 = "application/cea-608"
            boolean r2 = r2.equals(r0)
            java.lang.String r4 = "MpdParser"
            if (r2 == 0) goto L_0x0b90
            r11 = 0
        L_0x0b4f:
            int r0 = r15.size()
            if (r11 >= r0) goto L_0x0b8d
            java.lang.Object r0 = r15.get(r11)
            X0.f r0 = (X0.f) r0
            java.lang.String r2 = r0.f6236a
            java.lang.String r5 = "urn:scte:dash:cc:cea-608:2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0b8a
            java.lang.String r0 = r0.f6237b
            if (r0 == 0) goto L_0x0b8a
            java.util.regex.Pattern r2 = f6232W
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L_0x0b7f
            r5 = 1
            java.lang.String r0 = r2.group(r5)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0b8e
        L_0x0b7f:
            r5 = 1
            java.lang.String r2 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r0 = r2.concat(r0)
            P0.l.B(r4, r0)
            goto L_0x0b8b
        L_0x0b8a:
            r5 = 1
        L_0x0b8b:
            int r11 = r11 + r5
            goto L_0x0b4f
        L_0x0b8d:
            r12 = -1
        L_0x0b8e:
            r6 = 1
            goto L_0x0bd9
        L_0x0b90:
            java.lang.String r2 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bd7
            r11 = 0
        L_0x0b99:
            int r0 = r15.size()
            if (r11 >= r0) goto L_0x0bd7
            java.lang.Object r0 = r15.get(r11)
            X0.f r0 = (X0.f) r0
            java.lang.String r2 = r0.f6236a
            java.lang.String r5 = "urn:scte:dash:cc:cea-708:2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0bd4
            java.lang.String r0 = r0.f6237b
            if (r0 == 0) goto L_0x0bd4
            java.util.regex.Pattern r2 = f6233X
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L_0x0bc9
            r6 = 1
            java.lang.String r0 = r2.group(r6)
            int r12 = java.lang.Integer.parseInt(r0)
            goto L_0x0bd9
        L_0x0bc9:
            r6 = 1
            java.lang.String r2 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r0 = r2.concat(r0)
            P0.l.B(r4, r0)
            goto L_0x0bd5
        L_0x0bd4:
            r6 = 1
        L_0x0bd5:
            int r11 = r11 + r6
            goto L_0x0b99
        L_0x0bd7:
            r6 = 1
            r12 = -1
        L_0x0bd9:
            r10.f2984G = r12
            goto L_0x0be7
        L_0x0bdc:
            r6 = 1
            boolean r0 = M0.I.l(r0)
            if (r0 == 0) goto L_0x0be7
            r10.f3006t = r5
            r10.f3007u = r2
        L_0x0be7:
            M0.r r0 = new M0.r
            r0.<init>(r10)
            if (r122 == 0) goto L_0x0bf1
            r121 = r122
            goto L_0x0c04
        L_0x0bf1:
            X0.r r2 = new X0.r
            r152 = 1
            r154 = 0
            r151 = 0
            r156 = 0
            r158 = 0
            r150 = r2
            r150.<init>(r151, r152, r154, r156, r158)
            r121 = r2
        L_0x0c04:
            X0.d r2 = new X0.d
            boolean r4 = r82.isEmpty()
            if (r4 != 0) goto L_0x0c0f
            r120 = r82
            goto L_0x0c11
        L_0x0c0f:
            r120 = r105
        L_0x0c11:
            r118 = r2
            r119 = r0
            r122 = r8
            r123 = r3
            r125 = r7
            r126 = r9
            r118.<init>(r119, r120, r121, r122, r123, r124, r125, r126)
            java.lang.String r0 = r0.f3036n
            int r0 = M0.I.i(r0)
            r3 = r134
            r4 = -1
            if (r3 != r4) goto L_0x0c2f
            r3 = r0
        L_0x0c2c:
            r0 = r142
            goto L_0x0c3b
        L_0x0c2f:
            if (r0 != r4) goto L_0x0c32
            goto L_0x0c2c
        L_0x0c32:
            if (r3 != r0) goto L_0x0c36
            r10 = 1
            goto L_0x0c37
        L_0x0c36:
            r10 = 0
        L_0x0c37:
            P0.l.j(r10)
            goto L_0x0c2c
        L_0x0c3b:
            r0.add(r2)
            r13 = r162
            r142 = r0
            r63 = r1
            r1 = r3
            r16 = r15
            r160 = r78
            r53 = r106
            r0 = r135
            r15 = r136
            r3 = r141
            r14 = r145
            r6 = r146
            r10 = r149
            r11 = 4
            r12 = 0
            r98 = 1
            goto L_0x0df5
        L_0x0c5d:
            r124 = r5
            r16 = r53
            r5 = r93
            r13 = 2
            r93 = r91
            r13 = r162
            r98 = r2
            r123 = r3
            r129 = r4
            r107 = r6
            r125 = r7
            r118 = r8
            r126 = r9
            r130 = r12
            r99 = r14
            r109 = r15
            r121 = r48
            r116 = r49
            r7 = r52
            r52 = r64
            r90 = r71
            r117 = r77
            r4 = r79
            r6 = r81
            r14 = r82
            r3 = r84
            r9 = r88
            r8 = r89
            r108 = r94
            r15 = r105
            r2 = r128
            r128 = r134
            r71 = r135
            r84 = r136
            r82 = r138
            r81 = r139
            r88 = r140
            r89 = r141
            r94 = r142
            r115 = r143
            r63 = r144
            r87 = r146
            r96 = r147
            r120 = r148
            r110 = r149
            r112 = r150
            r12 = r151
            r93 = r5
            r49 = r16
            r79 = r32
            r77 = r33
            r105 = r83
            r5 = r92
            r92 = r137
            r83 = r145
            goto L_0x0692
        L_0x0ccc:
            r128 = r2
            r16 = r7
            r147 = r10
            r149 = r12
            r12 = r13
            r114 = r14
            r2 = r15
            r64 = r52
            r144 = r63
            r135 = r71
            r33 = r77
            r32 = r79
            r139 = r81
            r138 = r82
            r145 = r83
            r10 = r84
            r52 = r86
            r146 = r87
            r140 = r88
            r141 = r89
            r127 = r90
            r77 = r91
            r49 = r92
            r89 = r93
            r142 = r94
            r71 = r95
            r48 = r96
            r137 = r98
            r83 = r105
            r53 = r106
            r13 = 2
            r41 = 0
            r98 = 1
            r86 = r1
            r84 = r3
            r79 = r4
            r81 = r6
            r94 = r8
            r88 = r9
            r63 = r11
            boolean r0 = P0.l.v(r12, r10)
            if (r0 == 0) goto L_0x0d3b
            r0 = r100
            X0.r r0 = (X0.r) r0
            X0.r r100 = r(r12, r0)
            r15 = r10
            r13 = r12
            r160 = r78
            r1 = r86
            r0 = r135
            r3 = r141
            r14 = r145
        L_0x0d33:
            r6 = r146
            r10 = r149
            r11 = 4
            r12 = 0
            goto L_0x0df5
        L_0x0d3b:
            r14 = r145
            boolean r0 = P0.l.v(r12, r14)
            if (r0 == 0) goto L_0x0d68
            r0 = r101
            long r101 = d(r12, r0)
            r1 = r100
            X0.o r1 = (X0.o) r1
            r0 = r162
            r2 = r44
            r4 = r50
            r6 = r103
            r8 = r101
            r15 = r10
            r10 = r26
            X0.o r100 = s(r0, r1, r2, r4, r6, r8, r10)
            r13 = r12
            r160 = r78
        L_0x0d61:
            r1 = r86
            r0 = r135
            r3 = r141
            goto L_0x0d33
        L_0x0d68:
            r15 = r10
            r11 = r78
            r0 = r101
            boolean r3 = P0.l.v(r12, r11)
            if (r3 == 0) goto L_0x0d91
            long r101 = d(r12, r0)
            r1 = r100
            X0.p r1 = (X0.p) r1
            r0 = r162
            r2 = r81
            r3 = r44
            r5 = r50
            r7 = r103
            r9 = r101
            r160 = r11
            r13 = r12
            r11 = r26
            X0.p r100 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            goto L_0x0d61
        L_0x0d91:
            r160 = r11
            r13 = r12
            boolean r3 = P0.l.v(r13, r2)
            if (r3 == 0) goto L_0x0daa
            X0.f r2 = h(r13, r2)
            r3 = r141
            r3.add(r2)
            r6 = r146
            r10 = r149
            r11 = 4
            r12 = 0
            goto L_0x0def
        L_0x0daa:
            r3 = r141
            java.lang.String r2 = "Label"
            boolean r4 = P0.l.v(r13, r2)
            if (r4 == 0) goto L_0x0de0
            r10 = r149
            r12 = 0
            java.lang.String r4 = r13.getAttributeValue(r12, r10)
            r5 = r66
        L_0x0dbd:
            r162.next()
            int r6 = r162.getEventType()
            r11 = 4
            if (r6 != r11) goto L_0x0dcc
            java.lang.String r5 = r162.getText()
            goto L_0x0dcf
        L_0x0dcc:
            b(r162)
        L_0x0dcf:
            boolean r6 = P0.l.t(r13, r2)
            if (r6 == 0) goto L_0x0dbd
            M0.t r2 = new M0.t
            r2.<init>(r4, r5)
            r6 = r146
            r6.add(r2)
            goto L_0x0def
        L_0x0de0:
            r6 = r146
            r10 = r149
            r11 = 4
            r12 = 0
            boolean r2 = P0.l.u(r162)
            if (r2 == 0) goto L_0x0def
            b(r162)
        L_0x0def:
            r101 = r0
            r1 = r86
            r0 = r135
        L_0x0df5:
            boolean r2 = P0.l.t(r13, r0)
            if (r2 == 0) goto L_0x0f9a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r142.size()
            r0.<init>(r2)
            r2 = 0
        L_0x0e05:
            int r4 = r142.size()
            if (r2 >= r4) goto L_0x0f66
            r4 = r142
            java.lang.Object r5 = r4.get(r2)
            X0.d r5 = (X0.d) r5
            M0.r r7 = r5.f6225a
            M0.q r7 = r7.a()
            r8 = r140
            if (r8 == 0) goto L_0x0e26
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L_0x0e26
            r7.f2990b = r8
            goto L_0x0e2c
        L_0x0e26:
            H3.O r9 = H3.O.m(r6)
            r7.f2991c = r9
        L_0x0e2c:
            java.lang.String r9 = r5.f6228d
            if (r9 != 0) goto L_0x0e32
            r9 = r72
        L_0x0e32:
            java.util.ArrayList r14 = r5.e
            r15 = r147
            r14.addAll(r15)
            boolean r34 = r14.isEmpty()
            if (r34 != 0) goto L_0x0f06
            r11 = 0
        L_0x0e40:
            int r12 = r14.size()
            if (r11 >= r12) goto L_0x0e69
            java.lang.Object r12 = r14.get(r11)
            M0.m r12 = (M0.C0125m) r12
            r142 = r4
            java.util.UUID r4 = M0.C0119g.f2945c
            r146 = r6
            java.util.UUID r6 = r12.f2969V
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0e62
            java.lang.String r4 = r12.f2970W
            if (r4 == 0) goto L_0x0e62
            r14.remove(r11)
            goto L_0x0e6e
        L_0x0e62:
            int r11 = r11 + 1
            r4 = r142
            r6 = r146
            goto L_0x0e40
        L_0x0e69:
            r142 = r4
            r146 = r6
            r4 = 0
        L_0x0e6e:
            if (r4 != 0) goto L_0x0e75
        L_0x0e70:
            r140 = r8
            r149 = r10
            goto L_0x0eac
        L_0x0e75:
            r11 = 0
        L_0x0e76:
            int r6 = r14.size()
            if (r11 >= r6) goto L_0x0e70
            java.lang.Object r6 = r14.get(r11)
            M0.m r6 = (M0.C0125m) r6
            java.util.UUID r12 = M0.C0119g.f2944b
            r140 = r8
            java.util.UUID r8 = r6.f2969V
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0ea3
            java.lang.String r8 = r6.f2970W
            if (r8 != 0) goto L_0x0ea3
            M0.m r8 = new M0.m
            java.util.UUID r12 = M0.C0119g.f2945c
            r149 = r10
            java.lang.String r10 = r6.f2971X
            byte[] r6 = r6.f2972Y
            r8.<init>(r12, r4, r10, r6)
            r14.set(r11, r8)
            goto L_0x0ea5
        L_0x0ea3:
            r149 = r10
        L_0x0ea5:
            int r11 = r11 + 1
            r8 = r140
            r10 = r149
            goto L_0x0e76
        L_0x0eac:
            int r4 = r14.size()
            int r4 = r4 + -1
        L_0x0eb2:
            if (r4 < 0) goto L_0x0efc
            java.lang.Object r6 = r14.get(r4)
            M0.m r6 = (M0.C0125m) r6
            byte[] r8 = r6.f2972Y
            if (r8 == 0) goto L_0x0ec1
        L_0x0ebe:
            r43 = -1
            goto L_0x0ef9
        L_0x0ec1:
            r11 = 0
        L_0x0ec2:
            int r8 = r14.size()
            if (r11 >= r8) goto L_0x0ebe
            java.lang.Object r8 = r14.get(r11)
            M0.m r8 = (M0.C0125m) r8
            byte[] r10 = r8.f2972Y
            if (r10 == 0) goto L_0x0ef6
            byte[] r10 = r6.f2972Y
            if (r10 == 0) goto L_0x0ed7
            goto L_0x0ef6
        L_0x0ed7:
            java.util.UUID r10 = r6.f2969V
            r8.getClass()
            java.util.UUID r12 = M0.C0119g.f2943a
            java.util.UUID r8 = r8.f2969V
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x0eef
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x0eed
            goto L_0x0eef
        L_0x0eed:
            r10 = 0
            goto L_0x0ef0
        L_0x0eef:
            r10 = 1
        L_0x0ef0:
            if (r10 == 0) goto L_0x0ef6
            r14.remove(r4)
            goto L_0x0ebe
        L_0x0ef6:
            int r11 = r11 + 1
            goto L_0x0ec2
        L_0x0ef9:
            int r4 = r4 + -1
            goto L_0x0eb2
        L_0x0efc:
            r43 = -1
            M0.n r4 = new M0.n
            r4.<init>(r9, r14)
            r7.f3003q = r4
            goto L_0x0f10
        L_0x0f06:
            r142 = r4
            r146 = r6
            r140 = r8
            r149 = r10
            r43 = -1
        L_0x0f10:
            java.util.ArrayList r4 = r5.f6229f
            r4.addAll(r3)
            M0.r r6 = new M0.r
            r6.<init>(r7)
            X0.s r7 = r5.f6227c
            boolean r8 = r7 instanceof X0.r
            long r9 = r5.f6230g
            H3.O r5 = r5.f6226b
            if (r8 == 0) goto L_0x0f38
            X0.l r8 = new X0.l
            r94 = r7
            X0.r r94 = (X0.r) r94
            r89 = r8
            r90 = r9
            r92 = r6
            r93 = r5
            r95 = r4
            r89.<init>(r90, r92, r93, r94, r95)
            goto L_0x0f4f
        L_0x0f38:
            boolean r8 = r7 instanceof X0.n
            if (r8 == 0) goto L_0x0f5e
            X0.k r8 = new X0.k
            r94 = r7
            X0.n r94 = (X0.n) r94
            r89 = r8
            r90 = r9
            r92 = r6
            r93 = r5
            r95 = r4
            r89.<init>(r90, r92, r93, r94, r95)
        L_0x0f4f:
            r0.add(r8)
            int r2 = r2 + 1
            r147 = r15
            r6 = r146
            r10 = r149
            r11 = 4
            r12 = 0
            goto L_0x0e05
        L_0x0f5e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r1)
            throw r0
        L_0x0f66:
            r149 = r10
            r43 = -1
            X0.a r2 = new X0.a
            r72 = r2
            r75 = r1
            r76 = r0
            r77 = r16
            r78 = r79
            r79 = r81
            r72.<init>(r73, r75, r76, r77, r78, r79)
            r12 = r67
            r12.add(r2)
            r67 = r12
            r66 = r42
            r42 = r59
            r59 = r137
            r34 = r138
            r16 = r144
        L_0x0f8c:
            r14 = r149
            r15 = 0
            r52 = 0
            r63 = 4
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x1279
        L_0x0f9a:
            r43 = -1
            r87 = r6
            r12 = r10
            r7 = r16
            r96 = r48
            r92 = r49
            r86 = r52
            r11 = r63
            r95 = r71
            r91 = r77
            r4 = r79
            r99 = r81
            r9 = r88
            r93 = r89
            r8 = r94
            r5 = r103
            r90 = r127
            r2 = r128
            r98 = r137
            r82 = r138
            r81 = r139
            r88 = r140
            r94 = r142
            r63 = r144
            r10 = r147
            r78 = r160
            r71 = r0
            r89 = r3
            r79 = r32
            r77 = r33
            r0 = r83
            r3 = r84
            r83 = r14
            r84 = r15
            r15 = r53
            r52 = r64
            r14 = r114
            goto L_0x03e4
        L_0x0fe5:
            r70 = r2
            r84 = r3
            r33 = r4
            r137 = r5
            r139 = r6
            r138 = r7
            r32 = r8
            r88 = r9
            r160 = r11
            r149 = r12
            r80 = r14
            r64 = r52
            r144 = r63
            r12 = r67
            r41 = 0
            r43 = -1
            r98 = 1
            r14 = r10
            java.lang.String r0 = "EventStream"
            boolean r1 = P0.l.v(r13, r0)
            if (r1 == 0) goto L_0x11d3
            r10 = r138
            r1 = 0
            java.lang.String r2 = r13.getAttributeValue(r1, r10)
            if (r2 != 0) goto L_0x101b
            r2 = r66
        L_0x101b:
            r11 = r144
            java.lang.String r3 = r13.getAttributeValue(r1, r11)
            if (r3 != 0) goto L_0x1025
            r3 = r66
        L_0x1025:
            java.lang.String r1 = "timescale"
            r4 = 1
            long r4 = l(r13, r1, r4)
            java.lang.String r1 = "presentationTimeOffset"
            r8 = 0
            long r6 = l(r13, r1, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream
            r15 = 512(0x200, float:7.175E-43)
            r14.<init>(r15)
        L_0x1041:
            r162.next()
            java.lang.String r15 = "Event"
            boolean r16 = P0.l.v(r13, r15)
            if (r16 == 0) goto L_0x1170
            r67 = r12
            r12 = r137
            long r48 = l(r13, r12, r8)
            r12 = r42
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r71 = l(r13, r12, r8)
            java.lang.String r8 = "presentationTime"
            r138 = r10
            r9 = 0
            long r52 = l(r13, r8, r9)
            int r8 = P0.z.f3748a
            java.math.RoundingMode r8 = java.math.RoundingMode.DOWN
            r73 = 1000(0x3e8, double:4.94E-321)
            r75 = r4
            r77 = r8
            long r78 = P0.z.W(r71, r73, r75, r77)
            long r71 = r52 - r6
            r73 = 1000000(0xf4240, double:4.940656E-318)
            r75 = r4
            r77 = r8
            long r52 = P0.z.W(r71, r73, r75, r77)
            java.lang.String r8 = "messageData"
            r9 = 0
            java.lang.String r8 = r13.getAttributeValue(r9, r8)
            if (r8 != 0) goto L_0x108e
            r8 = 0
        L_0x108e:
            r14.reset()
            org.xmlpull.v1.XmlSerializer r9 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = r10.name()
            r9.setOutput(r14, r10)
            r162.nextToken()
        L_0x10a1:
            boolean r10 = P0.l.t(r13, r15)
            if (r10 != 0) goto L_0x113f
            int r10 = r162.getEventType()
            switch(r10) {
                case 0: goto L_0x112c;
                case 1: goto L_0x1124;
                case 2: goto L_0x10fa;
                case 3: goto L_0x10ec;
                case 4: goto L_0x10e4;
                case 5: goto L_0x10dc;
                case 6: goto L_0x10d4;
                case 7: goto L_0x10cc;
                case 8: goto L_0x10c4;
                case 9: goto L_0x10bc;
                case 10: goto L_0x10b4;
                default: goto L_0x10ae;
            }
        L_0x10ae:
            r85 = r4
        L_0x10b0:
            r89 = r6
            goto L_0x1136
        L_0x10b4:
            java.lang.String r10 = r162.getText()
            r9.docdecl(r10)
            goto L_0x10ae
        L_0x10bc:
            java.lang.String r10 = r162.getText()
            r9.comment(r10)
            goto L_0x10ae
        L_0x10c4:
            java.lang.String r10 = r162.getText()
            r9.processingInstruction(r10)
            goto L_0x10ae
        L_0x10cc:
            java.lang.String r10 = r162.getText()
            r9.ignorableWhitespace(r10)
            goto L_0x10ae
        L_0x10d4:
            java.lang.String r10 = r162.getText()
            r9.entityRef(r10)
            goto L_0x10ae
        L_0x10dc:
            java.lang.String r10 = r162.getText()
            r9.cdsect(r10)
            goto L_0x10ae
        L_0x10e4:
            java.lang.String r10 = r162.getText()
            r9.text(r10)
            goto L_0x10ae
        L_0x10ec:
            java.lang.String r10 = r162.getNamespace()
            r85 = r4
            java.lang.String r4 = r162.getName()
            r9.endTag(r10, r4)
            goto L_0x10b0
        L_0x10fa:
            r85 = r4
            java.lang.String r4 = r162.getNamespace()
            java.lang.String r5 = r162.getName()
            r9.startTag(r4, r5)
            r4 = 0
        L_0x1108:
            int r5 = r162.getAttributeCount()
            if (r4 >= r5) goto L_0x10b0
            java.lang.String r5 = r13.getAttributeNamespace(r4)
            java.lang.String r10 = r13.getAttributeName(r4)
            r89 = r6
            java.lang.String r6 = r13.getAttributeValue(r4)
            r9.attribute(r5, r10, r6)
            int r4 = r4 + 1
            r6 = r89
            goto L_0x1108
        L_0x1124:
            r85 = r4
            r89 = r6
            r9.endDocument()
            goto L_0x1136
        L_0x112c:
            r85 = r4
            r89 = r6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5 = 0
            r9.startDocument(r5, r4)
        L_0x1136:
            r162.nextToken()
            r4 = r85
            r6 = r89
            goto L_0x10a1
        L_0x113f:
            r85 = r4
            r89 = r6
            r9.flush()
            byte[] r4 = r14.toByteArray()
            java.lang.Long r5 = java.lang.Long.valueOf(r52)
            if (r8 != 0) goto L_0x1151
            goto L_0x1157
        L_0x1151:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r8.getBytes(r4)
        L_0x1157:
            A1.b r6 = new A1.b
            r71 = r6
            r72 = r2
            r73 = r3
            r74 = r78
            r76 = r48
            r78 = r4
            r71.<init>(r72, r73, r74, r76, r78)
            android.util.Pair r4 = android.util.Pair.create(r5, r6)
            r1.add(r4)
            goto L_0x117d
        L_0x1170:
            r85 = r4
            r89 = r6
            r138 = r10
            r67 = r12
            r12 = r42
            b(r162)
        L_0x117d:
            boolean r4 = P0.l.t(r13, r0)
            if (r4 == 0) goto L_0x11c5
            int r0 = r1.size()
            long[] r0 = new long[r0]
            int r4 = r1.size()
            A1.b[] r4 = new A1.b[r4]
            r5 = 0
        L_0x1190:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x11af
            java.lang.Object r6 = r1.get(r5)
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r7 = r6.first
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            r0[r5] = r7
            java.lang.Object r6 = r6.second
            A1.b r6 = (A1.b) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x1190
        L_0x11af:
            X0.g r1 = new X0.g
            r1.<init>(r2, r3, r0, r4)
            r10 = r59
            r10.add(r1)
            r42 = r10
            r16 = r11
            r66 = r12
            r59 = r137
            r34 = r138
            goto L_0x0f8c
        L_0x11c5:
            r42 = r12
            r12 = r67
            r4 = r85
            r6 = r89
            r10 = r138
            r8 = 0
            goto L_0x1041
        L_0x11d3:
            r67 = r12
            r12 = r42
            r10 = r59
            r11 = r144
            boolean r0 = P0.l.v(r13, r15)
            if (r0 == 0) goto L_0x1203
            r15 = 0
            X0.r r0 = r(r13, r15)
            r54 = r0
            r42 = r10
            r16 = r11
            r66 = r12
            r10 = r68
            r59 = r137
            r34 = r138
            r0 = r139
            r14 = r149
            r52 = 0
            r63 = 4
        L_0x11fc:
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x1297
        L_0x1203:
            r15 = 0
            boolean r0 = P0.l.v(r13, r14)
            if (r0 == 0) goto L_0x123d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r48 = d(r13, r8)
            r1 = 0
            r0 = r162
            r2 = r44
            r4 = r50
            r6 = r68
            r52 = 0
            r8 = r48
            r42 = r10
            r16 = r11
            r34 = r138
            r14 = r149
            r63 = 4
            r10 = r26
            X0.o r0 = s(r0, r1, r2, r4, r6, r8, r10)
            r54 = r0
            r66 = r12
            r60 = r48
            r10 = r68
            r59 = r137
            r0 = r139
            goto L_0x11fc
        L_0x123d:
            r42 = r10
            r16 = r11
            r34 = r138
            r14 = r149
            r0 = r160
            r52 = 0
            r63 = 4
            boolean r0 = P0.l.v(r13, r0)
            if (r0 == 0) goto L_0x127e
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r48 = d(r13, r9)
            H3.M r0 = H3.O.f2026V
            H3.i0 r2 = H3.i0.f2073Y
            r1 = 0
            r0 = r162
            r3 = r44
            r5 = r50
            r7 = r68
            r71 = r9
            r9 = r48
            r66 = r12
            r59 = r137
            r11 = r26
            X0.p r0 = t(r0, r1, r2, r3, r5, r7, r9, r11)
            r54 = r0
            r60 = r48
        L_0x1279:
            r10 = r68
            r0 = r139
            goto L_0x1297
        L_0x127e:
            r66 = r12
            r59 = r137
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r0 = "AssetIdentifier"
            boolean r1 = P0.l.v(r13, r0)
            if (r1 == 0) goto L_0x1293
            h(r13, r0)
            goto L_0x1279
        L_0x1293:
            b(r162)
            goto L_0x1279
        L_0x1297:
            boolean r1 = P0.l.t(r13, r0)
            if (r1 == 0) goto L_0x12fa
            X0.h r0 = new X0.h
            r54 = r0
            r58 = r67
            r59 = r42
            r54.<init>(r55, r56, r58, r59)
            java.lang.Long r1 = java.lang.Long.valueOf(r50)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            java.lang.Object r1 = r0.first
            X0.h r1 = (X0.h) r1
            long r2 = r1.f6244b
            int r4 = (r2 > r71 ? 1 : (r2 == r71 ? 0 : -1))
            if (r4 != 0) goto L_0x12d7
            if (r23 == 0) goto L_0x12c0
            r2 = r62
            r10 = 1
            goto L_0x12f5
        L_0x12c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to determine start of period "
            r0.<init>(r1)
            int r1 = r62.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.b(r15, r0)
            throw r0
        L_0x12d7:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r71 ? 1 : (r2 == r71 ? 0 : -1))
            if (r0 != 0) goto L_0x12e8
            r2 = r62
            r6 = r71
            goto L_0x12ee
        L_0x12e8:
            long r4 = r1.f6244b
            long r6 = r4 + r2
            r2 = r62
        L_0x12ee:
            r2.add(r1)
            r46 = r6
            r10 = r36
        L_0x12f5:
            r36 = r10
        L_0x12f7:
            r0 = r64
            goto L_0x1339
        L_0x12fa:
            r6 = r0
            r12 = r14
            r63 = r16
            r8 = r32
            r4 = r33
            r7 = r34
            r5 = r59
            r52 = r64
            r15 = r67
            r2 = r70
            r0 = r71
            r14 = r80
            r3 = r84
            r9 = r88
            r59 = r42
            r42 = r66
            goto L_0x02d8
        L_0x131a:
            r70 = r2
            r32 = r8
            r88 = r9
            r2 = r10
            r46 = r14
            r64 = r52
            r15 = 0
            r41 = 0
            r43 = -1
            r52 = 0
            r63 = 4
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r98 = 1
            b(r162)
            goto L_0x12f7
        L_0x1339:
            java.lang.String r3 = "MPD"
            boolean r3 = P0.l.t(r13, r3)
            if (r3 == 0) goto L_0x1375
            int r0 = (r19 > r71 ? 1 : (r19 == r71 ? 0 : -1))
            if (r0 != 0) goto L_0x1356
            int r0 = (r46 > r71 ? 1 : (r46 == r71 ? 0 : -1))
            if (r0 == 0) goto L_0x134c
            r19 = r46
            goto L_0x1356
        L_0x134c:
            if (r23 == 0) goto L_0x134f
            goto L_0x1356
        L_0x134f:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            M0.J r0 = M0.J.b(r15, r0)
            throw r0
        L_0x1356:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x136e
            X0.c r0 = new X0.c
            r16 = r0
            r32 = r37
            r33 = r38
            r34 = r40
            r35 = r39
            r36 = r2
            r16.<init>(r17, r19, r21, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)
            return r0
        L_0x136e:
            java.lang.String r0 = "No periods found."
            M0.J r0 = M0.J.b(r15, r0)
            throw r0
        L_0x1375:
            r5 = r2
            r8 = r15
            r4 = r32
            r14 = r46
            r2 = r70
            r6 = r71
            r9 = r88
            r10 = 1
            r11 = 0
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.e.m(org.xmlpull.v1.XmlPullParser, android.net.Uri):X0.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j7 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j8 = (Long.parseLong(split[1]) - j7) + 1;
            }
            j8 = -1;
        } else {
            j7 = 0;
            j8 = -1;
        }
        return new j(j7, j8, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c8 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c8 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c8 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c8 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c8 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c8 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c8 = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c8 = 9;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c8 = 10;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c8 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c8 = 12;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (h.n("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i8)).f6236a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        r rVar2 = rVar;
        if (rVar2 != null) {
            j7 = rVar2.f6275b;
        } else {
            j7 = 1;
        }
        long l8 = l(xmlPullParser2, "timescale", j7);
        long j12 = 0;
        if (rVar2 != null) {
            j8 = rVar2.f6276c;
        } else {
            j8 = 0;
        }
        long l9 = l(xmlPullParser2, "presentationTimeOffset", j8);
        if (rVar2 != null) {
            j9 = rVar2.f6273d;
        } else {
            j9 = 0;
        }
        if (rVar2 != null) {
            j12 = rVar2.e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j12;
            j11 = j9;
        }
        if (rVar2 != null) {
            jVar = rVar2.f6274a;
        }
        do {
            xmlPullParser.next();
            if (l.v(xmlPullParser2, "Initialization")) {
                jVar = o(xmlPullParser2, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!l.t(xmlPullParser2, "SegmentBase"));
        return new r(jVar, l8, l9, j11, j10);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j7, long j8, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        o oVar2 = oVar;
        long j17 = 1;
        if (oVar2 != null) {
            j12 = oVar2.f6275b;
        } else {
            j12 = 1;
        }
        long l8 = l(xmlPullParser2, "timescale", j12);
        if (oVar2 != null) {
            j13 = oVar2.f6276c;
        } else {
            j13 = 0;
        }
        long l9 = l(xmlPullParser2, "presentationTimeOffset", j13);
        if (oVar2 != null) {
            j14 = oVar2.e;
        } else {
            j14 = -9223372036854775807L;
        }
        long l10 = l(xmlPullParser2, "duration", j14);
        if (oVar2 != null) {
            j17 = oVar2.f6263d;
        }
        long l11 = l(xmlPullParser2, "startNumber", j17);
        if (j10 == -9223372036854775807L) {
            j15 = j9;
        } else {
            j15 = j10;
        }
        if (j15 == Long.MAX_VALUE) {
            j16 = -9223372036854775807L;
        } else {
            j16 = j15;
        }
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (l.v(xmlPullParser2, "Initialization")) {
                jVar = o(xmlPullParser2, "sourceURL", "range");
                long j18 = j8;
            } else if (l.v(xmlPullParser2, "SegmentTimeline")) {
                list2 = u(xmlPullParser2, l8, j8);
            } else {
                long j19 = j8;
                if (l.v(xmlPullParser2, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(o(xmlPullParser2, "media", "mediaRange"));
                } else {
                    b(xmlPullParser);
                }
            }
        } while (!l.t(xmlPullParser2, "SegmentList"));
        if (oVar2 != null) {
            if (jVar == null) {
                jVar = oVar2.f6274a;
            }
            if (list2 == null) {
                list2 = oVar2.f6264f;
            }
            if (list == null) {
                list = oVar2.f6267j;
            }
        }
        return new o(jVar, l8, l9, l11, l10, list2, j16, list, z.O(j11), z.O(j7));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j7, long j8, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        q0 q0Var;
        q0 q0Var2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        p pVar2 = pVar;
        long j18 = 1;
        if (pVar2 != null) {
            j12 = pVar2.f6275b;
        } else {
            j12 = 1;
        }
        long l8 = l(xmlPullParser2, "timescale", j12);
        if (pVar2 != null) {
            j13 = pVar2.f6276c;
        } else {
            j13 = 0;
        }
        long l9 = l(xmlPullParser2, "presentationTimeOffset", j13);
        if (pVar2 != null) {
            j14 = pVar2.e;
        } else {
            j14 = -9223372036854775807L;
        }
        long l10 = l(xmlPullParser2, "duration", j14);
        if (pVar2 != null) {
            j18 = pVar2.f6263d;
        }
        long l11 = l(xmlPullParser2, "startNumber", j18);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i);
            if (h.n("http://dashif.org/guidelines/last-segment-number", fVar.f6236a)) {
                j15 = Long.parseLong(fVar.f6237b);
                break;
            }
            i++;
        }
        long j19 = j15;
        if (j10 == -9223372036854775807L) {
            j16 = j9;
        } else {
            j16 = j10;
        }
        if (j16 == Long.MAX_VALUE) {
            j17 = -9223372036854775807L;
        } else {
            j17 = j16;
        }
        j jVar = null;
        if (pVar2 != null) {
            q0Var = pVar2.f6269k;
        } else {
            q0Var = null;
        }
        q0 v4 = v(xmlPullParser2, "media", q0Var);
        if (pVar2 != null) {
            q0Var2 = pVar2.f6268j;
        } else {
            q0Var2 = null;
        }
        q0 v8 = v(xmlPullParser2, "initialization", q0Var2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (l.v(xmlPullParser2, "Initialization")) {
                jVar = o(xmlPullParser2, "sourceURL", "range");
                long j20 = j8;
            } else if (l.v(xmlPullParser2, "SegmentTimeline")) {
                list2 = u(xmlPullParser2, l8, j8);
            } else {
                long j21 = j8;
                b(xmlPullParser);
            }
        } while (!l.t(xmlPullParser2, "SegmentTemplate"));
        if (pVar2 != null) {
            if (jVar == null) {
                jVar = pVar2.f6274a;
            }
            if (list2 == null) {
                list2 = pVar2.f6264f;
            }
        }
        return new p(jVar, l8, l9, l11, j19, l10, list2, j17, v8, v4, z.O(j11), z.O(j7));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j7, long j8) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (l.v(xmlPullParser2, "S")) {
                long l8 = l(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j9 = a(arrayList, j9, j10, i, l8);
                }
                if (l8 == -9223372036854775807L) {
                    l8 = j9;
                }
                j10 = l(xmlPullParser2, "d", -9223372036854775807L);
                i = k(xmlPullParser2, "r", 0);
                j9 = l8;
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!l.t(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            int i8 = z.f3748a;
            a(arrayList, j9, j10, i, z.W(j8, j7, 1000, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B.q0 v(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, B.q0 r14) {
        /*
            r0 = -1
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r12 = r12.getAttributeValue(r4, r13)
            if (r12 == 0) goto L_0x0161
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = ""
            r13.add(r5)
            r6 = 0
        L_0x0020:
            int r7 = r12.length()
            if (r6 >= r7) goto L_0x0159
            java.lang.String r7 = "$"
            int r8 = r12.indexOf(r7, r6)
            if (r8 != r0) goto L_0x0057
            int r7 = r14.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r14.size()
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r8.append(r9)
            java.lang.String r6 = r12.substring(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r13.set(r7, r6)
            int r6 = r12.length()
            goto L_0x0020
        L_0x0057:
            if (r8 == r6) goto L_0x007f
            int r7 = r14.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r14.size()
            java.lang.Object r10 = r13.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.append(r10)
            java.lang.String r6 = r12.substring(r6, r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r13.set(r7, r6)
            r6 = r8
            goto L_0x0020
        L_0x007f:
            java.lang.String r8 = "$$"
            boolean r8 = r12.startsWith(r8, r6)
            if (r8 == 0) goto L_0x00aa
            int r8 = r14.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r14.size()
            java.lang.Object r10 = r13.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r13.set(r8, r7)
            int r6 = r6 + r2
            goto L_0x0020
        L_0x00aa:
            r4.add(r5)
            int r6 = r6 + r3
            int r7 = r12.indexOf(r7, r6)
            java.lang.String r6 = r12.substring(r6, r7)
            java.lang.String r8 = "RepresentationID"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x00c7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r14.add(r6)
            goto L_0x0152
        L_0x00c7:
            java.lang.String r8 = "%0"
            int r8 = r6.indexOf(r8)
            if (r8 == r0) goto L_0x00f4
            java.lang.String r9 = r6.substring(r8)
            java.lang.String r10 = "d"
            boolean r11 = r9.endsWith(r10)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "x"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "X"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r9 = r9.concat(r10)
        L_0x00ef:
            java.lang.String r6 = r6.substring(r1, r8)
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r9 = "%01d"
        L_0x00f6:
            r6.getClass()
            int r8 = r6.hashCode()
            switch(r8) {
                case -1950496919: goto L_0x0118;
                case 2606829: goto L_0x010d;
                case 38199441: goto L_0x0102;
                default: goto L_0x0100;
            }
        L_0x0100:
            r6 = -1
            goto L_0x0122
        L_0x0102:
            java.lang.String r8 = "Bandwidth"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x010b
            goto L_0x0100
        L_0x010b:
            r6 = 2
            goto L_0x0122
        L_0x010d:
            java.lang.String r8 = "Time"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0116
            goto L_0x0100
        L_0x0116:
            r6 = 1
            goto L_0x0122
        L_0x0118:
            java.lang.String r8 = "Number"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0121
            goto L_0x0100
        L_0x0121:
            r6 = 0
        L_0x0122:
            switch(r6) {
                case 0: goto L_0x0143;
                case 1: goto L_0x013a;
                case 2: goto L_0x0131;
                default: goto L_0x0125;
            }
        L_0x0125:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Invalid template: "
            java.lang.String r12 = r14.concat(r12)
            r13.<init>(r12)
            throw r13
        L_0x0131:
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x014a
        L_0x013a:
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x014a
        L_0x0143:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r14.add(r6)
        L_0x014a:
            int r6 = r14.size()
            int r6 = r6 - r3
            r4.set(r6, r9)
        L_0x0152:
            r13.add(r5)
            int r7 = r7 + r3
            r6 = r7
            goto L_0x0020
        L_0x0159:
            B.q0 r12 = new B.q0
            r0 = 25
            r12.<init>((java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r4, (int) r0)
            return r12
        L_0x0161:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.e.v(org.xmlpull.v1.XmlPullParser, java.lang.String, B.q0):B.q0");
    }

    public final Object n(Uri uri, j jVar) {
        try {
            XmlPullParser newPullParser = this.f6235U.newPullParser();
            newPullParser.setInput(jVar, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m(newPullParser, uri);
            }
            throw J.b((Exception) null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw J.b(e, (String) null);
        }
    }
}
