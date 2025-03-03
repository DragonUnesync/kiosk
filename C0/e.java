package C0;

import P5.C0147j;
import P5.C0150m;
import P6.f;
import Q5.i;
import Z1.c;
import androidx.lifecycle.x;
import b7.C0595a;
import b7.C0597c;
import b7.C0598d;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.U0;
import java.util.Locale;
import java.util.logging.Level;

public final class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f508U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f509V;

    public /* synthetic */ e(int i, Object obj) {
        this.f508U = i;
        this.f509V = obj;
    }

    private final void a() {
        C0147j jVar = (C0147j) this.f509V;
        jVar.f3879b.f9931T0.x(jVar.f3909w, "remote");
        synchronized (this) {
            notify();
        }
    }

    private final void b() {
        C0794w0.O(((C0150m) this.f509V).f3879b);
        synchronized (this) {
            notify();
        }
    }

    private final void c() {
        int i;
        i iVar = (i) this.f509V;
        synchronized (iVar) {
            try {
                if (iVar.f4166h0 != null) {
                    if (iVar.f4158Z != 0) {
                        if (!iVar.u()) {
                            iVar.f4154V.toUpperCase(Locale.ENGLISH);
                            i = -2;
                        } else {
                            int i8 = iVar.f4173o0;
                            iVar.f4173o0 = i8 + 1;
                            if (i8 >= iVar.f4158Z) {
                                iVar.f4154V.toUpperCase(Locale.ENGLISH);
                                i = -1;
                            } else {
                                return;
                            }
                        }
                        if (iVar.f4181x0 != null) {
                            iVar.x(iVar.f4181x0, i, iVar.f4182y0, iVar.f4183z0);
                        }
                        iVar.f4181x0 = null;
                        iVar.f4182y0 = null;
                        iVar.f4183z0 = null;
                        iVar.f4170l0 = true;
                        iVar.f4169k0 = false;
                        iVar.f4166h0.shutdown();
                        iVar.f4166h0 = null;
                        iVar.v();
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    private final void d() {
        synchronized (((i) this.f509V).f4175r0) {
            try {
                if (((i) this.f509V).f4172n0 > 0) {
                    ((i) this.f509V).f4153U.postDelayed(this, 1000);
                } else {
                    ((i) this.f509V).f4145A0.quitSafely();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        Object obj;
        synchronized (((x) this.f509V).f8168a) {
            obj = ((x) this.f509V).f8172f;
            ((x) this.f509V).f8172f = x.f8167k;
        }
        ((x) this.f509V).j(obj);
    }

    private final void f() {
        C0595a c8;
        long j7;
        while (true) {
            C0598d dVar = (C0598d) this.f509V;
            synchronized (dVar) {
                c8 = dVar.c();
            }
            if (c8 != null) {
                C0597c cVar = c8.f8687c;
                f.b(cVar);
                C0598d dVar2 = (C0598d) this.f509V;
                boolean isLoggable = C0598d.i.isLoggable(Level.FINE);
                if (isLoggable) {
                    c cVar2 = cVar.f8690a.f8696a;
                    j7 = System.nanoTime();
                    com.bumptech.glide.c.a(c8, cVar, "starting");
                } else {
                    j7 = -1;
                }
                try {
                    C0598d.a(dVar2, c8);
                    if (isLoggable) {
                        c cVar3 = cVar.f8690a.f8696a;
                        com.bumptech.glide.c.a(c8, cVar, "finished run in ".concat(com.bumptech.glide.c.h(System.nanoTime() - j7)));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        c cVar4 = cVar.f8690a.f8696a;
                        com.bumptech.glide.c.a(c8, cVar, "failed a run in ".concat(com.bumptech.glide.c.h(System.nanoTime() - j7)));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    private final void g() {
        C0794w0.O(((U0) this.f509V).f10414a);
        synchronized (this) {
            notify();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        F.h.m("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.lang.Object r2 = r10.f509V     // Catch:{ all -> 0x0055 }
            F.i r2 = (F.i) r2     // Catch:{ all -> 0x0055 }
            java.util.ArrayDeque r2 = r2.f1415U     // Catch:{ all -> 0x0055 }
            monitor-enter(r2)     // Catch:{ all -> 0x0055 }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.f509V     // Catch:{ all -> 0x0020 }
            F.i r0 = (F.i) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.f1418X     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            goto L_0x006f
        L_0x0022:
            long r6 = r0.f1419Y     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.f1419Y = r6     // Catch:{ all -> 0x0020 }
            r0.f1418X = r5     // Catch:{ all -> 0x0020 }
            r0 = 1
        L_0x002c:
            java.lang.Object r4 = r10.f509V     // Catch:{ all -> 0x0020 }
            F.i r4 = (F.i) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.f1415U     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004b
            java.lang.Object r0 = r10.f509V     // Catch:{ all -> 0x0020 }
            F.i r0 = (F.i) r0     // Catch:{ all -> 0x0020 }
            r0.f1418X = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004a:
            return
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0055 }
            r1 = r1 | r2
            r4.run()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x0002
        L_0x0055:
            r0 = move-exception
            goto L_0x0071
        L_0x0057:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r5.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch:{ all -> 0x0055 }
            r5.append(r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0055 }
            F.h.m(r3, r4, r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0002
        L_0x006f:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0071:
            if (r1 == 0) goto L_0x007a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x007a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.h():void");
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [l1.n, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r2 = 1
            r0 = 0
            r3 = 0
            int r4 = r1.f508U
            switch(r4) {
                case 0: goto L_0x0206;
                case 1: goto L_0x01f7;
                case 2: goto L_0x01da;
                case 3: goto L_0x01be;
                case 4: goto L_0x01a6;
                case 5: goto L_0x019e;
                case 6: goto L_0x0195;
                case 7: goto L_0x0191;
                case 8: goto L_0x018d;
                case 9: goto L_0x0189;
                case 10: goto L_0x0185;
                case 11: goto L_0x015d;
                case 12: goto L_0x0151;
                case 13: goto L_0x0141;
                case 14: goto L_0x0139;
                case 15: goto L_0x0135;
                case 16: goto L_0x0131;
                case 17: goto L_0x0127;
                case 18: goto L_0x0123;
                case 19: goto L_0x00ea;
                case 20: goto L_0x00df;
                case 21: goto L_0x00ba;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00aa;
                case 24: goto L_0x00a2;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r1.f509V
            y0.d r0 = (y0.C1618d) r0
            boolean r2 = r0.f16355i0
            if (r2 != 0) goto L_0x0014
            goto L_0x0099
        L_0x0014:
            boolean r2 = r0.f16353g0
            y0.a r4 = r0.f16341U
            if (r2 == 0) goto L_0x002c
            r0.f16353g0 = r3
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r4.e = r5
            r7 = -1
            r4.f16338g = r7
            r4.f16337f = r5
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.f16339h = r2
        L_0x002c:
            long r5 = r4.f16338g
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0043
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r9 = r4.f16338g
            int r2 = r4.i
            long r11 = (long) r2
            long r9 = r9 + r11
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            boolean r2 = r0.e()
            if (r2 != 0) goto L_0x004c
        L_0x0049:
            r0.f16355i0 = r3
            goto L_0x0099
        L_0x004c:
            boolean r2 = r0.f16354h0
            android.widget.ListView r5 = r0.f16343W
            if (r2 == 0) goto L_0x0068
            r0.f16354h0 = r3
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r5.onTouchEvent(r2)
            r2.recycle()
        L_0x0068:
            long r2 = r4.f16337f
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x009a
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r6 = r4.a(r2)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r6
            float r7 = r7 * r6
            r8 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r8
            float r6 = r6 + r7
            long r7 = r4.f16337f
            long r7 = r2 - r7
            r4.f16337f = r2
            float r2 = (float) r7
            float r2 = r2 * r6
            float r3 = r4.f16336d
            float r2 = r2 * r3
            int r2 = (int) r2
            o.u0 r0 = r0.f16357k0
            r0.scrollListBy(r2)
            java.util.WeakHashMap r0 = v0.C1510H.f15874a
            r5.postOnAnimation(r1)
        L_0x0099:
            return
        L_0x009a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r2)
            throw r0
        L_0x00a2:
            java.lang.Object r0 = r1.f509V
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.v()
            return
        L_0x00aa:
            java.lang.Object r2 = r1.f509V
            o.u0 r2 = (o.C1297u0) r2
            r2.f14096i0 = r0
            r2.drawableStateChanged()
            return
        L_0x00b4:
            java.lang.Object r0 = r1.f509V
            r0.c()
            return
        L_0x00ba:
            java.lang.Object r0 = r1.f509V
            A3.g r0 = (A3.g) r0
            r0.f91c = r3
            h0.a r2 = r0.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            C0.f r3 = r2.f9175M
            if (r3 == 0) goto L_0x00d4
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x00d4
            int r2 = r0.f90b
            r0.a(r2)
            goto L_0x00de
        L_0x00d4:
            int r3 = r2.f9174L
            r4 = 2
            if (r3 != r4) goto L_0x00de
            int r0 = r0.f90b
            r2.C(r0)
        L_0x00de:
            return
        L_0x00df:
            java.lang.Object r0 = r1.f509V
            j.e r0 = (j.e) r0
            r0.a(r2)
            r0.invalidateSelf()
            return
        L_0x00ea:
            java.lang.Object r2 = r1.f509V
            h.H r2 = (h.C1007H) r2
            h.w r4 = r2.f12114b
            android.view.Menu r2 = r2.V()
            boolean r5 = r2 instanceof n.m
            if (r5 == 0) goto L_0x00fc
            r5 = r2
            n.m r5 = (n.m) r5
            goto L_0x00fd
        L_0x00fc:
            r5 = r0
        L_0x00fd:
            if (r5 == 0) goto L_0x0102
            r5.w()
        L_0x0102:
            r2.clear()     // Catch:{ all -> 0x0112 }
            boolean r6 = r4.onCreatePanelMenu(r3, r2)     // Catch:{ all -> 0x0112 }
            if (r6 == 0) goto L_0x0114
            boolean r0 = r4.onPreparePanel(r3, r0, r2)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0117
            goto L_0x0114
        L_0x0112:
            r0 = move-exception
            goto L_0x011d
        L_0x0114:
            r2.clear()     // Catch:{ all -> 0x0112 }
        L_0x0117:
            if (r5 == 0) goto L_0x011c
            r5.v()
        L_0x011c:
            return
        L_0x011d:
            if (r5 == 0) goto L_0x0122
            r5.v()
        L_0x0122:
            throw r0
        L_0x0123:
            r17.g()
            return
        L_0x0127:
            java.lang.Object r0 = r1.f509V
            com.bumptech.glide.o r0 = (com.bumptech.glide.o) r0
            com.bumptech.glide.manager.g r2 = r0.f9089W
            r2.a(r0)
            return
        L_0x0131:
            r17.f()
            return
        L_0x0135:
            r17.e()
            return
        L_0x0139:
            java.lang.Object r0 = r1.f509V
            androidx.fragment.app.L r0 = (androidx.fragment.app.L) r0
            r0.z(r2)
            return
        L_0x0141:
            java.lang.Object r0 = r1.f509V
            androidx.fragment.app.v r0 = (androidx.fragment.app.C0470v) r0
            androidx.fragment.app.u r2 = r0.f8048D0
            if (r2 == 0) goto L_0x0150
            androidx.fragment.app.u r0 = r0.g()
            r0.getClass()
        L_0x0150:
            return
        L_0x0151:
            java.lang.Object r0 = r1.f509V
            androidx.fragment.app.r r0 = (androidx.fragment.app.r) r0
            androidx.fragment.app.o r2 = r0.f8021S0
            android.app.Dialog r0 = r0.f8029a1
            r2.onDismiss(r0)
            return
        L_0x015d:
            java.lang.Object r0 = r1.f509V     // Catch:{ IllegalStateException -> 0x0167, NullPointerException -> 0x0165 }
            androidx.activity.k r0 = (androidx.activity.k) r0     // Catch:{ IllegalStateException -> 0x0167, NullPointerException -> 0x0165 }
            C0.e.super.onBackPressed()     // Catch:{ IllegalStateException -> 0x0167, NullPointerException -> 0x0165 }
            goto L_0x0183
        L_0x0165:
            r0 = move-exception
            goto L_0x0169
        L_0x0167:
            r0 = move-exception
            goto L_0x0177
        L_0x0169:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0176
            goto L_0x0183
        L_0x0176:
            throw r0
        L_0x0177:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Can not perform this action after onSaveInstanceState"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0184
        L_0x0183:
            return
        L_0x0184:
            throw r0
        L_0x0185:
            r17.d()
            return
        L_0x0189:
            r17.c()
            return
        L_0x018d:
            r17.b()
            return
        L_0x0191:
            r17.a()
            return
        L_0x0195:
            java.lang.Object r2 = r1.f509V
            G.m r2 = (G.m) r2
            r2.f1620V = r0
            r2.f1619U = r0
            return
        L_0x019e:
            java.lang.Object r0 = r1.f509V
            L3.b r0 = (L3.b) r0
            r0.cancel(r2)
            return
        L_0x01a6:
            r17.h()     // Catch:{ Error -> 0x01aa }
            return
        L_0x01aa:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r1.f509V
            F.i r0 = (F.i) r0
            java.util.ArrayDeque r4 = r0.f1415U
            monitor-enter(r4)
            java.lang.Object r0 = r1.f509V     // Catch:{ all -> 0x01bb }
            F.i r0 = (F.i) r0     // Catch:{ all -> 0x01bb }
            r0.f1418X = r2     // Catch:{ all -> 0x01bb }
            monitor-exit(r4)     // Catch:{ all -> 0x01bb }
            throw r3
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01bb }
            throw r0
        L_0x01be:
            java.lang.Object r2 = r1.f509V
            B.q0 r2 = (B.q0) r2
            java.lang.Object r3 = r2.f302X
            F.d r3 = (F.d) r3
            java.util.concurrent.atomic.AtomicReference r3 = r3.f1395U
            java.lang.Object r0 = r3.getAndSet(r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r0 = r2.f300V
            android.os.Handler r0 = (android.os.Handler) r0
            java.lang.Object r2 = r2.f302X
            F.d r2 = (F.d) r2
            r0.removeCallbacks(r2)
        L_0x01d9:
            return
        L_0x01da:
            java.lang.Object r0 = r1.f509V
            B3.q r0 = (B3.q) r0
            r0.getClass()
        L_0x01e1:
            java.lang.Object r2 = r0.f451W     // Catch:{ InterruptedException -> 0x01ef }
            java.lang.ref.ReferenceQueue r2 = (java.lang.ref.ReferenceQueue) r2     // Catch:{ InterruptedException -> 0x01ef }
            java.lang.ref.Reference r2 = r2.remove()     // Catch:{ InterruptedException -> 0x01ef }
            D2.c r2 = (D2.C0074c) r2     // Catch:{ InterruptedException -> 0x01ef }
            r0.q(r2)     // Catch:{ InterruptedException -> 0x01ef }
            goto L_0x01e1
        L_0x01ef:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L_0x01e1
        L_0x01f7:
            java.lang.Object r0 = r1.f509V
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            C3.s r0 = r0.f9420W
            com.google.android.material.internal.CheckableImageButton r0 = r0.f625d0
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x0206:
            java.lang.Object r0 = r1.f509V
            C0.f r0 = (C0.f) r0
            r0.n(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.run():void");
    }
}
