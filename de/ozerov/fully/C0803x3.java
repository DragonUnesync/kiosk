package de.ozerov.fully;

import B3.q;
import Z1.c;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.FrameLayout;
import d4.k;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.x3  reason: case insensitive filesystem */
public final class C0803x3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11076a = C0803x3.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final C0780t4 f11077b;

    /* renamed from: c  reason: collision with root package name */
    public final k f11078c;

    /* renamed from: d  reason: collision with root package name */
    public final i5 f11079d;
    public final C0740n e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f11080f;

    /* renamed from: g  reason: collision with root package name */
    public volatile ArrayList f11081g;

    /* renamed from: h  reason: collision with root package name */
    public O2 f11082h;
    public volatile int i;

    /* renamed from: j  reason: collision with root package name */
    public volatile int f11083j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f11084k;

    /* renamed from: l  reason: collision with root package name */
    public Handler f11085l;

    /* renamed from: m  reason: collision with root package name */
    public Handler f11086m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f11087n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11088o;

    /* renamed from: p  reason: collision with root package name */
    public final String f11089p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11090q = false;

    /* renamed from: r  reason: collision with root package name */
    public int f11091r = 200;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11092s = false;

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f11093t = false;

    /* renamed from: u  reason: collision with root package name */
    public volatile boolean f11094u = false;

    /* renamed from: v  reason: collision with root package name */
    public C0773s3 f11095v;

    public C0803x3(C0780t4 t4Var, V4 v4) {
        this.f11077b = t4Var;
        k kVar = new k((Context) t4Var, 1);
        this.f11078c = kVar;
        this.f11089p = "screensaverPlaylist";
        this.f11079d = new i5(t4Var, v4, 2131362447);
        this.e = new C0740n(t4Var, 2131362443, kVar.x2());
        this.f11087n = new Handler();
    }

    public final synchronized void a(boolean z, boolean z6) {
        try {
            Handler handler = this.f11084k;
            if (handler != null && z) {
                handler.removeCallbacksAndMessages((Object) null);
                this.f11084k = null;
            }
            Handler handler2 = this.f11085l;
            if (handler2 != null && z6) {
                handler2.removeCallbacksAndMessages((Object) null);
                this.f11085l = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void b() {
        if (!this.f11092s) {
            k();
            this.f11079d.d();
            this.e.b();
            C0773s3 s3Var = this.f11095v;
            if (s3Var != null) {
                s3Var.run();
            }
            this.f11092s = true;
        }
    }

    public final boolean c() {
        String K4;
        O2 o2 = this.f11082h;
        if (o2 == null || o2.f10216b != 3 || this.f11081g == null || this.f11083j >= this.f11081g.size() || (K4 = a.K(((File) this.f11081g.get(this.f11083j)).getAbsolutePath())) == null) {
            return false;
        }
        this.e.getClass();
        if (C0740n.g().contains(K4.toLowerCase())) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        C0780t4 t4Var = this.f11077b;
        if (t4Var instanceof FullyActivity) {
            q qVar = ((FullyActivity) t4Var).f9935X0;
            JSONObject D8 = a.D("url", str);
            String str2 = this.f11089p;
            JSONObject[] jSONObjectArr = {D8, a.D("tag", str2)};
            JSONObject jSONObject = new JSONObject();
            for (int i8 = 0; i8 < 2; i8++) {
                JSONObject jSONObject2 = jSONObjectArr[i8];
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
            qVar.b0("onItemPlay", jSONObject);
            HashMap[] hashMapArr = {a.E("$url", str), a.E("$tag", str2)};
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < 2; i9++) {
                hashMap.putAll(hashMapArr[i9]);
            }
            U0.e("onItemPlay", hashMap);
            if (C0794w0.f11017a && C0794w0.f11018b != null) {
                C0794w0.a();
                C0794w0.f11018b.f11066p++;
            }
        }
    }

    public final void e() {
        String str;
        boolean z;
        boolean z6;
        String K4;
        String str2;
        String str3;
        String str4;
        O2 o2 = this.f11082h;
        if (o2 == null || o2.f10215a == null) {
            new Handler().post(new W2(this, 3));
            return;
        }
        String str5 = null;
        if (o2.a()) {
            if (this.f11082h.f10219f || this.f11090q) {
                this.f11079d.f10726u = new W2(this, 4);
            } else {
                this.f11079d.f10726u = null;
            }
            j();
            O2 o22 = this.f11082h;
            int i8 = o22.f10216b;
            if (i8 == 0 || i8 == -1) {
                str2 = o22.f10215a;
            } else {
                if (i8 == 4) {
                    Matcher matcher = Pattern.compile("^(?:https?://|//)?(?:www\\.|m\\.|.+\\.)?(?:youtu\\.be/|youtube\\.com/(?:embed/|v/|shorts/|live/|feeds/api/videos/|watch\\?v=|watch\\?.+&v=))([\\w-]{11})(?![\\w-])").matcher(o22.f10215a);
                    if (matcher.find()) {
                        str4 = matcher.group(1);
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        str2 = "https://youtube/video/".concat(str4);
                    } else {
                        a.b1(this.f11077b, "Can't get YouTube Video ID from URL " + this.f11082h.f10215a);
                        g();
                    }
                } else if (i8 == 5) {
                    Matcher matcher2 = Pattern.compile("(?:youtube\\.com.*(?:\\?|&)(?:list)=)((?!videoseries)[a-zA-Z0-9_]*)").matcher(o22.f10215a);
                    if (matcher2.find()) {
                        str3 = matcher2.group(1);
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str2 = "https://youtube/playlist/".concat(str3);
                    } else {
                        a.b1(this.f11077b, "Can't get YouTube Playlist ID from URL " + this.f11082h.f10215a);
                        g();
                    }
                }
                str2 = null;
            }
            int i9 = this.f11082h.f10216b;
            if ((i9 == 4 || i9 == 5) && str2 != null) {
                i5 i5Var = this.f11079d;
                i5Var.f10727v = new Y2(this);
                i5Var.f10728w = "fullyYtInterface";
            } else {
                i5 i5Var2 = this.f11079d;
                i5Var2.f10727v = null;
                i5Var2.f10728w = null;
            }
            if (str2 != null) {
                i5 i5Var3 = this.f11079d;
                boolean z8 = i5Var3.f10714h;
                FrameLayout frameLayout = i5Var3.e;
                if (z8) {
                    frameLayout.setVisibility(0);
                } else {
                    frameLayout.setVisibility(4);
                }
                i5 i5Var4 = this.f11079d;
                i5Var4.i = false;
                i5Var4.f10715j = false;
                i5Var4.y(false);
                this.f11079d.n(str2, false);
                d(str2);
                this.f11088o = true;
                return;
            }
            g();
            return;
        }
        O2 o23 = this.f11082h;
        int i10 = o23.f10216b;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C0740n nVar = this.e;
            nVar.f10814D = new W2(this, 3);
            nVar.f10817G = new W2(this, 3);
            nVar.f10815E = new W2(this, 5);
            nVar.f10816F = new W2(this, 6);
            if (i10 == 1) {
                str = o23.f10215a;
                nVar.f10830n = str;
            } else if (i10 == 2) {
                str = a.F(this.f11077b, o23.f10215a);
                C0740n nVar2 = this.e;
                File file = new File(str);
                nVar2.getClass();
                nVar2.f10830n = Uri.fromFile(file).toString();
            } else if (i10 == 3) {
                str = ((File) this.f11081g.get(this.f11083j)).getAbsolutePath();
                C0740n nVar3 = this.e;
                nVar3.getClass();
                nVar3.f10830n = Uri.fromFile((File) this.f11081g.get(this.f11083j)).toString();
            } else {
                str = null;
            }
            C0740n nVar4 = this.e;
            O2 o24 = this.f11082h;
            if (!(o24 == null || o24.f10216b != 3 || this.f11081g == null || this.f11083j >= this.f11081g.size() - 1 || (K4 = a.K(((File) this.f11081g.get(this.f11083j + 1)).getAbsolutePath())) == null)) {
                this.e.getClass();
                if (C0740n.g().contains(K4.toLowerCase())) {
                    str5 = Uri.fromFile((File) this.f11081g.get(this.f11083j + 1)).toString();
                }
            }
            nVar4.f10831o = str5;
            C0740n nVar5 = this.e;
            O2 o25 = this.f11082h;
            int i11 = o25.f10216b;
            if (i11 == 3) {
                z = o25.f10218d;
            } else {
                z = o25.f10217c;
            }
            nVar5.f10833q = z;
            if (this.f11090q || (i11 != 3 ? o25.f10219f : !(!o25.f10219f && !o25.f10220g))) {
                z6 = true;
            } else {
                z6 = false;
            }
            nVar5.f10835s = z6;
            nVar5.f10837u = true;
            int i12 = this.f11091r;
            nVar5.f10840x = i12;
            nVar5.f10841y = i12;
            nVar5.f10834r = false;
            nVar5.f10838v = false;
            nVar5.f10839w = ((c) this.f11078c.f9767W).n("playerCacheImages", true);
            C0740n nVar6 = this.e;
            nVar6.z = 20;
            nVar6.f10811A = 0;
            nVar6.f10812B = this.f11078c.U();
            this.e.f10820b.setVisibility(0);
            this.e.n();
            d(str);
            return;
        }
        a.b1(this.f11077b, "Unknown playlist item type");
        new Handler().post(new W2(this, 3));
    }

    public final synchronized void f() {
        if (this.f11092s) {
            Log.e(this.f11076a, "Can't play in destroyed PlaylistPlayer");
            return;
        }
        C0780t4 t4Var = this.f11077b;
        if (t4Var instanceof FullyActivity) {
            ((FullyActivity) t4Var).f9935X0.b0("onPlaylistPlay", a.D("tag", this.f11089p));
            U0.e("onPlaylistPlay", a.E("$tag", this.f11089p));
            if (C0794w0.f11017a) {
                if (C0794w0.f11018b != null) {
                    C0794w0.a();
                    C0794w0.f11018b.f11065o++;
                }
            }
        }
        Handler handler = this.f11086m;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f11086m = null;
        }
        k();
        this.f11080f = O2.b(this.f11077b, this.f11089p);
        this.i = -1;
        this.f11082h = null;
        this.f11088o = false;
        this.f11093t = false;
        this.f11094u = false;
        g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f11094u     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r5.f11093t     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000b
            goto L_0x00ef
        L_0x000b:
            java.util.ArrayList r0 = r5.f11080f     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x00db
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0017
            goto L_0x00db
        L_0x0017:
            r5.l()     // Catch:{ all -> 0x0041 }
            r0 = 0
            r1 = 1
            r5.a(r1, r0)     // Catch:{ all -> 0x0041 }
            de.ozerov.fully.O2 r2 = r5.f11082h     // Catch:{ all -> 0x0041 }
            r3 = 3
            if (r2 == 0) goto L_0x0044
            int r2 = r2.f10216b     // Catch:{ all -> 0x0041 }
            if (r2 != r3) goto L_0x0044
            java.util.ArrayList r2 = r5.f11081g     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0044
            int r2 = r5.f11083j     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r4 = r5.f11081g     // Catch:{ all -> 0x0041 }
            int r4 = r4.size()     // Catch:{ all -> 0x0041 }
            int r4 = r4 - r1
            if (r2 >= r4) goto L_0x0044
            int r0 = r5.f11083j     // Catch:{ all -> 0x0041 }
            int r0 = r0 + r1
            r5.f11083j = r0     // Catch:{ all -> 0x0041 }
            r5.e()     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x0041:
            r0 = move-exception
            goto L_0x00f8
        L_0x0044:
            de.ozerov.fully.O2 r2 = r5.f11082h     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0071
            int r4 = r2.f10216b     // Catch:{ all -> 0x0041 }
            if (r4 != r3) goto L_0x0071
            java.lang.String r2 = r2.f10215a     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0071
            java.util.ArrayList r2 = r5.f11081g     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0071
            int r2 = r5.f11083j     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r4 = r5.f11081g     // Catch:{ all -> 0x0041 }
            int r4 = r4.size()     // Catch:{ all -> 0x0041 }
            int r4 = r4 - r1
            if (r2 != r4) goto L_0x0071
            de.ozerov.fully.O2 r2 = r5.f11082h     // Catch:{ all -> 0x0041 }
            boolean r2 = r2.f10217c     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0071
            de.ozerov.fully.e r1 = new de.ozerov.fully.e     // Catch:{ all -> 0x0041 }
            r2 = 6
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0041 }
            java.lang.Void[] r0 = new java.lang.Void[r0]     // Catch:{ all -> 0x0041 }
            r1.execute(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x0071:
            int r2 = r5.i     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r4 = r5.f11080f     // Catch:{ all -> 0x0041 }
            int r4 = r4.size()     // Catch:{ all -> 0x0041 }
            int r4 = r4 - r1
            if (r2 >= r4) goto L_0x00a8
            java.util.ArrayList r2 = r5.f11080f     // Catch:{ all -> 0x0041 }
            int r4 = r5.i     // Catch:{ all -> 0x0041 }
            int r4 = r4 + r1
            r5.i = r4     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0041 }
            de.ozerov.fully.O2 r2 = (de.ozerov.fully.O2) r2     // Catch:{ all -> 0x0041 }
            r5.f11082h = r2     // Catch:{ all -> 0x0041 }
            r5.a(r0, r1)     // Catch:{ all -> 0x0041 }
            de.ozerov.fully.O2 r1 = r5.f11082h     // Catch:{ all -> 0x0041 }
            int r2 = r1.f10216b     // Catch:{ all -> 0x0041 }
            if (r2 != r3) goto L_0x00a4
            java.lang.String r1 = r1.f10215a     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x00a4
            de.ozerov.fully.e r1 = new de.ozerov.fully.e     // Catch:{ all -> 0x0041 }
            r2 = 6
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0041 }
            java.lang.Void[] r0 = new java.lang.Void[r0]     // Catch:{ all -> 0x0041 }
            r1.execute(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x00a4:
            r5.e()     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x00a8:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r5.f11086m = r0     // Catch:{ all -> 0x0041 }
            boolean r1 = r5.f11088o     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x00bd
            de.ozerov.fully.W2 r1 = new de.ozerov.fully.W2     // Catch:{ all -> 0x0041 }
            r2 = 2
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0041 }
            r0.post(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x00bd:
            boolean r0 = r5.f11090q     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x00c5
            r5.b()     // Catch:{ all -> 0x0041 }
            goto L_0x00d9
        L_0x00c5:
            de.ozerov.fully.t4 r0 = r5.f11077b     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "No playable items found on playlist, loop in 20 sec"
            n2.a.b1(r0, r1)     // Catch:{ all -> 0x0041 }
            android.os.Handler r0 = r5.f11086m     // Catch:{ all -> 0x0041 }
            de.ozerov.fully.W2 r1 = new de.ozerov.fully.W2     // Catch:{ all -> 0x0041 }
            r2 = 2
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0041 }
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x0041 }
        L_0x00d9:
            monitor-exit(r5)
            return
        L_0x00db:
            de.ozerov.fully.t4 r0 = r5.f11077b     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Playlist empty"
            n2.a.b1(r0, r1)     // Catch:{ all -> 0x0041 }
            boolean r0 = r5.f11090q     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x00ea
            r5.b()     // Catch:{ all -> 0x0041 }
            goto L_0x00ed
        L_0x00ea:
            r5.k()     // Catch:{ all -> 0x0041 }
        L_0x00ed:
            monitor-exit(r5)
            return
        L_0x00ef:
            java.lang.String r0 = r5.f11076a     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Can't play next item when player stopped, suspended or paused"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            return
        L_0x00f8:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0803x3.g():void");
    }

    public final synchronized void h() {
        int i8;
        try {
            a(true, false);
            O2 o2 = this.f11082h;
            if (o2.f10216b != 3) {
                i8 = o2.f10221h;
            } else if (c()) {
                i8 = this.f11082h.i;
            } else {
                i8 = this.f11082h.f10222j;
            }
            if (i8 > 0) {
                Handler handler = new Handler();
                this.f11084k = handler;
                C0740n nVar = this.e;
                Objects.requireNonNull(nVar);
                handler.postDelayed(new C0722k(nVar, 11), ((long) i8) * 1000);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        a(false, true);
        O2 o2 = this.f11082h;
        if (o2.f10216b == 3 && o2.f10221h > 0) {
            Handler handler = new Handler();
            this.f11085l = handler;
            handler.postDelayed(new W2(this, 0), ((long) this.f11082h.f10221h) * 1000);
        }
    }

    public final synchronized void j() {
        a(true, true);
        if (this.f11082h.a() && this.f11082h.f10221h > 0) {
            Handler handler = new Handler();
            this.f11084k = handler;
            handler.postDelayed(new W2(this, 1), ((long) this.f11082h.f10221h) * 1000);
        }
    }

    public final synchronized void k() {
        try {
            this.f11093t = true;
            l();
            a(true, true);
            Handler handler = this.f11086m;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.f11086m = null;
            }
            C0740n nVar = this.e;
            nVar.f10814D = null;
            nVar.f10815E = null;
            nVar.f10817G = null;
            this.f11079d.f10726u = null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void l() {
        try {
            O2 o2 = this.f11082h;
            if (o2 != null) {
                if (o2.a()) {
                    this.f11079d.d();
                    this.f11079d.e.setVisibility(8);
                }
                int i8 = this.f11082h.f10216b;
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    this.e.h();
                    this.e.f10820b.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
