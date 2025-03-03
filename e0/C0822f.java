package e0;

import java.util.Iterator;

/* renamed from: e0.f  reason: case insensitive filesystem */
public class C0822f extends C0821e {

    /* renamed from: m  reason: collision with root package name */
    public int f11149m;

    public C0822f(l lVar) {
        super(lVar);
        if (lVar instanceof C0825i) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    public final void d(int i) {
        if (!this.f11146j) {
            this.f11146j = true;
            this.f11144g = i;
            Iterator it = this.f11147k.iterator();
            while (it.hasNext()) {
                C0820d dVar = (C0820d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
