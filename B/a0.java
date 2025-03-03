package B;

import A.d;
import D.C0;
import D.C0054l;
import D.C0064s;
import D7.b;
import H.c;
import Q.g;
import Q.h;
import java.util.Iterator;

public final class a0 extends C0054l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f212b;

    public /* synthetic */ a0(int i, Object obj) {
        this.f211a = i;
        this.f212b = obj;
    }

    public void b(int i, C0064s sVar) {
        switch (this.f211a) {
            case 0:
                b0 b0Var = (b0) this.f212b;
                synchronized (b0Var.f216U) {
                    try {
                        if (!b0Var.f220Y) {
                            b0Var.f224c0.put(sVar.b(), new c(sVar));
                            b0Var.g();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                Iterator it = ((g) this.f212b).f3991U.iterator();
                while (it.hasNext()) {
                    C0 c02 = ((v0) it.next()).f346m;
                    for (C0054l b8 : c02.f752g.f791d) {
                        b8.b(i, new h(sVar, c02.f752g.f792f, -1));
                    }
                }
                return;
            default:
                return;
        }
    }

    public void d(int i) {
        switch (this.f211a) {
            case 1:
                b.H().execute(new d(4, this));
                return;
            default:
                return;
        }
    }
}
