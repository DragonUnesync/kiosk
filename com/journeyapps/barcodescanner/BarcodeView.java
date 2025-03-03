package com.journeyapps.barcodescanner;

import A1.d;
import B3.o;
import G5.b;
import G5.f;
import G5.j;
import G5.k;
import G5.m;
import G5.r;
import M3.c;
import P0.q;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;

public class BarcodeView extends f {

    /* renamed from: A0  reason: collision with root package name */
    public k f9515A0;

    /* renamed from: B0  reason: collision with root package name */
    public final Handler f9516B0;

    /* renamed from: x0  reason: collision with root package name */
    public int f9517x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public d f9518y0 = null;

    /* renamed from: z0  reason: collision with root package name */
    public m f9519z0;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this, 0);
        this.f9515A0 = new q(0, 1);
        this.f9516B0 = new Handler(bVar);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, G5.l] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, M3.g] */
    /* JADX WARNING: type inference failed for: r2v7, types: [G5.p, G5.j] */
    public final j f() {
        j jVar;
        if (this.f9515A0 == null) {
            this.f9515A0 = new q(0, 1);
        }
        ? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(c.f3133d0, obj);
        q qVar = (q) this.f9515A0;
        qVar.getClass();
        EnumMap enumMap = new EnumMap(c.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) qVar.f3729d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) qVar.f3728c;
        if (set != null) {
            enumMap.put(c.f3126W, set);
        }
        String str = (String) qVar.e;
        if (str != null) {
            enumMap.put(c.f3128Y, str);
        }
        ? obj2 = new Object();
        obj2.d(enumMap);
        int i = qVar.f3727b;
        if (i == 0) {
            jVar = new j(obj2);
        } else if (i == 1) {
            jVar = new j(obj2);
        } else if (i != 2) {
            jVar = new j(obj2);
        } else {
            ? jVar2 = new j(obj2);
            jVar2.f1719c = true;
            jVar = jVar2;
        }
        obj.f1710a = jVar;
        return jVar;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        android.support.v4.media.session.b.U();
        Log.d("f", "pause()");
        this.f1676f0 = -1;
        H5.f fVar = this.f1668U;
        if (fVar != null) {
            android.support.v4.media.session.b.U();
            if (fVar.f2180f) {
                fVar.f2176a.g(fVar.f2185l);
            } else {
                fVar.f2181g = true;
            }
            fVar.f2180f = false;
            this.f1668U = null;
            this.f1674d0 = false;
        } else {
            this.f1670W.sendEmptyMessage(2131362660);
        }
        if (this.f1683m0 == null && (surfaceView = this.f1672b0) != null) {
            surfaceView.getHolder().removeCallback(this.f1689t0);
        }
        if (this.f1683m0 == null && (textureView = this.f1673c0) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f1680j0 = null;
        this.f1681k0 = null;
        this.f1685o0 = null;
        q qVar = this.f1675e0;
        r rVar = (r) qVar.f3729d;
        if (rVar != null) {
            rVar.disable();
        }
        qVar.f3729d = null;
        qVar.f3728c = null;
        qVar.e = null;
        this.f1691v0.j();
    }

    public k getDecoderFactory() {
        return this.f9515A0;
    }

    public final void h() {
        i();
        if (this.f9517x0 != 1 && this.f1674d0) {
            m mVar = new m(getCameraInstance(), f(), this.f9516B0);
            this.f9519z0 = mVar;
            mVar.f1716g = getPreviewFramingRect();
            m mVar2 = this.f9519z0;
            mVar2.getClass();
            android.support.v4.media.session.b.U();
            HandlerThread handlerThread = new HandlerThread("m");
            mVar2.f1714d = handlerThread;
            handlerThread.start();
            mVar2.f1711a = new Handler(((HandlerThread) mVar2.f1714d).getLooper(), (o) mVar2.i);
            mVar2.f1712b = true;
            H5.f fVar = (H5.f) mVar2.f1713c;
            fVar.f2182h.post(new H5.d(fVar, (A.f) mVar2.f1718j, 0));
        }
    }

    public final void i() {
        m mVar = this.f9519z0;
        if (mVar != null) {
            mVar.getClass();
            android.support.v4.media.session.b.U();
            synchronized (mVar.f1717h) {
                mVar.f1712b = false;
                ((Handler) mVar.f1711a).removeCallbacksAndMessages((Object) null);
                ((HandlerThread) mVar.f1714d).quit();
            }
            this.f9519z0 = null;
        }
    }

    public void setDecoderFactory(k kVar) {
        android.support.v4.media.session.b.U();
        this.f9515A0 = kVar;
        m mVar = this.f9519z0;
        if (mVar != null) {
            mVar.f1715f = f();
        }
    }
}
