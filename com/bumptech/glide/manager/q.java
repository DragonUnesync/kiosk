package com.bumptech.glide.manager;

import B.C0000a;
import B.C0001b;
import B.C0022x;
import B.W;
import D.Y;
import D.Z;
import D.s0;
import D2.p;
import E.e;
import F.h;
import F.i;
import P6.f;
import S2.c;
import T0.C0209a;
import T0.C0229v;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.activity.d;
import androidx.activity.j;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import b2.C0523b;
import b2.C0525d;
import b2.C0526e;
import b2.C0527f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import k2.C1160q;
import n2.a;
import q.C1351d;
import q.C1353f;
import v.k;
import w.b;

public final class q implements Z {

    /* renamed from: Y  reason: collision with root package name */
    public static volatile q f9078Y;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9079U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f9080V;

    /* renamed from: W  reason: collision with root package name */
    public Object f9081W;

    /* renamed from: X  reason: collision with root package name */
    public Object f9082X;

    public q(int i) {
        this.f9079U = i;
        switch (i) {
            case 7:
                this.f9081W = Collections.newSetFromMap(new WeakHashMap());
                this.f9082X = new HashSet();
                return;
            default:
                return;
        }
    }

    public static boolean a(C0022x xVar, C0022x xVar2) {
        a.m("Fully specified range is not actually fully specified.", xVar2.b());
        int i = xVar.f364a;
        int i8 = xVar2.f364a;
        if (i == 2 && i8 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i8) {
            return false;
        }
        int i9 = xVar.f365b;
        if (i9 == 0 || i9 == xVar2.f365b) {
            return true;
        }
        return false;
    }

    public static boolean d(C0022x xVar, C0022x xVar2, HashSet hashSet) {
        if (hashSet.contains(xVar2)) {
            return a(xVar, xVar2);
        }
        h.j("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + xVar + "\nCandidate dynamic range:\n  " + xVar2);
        return false;
    }

    public static C0022x f(C0022x xVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (xVar.f364a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C0022x xVar2 = (C0022x) it.next();
            a.l(xVar2, "Fully specified DynamicRange cannot be null.");
            a.m("Fully specified DynamicRange must have fully defined encoding.", xVar2.b());
            if (xVar2.f364a != 1 && d(xVar, xVar2, hashSet)) {
                return xVar2;
            }
        }
        return null;
    }

    public static q g(Context context) {
        if (f9078Y == null) {
            synchronized (q.class) {
                try {
                    if (f9078Y == null) {
                        f9078Y = new q(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9078Y;
    }

    public static void m(HashSet hashSet, C0022x xVar, C1160q qVar) {
        a.m("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set c8 = ((b) qVar.f13026V).c(xVar);
        if (!c8.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(c8);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", c8);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + xVar + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    public void C() {
        synchronized (this.f9082X) {
            this.f9080V = true;
            ((ImageReader) this.f9081W).setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public int D() {
        int maxImages;
        synchronized (this.f9082X) {
            maxImages = ((ImageReader) this.f9081W).getMaxImages();
        }
        return maxImages;
    }

    public void E(Y y8, Executor executor) {
        synchronized (this.f9082X) {
            this.f9080V = false;
            ((ImageReader) this.f9081W).setOnImageAvailableListener(new C0001b(this, executor, y8), e.p());
        }
    }

    public W F() {
        Image image;
        synchronized (this.f9082X) {
            try {
                image = ((ImageReader) this.f9081W).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C0000a aVar = new C0000a(image);
            return aVar;
        }
    }

    public int b() {
        int height;
        synchronized (this.f9082X) {
            height = ((ImageReader) this.f9081W).getHeight();
        }
        return height;
    }

    public int c() {
        int width;
        synchronized (this.f9082X) {
            width = ((ImageReader) this.f9081W).getWidth();
        }
        return width;
    }

    public void close() {
        synchronized (this.f9082X) {
            ((ImageReader) this.f9081W).close();
        }
    }

    public boolean e(c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f9081W).remove(cVar);
        if (!((HashSet) this.f9082X).remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    public void h() {
        C0527f fVar = (C0527f) this.f9081W;
        t e = fVar.e();
        if (e.f8156c == C0486m.f8146V) {
            e.a(new Recreator(fVar));
            C0526e eVar = (C0526e) this.f9082X;
            eVar.getClass();
            if (!eVar.f8648a) {
                e.a(new C0523b(eVar));
                eVar.f8648a = true;
                this.f9080V = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void i(Bundle bundle) {
        Bundle bundle2;
        if (!this.f9080V) {
            h();
        }
        t e = ((C0527f) this.f9081W).e();
        if (e.f8156c.compareTo(C0486m.f8148X) < 0) {
            C0526e eVar = (C0526e) this.f9082X;
            if (!eVar.f8648a) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!eVar.f8649b) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                eVar.e = bundle2;
                eVar.f8649b = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e.f8156c).toString());
        }
    }

    public Surface j() {
        Surface surface;
        synchronized (this.f9082X) {
            surface = ((ImageReader) this.f9081W).getSurface();
        }
        return surface;
    }

    public void k(Bundle bundle) {
        f.e(bundle, "outBundle");
        C0526e eVar = (C0526e) this.f9082X;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1353f fVar = (C1353f) eVar.f8651d;
        fVar.getClass();
        C1351d dVar = new C1351d(fVar);
        fVar.f14699W.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C0525d) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void l() {
        if (this.f9080V) {
            ((Context) this.f9081W).unregisterReceiver((C0209a) this.f9082X);
            this.f9080V = false;
        }
    }

    public W o() {
        Image image;
        synchronized (this.f9082X) {
            try {
                image = ((ImageReader) this.f9081W).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C0000a aVar = new C0000a(image);
            return aVar;
        }
    }

    public int t() {
        int imageFormat;
        synchronized (this.f9082X) {
            imageFormat = ((ImageReader) this.f9081W).getImageFormat();
        }
        return imageFormat;
    }

    public String toString() {
        switch (this.f9079U) {
            case 7:
                return super.toString() + "{numRequests=" + ((Set) this.f9081W).size() + ", isPaused=" + this.f9080V + "}";
            default:
                return super.toString();
        }
    }

    public q(C0527f fVar) {
        this.f9079U = 6;
        this.f9081W = fVar;
        this.f9082X = new C0526e();
    }

    public q(Context context, Handler handler, C0229v vVar) {
        this.f9079U = 3;
        this.f9081W = context.getApplicationContext();
        this.f9082X = new C0209a(this, handler, vVar);
    }

    public q(ImageReader imageReader) {
        this.f9079U = 1;
        this.f9082X = new Object();
        this.f9080V = true;
        this.f9081W = imageReader;
    }

    public q(j jVar, d dVar) {
        this.f9079U = 5;
        this.f9081W = new Object();
        this.f9082X = new ArrayList();
    }

    public q(Executor executor) {
        this.f9079U = 2;
        s0 s0Var = J.a.f2336a;
        if (J.a.f2336a.j(LowMemoryQuirk.class) != null) {
            this.f9081W = new i(executor);
        } else {
            this.f9081W = executor;
        }
        this.f9082X = s0Var;
        this.f9080V = s0Var.h(IncorrectJpegMetadataQuirk.class);
    }

    public q(Context context) {
        Object obj;
        this.f9079U = 0;
        this.f9082X = new HashSet();
        p pVar = new p(new F2.e(context, 12, false));
        l lVar = new l(this);
        if (Build.VERSION.SDK_INT >= 24) {
            obj = new com.bumptech.glide.j(pVar, lVar);
        } else {
            obj = new p(context, pVar, lVar);
        }
        this.f9081W = obj;
    }

    public q(k kVar) {
        this.f9079U = 8;
        this.f9081W = kVar;
        this.f9082X = C1160q.G(kVar);
        int[] iArr = (int[]) kVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f9080V = z;
    }
}
