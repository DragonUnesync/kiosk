package r2;

import java.util.Collection;
import y2.C1627b;

/* renamed from: r2.A  reason: case insensitive filesystem */
public abstract class C1377A {

    /* renamed from: a  reason: collision with root package name */
    public final String f14850a;

    /* renamed from: b  reason: collision with root package name */
    public final C1387f f14851b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14852c;

    /* renamed from: d  reason: collision with root package name */
    public int f14853d;
    public boolean e;

    public C1377A(String str, C1387f fVar, int i) {
        if (fVar == null) {
            throw new NullPointerException("file == null");
        } else if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        } else {
            this.f14850a = str;
            this.f14851b = fVar;
            this.f14852c = i;
            this.f14853d = -1;
            this.e = false;
        }
    }

    public abstract int a(p pVar);

    public final int b() {
        int i = this.f14853d;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    public abstract Collection c();

    public final void d() {
        g();
        e();
        this.e = true;
    }

    public abstract void e();

    public final void f() {
        if (!this.e) {
            throw new RuntimeException("not prepared");
        }
    }

    public final void g() {
        if (this.e) {
            throw new RuntimeException("already prepared");
        }
    }

    public abstract int h();

    public final void i(C1627b bVar) {
        f();
        bVar.a(this.f14852c);
        int i = bVar.f16368c;
        int i8 = this.f14853d;
        if (i8 < 0) {
            this.f14853d = i;
        } else if (i8 != i) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + i + ", but expected " + this.f14853d);
        }
        if (bVar.d()) {
            String str = this.f14850a;
            if (str != null) {
                bVar.b(0, "\n" + str + ":");
            } else if (i != 0) {
                bVar.b(0, "\n");
            }
        }
        j(bVar);
    }

    public abstract void j(C1627b bVar);
}
