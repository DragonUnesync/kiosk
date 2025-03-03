package r2;

import m2.C1208a;
import y2.C1627b;

public abstract class x extends p implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final int f14934U;

    /* renamed from: V  reason: collision with root package name */
    public int f14935V;

    /* renamed from: W  reason: collision with root package name */
    public w f14936W;

    /* renamed from: X  reason: collision with root package name */
    public int f14937X;

    public x(int i, int i8) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        } else if (i8 >= -1) {
            this.f14934U = i;
            this.f14935V = i8;
            this.f14936W = null;
            this.f14937X = -1;
        } else {
            throw new IllegalArgumentException("writeSize < -1");
        }
    }

    public final int c() {
        int i = this.f14935V;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        if (this == xVar) {
            return 0;
        }
        q b8 = b();
        q b9 = xVar.b();
        if (b8 != b9) {
            return b8.compareTo(b9);
        }
        return e(xVar);
    }

    public final void d(C1387f fVar, C1627b bVar) {
        bVar.a(this.f14934U);
        try {
            if (this.f14935V >= 0) {
                int f8 = f();
                if (bVar.f16368c == f8) {
                    k(fVar, bVar);
                    return;
                }
                throw new C1208a((Exception) null, "expected cursor " + f8 + "; actual value: " + bVar.f16368c);
            }
            throw new UnsupportedOperationException("writeSize is unknown");
        } catch (RuntimeException e) {
            throw C1208a.a(e, "...while writing " + this);
        }
    }

    public int e(x xVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x xVar = (x) obj;
        if (b() == xVar.b() && e(xVar) == 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.f14937X;
        if (i >= 0) {
            w wVar = this.f14936W;
            if (i >= 0) {
                int i8 = wVar.f14853d;
                if (i8 >= 0) {
                    return i8 + i;
                }
                throw new RuntimeException("fileOffset not yet set");
            }
            wVar.getClass();
            throw new IllegalArgumentException("relative < 0");
        }
        throw new RuntimeException("offset not yet known");
    }

    public final String g() {
        return "[" + Integer.toHexString(f()) + ']';
    }

    public final int h(w wVar, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        } else if (this.f14936W == null) {
            int i8 = this.f14934U - 1;
            int i9 = (i + i8) & (~i8);
            this.f14936W = wVar;
            this.f14937X = i9;
            i(wVar, i9);
            return i9;
        } else {
            throw new RuntimeException("already written");
        }
    }

    public void i(w wVar, int i) {
    }

    public final void j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        } else if (this.f14935V < 0) {
            this.f14935V = i;
        } else {
            throw new UnsupportedOperationException("writeSize already set");
        }
    }

    public abstract void k(C1387f fVar, C1627b bVar);
}
