package de.ozerov.fully;

import O5.a;
import O5.b;
import O5.c;
import O5.d;
import O5.f;
import O5.g;
import O5.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import d4.k;

public final class O {

    /* renamed from: A  reason: collision with root package name */
    public final N f10168A = new N(this, 5);

    /* renamed from: B  reason: collision with root package name */
    public final N f10169B = new N(this, 6);

    /* renamed from: C  reason: collision with root package name */
    public final N f10170C = new N(this, 7);

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10171a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10172b;

    /* renamed from: c  reason: collision with root package name */
    public c f10173c;

    /* renamed from: d  reason: collision with root package name */
    public c f10174d;
    public c e;

    /* renamed from: f  reason: collision with root package name */
    public d f10175f;

    /* renamed from: g  reason: collision with root package name */
    public c f10176g;

    /* renamed from: h  reason: collision with root package name */
    public d f10177h;
    public h i;

    /* renamed from: j  reason: collision with root package name */
    public b f10178j;

    /* renamed from: k  reason: collision with root package name */
    public f f10179k;

    /* renamed from: l  reason: collision with root package name */
    public c f10180l;

    /* renamed from: m  reason: collision with root package name */
    public c f10181m;

    /* renamed from: n  reason: collision with root package name */
    public c f10182n;

    /* renamed from: o  reason: collision with root package name */
    public a f10183o;

    /* renamed from: p  reason: collision with root package name */
    public c f10184p;

    /* renamed from: q  reason: collision with root package name */
    public g f10185q;

    /* renamed from: r  reason: collision with root package name */
    public c f10186r;

    /* renamed from: s  reason: collision with root package name */
    public final M f10187s = new M(0);

    /* renamed from: t  reason: collision with root package name */
    public final N f10188t = new N(this, 0);

    /* renamed from: u  reason: collision with root package name */
    public final N f10189u = new N(this, 1);

    /* renamed from: v  reason: collision with root package name */
    public boolean f10190v = false;

    /* renamed from: w  reason: collision with root package name */
    public final N f10191w = new N(this, 2);

    /* renamed from: x  reason: collision with root package name */
    public final N f10192x = new N(this, 3);

    /* renamed from: y  reason: collision with root package name */
    public boolean f10193y = false;
    public final N z = new N(this, 4);

    public O(FullyActivity fullyActivity) {
        this.f10171a = fullyActivity;
        this.f10172b = new k((Context) fullyActivity, 1);
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        boolean B02 = n2.a.B0();
        FullyActivity fullyActivity = this.f10171a;
        if (B02) {
            fullyActivity.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            fullyActivity.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
