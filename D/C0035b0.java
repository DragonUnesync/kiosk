package D;

import B.C0002c;
import U.d;
import androidx.lifecycle.A;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: D.b0  reason: case insensitive filesystem */
public final class C0035b0 implements A {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f885a = new AtomicBoolean(true);

    /* renamed from: b  reason: collision with root package name */
    public final d f886b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f887c;

    public C0035b0(Executor executor, d dVar) {
        this.f887c = executor;
        this.f886b = dVar;
    }

    public final void a(Object obj) {
        this.f887c.execute(new C0002c((Object) this, 7, (Object) (C0037c0) obj));
    }
}
