package l1;

import P0.z;
import java.util.Arrays;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13104a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f13105b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public int f13106c;

    /* renamed from: d  reason: collision with root package name */
    public int f13107d;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public C1171a[] f13108f = new C1171a[100];

    public final synchronized void a(int i) {
        boolean z;
        if (i < this.f13106c) {
            z = true;
        } else {
            z = false;
        }
        this.f13106c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, z.f(this.f13106c, this.f13105b) - this.f13107d);
        int i = this.e;
        if (max < i) {
            Arrays.fill(this.f13108f, max, i, (Object) null);
            this.e = max;
        }
    }
}
