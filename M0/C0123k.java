package M0;

import M3.n;
import O7.b;

/* renamed from: M0.k  reason: case insensitive filesystem */
public final class C0123k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2963a;

    /* renamed from: b  reason: collision with root package name */
    public int f2964b;

    /* renamed from: c  reason: collision with root package name */
    public int f2965c;

    public /* synthetic */ C0123k(int i) {
        this.f2963a = i;
    }

    public int a() {
        int i = this.f2965c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i == 22) {
            return b.MAX_POW2;
        }
        if (i != 23) {
            return 0;
        }
        return 15;
    }

    public n b() {
        return new n((float) this.f2964b, (float) this.f2965c);
    }

    public String toString() {
        switch (this.f2963a) {
            case 2:
                return "<" + this.f2964b + ' ' + this.f2965c + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0123k(int i, int i8, int i9) {
        this.f2963a = i9;
        this.f2964b = i;
        this.f2965c = i8;
    }
}
