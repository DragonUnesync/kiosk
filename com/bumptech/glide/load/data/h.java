package com.bumptech.glide.load.data;

import E2.g;
import K2.w;
import L2.a;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

public final class h implements g {

    /* renamed from: W  reason: collision with root package name */
    public static final a f9035W = new a(1);

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9036U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f9037V;

    public h() {
        this.f9036U = 0;
        this.f9037V = new HashMap();
    }

    private final void c() {
    }

    private final void d() {
    }

    public Object a() {
        switch (this.f9036U) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9037V).rewind();
            case 2:
                return this.f9037V;
            default:
                w wVar = (w) this.f9037V;
                wVar.reset();
                return wVar;
        }
    }

    public void b() {
        switch (this.f9036U) {
            case 1:
            case 2:
                return;
            default:
                ((w) this.f9037V).l();
                return;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9037V).rewind();
    }

    public h(InputStream inputStream, g gVar) {
        this.f9036U = 3;
        w wVar = new w(inputStream, gVar);
        this.f9037V = wVar;
        wVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9036U = 1;
        this.f9037V = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f9036U = 2;
        this.f9037V = obj;
    }
}
