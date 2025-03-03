package U7;

import M0.C0130s;
import Q7.g;
import R7.b;
import T7.P;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f5458d = {',', '>', '+', '~', ' '};
    public static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f5459f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f5460g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final P f5461a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5462b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5463c = new ArrayList();

    public r(String str) {
        g.A(str);
        String trim = str.trim();
        this.f5462b = trim;
        this.f5461a = new P(trim);
    }

    public static p k(String str) {
        try {
            return new r(str).j();
        } catch (IllegalArgumentException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: U7.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: U7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: U7.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(char r12) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            T7.P r3 = r11.f5461a
            r3.e()
            java.lang.StringBuilder r4 = R7.h.b()
            r5 = 0
        L_0x000d:
            boolean r6 = r3.f()
            if (r6 != 0) goto L_0x0084
            char[] r6 = f5458d
            boolean r6 = r3.i(r6)
            if (r6 == 0) goto L_0x0026
            if (r5 == 0) goto L_0x001e
            goto L_0x0084
        L_0x001e:
            char r6 = r3.b()
            r4.append(r6)
            goto L_0x000d
        L_0x0026:
            java.lang.String r5 = "("
            boolean r6 = r3.h(r5)
            if (r6 == 0) goto L_0x0042
            r4.append(r5)
            r5 = 40
            r6 = 41
            java.lang.String r5 = r3.a(r5, r6)
            r4.append(r5)
            java.lang.String r5 = ")"
            r4.append(r5)
            goto L_0x0082
        L_0x0042:
            java.lang.String r5 = "["
            boolean r6 = r3.h(r5)
            if (r6 == 0) goto L_0x005e
            r4.append(r5)
            r5 = 91
            r6 = 93
            java.lang.String r5 = r3.a(r5, r6)
            r4.append(r5)
            java.lang.String r5 = "]"
            r4.append(r5)
            goto L_0x0082
        L_0x005e:
            java.lang.String r5 = "\\"
            boolean r5 = r3.h(r5)
            if (r5 == 0) goto L_0x007b
            char r5 = r3.b()
            r4.append(r5)
            boolean r5 = r3.f()
            if (r5 != 0) goto L_0x0082
            char r5 = r3.b()
            r4.append(r5)
            goto L_0x0082
        L_0x007b:
            char r5 = r3.b()
            r4.append(r5)
        L_0x0082:
            r5 = 1
            goto L_0x000d
        L_0x0084:
            java.lang.String r3 = R7.h.h(r4)
            U7.p r3 = k(r3)
            java.util.ArrayList r4 = r11.f5463c
            int r5 = r4.size()
            r6 = 44
            if (r5 != r1) goto L_0x00bc
            java.lang.Object r5 = r4.get(r2)
            U7.p r5 = (U7.p) r5
            boolean r7 = r5 instanceof U7.b
            if (r7 == 0) goto L_0x00b9
            if (r12 == r6) goto L_0x00b9
            r7 = r5
            U7.b r7 = (U7.b) r7
            int r8 = r7.f5438c
            if (r8 <= 0) goto L_0x00b3
            java.util.ArrayList r7 = r7.f5436a
            int r8 = r8 - r1
            java.lang.Object r7 = r7.get(r8)
            U7.p r7 = (U7.p) r7
            goto L_0x00b4
        L_0x00b3:
            r7 = 0
        L_0x00b4:
            r8 = 1
            r10 = r7
            r7 = r5
            r5 = r10
            goto L_0x00c2
        L_0x00b9:
            r7 = r5
            r8 = 0
            goto L_0x00c2
        L_0x00bc:
            U7.a r5 = new U7.a
            r5.<init>((java.util.List) r4)
            goto L_0x00b9
        L_0x00c2:
            r4.clear()
            r9 = 32
            if (r12 == r9) goto L_0x0144
            r9 = 62
            if (r12 == r9) goto L_0x0128
            r9 = 126(0x7e, float:1.77E-43)
            if (r12 == r9) goto L_0x0117
            r9 = 43
            if (r12 == r9) goto L_0x0105
            if (r12 != r6) goto L_0x00f5
            boolean r12 = r5 instanceof U7.b
            if (r12 == 0) goto L_0x00de
            U7.b r5 = (U7.b) r5
            goto L_0x00ec
        L_0x00de:
            U7.b r12 = new U7.b
            r12.<init>()
            java.util.ArrayList r0 = r12.f5436a
            r0.add(r5)
            r12.d()
            r5 = r12
        L_0x00ec:
            java.util.ArrayList r12 = r5.f5436a
            r12.add(r3)
            r5.d()
            goto L_0x0155
        L_0x00f5:
            M0.s r0 = new M0.s
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r12
            java.lang.String r12 = "Unknown combinator '%s'"
            r0.<init>(r12, r1)
            throw r0
        L_0x0105:
            U7.a r12 = new U7.a
            U7.v r6 = new U7.v
            r6.<init>(r5)
            U7.p[] r0 = new U7.p[r0]
            r0[r2] = r6
            r0[r1] = r3
            r12.<init>((U7.p[]) r0)
        L_0x0115:
            r5 = r12
            goto L_0x0155
        L_0x0117:
            U7.a r12 = new U7.a
            U7.x r6 = new U7.x
            r6.<init>(r5)
            U7.p[] r0 = new U7.p[r0]
            r0[r2] = r6
            r0[r1] = r3
            r12.<init>((U7.p[]) r0)
            goto L_0x0115
        L_0x0128:
            boolean r12 = r5 instanceof U7.u
            if (r12 == 0) goto L_0x012f
            U7.u r5 = (U7.u) r5
            goto L_0x0135
        L_0x012f:
            U7.u r12 = new U7.u
            r12.<init>(r5)
            r5 = r12
        L_0x0135:
            java.util.ArrayList r12 = r5.f5467a
            r12.add(r3)
            int r12 = r5.f5468b
            int r0 = r3.a()
            int r0 = r0 + r12
            r5.f5468b = r0
            goto L_0x0155
        L_0x0144:
            U7.a r12 = new U7.a
            U7.w r6 = new U7.w
            r6.<init>(r5, r0)
            U7.p[] r0 = new U7.p[r0]
            r0[r2] = r6
            r0[r1] = r3
            r12.<init>((U7.p[]) r0)
            goto L_0x0115
        L_0x0155:
            if (r8 == 0) goto L_0x0166
            r12 = r7
            U7.b r12 = (U7.b) r12
            java.util.ArrayList r0 = r12.f5436a
            int r2 = r12.f5438c
            int r2 = r2 - r1
            r0.set(r2, r5)
            r12.d()
            goto L_0x0167
        L_0x0166:
            r7 = r5
        L_0x0167:
            r4.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.r.a(char):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final U7.p b() {
        /*
            r16 = this;
            r0 = r16
            r3 = 7
            r4 = 5
            r5 = 8
            r6 = 9
            r7 = 4
            r8 = 6
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            T7.P r13 = r0.f5461a
            java.lang.String r14 = "#"
            boolean r14 = r13.g(r14)
            java.lang.String[] r15 = T7.P.f5116d
            if (r14 == 0) goto L_0x0027
            java.lang.String r1 = r13.c(r15)
            Q7.g.A(r1)
            U7.g r2 = new U7.g
            r2.<init>(r5, r1, r12)
            return r2
        L_0x0027:
            java.lang.String r14 = "."
            boolean r14 = r13.g(r14)
            if (r14 == 0) goto L_0x0040
            java.lang.String r1 = r13.c(r15)
            Q7.g.A(r1)
            U7.g r2 = new U7.g
            java.lang.String r1 = r1.trim()
            r2.<init>(r10, r1, r12)
            return r2
        L_0x0040:
            boolean r14 = r13.f()
            if (r14 != 0) goto L_0x0056
            java.lang.String r14 = r13.f5117a
            int r5 = r13.f5118b
            char r5 = r14.charAt(r5)
            boolean r5 = java.lang.Character.isLetterOrDigit(r5)
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            java.lang.String r14 = ":"
            java.lang.String r1 = "*|"
            if (r5 != 0) goto L_0x0401
            boolean r5 = r13.h(r1)
            if (r5 == 0) goto L_0x0065
            goto L_0x0401
        L_0x0065:
            java.lang.String r1 = "["
            boolean r1 = r13.h(r1)
            java.lang.String r5 = "*"
            java.lang.String r2 = r0.f5462b
            if (r1 == 0) goto L_0x015d
            T7.P r1 = new T7.P
            r3 = 91
            r4 = 93
            java.lang.String r3 = r13.a(r3, r4)
            r1.<init>(r3)
            java.lang.String[] r3 = e
            int r4 = r1.f5118b
        L_0x0082:
            boolean r6 = r1.f()
            if (r6 != 0) goto L_0x009c
            r6 = 0
        L_0x0089:
            if (r6 >= r8) goto L_0x0096
            r13 = r3[r6]
            boolean r13 = r1.h(r13)
            if (r13 == 0) goto L_0x0094
            goto L_0x009c
        L_0x0094:
            int r6 = r6 + r11
            goto L_0x0089
        L_0x0096:
            int r6 = r1.f5118b
            int r6 = r6 + r11
            r1.f5118b = r6
            goto L_0x0082
        L_0x009c:
            java.lang.String r3 = r1.f5117a
            int r6 = r1.f5118b
            java.lang.String r3 = r3.substring(r4, r6)
            Q7.g.A(r3)
            r1.e()
            boolean r4 = r1.f()
            if (r4 == 0) goto L_0x00d9
            java.lang.String r1 = "^"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L_0x00c3
            U7.g r1 = new U7.g
            java.lang.String r2 = r3.substring(r11)
            r1.<init>(r2, r11)
            goto L_0x014a
        L_0x00c3:
            boolean r1 = r3.equals(r5)
            if (r1 == 0) goto L_0x00d2
            U7.g r1 = new U7.g
            java.lang.String r2 = ""
            r1.<init>(r2, r11)
            goto L_0x014a
        L_0x00d2:
            U7.g r1 = new U7.g
            r1.<init>(r12, r3, r12)
            goto L_0x014a
        L_0x00d9:
            java.lang.String r4 = "="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x00ec
            U7.i r2 = new U7.i
            java.lang.String r1 = r1.j()
            r2.<init>(r12, r3, r1, r11)
        L_0x00ea:
            r1 = r2
            goto L_0x014a
        L_0x00ec:
            java.lang.String r4 = "!="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x00fe
            U7.i r2 = new U7.i
            java.lang.String r1 = r1.j()
            r2.<init>(r9, r3, r1, r11)
            goto L_0x00ea
        L_0x00fe:
            java.lang.String r4 = "^="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x0110
            U7.i r2 = new U7.i
            java.lang.String r1 = r1.j()
            r2.<init>(r7, r3, r1, r12)
            goto L_0x00ea
        L_0x0110:
            java.lang.String r4 = "$="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x0122
            U7.i r2 = new U7.i
            java.lang.String r1 = r1.j()
            r2.<init>(r10, r3, r1, r12)
            goto L_0x00ea
        L_0x0122:
            java.lang.String r4 = "*="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x0134
            U7.i r2 = new U7.i
            java.lang.String r1 = r1.j()
            r2.<init>(r11, r3, r1, r11)
            goto L_0x00ea
        L_0x0134:
            java.lang.String r4 = "~="
            boolean r4 = r1.g(r4)
            if (r4 == 0) goto L_0x014b
            U7.j r2 = new U7.j
            java.lang.String r1 = r1.j()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r2.<init>(r3, r1)
            goto L_0x00ea
        L_0x014a:
            return r1
        L_0x014b:
            M0.s r3 = new M0.s
            java.lang.String r1 = r1.j()
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r12] = r2
            r4[r11] = r1
            java.lang.String r1 = "Could not parse attribute query '%s': unexpected token at '%s'"
            r3.<init>(r1, r4)
            throw r3
        L_0x015d:
            boolean r1 = r13.g(r5)
            if (r1 == 0) goto L_0x0169
            U7.f r1 = new U7.f
            r1.<init>(r12)
            return r1
        L_0x0169:
            boolean r1 = r13.g(r14)
            java.lang.String r5 = "Could not parse query '%s': unexpected token at '%s'"
            if (r1 == 0) goto L_0x03f1
            java.lang.String r1 = r13.c(r15)
            r1.getClass()
            r14 = -1
            int r15 = r1.hashCode()
            switch(r15) {
                case -2141736343: goto L_0x02e6;
                case -2136991809: goto L_0x02da;
                case -1939921007: goto L_0x02ce;
                case -1754914063: goto L_0x02c2;
                case -1629748624: goto L_0x02b6;
                case -947996741: goto L_0x02aa;
                case -897532411: goto L_0x029e;
                case -872629820: goto L_0x0292;
                case -567445985: goto L_0x0284;
                case -55413797: goto L_0x0276;
                case 3244: goto L_0x0268;
                case 3309: goto L_0x025a;
                case 3370: goto L_0x024c;
                case 3464: goto L_0x023e;
                case 103066: goto L_0x0230;
                case 109267: goto L_0x0222;
                case 3506402: goto L_0x0214;
                case 96634189: goto L_0x0206;
                case 208017639: goto L_0x01f8;
                case 614017170: goto L_0x01eb;
                case 835834661: goto L_0x01de;
                case 840862003: goto L_0x01d1;
                case 1255901423: goto L_0x01c4;
                case 1292941139: goto L_0x01b7;
                case 1455900751: goto L_0x01aa;
                case 1870740819: goto L_0x019d;
                case 2014184485: goto L_0x0190;
                case 2025926969: goto L_0x0183;
                default: goto L_0x0180;
            }
        L_0x0180:
            r1 = -1
            goto L_0x02f1
        L_0x0183:
            java.lang.String r6 = "last-of-type"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x018c
            goto L_0x0180
        L_0x018c:
            r1 = 27
            goto L_0x02f1
        L_0x0190:
            java.lang.String r6 = "containsWholeText"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0199
            goto L_0x0180
        L_0x0199:
            r1 = 26
            goto L_0x02f1
        L_0x019d:
            java.lang.String r6 = "matchesOwn"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01a6
            goto L_0x0180
        L_0x01a6:
            r1 = 25
            goto L_0x02f1
        L_0x01aa:
            java.lang.String r6 = "only-of-type"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01b3
            goto L_0x0180
        L_0x01b3:
            r1 = 24
            goto L_0x02f1
        L_0x01b7:
            java.lang.String r6 = "first-of-type"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01c0
            goto L_0x0180
        L_0x01c0:
            r1 = 23
            goto L_0x02f1
        L_0x01c4:
            java.lang.String r6 = "matchesWholeOwnText"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01cd
            goto L_0x0180
        L_0x01cd:
            r1 = 22
            goto L_0x02f1
        L_0x01d1:
            java.lang.String r6 = "matches"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01da
            goto L_0x0180
        L_0x01da:
            r1 = 21
            goto L_0x02f1
        L_0x01de:
            java.lang.String r6 = "last-child"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01e7
            goto L_0x0180
        L_0x01e7:
            r1 = 20
            goto L_0x02f1
        L_0x01eb:
            java.lang.String r6 = "matchText"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x01f4
            goto L_0x0180
        L_0x01f4:
            r1 = 19
            goto L_0x02f1
        L_0x01f8:
            java.lang.String r6 = "containsOwn"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0202
            goto L_0x0180
        L_0x0202:
            r1 = 18
            goto L_0x02f1
        L_0x0206:
            java.lang.String r6 = "empty"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0210
            goto L_0x0180
        L_0x0210:
            r1 = 17
            goto L_0x02f1
        L_0x0214:
            java.lang.String r6 = "root"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x021e
            goto L_0x0180
        L_0x021e:
            r1 = 16
            goto L_0x02f1
        L_0x0222:
            java.lang.String r6 = "not"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x022c
            goto L_0x0180
        L_0x022c:
            r1 = 15
            goto L_0x02f1
        L_0x0230:
            java.lang.String r6 = "has"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x023a
            goto L_0x0180
        L_0x023a:
            r1 = 14
            goto L_0x02f1
        L_0x023e:
            java.lang.String r6 = "lt"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0248
            goto L_0x0180
        L_0x0248:
            r1 = 13
            goto L_0x02f1
        L_0x024c:
            java.lang.String r6 = "is"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0256
            goto L_0x0180
        L_0x0256:
            r1 = 12
            goto L_0x02f1
        L_0x025a:
            java.lang.String r6 = "gt"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0264
            goto L_0x0180
        L_0x0264:
            r1 = 11
            goto L_0x02f1
        L_0x0268:
            java.lang.String r6 = "eq"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0272
            goto L_0x0180
        L_0x0272:
            r1 = 10
            goto L_0x02f1
        L_0x0276:
            java.lang.String r15 = "containsWholeOwnText"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0280
            goto L_0x0180
        L_0x0280:
            r1 = 9
            goto L_0x02f1
        L_0x0284:
            java.lang.String r6 = "contains"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x028e
            goto L_0x0180
        L_0x028e:
            r1 = 8
            goto L_0x02f1
        L_0x0292:
            java.lang.String r6 = "nth-last-of-type"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x029c
            goto L_0x0180
        L_0x029c:
            r1 = 7
            goto L_0x02f1
        L_0x029e:
            java.lang.String r6 = "nth-of-type"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02a8
            goto L_0x0180
        L_0x02a8:
            r1 = 6
            goto L_0x02f1
        L_0x02aa:
            java.lang.String r6 = "only-child"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02b4
            goto L_0x0180
        L_0x02b4:
            r1 = 5
            goto L_0x02f1
        L_0x02b6:
            java.lang.String r6 = "nth-last-child"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02c0
            goto L_0x0180
        L_0x02c0:
            r1 = 4
            goto L_0x02f1
        L_0x02c2:
            java.lang.String r6 = "nth-child"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02cc
            goto L_0x0180
        L_0x02cc:
            r1 = 3
            goto L_0x02f1
        L_0x02ce:
            java.lang.String r6 = "matchesWholeText"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02d8
            goto L_0x0180
        L_0x02d8:
            r1 = 2
            goto L_0x02f1
        L_0x02da:
            java.lang.String r6 = "first-child"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02e4
            goto L_0x0180
        L_0x02e4:
            r1 = 1
            goto L_0x02f1
        L_0x02e6:
            java.lang.String r6 = "containsData"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x02f0
            goto L_0x0180
        L_0x02f0:
            r1 = 0
        L_0x02f1:
            switch(r1) {
                case 0: goto L_0x03dc;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03d1;
                case 3: goto L_0x03cc;
                case 4: goto L_0x03c7;
                case 5: goto L_0x03c1;
                case 6: goto L_0x03bc;
                case 7: goto L_0x03b7;
                case 8: goto L_0x03b2;
                case 9: goto L_0x03ad;
                case 10: goto L_0x03a3;
                case 11: goto L_0x0399;
                case 12: goto L_0x0386;
                case 13: goto L_0x037b;
                case 14: goto L_0x0368;
                case 15: goto L_0x0353;
                case 16: goto L_0x034c;
                case 17: goto L_0x0345;
                case 18: goto L_0x033f;
                case 19: goto L_0x0338;
                case 20: goto L_0x0331;
                case 21: goto L_0x032b;
                case 22: goto L_0x0325;
                case 23: goto L_0x031e;
                case 24: goto L_0x0317;
                case 25: goto L_0x0311;
                case 26: goto L_0x030b;
                case 27: goto L_0x0304;
                default: goto L_0x02f4;
            }
        L_0x02f4:
            M0.s r1 = new M0.s
            java.lang.String r3 = r13.j()
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r12] = r2
            r4[r11] = r3
            r1.<init>(r5, r4)
            throw r1
        L_0x0304:
            U7.m r1 = new U7.m
            r1.<init>(r12, r11, r10)
            goto L_0x03f0
        L_0x030b:
            U7.p r1 = r0.f(r12)
            goto L_0x03f0
        L_0x0311:
            U7.p r1 = r0.h(r11)
            goto L_0x03f0
        L_0x0317:
            U7.f r1 = new U7.f
            r1.<init>(r4)
            goto L_0x03f0
        L_0x031e:
            U7.l r1 = new U7.l
            r1.<init>(r12, r11, r9)
            goto L_0x03f0
        L_0x0325:
            U7.p r1 = r0.i(r11)
            goto L_0x03f0
        L_0x032b:
            U7.p r1 = r0.h(r12)
            goto L_0x03f0
        L_0x0331:
            U7.f r1 = new U7.f
            r1.<init>(r9)
            goto L_0x03f0
        L_0x0338:
            U7.f r1 = new U7.f
            r1.<init>(r3)
            goto L_0x03f0
        L_0x033f:
            U7.p r1 = r0.e(r11)
            goto L_0x03f0
        L_0x0345:
            U7.f r1 = new U7.f
            r1.<init>(r11)
            goto L_0x03f0
        L_0x034c:
            U7.f r1 = new U7.f
            r1.<init>(r8)
            goto L_0x03f0
        L_0x0353:
            java.lang.String r1 = r16.d()
            java.lang.String r2 = ":not(selector) subselect must not be empty"
            Q7.g.B(r1, r2)
            U7.w r2 = new U7.w
            U7.p r1 = k(r1)
            r2.<init>(r1, r11)
        L_0x0365:
            r1 = r2
            goto L_0x03f0
        L_0x0368:
            java.lang.String r1 = r16.d()
            java.lang.String r2 = ":has(selector) sub-select must not be empty"
            Q7.g.B(r1, r2)
            U7.t r2 = new U7.t
            U7.p r1 = k(r1)
            r2.<init>(r1)
            goto L_0x0365
        L_0x037b:
            U7.k r1 = new U7.k
            int r2 = r16.c()
            r1.<init>(r2, r10)
            goto L_0x03f0
        L_0x0386:
            java.lang.String r1 = r16.d()
            java.lang.String r2 = ":is(selector) sub-select must not be empty"
            Q7.g.B(r1, r2)
            U7.w r2 = new U7.w
            U7.p r1 = k(r1)
            r2.<init>(r1, r12)
            goto L_0x0365
        L_0x0399:
            U7.k r1 = new U7.k
            int r2 = r16.c()
            r1.<init>(r2, r11)
            goto L_0x03f0
        L_0x03a3:
            U7.k r1 = new U7.k
            int r2 = r16.c()
            r1.<init>(r2, r12)
            goto L_0x03f0
        L_0x03ad:
            U7.p r1 = r0.f(r11)
            goto L_0x03f0
        L_0x03b2:
            U7.p r1 = r0.e(r12)
            goto L_0x03f0
        L_0x03b7:
            U7.n r1 = r0.g(r11, r11)
            goto L_0x03f0
        L_0x03bc:
            U7.n r1 = r0.g(r12, r11)
            goto L_0x03f0
        L_0x03c1:
            U7.f r1 = new U7.f
            r1.<init>(r7)
            goto L_0x03f0
        L_0x03c7:
            U7.n r1 = r0.g(r11, r12)
            goto L_0x03f0
        L_0x03cc:
            U7.n r1 = r0.g(r12, r12)
            goto L_0x03f0
        L_0x03d1:
            U7.p r1 = r0.i(r12)
            goto L_0x03f0
        L_0x03d6:
            U7.f r1 = new U7.f
            r1.<init>(r10)
            goto L_0x03f0
        L_0x03dc:
            java.lang.String r1 = r16.d()
            java.lang.String r1 = T7.P.k(r1)
            java.lang.String r2 = ":containsData(text) query must not be empty"
            Q7.g.B(r1, r2)
            U7.g r2 = new U7.g
            r2.<init>(r1, r9)
            goto L_0x0365
        L_0x03f0:
            return r1
        L_0x03f1:
            M0.s r1 = new M0.s
            java.lang.String r3 = r13.j()
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r12] = r2
            r4[r11] = r3
            r1.<init>(r5, r4)
            throw r1
        L_0x0401:
            java.lang.String[] r2 = T7.P.f5115c
            java.lang.String r2 = r13.c(r2)
            java.lang.String r2 = R7.b.b(r2)
            Q7.g.A(r2)
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x044d
            java.lang.String r1 = r2.substring(r10)
            U7.b r2 = new U7.b
            U7.g r3 = new U7.g
            r3.<init>(r6, r1, r12)
            U7.g r4 = new U7.g
            java.lang.String r1 = u.C1477r.d(r14, r1)
            r5 = 10
            r4.<init>(r5, r1, r12)
            U7.p[] r1 = new U7.p[r10]
            r1[r12] = r3
            r1[r11] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>()
            int r3 = r2.f5438c
            java.util.ArrayList r4 = r2.f5436a
            if (r3 <= r11) goto L_0x0446
            U7.a r3 = new U7.a
            r3.<init>((java.util.List) r1)
            r4.add(r3)
            goto L_0x0449
        L_0x0446:
            r4.addAll(r1)
        L_0x0449:
            r2.d()
            goto L_0x0487
        L_0x044d:
            java.lang.String r1 = "|*"
            boolean r1 = r2.endsWith(r1)
            if (r1 == 0) goto L_0x0475
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r2.length()
            int r3 = r3 - r10
            java.lang.String r2 = r2.substring(r12, r3)
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            U7.g r2 = new U7.g
            r3 = 11
            r2.<init>(r3, r1, r12)
            goto L_0x0487
        L_0x0475:
            java.lang.String r1 = "|"
            boolean r3 = r2.contains(r1)
            if (r3 == 0) goto L_0x0481
            java.lang.String r2 = r2.replace(r1, r14)
        L_0x0481:
            U7.g r1 = new U7.g
            r1.<init>(r6, r2, r12)
            r2 = r1
        L_0x0487:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.r.b():U7.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = r6.d()
            java.lang.String r1 = r1.trim()
            java.lang.String[] r2 = R7.h.f4371a
            r2 = 0
            if (r1 == 0) goto L_0x0026
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0015
            goto L_0x0026
        L_0x0015:
            int r3 = r1.length()
            r4 = 0
        L_0x001a:
            if (r4 >= r3) goto L_0x002a
            int r5 = r1.codePointAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x002a
        L_0x0028:
            int r4 = r4 + r0
            goto L_0x001a
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            int r0 = java.lang.Integer.parseInt(r1)
            return r0
        L_0x0031:
            Q7.h r0 = new Q7.h
            java.lang.String r1 = "Index must be numeric"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.r.c():int");
    }

    public final String d() {
        return this.f5461a.a('(', ')');
    }

    public final p e(boolean z) {
        String str;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        String k8 = P.k(d());
        g.B(k8, str.concat("(text) query must not be empty"));
        if (z) {
            return new g(k8, 4);
        }
        return new g(k8, 5);
    }

    public final p f(boolean z) {
        String str;
        if (z) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        String k8 = P.k(d());
        g.B(k8, str.concat("(text) query must not be empty"));
        if (z) {
            return new g(6, k8, false);
        }
        return new g(7, k8, false);
    }

    public final n g(boolean z, boolean z6) {
        int i;
        int i8;
        String b8 = b.b(d());
        Matcher matcher = f5459f.matcher(b8);
        Matcher matcher2 = f5460g.matcher(b8);
        if ("odd".equals(b8)) {
            i8 = 2;
            i = 1;
        } else {
            if ("even".equals(b8)) {
                i8 = 2;
            } else if (matcher.matches()) {
                if (matcher.group(3) != null) {
                    i8 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                } else {
                    i8 = 1;
                }
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else if (matcher2.matches()) {
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i8 = 0;
            } else {
                throw new C0130s("Could not parse nth-index '%s': unexpected format", b8);
            }
            i = 0;
        }
        if (z6) {
            if (z) {
                return new n(i8, i, 2);
            }
            return new n(i8, i, 3);
        } else if (z) {
            return new n(i8, i, 1);
        } else {
            return new n(i8, i, 0);
        }
    }

    public final p h(boolean z) {
        String str;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        String d8 = d();
        g.B(d8, str.concat("(regex) query must not be empty"));
        if (z) {
            return new o(Pattern.compile(d8), 1);
        }
        return new o(Pattern.compile(d8), 0);
    }

    public final p i(boolean z) {
        String str;
        if (z) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        String d8 = d();
        g.B(d8, str.concat("(regex) query must not be empty"));
        if (z) {
            return new o(Pattern.compile(d8), 2);
        }
        return new o(Pattern.compile(d8), 3);
    }

    public final p j() {
        P p3 = this.f5461a;
        p3.e();
        char[] cArr = f5458d;
        boolean i = p3.i(cArr);
        ArrayList arrayList = this.f5463c;
        if (i) {
            arrayList.add(new f(8));
            a(p3.b());
        } else {
            arrayList.add(b());
        }
        while (!p3.f()) {
            boolean e8 = p3.e();
            if (p3.i(cArr)) {
                a(p3.b());
            } else if (e8) {
                a(' ');
            } else {
                arrayList.add(b());
            }
        }
        if (arrayList.size() == 1) {
            return (p) arrayList.get(0);
        }
        return new a((List) arrayList);
    }

    public final String toString() {
        return this.f5462b;
    }
}
