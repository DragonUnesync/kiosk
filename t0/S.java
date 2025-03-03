package T0;

import U0.d;
import android.util.Pair;
import g1.g;
import h1.C1031B;
import h1.C1053t;
import java.io.IOException;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ T f4723U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Pair f4724V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C1053t f4725W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ g f4726X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ IOException f4727Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f4728Z;

    public /* synthetic */ S(T t8, Pair pair, C1053t tVar, g gVar, IOException iOException, boolean z) {
        this.f4723U = t8;
        this.f4724V = pair;
        this.f4725W = tVar;
        this.f4726X = gVar;
        this.f4727Y = iOException;
        this.f4728Z = z;
    }

    public final void run() {
        Pair pair = this.f4724V;
        ((d) this.f4723U.f4730V.i).k(((Integer) pair.first).intValue(), (C1031B) pair.second, this.f4725W, this.f4726X, this.f4727Y, this.f4728Z);
    }
}
