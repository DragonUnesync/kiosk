package C;

import A.d;
import B.A;
import B.C0024z;
import B.Z;
import B.j0;
import B3.q;
import D7.b;
import N.e;
import Q0.g;
import android.util.Log;
import g7.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

public final class f implements C0024z {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayDeque f487U = new ArrayDeque();

    /* renamed from: V  reason: collision with root package name */
    public q f488V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f489W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f490X = false;

    public f(Z z) {
        l.a();
        this.f489W = new ArrayList();
    }

    public final void a(A a8) {
        b.H().execute(new d(5, this));
    }

    public final void b() {
        l.a();
        new Exception("Camera is closed.", (Throwable) null);
        ArrayDeque arrayDeque = this.f487U;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            Iterator it2 = new ArrayList(this.f489W).iterator();
            if (it2.hasNext()) {
                e.G(it2.next());
                throw null;
            }
            return;
        }
        throw g.k(it);
    }

    public final void c() {
        boolean z;
        int D8;
        l.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f490X) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        q qVar = this.f488V;
        qVar.getClass();
        l.a();
        A1.d dVar = (A1.d) qVar.f450V;
        dVar.getClass();
        l.a();
        if (((j0) dVar.f35V) != null) {
            z = true;
        } else {
            z = false;
        }
        a.m("The ImageReader is not initialized.", z);
        j0 j0Var = (j0) dVar.f35V;
        synchronized (j0Var.f266W) {
            D8 = ((D.Z) j0Var.f267X).D() - j0Var.f264U;
        }
        if (D8 == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else if (this.f487U.poll() == null) {
            Log.d("TakePictureManager", "No new request.");
        } else {
            throw new ClassCastException();
        }
    }
}
