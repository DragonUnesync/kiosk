package H3;

import Q7.g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: H3.v  reason: case insensitive filesystem */
public final class C0104v implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f2123U;

    /* renamed from: V  reason: collision with root package name */
    public int f2124V;

    /* renamed from: W  reason: collision with root package name */
    public int f2125W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0107y f2126X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0107y f2128Z;

    public C0104v(C0107y yVar, int i) {
        int i8;
        this.f2127Y = i;
        this.f2128Z = yVar;
        this.f2126X = yVar;
        this.f2123U = yVar.f2141Y;
        if (yVar.isEmpty()) {
            i8 = -1;
        } else {
            i8 = 0;
        }
        this.f2124V = i8;
        this.f2125W = -1;
    }

    public final boolean hasNext() {
        if (this.f2124V >= 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        C0106x xVar;
        C0107y yVar = this.f2126X;
        if (yVar.f2141Y != this.f2123U) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.f2124V;
            this.f2125W = i;
            switch (this.f2127Y) {
                case 0:
                    xVar = this.f2128Z.j()[i];
                    break;
                case 1:
                    xVar = new C0106x(this.f2128Z, i);
                    break;
                default:
                    xVar = this.f2128Z.l()[i];
                    break;
            }
            int i8 = this.f2124V + 1;
            if (i8 >= yVar.f2142Z) {
                i8 = -1;
            }
            this.f2124V = i8;
            return xVar;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        boolean z;
        C0107y yVar = this.f2126X;
        if (yVar.f2141Y == this.f2123U) {
            if (this.f2125W >= 0) {
                z = true;
            } else {
                z = false;
            }
            g.j("no calls to next() since the last call to remove()", z);
            this.f2123U += 32;
            yVar.remove(yVar.j()[this.f2125W]);
            this.f2124V--;
            this.f2125W = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
