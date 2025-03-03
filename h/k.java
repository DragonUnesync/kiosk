package H;

import D.C0051j0;
import D.C0069x;
import D.X;
import android.util.Rational;
import android.util.Size;
import com.bumptech.glide.c;
import f1.C0894g;
import f1.C0895h;
import java.io.Serializable;
import java.util.TreeSet;
import n2.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f1798a;

    /* renamed from: b  reason: collision with root package name */
    public int f1799b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1800c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f1801d;

    public k() {
        this.f1801d = new TreeSet(new C0051j0(15));
        f();
    }

    public static int b(int i, int i8) {
        int min;
        int i9 = i - i8;
        if (Math.abs(i9) <= 1000 || (min = (Math.min(i, i8) - Math.max(i, i8)) + 65535) >= 1000) {
            return i9;
        }
        if (i < i8) {
            return min;
        }
        return -min;
    }

    public synchronized void a(C0895h hVar) {
        this.f1798a = hVar.f11544a.f11541c;
        ((TreeSet) this.f1801d).add(hVar);
    }

    public Size c(X x8) {
        boolean z = false;
        int h02 = x8.h0(0);
        Size i = x8.i();
        if (i == null) {
            return i;
        }
        int z6 = c.z(h02);
        if (1 == this.f1799b) {
            z = true;
        }
        int p3 = c.p(z6, this.f1798a, z);
        if (p3 == 90 || p3 == 270) {
            return new Size(i.getHeight(), i.getWidth());
        }
        return i;
    }

    public synchronized void d(C0894g gVar, long j7) {
        if (((TreeSet) this.f1801d).size() < 5000) {
            int i = gVar.f11541c;
            if (!this.f1800c) {
                f();
                this.f1799b = a.O0(i - 1);
                this.f1800c = true;
                a(new C0895h(gVar, j7));
            } else if (Math.abs(b(i, C0894g.a(this.f1798a))) >= 1000) {
                this.f1799b = a.O0(i - 1);
                ((TreeSet) this.f1801d).clear();
                a(new C0895h(gVar, j7));
            } else if (b(i, this.f1799b) > 0) {
                a(new C0895h(gVar, j7));
            }
        } else {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
    }

    public synchronized C0894g e(long j7) {
        if (((TreeSet) this.f1801d).isEmpty()) {
            return null;
        }
        C0895h hVar = (C0895h) ((TreeSet) this.f1801d).first();
        int i = hVar.f11544a.f11541c;
        if (i != C0894g.a(this.f1799b) && j7 < hVar.f11545b) {
            return null;
        }
        ((TreeSet) this.f1801d).pollFirst();
        this.f1799b = i;
        return hVar.f11544a;
    }

    public synchronized void f() {
        ((TreeSet) this.f1801d).clear();
        this.f1800c = false;
        this.f1799b = -1;
        this.f1798a = -1;
    }

    public k(C0069x xVar, Rational rational) {
        this.f1798a = xVar.c();
        this.f1799b = xVar.d();
        this.f1801d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.f1800c = z;
    }
}
