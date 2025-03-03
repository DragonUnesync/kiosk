package Q0;

public abstract class d {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4017U;

    /* renamed from: V  reason: collision with root package name */
    public int f4018V;

    public /* synthetic */ d() {
        this.f4017U = 1;
    }

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static void q(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public void a(int i) {
        this.f4018V = i | this.f4018V;
    }

    public boolean d(int i) {
        if ((this.f4018V & i) == i) {
            return true;
        }
        return false;
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public boolean j() {
        if (this.f4018V == 5) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f4018V == 4) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.f4018V == 1) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f4018V == 6) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f4018V == 3) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f4018V == 2) {
            return true;
        }
        return false;
    }

    public abstract void p();

    public String toString() {
        switch (this.f4017U) {
            case 0:
                return b(this.f4018V);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i, int i8) {
        this.f4017U = i8;
        this.f4018V = i;
    }
}
