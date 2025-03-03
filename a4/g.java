package A4;

import D4.j;
import G5.s;
import M4.c;
import O4.b;
import S4.a;
import T5.K;
import T5.Y;
import T5.Z0;
import f6.C0916f;
import f6.a0;
import f6.d0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l4.C1175a;
import l4.C1176b;
import m4.C1213a;
import m4.C1214b;
import m4.C1215c;
import t5.C1429a;
import t5.C1430b;
import u4.C1493b;
import x4.d;
import x4.e;
import x4.f;
import x5.C1607b;

public final class g extends d {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1175a f112Y = C1176b.a(g.class);

    /* renamed from: Z  reason: collision with root package name */
    public static final Object f113Z = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final C1214b f114V;

    /* renamed from: W  reason: collision with root package name */
    public final f f115W;

    /* renamed from: X  reason: collision with root package name */
    public Object f116X = null;

    public g(C1214b bVar, f fVar) {
        this.f114V = bVar;
        this.f115W = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if ((r0 instanceof S4.a) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T5.Y r12, A4.b r13) {
        /*
            r11 = this;
            java.lang.Object r0 = f113Z
            r11.f116X = r0
            T5.K r3 = r12.channel()
            int r0 = r13.f95b
            r1 = 3
            if (r0 != r1) goto L_0x0016
            r11.d(r3, r13)
            T5.n r3 = (T5.C0260n) r3
            r3.close()
            return
        L_0x0016:
            com.bumptech.glide.g r0 = r13.f94a
            boolean r1 = r0 instanceof t5.C1430b
            if (r1 == 0) goto L_0x0025
            t5.b r0 = (t5.C1430b) r0
            S4.a r0 = r0.f15484V
            boolean r1 = r0 instanceof S4.a
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x0094
            long r1 = r0.f4533f
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0067
            m4.b r4 = r11.f114V
            m4.c r4 = r4.f13364k
            if (r4 == 0) goto L_0x0067
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r5 = r4.i
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0064
            l4.a r1 = f112Y
            java.lang.String r2 = "Session expiry interval must not be set in DISCONNECT if it was set to 0 in CONNECT"
            r1.warn(r2)
            x5.b r1 = x5.C1606a.f16298a
            u4.b r1 = u4.C1493b.f15776c
            u5.c r1 = r0.e
            r5 = r1
            x5.b r5 = (x5.C1607b) r5
            u4.d r8 = r0.f4534g
            u4.d r9 = r0.f2709d
            java.lang.Object r0 = r0.f2711c
            r10 = r0
            u4.b r10 = (u4.C1493b) r10
            S4.a r0 = new S4.a
            r6 = 0
            r4 = r0
            r4.<init>(r5, r6, r8, r9, r10)
            goto L_0x0067
        L_0x0064:
            int r2 = (int) r1
            r4.f13369b = r2
        L_0x0067:
            boolean r1 = r13 instanceof A4.a
            if (r1 == 0) goto L_0x007f
            r4 = r13
            A4.a r4 = (A4.a) r4
            T5.P r12 = r12.writeAndFlush(r0)
            A4.c r0 = new A4.c
            r6 = 1
            r1 = r0
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r12.addListener(r0)
            goto L_0x00a3
        L_0x007f:
            m4.b r12 = r11.f114V
            r12.getClass()
            T5.n r3 = (T5.C0260n) r3
            T5.P r12 = r3.close()
            A4.e r0 = new A4.e
            r1 = 0
            r0.<init>(r11, r3, r13, r1)
            r12.addListener(r0)
            goto L_0x00a3
        L_0x0094:
            T5.n r3 = (T5.C0260n) r3
            T5.P r12 = r3.close()
            A4.e r0 = new A4.e
            r1 = 1
            r0.<init>(r11, r3, r13, r1)
            r12.addListener(r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.g.c(T5.Y, A4.b):void");
    }

    public final void channelInactive(Y y8) {
        y8.fireChannelInactive();
        Object obj = this.f116X;
        Object obj2 = f113Z;
        if (obj == null) {
            this.f116X = obj2;
            s.o(y8.channel(), new com.bumptech.glide.g("Server closed connection without DISCONNECT.", (Throwable) null), 3);
        } else if (obj instanceof f) {
            f fVar = (f) obj;
            this.f116X = obj2;
            ((a0) fVar.f111W).cancel(false);
            K k8 = fVar.f109U;
            a aVar = fVar.f110V;
            d(k8, aVar);
            aVar.f93c.f12019U.b();
        }
    }

    public final void channelRead(Y y8, Object obj) {
        boolean z = obj instanceof a;
        Object obj2 = f113Z;
        if (z) {
            a aVar = (a) obj;
            if (this.f116X == null) {
                this.f116X = obj2;
                s.o(y8.channel(), new C1430b(aVar, "Server sent DISCONNECT."), 3);
            }
        } else if (obj instanceof P4.a) {
            P4.a aVar2 = (P4.a) obj;
            if (this.f116X == null) {
                this.f116X = obj2;
                s.k(y8.channel(), C1607b.PROTOCOL_ERROR, new C1429a(aVar2, "Must not receive second CONNACK.", 1));
            }
        } else {
            y8.fireChannelRead(obj);
        }
    }

    public final void d(K k8, b bVar) {
        boolean z;
        int i;
        boolean z6;
        boolean z8;
        b bVar2 = bVar;
        C1215c cVar = this.f114V.f13364k;
        if (cVar != null) {
            f fVar = this.f115W;
            com.bumptech.glide.g gVar = bVar2.f94a;
            Z0 eventLoop = k8.eventLoop();
            fVar.getClass();
            long j7 = ((long) cVar.f13369b) & 4294967295L;
            if (j7 == 0) {
                ((d0) eventLoop).execute(new e(fVar, gVar, 0));
            } else if (j7 != 4294967295L) {
                fVar.e = ((C0916f) eventLoop).schedule((Runnable) new e(fVar, gVar, 1), (long) (((double) TimeUnit.SECONDS.toMillis(j7)) * 1.1d), TimeUnit.MILLISECONDS);
            }
            Z0 eventLoop2 = k8.eventLoop();
            C1213a aVar = this.f114V.f13358c;
            short s8 = cVar.f13368a & 65535;
            if ((((long) cVar.f13369b) & 4294967295L) == 0) {
                z = true;
            } else {
                z = false;
            }
            long j8 = ((long) cVar.f13369b) & 4294967295L;
            short s9 = cVar.f13370c & 65535;
            short s10 = cVar.e & 65535;
            short s11 = cVar.f13371d & 65535;
            j jVar = cVar.f13373g;
            if (jVar == null) {
                i = 0;
            } else {
                i = jVar.f1237a;
            }
            int i8 = cVar.i;
            if ((i8 & 4) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i8 & 8) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            O4.a aVar2 = new O4.a(s8, z, j8, new b(s9, s10, cVar.f13372f, s11, i, z6, z8), (c) aVar.f13355a, C1493b.f15776c);
            z4.e.B(this.f114V, bVar2.f95b, bVar2.f94a, aVar2, 0, (z4.b) null, eventLoop2);
            this.f114V.f13364k = null;
        }
    }

    public final void exceptionCaught(Y y8, Throwable th) {
        if (this.f116X == null) {
            this.f116X = f113Z;
            s.o(y8.channel(), new com.bumptech.glide.g(th), 2);
        } else if (!(th instanceof IOException)) {
            f112Y.warn("Exception while disconnecting: {}", th);
        }
    }
}
