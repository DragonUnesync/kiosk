package de.ozerov.fully;

import B7.g;
import C3.k;
import H3.i0;
import M0.D;
import P0.l;
import P0.v;
import P0.z;
import T0.C0212d;
import T0.C0220l;
import T0.C0221m;
import T0.C0232y;
import T0.X;
import T0.g0;
import U.p;
import Z1.c;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.media3.ui.PlayerView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.d;
import l1.h;

public final class K4 {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f10052p = 0;

    /* renamed from: a  reason: collision with root package name */
    public final VideoView f10053a;

    /* renamed from: b  reason: collision with root package name */
    public C4 f10054b;

    /* renamed from: c  reason: collision with root package name */
    public final C0232y f10055c;

    /* renamed from: d  reason: collision with root package name */
    public final PlayerView f10056d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public String f10057f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10058g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10059h = false;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public C0716j f10060j;

    /* renamed from: k  reason: collision with root package name */
    public C0716j f10061k;

    /* renamed from: l  reason: collision with root package name */
    public C0716j f10062l;

    /* renamed from: m  reason: collision with root package name */
    public C0716j f10063m;

    /* renamed from: n  reason: collision with root package name */
    public k f10064n;

    /* renamed from: o  reason: collision with root package name */
    public final c f10065o;

    public K4(ViewGroup viewGroup, int i8) {
        J4 j42 = new J4(this);
        this.f10065o = new c(16, (Object) this);
        VideoView videoView = (VideoView) viewGroup.findViewById(2131362618);
        this.f10053a = videoView;
        PlayerView playerView = (PlayerView) viewGroup.findViewById(2131362382);
        this.f10056d = playerView;
        if (!(i8 == 1 || i8 == 2)) {
            i8 = 1;
        }
        if (i8 == 2) {
            try {
                C0221m mVar = new C0221m(viewGroup.getContext());
                l.j(!mVar.f4888t);
                mVar.f4888t = true;
                int i9 = z.f3748a;
                C0232y yVar = new C0232y(mVar);
                this.f10055c = yVar;
                yVar.f4952g0.a(j42);
                playerView.setPlayer(yVar);
                videoView.setVisibility(8);
                playerView.setVisibility(0);
                playerView.setOnKeyListener(new D4(0, this));
                playerView.setOnTouchListener(new E4(this, 0));
            } catch (Error unused) {
                i8 = 1;
            }
        }
        if (i8 == 1) {
            this.f10055c = null;
            this.f10056d.setVisibility(8);
            this.f10053a.setVisibility(0);
            this.f10053a.setOnErrorListener(new F4(this));
            this.f10053a.setOnCompletionListener(new G4(this));
            this.f10053a.setOnPreparedListener(new H4(this, viewGroup));
            this.f10053a.setOnInfoListener(new I4(this));
            this.f10053a.setOnKeyListener(new D4(1, this));
            this.f10053a.setOnTouchListener(new E4(this, 1));
        }
        this.e = i8;
    }

    public final void a() {
        String str;
        if (this.e == 1) {
            this.f10053a.suspend();
            return;
        }
        C0232y yVar = this.f10055c;
        yVar.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(yVar)));
        sb.append(" [AndroidXMedia3/1.5.0] [");
        sb.append(z.e);
        sb.append("] [");
        HashSet hashSet = D.f2790a;
        synchronized (D.class) {
            str = D.f2791b;
        }
        sb.append(str);
        sb.append("]");
        l.s("ExoPlayerImpl", sb.toString());
        yVar.Y();
        yVar.f4966v0.l();
        g0 g0Var = yVar.f4968x0;
        g0Var.f4840d = false;
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) g0Var.e;
        if (wakeLock != null) {
            wakeLock.release();
        }
        g0 g0Var2 = yVar.f4969y0;
        g0Var2.f4840d = false;
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) g0Var2.e;
        if (wifiLock != null) {
            wifiLock.release();
        }
        C0212d dVar = yVar.f4967w0;
        dVar.f4793c = null;
        dVar.a();
        dVar.b(0);
        if (!yVar.f4951f0.A()) {
            yVar.f4952g0.e(10, new g(17));
        }
        yVar.f4952g0.d();
        yVar.f4948d0.f3741a.removeCallbacksAndMessages((Object) null);
        d dVar2 = yVar.f4960o0;
        U0.d dVar3 = yVar.f4958m0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((h) dVar2).f13122b.f13026V;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l1.c cVar = (l1.c) it.next();
            if (cVar.f13102b == dVar3) {
                cVar.f13103c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        X x8 = yVar.f4945b1;
        if (x8.f4762p) {
            yVar.f4945b1 = x8.a();
        }
        X g8 = yVar.f4945b1.g(1);
        yVar.f4945b1 = g8;
        X b8 = g8.b(g8.f4750b);
        yVar.f4945b1 = b8;
        b8.f4763q = b8.f4765s;
        yVar.f4945b1.f4764r = 0;
        U0.d dVar4 = yVar.f4958m0;
        v vVar = dVar4.f5331b0;
        l.k(vVar);
        vVar.c(new p(1, (Object) dVar4));
        yVar.f4946c0.a();
        yVar.M();
        Surface surface = yVar.f4923L0;
        if (surface != null) {
            surface.release();
            yVar.f4923L0 = null;
        }
        yVar.f4933V0 = O0.c.f3543b;
    }

    public final boolean b() {
        if (this.e == 1) {
            return this.f10053a.isPlaying();
        }
        C0232y yVar = this.f10055c;
        yVar.getClass();
        if (yVar.D() == 3 && yVar.C()) {
            yVar.Y();
            if (yVar.f4945b1.f4760n == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: M0.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: M0.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.net.Uri r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = -1
            java.lang.String r2 = r22.toString()
            r0.f10057f = r2
            int r2 = r0.e
            r3 = 1
            if (r2 != r3) goto L_0x0017
            android.widget.VideoView r1 = r0.f10053a
            r2 = r22
            r1.setVideoURI(r2)
            goto L_0x0192
        L_0x0017:
            r2 = r22
            int r4 = M0.C.f2784g
            M0.u r12 = new M0.u
            r12.<init>()
            H3.M r4 = H3.O.f2026V
            H3.i0 r4 = H3.i0.f2073Y
            java.util.List r8 = java.util.Collections.emptyList()
            H3.i0 r9 = H3.i0.f2073Y
            M0.x r13 = new M0.x
            r13.<init>()
            M0.A r20 = M0.A.f2783a
            M0.z r17 = new M0.z
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            r7 = 0
            r4 = r17
            r5 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10)
            M0.C r2 = new M0.C
            M0.w r4 = new M0.w
            r4.<init>(r12)
            M0.y r5 = new M0.y
            r5.<init>(r13)
            M0.F r19 = M0.F.z
            java.lang.String r15 = ""
            r14 = r2
            r16 = r4
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            T0.y r6 = r0.f10055c
            r6.getClass()
            H3.i0 r2 = H3.O.r(r2)
            r6.Y()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            r7 = 0
        L_0x006c:
            int r8 = r2.f2075X
            if (r7 >= r8) goto L_0x0081
            java.lang.Object r8 = r2.get(r7)
            M0.C r8 = (M0.C) r8
            h1.A r9 = r6.f4957l0
            h1.a r8 = r9.b(r8)
            r4.add(r8)
            int r7 = r7 + r3
            goto L_0x006c
        L_0x0081:
            r6.Y()
            T0.X r2 = r6.f4945b1
            r6.B(r2)
            r6.x()
            int r2 = r6.f4914C0
            int r2 = r2 + r3
            r6.f4914C0 = r2
            java.util.ArrayList r2 = r6.f4955j0
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x00d6
            int r7 = r2.size()
            int r8 = r7 + -1
        L_0x009f:
            if (r8 < 0) goto L_0x00a6
            r2.remove(r8)
            int r8 = r8 + r1
            goto L_0x009f
        L_0x00a6:
            h1.b0 r8 = r6.f4918G0
            int[] r9 = r8.f12437b
            int r10 = r9.length
            int r10 = r10 - r7
            int[] r10 = new int[r10]
            r11 = 0
            r12 = 0
        L_0x00b0:
            int r13 = r9.length
            if (r11 >= r13) goto L_0x00c4
            r13 = r9[r11]
            if (r13 < 0) goto L_0x00bb
            if (r13 >= r7) goto L_0x00bb
            int r12 = r12 + r3
            goto L_0x00c2
        L_0x00bb:
            int r14 = r11 - r12
            if (r13 < 0) goto L_0x00c0
            int r13 = r13 - r7
        L_0x00c0:
            r10[r14] = r13
        L_0x00c2:
            int r11 = r11 + r3
            goto L_0x00b0
        L_0x00c4:
            h1.b0 r7 = new h1.b0
            java.util.Random r9 = new java.util.Random
            java.util.Random r8 = r8.f12436a
            long r11 = r8.nextLong()
            r9.<init>(r11)
            r7.<init>(r10, r9)
            r6.f4918G0 = r7
        L_0x00d6:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r7 = 0
        L_0x00dc:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0100
            T0.V r8 = new T0.V
            java.lang.Object r9 = r4.get(r7)
            h1.a r9 = (h1.C1035a) r9
            boolean r10 = r6.f4956k0
            r8.<init>(r9, r10)
            r14.add(r8)
            T0.x r9 = new T0.x
            java.lang.Object r10 = r8.f4735b
            h1.x r8 = r8.f4734a
            r9.<init>(r10, r8)
            r2.add(r7, r9)
            int r7 = r7 + r3
            goto L_0x00dc
        L_0x0100:
            h1.b0 r4 = r6.f4918G0
            int r7 = r14.size()
            h1.b0 r4 = r4.a(r7)
            r6.f4918G0 = r4
            T0.c0 r4 = new T0.c0
            h1.b0 r7 = r6.f4918G0
            r4.<init>(r2, r7)
            boolean r2 = r4.p()
            int r7 = r4.f4786d
            if (r2 != 0) goto L_0x0124
            if (r1 >= r7) goto L_0x011e
            goto L_0x0124
        L_0x011e:
            M0.s r1 = new M0.s
            r1.<init>()
            throw r1
        L_0x0124:
            boolean r2 = r6.f4913B0
            int r2 = r4.a(r2)
            T0.X r8 = r6.f4945b1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r11 = r6.I(r4, r2, r9)
            T0.X r8 = r6.H(r8, r4, r11)
            int r11 = r8.e
            if (r2 == r1) goto L_0x014b
            if (r11 == r3) goto L_0x014b
            boolean r1 = r4.p()
            if (r1 != 0) goto L_0x014a
            if (r2 < r7) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r11 = 2
            goto L_0x014b
        L_0x014a:
            r11 = 4
        L_0x014b:
            T0.X r7 = r8.g(r11)
            long r17 = P0.z.O(r9)
            h1.b0 r15 = r6.f4918G0
            T0.F r1 = r6.f4951f0
            P0.v r1 = r1.f4646c0
            T0.B r4 = new T0.B
            r13 = r4
            r16 = r2
            r13.<init>(r14, r15, r16, r17)
            r2 = 17
            P0.u r1 = r1.a(r2, r4)
            r1.b()
            T0.X r1 = r6.f4945b1
            h1.B r1 = r1.f4750b
            java.lang.Object r1 = r1.f12277a
            h1.B r2 = r7.f4750b
            java.lang.Object r2 = r2.f12277a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0186
            T0.X r1 = r6.f4945b1
            M0.X r1 = r1.f4749a
            boolean r1 = r1.p()
            if (r1 != 0) goto L_0x0186
            r9 = 1
            goto L_0x0187
        L_0x0186:
            r9 = 0
        L_0x0187:
            long r11 = r6.y(r7)
            r13 = -1
            r14 = 0
            r8 = 0
            r10 = 4
            r6.W(r7, r8, r9, r10, r11, r13, r14)
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.K4.c(android.net.Uri):void");
    }

    public final void d() {
        if (this.e == 1) {
            VideoView videoView = this.f10053a;
            videoView.setVisibility(8);
            videoView.setVisibility(0);
            try {
                videoView.getHolder().setFormat(-2);
                videoView.getHolder().setFormat(-1);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.i = false;
            videoView.start();
            return;
        }
        this.f10056d.setUseController(this.f10059h);
        C0232y yVar = this.f10055c;
        yVar.Y();
        yVar.f4968x0.d(true);
        yVar.f4969y0.d(true);
        yVar.Q(this.f10058g ? 1 : 0);
        yVar.K();
        this.i = false;
        yVar.P(true);
    }

    public final void e() {
        if (this.e == 1) {
            this.f10053a.stopPlayback();
            this.f10053a.setVideoURI((Uri) null);
            return;
        }
        C0232y yVar = this.f10055c;
        yVar.Y();
        yVar.f4967w0.c(1, yVar.C());
        yVar.T((C0220l) null);
        i0 i0Var = i0.f2073Y;
        long j7 = yVar.f4945b1.f4765s;
        yVar.f4933V0 = new O0.c(i0Var);
    }
}
