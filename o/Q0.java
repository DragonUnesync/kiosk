package o;

public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public int f13881a;

    /* renamed from: b  reason: collision with root package name */
    public int f13882b;

    /* renamed from: c  reason: collision with root package name */
    public int f13883c;

    /* renamed from: d  reason: collision with root package name */
    public int f13884d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f13885f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13886g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13887h;

    public final void a(int i, int i8) {
        this.f13883c = i;
        this.f13884d = i8;
        this.f13887h = true;
        if (this.f13886g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f13881a = i8;
            }
            if (i != Integer.MIN_VALUE) {
                this.f13882b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f13881a = i;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f13882b = i8;
        }
    }
}
