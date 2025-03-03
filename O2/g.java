package O2;

import A2.d;
import B2.m;
import D2.n;
import E2.b;
import J2.c;
import S2.a;
import W2.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.e;
import com.bumptech.glide.l;
import com.bumptech.glide.o;
import java.util.ArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final d f3625a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3626b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3627c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final o f3628d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3629f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3630g;

    /* renamed from: h  reason: collision with root package name */
    public l f3631h;
    public e i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3632j;

    /* renamed from: k  reason: collision with root package name */
    public e f3633k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f3634l;

    /* renamed from: m  reason: collision with root package name */
    public e f3635m;

    /* renamed from: n  reason: collision with root package name */
    public int f3636n;

    /* renamed from: o  reason: collision with root package name */
    public int f3637o;

    /* renamed from: p  reason: collision with root package name */
    public int f3638p;

    public g(com.bumptech.glide.b bVar, d dVar, int i8, int i9, Bitmap bitmap) {
        c cVar = c.f2499b;
        b bVar2 = bVar.f8970V;
        e eVar = bVar.f8972X;
        Context baseContext = eVar.getBaseContext();
        f.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        o b8 = com.bumptech.glide.b.a(baseContext).f8974Z.b(baseContext);
        Context baseContext2 = eVar.getBaseContext();
        f.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l z = com.bumptech.glide.b.a(baseContext2).f8974Z.b(baseContext2).m().a(((S2.e) ((S2.e) ((S2.e) new a().e(n.f1132b)).x()).u(true)).o(i8, i9));
        this.f3628d = b8;
        Handler handler = new Handler(Looper.getMainLooper(), new B3.o(3, this));
        this.e = bVar2;
        this.f3626b = handler;
        this.f3631h = z;
        this.f3625a = dVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i8;
        int i9;
        if (this.f3629f && !this.f3630g) {
            e eVar = this.f3635m;
            if (eVar != null) {
                this.f3635m = null;
                b(eVar);
                return;
            }
            this.f3630g = true;
            d dVar = this.f3625a;
            A2.b bVar = dVar.f68l;
            int i10 = bVar.f48c;
            if (i10 <= 0 || (i9 = dVar.f67k) < 0) {
                i8 = 0;
            } else if (i9 < 0 || i9 >= i10) {
                i8 = -1;
            } else {
                i8 = ((A2.a) bVar.e.get(i9)).i;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) i8);
            int i11 = (dVar.f67k + 1) % dVar.f68l.f48c;
            dVar.f67k = i11;
            this.f3633k = new e(this.f3626b, i11, uptimeMillis);
            l F8 = this.f3631h.a((S2.e) new a().t(new V2.b(Double.valueOf(Math.random())))).F(dVar);
            F8.C(this.f3633k, F8);
        }
    }

    public final void b(e eVar) {
        int i8;
        this.f3630g = false;
        boolean z = this.f3632j;
        Handler handler = this.f3626b;
        if (z) {
            handler.obtainMessage(2, eVar).sendToTarget();
        } else if (!this.f3629f) {
            this.f3635m = eVar;
        } else {
            if (eVar.f3624a0 != null) {
                Bitmap bitmap = this.f3634l;
                if (bitmap != null) {
                    this.e.h(bitmap);
                    this.f3634l = null;
                }
                e eVar2 = this.i;
                this.i = eVar;
                ArrayList arrayList = this.f3627c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) ((f) arrayList.get(size));
                    Drawable.Callback callback = cVar.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        cVar.stop();
                        cVar.invalidateSelf();
                    } else {
                        cVar.invalidateSelf();
                        g gVar = (g) cVar.f3610U.f3609b;
                        e eVar3 = gVar.i;
                        if (eVar3 != null) {
                            i8 = eVar3.f3622Y;
                        } else {
                            i8 = -1;
                        }
                        if (i8 == gVar.f3625a.f68l.f48c - 1) {
                            cVar.f3615Z++;
                        }
                        int i9 = cVar.f3616a0;
                        if (i9 != -1 && cVar.f3615Z >= i9) {
                            cVar.stop();
                        }
                    }
                }
                if (eVar2 != null) {
                    handler.obtainMessage(2, eVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(m mVar, Bitmap bitmap) {
        f.c(mVar, "Argument must not be null");
        f.c(bitmap, "Argument must not be null");
        this.f3634l = bitmap;
        this.f3631h = this.f3631h.a(new a().v(mVar, true));
        this.f3636n = W2.m.c(bitmap);
        this.f3637o = bitmap.getWidth();
        this.f3638p = bitmap.getHeight();
    }
}
