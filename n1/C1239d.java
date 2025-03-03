package n1;

import M0.h0;
import P0.z;
import T0.C0220l;
import V0.i;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import c1.k;

/* renamed from: n1.d  reason: case insensitive filesystem */
public final class C1239d implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final Handler f13576U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1240e f13577V;

    public C1239d(C1240e eVar, k kVar) {
        this.f13577V = eVar;
        Handler m8 = z.m(this);
        this.f13576U = m8;
        kVar.l(this, m8);
    }

    public final void a(long j7) {
        boolean z;
        Surface surface;
        C1240e eVar = this.f13577V;
        if (this == eVar.f13608b2 && eVar.f8817E0 != null) {
            if (j7 == Long.MAX_VALUE) {
                eVar.f8858p1 = true;
                return;
            }
            try {
                eVar.u0(j7);
                h0 h0Var = eVar.f13603W1;
                boolean equals = h0Var.equals(h0.f2952d);
                i iVar = eVar.f13614y1;
                if (!equals && !h0Var.equals(eVar.f13604X1)) {
                    eVar.f13604X1 = h0Var;
                    iVar.c(h0Var);
                }
                eVar.f8862r1.e++;
                r rVar = eVar.f13582B1;
                if (rVar.f13670d != 3) {
                    z = true;
                } else {
                    z = false;
                }
                rVar.f13670d = 3;
                rVar.f13675k.getClass();
                rVar.f13671f = z.O(SystemClock.elapsedRealtime());
                if (z && (surface = eVar.f13590J1) != null) {
                    Handler handler = iVar.f5527b;
                    if (handler != null) {
                        handler.post(new x(iVar, surface, SystemClock.elapsedRealtime()));
                    }
                    eVar.f13593M1 = true;
                }
                eVar.b0(j7);
            } catch (C0220l e) {
                eVar.f8860q1 = e;
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i8 = message.arg2;
        int i9 = z.f3748a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i8)));
        return true;
    }
}
