package D4;

import C4.d;
import D2.j;
import I2.b;
import T5.C0260n;
import T5.K;
import T5.O0;
import T5.P0;
import T5.Y;
import V1.G;
import V4.e;
import V4.f;
import V7.a;
import de.ozerov.fully.K2;
import f5.C0903a;
import f5.C0904b;
import f6.C0909B;
import f6.C0910C;
import f6.d0;
import f6.r;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import l4.C1175a;
import l4.C1176b;
import m4.C1214b;
import org.jctools.queues.s;
import x4.g;
import x5.C1607b;

public final class c extends g implements l6.c, Runnable, C0910C {

    /* renamed from: j0  reason: collision with root package name */
    public static final C1175a f1208j0 = C1176b.a(c.class);

    /* renamed from: k0  reason: collision with root package name */
    public static final j f1209k0 = new j(new d(1));

    /* renamed from: W  reason: collision with root package name */
    public final C1214b f1210W;

    /* renamed from: X  reason: collision with root package name */
    public final f f1211X;

    /* renamed from: Y  reason: collision with root package name */
    public final s f1212Y = new s(32);

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicInteger f1213Z = new AtomicInteger();

    /* renamed from: a0  reason: collision with root package name */
    public final K2 f1214a0 = new K2(14);

    /* renamed from: b0  reason: collision with root package name */
    public final Z1.c f1215b0 = new Z1.c(1, 0);

    /* renamed from: c0  reason: collision with root package name */
    public final G f1216c0 = new G(f1209k0);

    /* renamed from: d0  reason: collision with root package name */
    public d f1217d0;

    /* renamed from: e0  reason: collision with root package name */
    public g f1218e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1219f0;

    /* renamed from: g0  reason: collision with root package name */
    public j f1220g0;

    /* renamed from: h0  reason: collision with root package name */
    public a f1221h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1222i0;

    /* JADX WARNING: type inference failed for: r4v1, types: [D4.f, java.lang.Object] */
    public c(C1214b bVar) {
        this.f1210W = bVar;
        this.f1211X = new Object();
    }

    public static void h(Y y8, String str) {
        G5.s.l(y8.channel(), C1607b.PROTOCOL_ERROR, str);
    }

    public final void a(Throwable th) {
        f1208j0.error("MqttPublishFlowables is global and must never error. This must not happen and is a bug.", th);
    }

    public final void b() {
        f1208j0.error("MqttPublishFlowables is global and must never complete. This must not happen and is a bug.");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, a5.a, L4.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (((java.util.function.ToIntFunction) r7.f1094V).applyAsInt(r5) == r0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (((java.util.function.ToIntFunction) r7.f1094V).applyAsInt(r5) == r0) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void channelRead(T5.Y r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X4.a
            r1 = 0
            m4.b r2 = r10.f1210W
            r3 = 1
            V1.G r4 = r10.f1216c0
            if (r0 == 0) goto L_0x0064
            X4.a r12 = (X4.a) r12
            int r0 = r12.f2707f
            java.lang.Object r0 = r4.f(r0)
            D4.d r0 = (D4.d) r0
            if (r0 != 0) goto L_0x001d
            java.lang.String r12 = "PUBACK contained unknown packet identifier"
            h(r11, r12)
            goto L_0x0196
        L_0x001d:
            boolean r5 = r0 instanceof D4.g
            if (r5 != 0) goto L_0x002b
            r4.e(r0, r3)
            java.lang.String r12 = "PUBACK must not be received for a PUBREL"
            h(r11, r12)
            goto L_0x0196
        L_0x002b:
            r5 = r0
            D4.g r5 = (D4.g) r5
            V4.a r6 = r5.f1230Y
            k5.a r7 = k5.a.f13048V
            k5.a r8 = r6.f5976f
            if (r8 == r7) goto L_0x0040
            r4.e(r0, r3)
            java.lang.String r12 = "PUBACK must not be received for a QoS 2 PUBLISH"
            h(r11, r12)
            goto L_0x0196
        L_0x0040:
            r10.g(r11, r5)
            r2.getClass()
            u5.c r11 = r12.e
            z5.a r11 = (z5.C1648a) r11
            r11.getClass()
            boolean r11 = p1.E.b(r11)
            if (r11 == 0) goto L_0x0058
            t5.a r1 = new t5.a
            r1.<init>((X4.a) r12)
        L_0x0058:
            V4.b r11 = new V4.b
            r11.<init>(r6, r1, r12)
            D4.a r12 = r5.f1223W
            r12.b(r11)
            goto L_0x0196
        L_0x0064:
            boolean r0 = r12 instanceof Z4.a
            if (r0 == 0) goto L_0x0148
            Z4.a r12 = (Z4.a) r12
            int r0 = r12.f2707f
            java.io.Serializable r5 = r4.e
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r6 = r5.length
            int r6 = r6 - r3
            r6 = r6 & r0
            r5 = r5[r6]
            if (r5 != 0) goto L_0x0079
        L_0x0077:
            r5 = r1
            goto L_0x00ae
        L_0x0079:
            java.lang.Class r6 = r5.getClass()
            java.lang.Object r7 = r4.f5717d
            D2.j r7 = (D2.j) r7
            java.lang.Class<i5.t> r8 = i5.t.class
            if (r6 != r8) goto L_0x00a4
            i5.t r5 = (i5.t) r5
        L_0x0087:
            int r6 = r5.f12759a
            if (r6 != r0) goto L_0x008e
            java.lang.Object r5 = r5.f12760b
            goto L_0x00ae
        L_0x008e:
            java.lang.Object r5 = r5.f12761c
            java.lang.Class r6 = r5.getClass()
            if (r6 != r8) goto L_0x0099
            i5.t r5 = (i5.t) r5
            goto L_0x0087
        L_0x0099:
            java.lang.Object r6 = r7.f1094V
            java.util.function.ToIntFunction r6 = (java.util.function.ToIntFunction) r6
            int r6 = r6.applyAsInt(r5)
            if (r6 != r0) goto L_0x0077
            goto L_0x00ae
        L_0x00a4:
            java.lang.Object r6 = r7.f1094V
            java.util.function.ToIntFunction r6 = (java.util.function.ToIntFunction) r6
            int r6 = r6.applyAsInt(r5)
            if (r6 != r0) goto L_0x0077
        L_0x00ae:
            D4.d r5 = (D4.d) r5
            if (r5 != 0) goto L_0x00b9
            java.lang.String r12 = "PUBREC contained unknown packet identifier"
            h(r11, r12)
            goto L_0x0196
        L_0x00b9:
            boolean r6 = r5 instanceof D4.g
            if (r6 != 0) goto L_0x00c4
            java.lang.String r12 = "PUBREC must not be received when the PUBREL has already been sent"
            h(r11, r12)
            goto L_0x0196
        L_0x00c4:
            D4.g r5 = (D4.g) r5
            V4.a r6 = r5.f1230Y
            k5.a r7 = k5.a.f13049W
            k5.a r8 = r6.f5976f
            if (r8 == r7) goto L_0x00d5
            java.lang.String r12 = "PUBREC must not be received for a QoS 1 PUBLISH"
            h(r11, r12)
            goto L_0x0196
        L_0x00d5:
            u5.c r7 = r12.e
            B5.a r7 = (B5.a) r7
            r7.getClass()
            boolean r7 = p1.E.b(r7)
            D4.a r8 = r5.f1223W
            if (r7 == 0) goto L_0x00fc
            r4.f(r0)
            r10.g(r11, r5)
            r2.getClass()
            t5.a r11 = new t5.a
            r11.<init>((Z4.a) r12)
            V4.d r0 = new V4.d
            r0.<init>(r6, r11, r12)
            r8.b(r0)
            goto L_0x0196
        L_0x00fc:
            C5.a r0 = a5.C0426a.f7218g
            u4.b r7 = u4.C1493b.f15776c
            r2.getClass()
            a5.a r2 = new a5.a
            int r9 = r12.f2707f
            r2.<init>(r9, r0, r1, r7)
            D4.e r0 = new D4.e
            r0.<init>(r2, r8)
            int r1 = r5.f1224X
            r0.f1224X = r1
            r4.e(r0, r3)
            de.ozerov.fully.K2 r1 = r10.f1214a0
            r1.getClass()
            java.lang.Object r3 = r5.f2257U
            I2.b r3 = (I2.b) r3
            java.lang.Object r4 = r5.f2258V
            I2.b r4 = (I2.b) r4
            r0.f2257U = r3
            r0.f2258V = r4
            if (r3 != 0) goto L_0x012c
            r1.f10050V = r0
            goto L_0x012e
        L_0x012c:
            r3.f2258V = r0
        L_0x012e:
            if (r4 != 0) goto L_0x0133
            r1.f10051W = r0
            goto L_0x0135
        L_0x0133:
            r4.f2257U = r0
        L_0x0135:
            V4.c r1 = new V4.c
            r1.<init>(r6, r12, r0)
            r8.b(r1)
            T5.u0 r12 = r11.voidPromise()
            r11.write(r2, r12)
            r11.flush()
            goto L_0x0196
        L_0x0148:
            boolean r0 = r12 instanceof Y4.a
            if (r0 == 0) goto L_0x0193
            Y4.a r12 = (Y4.a) r12
            int r12 = r12.f2707f
            java.lang.Object r12 = r4.f(r12)
            D4.d r12 = (D4.d) r12
            if (r12 != 0) goto L_0x015e
            java.lang.String r12 = "PUBCOMP contained unknown packet identifier"
            h(r11, r12)
            goto L_0x0196
        L_0x015e:
            boolean r0 = r12 instanceof D4.e
            if (r0 != 0) goto L_0x017b
            r4.e(r12, r3)
            D4.g r12 = (D4.g) r12
            V4.a r12 = r12.f1230Y
            k5.a r0 = k5.a.f13048V
            k5.a r12 = r12.f5976f
            if (r12 != r0) goto L_0x0175
            java.lang.String r12 = "PUBCOMP must not be received for a QoS 1 PUBLISH"
            h(r11, r12)
            goto L_0x0196
        L_0x0175:
            java.lang.String r12 = "PUBCOMP must not be received when the PUBREL has not been sent yet"
            h(r11, r12)
            goto L_0x0196
        L_0x017b:
            D4.e r12 = (D4.e) r12
            r10.g(r11, r12)
            r2.getClass()
            boolean r11 = r12.getAsBoolean()
            if (r11 == 0) goto L_0x0196
            D4.a r11 = r12.f1223W
            V4.e r12 = r11.f1205Z
            r11.f1205Z = r1
            r11.a(r12)
            goto L_0x0196
        L_0x0193:
            r11.fireChannelRead(r12)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.c.channelRead(T5.Y, java.lang.Object):void");
    }

    public final void channelWritabilityChanged(Y y8) {
        C0260n nVar = (C0260n) y8.channel();
        if (nVar.isWritable()) {
            ((d0) nVar.eventLoop()).execute(this);
        }
        y8.fireChannelWritabilityChanged();
    }

    public final void d(com.bumptech.glide.g gVar) {
        int i;
        do {
            i = 0;
            while (true) {
                g gVar2 = (g) this.f1212Y.poll();
                if (gVar2 != null) {
                    gVar2.f1223W.b(new e(gVar2.f1230Y, gVar));
                    i++;
                }
            }
        } while (this.f1213Z.addAndGet(-i) != 0);
    }

    public final void e(a aVar) {
        this.f1221h0 = aVar;
    }

    public final void exceptionCaught(Y y8, Throwable th) {
        g gVar;
        if ((th instanceof IOException) || (gVar = this.f1218e0) == null) {
            y8.fireExceptionCaught(th);
            return;
        }
        this.f1216c0.f(gVar.f1224X);
        g gVar2 = this.f1218e0;
        gVar2.f1223W.b(new e(gVar2.f1230Y, th));
        g(y8, this.f1218e0);
        this.f1218e0 = null;
    }

    public final void f(Object obj) {
        g gVar = (g) obj;
        this.f1212Y.offer(gVar);
        if (this.f1213Z.getAndIncrement() == 0) {
            ((d0) gVar.f1223W.f1201V).execute(this);
        }
    }

    public final void g(Y y8, d dVar) {
        this.f1214a0.R(dVar);
        int i = dVar.f1224X;
        Z1.c cVar = this.f1215b0;
        cVar.x(i);
        int i8 = this.f1219f0;
        if (i > i8) {
            cVar.v(i8);
        }
        if (this.f1217d0 != null) {
            ((d0) y8.channel().eventLoop()).execute(this);
        }
    }

    public final void operationComplete(C0909B b8) {
        C0903a aVar = (C0903a) b8;
        g gVar = ((C0904b) aVar).f11686U;
        V4.a aVar2 = gVar.f1230Y;
        Throwable cause = ((r) aVar).cause();
        boolean z = cause instanceof IOException;
        a aVar3 = gVar.f1223W;
        if (!z) {
            aVar3.b(new e(aVar2, cause));
            return;
        }
        aVar3.b(new e(aVar2, new com.bumptech.glide.g(cause)));
        ((O0) ((C0260n) ((P0) aVar).channel()).pipeline()).fireExceptionCaught(cause);
    }

    public final void run() {
        int i;
        J1.d dVar;
        if (!this.f16297V) {
            this.f1210W.getClass();
            d(Q7.g.z());
            return;
        }
        Y y8 = this.f16289U;
        if (y8 != null) {
            K channel = y8.channel();
            int i8 = this.f1219f0;
            G g8 = this.f1216c0;
            int i9 = i8 - g8.f5714a;
            d dVar2 = this.f1217d0;
            int i10 = 0;
            while (dVar2 != null && i10 < i9 && ((C0260n) channel).isWritable()) {
                g8.e(dVar2, true);
                if (dVar2 instanceof g) {
                    g gVar = (g) dVar2;
                    f d8 = gVar.f1230Y.d(gVar.f1224X, true, this.f1220g0);
                    this.f1218e0 = gVar;
                    y8.write(d8, y8.voidPromise());
                    this.f1218e0 = null;
                } else {
                    y8.write(((e) dVar2).f1225Y, y8.voidPromise());
                }
                i10++;
                dVar2 = (d) ((b) dVar2.f2258V);
                this.f1217d0 = dVar2;
            }
            int i11 = 0;
            while (i10 < i9 && ((C0260n) channel).isWritable()) {
                g gVar2 = (g) this.f1212Y.poll();
                if (gVar2 == null) {
                    break;
                }
                V4.a aVar = gVar2.f1230Y;
                if (aVar.f5976f == k5.a.f13047U) {
                    y8.write(aVar.d(-1, false, this.f1220g0), new C0904b(y8.channel(), gVar2)).addListener(this);
                } else {
                    Z1.c cVar = this.f1215b0;
                    J1.d dVar3 = (J1.d) cVar.f6955V;
                    int i12 = dVar3.f2351U;
                    int i13 = dVar3.f2352V;
                    if (i12 == i13) {
                        i = -1;
                    } else {
                        int i14 = i12 + 1;
                        dVar3.f2351U = i14;
                        if (i14 == i13 && (dVar = (J1.d) dVar3.f2353W) != null) {
                            cVar.f6955V = dVar;
                        }
                        i = i12;
                    }
                    if (i < 0) {
                        f1208j0.error("No Packet Identifier available for QoS 1 or 2 PUBLISH. This must not happen and is a bug.");
                    } else {
                        gVar2.f1224X = i;
                        g8.e(gVar2, true);
                        K2 k22 = this.f1214a0;
                        b bVar = (b) k22.f10051W;
                        if (bVar == null) {
                            k22.f10051W = gVar2;
                            k22.f10050V = gVar2;
                        } else {
                            bVar.f2258V = gVar2;
                            gVar2.f2257U = bVar;
                            k22.f10051W = gVar2;
                        }
                        f d9 = aVar.d(i, false, this.f1220g0);
                        this.f1218e0 = gVar2;
                        y8.write(d9, y8.voidPromise());
                        this.f1218e0 = null;
                    }
                }
                i10++;
                i11++;
            }
            if (i10 > 0) {
                C0260n nVar = (C0260n) channel;
                boolean isWritable = nVar.isWritable();
                y8.flush();
                if (i11 > 0 && this.f1213Z.addAndGet(-i11) > 0 && isWritable) {
                    ((d0) nVar.eventLoop()).execute(this);
                }
            }
        }
    }
}
