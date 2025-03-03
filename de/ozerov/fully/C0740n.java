package de.ozerov.fully;

import C3.k;
import D2.n;
import T0.C0232y;
import Y1.r;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;
import androidx.media3.ui.PlayerView;
import java.util.Arrays;
import java.util.List;
import n2.a;

/* renamed from: de.ozerov.fully.n  reason: case insensitive filesystem */
public final class C0740n {

    /* renamed from: I  reason: collision with root package name */
    public static final /* synthetic */ int f10810I = 0;

    /* renamed from: A  reason: collision with root package name */
    public int f10811A = -16777216;

    /* renamed from: B  reason: collision with root package name */
    public ImageView.ScaleType f10812B = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: C  reason: collision with root package name */
    public Handler f10813C;

    /* renamed from: D  reason: collision with root package name */
    public W2 f10814D;

    /* renamed from: E  reason: collision with root package name */
    public Runnable f10815E;

    /* renamed from: F  reason: collision with root package name */
    public W2 f10816F;

    /* renamed from: G  reason: collision with root package name */
    public Runnable f10817G;

    /* renamed from: H  reason: collision with root package name */
    public int f10818H = -1;

    /* renamed from: a  reason: collision with root package name */
    public final C0780t4 f10819a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f10820b;

    /* renamed from: c  reason: collision with root package name */
    public final K4 f10821c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f10822d;
    public final LinearLayout e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f10823f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f10824g;

    /* renamed from: h  reason: collision with root package name */
    public long f10825h = 0;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10826j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10827k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10828l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10829m = false;

    /* renamed from: n  reason: collision with root package name */
    public String f10830n;

    /* renamed from: o  reason: collision with root package name */
    public String f10831o;

    /* renamed from: p  reason: collision with root package name */
    public String f10832p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10833q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10834r = true;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10835s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10836t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10837u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10838v = true;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10839w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f10840x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f10841y = 0;
    public int z = 0;

    public C0740n(C0780t4 t4Var, int i8, int i9) {
        C0716j jVar = new C0716j(this);
        k kVar = new k(1, this);
        this.f10819a = t4Var;
        FrameLayout frameLayout = (FrameLayout) t4Var.findViewById(i8);
        this.f10820b = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) t4Var.getLayoutInflater().inflate(2131558522, frameLayout, true);
        ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(2131362619);
        this.f10822d = viewGroup;
        this.e = (LinearLayout) frameLayout.findViewById(2131362402);
        K4 k42 = new K4(viewGroup, i9);
        this.f10821c = k42;
        ImageView imageView = (ImageView) frameLayout.findViewById(2131362158);
        this.f10823f = imageView;
        FrameLayout frameLayout3 = (FrameLayout) frameLayout.findViewById(2131361903);
        this.f10824g = frameLayout3;
        viewGroup.setClickable(true);
        k42.f10063m = jVar;
        k42.f10064n = kVar;
        imageView.setOnTouchListener(kVar);
        frameLayout3.setOnTouchListener(kVar);
    }

    public static List g() {
        return Arrays.asList(new String[]{"jpg", "jpeg", "bmp", "gif", "png", "webp"});
    }

    public final synchronized void a() {
        Handler handler = this.f10813C;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10813C = null;
        }
    }

    public final synchronized void b() {
        if (!this.i) {
            h();
            this.f10821c.a();
            this.f10823f.setVisibility(8);
            this.f10822d.setVisibility(8);
            this.i = true;
        }
    }

    public final synchronized void c(boolean z6) {
        try {
            d();
            this.f10816F = null;
            if (j() && this.f10823f.getVisibility() == 0) {
                if (z6) {
                    this.f10823f.animate().alpha(0.0f).setDuration((long) this.f10841y);
                    new Handler().postDelayed(new C0722k(this, 6), (long) this.f10841y);
                } else {
                    this.f10823f.setVisibility(8);
                }
            }
            if (k()) {
                this.f10821c.b();
                K4 k42 = this.f10821c;
                if (k42.e == 1) {
                    C4 c42 = k42.f10054b;
                    if (c42 != null) {
                        c42.c();
                    }
                } else {
                    r rVar = k42.f10056d.f8224i0;
                    if (rVar != null) {
                        rVar.f();
                    }
                }
                if (this.f10821c.b()) {
                    this.f10821c.e();
                }
                K4 k43 = this.f10821c;
                if (k43.e == 1) {
                    k43.f10053a.suspend();
                }
                if (this.f10822d.getVisibility() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void d() {
        this.e.setVisibility(8);
        a();
    }

    public final void e() {
        if (m()) {
            new Handler().post(new C0722k(this, 3));
            return;
        }
        c(true);
        if (k()) {
            this.f10826j = true;
        }
        if (j()) {
            this.f10828l = true;
        }
        new Handler().postDelayed(new C0722k(this, 4), (long) this.f10841y);
    }

    public final void f() {
        FrameLayout frameLayout = this.f10824g;
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        frameLayout.animate().alpha(1.0f).setDuration((long) (this.f10841y / 2));
        new Handler().postDelayed(new C0722k(this, 9), (long) (this.f10841y / 2));
    }

    public final void h() {
        if (!m()) {
            c(false);
            if (k()) {
                this.f10826j = true;
                this.f10825h = 0;
            }
            if (j()) {
                this.f10828l = true;
            }
        }
    }

    public final void i() {
        if (!m()) {
            c(true);
            if (k()) {
                this.f10826j = true;
            }
            if (j()) {
                this.f10828l = true;
            }
            new Handler().postDelayed(new C0722k(this, 7), (long) this.f10841y);
        }
    }

    public final boolean j() {
        if (this.f10818H == 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f10818H == 1) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.f10820b.getVisibility() == 0 && (this.f10823f.getVisibility() == 0 || this.f10822d.getVisibility() == 0)) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (k()) {
            return this.f10826j;
        }
        if (j()) {
            return this.f10828l;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void n() {
        /*
            r9 = this;
            r0 = 8
            r1 = 1
            monitor-enter(r9)
            boolean r2 = r9.i     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "n"
            java.lang.String r1 = "Can't play in destroyed MediaPlayer"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r9)
            return
        L_0x0011:
            r0 = move-exception
            goto L_0x009f
        L_0x0014:
            java.lang.String r2 = r9.f10830n     // Catch:{ all -> 0x0011 }
            if (r2 != 0) goto L_0x0021
            java.lang.String r0 = "n"
            java.lang.String r1 = "Can't play if URL is null"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r9)
            return
        L_0x0021:
            de.ozerov.fully.K4 r2 = r9.f10821c     // Catch:{ all -> 0x0011 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0039
            de.ozerov.fully.K4 r2 = r9.f10821c     // Catch:{ all -> 0x0011 }
            r2.e()     // Catch:{ all -> 0x0011 }
            de.ozerov.fully.K4 r2 = r9.f10821c     // Catch:{ all -> 0x0011 }
            int r3 = r2.e     // Catch:{ all -> 0x0011 }
            if (r3 != r1) goto L_0x0039
            android.widget.VideoView r2 = r2.f10053a     // Catch:{ all -> 0x0011 }
            r2.suspend()     // Catch:{ all -> 0x0011 }
        L_0x0039:
            android.widget.ImageView r2 = r9.f10823f     // Catch:{ all -> 0x0011 }
            r2.setVisibility(r0)     // Catch:{ all -> 0x0011 }
            android.view.ViewGroup r2 = r9.f10822d     // Catch:{ all -> 0x0011 }
            r2.setVisibility(r0)     // Catch:{ all -> 0x0011 }
            boolean r2 = r9.f10838v     // Catch:{ all -> 0x0011 }
            r3 = 0
            if (r2 == 0) goto L_0x004d
            android.widget.LinearLayout r2 = r9.e     // Catch:{ all -> 0x0011 }
            r2.setVisibility(r3)     // Catch:{ all -> 0x0011 }
        L_0x004d:
            int r2 = r9.z     // Catch:{ all -> 0x0011 }
            if (r2 <= 0) goto L_0x006a
            r9.a()     // Catch:{ all -> 0x0011 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0011 }
            r2.<init>()     // Catch:{ all -> 0x0011 }
            r9.f10813C = r2     // Catch:{ all -> 0x0011 }
            de.ozerov.fully.k r4 = new de.ozerov.fully.k     // Catch:{ all -> 0x0011 }
            r4.<init>(r9, r0)     // Catch:{ all -> 0x0011 }
            int r0 = r9.z     // Catch:{ all -> 0x0011 }
            long r5 = (long) r0     // Catch:{ all -> 0x0011 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r2.postDelayed(r4, r5)     // Catch:{ all -> 0x0011 }
        L_0x006a:
            java.lang.String r0 = r9.f10830n     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = "file:"
            boolean r0 = r0.startsWith(r2)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = r9.f10830n     // Catch:{ all -> 0x0011 }
            java.lang.String r0 = n2.a.K(r0)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x008d
            java.util.List r2 = g()     // Catch:{ all -> 0x0011 }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ all -> 0x0011 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x008d
            r9.f10818H = r3     // Catch:{ all -> 0x0011 }
            goto L_0x008f
        L_0x008d:
            r9.f10818H = r1     // Catch:{ all -> 0x0011 }
        L_0x008f:
            r9.o()     // Catch:{ all -> 0x0011 }
            goto L_0x009d
        L_0x0093:
            de.ozerov.fully.e r0 = new de.ozerov.fully.e     // Catch:{ all -> 0x0011 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0011 }
            java.lang.Void[] r1 = new java.lang.Void[r3]     // Catch:{ all -> 0x0011 }
            r0.execute(r1)     // Catch:{ all -> 0x0011 }
        L_0x009d:
            monitor-exit(r9)
            return
        L_0x009f:
            monitor-exit(r9)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0740n.n():void");
    }

    public final void o() {
        n nVar;
        if (this.i) {
            Log.e("n", "Can't play in destroyed MediaPlayer");
        } else if (this.f10830n == null || this.f10818H == -1) {
            Log.e("n", "Can't play if URL is null or playmode is unknown");
        } else {
            boolean j7 = j();
            boolean z6 = false;
            C0780t4 t4Var = this.f10819a;
            if (j7) {
                ImageView imageView = this.f10823f;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.requestFocus();
                imageView.setScaleType(this.f10812B);
                A0 Q02 = C0794w0.Q0(t4Var);
                C0812z0 z0Var = (C0812z0) ((C0812z0) Q02.l(Drawable.class)).G(this.f10830n);
                if (this.f10839w) {
                    nVar = n.f1134d;
                } else {
                    nVar = n.f1132b;
                }
                C0812z0 H8 = z0Var.H(nVar);
                if (!this.f10839w && !this.f10830n.equals(this.f10832p)) {
                    z6 = true;
                }
                H8.L(z6).g().J(new C0734m(1, this)).D(imageView);
                return;
            }
            ViewGroup viewGroup = this.f10822d;
            viewGroup.setVisibility(0);
            viewGroup.setAlpha(0.0f);
            viewGroup.setBackgroundColor(this.f10811A);
            K4 k42 = this.f10821c;
            int i8 = k42.e;
            PlayerView playerView = k42.f10056d;
            VideoView videoView = k42.f10053a;
            if (i8 == 1) {
                videoView.setBackgroundColor(0);
            } else {
                playerView.setBackgroundColor(0);
            }
            int i9 = k42.e;
            if (i9 == 1) {
                videoView.requestFocus();
            } else {
                playerView.requestFocus();
            }
            k42.f10061k = new C0716j(this);
            k42.f10059h = this.f10834r;
            k42.f10058g = this.f10833q;
            k42.f10062l = new C0716j(this);
            k42.f10060j = new C0716j(this);
            try {
                k42.c(Uri.parse(this.f10830n));
                long j8 = this.f10825h;
                if (j8 != 0 && this.f10827k) {
                    if (i9 == 1) {
                        videoView.seekTo((int) j8);
                    } else {
                        C0232y yVar = k42.f10055c;
                        yVar.getClass();
                        yVar.k(j8, yVar.v(), false);
                    }
                    this.f10825h = 0;
                }
                k42.d();
                this.f10826j = false;
                this.f10827k = false;
            } catch (Exception e8) {
                Log.e("n", "Failed to start playing video due to " + e8.getMessage());
                d();
                a.b1(t4Var, "Failed loading media: " + this.f10830n);
                e();
            }
        }
    }

    public final void p() {
        if (!m()) {
            c(true);
            if (k()) {
                this.f10826j = true;
            }
            if (j()) {
                this.f10828l = true;
            }
            new Handler().postDelayed(new C0722k(this, 10), (long) this.f10841y);
        }
    }

    public final synchronized void q() {
        long j7;
        try {
            if (!k() || !this.f10821c.b() || this.f10826j) {
                this.f10825h = 0;
            } else {
                K4 k42 = this.f10821c;
                if (k42.e == 1) {
                    j7 = (long) k42.f10053a.getCurrentPosition();
                } else {
                    j7 = k42.f10055c.x();
                }
                this.f10825h = j7;
            }
            c(true);
            if (k() && !this.f10826j) {
                this.f10827k = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
