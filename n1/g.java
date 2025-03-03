package N1;

import H3.P;
import P0.a;
import P0.l;
import P0.r;
import java.nio.ByteBuffer;
import java.util.List;

public final class g extends i {

    /* renamed from: h  reason: collision with root package name */
    public final r f3347h = new r();
    public final f i = new f();

    /* renamed from: j  reason: collision with root package name */
    public int f3348j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final int f3349k;

    /* renamed from: l  reason: collision with root package name */
    public final e[] f3350l;

    /* renamed from: m  reason: collision with root package name */
    public e f3351m;

    /* renamed from: n  reason: collision with root package name */
    public List f3352n;

    /* renamed from: o  reason: collision with root package name */
    public List f3353o;

    /* renamed from: p  reason: collision with root package name */
    public f f3354p;

    /* renamed from: q  reason: collision with root package name */
    public int f3355q;

    public g(int i8, List list) {
        this.f3349k = i8 == -1 ? 1 : i8;
        if (list != null) {
            byte[] bArr = a.f3688a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b8 = ((byte[]) list.get(0))[0];
            }
        }
        this.f3350l = new e[8];
        for (int i9 = 0; i9 < 8; i9++) {
            this.f3350l[i9] = new e();
        }
        this.f3351m = this.f3350l[0];
    }

    public final P f() {
        List list = this.f3352n;
        this.f3353o = list;
        list.getClass();
        return new P((Object) list);
    }

    public final void flush() {
        super.flush();
        this.f3352n = null;
        this.f3353o = null;
        this.f3355q = 0;
        this.f3351m = this.f3350l[0];
        l();
        this.f3354p = null;
    }

    public final void g(h hVar) {
        boolean z;
        ByteBuffer byteBuffer = hVar.f4386Y;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r rVar = this.f3347h;
        rVar.F(limit, array);
        while (rVar.a() >= 3) {
            int v4 = rVar.v();
            int i8 = v4 & 3;
            boolean z6 = false;
            if ((v4 & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte v8 = (byte) rVar.v();
            byte v9 = (byte) rVar.v();
            if ((i8 == 2 || i8 == 3) && z) {
                if (i8 == 3) {
                    j();
                    int i9 = (v8 & 192) >> 6;
                    int i10 = this.f3348j;
                    if (!(i10 == -1 || i9 == (i10 + 1) % 4)) {
                        l();
                        l.B("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f3348j + " current=" + i9);
                    }
                    this.f3348j = i9;
                    byte b8 = v8 & 63;
                    if (b8 == 0) {
                        b8 = 64;
                    }
                    f fVar = new f(i9, (int) b8);
                    this.f3354p = fVar;
                    fVar.e = 1;
                    fVar.f3344b[0] = v9;
                } else {
                    if (i8 == 2) {
                        z6 = true;
                    }
                    l.d(z6);
                    f fVar2 = this.f3354p;
                    if (fVar2 == null) {
                        l.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr = fVar2.f3344b;
                        int i11 = fVar2.e;
                        int i12 = i11 + 1;
                        fVar2.e = i12;
                        bArr[i11] = v8;
                        fVar2.e = i11 + 2;
                        bArr[i12] = v9;
                    }
                }
                f fVar3 = this.f3354p;
                if (fVar3.e == (fVar3.f3346d * 2) - 1) {
                    j();
                }
            }
        }
    }

    public final boolean i() {
        if (this.f3352n != this.f3353o) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        r16 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r17 = this;
            r0 = r17
            N1.f r1 = r0.f3354p
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r1.e
            int r1 = r1.f3346d
            r3 = 2
            int r1 = r1 * 2
            r4 = 1
            int r1 = r1 - r4
            java.lang.String r5 = "Cea708Decoder"
            if (r2 == r1) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DtvCcPacket ended prematurely; size is "
            r1.<init>(r2)
            N1.f r2 = r0.f3354p
            int r2 = r2.f3346d
            int r2 = r2 * 2
            int r2 = r2 - r4
            r1.append(r2)
            java.lang.String r2 = ", but current index is "
            r1.append(r2)
            N1.f r2 = r0.f3354p
            int r2 = r2.e
            r1.append(r2)
            java.lang.String r2 = " (sequence number "
            r1.append(r2)
            N1.f r2 = r0.f3354p
            int r2 = r2.f3345c
            r1.append(r2)
            java.lang.String r2 = ");"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            P0.l.n(r5, r1)
        L_0x0049:
            N1.f r1 = r0.f3354p
            byte[] r2 = r1.f3344b
            int r1 = r1.e
            N1.f r6 = r0.i
            r6.p(r1, r2)
            r2 = 0
        L_0x0055:
            int r7 = r6.b()
            if (r7 <= 0) goto L_0x0562
            r7 = 3
            int r8 = r6.i(r7)
            r9 = 5
            int r9 = r6.i(r9)
            r10 = 6
            r11 = 7
            if (r8 != r11) goto L_0x0077
            r6.u(r3)
            int r8 = r6.i(r10)
            if (r8 >= r11) goto L_0x0077
            java.lang.String r12 = "Invalid extended service number: "
            Q0.g.u(r8, r12, r5)
        L_0x0077:
            if (r9 != 0) goto L_0x0093
            if (r8 == 0) goto L_0x0562
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "serviceNumber is non-zero ("
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r3 = ") when blockSize is 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            P0.l.B(r5, r1)
            goto L_0x0562
        L_0x0093:
            int r12 = r0.f3349k
            if (r8 == r12) goto L_0x009b
            r6.v(r9)
            goto L_0x0055
        L_0x009b:
            int r8 = r6.g()
            int r9 = r9 * 8
            int r9 = r9 + r8
        L_0x00a2:
            int r8 = r6.g()
            if (r8 >= r9) goto L_0x0055
            r8 = 8
            int r12 = r6.i(r8)
            r15 = 23
            r13 = 159(0x9f, float:2.23E-43)
            r1 = 127(0x7f, float:1.78E-43)
            r14 = 24
            r4 = 31
            r10 = 16
            if (r12 == r10) goto L_0x03d0
            r11 = 10
            if (r12 > r4) goto L_0x0127
            if (r12 == 0) goto L_0x0123
            if (r12 == r7) goto L_0x011d
            if (r12 == r8) goto L_0x010d
            switch(r12) {
                case 12: goto L_0x0109;
                case 13: goto L_0x0103;
                case 14: goto L_0x0123;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            r1 = 17
            if (r12 < r1) goto L_0x00e4
            if (r12 > r15) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Currently unsupported COMMAND_EXT1 Command: "
            r1.<init>(r4)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            P0.l.B(r5, r1)
            r6.u(r8)
            goto L_0x0123
        L_0x00e4:
            if (r12 < r14) goto L_0x00fd
            if (r12 > r4) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Currently unsupported COMMAND_P16 Command: "
            r1.<init>(r4)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            P0.l.B(r5, r1)
            r6.u(r10)
            goto L_0x0123
        L_0x00fd:
            java.lang.String r1 = "Invalid C0 command: "
            Q0.g.u(r12, r1, r5)
            goto L_0x0123
        L_0x0103:
            N1.e r1 = r0.f3351m
            r1.a(r11)
            goto L_0x0123
        L_0x0109:
            r17.l()
            goto L_0x0123
        L_0x010d:
            N1.e r1 = r0.f3351m
            android.text.SpannableStringBuilder r1 = r1.f3325b
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0123
            int r8 = r4 + -1
            r1.delete(r8, r4)
            goto L_0x0123
        L_0x011d:
            java.util.List r1 = r17.k()
            r0.f3352n = r1
        L_0x0123:
            r16 = r9
            r1 = 2
            goto L_0x013f
        L_0x0127:
            if (r12 > r1) goto L_0x0146
            if (r12 != r1) goto L_0x0133
            N1.e r1 = r0.f3351m
            r2 = 9835(0x266b, float:1.3782E-41)
            r1.a(r2)
            goto L_0x013b
        L_0x0133:
            N1.e r1 = r0.f3351m
            r2 = r12 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r1.a(r2)
        L_0x013b:
            r16 = r9
            r1 = 2
            r2 = 1
        L_0x013f:
            r3 = 3
            r9 = 1
            r10 = 6
            r11 = 0
        L_0x0143:
            r12 = 7
            goto L_0x055a
        L_0x0146:
            if (r12 > r13) goto L_0x03b7
            r1 = 4
            N1.e[] r2 = r0.f3350l
            switch(r12) {
                case 128: goto L_0x03a1;
                case 129: goto L_0x03a1;
                case 130: goto L_0x03a1;
                case 131: goto L_0x03a1;
                case 132: goto L_0x03a1;
                case 133: goto L_0x03a1;
                case 134: goto L_0x03a1;
                case 135: goto L_0x03a1;
                case 136: goto L_0x0375;
                case 137: goto L_0x035d;
                case 138: goto L_0x0347;
                case 139: goto L_0x032e;
                case 140: goto L_0x0318;
                case 141: goto L_0x0310;
                case 142: goto L_0x0153;
                case 143: goto L_0x0308;
                case 144: goto L_0x02db;
                case 145: goto L_0x028b;
                case 146: goto L_0x0262;
                case 147: goto L_0x014e;
                case 148: goto L_0x014e;
                case 149: goto L_0x014e;
                case 150: goto L_0x014e;
                case 151: goto L_0x0210;
                case 152: goto L_0x015a;
                case 153: goto L_0x015a;
                case 154: goto L_0x015a;
                case 155: goto L_0x015a;
                case 156: goto L_0x015a;
                case 157: goto L_0x015a;
                case 158: goto L_0x015a;
                case 159: goto L_0x015a;
                default: goto L_0x014e;
            }
        L_0x014e:
            java.lang.String r1 = "Invalid C1 command: "
            Q0.g.u(r12, r1, r5)
        L_0x0153:
            r16 = r9
        L_0x0155:
            r3 = 3
        L_0x0156:
            r9 = 1
        L_0x0157:
            r11 = 0
            goto L_0x03b2
        L_0x015a:
            int r12 = r12 + -152
            r4 = r2[r12]
            r6.u(r3)
            boolean r10 = r6.h()
            r6.u(r3)
            int r11 = r6.i(r7)
            boolean r13 = r6.h()
            r14 = 7
            int r15 = r6.i(r14)
            int r8 = r6.i(r8)
            int r14 = r6.i(r1)
            int r1 = r6.i(r1)
            r6.u(r3)
            r7 = 6
            r6.u(r7)
            r6.u(r3)
            r7 = 3
            int r3 = r6.i(r7)
            r16 = r9
            int r9 = r6.i(r7)
            r7 = 1
            r4.f3326c = r7
            r4.f3327d = r10
            r4.e = r11
            r4.f3328f = r13
            r4.f3329g = r15
            r4.f3330h = r8
            r4.i = r14
            int r8 = r4.f3331j
            int r1 = r1 + r7
            if (r8 == r1) goto L_0x01c3
            r4.f3331j = r1
        L_0x01ac:
            java.util.ArrayList r1 = r4.f3324a
            int r7 = r1.size()
            int r8 = r4.f3331j
            if (r7 >= r8) goto L_0x01be
            int r7 = r1.size()
            r8 = 15
            if (r7 < r8) goto L_0x01c3
        L_0x01be:
            r7 = 0
            r1.remove(r7)
            goto L_0x01ac
        L_0x01c3:
            if (r3 == 0) goto L_0x01e5
            int r1 = r4.f3333l
            if (r1 == r3) goto L_0x01e5
            r4.f3333l = r3
            int r3 = r3 + -1
            int[] r1 = N1.e.f3316B
            r1 = r1[r3]
            boolean[] r7 = N1.e.f3315A
            boolean r7 = r7[r3]
            int[] r7 = N1.e.f3323y
            r7 = r7[r3]
            int[] r7 = N1.e.z
            r7 = r7[r3]
            int[] r7 = N1.e.f3322x
            r3 = r7[r3]
            r4.f3335n = r1
            r4.f3332k = r3
        L_0x01e5:
            if (r9 == 0) goto L_0x0204
            int r1 = r4.f3334m
            if (r1 == r9) goto L_0x0204
            r4.f3334m = r9
            int r9 = r9 + -1
            int[] r1 = N1.e.f3318D
            r1 = r1[r9]
            int[] r1 = N1.e.f3317C
            r1 = r1[r9]
            r1 = 0
            r4.e(r1, r1)
            int[] r1 = N1.e.f3319E
            r1 = r1[r9]
            int r3 = N1.e.f3320v
            r4.f(r3, r1)
        L_0x0204:
            int r1 = r0.f3355q
            if (r1 == r12) goto L_0x0155
            r0.f3355q = r12
            r1 = r2[r12]
            r0.f3351m = r1
            goto L_0x0155
        L_0x0210:
            r16 = r9
            N1.e r1 = r0.f3351m
            boolean r1 = r1.f3326c
            if (r1 != 0) goto L_0x021f
            r1 = 32
            r6.u(r1)
            goto L_0x0155
        L_0x021f:
            r1 = 2
            int r2 = r6.i(r1)
            int r3 = r6.i(r1)
            int r4 = r6.i(r1)
            int r7 = r6.i(r1)
            int r2 = N1.e.c(r3, r4, r7, r2)
            r6.i(r1)
            int r3 = r6.i(r1)
            int r4 = r6.i(r1)
            int r7 = r6.i(r1)
            r9 = 0
            N1.e.c(r3, r4, r7, r9)
            r6.h()
            r6.h()
            r6.i(r1)
            r6.i(r1)
            int r3 = r6.i(r1)
            r6.u(r8)
            N1.e r1 = r0.f3351m
            r1.f3335n = r2
            r1.f3332k = r3
            goto L_0x0155
        L_0x0262:
            r16 = r9
            N1.e r2 = r0.f3351m
            boolean r2 = r2.f3326c
            if (r2 != 0) goto L_0x026f
            r6.u(r10)
            goto L_0x0155
        L_0x026f:
            r6.u(r1)
            int r1 = r6.i(r1)
            r2 = 2
            r6.u(r2)
            r2 = 6
            r6.i(r2)
            N1.e r2 = r0.f3351m
            int r3 = r2.f3342u
            if (r3 == r1) goto L_0x0287
            r2.a(r11)
        L_0x0287:
            r2.f3342u = r1
            goto L_0x0155
        L_0x028b:
            r16 = r9
            N1.e r1 = r0.f3351m
            boolean r1 = r1.f3326c
            if (r1 != 0) goto L_0x0298
            r6.u(r14)
            goto L_0x0155
        L_0x0298:
            r1 = 2
            int r2 = r6.i(r1)
            int r3 = r6.i(r1)
            int r4 = r6.i(r1)
            int r7 = r6.i(r1)
            int r2 = N1.e.c(r3, r4, r7, r2)
            int r3 = r6.i(r1)
            int r4 = r6.i(r1)
            int r7 = r6.i(r1)
            int r8 = r6.i(r1)
            int r3 = N1.e.c(r4, r7, r8, r3)
            r6.u(r1)
            int r4 = r6.i(r1)
            int r7 = r6.i(r1)
            int r8 = r6.i(r1)
            r1 = 0
            N1.e.c(r4, r7, r8, r1)
            N1.e r1 = r0.f3351m
            r1.f(r2, r3)
            goto L_0x0155
        L_0x02db:
            r16 = r9
            N1.e r2 = r0.f3351m
            boolean r2 = r2.f3326c
            if (r2 != 0) goto L_0x02e8
            r6.u(r10)
            goto L_0x0155
        L_0x02e8:
            r6.i(r1)
            r1 = 2
            r6.i(r1)
            r6.i(r1)
            boolean r1 = r6.h()
            boolean r2 = r6.h()
            r3 = 3
            r6.i(r3)
            r6.i(r3)
            N1.e r4 = r0.f3351m
            r4.e(r1, r2)
            goto L_0x0156
        L_0x0308:
            r16 = r9
            r3 = 3
            r17.l()
            goto L_0x0156
        L_0x0310:
            r16 = r9
            r3 = 3
            r6.u(r8)
            goto L_0x0156
        L_0x0318:
            r16 = r9
            r3 = 3
            r1 = 1
        L_0x031c:
            if (r1 > r8) goto L_0x0156
            boolean r4 = r6.h()
            if (r4 == 0) goto L_0x032b
            int r4 = 8 - r1
            r4 = r2[r4]
            r4.d()
        L_0x032b:
            int r1 = r1 + 1
            goto L_0x031c
        L_0x032e:
            r16 = r9
            r3 = 3
            r7 = 1
        L_0x0332:
            if (r7 > r8) goto L_0x0156
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x0344
            int r1 = 8 - r7
            r1 = r2[r1]
            boolean r4 = r1.f3327d
            r9 = 1
            r4 = r4 ^ r9
            r1.f3327d = r4
        L_0x0344:
            int r7 = r7 + 1
            goto L_0x0332
        L_0x0347:
            r16 = r9
            r3 = 3
            r7 = 1
        L_0x034b:
            if (r7 > r8) goto L_0x0156
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x035a
            int r1 = 8 - r7
            r1 = r2[r1]
            r4 = 0
            r1.f3327d = r4
        L_0x035a:
            int r7 = r7 + 1
            goto L_0x034b
        L_0x035d:
            r16 = r9
            r3 = 3
            r7 = 1
        L_0x0361:
            if (r7 > r8) goto L_0x0156
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x0371
            int r1 = 8 - r7
            r1 = r2[r1]
            r9 = 1
            r1.f3327d = r9
            goto L_0x0372
        L_0x0371:
            r9 = 1
        L_0x0372:
            int r7 = r7 + 1
            goto L_0x0361
        L_0x0375:
            r16 = r9
            r3 = 3
            r9 = 1
            r7 = 1
        L_0x037a:
            if (r7 > r8) goto L_0x0157
            boolean r1 = r6.h()
            if (r1 == 0) goto L_0x039d
            int r1 = 8 - r7
            r1 = r2[r1]
            java.util.ArrayList r4 = r1.f3324a
            r4.clear()
            android.text.SpannableStringBuilder r4 = r1.f3325b
            r4.clear()
            r4 = -1
            r1.f3336o = r4
            r1.f3337p = r4
            r1.f3338q = r4
            r1.f3340s = r4
            r11 = 0
            r1.f3342u = r11
            goto L_0x039e
        L_0x039d:
            r11 = 0
        L_0x039e:
            int r7 = r7 + 1
            goto L_0x037a
        L_0x03a1:
            r16 = r9
            r3 = 3
            r9 = 1
            r11 = 0
            int r12 = r12 + -128
            int r1 = r0.f3355q
            if (r1 == r12) goto L_0x03b2
            r0.f3355q = r12
            r1 = r2[r12]
            r0.f3351m = r1
        L_0x03b2:
            r1 = 2
            r2 = 1
        L_0x03b4:
            r10 = 6
            goto L_0x0143
        L_0x03b7:
            r16 = r9
            r1 = 255(0xff, float:3.57E-43)
            r3 = 3
            r9 = 1
            r11 = 0
            if (r12 > r1) goto L_0x03c9
            N1.e r1 = r0.f3351m
            r2 = r12 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r1.a(r2)
            goto L_0x03b2
        L_0x03c9:
            java.lang.String r1 = "Invalid base command: "
            Q0.g.u(r12, r1, r5)
            r1 = 2
            goto L_0x03b4
        L_0x03d0:
            r16 = r9
            r3 = 3
            r9 = 1
            r11 = 0
            int r7 = r6.i(r8)
            if (r7 > r4) goto L_0x03f7
            r12 = 7
            if (r7 > r12) goto L_0x03e0
            goto L_0x051a
        L_0x03e0:
            r1 = 15
            if (r7 > r1) goto L_0x03e9
            r6.u(r8)
            goto L_0x051a
        L_0x03e9:
            if (r7 > r15) goto L_0x03f0
            r6.u(r10)
            goto L_0x051a
        L_0x03f0:
            if (r7 > r4) goto L_0x051a
            r6.u(r14)
            goto L_0x051a
        L_0x03f7:
            r12 = 7
            r4 = 160(0xa0, float:2.24E-43)
            if (r7 > r1) goto L_0x050f
            r1 = 32
            if (r7 == r1) goto L_0x0504
            r1 = 33
            if (r7 == r1) goto L_0x04fe
            r1 = 37
            if (r7 == r1) goto L_0x04f6
            r1 = 42
            if (r7 == r1) goto L_0x04ee
            r1 = 44
            if (r7 == r1) goto L_0x04e6
            r1 = 63
            if (r7 == r1) goto L_0x04de
            r1 = 57
            if (r7 == r1) goto L_0x04d6
            r1 = 58
            if (r7 == r1) goto L_0x04ce
            r1 = 60
            if (r7 == r1) goto L_0x04c6
            r1 = 61
            if (r7 == r1) goto L_0x04be
            switch(r7) {
                case 48: goto L_0x04b6;
                case 49: goto L_0x04ae;
                case 50: goto L_0x04a6;
                case 51: goto L_0x049d;
                case 52: goto L_0x0494;
                case 53: goto L_0x048b;
                default: goto L_0x0427;
            }
        L_0x0427:
            switch(r7) {
                case 118: goto L_0x0482;
                case 119: goto L_0x0479;
                case 120: goto L_0x0470;
                case 121: goto L_0x0467;
                case 122: goto L_0x045e;
                case 123: goto L_0x0455;
                case 124: goto L_0x044c;
                case 125: goto L_0x0443;
                case 126: goto L_0x043a;
                case 127: goto L_0x0431;
                default: goto L_0x042a;
            }
        L_0x042a:
            java.lang.String r1 = "Invalid G2 character: "
            Q0.g.u(r7, r1, r5)
            goto L_0x050b
        L_0x0431:
            N1.e r1 = r0.f3351m
            r2 = 9484(0x250c, float:1.329E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x043a:
            N1.e r1 = r0.f3351m
            r2 = 9496(0x2518, float:1.3307E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0443:
            N1.e r1 = r0.f3351m
            r2 = 9472(0x2500, float:1.3273E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x044c:
            N1.e r1 = r0.f3351m
            r2 = 9492(0x2514, float:1.3301E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0455:
            N1.e r1 = r0.f3351m
            r2 = 9488(0x2510, float:1.3296E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x045e:
            N1.e r1 = r0.f3351m
            r2 = 9474(0x2502, float:1.3276E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0467:
            N1.e r1 = r0.f3351m
            r2 = 8542(0x215e, float:1.197E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0470:
            N1.e r1 = r0.f3351m
            r2 = 8541(0x215d, float:1.1968E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0479:
            N1.e r1 = r0.f3351m
            r2 = 8540(0x215c, float:1.1967E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0482:
            N1.e r1 = r0.f3351m
            r2 = 8539(0x215b, float:1.1966E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x048b:
            N1.e r1 = r0.f3351m
            r2 = 8226(0x2022, float:1.1527E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x0494:
            N1.e r1 = r0.f3351m
            r2 = 8221(0x201d, float:1.152E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x049d:
            N1.e r1 = r0.f3351m
            r2 = 8220(0x201c, float:1.1519E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04a6:
            N1.e r1 = r0.f3351m
            r2 = 8217(0x2019, float:1.1514E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04ae:
            N1.e r1 = r0.f3351m
            r2 = 8216(0x2018, float:1.1513E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04b6:
            N1.e r1 = r0.f3351m
            r2 = 9608(0x2588, float:1.3464E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04be:
            N1.e r1 = r0.f3351m
            r2 = 8480(0x2120, float:1.1883E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04c6:
            N1.e r1 = r0.f3351m
            r2 = 339(0x153, float:4.75E-43)
            r1.a(r2)
            goto L_0x050b
        L_0x04ce:
            N1.e r1 = r0.f3351m
            r2 = 353(0x161, float:4.95E-43)
            r1.a(r2)
            goto L_0x050b
        L_0x04d6:
            N1.e r1 = r0.f3351m
            r2 = 8482(0x2122, float:1.1886E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04de:
            N1.e r1 = r0.f3351m
            r2 = 376(0x178, float:5.27E-43)
            r1.a(r2)
            goto L_0x050b
        L_0x04e6:
            N1.e r1 = r0.f3351m
            r2 = 338(0x152, float:4.74E-43)
            r1.a(r2)
            goto L_0x050b
        L_0x04ee:
            N1.e r1 = r0.f3351m
            r2 = 352(0x160, float:4.93E-43)
            r1.a(r2)
            goto L_0x050b
        L_0x04f6:
            N1.e r1 = r0.f3351m
            r2 = 8230(0x2026, float:1.1533E-41)
            r1.a(r2)
            goto L_0x050b
        L_0x04fe:
            N1.e r1 = r0.f3351m
            r1.a(r4)
            goto L_0x050b
        L_0x0504:
            N1.e r1 = r0.f3351m
            r10 = 32
            r1.a(r10)
        L_0x050b:
            r1 = 2
            r2 = 1
        L_0x050d:
            r10 = 6
            goto L_0x055a
        L_0x050f:
            r10 = 32
            if (r7 > r13) goto L_0x0537
            r1 = 135(0x87, float:1.89E-43)
            if (r7 > r1) goto L_0x051c
            r6.u(r10)
        L_0x051a:
            r1 = 2
            goto L_0x050d
        L_0x051c:
            r1 = 143(0x8f, float:2.0E-43)
            if (r7 > r1) goto L_0x0526
            r1 = 40
            r6.u(r1)
            goto L_0x051a
        L_0x0526:
            if (r7 > r13) goto L_0x051a
            r1 = 2
            r6.u(r1)
            r10 = 6
            int r4 = r6.i(r10)
            int r4 = r4 * 8
            r6.u(r4)
            goto L_0x055a
        L_0x0537:
            r1 = 2
            r8 = 255(0xff, float:3.57E-43)
            r10 = 6
            if (r7 > r8) goto L_0x0555
            if (r7 != r4) goto L_0x0547
            N1.e r2 = r0.f3351m
            r4 = 13252(0x33c4, float:1.857E-41)
            r2.a(r4)
            goto L_0x0553
        L_0x0547:
            java.lang.String r2 = "Invalid G3 character: "
            Q0.g.u(r7, r2, r5)
            N1.e r2 = r0.f3351m
            r4 = 95
            r2.a(r4)
        L_0x0553:
            r2 = 1
            goto L_0x055a
        L_0x0555:
            java.lang.String r4 = "Invalid extended command: "
            Q0.g.u(r7, r4, r5)
        L_0x055a:
            r9 = r16
            r3 = 2
            r4 = 1
            r7 = 3
            r11 = 7
            goto L_0x00a2
        L_0x0562:
            if (r2 == 0) goto L_0x056a
            java.util.List r1 = r17.k()
            r0.f3352n = r1
        L_0x056a:
            r1 = 0
            r0.f3354p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.g.j():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List k() {
        /*
            r17 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            r3 = 8
            if (r2 >= r3) goto L_0x00f6
            r3 = r17
            N1.e[] r4 = r3.f3350l
            r5 = r4[r2]
            boolean r6 = r5.f3326c
            if (r6 == 0) goto L_0x00f2
            java.util.ArrayList r6 = r5.f3324a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0027
            android.text.SpannableStringBuilder r5 = r5.f3325b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0027
            goto L_0x00f2
        L_0x0027:
            r4 = r4[r2]
            boolean r5 = r4.f3327d
            if (r5 == 0) goto L_0x00f2
            boolean r5 = r4.f3326c
            if (r5 == 0) goto L_0x00ec
            java.util.ArrayList r5 = r4.f3324a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0043
            android.text.SpannableStringBuilder r6 = r4.f3325b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0043
            goto L_0x00ec
        L_0x0043:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            r6 = 0
        L_0x0049:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x0060
            java.lang.Object r7 = r5.get(r6)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.append(r7)
            r7 = 10
            r8.append(r7)
            int r6 = r6 + 1
            goto L_0x0049
        L_0x0060:
            android.text.SpannableString r5 = r4.b()
            r8.append(r5)
            int r5 = r4.f3332k
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x0092
            if (r5 == r6) goto L_0x008f
            if (r5 == r7) goto L_0x008b
            r9 = 3
            if (r5 != r9) goto L_0x0075
            goto L_0x0092
        L_0x0075:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected justification value: "
            r1.<init>(r2)
            int r2 = r4.f3332k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x008d:
            r9 = r5
            goto L_0x0095
        L_0x008f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x008d
        L_0x0092:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x008d
        L_0x0095:
            boolean r5 = r4.f3328f
            if (r5 == 0) goto L_0x00a4
            int r5 = r4.f3330h
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.f3329g
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x00b1
        L_0x00a4:
            int r5 = r4.f3330h
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.f3329g
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x00b1:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r11 = r4.i
            int r12 = r11 / 3
            if (r12 != 0) goto L_0x00c6
            r12 = 0
            goto L_0x00cb
        L_0x00c6:
            if (r12 != r6) goto L_0x00ca
            r12 = 1
            goto L_0x00cb
        L_0x00ca:
            r12 = 2
        L_0x00cb:
            int r11 = r11 % 3
            if (r11 != 0) goto L_0x00d1
            r13 = 0
            goto L_0x00d6
        L_0x00d1:
            if (r11 != r6) goto L_0x00d5
            r13 = 1
            goto L_0x00d6
        L_0x00d5:
            r13 = 2
        L_0x00d6:
            int r15 = r4.f3335n
            int r7 = N1.e.f3321w
            if (r15 == r7) goto L_0x00de
            r14 = 1
            goto L_0x00df
        L_0x00de:
            r14 = 0
        L_0x00df:
            N1.d r6 = new N1.d
            int r4 = r4.e
            r7 = r6
            r11 = r12
            r12 = r5
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00ed
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            if (r6 == 0) goto L_0x00f2
            r0.add(r6)
        L_0x00f2:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x00f6:
            r3 = r17
            D.j0 r2 = N1.d.f3312c
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r0.size()
            r2.<init>(r4)
        L_0x0106:
            int r4 = r0.size()
            if (r1 >= r4) goto L_0x011a
            java.lang.Object r4 = r0.get(r1)
            N1.d r4 = (N1.d) r4
            O0.b r4 = r4.f3313a
            r2.add(r4)
            int r1 = r1 + 1
            goto L_0x0106
        L_0x011a:
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.g.k():java.util.List");
    }

    public final void l() {
        for (int i8 = 0; i8 < 8; i8++) {
            this.f3350l[i8].d();
        }
    }
}
