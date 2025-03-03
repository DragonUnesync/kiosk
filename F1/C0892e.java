package f1;

import H.k;
import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import P0.l;
import P0.r;
import android.os.SystemClock;
import g1.i;
import java.util.List;
import p1.o;
import p1.p;
import p1.q;
import p1.s;

/* renamed from: f1.e  reason: case insensitive filesystem */
public final class C0892e implements o {

    /* renamed from: a  reason: collision with root package name */
    public final i f11522a;

    /* renamed from: b  reason: collision with root package name */
    public final r f11523b;

    /* renamed from: c  reason: collision with root package name */
    public final r f11524c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11525d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final k f11526f;

    /* renamed from: g  reason: collision with root package name */
    public q f11527g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11528h;
    public volatile long i;

    /* renamed from: j  reason: collision with root package name */
    public volatile int f11529j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11530k;

    /* renamed from: l  reason: collision with root package name */
    public long f11531l;

    /* renamed from: m  reason: collision with root package name */
    public long f11532m;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0892e(f1.C0896i r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            r4.<init>()
            r4.f11525d = r6
            M0.r r6 = r5.f11548c
            java.lang.String r6 = r6.f3036n
            r6.getClass()
            int r3 = r6.hashCode()
            switch(r3) {
                case -1664118616: goto L_0x00b7;
                case -1662541442: goto L_0x00ab;
                case -1606874997: goto L_0x009f;
                case -53558318: goto L_0x0093;
                case 187078296: goto L_0x0088;
                case 187094639: goto L_0x007d;
                case 1187890754: goto L_0x0072;
                case 1331836730: goto L_0x0067;
                case 1503095341: goto L_0x005a;
                case 1504891608: goto L_0x004d;
                case 1599127256: goto L_0x0040;
                case 1599127257: goto L_0x0033;
                case 1903231877: goto L_0x0026;
                case 1903589369: goto L_0x0019;
                default: goto L_0x0016;
            }
        L_0x0016:
            r6 = -1
            goto L_0x00c2
        L_0x0019:
            java.lang.String r3 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0022
            goto L_0x0016
        L_0x0022:
            r6 = 13
            goto L_0x00c2
        L_0x0026:
            java.lang.String r3 = "audio/g711-alaw"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x002f
            goto L_0x0016
        L_0x002f:
            r6 = 12
            goto L_0x00c2
        L_0x0033:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x003c
            goto L_0x0016
        L_0x003c:
            r6 = 11
            goto L_0x00c2
        L_0x0040:
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0049
            goto L_0x0016
        L_0x0049:
            r6 = 10
            goto L_0x00c2
        L_0x004d:
            java.lang.String r3 = "audio/opus"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0056
            goto L_0x0016
        L_0x0056:
            r6 = 9
            goto L_0x00c2
        L_0x005a:
            java.lang.String r3 = "audio/3gpp"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0063
            goto L_0x0016
        L_0x0063:
            r6 = 8
            goto L_0x00c2
        L_0x0067:
            java.lang.String r3 = "video/avc"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0070
            goto L_0x0016
        L_0x0070:
            r6 = 7
            goto L_0x00c2
        L_0x0072:
            java.lang.String r3 = "video/mp4v-es"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x007b
            goto L_0x0016
        L_0x007b:
            r6 = 6
            goto L_0x00c2
        L_0x007d:
            java.lang.String r3 = "audio/raw"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0086
            goto L_0x0016
        L_0x0086:
            r6 = 5
            goto L_0x00c2
        L_0x0088:
            java.lang.String r3 = "audio/ac3"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0091
            goto L_0x0016
        L_0x0091:
            r6 = 4
            goto L_0x00c2
        L_0x0093:
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x009d
            goto L_0x0016
        L_0x009d:
            r6 = 3
            goto L_0x00c2
        L_0x009f:
            java.lang.String r3 = "audio/amr-wb"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x00a9
            goto L_0x0016
        L_0x00a9:
            r6 = 2
            goto L_0x00c2
        L_0x00ab:
            java.lang.String r3 = "video/hevc"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x00b5
            goto L_0x0016
        L_0x00b5:
            r6 = 1
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r3 = "video/3gpp"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x00c1
            goto L_0x0016
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            switch(r6) {
                case 0: goto L_0x0114;
                case 1: goto L_0x010e;
                case 2: goto L_0x0108;
                case 3: goto L_0x00f2;
                case 4: goto L_0x00ec;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00da;
                case 8: goto L_0x0108;
                case 9: goto L_0x00d4;
                case 10: goto L_0x00ce;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00e6;
                case 13: goto L_0x00e6;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            r5 = 0
            goto L_0x011a
        L_0x00c7:
            g1.d r6 = new g1.d
            r6.<init>(r5, r1)
        L_0x00cc:
            r5 = r6
            goto L_0x011a
        L_0x00ce:
            g1.k r6 = new g1.k
            r6.<init>(r5)
            goto L_0x00cc
        L_0x00d4:
            g1.h r6 = new g1.h
            r6.<init>(r5)
            goto L_0x00cc
        L_0x00da:
            g1.e r6 = new g1.e
            r6.<init>(r5, r2)
            goto L_0x00cc
        L_0x00e0:
            g1.g r6 = new g1.g
            r6.<init>(r5)
            goto L_0x00cc
        L_0x00e6:
            g1.j r6 = new g1.j
            r6.<init>(r5)
            goto L_0x00cc
        L_0x00ec:
            g1.b r6 = new g1.b
            r6.<init>(r5)
            goto L_0x00cc
        L_0x00f2:
            java.lang.String r6 = r5.e
            java.lang.String r1 = "MP4A-LATM"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0102
            g1.f r6 = new g1.f
            r6.<init>(r5)
            goto L_0x00cc
        L_0x0102:
            g1.a r6 = new g1.a
            r6.<init>(r5)
            goto L_0x00cc
        L_0x0108:
            g1.c r6 = new g1.c
            r6.<init>(r5)
            goto L_0x00cc
        L_0x010e:
            g1.e r6 = new g1.e
            r6.<init>(r5, r1)
            goto L_0x00cc
        L_0x0114:
            g1.d r6 = new g1.d
            r6.<init>(r5, r2)
            goto L_0x00cc
        L_0x011a:
            r5.getClass()
            r4.f11522a = r5
            P0.r r5 = new P0.r
            r6 = 65507(0xffe3, float:9.1795E-41)
            r5.<init>((int) r6)
            r4.f11523b = r5
            P0.r r5 = new P0.r
            r5.<init>()
            r4.f11524c = r5
            java.lang.Object r5 = new java.lang.Object
            r5.<init>()
            r4.e = r5
            H.k r5 = new H.k
            r5.<init>()
            r4.f11526f = r5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.i = r5
            r4.f11529j = r0
            r4.f11531l = r5
            r4.f11532m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0892e.<init>(f1.i, int):void");
    }

    public final void a(long j7, long j8) {
        synchronized (this.e) {
            try {
                if (!this.f11530k) {
                    this.f11530k = true;
                }
                this.f11531l = j7;
                this.f11532m = j8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, f1.f] */
    public final int e(p pVar, C0132u uVar) {
        boolean z;
        boolean z6;
        boolean z8;
        this.f11527g.getClass();
        int x8 = pVar.x(this.f11523b.f3732a, 0, 65507);
        if (x8 == -1) {
            return -1;
        }
        if (x8 == 0) {
            return 0;
        }
        this.f11523b.H(0);
        this.f11523b.G(x8);
        r rVar = this.f11523b;
        C0894g gVar = null;
        if (rVar.a() >= 12) {
            int v4 = rVar.v();
            byte b8 = (byte) (v4 >> 6);
            int i8 = (byte) (v4 & 15);
            if (((v4 >> 4) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (b8 == 2) {
                int v8 = rVar.v();
                if (((v8 >> 7) & 1) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                byte b9 = (byte) (v8 & 127);
                int B8 = rVar.B();
                long x9 = rVar.x();
                int i9 = rVar.i();
                byte[] bArr = C0894g.f11538g;
                if (i8 > 0) {
                    byte[] bArr2 = new byte[(i8 * 4)];
                    for (int i10 = 0; i10 < i8; i10++) {
                        rVar.g(bArr2, i10 * 4, 4);
                    }
                }
                if (z) {
                    rVar.I(2);
                    int s8 = rVar.s();
                    if (s8 != 0) {
                        rVar.I(s8 * 4);
                    }
                }
                byte[] bArr3 = new byte[rVar.a()];
                rVar.g(bArr3, 0, rVar.a());
                ? obj = new Object();
                obj.f11537f = bArr;
                obj.f11533a = z6;
                obj.f11534b = b9;
                if (B8 < 0 || B8 > 65535) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                l.d(z8);
                obj.f11535c = 65535 & B8;
                obj.f11536d = x9;
                obj.e = i9;
                obj.f11537f = bArr3;
                gVar = new C0894g(obj);
            }
        }
        if (gVar == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = elapsedRealtime - 30;
        this.f11526f.d(gVar, elapsedRealtime);
        C0894g e8 = this.f11526f.e(j7);
        if (e8 == null) {
            return 0;
        }
        if (!this.f11528h) {
            if (this.i == -9223372036854775807L) {
                this.i = e8.f11542d;
            }
            if (this.f11529j == -1) {
                this.f11529j = e8.f11541c;
            }
            this.f11522a.c(this.i);
            this.f11528h = true;
        }
        synchronized (this.e) {
            try {
                if (!this.f11530k) {
                    do {
                        r rVar2 = this.f11524c;
                        byte[] bArr4 = e8.f11543f;
                        rVar2.getClass();
                        rVar2.F(bArr4.length, bArr4);
                        this.f11522a.b(this.f11524c, e8.f11542d, e8.f11541c, e8.f11539a);
                        e8 = this.f11526f.e(j7);
                    } while (e8 != null);
                } else if (!(this.f11531l == -9223372036854775807L || this.f11532m == -9223372036854775807L)) {
                    this.f11526f.f();
                    this.f11522a.a(this.f11531l, this.f11532m);
                    this.f11530k = false;
                    this.f11531l = -9223372036854775807L;
                    this.f11532m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public final void l(q qVar) {
        this.f11522a.d(qVar, this.f11525d);
        qVar.g();
        qVar.l(new s(-9223372036854775807L));
        this.f11527g = qVar;
    }

    public final void release() {
    }
}
