package C4;

import D2.j;
import G5.s;
import I2.b;
import L4.d;
import L4.h;
import T5.K;
import T5.Y;
import V1.G;
import V4.a;
import V4.f;
import a5.C0426a;
import i5.C1101a;
import i5.C1102b;
import i5.C1103c;
import l4.C1175a;
import l4.C1176b;
import m4.C1214b;
import p1.E;
import u4.C1493b;
import x4.g;
import x5.C1607b;
import z5.C1648a;

public final class e extends g {

    /* renamed from: b0  reason: collision with root package name */
    public static final C1175a f697b0 = C1176b.a(e.class);

    /* renamed from: c0  reason: collision with root package name */
    public static final j f698c0 = new j(new d(0));

    /* renamed from: W  reason: collision with root package name */
    public final C1214b f699W;

    /* renamed from: X  reason: collision with root package name */
    public final c f700X;

    /* renamed from: Y  reason: collision with root package name */
    public final G f701Y = new G(f698c0);

    /* renamed from: Z  reason: collision with root package name */
    public int f702Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f703a0;

    public e(C1214b bVar, a aVar) {
        this.f699W = bVar;
        this.f700X = new c(this, aVar);
    }

    public static boolean h(Y y8, f fVar) {
        if (fVar.e) {
            return true;
        }
        f697b0.a(fVar);
        K channel = y8.channel();
        C1607b bVar = C1607b.PROTOCOL_ERROR;
        s.l(channel, bVar, "DUP flag must be set for a resent QoS " + ((a) ((h) fVar.f2711c)).f5976f.ordinal() + " PUBLISH");
        return false;
    }

    public final void channelRead(Y y8, Object obj) {
        boolean z = obj instanceof f;
        C1214b bVar = this.f699W;
        G g8 = this.f701Y;
        C1175a aVar = f697b0;
        if (z) {
            f fVar = (f) obj;
            int ordinal = ((a) ((h) fVar.f2711c)).f5976f.ordinal();
            if (ordinal != 0) {
                int i = fVar.f2712d;
                if (ordinal == 1) {
                    f fVar2 = new f(fVar);
                    fVar2.f705a0 = this.f703a0;
                    Object e = g8.e(fVar2, false);
                    if (e == null) {
                        if (!i(y8, fVar2)) {
                            g8.f(i);
                        }
                    } else if (e instanceof f) {
                        f fVar3 = (f) e;
                        f fVar4 = fVar3.f704Z;
                        if (((a) ((h) fVar4.f2711c)).f5976f != k5.a.f13048V) {
                            aVar.error("QoS 1 PUBLISH ({}) must not carry the same packet identifier as a QoS 2 PUBLISH ({})", fVar, fVar4);
                            s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "QoS 1 PUBLISH must not carry the same packet identifier as a QoS 2 PUBLISH");
                        } else if (fVar3.f705a0 == this.f703a0) {
                            bVar.getClass();
                            h(y8, fVar);
                        } else {
                            g8.e(fVar2, true);
                            if (!i(y8, fVar2)) {
                                g8.e(e, true);
                            }
                        }
                    } else {
                        aVar.error("QoS 1 PUBLISH ({}) must not carry the same packet identifier as a QoS 2 PUBLISH ({})", fVar, e);
                        s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "QoS 1 PUBLISH must not carry the same packet identifier as a QoS 2 PUBLISH");
                    }
                } else if (ordinal == 2) {
                    f fVar5 = new f(fVar);
                    fVar5.f705a0 = this.f703a0;
                    Object e8 = g8.e(fVar5, false);
                    if (e8 == null) {
                        if (!i(y8, fVar5)) {
                            g8.f(i);
                        }
                    } else if (e8 instanceof f) {
                        f fVar6 = (f) e8;
                        f fVar7 = fVar6.f704Z;
                        if (((a) ((h) fVar7.f2711c)).f5976f == k5.a.f13049W) {
                            long j7 = fVar6.f705a0;
                            long j8 = this.f703a0;
                            if (j7 == j8) {
                                bVar.getClass();
                                h(y8, fVar);
                                return;
                            }
                            fVar6.f705a0 = j8;
                            h(y8, fVar);
                        } else if (fVar6.f705a0 == this.f703a0) {
                            aVar.error("QoS 2 PUBLISH ({}) must not carry the same packet identifier as a QoS 1 PUBLISH ({})", fVar, fVar7);
                            s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "QoS 2 PUBLISH must not carry the same packet identifier as a QoS 1 PUBLISH");
                        } else {
                            g8.e(fVar5, true);
                            if (!i(y8, fVar5)) {
                                g8.e(e8, true);
                            }
                        }
                    } else if (h(y8, fVar)) {
                        y8.writeAndFlush((Z4.a) e8, y8.voidPromise());
                    }
                }
            } else {
                f fVar8 = new f(fVar);
                int i8 = this.f702Z;
                c cVar = this.f700X;
                C1102b bVar2 = cVar.f693c;
                if (bVar2.f12735Z >= i8) {
                    c.f690g.warn("QoS 0 publish message dropped.");
                    C1101a aVar2 = cVar.f694d;
                    aVar2.a();
                    aVar2.remove();
                    if (((C1103c) ((b) ((f) aVar2.next()).f10050V)) != null) {
                        throw null;
                    }
                }
                cVar.a(fVar8);
                if (!fVar8.E()) {
                    bVar2.b(fVar8);
                }
            }
        } else if (obj instanceof C0426a) {
            C0426a aVar3 = (C0426a) obj;
            Object f8 = g8.f(aVar3.f2707f);
            boolean z6 = f8 instanceof Z4.a;
            int i9 = aVar3.f2707f;
            if (z6) {
                A5.a aVar4 = Y4.a.f6589g;
                C1493b bVar3 = C1493b.f15776c;
                bVar.getClass();
                y8.writeAndFlush(new d(i9, aVar4, (u4.d) null, bVar3), y8.voidPromise());
            } else if (f8 == null) {
                A5.a aVar5 = Y4.a.f6589g;
                C1493b bVar4 = C1493b.f15776c;
                A5.a aVar6 = A5.a.PACKET_IDENTIFIER_NOT_FOUND;
                bVar.getClass();
                y8.writeAndFlush(new d(i9, aVar6, (u4.d) null, bVar4), y8.voidPromise());
            } else {
                g8.e(f8, true);
                f fVar9 = ((f) f8).f704Z;
                if (((a) ((h) fVar9.f2711c)).f5976f == k5.a.f13049W) {
                    aVar.error("PUBREL ({}) must not carry the same packet identifier as an unacknowledged QoS 2 PUBLISH ({})", aVar3, fVar9);
                    s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "PUBREL must not carry the same packet identifier as an unacknowledged QoS 2 PUBLISH");
                    return;
                }
                aVar.error("PUBREL ({}) must not carry the same packet identifier as a QoS 1 PUBLISH ({})", aVar3, fVar9);
                s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "PUBREL must not carry the same packet identifier as a QoS 1 PUBLISH");
            }
        } else {
            y8.fireChannelRead(obj);
        }
    }

    public final void d(f fVar) {
        Y y8;
        Object obj;
        Y y9;
        f fVar2 = fVar.f704Z;
        int ordinal = ((a) ((h) fVar2.f2711c)).f5976f.ordinal();
        C1214b bVar = this.f699W;
        G g8 = this.f701Y;
        if (ordinal == 1) {
            C1648a aVar = X4.a.f6282g;
            C1493b bVar2 = C1493b.f15776c;
            bVar.getClass();
            int i = fVar2.f2712d;
            d dVar = new d(i, aVar, (u4.d) null, bVar2);
            if (g(g8.f(i), fVar) && (y8 = this.f16289U) != null) {
                y8.writeAndFlush(dVar, y8.voidPromise());
            }
        } else if (ordinal == 2) {
            B5.a aVar2 = Z4.a.f6979g;
            C1493b bVar3 = C1493b.f15776c;
            bVar.getClass();
            int i8 = fVar2.f2712d;
            d dVar2 = new d(i8, aVar2, (u4.d) null, bVar3);
            aVar2.getClass();
            if (!E.b(aVar2)) {
                obj = g8.e(dVar2, true);
            } else {
                obj = g8.f(i8);
            }
            if (g(obj, fVar) && (y9 = this.f16289U) != null) {
                y9.writeAndFlush(dVar2, y9.voidPromise());
            }
        }
    }

    public final boolean g(Object obj, f fVar) {
        if (obj != fVar) {
            G g8 = this.f701Y;
            if (obj == null) {
                g8.f(fVar.f704Z.f2712d);
            } else {
                g8.e(obj, true);
            }
            return false;
        } else if (fVar.f705a0 == this.f703a0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean i(Y y8, f fVar) {
        int i = this.f702Z;
        c cVar = this.f700X;
        C1102b bVar = cVar.e;
        if (bVar.f12735Z >= i) {
            f697b0.error("Received more QoS 1 and/or 2 PUBLISH messages ({}) than allowed by receive maximum ({})", fVar.f704Z, Integer.valueOf(i));
            s.l(y8.channel(), C1607b.RECEIVE_MAXIMUM_EXCEEDED, "Received more QoS 1 and/or 2 PUBLISH messages than allowed by receive maximum");
            return false;
        }
        cVar.a(fVar);
        if (bVar.f12735Z != 0 || !fVar.E()) {
            bVar.b(fVar);
            return true;
        }
        cVar.f691a.d(fVar);
        return true;
    }
}
