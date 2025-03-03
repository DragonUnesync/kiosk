package E2;

import W2.m;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import z3.e;

public final class h implements b {

    /* renamed from: d0  reason: collision with root package name */
    public static final Bitmap.Config f1343d0 = Bitmap.Config.ARGB_8888;

    /* renamed from: U  reason: collision with root package name */
    public final l f1344U;

    /* renamed from: V  reason: collision with root package name */
    public final Set f1345V;

    /* renamed from: W  reason: collision with root package name */
    public final e f1346W;

    /* renamed from: X  reason: collision with root package name */
    public final long f1347X;

    /* renamed from: Y  reason: collision with root package name */
    public long f1348Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1349Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f1350a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1351b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1352c0;

    public h(long j7) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.f1347X = j7;
        this.f1344U = lVar;
        this.f1345V = unmodifiableSet;
        this.f1346W = new e(23);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f1349Z + ", misses=" + this.f1350a0 + ", puts=" + this.f1351b0 + ", evictions=" + this.f1352c0 + ", currentSize=" + this.f1348Y + ", maxSize=" + this.f1347X + "\nStrategy=" + this.f1344U);
    }

    public final synchronized Bitmap b(int i, int i8, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b8;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            l lVar = this.f1344U;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f1343d0;
            }
            b8 = lVar.b(i, i8, config2);
            if (b8 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f1344U.getClass();
                    sb.append(l.c(m.d(config) * i * i8, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f1350a0++;
            } else {
                this.f1349Z++;
                long j7 = this.f1348Y;
                this.f1344U.getClass();
                this.f1348Y = j7 - ((long) m.c(b8));
                this.f1346W.getClass();
                b8.setHasAlpha(true);
                b8.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f1344U.getClass();
                sb2.append(l.c(m.d(config) * i * i8, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b8;
    }

    public final synchronized void c(long j7) {
        while (this.f1348Y > j7) {
            try {
                l lVar = this.f1344U;
                Bitmap bitmap = (Bitmap) lVar.f1362b.I();
                if (bitmap != null) {
                    lVar.a(Integer.valueOf(m.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f1348Y = 0;
                    return;
                }
                this.f1346W.getClass();
                long j8 = this.f1348Y;
                this.f1344U.getClass();
                this.f1348Y = j8 - ((long) m.c(bitmap));
                this.f1352c0++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f1344U.getClass();
                    sb.append(l.c(m.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final Bitmap e(int i, int i8, Bitmap.Config config) {
        Bitmap b8 = b(i, i8, config);
        if (b8 != null) {
            return b8;
        }
        if (config == null) {
            config = f1343d0;
        }
        return Bitmap.createBitmap(i, i8, config);
    }

    public final Bitmap g(int i, int i8, Bitmap.Config config) {
        Bitmap b8 = b(i, i8, config);
        if (b8 != null) {
            b8.eraseColor(0);
            return b8;
        }
        if (config == null) {
            config = f1343d0;
        }
        return Bitmap.createBitmap(i, i8, config);
    }

    public final synchronized void h(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        this.f1344U.getClass();
                        if (((long) m.c(bitmap)) <= this.f1347X) {
                            if (this.f1345V.contains(bitmap.getConfig())) {
                                this.f1344U.getClass();
                                int c8 = m.c(bitmap);
                                this.f1344U.e(bitmap);
                                this.f1346W.getClass();
                                this.f1351b0++;
                                this.f1348Y += (long) c8;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                                    this.f1344U.getClass();
                                    sb.append(l.c(m.c(bitmap), bitmap.getConfig()));
                                    Log.v("LruBitmapPool", sb.toString());
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    a();
                                }
                                c(this.f1347X);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                        this.f1344U.getClass();
                        sb2.append(l.c(m.c(bitmap), bitmap.getConfig()));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f1345V.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void k(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            l();
        } else if (i >= 20 || i == 15) {
            c(this.f1347X / 2);
        }
    }

    public final void l() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0);
    }
}
