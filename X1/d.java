package x1;

import H3.L;
import H3.O;
import H3.i0;
import P0.l;
import org.xmlpull.v1.XmlPullParser;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f16247a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f16248b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f16249c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 == -1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static P5.E a(java.lang.String r20) {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = P0.l.v(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x00d0
            H3.M r3 = H3.O.f2026V
            H3.i0 r3 = H3.i0.f2073Y
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L_0x0029:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = P0.l.v(r1, r9)
            if (r9 == 0) goto L_0x009b
            java.lang.String[] r3 = f16247a
            r7 = 0
            r8 = 0
        L_0x0038:
            r9 = 4
            if (r8 >= r9) goto L_0x009a
            r10 = r3[r8]
            java.lang.String r10 = P0.l.q(r1, r10)
            if (r10 == 0) goto L_0x0098
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto L_0x009a
            java.lang.String[] r3 = f16248b
            r8 = 0
        L_0x004c:
            if (r8 >= r9) goto L_0x0063
            r10 = r3[r8]
            java.lang.String r10 = P0.l.q(r1, r10)
            if (r10 == 0) goto L_0x0061
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0061:
            int r8 = r8 + r0
            goto L_0x004c
        L_0x0063:
            r8 = r5
        L_0x0064:
            java.lang.String[] r3 = f16249c
        L_0x0066:
            r10 = 2
            if (r7 >= r10) goto L_0x0092
            r10 = r3[r7]
            java.lang.String r10 = P0.l.q(r1, r10)
            if (r10 == 0) goto L_0x0090
            long r12 = java.lang.Long.parseLong(r10)
            x1.b r3 = new x1.b
            r15 = 0
            r17 = 0
            java.lang.String r19 = "image/jpeg"
            r14 = r3
            r14.<init>(r15, r17, r19)
            x1.b r7 = new x1.b
            r14 = 0
            java.lang.String r16 = "video/mp4"
            r11 = r7
            r11.<init>(r12, r14, r16)
            H3.i0 r3 = H3.O.s(r3, r7)
            goto L_0x0096
        L_0x0090:
            int r7 = r7 + r0
            goto L_0x0066
        L_0x0092:
            H3.M r3 = H3.O.f2026V
            H3.i0 r3 = H3.i0.f2073Y
        L_0x0096:
            r7 = r8
            goto L_0x00bc
        L_0x0098:
            int r8 = r8 + r0
            goto L_0x0038
        L_0x009a:
            return r4
        L_0x009b:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = P0.l.v(r1, r9)
            if (r9 == 0) goto L_0x00ac
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            H3.i0 r3 = b(r1, r3, r9)
            goto L_0x00bc
        L_0x00ac:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = P0.l.v(r1, r9)
            if (r9 == 0) goto L_0x00bc
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            H3.i0 r3 = b(r1, r3, r9)
        L_0x00bc:
            boolean r9 = P0.l.t(r1, r2)
            if (r9 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c9
            return r4
        L_0x00c9:
            P5.E r0 = new P5.E
            r1 = 6
            r0.<init>((long) r7, (java.lang.Object) r3, (int) r1)
            return r0
        L_0x00d0:
            java.lang.String r0 = "Couldn't find xmp metadata"
            M0.J r0 = M0.J.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.d.a(java.lang.String):P5.E");
    }

    public static i0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        L j9 = O.j();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (l.v(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String q7 = l.q(xmlPullParser, concat3);
                String q8 = l.q(xmlPullParser, concat4);
                String q9 = l.q(xmlPullParser, concat5);
                String q10 = l.q(xmlPullParser, concat6);
                if (q7 == null || q8 == null) {
                    return i0.f2073Y;
                }
                if (q9 != null) {
                    j7 = Long.parseLong(q9);
                } else {
                    j7 = 0;
                }
                if (q10 != null) {
                    j8 = Long.parseLong(q10);
                } else {
                    j8 = 0;
                }
                j9.a(new b(j7, j8, q7));
            }
        } while (!l.t(xmlPullParser, concat2));
        return j9.g();
    }
}
