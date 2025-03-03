package l6;

import R.e;
import g7.C0996d;
import p6.C1345a;
import w6.C1593a;

public abstract class b {

    /* renamed from: U  reason: collision with root package name */
    public static final int f13197U = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final void a(c cVar) {
        if (cVar instanceof c) {
            b(cVar);
            return;
        }
        C1345a.a(cVar, "s is null");
        b(new C1593a(cVar));
    }

    public final void b(c cVar) {
        C1345a.a(cVar, "s is null");
        try {
            d(cVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            e.v(th);
            C0996d.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(c cVar);
}
