package A;

import B.B;
import B.C0010k;
import B.C0019u;
import B.C0020v;
import B.j0;
import B.p0;
import B.s0;
import B.t0;
import B3.q;
import C.d;
import D.M;
import D.N;
import D.Y;
import D.Z;
import D2.o;
import L3.b;
import M0.r;
import O.f;
import P0.c;
import P0.h;
import P0.i;
import P5.C0144g;
import U.t;
import Y0.e;
import Z2.a;
import a0.j;
import a0.k;
import android.app.Service;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0692f;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C2;
import de.ozerov.fully.D;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.O4;
import de.ozerov.fully.U4;
import de.ozerov.fully.W1;
import h1.C1031B;
import h1.G;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k1.m;
import u.C1449I;

public final /* synthetic */ class g implements k, Y, s0, C2, i, h, D, a, c, m, G.a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f18U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f19V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f20W;

    public /* synthetic */ g(Object obj, int i, Object obj2) {
        this.f18U = i;
        this.f19V = obj;
        this.f20W = obj2;
    }

    public void a(Object obj) {
        U0.h hVar = (U0.h) obj;
        hVar.getClass();
        U0.a aVar = (U0.a) this.f19V;
        C1031B b8 = aVar.f5317d;
        if (b8 != null) {
            g1.g gVar = (g1.g) this.f20W;
            r rVar = (r) gVar.f11889f;
            rVar.getClass();
            b8.getClass();
            o oVar = new o((Object) rVar, gVar.f11887c, hVar.f5348b.d(aVar.f5315b, b8), 6);
            int i = gVar.f11886b;
            if (i != 0) {
                if (i == 1) {
                    hVar.f5360p = oVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        hVar.f5361q = oVar;
                        return;
                    }
                    return;
                }
            }
            hVar.f5359o = oVar;
        }
    }

    public void accept(Object obj) {
        e eVar = (e) this.f19V;
        ((G) obj).s(eVar.f6315a, eVar.f6316b, (g1.g) this.f20W);
    }

    public b apply(Object obj) {
        switch (this.f18U) {
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                Void voidR = (Void) obj;
                C1449I i = (C1449I) this.f19V;
                i.a();
                ((p0) this.f20W).a();
                return i.l();
            default:
                List list = (List) obj;
                u.Y y8 = (u.Y) this.f19V;
                y8.getClass();
                F.h.j("SyncCaptureSessionBase", "[" + y8 + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new G.k(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (!list.contains((Object) null)) {
                    return G.i.c(list);
                }
                return new G.k(1, new M("Surface closed", (N) ((ArrayList) this.f20W).get(list.indexOf((Object) null))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: D2.o} */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v31, types: [M0.r, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:378:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Object r28, M0.C0128p r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r29
            r2 = 1
            r3 = 5
            java.lang.Object r4 = r1.f19V
            U0.d r4 = (U0.d) r4
            java.lang.Object r5 = r1.f20W
            M0.Q r5 = (M0.Q) r5
            r12 = r28
            U0.h r12 = (U0.h) r12
            android.util.SparseArray r4 = r4.f5328Y
            android.util.SparseArray r13 = new android.util.SparseArray
            android.util.SparseBooleanArray r6 = r0.f2977a
            int r6 = r6.size()
            r13.<init>(r6)
            r14 = 0
            r6 = 0
        L_0x0021:
            android.util.SparseBooleanArray r7 = r0.f2977a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x003b
            int r7 = r0.a(r6)
            java.lang.Object r8 = r4.get(r7)
            U0.a r8 = (U0.a) r8
            r8.getClass()
            r13.append(r7, r8)
            int r6 = r6 + r2
            goto L_0x0021
        L_0x003b:
            r12.getClass()
            android.util.SparseBooleanArray r4 = r0.f2977a
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0048
            goto L_0x0637
        L_0x0048:
            r4 = 0
        L_0x0049:
            android.util.SparseBooleanArray r6 = r0.f2977a
            int r6 = r6.size()
            r15 = 11
            if (r4 >= r6) goto L_0x00cc
            int r6 = r0.a(r4)
            java.lang.Object r7 = r13.get(r6)
            U0.a r7 = (U0.a) r7
            r7.getClass()
            if (r6 != 0) goto L_0x00ba
            U0.f r8 = r12.f5348b
            monitor-enter(r8)
            U0.h r6 = r8.f5343d     // Catch:{ all -> 0x0095 }
            r6.getClass()     // Catch:{ all -> 0x0095 }
            M0.X r6 = r8.e     // Catch:{ all -> 0x0095 }
            M0.X r9 = r7.f5315b     // Catch:{ all -> 0x0095 }
            r8.e = r9     // Catch:{ all -> 0x0095 }
            java.util.HashMap r9 = r8.f5342c     // Catch:{ all -> 0x0095 }
            java.util.Collection r9 = r9.values()     // Catch:{ all -> 0x0095 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0095 }
        L_0x007a:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0095 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0095 }
            U0.e r10 = (U0.e) r10     // Catch:{ all -> 0x0095 }
            M0.X r11 = r8.e     // Catch:{ all -> 0x0095 }
            boolean r11 = r10.b(r6, r11)     // Catch:{ all -> 0x0095 }
            if (r11 == 0) goto L_0x0097
            boolean r11 = r10.a(r7)     // Catch:{ all -> 0x0095 }
            if (r11 == 0) goto L_0x007a
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            goto L_0x00b8
        L_0x0097:
            r9.remove()     // Catch:{ all -> 0x0095 }
            boolean r11 = r10.e     // Catch:{ all -> 0x0095 }
            if (r11 == 0) goto L_0x007a
            java.lang.String r11 = r10.f5333a     // Catch:{ all -> 0x0095 }
            java.lang.String r15 = r8.f5344f     // Catch:{ all -> 0x0095 }
            boolean r11 = r11.equals(r15)     // Catch:{ all -> 0x0095 }
            if (r11 == 0) goto L_0x00ab
            r8.a(r10)     // Catch:{ all -> 0x0095 }
        L_0x00ab:
            U0.h r11 = r8.f5343d     // Catch:{ all -> 0x0095 }
            java.lang.String r10 = r10.f5333a     // Catch:{ all -> 0x0095 }
            r11.d(r7, r10)     // Catch:{ all -> 0x0095 }
            goto L_0x007a
        L_0x00b3:
            r8.e(r7)     // Catch:{ all -> 0x0095 }
            monitor-exit(r8)
            goto L_0x00c9
        L_0x00b8:
            monitor-exit(r8)     // Catch:{ all -> 0x0095 }
            throw r0
        L_0x00ba:
            if (r6 != r15) goto L_0x00c4
            U0.f r6 = r12.f5348b
            int r8 = r12.f5355k
            r6.g(r7, r8)
            goto L_0x00c9
        L_0x00c4:
            U0.f r6 = r12.f5348b
            r6.f(r7)
        L_0x00c9:
            int r4 = r4 + r2
            goto L_0x0049
        L_0x00cc:
            long r16 = android.os.SystemClock.elapsedRealtime()
            android.util.SparseBooleanArray r4 = r0.f2977a
            boolean r4 = r4.get(r14)
            if (r4 == 0) goto L_0x00ec
            java.lang.Object r4 = r13.get(r14)
            U0.a r4 = (U0.a) r4
            r4.getClass()
            android.media.metrics.PlaybackMetrics$Builder r6 = r12.f5354j
            if (r6 == 0) goto L_0x00ec
            M0.X r6 = r4.f5315b
            h1.B r4 = r4.f5317d
            r12.c(r6, r4)
        L_0x00ec:
            android.util.SparseBooleanArray r4 = r0.f2977a
            r11 = 2
            boolean r4 = r4.get(r11)
            if (r4 == 0) goto L_0x0165
            android.media.metrics.PlaybackMetrics$Builder r4 = r12.f5354j
            if (r4 == 0) goto L_0x0165
            r4 = r5
            T0.y r4 = (T0.C0232y) r4
            M0.e0 r4 = r4.A()
            H3.O r4 = r4.f2941a
            H3.M r4 = r4.listIterator(r14)
        L_0x0106:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x012d
            java.lang.Object r6 = r4.next()
            M0.d0 r6 = (M0.d0) r6
            r7 = 0
        L_0x0113:
            int r15 = r6.f2934a
            if (r7 >= r15) goto L_0x012a
            boolean[] r15 = r6.e
            boolean r15 = r15[r7]
            if (r15 == 0) goto L_0x0128
            M0.Y r15 = r6.f2935b
            M0.r[] r15 = r15.f2888d
            r15 = r15[r7]
            M0.n r15 = r15.f3040r
            if (r15 == 0) goto L_0x0128
            goto L_0x012e
        L_0x0128:
            int r7 = r7 + r2
            goto L_0x0113
        L_0x012a:
            r15 = 11
            goto L_0x0106
        L_0x012d:
            r15 = 0
        L_0x012e:
            if (r15 == 0) goto L_0x0165
            android.media.metrics.PlaybackMetrics$Builder r4 = r12.f5354j
            android.media.metrics.PlaybackMetrics$Builder r4 = P0.n.j(r4)
            r6 = 0
        L_0x0137:
            int r7 = r15.f2976X
            if (r6 >= r7) goto L_0x0161
            M0.m[] r7 = r15.f2973U
            r7 = r7[r6]
            java.util.UUID r7 = r7.f2969V
            java.util.UUID r10 = M0.C0119g.f2946d
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x014b
            r6 = 3
            goto L_0x0162
        L_0x014b:
            java.util.UUID r10 = M0.C0119g.e
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x0155
            r6 = 2
            goto L_0x0162
        L_0x0155:
            java.util.UUID r10 = M0.C0119g.f2945c
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x015f
            r6 = 6
            goto L_0x0162
        L_0x015f:
            int r6 = r6 + r2
            goto L_0x0137
        L_0x0161:
            r6 = 1
        L_0x0162:
            r4.setDrmType(r6)
        L_0x0165:
            android.util.SparseBooleanArray r4 = r0.f2977a
            r6 = 1011(0x3f3, float:1.417E-42)
            boolean r4 = r4.get(r6)
            if (r4 == 0) goto L_0x0174
            int r4 = r12.z
            int r4 = r4 + r2
            r12.z = r4
        L_0x0174:
            M0.K r4 = r12.f5358n
            r15 = 4
            if (r4 != 0) goto L_0x0183
            r15 = 13
            r21 = 6
            r22 = 7
            r23 = 9
            goto L_0x03ef
        L_0x0183:
            int r11 = r12.f5366v
            if (r11 != r15) goto L_0x0189
            r11 = 1
            goto L_0x018a
        L_0x0189:
            r11 = 0
        L_0x018a:
            int r7 = r4.f2843U
            r15 = 1001(0x3e9, float:1.403E-42)
            if (r7 != r15) goto L_0x01a1
            M0.k r7 = new M0.k
            r11 = 20
            r7.<init>(r11, r14, r3)
        L_0x0197:
            r15 = 13
            r21 = 6
            r22 = 7
            r23 = 9
            goto L_0x03c4
        L_0x01a1:
            boolean r15 = r4 instanceof T0.C0220l
            if (r15 == 0) goto L_0x01b2
            r15 = r4
            T0.l r15 = (T0.C0220l) r15
            int r6 = r15.f4864W
            if (r6 != r2) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            int r15 = r15.f4868a0
            goto L_0x01b4
        L_0x01b2:
            r6 = 0
            r15 = 0
        L_0x01b4:
            java.lang.Throwable r8 = r4.getCause()
            r8.getClass()
            boolean r9 = r8 instanceof java.io.IOException
            r25 = 25
            r26 = 26
            r10 = 27
            r2 = 23
            if (r9 == 0) goto L_0x0315
            boolean r6 = r8 instanceof R0.v
            if (r6 == 0) goto L_0x01d5
            R0.v r8 = (R0.v) r8
            M0.k r7 = new M0.k
            int r2 = r8.f4313X
            r7.<init>(r3, r2, r3)
            goto L_0x0197
        L_0x01d5:
            boolean r6 = r8 instanceof R0.u
            if (r6 != 0) goto L_0x01dd
            boolean r6 = r8 instanceof M0.J
            if (r6 == 0) goto L_0x01e5
        L_0x01dd:
            r2 = 9
            r6 = 8
            r9 = 6
            r10 = 7
            goto L_0x0307
        L_0x01e5:
            boolean r6 = r8 instanceof R0.t
            if (r6 != 0) goto L_0x01ed
            boolean r9 = r8 instanceof R0.B
            if (r9 == 0) goto L_0x01f1
        L_0x01ed:
            r2 = 9
            goto L_0x02ba
        L_0x01f1:
            r6 = 1002(0x3ea, float:1.404E-42)
            if (r7 != r6) goto L_0x01fd
            M0.k r7 = new M0.k
            r2 = 21
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x01fd:
            boolean r6 = r8 instanceof Y0.c
            if (r6 == 0) goto L_0x027c
            java.lang.Throwable r6 = r8.getCause()
            r6.getClass()
            boolean r7 = r6 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r7 == 0) goto L_0x0230
            android.media.MediaDrm$MediaDrmStateException r6 = (android.media.MediaDrm.MediaDrmStateException) r6
            java.lang.String r2 = r6.getDiagnosticInfo()
            int r2 = P0.z.w(r2)
            int r6 = P0.z.v(r2)
            switch(r6) {
                case 6002: goto L_0x0227;
                case 6003: goto L_0x0224;
                case 6004: goto L_0x0221;
                case 6005: goto L_0x021e;
                default: goto L_0x021d;
            }
        L_0x021d:
            goto L_0x0229
        L_0x021e:
            r10 = 26
            goto L_0x0229
        L_0x0221:
            r10 = 25
            goto L_0x0229
        L_0x0224:
            r10 = 28
            goto L_0x0229
        L_0x0227:
            r10 = 24
        L_0x0229:
            M0.k r7 = new M0.k
            r7.<init>(r10, r2, r3)
            goto L_0x0197
        L_0x0230:
            int r7 = P0.z.f3748a
            if (r7 < r2) goto L_0x0241
            boolean r7 = B3.a.w(r6)
            if (r7 == 0) goto L_0x0241
            M0.k r7 = new M0.k
            r7.<init>(r10, r14, r3)
            goto L_0x0197
        L_0x0241:
            boolean r7 = r6 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x024e
            M0.k r7 = new M0.k
            r9 = 24
            r7.<init>(r9, r14, r3)
            goto L_0x0197
        L_0x024e:
            boolean r7 = r6 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x025b
            M0.k r7 = new M0.k
            r2 = 29
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x025b:
            boolean r7 = r6 instanceof Y0.j
            if (r7 == 0) goto L_0x0266
            M0.k r7 = new M0.k
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x0266:
            boolean r2 = r6 instanceof Y0.a
            if (r2 == 0) goto L_0x0273
            M0.k r7 = new M0.k
            r11 = 28
            r7.<init>(r11, r14, r3)
            goto L_0x0197
        L_0x0273:
            M0.k r7 = new M0.k
            r2 = 30
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x027c:
            boolean r2 = r8 instanceof R0.q
            if (r2 == 0) goto L_0x02b1
            java.lang.Throwable r2 = r8.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x02b1
            java.lang.Throwable r2 = r8.getCause()
            r2.getClass()
            java.lang.Throwable r2 = r2.getCause()
            boolean r6 = r2 instanceof android.system.ErrnoException
            if (r6 == 0) goto L_0x02a8
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r6 = android.system.OsConstants.EACCES
            if (r2 != r6) goto L_0x02a8
            M0.k r7 = new M0.k
            r2 = 32
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x02a8:
            M0.k r7 = new M0.k
            r2 = 31
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x02b1:
            M0.k r7 = new M0.k
            r2 = 9
            r7.<init>(r2, r14, r3)
            goto L_0x0197
        L_0x02ba:
            android.content.Context r7 = r12.f5347a
            P0.q r7 = P0.q.j(r7)
            int r7 = r7.k()
            r9 = 1
            if (r7 != r9) goto L_0x02cf
            M0.k r7 = new M0.k
            r6 = 3
            r7.<init>(r6, r14, r3)
            goto L_0x0197
        L_0x02cf:
            java.lang.Throwable r7 = r8.getCause()
            boolean r9 = r7 instanceof java.net.UnknownHostException
            if (r9 == 0) goto L_0x02df
            M0.k r7 = new M0.k
            r9 = 6
            r7.<init>(r9, r14, r3)
            goto L_0x0197
        L_0x02df:
            r9 = 6
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x02ec
            M0.k r7 = new M0.k
            r10 = 7
            r7.<init>(r10, r14, r3)
            goto L_0x0197
        L_0x02ec:
            r10 = 7
            if (r6 == 0) goto L_0x02fe
            R0.t r8 = (R0.t) r8
            int r6 = r8.f4312W
            r7 = 1
            if (r6 != r7) goto L_0x02fe
            M0.k r7 = new M0.k
            r6 = 4
            r7.<init>(r6, r14, r3)
            goto L_0x0197
        L_0x02fe:
            M0.k r7 = new M0.k
            r6 = 8
            r7.<init>(r6, r14, r3)
            goto L_0x0197
        L_0x0307:
            M0.k r7 = new M0.k
            if (r11 == 0) goto L_0x030e
            r8 = 10
            goto L_0x0310
        L_0x030e:
            r8 = 11
        L_0x0310:
            r7.<init>(r8, r14, r3)
            goto L_0x0197
        L_0x0315:
            r7 = 8
            r9 = 24
            r11 = 28
            r21 = 6
            r22 = 7
            r23 = 9
            if (r6 == 0) goto L_0x0333
            if (r15 == 0) goto L_0x0328
            r7 = 1
            if (r15 != r7) goto L_0x0333
        L_0x0328:
            M0.k r7 = new M0.k
            r2 = 35
            r7.<init>(r2, r14, r3)
        L_0x032f:
            r15 = 13
            goto L_0x03c4
        L_0x0333:
            if (r6 == 0) goto L_0x0340
            r7 = 3
            if (r15 != r7) goto L_0x0340
            M0.k r7 = new M0.k
            r2 = 15
            r7.<init>(r2, r14, r3)
            goto L_0x032f
        L_0x0340:
            if (r6 == 0) goto L_0x034b
            r6 = 2
            if (r15 != r6) goto L_0x034b
            M0.k r7 = new M0.k
            r7.<init>(r2, r14, r3)
            goto L_0x032f
        L_0x034b:
            boolean r2 = r8 instanceof c1.o
            if (r2 == 0) goto L_0x035f
            c1.o r8 = (c1.o) r8
            java.lang.String r2 = r8.f8807X
            int r2 = P0.z.w(r2)
            M0.k r7 = new M0.k
            r15 = 13
            r7.<init>(r15, r2, r3)
            goto L_0x03c4
        L_0x035f:
            r15 = 13
            boolean r2 = r8 instanceof c1.m
            r6 = 14
            if (r2 == 0) goto L_0x0371
            c1.m r8 = (c1.m) r8
            M0.k r7 = new M0.k
            int r2 = r8.f8796U
            r7.<init>(r6, r2, r3)
            goto L_0x03c4
        L_0x0371:
            boolean r2 = r8 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x037b
            M0.k r7 = new M0.k
            r7.<init>(r6, r14, r3)
            goto L_0x03c4
        L_0x037b:
            boolean r2 = r8 instanceof V0.l
            if (r2 == 0) goto L_0x038b
            V0.l r8 = (V0.l) r8
            M0.k r7 = new M0.k
            r2 = 17
            int r6 = r8.f5535U
            r7.<init>(r2, r6, r3)
            goto L_0x03c4
        L_0x038b:
            boolean r2 = r8 instanceof V0.m
            if (r2 == 0) goto L_0x039b
            V0.m r8 = (V0.m) r8
            M0.k r7 = new M0.k
            r2 = 18
            int r6 = r8.f5537U
            r7.<init>(r2, r6, r3)
            goto L_0x03c4
        L_0x039b:
            boolean r2 = r8 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x03bd
            android.media.MediaCodec$CryptoException r8 = (android.media.MediaCodec.CryptoException) r8
            int r2 = r8.getErrorCode()
            int r6 = P0.z.v(r2)
            switch(r6) {
                case 6002: goto L_0x03b7;
                case 6003: goto L_0x03b5;
                case 6004: goto L_0x03b2;
                case 6005: goto L_0x03af;
                default: goto L_0x03ac;
            }
        L_0x03ac:
            r9 = 27
            goto L_0x03b7
        L_0x03af:
            r9 = 26
            goto L_0x03b7
        L_0x03b2:
            r9 = 25
            goto L_0x03b7
        L_0x03b5:
            r9 = 28
        L_0x03b7:
            M0.k r7 = new M0.k
            r7.<init>(r9, r2, r3)
            goto L_0x03c4
        L_0x03bd:
            M0.k r7 = new M0.k
            r2 = 22
            r7.<init>(r2, r14, r3)
        L_0x03c4:
            android.media.metrics.PlaybackSession r2 = r12.f5349c
            android.media.metrics.PlaybackErrorEvent$Builder r6 = P0.n.g()
            long r8 = r12.f5350d
            long r8 = r16 - r8
            android.media.metrics.PlaybackErrorEvent$Builder r6 = r6.setTimeSinceCreatedMillis(r8)
            int r8 = r7.f2964b
            android.media.metrics.PlaybackErrorEvent$Builder r6 = r6.setErrorCode(r8)
            int r7 = r7.f2965c
            android.media.metrics.PlaybackErrorEvent$Builder r6 = r6.setSubErrorCode(r7)
            android.media.metrics.PlaybackErrorEvent$Builder r4 = r6.setException(r4)
            android.media.metrics.PlaybackErrorEvent r4 = r4.build()
            r2.reportPlaybackErrorEvent(r4)
            r2 = 1
            r12.f5346A = r2
            r4 = 0
            r12.f5358n = r4
        L_0x03ef:
            android.util.SparseBooleanArray r4 = r0.f2977a
            r11 = 2
            boolean r4 = r4.get(r11)
            if (r4 == 0) goto L_0x0413
            r4 = r5
            T0.y r4 = (T0.C0232y) r4
            M0.e0 r4 = r4.A()
            boolean r6 = r4.a(r11)
            boolean r19 = r4.a(r2)
            r2 = 3
            boolean r4 = r4.a(r2)
            if (r6 != 0) goto L_0x041d
            if (r19 != 0) goto L_0x041d
            if (r4 == 0) goto L_0x0413
            goto L_0x041d
        L_0x0413:
            r2 = 0
            r3 = 10
            r15 = 2
            r20 = 7
            r22 = 8
            goto L_0x04a2
        L_0x041d:
            if (r6 != 0) goto L_0x0452
            M0.r r6 = r12.f5362r
            int r7 = P0.z.f3748a
            r10 = 0
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0434
            r24 = r10
            r3 = 10
            r15 = 2
            r20 = 7
            r22 = 8
            goto L_0x045b
        L_0x0434:
            M0.r r6 = r12.f5362r
            if (r6 != 0) goto L_0x043b
            r18 = 1
            goto L_0x043d
        L_0x043b:
            r18 = 0
        L_0x043d:
            r12.f5362r = r10
            r7 = 1
            r20 = 7
            r6 = r12
            r22 = 8
            r8 = r16
            r24 = r10
            r3 = 10
            r15 = 2
            r11 = r18
            r6.e(r7, r8, r10, r11)
            goto L_0x045b
        L_0x0452:
            r3 = 10
            r15 = 2
            r20 = 7
            r22 = 8
            r24 = 0
        L_0x045b:
            if (r19 != 0) goto L_0x0482
            M0.r r6 = r12.f5363s
            int r7 = P0.z.f3748a
            r11 = r24
            boolean r6 = j$.util.Objects.equals(r6, r11)
            if (r6 == 0) goto L_0x046b
            r2 = r11
            goto L_0x0484
        L_0x046b:
            M0.r r6 = r12.f5363s
            if (r6 != 0) goto L_0x0472
            r18 = 1
            goto L_0x0474
        L_0x0472:
            r18 = 0
        L_0x0474:
            r12.f5363s = r11
            r7 = 0
            r6 = r12
            r8 = r16
            r10 = r11
            r2 = r11
            r11 = r18
            r6.e(r7, r8, r10, r11)
            goto L_0x0484
        L_0x0482:
            r2 = r24
        L_0x0484:
            if (r4 != 0) goto L_0x04a2
            M0.r r4 = r12.f5364t
            int r6 = P0.z.f3748a
            boolean r4 = j$.util.Objects.equals(r4, r2)
            if (r4 == 0) goto L_0x0491
            goto L_0x04a2
        L_0x0491:
            M0.r r4 = r12.f5364t
            if (r4 != 0) goto L_0x0497
            r11 = 1
            goto L_0x0498
        L_0x0497:
            r11 = 0
        L_0x0498:
            r12.f5364t = r2
            r7 = 2
            r6 = r12
            r8 = r16
            r10 = r2
            r6.e(r7, r8, r10, r11)
        L_0x04a2:
            D2.o r4 = r12.f5359o
            boolean r4 = r12.a(r4)
            if (r4 == 0) goto L_0x04d7
            D2.o r4 = r12.f5359o
            java.lang.Object r6 = r4.f1138W
            r10 = r6
            M0.r r10 = (M0.r) r10
            int r6 = r10.f3044v
            r7 = -1
            if (r6 == r7) goto L_0x04d7
            int r4 = r4.f1137V
            M0.r r6 = r12.f5362r
            int r7 = P0.z.f3748a
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x04c3
            goto L_0x04d5
        L_0x04c3:
            M0.r r6 = r12.f5362r
            if (r6 != 0) goto L_0x04cb
            if (r4 != 0) goto L_0x04cb
            r11 = 1
            goto L_0x04cc
        L_0x04cb:
            r11 = r4
        L_0x04cc:
            r12.f5362r = r10
            r7 = 1
            r6 = r12
            r8 = r16
            r6.e(r7, r8, r10, r11)
        L_0x04d5:
            r12.f5359o = r2
        L_0x04d7:
            D2.o r4 = r12.f5360p
            boolean r4 = r12.a(r4)
            if (r4 == 0) goto L_0x0507
            D2.o r4 = r12.f5360p
            java.lang.Object r6 = r4.f1138W
            r10 = r6
            M0.r r10 = (M0.r) r10
            int r4 = r4.f1137V
            M0.r r6 = r12.f5363s
            int r7 = P0.z.f3748a
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x04f3
            goto L_0x0505
        L_0x04f3:
            M0.r r6 = r12.f5363s
            if (r6 != 0) goto L_0x04fb
            if (r4 != 0) goto L_0x04fb
            r11 = 1
            goto L_0x04fc
        L_0x04fb:
            r11 = r4
        L_0x04fc:
            r12.f5363s = r10
            r7 = 0
            r6 = r12
            r8 = r16
            r6.e(r7, r8, r10, r11)
        L_0x0505:
            r12.f5360p = r2
        L_0x0507:
            D2.o r4 = r12.f5361q
            boolean r4 = r12.a(r4)
            if (r4 == 0) goto L_0x0537
            D2.o r4 = r12.f5361q
            java.lang.Object r6 = r4.f1138W
            r10 = r6
            M0.r r10 = (M0.r) r10
            int r4 = r4.f1137V
            M0.r r6 = r12.f5364t
            int r7 = P0.z.f3748a
            boolean r6 = j$.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0523
            goto L_0x0535
        L_0x0523:
            M0.r r6 = r12.f5364t
            if (r6 != 0) goto L_0x052b
            if (r4 != 0) goto L_0x052b
            r11 = 1
            goto L_0x052c
        L_0x052b:
            r11 = r4
        L_0x052c:
            r12.f5364t = r10
            r7 = 2
            r6 = r12
            r8 = r16
            r6.e(r7, r8, r10, r11)
        L_0x0535:
            r12.f5361q = r2
        L_0x0537:
            android.content.Context r2 = r12.f5347a
            P0.q r2 = P0.q.j(r2)
            int r2 = r2.k()
            switch(r2) {
                case 0: goto L_0x0558;
                case 1: goto L_0x0555;
                case 2: goto L_0x0553;
                case 3: goto L_0x0551;
                case 4: goto L_0x054f;
                case 5: goto L_0x054d;
                case 6: goto L_0x0544;
                case 7: goto L_0x054b;
                case 8: goto L_0x0544;
                case 9: goto L_0x0548;
                case 10: goto L_0x0546;
                default: goto L_0x0544;
            }
        L_0x0544:
            r11 = 1
            goto L_0x0559
        L_0x0546:
            r11 = 7
            goto L_0x0559
        L_0x0548:
            r11 = 8
            goto L_0x0559
        L_0x054b:
            r11 = 3
            goto L_0x0559
        L_0x054d:
            r11 = 6
            goto L_0x0559
        L_0x054f:
            r11 = 5
            goto L_0x0559
        L_0x0551:
            r11 = 4
            goto L_0x0559
        L_0x0553:
            r11 = 2
            goto L_0x0559
        L_0x0555:
            r11 = 9
            goto L_0x0559
        L_0x0558:
            r11 = 0
        L_0x0559:
            int r2 = r12.f5357m
            if (r11 == r2) goto L_0x0578
            r12.f5357m = r11
            android.media.metrics.PlaybackSession r2 = r12.f5349c
            android.media.metrics.NetworkEvent$Builder r4 = P0.n.c()
            android.media.metrics.NetworkEvent$Builder r4 = r4.setNetworkType(r11)
            long r6 = r12.f5350d
            long r6 = r16 - r6
            android.media.metrics.NetworkEvent$Builder r4 = r4.setTimeSinceCreatedMillis(r6)
            android.media.metrics.NetworkEvent r4 = r4.build()
            r2.reportNetworkEvent(r4)
        L_0x0578:
            T0.y r5 = (T0.C0232y) r5
            int r2 = r5.D()
            if (r2 == r15) goto L_0x0582
            r12.f5365u = r14
        L_0x0582:
            r5.Y()
            T0.X r2 = r5.f4945b1
            T0.l r2 = r2.f4753f
            if (r2 != 0) goto L_0x058e
            r12.f5367w = r14
            goto L_0x0599
        L_0x058e:
            android.util.SparseBooleanArray r2 = r0.f2977a
            boolean r2 = r2.get(r3)
            if (r2 == 0) goto L_0x0599
            r2 = 1
            r12.f5367w = r2
        L_0x0599:
            int r2 = r5.D()
            boolean r4 = r12.f5365u
            if (r4 == 0) goto L_0x05a4
            r3 = 1
            r15 = 5
            goto L_0x05fc
        L_0x05a4:
            boolean r4 = r12.f5367w
            if (r4 == 0) goto L_0x05ac
            r3 = 1
            r15 = 13
            goto L_0x05fc
        L_0x05ac:
            r4 = 4
            if (r2 != r4) goto L_0x05b3
            r3 = 1
            r15 = 11
            goto L_0x05fc
        L_0x05b3:
            r6 = 12
            if (r2 != r15) goto L_0x05d7
            int r2 = r12.f5356l
            if (r2 == 0) goto L_0x05d5
            if (r2 == r15) goto L_0x05d5
            if (r2 != r6) goto L_0x05c0
            goto L_0x05d5
        L_0x05c0:
            boolean r2 = r5.C()
            if (r2 != 0) goto L_0x05c9
            r3 = 1
            r15 = 7
            goto L_0x05fc
        L_0x05c9:
            r5.Y()
            T0.X r2 = r5.f4945b1
            int r2 = r2.f4760n
            if (r2 == 0) goto L_0x05d3
            goto L_0x05d4
        L_0x05d3:
            r3 = 6
        L_0x05d4:
            r15 = r3
        L_0x05d5:
            r3 = 1
            goto L_0x05fc
        L_0x05d7:
            r3 = 3
            if (r2 != r3) goto L_0x05ef
            boolean r2 = r5.C()
            if (r2 != 0) goto L_0x05e3
            r3 = 1
            r15 = 4
            goto L_0x05fc
        L_0x05e3:
            r5.Y()
            T0.X r2 = r5.f4945b1
            int r2 = r2.f4760n
            if (r2 == 0) goto L_0x05d4
            r3 = 9
            goto L_0x05d4
        L_0x05ef:
            r3 = 1
            if (r2 != r3) goto L_0x05f9
            int r2 = r12.f5356l
            if (r2 == 0) goto L_0x05f9
            r15 = 12
            goto L_0x05fc
        L_0x05f9:
            int r2 = r12.f5356l
            r15 = r2
        L_0x05fc:
            int r2 = r12.f5356l
            if (r2 == r15) goto L_0x061f
            r12.f5356l = r15
            r12.f5346A = r3
            android.media.metrics.PlaybackSession r2 = r12.f5349c
            android.media.metrics.PlaybackStateEvent$Builder r3 = U0.g.j()
            int r4 = r12.f5356l
            android.media.metrics.PlaybackStateEvent$Builder r3 = r3.setState(r4)
            long r4 = r12.f5350d
            long r4 = r16 - r4
            android.media.metrics.PlaybackStateEvent$Builder r3 = r3.setTimeSinceCreatedMillis(r4)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x061f:
            android.util.SparseBooleanArray r0 = r0.f2977a
            r2 = 1028(0x404, float:1.44E-42)
            boolean r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0637
            U0.f r0 = r12.f5348b
            java.lang.Object r2 = r13.get(r2)
            U0.a r2 = (U0.a) r2
            r2.getClass()
            r0.b(r2)
        L_0x0637:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.b(java.lang.Object, M0.p):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public H3.i0 c(int r17, M0.Y r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r9 = r18
            int r1 = r0.f18U
            switch(r1) {
                case 15: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            H3.L r8 = H3.O.j()
            r1 = 0
            r10 = 0
        L_0x000f:
            int r1 = r9.f2885a
            if (r10 >= r1) goto L_0x0030
            k1.l r11 = new k1.l
            r6 = r19[r10]
            java.lang.Object r1 = r0.f19V
            r5 = r1
            k1.j r5 = (k1.C1141j) r5
            java.lang.Object r1 = r0.f20W
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            H3.i0 r1 = r8.g()
            return r1
        L_0x0035:
            java.lang.Object r1 = r0.f20W
            int[] r1 = (int[]) r1
            r10 = r1[r17]
            java.lang.Object r1 = r0.f19V
            r11 = r1
            k1.j r11 = (k1.C1141j) r11
            int r1 = r11.e
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r13) goto L_0x00af
            int r2 = r11.f2922f
            if (r2 != r13) goto L_0x004d
            goto L_0x00af
        L_0x004d:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0051:
            int r5 = r9.f2885a
            if (r3 >= r5) goto L_0x00ad
            M0.r[] r5 = r9.f2888d
            r5 = r5[r3]
            int r6 = r5.f3043u
            if (r6 <= 0) goto L_0x00aa
            int r7 = r5.f3044v
            if (r7 <= 0) goto L_0x00aa
            boolean r8 = r11.f2923g
            if (r8 == 0) goto L_0x0074
            if (r6 <= r7) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r1 <= r2) goto L_0x006e
            r15 = 1
            goto L_0x006f
        L_0x006e:
            r15 = 0
        L_0x006f:
            if (r8 == r15) goto L_0x0074
            r8 = r1
            r15 = r2
            goto L_0x0076
        L_0x0074:
            r15 = r1
            r8 = r2
        L_0x0076:
            int r12 = r6 * r8
            int r14 = r7 * r15
            if (r12 < r14) goto L_0x0086
            android.graphics.Point r8 = new android.graphics.Point
            int r6 = P0.z.f(r14, r6)
            r8.<init>(r15, r6)
            goto L_0x0090
        L_0x0086:
            android.graphics.Point r6 = new android.graphics.Point
            int r12 = P0.z.f(r12, r7)
            r6.<init>(r12, r8)
            r8 = r6
        L_0x0090:
            int r5 = r5.f3043u
            int r6 = r5 * r7
            int r12 = r8.x
            float r12 = (float) r12
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r14
            int r12 = (int) r12
            if (r5 < r12) goto L_0x00aa
            int r5 = r8.y
            float r5 = (float) r5
            float r5 = r5 * r14
            int r5 = (int) r5
            if (r7 < r5) goto L_0x00aa
            if (r6 >= r4) goto L_0x00aa
            r4 = r6
        L_0x00aa:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x00ad:
            r12 = r4
            goto L_0x00b2
        L_0x00af:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b2:
            H3.L r14 = H3.O.j()
            r15 = 0
        L_0x00b7:
            int r1 = r9.f2885a
            if (r15 >= r1) goto L_0x00e7
            M0.r[] r1 = r9.f2888d
            r1 = r1[r15]
            int r1 = r1.b()
            if (r12 == r13) goto L_0x00cd
            r2 = -1
            if (r1 == r2) goto L_0x00cb
            if (r1 > r12) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8 = 0
            goto L_0x00ce
        L_0x00cd:
            r8 = 1
        L_0x00ce:
            k1.o r7 = new k1.o
            r6 = r19[r15]
            r1 = r7
            r2 = r17
            r3 = r18
            r4 = r15
            r5 = r11
            r13 = r7
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.a(r13)
            int r15 = r15 + 1
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b7
        L_0x00e7:
            H3.i0 r1 = r14.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.c(int, M0.Y, int[]):H3.i0");
    }

    public void d(String[] strArr) {
        q qVar = (q) this.f19V;
        qVar.getClass();
        if (strArr.length > 0) {
            qVar.O(new File(strArr[0]), 2);
            ((W1) this.f20W).run();
        }
    }

    public void e(Z z) {
        switch (this.f18U) {
            case 2:
                j0 j0Var = (j0) this.f19V;
                j0Var.getClass();
                ((Y) this.f20W).e(j0Var);
                return;
            default:
                f fVar = (f) this.f19V;
                fVar.getClass();
                ((Y) this.f20W).e(fVar);
                return;
        }
    }

    public void f(C0010k kVar) {
        M.c cVar = (M.c) this.f19V;
        cVar.getClass();
        f fVar = f.f3478V;
        if (((t0) this.f20W).f308c.a() && kVar.f274d) {
            fVar = f.f3479W;
        }
        M.e eVar = cVar.f2719U;
        O.i.d(eVar.f2732a, true);
        O.i.c(eVar.f2734c);
        if (eVar.f2741l != fVar) {
            eVar.f2741l = fVar;
            eVar.k(eVar.f2742m);
        }
    }

    public Object h(j jVar) {
        switch (this.f18U) {
            case 1:
                C0020v vVar = (C0020v) this.f19V;
                vVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = vVar.f330d;
                executor.execute(new C0019u(vVar, (Context) (Service) this.f20W, executor, 1, jVar, elapsedRealtime));
                return "CameraX initInternal";
            case 3:
                t0 t0Var = (t0) this.f19V;
                t0Var.getClass();
                ((AtomicReference) this.f20W).set(jVar);
                return "SurfaceRequest-surface-recreation(" + t0Var.hashCode() + ")";
            case 7:
                t tVar = (t) this.f19V;
                tVar.getClass();
                F.h.j("TextureViewImpl", "Surface set on Preview.");
                t0 t0Var2 = tVar.f5310h;
                F.a l8 = D7.b.l();
                d dVar = new d(3, jVar);
                Surface surface = (Surface) this.f20W;
                t0Var2.a(surface, l8, dVar);
                return "provideSurface[request=" + tVar.f5310h + " surface=" + surface + "]";
            default:
                androidx.camera.lifecycle.d dVar2 = (androidx.camera.lifecycle.d) this.f19V;
                C0020v vVar2 = (C0020v) this.f20W;
                P6.f.e(dVar2, "this$0");
                synchronized (dVar2.f7671a) {
                    G.d a8 = G.d.a(G.k.f1612W);
                    B b8 = new B(29, new D6.a(3, vVar2));
                    F.a l9 = D7.b.l();
                    a8.getClass();
                    G.b f8 = G.i.f(a8, b8, l9);
                    R2.c cVar = new R2.c(jVar, 16, vVar2);
                    f8.d(new G.h(f8, 0, cVar), D7.b.l());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    public void i(String str) {
        switch (this.f18U) {
            case 11:
                V0.r rVar = (V0.r) this.f19V;
                C0692f fVar = (C0692f) this.f20W;
                rVar.f5588d = fVar.f10618A1;
                String str2 = fVar.f10619B1;
                rVar.e = str2;
                rVar.f5589f = fVar.f10620C1;
                rVar.f5585a = fVar.f10621D1;
                if (str2.isEmpty() || ((String) rVar.f5589f).isEmpty()) {
                    n2.a.b1((FullyActivity) rVar.f5586b, "You have to specify your " + ((Z1.c) ((d4.k) rVar.f5587c).f9767W).r("cloudName", "Fully Cloud") + " Account email and password to proceed");
                    return;
                }
                rVar.d();
                return;
            default:
                U4 u42 = (U4) this.f19V;
                u42.f10424m1.add((O4) this.f20W);
                u42.f10425n1.notifyDataSetChanged();
                O4.b(u42.f9850f1, u42.f10427p1, u42.f10424m1);
                u42.f10426o1.getRecyclerView().scrollToPosition(u42.f10424m1.size() - 1);
                return;
        }
    }

    public void j(String str) {
        C0144g gVar = (C0144g) this.f19V;
        String str2 = gVar.f3878a;
        if (str != null) {
            Log.w(str2, "Failed to import settings due to ".concat(str));
            return;
        }
        C0794w0.q0(0, str2, "Settings import finished from " + ((String) this.f20W));
        gVar.f3879b.f9952o1.b();
        gVar.f3879b.f9951n1.getClass();
    }
}
