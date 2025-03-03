package Q3;

import G5.g;
import M0.L;
import P0.t;
import T0.F;
import T0.J;
import T0.f0;
import android.app.Activity;
import android.os.Handler;

public final class f implements J {

    /* renamed from: U  reason: collision with root package name */
    public boolean f4112U = true;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4113V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f4114W;

    /* renamed from: X  reason: collision with root package name */
    public final Object f4115X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f4116Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f4117Z;

    public f(Activity activity, g gVar) {
        this.f4114W = activity;
        this.f4117Z = gVar;
        this.f4115X = new N5.f(3, this);
        this.f4116Y = new Handler();
    }

    public boolean a() {
        if (this.f4112U) {
            ((f0) this.f4114W).getClass();
            return false;
        }
        J j7 = (J) this.f4117Z;
        j7.getClass();
        return j7.a();
    }

    public void b() {
        ((Handler) this.f4116Y).removeCallbacksAndMessages((Object) null);
        if (this.f4112U) {
            ((Activity) this.f4114W).unregisterReceiver((N5.f) this.f4115X);
            this.f4112U = false;
        }
    }

    public L c() {
        J j7 = (J) this.f4117Z;
        if (j7 != null) {
            return j7.c();
        }
        return ((f0) this.f4114W).f4832Y;
    }

    public void d(L l8) {
        J j7 = (J) this.f4117Z;
        if (j7 != null) {
            j7.d(l8);
            l8 = ((J) this.f4117Z).c();
        }
        ((f0) this.f4114W).d(l8);
    }

    public long e() {
        if (this.f4112U) {
            return ((f0) this.f4114W).e();
        }
        J j7 = (J) this.f4117Z;
        j7.getClass();
        return j7.e();
    }

    public f(F f8, t tVar) {
        this.f4115X = f8;
        this.f4114W = new f0(tVar);
    }
}
