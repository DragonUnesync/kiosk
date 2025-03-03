package I2;

import A.f;
import B2.h;
import B2.i;
import H2.g;
import H2.n;
import H2.o;
import H2.p;
import H2.q;
import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;

public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final h f2255b = h.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final f f2256a;

    public a(f fVar) {
        this.f2256a = fVar;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        g gVar = (g) obj;
        f fVar = this.f2256a;
        if (fVar != null) {
            o a8 = o.a(gVar);
            n nVar = (n) fVar.f17V;
            Object a9 = nVar.a(a8);
            ArrayDeque arrayDeque = o.f1972b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a8);
            }
            g gVar2 = (g) a9;
            if (gVar2 == null) {
                nVar.f(o.a(gVar), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new p(gVar, new k(gVar, ((Integer) iVar.c(f2255b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
