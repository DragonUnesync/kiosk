package B;

import D.Y;
import D.Z;
import F.h;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import com.bumptech.glide.manager.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class b0 implements Z, C0024z {

    /* renamed from: U  reason: collision with root package name */
    public final Object f216U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final a0 f217V = new a0(0, this);

    /* renamed from: W  reason: collision with root package name */
    public int f218W = 0;

    /* renamed from: X  reason: collision with root package name */
    public final B f219X = new B(1, this);

    /* renamed from: Y  reason: collision with root package name */
    public boolean f220Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public final q f221Z;

    /* renamed from: a0  reason: collision with root package name */
    public Y f222a0;

    /* renamed from: b0  reason: collision with root package name */
    public Executor f223b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LongSparseArray f224c0 = new LongSparseArray();

    /* renamed from: d0  reason: collision with root package name */
    public final LongSparseArray f225d0 = new LongSparseArray();

    /* renamed from: e0  reason: collision with root package name */
    public int f226e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f227f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f228g0 = new ArrayList();

    public b0(int i, int i8, int i9, int i10) {
        q qVar = new q(ImageReader.newInstance(i, i8, i9, i10));
        this.f221Z = qVar;
        this.f226e0 = 0;
        this.f227f0 = new ArrayList(D());
    }

    public final void C() {
        synchronized (this.f216U) {
            this.f221Z.C();
            this.f222a0 = null;
            this.f223b0 = null;
            this.f218W = 0;
        }
    }

    public final int D() {
        int D8;
        synchronized (this.f216U) {
            D8 = this.f221Z.D();
        }
        return D8;
    }

    public final void E(Y y8, Executor executor) {
        synchronized (this.f216U) {
            y8.getClass();
            this.f222a0 = y8;
            executor.getClass();
            this.f223b0 = executor;
            this.f221Z.E(this.f219X, executor);
        }
    }

    public final W F() {
        synchronized (this.f216U) {
            try {
                if (this.f227f0.isEmpty()) {
                    return null;
                }
                if (this.f226e0 < this.f227f0.size()) {
                    ArrayList arrayList = this.f227f0;
                    int i = this.f226e0;
                    this.f226e0 = i + 1;
                    W w2 = (W) arrayList.get(i);
                    this.f228g0.add(w2);
                    return w2;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(A a8) {
        synchronized (this.f216U) {
            d(a8);
        }
    }

    public final int b() {
        int b8;
        synchronized (this.f216U) {
            b8 = this.f221Z.b();
        }
        return b8;
    }

    public final int c() {
        int c8;
        synchronized (this.f216U) {
            c8 = this.f221Z.c();
        }
        return c8;
    }

    public final void close() {
        synchronized (this.f216U) {
            try {
                if (!this.f220Y) {
                    Iterator it = new ArrayList(this.f227f0).iterator();
                    while (it.hasNext()) {
                        ((W) it.next()).close();
                    }
                    this.f227f0.clear();
                    this.f221Z.close();
                    this.f220Y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(A a8) {
        synchronized (this.f216U) {
            try {
                int indexOf = this.f227f0.indexOf(a8);
                if (indexOf >= 0) {
                    this.f227f0.remove(indexOf);
                    int i = this.f226e0;
                    if (indexOf <= i) {
                        this.f226e0 = i - 1;
                    }
                }
                this.f228g0.remove(a8);
                if (this.f218W > 0) {
                    f(this.f221Z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(k0 k0Var) {
        Y y8;
        Executor executor;
        synchronized (this.f216U) {
            try {
                if (this.f227f0.size() < D()) {
                    k0Var.k(this);
                    this.f227f0.add(k0Var);
                    y8 = this.f222a0;
                    executor = this.f223b0;
                } else {
                    h.j("TAG", "Maximum image number reached.");
                    k0Var.close();
                    y8 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (y8 == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C0002c((Object) this, 2, (Object) y8));
        } else {
            y8.e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(D.Z r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f216U
            monitor-enter(r0)
            boolean r1 = r6.f220Y     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r7 = move-exception
            goto L_0x006b
        L_0x000b:
            android.util.LongSparseArray r1 = r6.f225d0     // Catch:{ all -> 0x0009 }
            int r1 = r1.size()     // Catch:{ all -> 0x0009 }
            java.util.ArrayList r2 = r6.f227f0     // Catch:{ all -> 0x0009 }
            int r2 = r2.size()     // Catch:{ all -> 0x0009 }
            int r1 = r1 + r2
            int r2 = r7.D()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0027
            java.lang.String r7 = "MetadataImageReader"
            java.lang.String r1 = "Skip to acquire the next image because the acquired image count has reached the max images count."
            F.h.j(r7, r1)     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0027:
            B.W r2 = r7.F()     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x005c
            int r3 = r6.f218W     // Catch:{ all -> 0x0009 }
            int r3 = r3 + -1
            r6.f218W = r3     // Catch:{ all -> 0x0009 }
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.f225d0     // Catch:{ all -> 0x0009 }
            B.U r4 = r2.e()     // Catch:{ all -> 0x0009 }
            long r4 = r4.b()     // Catch:{ all -> 0x0009 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0009 }
            r6.g()     // Catch:{ all -> 0x0009 }
            goto L_0x005c
        L_0x0046:
            r7 = move-exception
            goto L_0x006a
        L_0x0048:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            java.lang.String r3 = F.h.G(r3)     // Catch:{ all -> 0x0046 }
            r5 = 3
            boolean r5 = F.h.u(r5, r3)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x005b
            android.util.Log.d(r3, r4, r2)     // Catch:{ all -> 0x0046 }
        L_0x005b:
            r2 = 0
        L_0x005c:
            if (r2 == 0) goto L_0x0068
            int r2 = r6.f218W     // Catch:{ all -> 0x0009 }
            if (r2 <= 0) goto L_0x0068
            int r2 = r7.D()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0027
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x006a:
            throw r7     // Catch:{ all -> 0x0009 }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B.b0.f(D.Z):void");
    }

    public final void g() {
        synchronized (this.f216U) {
            try {
                for (int size = this.f224c0.size() - 1; size >= 0; size--) {
                    U u3 = (U) this.f224c0.valueAt(size);
                    long b8 = u3.b();
                    W w2 = (W) this.f225d0.get(b8);
                    if (w2 != null) {
                        this.f225d0.remove(b8);
                        this.f224c0.removeAt(size);
                        e(new k0(w2, (Size) null, u3));
                    }
                }
                h();
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f216U
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.f225d0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x007e
            android.util.LongSparseArray r1 = r7.f224c0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            goto L_0x007e
        L_0x0014:
            android.util.LongSparseArray r1 = r7.f225d0     // Catch:{ all -> 0x005b }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r5 = r7.f224c0     // Catch:{ all -> 0x005b }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x005b }
            r1 = r1 ^ 1
            n2.a.i(r1)     // Catch:{ all -> 0x005b }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            android.util.LongSparseArray r1 = r7.f225d0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x003e:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.f225d0     // Catch:{ all -> 0x005b }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            android.util.LongSparseArray r2 = r7.f225d0     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x005b }
            B.W r2 = (B.W) r2     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r2 = r7.f225d0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r1 = move-exception
            goto L_0x0080
        L_0x005d:
            int r1 = r1 + -1
            goto L_0x003e
        L_0x0060:
            android.util.LongSparseArray r1 = r7.f224c0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x0068:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.f224c0     // Catch:{ all -> 0x005b }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0079
            android.util.LongSparseArray r2 = r7.f224c0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
        L_0x0079:
            int r1 = r1 + -1
            goto L_0x0068
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B.b0.h():void");
    }

    public final Surface j() {
        Surface j7;
        synchronized (this.f216U) {
            j7 = this.f221Z.j();
        }
        return j7;
    }

    public final W o() {
        synchronized (this.f216U) {
            try {
                if (this.f227f0.isEmpty()) {
                    return null;
                }
                if (this.f226e0 < this.f227f0.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < this.f227f0.size() - 1; i++) {
                        if (!this.f228g0.contains(this.f227f0.get(i))) {
                            arrayList.add((W) this.f227f0.get(i));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((W) it.next()).close();
                    }
                    int size = this.f227f0.size();
                    ArrayList arrayList2 = this.f227f0;
                    this.f226e0 = size;
                    W w2 = (W) arrayList2.get(size - 1);
                    this.f228g0.add(w2);
                    return w2;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int t() {
        int t8;
        synchronized (this.f216U) {
            t8 = this.f221Z.t();
        }
        return t8;
    }
}
