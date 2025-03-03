package n1;

import java.util.Arrays;

/* renamed from: n1.a  reason: case insensitive filesystem */
public final class C1236a {

    /* renamed from: a  reason: collision with root package name */
    public long f13565a;

    /* renamed from: b  reason: collision with root package name */
    public long f13566b;

    /* renamed from: c  reason: collision with root package name */
    public long f13567c;

    /* renamed from: d  reason: collision with root package name */
    public long f13568d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f13569f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f13570g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f13571h;

    public final boolean a() {
        if (this.f13568d <= 15 || this.f13571h != 0) {
            return false;
        }
        return true;
    }

    public final void b(long j7) {
        long j8 = this.f13568d;
        if (j8 == 0) {
            this.f13565a = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.f13565a;
            this.f13566b = j9;
            this.f13569f = j9;
            this.e = 1;
        } else {
            long j10 = j7 - this.f13567c;
            int i = (int) (j8 % 15);
            long abs = Math.abs(j10 - this.f13566b);
            boolean[] zArr = this.f13570g;
            if (abs <= 1000000) {
                this.e++;
                this.f13569f += j10;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f13571h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f13571h++;
            }
        }
        this.f13568d++;
        this.f13567c = j7;
    }

    public final void c() {
        this.f13568d = 0;
        this.e = 0;
        this.f13569f = 0;
        this.f13571h = 0;
        Arrays.fill(this.f13570g, false);
    }
}
