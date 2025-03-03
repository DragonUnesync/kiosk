package T0;

import M0.C0117e;
import P0.t;
import P0.z;
import android.content.Context;
import android.os.Looper;
import org.altbeacon.beacon.service.RangedBeacon;

/* renamed from: T0.m  reason: case insensitive filesystem */
public final class C0221m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4871a;

    /* renamed from: b  reason: collision with root package name */
    public final t f4872b;

    /* renamed from: c  reason: collision with root package name */
    public final C0210b f4873c;

    /* renamed from: d  reason: collision with root package name */
    public final C0210b f4874d;
    public final C0210b e;

    /* renamed from: f  reason: collision with root package name */
    public final C0210b f4875f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f4876g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4877h;
    public final C0117e i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4878j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4879k;

    /* renamed from: l  reason: collision with root package name */
    public final e0 f4880l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4881m;

    /* renamed from: n  reason: collision with root package name */
    public final long f4882n;

    /* renamed from: o  reason: collision with root package name */
    public final long f4883o;

    /* renamed from: p  reason: collision with root package name */
    public final C0216h f4884p;

    /* renamed from: q  reason: collision with root package name */
    public final long f4885q;

    /* renamed from: r  reason: collision with root package name */
    public final long f4886r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f4887s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4888t;

    /* renamed from: u  reason: collision with root package name */
    public final String f4889u;

    public C0221m(Context context) {
        C0210b bVar = new C0210b(context, 1);
        C0210b bVar2 = new C0210b(context, 2);
        C0210b bVar3 = new C0210b(context, 3);
        C0210b bVar4 = new C0210b(context, 4);
        context.getClass();
        this.f4871a = context;
        this.f4873c = bVar;
        this.f4874d = bVar2;
        this.e = bVar3;
        this.f4875f = bVar4;
        int i8 = z.f3748a;
        Looper myLooper = Looper.myLooper();
        this.f4876g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = C0117e.f2938b;
        this.f4878j = 1;
        this.f4879k = true;
        this.f4880l = e0.f4815c;
        this.f4881m = RangedBeacon.DEFAULT_MAX_TRACKING_AGE;
        this.f4882n = 15000;
        this.f4883o = 3000;
        this.f4884p = new C0216h(z.O(20), z.O(500));
        this.f4872b = t.f3738a;
        this.f4885q = 500;
        this.f4886r = 2000;
        this.f4887s = true;
        this.f4889u = "";
        this.f4877h = -1000;
    }
}
