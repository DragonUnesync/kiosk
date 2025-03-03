package com.bumptech.glide;

import D2.p;
import D2.q;
import E2.g;
import K1.i;
import S2.a;
import U2.b;
import Z1.c;
import a1.C0410a;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

public final class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8984k;

    /* renamed from: a  reason: collision with root package name */
    public final g f8985a;

    /* renamed from: b  reason: collision with root package name */
    public final p f8986b;

    /* renamed from: c  reason: collision with root package name */
    public final i f8987c;

    /* renamed from: d  reason: collision with root package name */
    public final C0410a f8988d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final Y.e f8989f;

    /* renamed from: g  reason: collision with root package name */
    public final q f8990g;

    /* renamed from: h  reason: collision with root package name */
    public final c f8991h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public S2.e f8992j;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.f8966U = b.f5420a;
        f8984k = obj;
    }

    public e(Context context, g gVar, j jVar, i iVar, C0410a aVar, Y.e eVar, List list, q qVar, c cVar, int i8) {
        super(context.getApplicationContext());
        this.f8985a = gVar;
        this.f8987c = iVar;
        this.f8988d = aVar;
        this.e = list;
        this.f8989f = eVar;
        this.f8990g = qVar;
        this.f8991h = cVar;
        this.i = i8;
        this.f8986b = new p(jVar);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [S2.e, S2.a] */
    public final synchronized S2.e a() {
        try {
            if (this.f8992j == null) {
                this.f8988d.getClass();
                ? aVar = new a();
                aVar.f4462h0 = true;
                this.f8992j = aVar;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f8992j;
    }

    public final i b() {
        return (i) this.f8986b.get();
    }
}
