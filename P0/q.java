package P0;

import B.C0003d;
import G5.k;
import M0.C0120h;
import M0.J;
import M3.n;
import N5.f;
import T0.g0;
import T7.C;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.ImageView;
import de.ozerov.fully.K2;
import f1.w;
import f1.x;
import f4.C0901b;
import f4.d;
import g.C0940a;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C1286o0;
import o.C1292s;
import p2.m;
import u.C1477r;
import v0.C1510H;
import v2.c;

public final class q implements k {

    /* renamed from: f  reason: collision with root package name */
    public static q f3724f;

    /* renamed from: g  reason: collision with root package name */
    public static q f3725g;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3726a;

    /* renamed from: b  reason: collision with root package name */
    public int f3727b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3728c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3729d;
    public Object e;

    public /* synthetic */ q(char c8, int i) {
        this.f3726a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r4.f3729d).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (l1.f) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r4.f3729d).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r3, P0.q r4) {
        /*
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            int r1 = r4.f3727b     // Catch:{ all -> 0x0009 }
            if (r1 != r3) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r4.f3727b = r3     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r4.f3729d
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            l1.f r2 = (l1.f) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r3)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r4.f3729d
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.q.b(int, P0.q):void");
    }

    public static t2.k h(t2.k kVar) {
        if (kVar == null || kVar.f15205V.getType() != c.f16059j0) {
            return kVar;
        }
        return t2.k.e(kVar.f15204U, c.f16064o0);
    }

    public static synchronized q j(Context context) {
        q qVar;
        synchronized (q.class) {
            try {
                if (f3724f == null) {
                    f3724f = new q(context);
                }
                qVar = f3724f;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r9 = r6 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r12, int r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            int[] r0 = (int[]) r0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r12 != 0) goto L_0x0010
            if (r3 != 0) goto L_0x0010
            return
        L_0x0010:
            if (r12 < 0) goto L_0x0080
            if (r3 != 0) goto L_0x0017
            int r12 = r0.length
            if (r13 < r12) goto L_0x007f
        L_0x0017:
            int r13 = r13 + r1
            t2.m r12 = new t2.m
            r12.<init>(r13)
            int[] r13 = new int[r13]
            r0 = -1
            java.util.Arrays.fill(r13, r0)
            if (r3 != 0) goto L_0x007b
            java.lang.Object r0 = r11.f3729d
            t2.m r0 = (t2.m) r0
            t2.k[] r1 = r0.f15207V
            int r1 = r1.length
            r3 = 0
        L_0x002d:
            if (r3 >= r1) goto L_0x0073
            t2.k r4 = r0.e(r3)
            if (r4 == 0) goto L_0x0070
            t2.k[] r5 = r12.f15207V
            r12.d()
            if (r4 == 0) goto L_0x0068
            r6 = -1
            r12.f15208W = r6
            int r6 = r4.f15204U     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            r5[r6] = r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            r7 = 0
            r8 = 2
            if (r6 <= 0) goto L_0x0055
            int r9 = r6 + -1
            r10 = r5[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            if (r10 == 0) goto L_0x0055
            int r10 = r10.d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            if (r10 != r8) goto L_0x0055
            r5[r9] = r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
        L_0x0055:
            int r4 = r4.d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            if (r4 != r8) goto L_0x0070
            int r6 = r6 + 1
            r5[r6] = r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
            goto L_0x0070
        L_0x0060:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "spec.getReg() out of range"
            r12.<init>(r13)
            throw r12
        L_0x0068:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "spec == null"
            r12.<init>(r13)
            throw r12
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0073:
            java.lang.Object r0 = r11.e
            int[] r0 = (int[]) r0
            int r1 = r0.length
            java.lang.System.arraycopy(r0, r2, r13, r2, r1)
        L_0x007b:
            r11.f3729d = r12
            r11.e = r13
        L_0x007f:
            return
        L_0x0080:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r13 = "shouldn't happen"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.q.a(int, int):void");
    }

    public void c(int i, int i8, t2.k kVar) {
        if (i8 != 1) {
            int i9 = ((int[]) this.e)[kVar.f15204U];
            if (i9 >= 0) {
                ((m) ((ArrayList) this.f3728c).get(i9)).getClass();
                if (i == 0) {
                    throw null;
                }
            }
            t2.k h5 = h(kVar);
            int i10 = kVar.f15204U;
            a(i, i10);
            if (((int[]) this.e)[i10] < 0) {
                ArrayList arrayList = (ArrayList) this.f3728c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        t2.m mVar = (t2.m) this.f3729d;
                        mVar.getClass();
                        try {
                            mVar.f15207V[h5.f15204U] = null;
                            mVar.f15208W = -1;
                            arrayList.set(size, (Object) null);
                            this.f3727b++;
                            int i11 = size - 1;
                            while (i11 >= 0) {
                                if (((m) arrayList.get(i11)) == null) {
                                    i11--;
                                } else {
                                    throw null;
                                }
                            }
                            return;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new IllegalArgumentException("bogus reg");
                        }
                    } else if (((m) arrayList.get(size)) != null) {
                        if (i != 0) {
                            int i12 = h5.f15204U;
                            new m(i, i8, h5);
                            throw null;
                        }
                        throw null;
                    }
                }
            }
        } else {
            throw new RuntimeException("shouldn't happen");
        }
    }

    public void d(K2 k22) {
        n nVar;
        n nVar2;
        boolean z;
        boolean z6;
        if (k22 != null) {
            d dVar = (d) k22;
            C0120h[] hVarArr = (C0120h[]) dVar.f10051W;
            for (C0120h hVar : hVarArr) {
                if (hVar != null) {
                    hVar.j();
                }
            }
            C0120h hVar2 = (C0120h) this.f3728c;
            dVar.a0(hVarArr, hVar2);
            C0901b bVar = (C0901b) dVar.f10050V;
            boolean z8 = dVar.f11683Z;
            if (z8) {
                nVar = bVar.f11674b;
            } else {
                nVar = bVar.f11676d;
            }
            if (z8) {
                nVar2 = bVar.f11675c;
            } else {
                nVar2 = bVar.e;
            }
            int D8 = dVar.D((int) nVar2.f3165b);
            int i = -1;
            int i8 = 0;
            int i9 = 1;
            for (int D9 = dVar.D((int) nVar.f3165b); D9 < D8; D9++) {
                C0120h hVar3 = hVarArr[D9];
                if (hVar3 != null) {
                    int i10 = hVar3.f2951f;
                    int i11 = i10 - i;
                    if (i11 == 0) {
                        i8++;
                    } else {
                        if (i11 == 1) {
                            i9 = Math.max(i9, i8);
                            i = hVar3.f2951f;
                        } else if (i11 < 0 || i10 >= hVar2.f2951f || i11 > D9) {
                            hVarArr[D9] = null;
                        } else {
                            if (i9 > 2) {
                                i11 *= i9 - 2;
                            }
                            if (i11 >= D9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            for (int i12 = 1; i12 <= i11 && !z; i12++) {
                                if (hVarArr[D9 - i12] != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            }
                            if (z) {
                                hVarArr[D9] = null;
                            } else {
                                i = hVar3.f2951f;
                            }
                        }
                        i8 = 1;
                    }
                }
            }
        }
    }

    public void e() {
        ImageView imageView = (ImageView) this.f3728c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C1286o0.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (((g0) this.e) == null) {
                    this.e = new g0(3);
                }
                g0 g0Var = (g0) this.e;
                g0Var.f4838b = null;
                g0Var.f4840d = false;
                g0Var.e = null;
                g0Var.f4839c = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    g0Var.f4840d = true;
                    g0Var.f4838b = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    g0Var.f4839c = true;
                    g0Var.e = imageTintMode;
                }
                if (g0Var.f4840d || g0Var.f4839c) {
                    C1292s.e(drawable, g0Var, imageView.getDrawableState());
                    return;
                }
            }
            g0 g0Var2 = (g0) this.f3729d;
            if (g0Var2 != null) {
                C1292s.e(drawable, g0Var2, imageView.getDrawableState());
            }
        }
    }

    public void f() {
        synchronized (this.e) {
            try {
                if (((Handler) this.f3728c) == null) {
                    if (this.f3727b > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.f3729d = handlerThread;
                        handlerThread.start();
                        this.f3728c = new Handler(((HandlerThread) this.f3729d).getLooper());
                    } else {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(Runnable runnable) {
        synchronized (this.e) {
            f();
            ((Handler) this.f3728c).post(runnable);
        }
    }

    public String i(C c8, Uri uri, int i) {
        C c9 = c8;
        Uri uri2 = uri;
        int i8 = this.f3727b;
        if (i8 == 1) {
            String encodeToString = Base64.encodeToString((c9.f5077b + ":" + c9.f5078c).getBytes(w.f11625a0), 0);
            int i9 = z.f3748a;
            Locale locale = Locale.US;
            return C1477r.d("Basic ", encodeToString);
        } else if (i8 == 2) {
            String str = (String) this.f3729d;
            String str2 = (String) this.f3728c;
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                String h5 = x.h(i);
                Charset charset = w.f11625a0;
                String b02 = z.b0(instance.digest((z.b0(instance.digest((c9.f5077b + ":" + str2 + ":" + c9.f5078c).getBytes(charset))) + ":" + str + ":" + z.b0(instance.digest((h5 + ":" + uri2).getBytes(charset)))).getBytes(charset)));
                String str3 = (String) this.e;
                if (str3.isEmpty()) {
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", new Object[]{c9.f5077b, str2, str, uri2, b02});
                }
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", new Object[]{c9.f5077b, str2, str, uri2, b02, str3});
            } catch (NoSuchAlgorithmException e8) {
                throw new J((String) null, e8, false, 4);
            }
        } else {
            throw new J((String) null, new UnsupportedOperationException(), false, 4);
        }
    }

    public int k() {
        int i;
        synchronized (this.e) {
            i = this.f3727b;
        }
        return i;
    }

    public int l() {
        int i = this.f3727b;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return 512;
    }

    public void m(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        ImageView imageView = (ImageView) this.f3728c;
        Context context = imageView.getContext();
        int[] iArr = C0940a.f11818f;
        d4.k K22 = d4.k.K2(context, attributeSet, iArr, i);
        C1510H.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) K22.f9767W, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) K22.f9767W;
            if (drawable3 == null) {
                int resourceId = typedArray.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable3 = C0003d.r(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable3);
                }
            }
            if (drawable3 != null) {
                C1286o0.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList v4 = K22.v(2);
                int i8 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(v4);
                if (!(i8 != 21 || (drawable2 = imageView.getDrawable()) == null || imageView.getImageTintList() == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode c8 = C1286o0.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null);
                int i9 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(c8);
                if (!(i9 != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            K22.M2();
        } catch (Throwable th) {
            K22.M2();
            throw th;
        }
    }

    public Looper n() {
        Looper looper;
        boolean z;
        synchronized (this.e) {
            try {
                if (((Looper) this.f3728c) == null) {
                    if (this.f3727b == 0 && ((HandlerThread) this.f3729d) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l.j(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f3729d = handlerThread;
                    handlerThread.start();
                    this.f3728c = ((HandlerThread) this.f3729d).getLooper();
                }
                this.f3727b++;
                looper = (Looper) this.f3728c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void o() {
        synchronized (this.e) {
            ((HandlerThread) this.f3729d).quit();
            this.f3729d = null;
            this.f3728c = null;
        }
    }

    public void p() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.e) {
            try {
                if (this.f3727b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                int i = this.f3727b - 1;
                this.f3727b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f3729d) != null) {
                    handlerThread.quit();
                    this.f3729d = null;
                    this.f3728c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f3726a) {
            case 7:
                K2[] k2Arr = (K2[]) this.f3729d;
                K2 k22 = k2Arr[0];
                int i = this.f3727b;
                if (k22 == null) {
                    k22 = k2Arr[i + 1];
                }
                Formatter formatter = new Formatter();
                int i8 = 0;
                while (i8 < ((C0120h[]) k22.f10051W).length) {
                    try {
                        formatter.format("CW %3d:", new Object[]{Integer.valueOf(i8)});
                        for (int i9 = 0; i9 < i + 2; i9++) {
                            K2 k23 = k2Arr[i9];
                            if (k23 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                C0120h hVar = ((C0120h[]) k23.f10051W)[i8];
                                if (hVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(hVar.f2951f), Integer.valueOf(hVar.e)});
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                        i8++;
                    } catch (Throwable th) {
                        try {
                            formatter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }

    public q(int i, byte b8) {
        this.f3726a = i;
        switch (i) {
            case 4:
                this.e = new Object();
                this.f3728c = null;
                this.f3729d = null;
                this.f3727b = 0;
                return;
            default:
                this.f3727b = 0;
                this.e = new Object();
                return;
        }
    }

    public q(C0120h hVar, C0901b bVar) {
        this.f3726a = 7;
        this.f3728c = hVar;
        int i = hVar.f2948b;
        this.f3727b = i;
        this.e = bVar;
        this.f3729d = new K2[(i + 2)];
    }

    public q(ImageView imageView) {
        this.f3726a = 8;
        this.f3727b = 0;
        this.f3728c = imageView;
    }

    public q(String str, int i, String str2, String str3) {
        this.f3726a = 6;
        this.f3727b = i;
        this.f3728c = str;
        this.f3729d = str2;
        this.e = str3;
    }

    public q(Context context) {
        this.f3726a = 0;
        this.f3728c = new Handler(Looper.getMainLooper());
        this.f3729d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f3727b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new f(2, this), intentFilter);
    }

    public q(int i, String str, int i8, ArrayList arrayList, byte[] bArr) {
        List list;
        this.f3726a = 5;
        this.f3728c = str;
        this.f3727b = i8;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f3729d = list;
        this.e = bArr;
    }

    public q(int i) {
        this.f3726a = 9;
        this.f3728c = new ArrayList(i);
        this.f3727b = 0;
        this.f3729d = null;
        this.e = null;
    }
}
