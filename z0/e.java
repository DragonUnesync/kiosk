package Z0;

import i1.C1092e;
import java.util.Arrays;

public final class e extends C1092e {

    /* renamed from: d0  reason: collision with root package name */
    public byte[] f6779d0;

    /* renamed from: e0  reason: collision with root package name */
    public volatile boolean f6780e0;

    /* renamed from: f0  reason: collision with root package name */
    public byte[] f6781f0;

    public final void c() {
        try {
            this.f12667c0.f(this.f12660V);
            int i = 0;
            int i8 = 0;
            while (i != -1 && !this.f6780e0) {
                byte[] bArr = this.f6779d0;
                if (bArr.length < i8 + 16384) {
                    this.f6779d0 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f12667c0.x(this.f6779d0, i8, 16384);
                if (i != -1) {
                    i8 += i;
                }
            }
            if (!this.f6780e0) {
                this.f6781f0 = Arrays.copyOf(this.f6779d0, i8);
            }
            R.e.d(this.f12667c0);
        } catch (Throwable th) {
            R.e.d(this.f12667c0);
            throw th;
        }
    }

    public final void e() {
        this.f6780e0 = true;
    }
}
