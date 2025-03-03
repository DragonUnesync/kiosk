package U7;

public final class k extends p {

    /* renamed from: a  reason: collision with root package name */
    public final int f5451a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5452b;

    public k(int i, int i8) {
        this.f5452b = i8;
        this.f5451a = i;
    }

    public final boolean b(S7.k kVar, S7.k kVar2) {
        switch (this.f5452b) {
            case 0:
                if (kVar2.H() == this.f5451a) {
                    return true;
                }
                return false;
            case 1:
                if (kVar2.H() > this.f5451a) {
                    return true;
                }
                return false;
            default:
                if (kVar == kVar2 || kVar2.H() >= this.f5451a) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        int i = this.f5451a;
        switch (this.f5452b) {
            case 0:
                return String.format(":eq(%d)", new Object[]{Integer.valueOf(i)});
            case 1:
                return String.format(":gt(%d)", new Object[]{Integer.valueOf(i)});
            default:
                return String.format(":lt(%d)", new Object[]{Integer.valueOf(i)});
        }
    }
}
