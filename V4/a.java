package V4;

import L4.h;
import N.e;
import g7.l;
import j$.util.Objects;
import java.nio.ByteBuffer;
import u4.C1492a;
import u4.C1493b;
import u4.d;
import u5.C1494a;
import u5.C1495b;
import y5.C1635a;

public class a extends h implements C1494a {

    /* renamed from: d  reason: collision with root package name */
    public final C1492a f5975d;
    public final ByteBuffer e;

    /* renamed from: f  reason: collision with root package name */
    public final k5.a f5976f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5977g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5978h;
    public final C1635a i;

    /* renamed from: j  reason: collision with root package name */
    public final d f5979j;

    /* renamed from: k  reason: collision with root package name */
    public final C1492a f5980k;

    /* renamed from: l  reason: collision with root package name */
    public final ByteBuffer f5981l;

    public a(C1492a aVar, ByteBuffer byteBuffer, k5.a aVar2, boolean z, long j7, C1635a aVar3, d dVar, C1492a aVar4, ByteBuffer byteBuffer2, C1493b bVar) {
        super(0, bVar);
        this.f5975d = aVar;
        this.e = byteBuffer;
        this.f5976f = aVar2;
        this.f5977g = z;
        this.f5978h = j7;
        this.i = aVar3;
        this.f5979j = dVar;
        this.f5980k = aVar4;
        this.f5981l = byteBuffer2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (((D4.i) r8).f1232a.equals(r6) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (((D4.i) r8).f1232a.equals(r6) != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V4.f d(int r19, boolean r20, D4.j r21) {
        /*
            r18 = this;
            r0 = r21
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r10 = 0
            r12 = r18
            goto L_0x01c2
        L_0x000a:
            long r2 = r0.f1240d
            r4 = 1
            long r2 = r2 + r4
            r0.f1240d = r2
            r12 = r18
            u4.a r6 = r12.f5975d
            java.lang.String r6 = r6.toString()
            i5.s r7 = r0.f1238b
            java.lang.Object[] r8 = r7.f12758d
            int r9 = r6.hashCode()
            int r10 = r8.length
            int r10 = r10 + -1
            r10 = r10 & r9
            r8 = r8[r10]
            java.lang.Class<i5.q> r10 = i5.q.class
            r11 = 0
            if (r8 != 0) goto L_0x002e
        L_0x002c:
            r8 = r11
            goto L_0x006b
        L_0x002e:
            java.lang.Class r13 = r8.getClass()
            if (r13 != r10) goto L_0x0060
            i5.q r8 = (i5.q) r8
        L_0x0036:
            int r13 = r8.f12752a
            if (r13 != r9) goto L_0x0049
            java.lang.Object r13 = r8.f12753b
            D4.i r13 = (D4.i) r13
            java.lang.String r13 = r13.f1232a
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L_0x0049
            java.lang.Object r8 = r8.f12753b
            goto L_0x006b
        L_0x0049:
            java.lang.Object r8 = r8.f12754c
            java.lang.Class r13 = r8.getClass()
            if (r13 != r10) goto L_0x0054
            i5.q r8 = (i5.q) r8
            goto L_0x0036
        L_0x0054:
            r9 = r8
            D4.i r9 = (D4.i) r9
            java.lang.String r9 = r9.f1232a
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x002c
            goto L_0x006b
        L_0x0060:
            r9 = r8
            D4.i r9 = (D4.i) r9
            java.lang.String r9 = r9.f1232a
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x002c
        L_0x006b:
            D4.i r8 = (D4.i) r8
            r9 = 2
            if (r8 == 0) goto L_0x00ab
            int r6 = r8.f1233b
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r8.f1233b = r6
            long r6 = r8.a(r2)
            long r6 = r6 + r4
            r8.f1234c = r6
            r8.f1235d = r2
            int r4 = r8.f1233b
            if (r4 == 0) goto L_0x00a4
            byte r4 = r0.f1241f
            if (r4 <= r9) goto L_0x008e
            int r4 = r4 + -1
            byte r4 = (byte) r4
            r0.f1241f = r4
        L_0x008e:
            byte r4 = r0.f1243h
            if (r4 <= r9) goto L_0x0097
            int r4 = r4 + -1
            byte r4 = (byte) r4
            r0.f1243h = r4
        L_0x0097:
            D4.i r4 = r8.f1236f
            if (r4 == 0) goto L_0x00a2
            int r4 = r4.f1233b
            if (r4 != 0) goto L_0x00a4
            r0.e = r1
            goto L_0x00a4
        L_0x00a2:
            r0.f1242g = r1
        L_0x00a4:
            r0.a(r8, r2)
            int r1 = r8.f1233b
            goto L_0x01c1
        L_0x00ab:
            D4.i r4 = new D4.i
            r4.<init>(r6, r2)
            int r5 = r7.f12755a
            int r6 = r0.f1237a
            int r8 = r6 + 4
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r5 >= r8) goto L_0x00cf
            if (r5 >= r6) goto L_0x00c2
            int r5 = r5 + 1
            r1 = r5 | r13
            r4.f1233b = r1
        L_0x00c2:
            r7.c(r4)
            D4.i r1 = r0.f1239c
            if (r1 == 0) goto L_0x01ba
            r4.e = r1
            r1.f1236f = r4
            goto L_0x01ba
        L_0x00cf:
            D4.i r5 = r0.f1239c
            long r14 = r4.a(r2)
            long r16 = r5.a(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 > 0) goto L_0x00df
            goto L_0x01c1
        L_0x00df:
            byte r6 = r0.f1242g
            int r6 = r6 + 1
            byte r6 = (byte) r6
            r0.f1242g = r6
            byte r8 = r0.f1243h
            if (r6 >= r8) goto L_0x00ec
            goto L_0x01c1
        L_0x00ec:
            r0.f1242g = r1
            r1 = 126(0x7e, float:1.77E-43)
            if (r8 >= r1) goto L_0x00fd
            int r1 = 126 - r8
            int r1 = java.lang.Math.min(r9, r1)
            byte r1 = (byte) r1
            int r8 = r8 + r1
            byte r1 = (byte) r8
            r0.f1243h = r1
        L_0x00fd:
            int r1 = r5.f1233b
            if (r1 == 0) goto L_0x0104
            r1 = r1 | r13
            r4.f1233b = r1
        L_0x0104:
            java.lang.Object[] r1 = r7.f12758d
            java.lang.String r6 = r5.f1232a
            int r8 = r6.hashCode()
            int r9 = r1.length
            int r9 = r9 + -1
            r9 = r9 & r8
            r13 = r1[r9]
            if (r13 != 0) goto L_0x0116
            goto L_0x01af
        L_0x0116:
            java.lang.Class r14 = r13.getClass()
            if (r14 != r10) goto L_0x01a0
            i5.q r13 = (i5.q) r13
            int r11 = r13.f12752a
            if (r11 != r8) goto L_0x013d
            java.lang.Object r11 = r13.f12753b
            D4.i r11 = (D4.i) r11
            java.lang.String r11 = r11.f1232a
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x013d
            java.lang.Object r6 = r13.f12754c
            r1[r9] = r6
            int r1 = r7.f12756b
            int r1 = r1 + -1
            r7.f12756b = r1
            r7.e()
            goto L_0x01af
        L_0x013d:
            java.lang.Object r11 = r13.f12754c
            java.lang.Class r14 = r11.getClass()
            if (r14 == r10) goto L_0x015d
            D4.i r11 = (D4.i) r11
            java.lang.String r8 = r11.f1232a
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01af
            java.lang.Object r6 = r13.f12753b
            r1[r9] = r6
            int r1 = r7.f12756b
            int r1 = r1 + -1
            r7.f12756b = r1
            r7.e()
            goto L_0x01af
        L_0x015d:
            r1 = r11
            i5.q r1 = (i5.q) r1
            int r9 = r1.f12752a
            if (r9 != r8) goto L_0x017e
            java.lang.Object r9 = r1.f12753b
            D4.i r9 = (D4.i) r9
            java.lang.String r9 = r9.f1232a
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x017e
            java.lang.Object r1 = r1.f12754c
            r13.f12754c = r1
            int r1 = r7.f12756b
            int r1 = r1 + -1
            r7.f12756b = r1
            r7.e()
            goto L_0x01af
        L_0x017e:
            java.lang.Object r11 = r1.f12754c
            java.lang.Class r9 = r11.getClass()
            if (r9 == r10) goto L_0x019e
            D4.i r11 = (D4.i) r11
            java.lang.String r8 = r11.f1232a
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01af
            java.lang.Object r1 = r1.f12753b
            r13.f12754c = r1
            int r1 = r7.f12756b
            int r1 = r1 + -1
            r7.f12756b = r1
            r7.e()
            goto L_0x01af
        L_0x019e:
            r13 = r1
            goto L_0x015d
        L_0x01a0:
            D4.i r13 = (D4.i) r13
            java.lang.String r8 = r13.f1232a
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01af
            r1[r9] = r11
            r7.e()
        L_0x01af:
            r7.c(r4)
            D4.i r1 = r5.e
            r4.e = r1
            if (r1 == 0) goto L_0x01ba
            r1.f1236f = r4
        L_0x01ba:
            r0.f1239c = r4
            r0.a(r4, r2)
            int r1 = r4.f1233b
        L_0x01c1:
            r10 = r1
        L_0x01c2:
            i5.h r11 = i5.h.f12745a
            V4.f r0 = new V4.f
            r6 = r0
            r7 = r18
            r8 = r19
            r9 = r20
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.a.d(int, boolean, D4.j):V4.f");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (!((C1493b) this.f2711c).equals((C1493b) aVar.f2711c) || !this.f5975d.equals(aVar.f5975d) || !Objects.equals(this.e, aVar.e) || this.f5976f != aVar.f5976f || this.f5977g != aVar.f5977g || this.f5978h != aVar.f5978h || this.i != aVar.i || !Objects.equals(this.f5979j, aVar.f5979j) || !Objects.equals(this.f5980k, aVar.f5980k) || !Objects.equals(this.f5981l, aVar.f5981l)) {
            return false;
        }
        return true;
    }

    public final C1495b getType() {
        return C1495b.f15787W;
    }

    public final int hashCode() {
        int i8;
        int hashCode = this.f5975d.hashCode();
        int hashCode2 = Objects.hashCode(this.e);
        int hashCode3 = (this.f5976f.hashCode() + ((hashCode2 + ((hashCode + (((C1493b) this.f2711c).f15777a.hashCode() * 31)) * 31)) * 31)) * 31;
        if (this.f5977g) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        long j7 = this.f5978h;
        int hashCode4 = Objects.hashCode(this.i);
        int hashCode5 = Objects.hashCode(this.f5979j);
        int hashCode6 = Objects.hashCode(this.f5980k);
        return Objects.hashCode(this.f5981l) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((((hashCode3 + i8) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder("MqttPublish{");
        StringBuilder sb2 = new StringBuilder("topic=");
        sb2.append(this.f5975d);
        String str6 = "";
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            str = str6;
        } else {
            str = ", payload=" + byteBuffer.remaining() + "byte";
        }
        sb2.append(str);
        sb2.append(", qos=");
        sb2.append(this.f5976f);
        sb2.append(", retain=");
        sb2.append(this.f5977g);
        long j7 = this.f5978h;
        if (j7 == Long.MAX_VALUE) {
            str2 = str6;
        } else {
            str2 = e.w(", messageExpiryInterval=", j7);
        }
        sb2.append(str2);
        C1635a aVar = this.i;
        if (aVar == null) {
            str3 = str6;
        } else {
            str3 = ", payloadFormatIndicator=" + aVar;
        }
        sb2.append(str3);
        d dVar = this.f5979j;
        if (dVar == null) {
            str4 = str6;
        } else {
            str4 = ", contentType=" + dVar;
        }
        sb2.append(str4);
        C1492a aVar2 = this.f5980k;
        if (aVar2 == null) {
            str5 = str6;
        } else {
            str5 = ", responseTopic=" + aVar2;
        }
        sb2.append(str5);
        ByteBuffer byteBuffer2 = this.f5981l;
        if (byteBuffer2 != null) {
            str6 = ", correlationData=" + byteBuffer2.remaining() + "byte";
        }
        sb2.append(str6);
        sb2.append(l.l(super.c()));
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
