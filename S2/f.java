package S2;

import B.q0;
import B2.i;
import D2.D;
import D2.n;
import D2.q;
import D2.u;
import D2.y;
import T2.g;
import U2.a;
import W2.c;
import W2.h;
import W2.m;
import X2.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e;
import de.ozerov.fully.C0734m;
import g7.C0996d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class f implements c, T2.f {

    /* renamed from: C  reason: collision with root package name */
    public static final boolean f4471C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A  reason: collision with root package name */
    public final RuntimeException f4472A;

    /* renamed from: B  reason: collision with root package name */
    public int f4473B;

    /* renamed from: a  reason: collision with root package name */
    public final String f4474a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4475b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4476c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4477d;
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4478f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4479g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f4480h;
    public final a i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4481j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4482k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bumptech.glide.f f4483l;

    /* renamed from: m  reason: collision with root package name */
    public final g f4484m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f4485n;

    /* renamed from: o  reason: collision with root package name */
    public final a f4486o;

    /* renamed from: p  reason: collision with root package name */
    public final F.a f4487p;

    /* renamed from: q  reason: collision with root package name */
    public D f4488q;

    /* renamed from: r  reason: collision with root package name */
    public q0 f4489r;

    /* renamed from: s  reason: collision with root package name */
    public long f4490s;

    /* renamed from: t  reason: collision with root package name */
    public volatile q f4491t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f4492u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f4493v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f4494w;

    /* renamed from: x  reason: collision with root package name */
    public int f4495x;

    /* renamed from: y  reason: collision with root package name */
    public int f4496y;
    public boolean z;

    /* JADX WARNING: type inference failed for: r3v2, types: [X2.d, java.lang.Object] */
    public f(Context context, e eVar, Object obj, Object obj2, Class cls, a aVar, int i8, int i9, com.bumptech.glide.f fVar, g gVar, ArrayList arrayList, d dVar, q qVar, a aVar2) {
        String str;
        e eVar2 = eVar;
        F.a aVar3 = W2.f.f6162a;
        if (f4471C) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.f4474a = str;
        this.f4475b = new Object();
        this.f4476c = obj;
        this.e = context;
        this.f4478f = eVar2;
        this.f4479g = obj2;
        this.f4480h = cls;
        this.i = aVar;
        this.f4481j = i8;
        this.f4482k = i9;
        this.f4483l = fVar;
        this.f4484m = gVar;
        this.f4485n = arrayList;
        this.f4477d = dVar;
        this.f4491t = qVar;
        this.f4486o = aVar2;
        this.f4487p = aVar3;
        this.f4473B = 1;
        if (this.f4472A == null && ((Map) eVar2.f8991h.f6955V).containsKey(com.bumptech.glide.d.class)) {
            this.f4472A = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f4476c) {
            if (this.f4473B == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    public final void b(int i8, int i9) {
        Object obj;
        int i10;
        i iVar;
        boolean z6;
        String str;
        int i11 = i8;
        int i12 = i9;
        this.f4475b.a();
        Object obj2 = this.f4476c;
        synchronized (obj2) {
            try {
                boolean z8 = f4471C;
                if (z8) {
                    h("Got onSizeReady in " + h.a(this.f4490s));
                }
                if (this.f4473B == 3) {
                    this.f4473B = 2;
                    this.i.getClass();
                    if (i11 != Integer.MIN_VALUE) {
                        i11 = Math.round(((float) i11) * 1.0f);
                    }
                    this.f4495x = i11;
                    if (i12 == Integer.MIN_VALUE) {
                        i10 = i12;
                    } else {
                        i10 = Math.round(1.0f * ((float) i12));
                    }
                    this.f4496y = i10;
                    if (z8) {
                        h("finished setup for calling load in " + h.a(this.f4490s));
                    }
                    q qVar = this.f4491t;
                    e eVar = this.f4478f;
                    Object obj3 = this.f4479g;
                    a aVar = this.i;
                    B2.f fVar = aVar.f4457c0;
                    int i13 = this.f4495x;
                    int i14 = this.f4496y;
                    Class cls = aVar.f4461g0;
                    Class cls2 = this.f4480h;
                    com.bumptech.glide.f fVar2 = this.f4483l;
                    n nVar = aVar.f4450V;
                    c cVar = aVar.f4460f0;
                    boolean z9 = aVar.f4458d0;
                    String str2 = "finished onSizeReady in ";
                    boolean z10 = aVar.f4464j0;
                    Object obj4 = obj2;
                    try {
                        iVar = aVar.f4459e0;
                        z6 = aVar.f4454Z;
                        obj = obj4;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        throw th;
                    }
                    try {
                        q0 a8 = qVar.a(eVar, obj3, fVar, i13, i14, cls, cls2, fVar2, nVar, cVar, z9, z10, iVar, z6, aVar.f4465k0, this, this.f4487p);
                        this.f4489r = a8;
                        if (this.f4473B != 2) {
                            this.f4489r = null;
                        }
                        if (z8) {
                            h(str + h.a(this.f4490s));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    public final void c() {
        if (!this.z) {
            this.f4475b.a();
            this.f4484m.d(this);
            q0 q0Var = this.f4489r;
            if (q0Var != null) {
                synchronized (((q) q0Var.f302X)) {
                    ((u) q0Var.f300V).j((f) q0Var.f301W);
                }
                this.f4489r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r5.f4491t.getClass();
        D2.q.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4476c
            monitor-enter(r0)
            boolean r1 = r5.z     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0042
            X2.d r1 = r5.f4475b     // Catch:{ all -> 0x0013 }
            r1.a()     // Catch:{ all -> 0x0013 }
            int r1 = r5.f4473B     // Catch:{ all -> 0x0013 }
            r2 = 6
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x004a
        L_0x0015:
            r5.c()     // Catch:{ all -> 0x0013 }
            D2.D r1 = r5.f4488q     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r5.f4488q = r3     // Catch:{ all -> 0x0013 }
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            S2.d r3 = r5.f4477d     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.h(r5)     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0034
        L_0x002b:
            T2.g r3 = r5.f4484m     // Catch:{ all -> 0x0013 }
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch:{ all -> 0x0013 }
            r3.g(r4)     // Catch:{ all -> 0x0013 }
        L_0x0034:
            r5.f4473B = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0041
            D2.q r0 = r5.f4491t
            r0.getClass()
            D2.q.g(r1)
        L_0x0041:
            return
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x0013 }
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.f.clear():void");
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f4476c) {
            if (this.f4473B == 6) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    public final Drawable e() {
        if (this.f4493v == null) {
            this.f4493v = this.i.f4453Y;
        }
        return this.f4493v;
    }

    public final boolean f() {
        d dVar = this.f4477d;
        if (dVar == null || !dVar.f().a()) {
            return true;
        }
        return false;
    }

    public final void g() {
        synchronized (this.f4476c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str) {
        StringBuilder B8 = N.e.B(str, " this: ");
        B8.append(this.f4474a);
        Log.v("GlideRequest", B8.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4476c
            monitor-enter(r0)
            boolean r1 = r7.z     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x00d0
            X2.d r1 = r7.f4475b     // Catch:{ all -> 0x002d }
            r1.a()     // Catch:{ all -> 0x002d }
            int r1 = W2.h.f6165b     // Catch:{ all -> 0x002d }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x002d }
            r7.f4490s = r1     // Catch:{ all -> 0x002d }
            java.lang.Object r1 = r7.f4479g     // Catch:{ all -> 0x002d }
            r2 = 3
            r3 = 5
            if (r1 != 0) goto L_0x004d
            int r1 = r7.f4481j     // Catch:{ all -> 0x002d }
            int r4 = r7.f4482k     // Catch:{ all -> 0x002d }
            boolean r1 = W2.m.i(r1, r4)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0030
            int r1 = r7.f4481j     // Catch:{ all -> 0x002d }
            r7.f4495x = r1     // Catch:{ all -> 0x002d }
            int r1 = r7.f4482k     // Catch:{ all -> 0x002d }
            r7.f4496y = r1     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            goto L_0x00d8
        L_0x0030:
            android.graphics.drawable.Drawable r1 = r7.f4494w     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x003c
            S2.a r1 = r7.i     // Catch:{ all -> 0x002d }
            r1.getClass()     // Catch:{ all -> 0x002d }
            r1 = 0
            r7.f4494w = r1     // Catch:{ all -> 0x002d }
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r7.f4494w     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0041
            r2 = 5
        L_0x0041:
            D2.y r1 = new D2.y     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x002d }
            r7.j(r1, r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x004d:
            int r1 = r7.f4473B     // Catch:{ all -> 0x002d }
            r4 = 2
            if (r1 == r4) goto L_0x00c8
            r5 = 0
            r6 = 4
            if (r1 != r6) goto L_0x005d
            D2.D r1 = r7.f4488q     // Catch:{ all -> 0x002d }
            r7.m(r1, r3, r5)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x005d:
            java.util.ArrayList r1 = r7.f4485n     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002d }
        L_0x0066:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x002d }
            de.ozerov.fully.m r3 = (de.ozerov.fully.C0734m) r3     // Catch:{ all -> 0x002d }
            goto L_0x0066
        L_0x0073:
            r7.f4473B = r2     // Catch:{ all -> 0x002d }
            int r1 = r7.f4481j     // Catch:{ all -> 0x002d }
            int r3 = r7.f4482k     // Catch:{ all -> 0x002d }
            boolean r1 = W2.m.i(r1, r3)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0087
            int r1 = r7.f4481j     // Catch:{ all -> 0x002d }
            int r3 = r7.f4482k     // Catch:{ all -> 0x002d }
            r7.b(r1, r3)     // Catch:{ all -> 0x002d }
            goto L_0x008c
        L_0x0087:
            T2.g r1 = r7.f4484m     // Catch:{ all -> 0x002d }
            r1.h(r7)     // Catch:{ all -> 0x002d }
        L_0x008c:
            int r1 = r7.f4473B     // Catch:{ all -> 0x002d }
            if (r1 == r4) goto L_0x0092
            if (r1 != r2) goto L_0x00a8
        L_0x0092:
            S2.d r1 = r7.f4477d     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x009c
            boolean r1 = r1.j(r7)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            if (r5 == 0) goto L_0x00a8
            T2.g r1 = r7.f4484m     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r2 = r7.e()     // Catch:{ all -> 0x002d }
            r1.e(r2)     // Catch:{ all -> 0x002d }
        L_0x00a8:
            boolean r1 = f4471C     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x00c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r1.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x002d }
            long r2 = r7.f4490s     // Catch:{ all -> 0x002d }
            double r2 = W2.h.a(r2)     // Catch:{ all -> 0x002d }
            r1.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x002d }
            r7.h(r1)     // Catch:{ all -> 0x002d }
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x00c8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x00d0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.f.i():void");
    }

    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f4476c) {
            int i8 = this.f4473B;
            if (i8 != 2) {
                if (i8 != 3) {
                    z6 = false;
                }
            }
            z6 = true;
        }
        return z6;
    }

    public final void j(y yVar, int i8) {
        Drawable drawable;
        this.f4475b.a();
        synchronized (this.f4476c) {
            try {
                yVar.getClass();
                int i9 = this.f4478f.i;
                if (i9 <= i8) {
                    Log.w("Glide", "Load failed for [" + this.f4479g + "] with dimensions [" + this.f4495x + "x" + this.f4496y + "]", yVar);
                    if (i9 <= 4) {
                        yVar.d();
                    }
                }
                this.f4489r = null;
                this.f4473B = 5;
                d dVar = this.f4477d;
                if (dVar != null) {
                    dVar.e(this);
                }
                boolean z6 = true;
                this.z = true;
                ArrayList arrayList = this.f4485n;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f();
                        ((C0734m) it.next()).a();
                    }
                }
                d dVar2 = this.f4477d;
                if (dVar2 != null) {
                    if (!dVar2.j(this)) {
                        z6 = false;
                    }
                }
                if (z6) {
                    if (this.f4479g == null) {
                        if (this.f4494w == null) {
                            this.i.getClass();
                            this.f4494w = null;
                        }
                        drawable = this.f4494w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f4492u == null) {
                            a aVar = this.i;
                            aVar.getClass();
                            this.f4492u = null;
                            int i10 = aVar.f4452X;
                            if (i10 > 0) {
                                this.i.getClass();
                                Context context = this.e;
                                this.f4492u = C0996d.h(context, context, i10, context.getTheme());
                            }
                        }
                        drawable = this.f4492u;
                    }
                    if (drawable == null) {
                        drawable = e();
                    }
                    this.f4484m.b(drawable);
                }
                this.z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z6;
        synchronized (this.f4476c) {
            if (this.f4473B == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    public final boolean l(c cVar) {
        int i8;
        int i9;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.f fVar;
        int i10;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.f fVar2;
        int i13;
        boolean z6;
        boolean z8;
        c cVar2 = cVar;
        if (!(cVar2 instanceof f)) {
            return false;
        }
        synchronized (this.f4476c) {
            try {
                i8 = this.f4481j;
                i9 = this.f4482k;
                obj = this.f4479g;
                cls = this.f4480h;
                aVar = this.i;
                fVar = this.f4483l;
                ArrayList arrayList = this.f4485n;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
            } finally {
                while (true) {
                }
            }
        }
        f fVar3 = (f) cVar2;
        synchronized (fVar3.f4476c) {
            try {
                i11 = fVar3.f4481j;
                i12 = fVar3.f4482k;
                obj2 = fVar3.f4479g;
                cls2 = fVar3.f4480h;
                aVar2 = fVar3.i;
                fVar2 = fVar3.f4483l;
                ArrayList arrayList2 = fVar3.f4485n;
                if (arrayList2 != null) {
                    i13 = arrayList2.size();
                } else {
                    i13 = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i8 == i11 && i9 == i12) {
            char[] cArr = m.f6173a;
            if (obj != null) {
                z6 = obj.equals(obj2);
            } else if (obj2 == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && cls.equals(cls2)) {
                if (aVar != null) {
                    z8 = aVar.h(aVar2);
                } else if (aVar2 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 && fVar == fVar2 && i10 == i13) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void m(D d8, int i8, boolean z6) {
        Object obj;
        String str;
        this.f4475b.a();
        D d9 = null;
        try {
            synchronized (this.f4476c) {
                this.f4489r = null;
                if (d8 == null) {
                    j(new y("Expected to receive a Resource<R> with an object of " + this.f4480h + " inside, but instead got null."), 5);
                    return;
                }
                Object obj2 = d8.get();
                if (obj2 != null) {
                    if (this.f4480h.isAssignableFrom(obj2.getClass())) {
                        d dVar = this.f4477d;
                        if (dVar == null || dVar.b(this)) {
                            try {
                                n(d8, obj2, i8);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } else {
                            try {
                                this.f4488q = null;
                                this.f4473B = 4;
                                this.f4491t.getClass();
                                q.g(d8);
                                return;
                            } catch (Throwable th2) {
                                d9 = d8;
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
                this.f4488q = null;
                StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                sb.append(this.f4480h);
                sb.append(" but instead got ");
                if (obj2 != null) {
                    obj = obj2.getClass();
                } else {
                    obj = "";
                }
                sb.append(obj);
                sb.append("{");
                sb.append(obj2);
                sb.append("} inside Resource{");
                sb.append(d8);
                sb.append("}.");
                if (obj2 != null) {
                    str = "";
                } else {
                    str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                }
                sb.append(str);
                j(new y(sb.toString()), 5);
                this.f4491t.getClass();
                q.g(d8);
            }
        } catch (Throwable th3) {
            if (d9 != null) {
                this.f4491t.getClass();
                q.g(d9);
            }
            throw th3;
        }
    }

    public final void n(D d8, Object obj, int i8) {
        f();
        this.f4473B = 4;
        this.f4488q = d8;
        if (this.f4478f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + N.e.M(i8) + " for " + this.f4479g + " with size [" + this.f4495x + "x" + this.f4496y + "] in " + h.a(this.f4490s) + " ms");
        }
        d dVar = this.f4477d;
        if (dVar != null) {
            dVar.c(this);
        }
        this.z = true;
        try {
            ArrayList arrayList = this.f4485n;
            g gVar = this.f4484m;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0734m) it.next()).b(obj, gVar);
                }
            }
            this.f4486o.getClass();
            gVar.i(obj);
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f4476c) {
            obj = this.f4479g;
            cls = this.f4480h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
