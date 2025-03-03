package B;

import A.f;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

public abstract class A implements W {

    /* renamed from: U  reason: collision with root package name */
    public final Object f137U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final W f138V;

    /* renamed from: W  reason: collision with root package name */
    public final HashSet f139W = new HashSet();

    public A(W w2) {
        this.f138V = w2;
    }

    public int b() {
        return this.f138V.b();
    }

    public int c() {
        return this.f138V.c();
    }

    public void close() {
        HashSet hashSet;
        this.f138V.close();
        synchronized (this.f137U) {
            hashSet = new HashSet(this.f139W);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0024z) it.next()).a(this);
        }
    }

    public final f[] d() {
        return this.f138V.d();
    }

    public U e() {
        return this.f138V.e();
    }

    public final Image g() {
        return this.f138V.g();
    }

    public final int getFormat() {
        return this.f138V.getFormat();
    }

    public final void k(C0024z zVar) {
        synchronized (this.f137U) {
            this.f139W.add(zVar);
        }
    }
}
