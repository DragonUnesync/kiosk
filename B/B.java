package B;

import D.Y;
import D.Z;
import G7.f;
import H3.L;
import I7.a;
import J7.e;
import K1.i;
import L3.b;
import M.l;
import M0.F;
import M0.H;
import M0.K;
import M0.O;
import M0.c0;
import P0.c;
import P0.h;
import P0.r;
import Q0.s;
import S7.d;
import S7.p;
import T0.C0214f;
import T0.C0229v;
import U.t;
import U7.q;
import a0.j;
import a0.k;
import com.samsung.android.knox.EnterpriseDeviceManager;
import g1.g;
import h1.C1053t;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p1.C1332b;
import p1.G;

public final /* synthetic */ class B implements Y, a, k, c, q, h, s, G.a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f140U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f141V;

    public /* synthetic */ B(int i, Object obj) {
        this.f140U = i;
        this.f141V = obj;
    }

    private final void f(Z z) {
        b0 b0Var = (b0) this.f141V;
        synchronized (b0Var.f216U) {
            b0Var.f218W++;
        }
        b0Var.f(z);
    }

    public void a(Object obj) {
        switch (this.f140U) {
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                ((O) obj).C((F) this.f141V);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                ((O) obj).h((c0) this.f141V);
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                ((O) obj).d((O0.c) this.f141V);
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                ((O) obj).C(((C0229v) this.f141V).f4905U.f4921J0);
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                ((O) obj).D((H) this.f141V);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                ((O) obj).n((List) this.f141V);
                return;
            case 23:
                ((U0.h) obj).f5358n = (K) this.f141V;
                return;
            case 24:
                U0.h hVar = (U0.h) obj;
                int i = hVar.f5368x;
                C0214f fVar = (C0214f) this.f141V;
                hVar.f5368x = i + fVar.f4823g;
                hVar.f5369y += fVar.e;
                return;
            case 25:
                U0.h hVar2 = (U0.h) obj;
                hVar2.getClass();
                hVar2.f5366v = ((g) this.f141V).f11885a;
                return;
            default:
                ((U0.h) obj).getClass();
                return;
        }
    }

    public void accept(Object obj) {
        M1.a aVar = (M1.a) obj;
        switch (this.f140U) {
            case 9:
                M1.h hVar = (M1.h) this.f141V;
                hVar.getClass();
                M1.g gVar = new M1.g(aVar.f3065b, i.t(aVar.f3064a, aVar.f3066c));
                hVar.f3079c.add(gVar);
                long j7 = hVar.f3084j;
                if (j7 == -9223372036854775807L || aVar.f3065b >= j7) {
                    hVar.b(gVar);
                    return;
                }
                return;
            default:
                ((L) this.f141V).a(aVar);
                return;
        }
    }

    public b apply(Object obj) {
        return (b) ((D6.a) this.f141V).a(obj);
    }

    public void b(long j7, r rVar) {
        C1332b.e(j7, rVar, (G[]) ((q0) this.f141V).f301W);
    }

    public Object c(J7.c cVar) {
        return (e) this.f141V;
    }

    public Object d() {
        long j7;
        Path path = FileRetargetClass.toPath((File) this.f141V);
        LinkOption[] linkOptionArr = f.f1755a;
        Objects.requireNonNull(path, "path");
        if (f.b(path, new LinkOption[0])) {
            if (Files.isDirectory(path, new LinkOption[0])) {
                G7.c cVar = new G7.c(new G7.b());
                Files.walkFileTree(path, cVar);
                j7 = cVar.f1748V.f1744a.f1743a;
            } else {
                j7 = Files.size(path);
            }
            return Long.valueOf(j7);
        }
        throw new IllegalArgumentException("File system element for parameter 'path' does not exist: '" + path + "'");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(D.Z r8) {
        /*
            r7 = this;
            int r0 = r7.f140U
            switch(r0) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.f141V
            T.a r0 = (T.a) r0
            java.lang.Object r1 = r0.f4596a
            monitor-enter(r1)
            boolean r2 = r0.f4599d     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0035
        L_0x0012:
            r8 = move-exception
            goto L_0x0036
        L_0x0014:
            B.W r8 = r8.F()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0034
            android.media.Image r8 = r8.g()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0034
            boolean r2 = r0.f4601g     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x002f
            long r2 = r0.f4602h     // Catch:{ all -> 0x0012 }
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002f
            I.a.s(r8, r2)     // Catch:{ all -> 0x0012 }
        L_0x002f:
            android.media.ImageWriter r0 = r0.f4597b     // Catch:{ all -> 0x0012 }
            r0.queueInputImage(r8)     // Catch:{ all -> 0x0012 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
        L_0x0035:
            return
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r8
        L_0x0038:
            java.lang.Object r0 = r7.f141V
            A1.d r0 = (A1.d) r0
            r0.getClass()
            B.W r8 = r8.o()     // Catch:{ IllegalStateException -> 0x005e }
            if (r8 == 0) goto L_0x005e
            g7.l.a()     // Catch:{ IllegalStateException -> 0x005e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x005e }
            java.lang.String r1 = "Discarding ImageProxy which was inadvertently acquired: "
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x005e }
            r0.append(r8)     // Catch:{ IllegalStateException -> 0x005e }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x005e }
            java.lang.String r1 = "CaptureNode"
            F.h.I(r1, r0)     // Catch:{ IllegalStateException -> 0x005e }
            r8.close()     // Catch:{ IllegalStateException -> 0x005e }
        L_0x005e:
            return
        L_0x005f:
            r7.f(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.B.e(D.Z):void");
    }

    public Object h(j jVar) {
        switch (this.f140U) {
            case 7:
                M.j jVar2 = (M.j) this.f141V;
                jVar2.f2756p = jVar;
                return "SettableFuture hashCode: " + jVar2.hashCode();
            case 8:
                ((l) this.f141V).f2782e0 = jVar;
                return "SurfaceOutputImpl close future complete";
            default:
                ((t) this.f141V).f5312k.set(jVar);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    public /* synthetic */ void n0(p pVar, int i) {
    }

    public void r0(p pVar, int i) {
        boolean z = pVar instanceof S7.f;
        StringBuilder sb = (StringBuilder) this.f141V;
        if (z) {
            sb.append(((S7.f) pVar).C());
        } else if (pVar instanceof S7.e) {
            sb.append(((S7.e) pVar).C());
        } else if (pVar instanceof d) {
            sb.append(((d) pVar).C());
        }
    }

    public /* synthetic */ B(U0.a aVar, C1053t tVar, g gVar, IOException iOException, boolean z) {
        this.f140U = 25;
        this.f141V = gVar;
    }

    public /* synthetic */ B(U0.a aVar, Object obj, int i) {
        this.f140U = i;
        this.f141V = obj;
    }

    public /* synthetic */ B(U0.a aVar, Object obj, long j7) {
        this.f140U = 26;
        this.f141V = obj;
    }
}
