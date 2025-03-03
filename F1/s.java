package f1;

import M0.C;
import M0.C0137z;
import M0.D;
import P0.z;
import R0.A;
import Z1.c;
import a1.C0410a;
import android.net.Uri;
import h1.C1031B;
import h1.C1035a;
import h1.C1059z;
import java.util.ArrayList;
import javax.net.SocketFactory;
import l1.e;
import l1.n;

public final class s extends C1035a {

    /* renamed from: h  reason: collision with root package name */
    public final C0410a f11607h;
    public final String i = "AndroidXMedia3/1.5.0";

    /* renamed from: j  reason: collision with root package name */
    public final Uri f11608j;

    /* renamed from: k  reason: collision with root package name */
    public final SocketFactory f11609k;

    /* renamed from: l  reason: collision with root package name */
    public long f11610l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11611m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11612n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11613o;

    /* renamed from: p  reason: collision with root package name */
    public C f11614p;

    static {
        D.a("media3.exoplayer.rtsp");
    }

    public s(C c8, C0410a aVar, SocketFactory socketFactory) {
        this.f11614p = c8;
        this.f11607h = aVar;
        C0137z zVar = c8.f2786b;
        zVar.getClass();
        this.f11608j = zVar.f3060a;
        this.f11609k = socketFactory;
        this.f11610l = -9223372036854775807L;
        this.f11613o = true;
    }

    public final C1059z b(C1031B b8, e eVar, long j7) {
        c cVar = new c(20, (Object) this);
        return new p(eVar, this.f11607h, this.f11608j, cVar, this.i, this.f11609k);
    }

    public final synchronized C h() {
        return this.f11614p;
    }

    public final void j() {
    }

    public final void l(A a8) {
        t();
    }

    public final void n(C1059z zVar) {
        p pVar = (p) zVar;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = pVar.f11589Y;
            if (i8 < arrayList.size()) {
                o oVar = (o) arrayList.get(i8);
                if (!oVar.e) {
                    oVar.f11581b.e((n) null);
                    oVar.f11582c.C();
                    oVar.e = true;
                }
                i8++;
            } else {
                z.g(pVar.f11588X);
                pVar.f11602l0 = true;
                return;
            }
        }
    }

    public final void p() {
    }

    public final synchronized void s(C c8) {
        this.f11614p = c8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [f1.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r7 = this;
            h1.c0 r6 = new h1.c0
            long r1 = r7.f11610l
            boolean r3 = r7.f11611m
            boolean r4 = r7.f11612n
            M0.C r5 = r7.h()
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            boolean r0 = r7.f11613o
            if (r0 == 0) goto L_0x001b
            f1.q r0 = new f1.q
            r1 = 0
            r0.<init>(r6, r1)
            r6 = r0
        L_0x001b:
            r7.m(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.s.t():void");
    }
}
