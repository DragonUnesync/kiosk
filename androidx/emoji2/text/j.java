package androidx.emoji2.text;

import Y.f;
import a1.C0410a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n2.a;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f7791j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile j f7792k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f7793a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7794b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f7795c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f7796d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final i f7797f;

    /* renamed from: g  reason: collision with root package name */
    public final C0410a f7798g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7799h;
    public final c i;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7793a = reentrantReadWriteLock;
        i iVar = (i) qVar.f7786b;
        this.f7797f = iVar;
        int i8 = qVar.f7785a;
        this.f7799h = i8;
        this.i = (c) qVar.f7787c;
        this.f7796d = new Handler(Looper.getMainLooper());
        this.f7794b = new f(0);
        this.f7798g = new C0410a(2);
        e eVar = new e(this);
        this.e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i8 == 0) {
            try {
                this.f7795c = 0;
            } catch (Throwable th) {
                this.f7793a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z;
        synchronized (f7791j) {
            jVar = f7792k;
            if (jVar != null) {
                z = true;
            } else {
                z = false;
            }
            a.m("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return jVar;
    }

    public final int b() {
        this.f7793a.readLock().lock();
        try {
            return this.f7795c;
        } finally {
            this.f7793a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z;
        if (this.f7799h == 1) {
            z = true;
        } else {
            z = false;
        }
        a.m("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
        if (b() != 1) {
            this.f7793a.writeLock().lock();
            try {
                if (this.f7795c != 0) {
                    this.f7795c = 0;
                    this.f7793a.writeLock().unlock();
                    e eVar = this.e;
                    j jVar = eVar.f7782a;
                    try {
                        jVar.f7797f.a(new d(eVar));
                    } catch (Throwable th) {
                        jVar.d(th);
                    }
                }
            } finally {
                this.f7793a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7793a.writeLock().lock();
        try {
            this.f7795c = 2;
            arrayList.addAll(this.f7794b);
            this.f7794b.clear();
            this.f7793a.writeLock().unlock();
            this.f7796d.post(new h((List) arrayList, this.f7795c, th));
        } catch (Throwable th2) {
            this.f7793a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.emoji2.text.z, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c0 A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            java.lang.String r3 = "Not initialized yet"
            n2.a.m(r3, r0)
            if (r12 < 0) goto L_0x0108
            if (r13 < 0) goto L_0x0100
            if (r12 > r13) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r3 = "start should be <= than end"
            n2.a.h(r3, r0)
            r0 = 0
            if (r11 != 0) goto L_0x0022
            return r0
        L_0x0022:
            int r3 = r11.length()
            if (r12 > r3) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            java.lang.String r4 = "start should be < than charSequence length"
            n2.a.h(r4, r3)
            int r3 = r11.length()
            if (r13 > r3) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            java.lang.String r3 = "end should be < than charSequence length"
            n2.a.h(r3, r2)
            int r2 = r11.length()
            if (r2 == 0) goto L_0x00ff
            if (r12 != r13) goto L_0x0047
            goto L_0x00ff
        L_0x0047:
            androidx.emoji2.text.e r2 = r10.e
            B.q0 r3 = r2.f7783b
            r3.getClass()
            boolean r2 = r11 instanceof androidx.emoji2.text.t
            if (r2 == 0) goto L_0x0058
            r4 = r11
            androidx.emoji2.text.t r4 = (androidx.emoji2.text.t) r4
            r4.a()
        L_0x0058:
            java.lang.Class<androidx.emoji2.text.v> r4 = androidx.emoji2.text.v.class
            if (r2 != 0) goto L_0x0084
            boolean r5 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0061
            goto L_0x0084
        L_0x0061:
            boolean r5 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x008c
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x0081 }
            int r6 = r12 + -1
            int r7 = r13 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch:{ all -> 0x0081 }
            if (r5 > r13) goto L_0x008c
            androidx.emoji2.text.z r0 = new androidx.emoji2.text.z     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            r0.f7831U = r1     // Catch:{ all -> 0x0081 }
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x0081 }
            r5.<init>(r11)     // Catch:{ all -> 0x0081 }
            r0.f7832V = r5     // Catch:{ all -> 0x0081 }
            goto L_0x008c
        L_0x0081:
            r12 = move-exception
            goto L_0x00f7
        L_0x0084:
            androidx.emoji2.text.z r0 = new androidx.emoji2.text.z     // Catch:{ all -> 0x0081 }
            r5 = r11
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch:{ all -> 0x0081 }
            r0.<init>(r5)     // Catch:{ all -> 0x0081 }
        L_0x008c:
            if (r0 == 0) goto L_0x00bc
            android.text.Spannable r5 = r0.f7832V     // Catch:{ all -> 0x0081 }
            java.lang.Object[] r4 = r5.getSpans(r12, r13, r4)     // Catch:{ all -> 0x0081 }
            androidx.emoji2.text.v[] r4 = (androidx.emoji2.text.v[]) r4     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x00bc
            int r5 = r4.length     // Catch:{ all -> 0x0081 }
            if (r5 <= 0) goto L_0x00bc
            int r5 = r4.length     // Catch:{ all -> 0x0081 }
        L_0x009c:
            if (r1 >= r5) goto L_0x00bc
            r6 = r4[r1]     // Catch:{ all -> 0x0081 }
            android.text.Spannable r7 = r0.f7832V     // Catch:{ all -> 0x0081 }
            int r7 = r7.getSpanStart(r6)     // Catch:{ all -> 0x0081 }
            android.text.Spannable r8 = r0.f7832V     // Catch:{ all -> 0x0081 }
            int r8 = r8.getSpanEnd(r6)     // Catch:{ all -> 0x0081 }
            if (r7 == r13) goto L_0x00b1
            r0.removeSpan(r6)     // Catch:{ all -> 0x0081 }
        L_0x00b1:
            int r12 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x0081 }
            int r13 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00bc:
            r5 = r12
            r6 = r13
            if (r5 == r6) goto L_0x00f3
            int r12 = r11.length()     // Catch:{ all -> 0x0081 }
            if (r5 < r12) goto L_0x00c7
            goto L_0x00f3
        L_0x00c7:
            R2.c r9 = new R2.c     // Catch:{ all -> 0x0081 }
            java.lang.Object r12 = r3.f300V     // Catch:{ all -> 0x0081 }
            a1.a r12 = (a1.C0410a) r12     // Catch:{ all -> 0x0081 }
            r13 = 17
            r9.<init>(r0, r13, r12)     // Catch:{ all -> 0x0081 }
            r8 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            java.lang.Object r12 = r3.w(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
            androidx.emoji2.text.z r12 = (androidx.emoji2.text.z) r12     // Catch:{ all -> 0x0081 }
            if (r12 == 0) goto L_0x00ea
            android.text.Spannable r12 = r12.f7832V     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x00e8
            androidx.emoji2.text.t r11 = (androidx.emoji2.text.t) r11
            r11.b()
        L_0x00e8:
            r11 = r12
            goto L_0x00f6
        L_0x00ea:
            if (r2 == 0) goto L_0x00f6
        L_0x00ec:
            r12 = r11
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.t) r12
            r12.b()
            goto L_0x00f6
        L_0x00f3:
            if (r2 == 0) goto L_0x00f6
            goto L_0x00ec
        L_0x00f6:
            return r11
        L_0x00f7:
            if (r2 == 0) goto L_0x00fe
            androidx.emoji2.text.t r11 = (androidx.emoji2.text.t) r11
            r11.b()
        L_0x00fe:
            throw r12
        L_0x00ff:
            return r11
        L_0x0100:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "end cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x0108:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "start cannot be negative"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(g gVar) {
        a.l(gVar, "initCallback cannot be null");
        this.f7793a.writeLock().lock();
        try {
            if (this.f7795c != 1) {
                if (this.f7795c != 2) {
                    this.f7794b.add(gVar);
                }
            }
            this.f7796d.post(new h(Arrays.asList(new g[]{gVar}), this.f7795c, (Throwable) null));
        } finally {
            this.f7793a.writeLock().unlock();
        }
    }
}
