package F4;

import C4.a;
import C4.d;
import D2.j;
import G5.s;
import T5.Y;
import V1.G;
import b5.C0532a;
import b5.b;
import c5.C0618a;
import d5.C0644a;
import de.ozerov.fully.K2;
import i5.p;
import java.io.IOException;
import l4.C1175a;
import l4.C1176b;
import m4.C1214b;
import u5.C1496c;
import x4.g;
import x5.C1607b;

public final class c extends g implements Runnable {

    /* renamed from: e0  reason: collision with root package name */
    public static final C1175a f1537e0 = C1176b.a(c.class);

    /* renamed from: f0  reason: collision with root package name */
    public static final j f1538f0 = new j(4, (Object) new d(2));

    /* renamed from: W  reason: collision with root package name */
    public final C1214b f1539W;

    /* renamed from: X  reason: collision with root package name */
    public final a f1540X;

    /* renamed from: Y  reason: collision with root package name */
    public final K2 f1541Y = new K2(14);

    /* renamed from: Z  reason: collision with root package name */
    public final Z1.c f1542Z;

    /* renamed from: a0  reason: collision with root package name */
    public final G f1543a0 = new G(f1538f0);

    /* renamed from: b0  reason: collision with root package name */
    public a f1544b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f1545c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1546d0;

    public c(C1214b bVar, a aVar) {
        this.f1539W = bVar;
        this.f1540X = aVar;
        this.f1542Z = new Z1.c(65526, 65535);
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [java.util.List, java.lang.Object, i5.p] */
    public final void channelRead(Y y8, Object obj) {
        boolean z = obj instanceof C0618a;
        G g8 = this.f1543a0;
        if (z) {
            C0618a aVar = (C0618a) obj;
            a aVar2 = (a) g8.f(aVar.e);
            if (aVar2 == null) {
                s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "Unknown packet identifier for SUBACK");
            } else if (!(aVar2 instanceof a)) {
                s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "SUBACK received for an UNSUBSCRIBE");
            } else {
                p pVar = aVar2.f1533X.f8684d;
                pVar.size();
                ? r62 = aVar.f2708f;
                r62.size();
                int i = 0;
                while (i < r62.size() && ((C1496c) r62.get(i)).a()) {
                    i++;
                }
                this.f1540X.getClass();
                pVar.size();
                r62.size();
                if (pVar.size() <= 0) {
                    this.f1541Y.R(aVar2);
                    this.f1542Z.x(aVar2.f1532W);
                    run();
                    return;
                }
                pVar.get(0).getClass();
                throw new ClassCastException();
            }
        } else if (!(obj instanceof C0644a)) {
            y8.fireChannelRead(obj);
        } else if (((a) g8.f(((C0644a) obj).e)) == null) {
            s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "Unknown packet identifier for UNSUBACK");
        } else {
            s.l(y8.channel(), C1607b.PROTOCOL_ERROR, "UNSUBACK received for a SUBSCRIBE");
        }
    }

    public final void exceptionCaught(Y y8, Throwable th) {
        a aVar;
        if ((th instanceof IOException) || (aVar = this.f1545c0) == null) {
            y8.fireExceptionCaught(th);
            return;
        }
        this.f1541Y.R(aVar);
        this.f1542Z.x(this.f1545c0.f1532W);
        this.f1543a0.f(this.f1545c0.f1532W);
        this.f1545c0.getClass();
        a aVar2 = this.f1545c0;
        if (aVar2 instanceof a) {
            b bVar = aVar2.f1533X;
            D5.a aVar3 = D5.a.GRANTED_QOS_0;
            this.f1540X.getClass();
            p pVar = bVar.f8684d;
            pVar.size();
            if (pVar.size() > 0) {
                pVar.get(0).getClass();
                throw new ClassCastException();
            }
        }
        this.f1545c0 = null;
    }

    public final void run() {
        J1.d dVar;
        Y y8 = this.f16289U;
        if (y8 != null) {
            a aVar = this.f1544b0;
            int i = 0;
            while (aVar != null) {
                G g8 = this.f1543a0;
                if (g8.f5714a >= 10) {
                    break;
                }
                int i8 = -1;
                if (aVar.f1532W == 0) {
                    Z1.c cVar = this.f1542Z;
                    J1.d dVar2 = (J1.d) cVar.f6955V;
                    int i9 = dVar2.f2351U;
                    int i10 = dVar2.f2352V;
                    if (i9 == i10) {
                        i9 = -1;
                    } else {
                        int i11 = i9 + 1;
                        dVar2.f2351U = i11;
                        if (i11 == i10 && (dVar = (J1.d) dVar2.f2353W) != null) {
                            cVar.f6955V = dVar;
                        }
                    }
                    if (i9 == -1) {
                        f1537e0.error("No Packet Identifier available for (UN)SUBSCRIBE. This must not happen and is a bug.");
                        return;
                    }
                    aVar.f1532W = i9;
                }
                g8.e(aVar, true);
                if (this.f1544b0 instanceof a) {
                    if (this.f1546d0) {
                        i8 = aVar.f1534Y;
                    }
                    C0532a aVar2 = new C0532a(aVar.f1533X, aVar.f1532W, i8);
                    this.f1545c0 = aVar;
                    y8.write(aVar2, y8.voidPromise());
                    this.f1545c0 = null;
                    i++;
                    aVar = (a) ((I2.b) aVar.f2258V);
                    this.f1544b0 = aVar;
                } else {
                    throw new ClassCastException();
                }
            }
            if (i > 0) {
                y8.flush();
            }
        }
    }
}
