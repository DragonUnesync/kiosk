package z4;

import A4.b;
import C4.e;
import F4.c;
import G4.a;
import G5.s;
import T5.C0260n;
import T5.C0270s0;
import T5.K;
import T5.O0;
import T5.W;
import T5.Y;
import T5.Z0;
import com.bumptech.glide.g;
import de.ozerov.fully.P1;
import de.ozerov.fully.R1;
import f6.C0916f;
import f6.Z;
import f6.a0;
import f6.d0;
import i5.o;
import j$.util.Comparator;
import j$.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import l4.C1175a;
import l4.C1176b;
import m4.C1214b;
import m4.C1215c;
import o4.C1318a;
import p1.E;
import r4.C1389a;
import s6.C1407a;
import s6.d;
import t5.C1429a;
import u4.C1492a;
import w5.C1591a;
import x5.C1607b;

public final class f extends a {

    /* renamed from: d0  reason: collision with root package name */
    public static final C1175a f16551d0 = C1176b.a(f.class);

    /* renamed from: W  reason: collision with root package name */
    public final O4.a f16552W;

    /* renamed from: X  reason: collision with root package name */
    public final b f16553X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1214b f16554Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x4.f f16555Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1318a f16556a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f16557b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public long f16558c0;

    public f(O4.a aVar, b bVar, C1214b bVar2, x4.f fVar, C1318a aVar2) {
        this.f16552W = aVar;
        this.f16553X = bVar;
        this.f16554Y = bVar2;
        this.f16555Z = fVar;
        this.f16556a0 = aVar2;
    }

    public final void c(Y y8, b bVar) {
        d();
        int i = bVar.f95b;
        Z0 eventLoop = y8.channel().eventLoop();
        e.C(this.f16554Y, i, bVar.f94a, this.f16552W, this.f16553X, eventLoop);
    }

    public final void channelActive(Y y8) {
        k(y8);
        y8.fireChannelActive();
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, i5.p] */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.bumptech.glide.g, l5.b] */
    public final void channelRead(Y y8, Object obj) {
        boolean z;
        boolean z6;
        P4.a aVar;
        boolean z8;
        l6.b bVar;
        Object obj2 = obj;
        d();
        if (obj2 instanceof P4.a) {
            P4.a aVar2 = (P4.a) obj2;
            K channel = y8.channel();
            C1591a aVar3 = (C1591a) aVar2.e;
            aVar3.getClass();
            if (E.b(aVar3)) {
                s.o(channel, new C1429a(aVar2, "CONNECT failed as CONNACK contained an Error Code: " + aVar2.e + ".", 1), 3);
                return;
            }
            C1492a aVar4 = this.f16554Y.f13356a;
            C1492a aVar5 = aVar2.i;
            if (aVar4 == C1492a.f15774Y) {
                this.f16554Y.getClass();
            } else if (aVar5 != null) {
                f16551d0.b("Server overwrote the Client Identifier {} with {}", aVar4, aVar5);
            }
            if (aVar5 != null) {
                this.f16554Y.f13356a = aVar5;
            }
            int i = aVar2.f3782h;
            if (i == -1) {
                i = this.f16552W.f3649d;
            }
            int i8 = i;
            long j7 = aVar2.f3781g;
            if (j7 == -1) {
                j7 = this.f16552W.f3650f;
            }
            long j8 = j7;
            O4.a aVar6 = this.f16552W;
            O4.b bVar2 = aVar6.f3651g;
            P4.b bVar3 = aVar2.f3784k;
            m4.f fVar = this.f16554Y.f13365l;
            boolean z9 = aVar6.e;
            P4.a aVar7 = aVar2;
            if (aVar6.f3650f == 0) {
                z = true;
            } else {
                z = false;
            }
            if (aVar6.f3652h != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i9 = bVar2.f3654a;
            int i10 = bVar2.f3657d;
            boolean z10 = bVar2.f3658f;
            boolean z11 = bVar2.f3659g;
            int min = Math.min(bVar2.f3655b, bVar3.f3788b);
            int min2 = Math.min(bVar2.f3656c, bVar3.f3789c);
            int min3 = Math.min(bVar2.e, bVar3.f3790d);
            boolean z12 = bVar3.f3791f;
            K k8 = channel;
            boolean z13 = z12;
            boolean z14 = z11;
            int i11 = min;
            C1215c cVar = r3;
            C1215c cVar2 = new C1215c(i8, z9, z, j8, z6, i9, i10, z10, z14, i11, min2, min3, z13, bVar3.f3792g, bVar3.f3793h, bVar3.i, k8);
            this.f16554Y.f13364k = cVar;
            C0260n nVar = (C0260n) k8;
            ((O0) nVar.pipeline()).remove((W) this);
            C1389a aVar8 = (C1389a) ((O0) nVar.pipeline()).get("encoder");
            aVar8.getClass();
            aVar8.f14944V.f1093U = min2;
            x4.f fVar2 = this.f16555Z;
            C0270s0 pipeline = nVar.pipeline();
            Z0 eventLoop = nVar.eventLoop();
            if (fVar2.f16296d) {
                aVar = aVar7;
                if (!aVar.f3780f) {
                    fVar2.a(new g("Session expired as CONNACK did not contain the session present flag.", new C1429a(aVar, "Session expired as CONNACK did not contain the session present flag.", 1)));
                }
            } else {
                aVar = aVar7;
            }
            fVar2.f16296d = true;
            Z z15 = fVar2.e;
            if (z15 != null) {
                ((a0) z15).cancel(false);
                fVar2.e = null;
            }
            O0 o02 = (O0) pipeline;
            c cVar3 = fVar2.f16293a;
            o02.addAfter("decoder", "subscription", cVar3);
            e eVar = fVar2.f16294b;
            o02.addAfter("decoder", "qos.incoming", eVar);
            D4.c cVar4 = fVar2.f16295c;
            o02.addAfter("decoder", "qos.outgoing", cVar4);
            cVar3.getClass();
            if ((cVar.i & 128) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            cVar3.f1546d0 = z8;
            if (!cVar3.f16297V) {
                z3.e eVar2 = cVar3.f1540X.f687a;
                Map.-EL.forEach(new TreeMap(Comparator.-CC.reverseOrder()), new F4.b(0, cVar3));
            }
            cVar3.f1543a0.b();
            F4.a aVar9 = (F4.a) ((I2.b) cVar3.f1541Y.f10050V);
            cVar3.f1544b0 = aVar9;
            if (aVar9 != null) {
                ((d0) eventLoop).execute(cVar3);
            }
            cVar3.f16297V = true;
            eVar.getClass();
            eVar.f702Z = cVar.f13370c & 65535;
            eVar.f703a0++;
            eVar.f16297V = true;
            int i12 = cVar4.f1219f0;
            int min4 = Math.min(cVar.e & 65535, 65525);
            cVar4.f1219f0 = min4;
            cVar4.f1215b0.v(min4);
            if (i12 == 0) {
                B7.g gVar = new B7.g(4);
                int min5 = Math.min(min4, l6.b.f13197U);
                D4.f fVar3 = cVar4.f1211X;
                fVar3.getClass();
                if (min5 > 0) {
                    if (fVar3 instanceof q6.c) {
                        Object call = ((q6.c) fVar3).call();
                        if (call == null) {
                            bVar = C1407a.f15120V;
                        } else {
                            bVar = new s6.f(call, gVar);
                        }
                    } else {
                        bVar = new d(fVar3, gVar, min5);
                    }
                    bVar.b(cVar4);
                    cVar4.f1221h0.c((long) min4);
                } else {
                    throw new IllegalArgumentException(Q0.g.m(min5, "bufferSize > 0 required but it was "));
                }
            } else {
                int i13 = (min4 - i12) - cVar4.f1222i0;
                if (i13 > 0) {
                    cVar4.f1222i0 = 0;
                    cVar4.f1221h0.c((long) i13);
                } else {
                    cVar4.f1222i0 = -i13;
                }
            }
            cVar4.f1220g0 = cVar.f13373g;
            cVar4.f1216c0.b();
            D4.d dVar = (D4.d) ((I2.b) cVar4.f1214a0.f10050V);
            cVar4.f1217d0 = dVar;
            if (dVar != null || cVar4.f1213Z.get() > 0) {
                ((d0) eventLoop).execute(cVar4);
            }
            cVar4.f16297V = true;
            short s8 = cVar.f13368a & 65535;
            if (s8 > 0) {
                ((O0) nVar.pipeline()).addAfter("decoder", "ping", new B4.a(s8, this.f16558c0, System.nanoTime()));
            }
            this.f16554Y.f13363j.set(j5.b.f12892W);
            ? r02 = this.f16554Y.f13359d;
            if (!r02.isEmpty()) {
                this.f16554Y.getClass();
                o it = r02.iterator();
                while (it.hasNext()) {
                    try {
                        R1 r12 = (R1) ((P1) it.next()).f10248a.f9768X;
                        if (r12 != null) {
                            r12.run();
                        }
                    } catch (Throwable th) {
                        f16551d0.error("Unexpected exception thrown by connected listener.", th);
                    }
                }
            }
            l6.g gVar2 = this.f16553X.f16535a;
            if (gVar2 != null) {
                gVar2.f(aVar);
                return;
            }
            return;
        }
        K channel2 = y8.channel();
        if (obj2 instanceof L4.c) {
            s.l(channel2, C1607b.PROTOCOL_ERROR, ((L4.c) obj2).getType() + " message must not be received before CONNACK");
            return;
        }
        s.d(channel2, "No data must be received before CONNECT is sent");
    }

    public final long g() {
        this.f16554Y.f13365l.getClass();
        return (long) 60000;
    }

    public final C1607b h() {
        return C1607b.PROTOCOL_ERROR;
    }

    public final void handlerAdded(Y y8) {
        this.f16289U = y8;
        if (y8.channel().isActive()) {
            k(y8);
        }
    }

    public final String i() {
        return "Timeout while waiting for CONNACK";
    }

    public final void j(Y y8) {
        this.f16552W.getClass();
        K channel = y8.channel();
        long g8 = g();
        if (g8 > 0) {
            this.f1657V = ((C0916f) channel.eventLoop()).schedule((Runnable) this, g8, TimeUnit.MILLISECONDS);
        }
        ((O0) y8.pipeline()).addAfter("encoder", "decoder", this.f16556a0);
    }

    public final void k(Y y8) {
        if (!this.f16557b0) {
            this.f16557b0 = true;
            this.f16558c0 = System.nanoTime();
            this.f16552W.getClass();
            O4.a aVar = this.f16552W;
            C1492a aVar2 = this.f16554Y.f13356a;
            aVar.getClass();
            y8.writeAndFlush(new O4.c(aVar, aVar2, (M4.b) null)).addListener(this);
        }
    }
}
